package com.abdul.client;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.abdul.customer.dao.Customer;
import com.abdul.customer.service.CustomerService;
import com.abdul.customer.service.CustomerServiceImpl;
import com.abdul.account.service.SavingAccountService;
import com.abdul.account.service.SavingAccountServiceImpl;

public class Client {
    public static void main(String[] args){
        int choice = 0;
        System.out.println("*********************************************");
        System.out.println("::Welcome to MaxFin Bank::");
        System.out.println("*********************************************");

        CustomerService customerService = new CustomerServiceImpl();
        SavingAccountService savingAccountservice = new SavingAccountServiceImpl();
        Scanner sc = new Scanner(System.in);
        try{
            do {
                System.out.println("1. Register");
                System.out.println("2. Update Profile");
                System.out.println("3. Avail Loan");
                System.out.println("4. View Registered Profiles");
                System.out.println("5. Exit");

                String input = sc.nextLine();
                choice = Integer.parseInt(input);
                switch (choice){
                    case 1:
                        System.out.println("Registration Started.....");
                        System.out.println("Please Provide input on following fields..");
                        System.out.println("Your Name: ");
                        String name = sc.nextLine();
                        System.out.println("Your Age: ");
                        byte age = Byte.parseByte(sc.nextLine());
                        System.out.println("Your Income: ");
                        short income = Short.parseShort(sc.nextLine());
                        String str = customerService.register(name,age,income);
                        System.out.println(str);
                        break;
                    case 2:
                        System.out.println("Updating.....");
                        System.out.println(customerService.findAndUpdate());
                        break;
                    case 3:
                        System.out.println("Processing for loan service...");
                        System.out.println("1. Please provide your customerId");
                       // int customerId = sc.nextInt(); TODO: will be used to check if SA for custId is already available or not
                        System.out.println(savingAccountservice.openAccount());
                        break;
                    case 4:
                        System.out.println("Fetching Profiles...");
                        List<Customer> list = customerService.viewProfiles();
                        System.out.println(list);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Wrong choice!!, Please try again with valid input...");
                }
            } while (choice !=5);
            sc.close();
        }
        catch (NumberFormatException n){
            sc.close();
            System.out.println("Input format is not valid!!");
        }
        catch (Exception e){
            sc.close();
            System.out.println("Exception occured while processing your request! , message: "+e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}

