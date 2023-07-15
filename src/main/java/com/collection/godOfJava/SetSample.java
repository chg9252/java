package com.collection.godOfJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();

        String[] cars = new String[]{
                "Tico","Sonata","BMW","Benz",
                "Lexus", "Mustang","Grandeure",
                "The Beetle","Mini Cooper", "130",
                "BMW", "Lexus", "Carnibal", "SM5",
                "SM7","SM3","Tico"
        };


        System.out.println(sample.getCarKinds(cars));

    }
    // 어떻게 하면 직원들의 차 종류의 개수를 쉽게 확인해 볼 수 있을까?
    public int getCarKinds(String[] cars) {
        if(cars==null) return 0; // NPE 방지
        if(cars.length==1) return 1;
        Set<String> carSet=new HashSet<String>();
        for (String car : cars) {
            carSet.add(car);
        }

        printCarSet(carSet);

        return carSet.size();
    }

    // HashSet에 저장되어 있는 값을 어떻게 꺼낼까?
    public void printCarSet(Set<String> carSet) {
        for (String temp : carSet) {
            System.out.print(temp + ",");
        }
    }


    // Iterator객체를 얻는 방법은?
    public void printCarSetIterator(Set<String> carSet) {
        Iterator<String> iterator = carSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+", ");
        }
        System.out.println();
    }

}