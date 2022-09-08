package com.example.equalimplementation;

public class Main {
    public static void main(String[] args) {
        Employee employee1=new Employee("E001","EC001","Harry","943456324V","Kandy");
        Employee employee2=new Employee("E002","EC002","Rone","967456324V","Colombo");

        Boolean result =employee1.equals(employee2);
        System.out.println("Employee 01 equals to Employee 2 "  + result);


        System.out.printf(" ------------------------------ \n");


        System.out.printf(String.valueOf(employee1)+"\n");
        System.out.printf(String.valueOf(employee2) +"\n");

        System.out.printf(" ------------------------------ \n");



        employee2.setEmpid("E001");
        employee2.setEmpcode("EC001");
        Boolean result2 =employee1.equals(employee2);

        System.out.println("Employee 01 equals to Employee 2 "  + result2);
        System.out.printf(" ------------------------------ \n");

        System.out.printf(String.valueOf(employee1)+"\n");
        System.out.printf(String.valueOf(employee2)+"\n");
    }
}

