package com.controllers;

import com.dtos.DogDto;
import com.dtos.UtilisateurDto;
import org.springframework.web.bind.annotation.*;

import com.services.impl.UtilisateurServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UtilisateurControllers {

    private final UtilisateurServiceImpl userService;

    public UtilisateurControllers(UtilisateurServiceImpl userService){
        this.userService = userService;
    }

    /**
     * <p>Get all users in the system</p>
     * @return List<UserDto>
     */
    @GetMapping
    public List<UtilisateurDto> getAllUser() {
        return userService.getAllUser();
    }

    /**
     * Method to get the user based on the ID
     */
    @GetMapping("/{id}")
    public UtilisateurDto getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    /**
     * Create a new user in the system
     */
    @PostMapping
    public UtilisateurDto creeUtilisateur(final @RequestBody UtilisateurDto userDto){
        System.out.println(userDto);
        return userService.creeUtilisateur(userDto);
    }

    /**
     * Delete a user by it's id
     */
    @DeleteMapping("/{id}")
    public Boolean deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
