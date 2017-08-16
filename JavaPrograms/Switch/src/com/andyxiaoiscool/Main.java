package com.andyxiaoiscool;

public class Main {

    public static void main(String[] args) {
//	    int value = 1;
//	    if(value == 1) {
//	        System.out.println("Value was 1");
//        } else if(value == 2) {
//	        System.out.println("Value was 2");
//        } else {
//	        System.out.println("Was not 1 or 2");
//        }

        int switchValue = 6;

	    switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:case 4:case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3, 4 or 5");
                break;


            }
            char charValue = 'C';

            switch (charValue) {

                case 'A':
                    System.out.println("Value is A");
                    break;

                case 'B':
                    System.out.println("Value is B");
                    break;

                case 'C':case 'D':case'E':
                    System.out.println("Value is C, D, or E");
                    System.out.println("Actually it is a " + charValue);
                    break;

                default:
                    System.out.println("Was not A,B,C,D,E");
                    break;

                }

                String countries = "United States Of America";
                switch(countries) {
                    case "United States Of America":
                        System.out.println("Washington D.C. is the nation's capital");
                        break;
                    case "China":
                        System.out.println("Beijing is the nation's capital");
                        break;
                    case "Japan":
                        System.out.println("Tokyo is the nation's capital");
                        break;
                    case "South Korea":
                        System.out.println("Seoul is the nation's capital");
                        break;
                    case "Taiwan":
                        System.out.println("Taipei is the nation's capital");
                        break;
                    case "Canada":case "Mexico":
                        System.out.println("These countries are in North America");
                        break;
                    case "Vietnam":case "Laos":case "Cambodia":case "Thailand":case "Malaysia":case "Singapore":case "Indonesia":
                        System.out.println("These countries are in Southeast Asia");
                        break;


                    default:
                        System.out.println("we don't know these countries");
                        break;












        }

        // More code here
    }
}
