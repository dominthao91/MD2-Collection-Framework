package ArrayListLinkedList;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> listProducts = new ArrayList<>();

    public ProductManager() {
        listProducts = new ArrayList<>();
    }
    public void add(Product e) {
        listProducts.add(e);
    }
    public void edit(int id, Product e) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.set(i, e);
                break;
            }
        }
    }
    public void delete(int id) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                listProducts.remove(i);
                break;
            }
        }
    }
    public String searchByName(String name) {
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().equals(name))
                return listProducts.get(i).toString();
        }
        return "";
    }

    public void displayList() {
        for (int i = 0; i < listProducts.size(); i++) {
            System.out.println(listProducts.get(i).toString());
        }
    }

}
