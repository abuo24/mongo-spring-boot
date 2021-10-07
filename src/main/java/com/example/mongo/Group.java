package com.example.mongo;// Author - Orifjon Yunusjonov 
// t.me/coderr24

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(collection = "groups")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Group {
    @Id
    @MongoId(FieldType.OBJECT_ID)
    private String _id;

    @Indexed(unique = true, name = "name")
    private String name;
//
//    @DBRef
//    private List<Users> users;
}
