/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task1;

/**
 *
 * @author Сергей Половцев
 */

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        System.out.println("Реализация двусвязного циклического списка(для целочисленных значений)");
        Scanner input = new Scanner(System.in);
        Cycle_Linked_List lst = new Cycle_Linked_List();
        int choice;
        String menu = "<1> Добавить элемент\n";
        menu += "<2> Удалить элемент с заданным номером\n";
        menu += "<3> Размер списка\n";
        menu += "<4> Просмотр списка по часовой стрелке\n";
        menu += "<5> Просмотр списка против часовой стрелки\n";
        menu += "<0> Выход из программы\n";
        System.out.println(menu);
        for (;;)
        {
            choice = input.nextInt();
            switch(choice){
                case 1: 
                    System.out.print("Введите значение элемента: ");
                    int data = input.nextInt();
                    lst.push(data);
                    break;
                case 2:
                    System.out.print("Введите номер удаляемого элемента: ");
                    int number = input.nextInt();
                    lst.pop(number);
                    break;
                case 3: 
                    System.out.println("В списке " + lst.getSize() + " элементов");
                    break;
                case 4:
                    System.out.println("По часовой стрелке ");
                    lst.show_po();
                    break;
                case 5:
                    System.out.println("Против часовой стрелки ");
                    lst.show_protiv();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Ошибка! Попробуйте еще раз!");
                    break;
                    
            }
            
        }
        
        
    
    }
    
}
