package com.ohgiraffers.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<MusicDTO> musicDTOList = new ArrayList<>();
        
        musicDTOList.add(new MusicDTO("비비(BIBI)", "밤양갱"));
        musicDTOList.add(new MusicDTO("아이유", "좋은날"));
        musicDTOList.add(new MusicDTO("임재현", "비의랩소디"));
        musicDTOList.add(new MusicDTO("(여자)아이들", "나는아픈건딱질색이니까"));
        musicDTOList.add(new MusicDTO("이창섭", "천상연"));
        musicDTOList.add(new MusicDTO("박재정", "헤어지자말해요"));
        musicDTOList.add(new MusicDTO("Charlie Puth", "Dangerously"));
        musicDTOList.add(new MusicDTO("Charlie Puth", "I Don’t Think That I Like Her"));
        musicDTOList.add(new MusicDTO("Charlie Puth", "Light Switch"));
        musicDTOList.add(new MusicDTO("Charlie Puth", "Left and Right"));
        musicDTOList.add(new MusicDTO("Charlie Puth", "That's Hilarious"));
        musicDTOList.add(new MusicDTO("Charlie Puth", "Lipstick"));
        musicDTOList.add(new MusicDTO("너드커넥션", "그대만있다면"));
        musicDTOList.add(new MusicDTO("화곡동청개구리", "기억해줘요내모든날과그때를"));
        musicDTOList.add(new MusicDTO("데이식스", "예뻤어"));
        musicDTOList.add(new MusicDTO("izi", "응급실(쾌걸춘향OST)"));
        musicDTOList.add(new MusicDTO("DK(디셈버)", "심(心)"));

        Scanner sc = new Scanner(System.in);
        String searchArtist;
        System.out.print("가수 이름 검색 -> ");
        searchArtist = sc.nextLine();

        musicDTOList.stream().filter(musicDTO -> musicDTO.getArtist().contains(searchArtist))
                .forEach(music -> System.out.println("id = " + music.getId() + ", artist = " + music.getArtist() + ", title = " + music.getTitle()));

        List<MusicDTO> searchList;
        searchList = musicDTOList.stream().filter(musicDTO -> musicDTO.getArtist().contains(searchArtist)).collect(Collectors.toList());
        
        for (MusicDTO music : searchList) {
            System.out.println("id = " + music.getId() + ", artist = " + music.getArtist() + ", title = " + music.getTitle());
        }

        // --------------------------------------------------------------------------------------------------------------------------------
        String searchTitle;
        System.out.print("노래 검색 -> ");
        searchTitle = sc.nextLine();

        searchList = musicDTOList.stream().filter(musicDTO -> musicDTO.getTitle().contains(searchTitle)).collect(Collectors.toList());

        for (MusicDTO music : searchList) {
            System.out.println("id = " + music.getId() + ", artist = " + music.getArtist() + ", title = " + music.getTitle());
        }
    }
}
