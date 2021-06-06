/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

package Ex03.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String []args) {
        App myApp = new App();

        String quote = myApp.readQuote();
        String name = myApp.readName();
        myApp.output(quote, name);
    }

    public void output(String quote, String name) {
        System.out.print(name + " says, \"" + quote + "\"" );
    }

    public String readQuote() {
        System.out.print("What is the quote? ");
        return in.nextLine();
    }

    public String readName() {
        System.out.print("Who said it? ");
        return in.nextLine();
    }
}
