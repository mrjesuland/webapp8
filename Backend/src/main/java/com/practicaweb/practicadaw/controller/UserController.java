package com.practicaweb.practicadaw.controller;

import com.practicaweb.practicadaw.Service.CommentService;
import com.practicaweb.practicadaw.Service.EntryService;
import com.practicaweb.practicadaw.Service.UserService;
import com.practicaweb.practicadaw.model.Entry;
import com.practicaweb.practicadaw.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Principal;
import java.util.Optional;


@Controller
public class UserController {

    private static final Path IMAGES_FOLDER = Paths.get(System.getProperty("user.dir"), "src/main/resources/static/profileImages");
    private final UserService userService;
    private final EntryService entryService;
    private final CommentService commentService;

    public UserController(UserService userService, EntryService entryService, CommentService commentService) {
        this.userService = userService;
        this.entryService = entryService;
        this.commentService = commentService;
    }

    @PostMapping("/delete_user")
    public String deleteUser(Model model, @RequestParam long idUser){
        userService.deleteUserById(idUser);
        return "redirect:/users";
    }



//    @PostMapping("/update_user")
//    public String updateUser(@ModelAttribute User userUpdate, @RequestParam("imageFile") MultipartFile imageFile, HttpServletRequest request) throws IOException {
//        Principal principal = request.getUserPrincipal();
//        User oldUser = userService.findByName(principal.getName());
//        if (!imageFile.getOriginalFilename().equals("")) {
//            Path imagePath = IMAGES_FOLDER.resolve(imageFile.getOriginalFilename());
//            imageFile.transferTo(imagePath);
//            userUpdate.setImage(imageFile.getOriginalFilename());
//        } else {
//            userUpdate.setImage(oldUser.getImage());
//        }
//        userUpdate.setIdUser(oldUser.getIdUser());
//        //userUpdate.setPassword(oldUser.getPassword());
//        userUpdate.setEmail(oldUser.getEmail());
//        //userUpdate.setRole(oldUser.getRole());
//        userUpdate.setRegistrationDate(oldUser.getRegistrationDate());
//        userService.save(userUpdate);
//        HttpSession mysession = request.getSession(true);
//        mysession.removeAttribute("actualUser");
//        mysession.setAttribute("actualUser",userUpdate);
//        return "redirect:/settings";
//    }


}
