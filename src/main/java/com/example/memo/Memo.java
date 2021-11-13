package com.example.memo;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Memo{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String content;

    public Memo(MemoDto memoDto) {
        this.title = memoDto.getTitle();
        this.content = memoDto.getContent();
    }
}
