/*
 * Copyright (C) 2024 Ozeias Campos <ozeiash@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ex4.main;



import ex4.entities.Produto;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 01/04/2024
 * @brief Class TestarCafe
 */
public class Teste {

    public static void main(String[] args) {

        Produto cafe = new Produto();
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int opcao;
        do {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Café Coado (R$ 1.50)");
            System.out.println("2 - Café Descafeinado (R$ 2.00)");
            System.out.println("3 - Chocolate Quente (R$ 2.50)");
            System.out.println("4 - Expresso Duplo");
            System.out.println("5 - Capuccino Italiano");
            System.out.println("6 - Capuccino Tradicional");
            System.out.println("7 - Remover item do pedido");
            System.out.println("8 - Totalizar Vendas");
            System.out.println("9 - Pagar Conta Parcial");
            System.out.println("0 - Pagar Conta Total");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:    
                    cafe.fazerPedido(opcao);
                    break;
                case 7: 
                    cafe.removerPedido(opcao);
                    break;
                case 8:
                    cafe.totalizarVendas();
                    break;
                case 9:
                    System.out.println("Digite o valor a ser pago:");
                    double valorPagoParcial = scanner.nextDouble();
                    cafe.pagarContaParcial(valorPagoParcial);
                    break;
                case 0:
                    cafe.pagarContaTotal();
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        } while (cafe.getValorTotal() != 0);
    }

}
