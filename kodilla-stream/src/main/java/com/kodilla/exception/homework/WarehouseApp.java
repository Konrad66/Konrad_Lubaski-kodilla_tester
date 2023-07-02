package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("589"));
        warehouse.addOrder(new Order("124"));
        warehouse.addOrder(new Order("358"));

        try{ //looking for existing order
            Order isOrderInWarehouseApp = warehouse.getOrder("123");
            System.out.println("Order status: " + isOrderInWarehouseApp.getNumber());
        } catch (OrderDoesntExistException e){
            System.out.println("Sorry this order doesn't exist.");
        } finally {
            System.out.println("Thank you for using our warehouseApp");
        }

        try{ //looking for doesn't existing order
            Order isOrderInWarehouseApp = warehouse.getOrder("654");
            System.out.println("Order status: " + isOrderInWarehouseApp);
        } catch (OrderDoesntExistException e){
            System.out.println("Sorry this order doesn't exist.");
        } finally {
            System.out.println("Thank you for using our warehouseApp");
        }
    }
}
