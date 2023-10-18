package com.example.datafecth;

import jdk.jfr.Category;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {





            HttpResponse<String> response;

//        serieByYear
//            for (int year = 1960; year <= 2021; year++) {
//                // int year = 1960;
//                HttpRequest request = HttpRequest.newBuilder()
//                        .uri(URI.create("https://moviesminidatabase.p.rapidapi.com/series/byYear/" + year + "/"))
//                        .header("X-RapidAPI-Key", "5126e12441msh52cdbabc17366c2p1183f9jsn5e7e3ba6dcb6")
//                        .header("X-RapidAPI-Host", "moviesminidatabase.p.rapidapi.com")
//                        .method("GET", HttpRequest.BodyPublishers.noBody())
//                        .build();
//                response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//                System.out.println(response.body());
//
//            }

            //return response.body();


//        movieByYear
//        for (int year = 1960; year <= 2021; year++) {
//            // int year = 1960;
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create("https://moviesminidatabase.p.rapidapi.com/movie/byYear/" + year + "/"))
//                    .header("X-RapidAPI-Key", "5126e12441msh52cdbabc17366c2p1183f9jsn5e7e3ba6dcb6")
//                    .header("X-RapidAPI-Host", "moviesminidatabase.p.rapidapi.com")
//                    .method("GET", HttpRequest.BodyPublishers.noBody())
//                    .build();
//            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//
//        }


//        movieCastById
//        "https://moviesminidatabase.p.rapidapi.com/movie/id/%7Bmovie_id%7D/cast/"

        List<String> imdbId;
        for (int i = 0; i < imdbId.size(); i++) {
            String ids = imdbId.get(i);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://moviesminidatabase.p.rapidapi.com/movie/id/" + ids + "/cast/"))
                    .header("X-RapidAPI-Key", "5126e12441msh52cdbabc17366c2p1183f9jsn5e7e3ba6dcb6")
                    .header("X-RapidAPI-Host", "moviesminidatabase.p.rapidapi.com")
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());

        }


//        serieCastById
//        "https://moviesminidatabase.p.rapidapi.com/series/id/%7Bseries_id%7D/cast/"

//        List<String> imdbId;
//        for (int i = 0; i < imdbId.size(); i++) {
//            String ids = imdbId.get(i);
//
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create("https://moviesminidatabase.p.rapidapi.com/series/id/" + ids + "/cast/"))
//                    .header("X-RapidAPI-Key", "5126e12441msh52cdbabc17366c2p1183f9jsn5e7e3ba6dcb6")
//                    .header("X-RapidAPI-Host", "moviesminidatabase.p.rapidapi.com")
//                    .method("GET", HttpRequest.BodyPublishers.noBody())
//                    .build();
//            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//
//        }


//        keywordSerieByid
//        "https://moviesminidatabase.p.rapidapi.com/series/id/%7Bseries_id%7D/keywords/"

//        List<String> imdbId;
//        for (int i = 0; i < imdbId.size(); i++) {
//            String ids = imdbId.get(i);
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create("https://moviesminidatabase.p.rapidapi.com/series/id/" + ids + "/keywords/"))
//                    .header("X-RapidAPI-Key", "5126e12441msh52cdbabc17366c2p1183f9jsn5e7e3ba6dcb6")
//                    .header("X-RapidAPI-Host", "moviesminidatabase.p.rapidapi.com")
//                    .method("GET", HttpRequest.BodyPublishers.noBody())
//                    .build();
//            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//
//        }


//        keywordMovieById
//        "https://moviesminidatabase.p.rapidapi.com/movie/id/%7Bmovie_id%7D/keywords/"

//        List<String> imdbId;
//        for (int i = 0; i < imdbId.size(); i++) {
//            String ids = imdbId.get(i);
//            HttpRequest request = HttpRequest.newBuilder()
//                    .uri(URI.create("https://moviesminidatabase.p.rapidapi.com/movie/id/" + ids + "/keywords/"))
//                    .header("X-RapidAPI-Key", "5126e12441msh52cdbabc17366c2p1183f9jsn5e7e3ba6dcb6")
//                    .header("X-RapidAPI-Host", "moviesminidatabase.p.rapidapi.com")
//                    .method("GET", HttpRequest.BodyPublishers.noBody())
//                    .build();
//            response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//            System.out.println(response.body());
//
//        }


//        episodesBySeasonsByMovieId
//        "https://moviesminidatabase.p.rapidapi.com/series/id/tt0096697/season/10/episodes/"

//        List<String> imdbId;
//        for (int i = 0; i < imdbId.size(); i++) {
//            String ids = imdbId.get(i);
//            for (int nbSeason = 1; nbSeason <= 40; nbSeason++) {
//                HttpRequest request = HttpRequest.newBuilder()
//                        .uri(URI.create("https://moviesminidatabase.p.rapidapi.com/movie/id/" + ids +"/" + nbSeason + "/episodes/"))
//                        .header("X-RapidAPI-Key", "5126e12441msh52cdbabc17366c2p1183f9jsn5e7e3ba6dcb6")
//                        .header("X-RapidAPI-Host", "moviesminidatabase.p.rapidapi.com")
//                        .method("GET", HttpRequest.BodyPublishers.noBody())
//                        .build();
//                response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
//                System.out.println(response.body());
//            }
//        }


    }
}
