/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package task1;

/**
 *
 * @author Админ
 */
public class Cycle_Linked_List {
    protected class Elem {     // Элемент списка
        int value;
        Elem next, prev;
    }
    private Elem head, tail;  
    int count;                  // Счетчик элементов
    public Cycle_Linked_List(){
        head = null;
        tail = null;
        count = 0;
    }
    public void push(int x){      // добавить в конец списка
        Elem tmp = new Elem();
        tmp.value = x;
        tmp.next = null;
        tmp.prev = null;
        if (head == null){
            head = tmp;
            head.prev = head;
            tail = head;
            tail.next = head;
        } else {
            tail.next = tmp;
            tmp.prev = tail;
            tail = tmp;
            tmp.next = head;
            head.prev =tail;
        }
        count++;
    }
    public void pop(int num){        // удалить элемент с указанным номером
        if (head == null || num <= 0 || num > count){
            System.out.println("Невозможно удалить!");
            return;
        }
        if (num == 1){
            head = head.next;
            head.prev = tail;
            tail.next = head;
            count--;
            return;
        }
        Elem tmp = head;
        for (int i = 0; i < num - 1; i++) tmp = tmp.next;
        if (num == count){
            tmp = tmp.prev;
            tmp.next = head;
            head.prev = tmp;
            tail = tmp;
        } else {
            tmp = tmp.prev;
            tmp.next = (tmp.next).next;
            (tmp.next).prev = tmp;
        }
    count--;
    }
    public int getSize(){  return count;   }   // получить размер списка
    public void show_po(){         // вывод на дисплей элементов по часовой стрелке
        if (head == null){
            System.out.println("Список пуст!");
            return;
        } else {
            int i = 1;
            Elem tmp = head;
            for(;;)
            {
                System.out.print("Номер " + i + ": " + tmp.value);
                System.out.println();
                tmp = tmp.next;
                i++;
                if (tmp == head) break;   
            }
        }   
    }
    public void show_protiv(){    // вывод элементов на дисплей против Ч.В.
         if (head == null){
            System.out.println("Список пуст!");
            return;
        } else {
            int i = count;
            Elem tmp = tail;
            for(;;)
            {
                System.out.print("Elem " + i + ": " + tmp.value);
                System.out.println();
                tmp = tmp.prev;
                i--;
                if (tmp == tail) break;   
            }
        }      
    }
 }
    

