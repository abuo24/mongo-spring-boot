package com.example.mongo;// Author - Orifjon Yunusjonov 
// t.me/coderr24

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.*;

@Document(collection = "users1")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Users {
    @Id
    @MongoId(FieldType.OBJECT_ID)
    private String _id;

    @Indexed(unique = false, name = "name")
    private String names;

    private String fullName;
    private int age;
    private int course;
//    @Transient - static
//    @DBRef()
    @JsonIgnore
    private Group group;
}
