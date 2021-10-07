package com.example.mongo;// Author - Orifjon Yunusjonov 
// t.me/coderr24

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
@CrossOrigin
public class GroupsController {
    private final GroupRepository groupRepository;
    private final UserRepository userRepository;

    @GetMapping("/")
    public List<Group> getAll(){
        return groupRepository.findAll();
    }
    @PostMapping("/save")
    public Group save(@RequestBody Group group){
        return groupRepository.save(group);
    }
//    @GetMapping("/search")
//    public Group save(@RequestParam String name){
//        return groupRepository.findByUser(name);
//    }
    @GetMapping("/page")
    public Page<Users> searchList(@RequestParam String id, @RequestParam int page, @RequestParam int size){
        return userRepository.findAllByGroup__id(id, PageRequest.of(page, size));
    }
}
