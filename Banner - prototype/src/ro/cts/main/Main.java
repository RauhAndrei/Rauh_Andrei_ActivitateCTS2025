package ro.cts.main;

import ro.cts.clase.Banner;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("Arial black", "Marketing for Assist Software", 260.99, 350, 460);
        System.out.println(banner);

        Banner banner2 = (Banner) banner.cloneaza("HR for Endava");
        System.out.println(banner);
        System.out.println(banner2);
    }
}