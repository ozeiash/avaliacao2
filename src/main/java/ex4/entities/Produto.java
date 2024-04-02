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
package ex4.entities;

/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 01/04/2024
 * @brief Class Cafe
 */
public class Produto {

    private int qtdCafeCoado;
    private int qtdCafeDescafeinado;
    private int qtdChocolateQuente;
    private int qtdExpressoDuplo;
    private int qtdCapuccinoItaliano;
    private int qtdCapuccinoTradicional;
    private double valorTotal;

    public Produto() {
        qtdCafeCoado = 0;
        qtdCafeDescafeinado = 0;
        qtdChocolateQuente = 0;
        qtdExpressoDuplo = 0;
        qtdCapuccinoItaliano = 0;
        qtdCapuccinoTradicional = 0;
        valorTotal = 0;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void fazerPedido(int opcao) {
        switch (opcao) {
            case 1:
                qtdCafeCoado++;
                valorTotal += 1.50;
                break;
            case 2:
                qtdCafeDescafeinado++;
                valorTotal += 2.00;
                break;
            case 3:
                qtdChocolateQuente++;
                valorTotal += 2.50;
                break;
            case 4:
                qtdExpressoDuplo++;
                valorTotal += 2.75;
            case 5:
                qtdCapuccinoItaliano++;
                valorTotal += 2.90;
            case 6:
                qtdCapuccinoTradicional++;
                valorTotal += 2.75;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
    }
    
    public void removerPedido(int opcao) {
        switch (opcao) {
            case 1:
                qtdCafeCoado--;
                valorTotal -= 1.50;
                break;
            case 2:
                qtdCafeDescafeinado--;
                valorTotal -= 2.00;
                break;
            case 3:
                qtdChocolateQuente--;
                valorTotal -= 2.50;
                break;
            case 4:
                qtdExpressoDuplo--;
                valorTotal -= 2.75;
            case 5:
                qtdCapuccinoItaliano--;
                valorTotal -= 2.90;
            case 6:
                qtdCapuccinoTradicional--;
                valorTotal -= 2.75;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                break;
        }
        
    }

    public void totalizarVendas() {
        System.out.println("Quantidade de Café Coado vendido: " + qtdCafeCoado);
        System.out.println("Valor total de Café Coado vendido: R$ " + qtdCafeCoado * 1.50);
        System.out.println("Quantidade de Café Descafeinado vendido: " + qtdCafeDescafeinado);
        System.out.println("Valor total de Café Descafeinado vendido: R$ " + qtdCafeDescafeinado * 2.00);
        System.out.println("Quantidade de Chocolate Quente vendido: " + qtdChocolateQuente);
        System.out.println("Valor total de Chocolate Quente vendido: R$ " + qtdChocolateQuente * 2.50);
        System.out.println("Quantidade de Expresso Duplo vendido: " + qtdExpressoDuplo);
        System.out.println("Valor total de Expresso Duplo vendido: " + qtdExpressoDuplo * 2.75);
        System.out.println("Quantidade de Capuccino Italiano vendido: " + qtdCapuccinoItaliano);
        System.out.println("Valor total de Capuccino Italiano vendido: " + qtdCapuccinoItaliano * 2.90);
        System.out.println("Quantidade de Capuccino Tradicional vendido: " + qtdCapuccinoTradicional);
        System.out.println("Valor total de Capuccino Tradicional Vendido: " + qtdCapuccinoTradicional * 2.75);
        System.out.println("Quantidade total de todos os produtos vendidos: " + (qtdCafeCoado + qtdCafeDescafeinado + qtdChocolateQuente + qtdExpressoDuplo + qtdCapuccinoItaliano + qtdCapuccinoTradicional));
        System.out.println("Valor total de todos os produtos vendidos: R$ " + valorTotal);
    }

    public void pagarContaParcial(double valorPago) {
        System.out.println();
        if (valorPago < valorTotal) {
            System.out.println("Conta paga parcialmente, ainda resta um saldo de: R$" + (valorPago - valorTotal) + " a pagar");
            valorTotal -= valorPago;
        } else if (valorPago == valorTotal) {
            System.out.println("A conta foi paga com sucesso, obrigado pela preferência");
        }
        else {
            System.out.println("Valor pago é maior que o total da conta. Por favor, insira um valor correto.");
        }
    }

    public void pagarContaTotal() {
        System.out.println("Conta total paga com sucesso. R$ "+ valorTotal + " Obrigado pela preferência.");
        valorTotal = 0;

    }
}