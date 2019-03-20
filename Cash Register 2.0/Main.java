import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);

//        ArrayList apples = new ArrayList();
//        ArrayList oranges = new ArrayList();
//        ArrayList bananas = new ArrayList();
//        ArrayList grapefruit = new ArrayList();
//        ArrayList avocado = new ArrayList();
//
//
//        apples.add("Apples");
//        apples.add(1001);
//        apples.add(3.56);
//
//        oranges.add("Oranges");
//        apples.add(2002);
//        apples.add(2.91);
//
//        bananas.add("bananas");
//        bananas.add(3003);
//        bananas.add(4.21);
//
//        grapefruit.add("grapefruit");
//        grapefruit.add(4004);
//        grapefruit.add(3.87);
//
//        avocado.add("avocado");
//        avocado.add(5005);
//        avocado.add(5.12);

        Item Apples = new Item("Apples",sc.nextInt(),3.56,3000,"fruit");
        Item Oranges = new Item("Oranges",sc.nextInt(),2.91,2139,"fruit");
        Item Bananas = new Item("bananas",sc.nextInt(),4.21,4849,"fruit");
        Item Grapefruit = new Item("Grapefruit",sc.nextInt(),3.87,2839,"fruit");
        Item Avacado = new Item("Avacado",sc.nextInt(),5.12,9484,"vegitable");




    }
}
