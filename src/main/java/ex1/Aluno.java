/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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


/**
 *
 * @author Ozeias Campos <ozeiash@gmail.com>
 * @date 01/04/2024
 * @brief Class Aluno
 */
/*
 
 */

package ex1;

/**
 *
 * @author Davi Erick <davierick999@gmail.com>
*@date 01/04/2024
*@brief Class Notas
 */

public class Aluno {
    public double n1;
    public double n2;
    public double n3;
    public double n4;
    public double nota;
    public int NUMERO_DE_ALUNOS;
    public double SOMA_DE_MEDIDAS = 0;
    

    public Aluno() {
    }
    
    
    
    public void media(){
        nota = 0;
        nota = (n1 * 1 + n2 * 2 + n3 * 3 + n4 * 4) / 10;
        SOMA_DE_MEDIDAS += nota;
    }
    public int CompararMedia(Double aluno){
        if(nota < aluno){
            return -1;
        } else if (nota == aluno){
            return 0;
        }else{
            return 1;
        }
    }
    public double MEDIA_TOTAL(){
      
        return SOMA_DE_MEDIDAS / 3;
    }
    public String Texto(){
        System.out.println("A média total é "+ MEDIA_TOTAL());
        return "A média total é "+ MEDIA_TOTAL();
    }
    
}