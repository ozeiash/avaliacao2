/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3.entities;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 01/04/2024
 * @brief Class StockKeeper
 */
public class StockKeeper extends Product {

    private String name;

    public StockKeeper(String name) {
        this.name = name;
    }
    
    

    public StockKeeper() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void manageMovie(Movie movie, String name, String director, double price, int numberOfCopies) {

    }

    public void manageAlbum(Movie album, String name, String artist, double price, int numberOfCopies) {

    }

}
