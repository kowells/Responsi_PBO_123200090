/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author ridwa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MovieModel model = new MovieModel();
        MovieView tampilan = new MovieView();
        MovieController kontrol = new MovieController(model, tampilan);
    }
    
}
