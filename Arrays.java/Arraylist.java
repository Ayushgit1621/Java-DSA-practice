import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // What if theirs arrays we want to insert as much values we want in them.

       // ArrayList<Wrapper classes> list = new ArrayList<>(Intial Capacity); 
       Scanner in =new Scanner(System.in);

       ArrayList<String> cars = new ArrayList<>(); 

       //Inserting values

       cars.add("Volvo"); cars.add("BMW"); 
       cars.add("Ford"); cars.add("Merc");

       System.out.println(cars);// [Volvo,BMW,Ford,Merc]

       // updation

       cars.set(2,"Mini");
       cars.set(1,"Audi");
       System.out.println(cars);// [Volvo,Audi,Mini,Merc]

       // Deletion

       cars.remove(0);
       System.out.println(cars);//[Audi,Mini,Merc]
       System.out.println(cars.size());
       System.out.println();

       // input 
       System.out.println("Enter the values for the arraylist");
       ArrayList<Integer> list =new ArrayList<>(5);
       for(int i=0;i<5;i++){
        list.add(in.nextInt());
       }

       // get item at an index
       for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+" ");
       }
       System.out.println();

        /********** Mutli-dimensional Arraylist ************/
        ArrayList<ArrayList<Integer>> list1= new ArrayList<>();

        // Initialisation
        for(int i=0;i<3;i++){
            list1.add(new ArrayList<>());
        }
        System.out.println("Enter values for Multi ArrayList");
        //add elements 
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                list1.get(i).add(in.nextInt());
            }
        } 
        System.out.println(list1);    
    in.close();
    }
}
