package com.buildtmwlearning.springbootapipojo.entities;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String firstName;
    private String lastName;
}
