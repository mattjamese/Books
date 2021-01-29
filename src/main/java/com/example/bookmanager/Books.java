package com.example.bookmanager;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @Id
    private Long id;
    private String title;
    private String author;

}
