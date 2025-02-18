package org.sample;

import org.sample.dao.OrderDao;
import org.sample.dao.OrderDaoInMemory;

import java.util.Scanner;

/**
 * <p>
 * This is an order sorting app, that was left in unfinished state by the previous developer.
 * </p>
 *
 * <p>
 * Your goal is to finish it up!
 * </p>
 * <p>
 * You have to:
 *      <ol>
 *           <li/> Implement the print of all orders in the system - UNSORTED
 *           <li/> Implement the print of all orders, sorted by price - ASCENDING
 *           <li/> Implement the print of all orders, sorted by orderDate - DESCENDING
 *           <li/> Implement the print of all orders, sorted by rating - ASCENDING
 *           <li/> Implement the print of orders grouped by customer rating. You have to group to the closest integer representation,
 *           such as:
     *           <ul> 0.5, 0.9, 1.2, 1.49 will all be rounded to 1; </ul>
     *           <ul> 1.5, 2.0, 2.49 will all be rounded to 2 and so on. </ul>
     *           <ul><i>For example</i> [1 -> [Order4, Order5], 2 -> [Order2, Order6] ... ] </ul>
 *      </ol>
 * </p>
 * <p>
 *     CONSTRAINTS:
 *     <ul>
 *         <li>use the Strategy pattern</li>
 *         <li>use the Factory pattern</li>
 *         <li>achieve Polymorphism</li>
 *     </ul>
 * </p>
 * <p>
 *     AFTER, and only after, you finish the implementation - proceed to unit testing your solution!
 * </p>
 */
public class OrderSortingApp implements AutoCloseable {

    private final OrderDao orderDao;
    private final Scanner scanner;

    public OrderSortingApp(OrderDao orderDao, Scanner scanner) {
        this.orderDao = orderDao;
        this.scanner = scanner;
    }

    public static void main(String[] args) {
        //Bonus point: explain what's happening on the next line.
        try (var orderSortingApp = new OrderSortingApp(new OrderDaoInMemory(), new Scanner(System.in))) {
            orderSortingApp.start();
        } catch (Exception e) {
            System.err.println("⁉️Oops! Something went wrong! ⁉️More details: ");
            e.printStackTrace();
        }
    }

    private void start() {
        System.out.println("👋 Welcome to the Order Sorting application! 👋");
        System.out.println("➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️");
        boolean running = true;
        while (running) {
            System.out.println(""" 
                    🫵 Choose your option: 🫵
                    
                    [1]. Print all orders unsorted
                    [2]. Print all orders sorted by price   (ascending order)
                    [3]. Print all orders sorted by date    (descending order)
                    [4]. Print all orders sorted by rating  (ascending order)
                    [5]. Print all orders grouped by rating
                    
                    [0]. Quit ✌️
                    """);
            int userInput = scanner.nextInt();
            if (userInput != 0) {
                handleUserInput(userInput);
                showGoBackMessage();
            } else {
                running = false;
                System.out.println("✌️See you later, alligator 🐊");
            }
        }
    }

    private void showGoBackMessage() {
        System.out.println("↪️ Press Enter go back ↩️");
        scanner.nextLine();
        scanner.nextLine();
        System.out.println("➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️➡️");
    }

    private void handleUserInput(int option) {
        switch (option) {
            case 1, 2, 3, 4, 5 -> System.out.println("⚠️This operation is not supported yet");
            default -> System.out.println("⛔️Unknown option received - please try again with a valid option!");
        }
    }

    @Override
    public void close() {
        scanner.close();
    }
}