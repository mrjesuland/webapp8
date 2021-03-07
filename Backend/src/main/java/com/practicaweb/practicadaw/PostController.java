package com.practicaweb.practicadaw;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PostController {


    @GetMapping("/criptomonedas")
    public String criptomonedas(Model model){

        return "criptomonedas";

    }

    @GetMapping("/error")
    public String error(Model model){
        return "404";
    }

    @GetMapping("/favorite_cryptocurrencies")
    public String favorites(Model model){
        return "cript_favoritas";
    }

    @GetMapping("/settings")
    public String settings(Model model){
        return "settings";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

    @GetMapping("/register")
    public String register(Model model){
        return "register";
    }

    @GetMapping("/recover_password")
    public String recoverPassword(Model model){
        return "password";
    }

//    @RequestMapping("/error")
//    public String handleError(HttpServletRequest request) {
//        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//
//        if (status != null) {
//            Integer statusCode = Integer.valueOf(status.toString());
//
//            if(statusCode == HttpStatus.NOT_FOUND.value()) {
//                return "404";
//            }
//            else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//                return "500";
//            }
//        }
//        return "error";
//    }
}
