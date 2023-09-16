/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muana_act2;

import java.util.Scanner;

class book {
  
    String nameofauthor;
    String Title;
    String ISBN;
    book next;
    
    public book (String nameofauthor, String Title, String ISBN ) {
        this.nameofauthor = nameofauthor;
        this.Title = Title;
        this.ISBN = ISBN;
        this.next = null;
        
}
}
 class Lib {
    book toAdd;

public void addingBooks (String nameofauthor, String Title, String ISBN) {
   
    book newbook = new book (nameofauthor, Title, ISBN);
if (toAdd == null) {
toAdd = newbook;

} else {
    book current = toAdd;
    while(current.next != null) {
        current = current.next;
        
    } current.next = newbook;
    

}



}
public void BookDisplay() {
     
   if (toAdd == null){
        System.out.println("No book found");
   } else {
       
       System.out.println("Lists of books:---------------- ");   
       book current = toAdd;
       
       while (current != null) {
           System.out.println("Book Author: " + current.nameofauthor);  
           System.out.println("Title of The Book: " + current.Title);
           System.out.println("ISBN No: " + current.ISBN);
           current = current.next;
           
           
       }
       
       
   }
       
     
     
 }



}
/**
 *
 * @author User
 */
public class Muana_Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lib library = new Lib();
        Scanner scn = new Scanner(System.in);
        
        while (true) {
            System.out.println("choose 1 for adding Books");
            System.out.println("choose 2 for viewing the list");
            
         int a = scn.nextInt();
       
         scn.nextLine();
          
            if (a == 1) {
                System.out.println("The Authors Name: ");
                String nameofauthor = scn.nextLine();
                System.out.println("The Title of the Book: ");
                 String Title = scn.nextLine();
                System.out.println("ISBN No: ");
                String ISBN = scn.nextLine();
              library.addingBooks(nameofauthor, Title, ISBN);
                System.out.println("Book Added");
                
                
            } else if (a == 2) {
                library.BookDisplay();
                
            } else {
                System.out.println("invalid");
            }
            
        }
    }
    
}
