package com.example.mongo;// Author - Orifjon Yunusjonov 
// t.me/coderr24

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface GroupRepository extends MongoRepository<Group, String> {
//    @Query("{name:?0}")
//    Users findByUser(String name);
//    @Query("{name:{ $regex: ?0 }}")
//    Page<Users> findByUserList(String name, Pageable pageable);
}
