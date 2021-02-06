package com.example.springtoy.api.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Post extends CommonDateEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    @Column(nullable = false, length = 50)
    private String author;
    @Column(nullable = false,length = 100)
    private String title;
    @Column(length = 500)
    private String content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "msrl")
    private User user;

    protected Board getBoard(){
        return board;
    }

    public Post(User user, Board board, String author, String title, String content){
        this.user=user;
        this.board=board;
        this.author=author;
        this.title=title;
        this.content=content;
    }

    public Post setUpdate(String author, String title, String content){
        this.author=author;
        this.title=title;
        this.content=content;
        return this;
    }

}
