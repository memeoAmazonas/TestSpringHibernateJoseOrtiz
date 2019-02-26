package com.spring.test.service.impl;

import com.spring.test.repository.CreateQuery;
import com.spring.test.repository.impl.CreateQueryImpl;
import com.spring.test.service.GeneralService;
import com.spring.test.singleton.SingletonTest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service("generalServiceImpl")
public class GeneralServiceImpl implements GeneralService {
    public int[] result;


    private CreateQuery createQuery = new CreateQueryImpl();


    @Override
    public String createSingleton(String name) {
        SingletonTest singletonTest = SingletonTest.getInstance(name);
        if (singletonTest.getName().equals(name)){
            return "Objeto ".concat(name).concat(" Creado exitosamente");
        }
        return "Ya existe una instancia del objeto";
    }

    @Override
    public List<String> duplicate(String word) {
        HashMap<Character, Integer> result = new HashMap<>();
        List<String> response = new ArrayList<>();
        for (char str: word.toCharArray()) {
            int value = (int)word.chars().filter(item -> item == str).count();
            if(value > 1 && !result.containsKey(str))
                result.put(str, value);
        }
        for (char i : result.keySet()) {
            response.add("Caracter: " + i + " Numero de apariciones: " + result.get(i));
        }
        return response;
    }
    @Override
    public String reverse(String word) {
        return word.length() == 1 ? word : reverse(word.substring(1)) + word.charAt(0);
    }

    @Override
    public List<Integer> orderList(int [] list) {

        result = list;
        quickSort(0, list.length -1);
        List<Integer> response = new ArrayList();
        for (int i = 0; i<result.length;i++) {
            response.add(result[i]);
        }

        return response;
    }

    private void quickSort(int min, int max) {

        int media = result[min+(max-min)/2],
                i = min,
                j = max;

        while (j >= i){

            while (media > result[i])
                i++;

            while (media < result[j])
                j--;

            if(j >= i) {
                change(i,j);
                i++;
                j--;
            }
        }

        if (min < j)
            quickSort(min,j);

        if (max > i)
            quickSort(i, max);
    }

    private void change(int i, int j){
        int actual = result[i];
        result[i] = result[j];
        result[j] = actual;
    }
}
