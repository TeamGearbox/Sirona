/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sirona.model;

/**
 *
 * @author jacin
 */
public class InvalidDataTypeException extends Exception{
    
    public InvalidDataTypeException(String mes){
        super(mes);
    }
}
