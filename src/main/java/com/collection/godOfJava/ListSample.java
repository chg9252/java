package com.collection.godOfJava;

import java.util.ArrayList;

public class ListSample {
    // Collection 인터페이스를 확장하는 인터페이스는 List, Queue, Set
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        // sample.checkArrayList1();
        // sample.checkArrayList2();
        // sample.checkArrayList3();
        // sample.checkArrayList4();
        // sample.checkArrayList5();
        // sample.checkArrayList6();
        // sample.checkArrayList7();
        sample.checkArrayList8();


    }

    public void checkArrayList1(){
        System.out.println("====checkArrayList1====");
        ArrayList list1 = new ArrayList();
        // ArrayList<String> list1=new ArrayList<>();

        list1.add(new Object());
        list1.add("ArrayListStringSample");
        list1.add(new Double(1));

        /*
         * ArrayList: 매개변수를 넣지 않으면 초기 크기는 10 이다.
         * 이 이상 늘어나면 크기를 늘리는 작업이 반복되는데 이러면 성능에 영향을 줌
         * ArrayList<String> list2=new ArrayList<String>(100); 이런식으로 초기 사이즈를 정해주는것이 좋음
         * */
    }


    /*데이터 담기*/
    public void checkArrayList2() {
        System.out.println("====checkArrayList2====");
        // add()   return: boolean
        // add(int index, E e)

        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A1");

        for (String tempData : list) {
            System.out.println(tempData);
        }

    }

    public void checkArrayList3(){
        System.out.println("====checkArrayList3====");
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1,"A1");

        // ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>(list);
        list2.add("0");
        // list2.add(list);
        // list2.addAll(list);

        for (String tempData : list2) {
            System.out.println("list2  "+tempData);
        }
    }

    public void checkArrayList4() {
        System.out.println("====checkArrayList4====");
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");

        ArrayList<String> list2 = list; // list라는 객체가 생성되어 참조되고있는 주소까지도 사용한다는 이야기
        list.add("Ooops");

        for (String tempData : list2) {
            System.out.println("List2 " + tempData);
            /*
              결과
              List2 A
              List2 Ooops
            */
        }
    }

    /*데이터 꺼내기*/

    public void checkArrayList5() {
        System.out.println("====checkArrayList5====");
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        int listSize = list.size();
        for (int loop = 0; loop < listSize; loop++) {
            System.out.println("list.get("+loop+")= "+list.get(loop));
        }
        // 한건의 데이터를 꺼내오는건 get(int index) 하나다. (index위치로 꺼내옴)

        // 그럼 반대로 위치를 찾는건?? => indexOf(Object o), lastIndexOf(Object o) 가 있다.
        // 앞에서 부터 검색시에는 indexOf, 뒤에서부터 검색시에는 lastIndexOf

        /*
         *
         *  리턴 타입 , 메소드 이름 및 매개 변수
         *
         *
         * */


    }

    //  간혹 ArrayList 객체에 있는 데이터들을 배열로 뽑아내고 싶으면???? toArray(), toArray(T[] a) 사용하라.
    // toArray(T[] a) 사용 추천함.
    // toArray() 메서드는 object타입만 리턴하기 때문

    public void checkArrayList6(){
        System.out.println("====checkArrayList6====");
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");

        String[] strList = list.toArray(new String[0]);
        System.out.println(strList[0]);

    }

    public void checkArrayList7(){
        System.out.println("====checkArrayList7====");
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] tempArray = new String[0]; // 0~10
        String[] strList = list.toArray(tempArray);

        for (String temp : strList) {
            System.out.println(temp);

            /* 정리
             *   toArray() 메소드를 사용할 때에는 가장 처음에 사용한 것과 같이
             *   크기가 0인 배열을 넘겨주는 것이 가장 좋다.
             * */

        }
    }


    /*ArrayList 데이터를 삭제*/

    public void checkArrayList8() {
        ArrayList<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");

        // System.out.println("Removed "+list.remove(0));
        // System.out.println(list.remove("A")); // true
        ArrayList<String> temp=new ArrayList<String>();
        temp.add("A");
        list.removeAll(temp);
        for(int loop=0;loop<list.size();loop++) {
            System.out.println("list.get("+loop+")= "+list.get(loop));
        }

    }




}