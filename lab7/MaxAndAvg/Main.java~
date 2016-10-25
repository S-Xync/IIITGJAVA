package com.reedbuck;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str="";
        String[] arrStr;
        List<Employee> employees=new ArrayList<>();
        try {
            FileReader fr=new FileReader("./src/test.txt");
            BufferedReader bf=new BufferedReader(fr);
            while ((str=bf.readLine())!=null) {
                arrStr=str.split(" ");
                employees.add(new Employee(arrStr[0],Integer.parseInt(arrStr[1]),Double.parseDouble(arrStr[2])));
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        Employee maxSalEmp=null;
        double maxSal=0;
        for (int i=0;i<employees.size();i++){
            if (employees.get(i).getSalary()>=maxSal){
                maxSalEmp=new Employee(employees.get(i).getName(),employees.get(i).getId(),employees.get(i).getSalary());
                maxSal=employees.get(i).getSalary();
            }
        }
        System.out.println("Max Salary Employee\nName : "+maxSalEmp.getName()+"\nSalary : "+maxSalEmp.getSalary()+"\n");
        double totalSal=0;
        for (int i=0;i<employees.size();i++){
            totalSal+=employees.get(i).getSalary();
        }
        double avgSal=(totalSal/((double) employees.size()));
        System.out.println("The average salary is : "+avgSal);

    }
}
