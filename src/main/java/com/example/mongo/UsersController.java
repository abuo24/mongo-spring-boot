package com.example.mongo;// Author - Orifjon Yunusjonov 
// t.me/coderr24

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin
public class UsersController {
    private final UserRepository userRepository;
    private final GroupRepository groupRepository;

    @GetMapping("/")
    public List<Users> getAll(){
        return userRepository.findAll();
    }
    @PostMapping("/save")
    public Users save(@RequestBody Users users, @RequestParam String id){
        users.setGroup(groupRepository.findById(id).orElseThrow(()-> new RuntimeException("rrr")));
        return userRepository.save(users);
    }
    @GetMapping("/search")
    public Users save(@RequestParam String name){
        return userRepository.findByUser(name);
    }
    @GetMapping("/page")
    public Page<Users> searchList(@RequestParam String name, @RequestParam int page, @RequestParam int size){
        return userRepository.findByUserList(name, PageRequest.of(page, size));
    }
}
