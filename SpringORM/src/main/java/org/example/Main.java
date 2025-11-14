package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("Student-config.xml");
        StudentDao studentDao= context.getBean("studentdao",StudentDao.class);

//        int r=studentDao.insert(new Student());
//        System.out.println(r);

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;

        while(go){
            System.out.println("Press 1 for add new student");
            System.out.println("press 2 for display all students");
            System.out.println("Press 3 for get ratail of single student");
            System.out.println("Press 4 for delete studnets");
            System.out.println("press 5 for update student");
            System.out.println("press 6 for exit");

            try{
            int input = Integer.parseInt(br.readLine());
            if(input ==1){

            }else if(input==2){

            }

            switch (input){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    go = false;
                    break;

            }


        }catch (Exception e ){
                System.out.println("Invaild Try with another one !! ");
                System.out.println(e.getMessage());
            }
    }
}}