package com.ohgiraffers.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicDTO {
    private static int nextId = 1;

    private int id;
    private String artist;
    private String title;

    public MusicDTO(String artist, String title) {
        this.id = MusicDTO.nextId++;
        this.artist = artist;
        this.title = title;
    }
}
