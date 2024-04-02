/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex3.main;

import ex3.entities.Album;
import ex3.entities.Movie;
import ex3.entities.Product;
import ex3.entities.StockKeeper;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 01/04/2024
 * @brief Class Teste
 */
public class Teste {

    private static Object movie;

    public static void main(String[] args) {
        Album album = null;
        Product product = new Product();

        product.setName("Coletaneas");
        product.setPrice(25.00);
        product.setNumberOfcopies(50);
        String artist = null;

        album.add(new Album(artist) {});
        album.setArtist("Raul Seixas");

        movie.add(new Movie("Stiven Spilberg"){});

    }
}
