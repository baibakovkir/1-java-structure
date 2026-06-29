package ru.netology.service;

public class CustomsService {
    public static final int WEIGHT_TAX_RATE = 100;

    public static int calculateCustoms(int price, int weight) {
        return (price / 100) + (weight * WEIGHT_TAX_RATE);
    }
}
