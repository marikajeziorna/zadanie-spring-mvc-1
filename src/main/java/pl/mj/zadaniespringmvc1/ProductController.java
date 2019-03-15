package pl.mj.zadaniespringmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class ProductController {

    private List<Product> productsList;

    public ProductController() {
        productsList = new ArrayList<>();
    }

    public double sumPrice(List<Product> productsList) {
        double sum = 0;
        for (Product product : productsList) {
            sum = +product.getPrice();
        }
        return sum;
    }


    @GetMapping("/homepage")
    public String homePage(Model model) {

        model.addAttribute("productsList", productsList);
        model.addAttribute("newProduct", new Product());
        return "productsList";
    }

    @PostMapping("/displayproduct")
    public String add(Product product) {
        productsList.add(product);
        return "redirect:/homepage";
    }

    @PostMapping("/productsum")
    public String printSum(List<Product> productsList, Model model){
        double sum = sumPrice(productsList);
       model.addAttribute("sumPrice", sum);
return String.valueOf(sum);
    }


}



