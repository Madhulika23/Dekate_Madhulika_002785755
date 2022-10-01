/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author madhulikadekate
 */
public class Data {
 
    private ArrayList<Product> history;
    public Data(){
        this.history = new ArrayList<Product>();
        
    }

    public ArrayList<Product> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Product> history) {
        this.history = history;
    }
    
    public Product addNewData(){
            Product newData = new Product();
            history.add(newData);
            return newData;
            
    }
    
    public void deleteProduct(Product vs){
    history.remove(vs);
    }
    
}
