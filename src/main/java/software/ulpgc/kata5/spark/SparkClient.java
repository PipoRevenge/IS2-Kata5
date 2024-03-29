package software.ulpgc.kata5.spark;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class SparkClient {

    private static final String url = "http://localhost:8080";

    public static void main(String[] args) throws IOException {
        try(InputStream is = new URL(url).openStream()) {
            System.out.println(new String(is.readAllBytes()));
        }
}}
