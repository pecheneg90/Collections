package pro.sky.java.course2;

import pro.sky.java.course2.service.Impl;
import pro.sky.java.course2.service.Service;

public class Main {

    public static void main(String[] args) {

        Service service = new Impl();
        service.odd();
        service.even();
        service.uniqueLetters();
        service.duplicateLettersNumber();
    }
}