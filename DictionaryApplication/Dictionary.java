/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionaryapplication;

/**
 *
 * @author Lan Pham
 */
import java.util.ArrayList;
public class  Dictionary {

    public static ArrayList<Word> listDictionary = new ArrayList<Word>();
    public ArrayList<Word> getList() {
        return listDictionary;
    }

    public void setList(ArrayList<Word> l) {
        Dictionary.listDictionary = l;
    }
}