package com.spring.test.service;

import java.util.List;

public interface GeneralService {
    String createSingleton(String name);
    List<String> duplicate(String word);
    String reverse(String word);
    List<Integer> orderList(int[] list);
}
