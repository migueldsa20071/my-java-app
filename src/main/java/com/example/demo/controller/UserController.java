package com.example.demo.controller;

// Suggested code may be subject to a license. Learn more: ~LicenseLog:2124841235.
import java.util.ArrayList;
import java.util.List;
import com.example.demo.model.UserModel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private List<UserModel> users = new ArrayList<>();

    //rota para cadastrar o usuário
    @PostMapping("/add-user")
    public String cadastrar(@RequestBody UserModel user) {
        users.add(user);
        return "Usuário cadastrado com sucesso!";
    }

    //rota para listar os usuários
    @GetMapping("/list-users")
    public List<UserModel> listar() {
        return users;
    }
}
