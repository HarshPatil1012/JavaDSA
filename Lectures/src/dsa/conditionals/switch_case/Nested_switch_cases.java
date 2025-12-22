package dsa.conditionals.switch_case;

import java.util.Scanner;

public class Nested_switch_cases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

/*
        switch (empID) {
            case 1:
                System.out.println("Sung Jinwoo");
                break;
            case 2:
                System.out.println("Tanjiro Kamado");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No Department entered");
                }
                break;
            default:
                System.out.println("enter correct employee ID");
        }
*/

        switch (empID) {
            case 1 -> System.out.println("Sung Jinwoo");
            case 2 -> System.out.println("Tanjiro Kamado");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department entered");
                }
            }
            default -> System.out.println("enter correct employee ID");
        }

    }
}
