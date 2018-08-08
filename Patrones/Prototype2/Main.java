package org.fundacionjala.coding.Ruber.Patrones.Prototype2;

import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew = (Employees) emps.clone();
        Employees empsNew1 = (Employees) emps.clone();
        List<String> list = empsNew.getEmpList();
        list.add("Jhon");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Raul");

        System.out.println("Emps List: " + emps.getEmpList());
        System.out.println("empsNew List " + list);
        System.out.println("empsNew1 List: " + list1);
    }
}
