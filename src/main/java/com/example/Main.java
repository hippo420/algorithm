package com.example;

import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {
    public static void main(String[] args) {
        // HTML 파일 읽기
        File input = new File("");
        Document doc = null;

        try {
            doc = Jsoup.parse(input, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // A 태그 추출
        Elements links = doc.select("a");

        // 각 링크 정보 출력
        int i=1;
        for (Element link : links) {
            String text = link.text();
            System.out.println(i+"=> "+text);
            i++;
        }
    }
}