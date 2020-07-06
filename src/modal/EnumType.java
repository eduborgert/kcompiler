/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

import java.util.ArrayList;

/**
 *
 * @author Eduardo
 */
class EnumType {
    private String identificador;
    private ArrayList<String> constantes;
    
    public EnumType() {
    }

    public EnumType(String identificador, ArrayList<String> constantes) {
        this.identificador = identificador;
        this.constantes = constantes;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ArrayList<String> getConstantes() {
        return this.constantes;
    }

    public void setConstantes(ArrayList<String> constantes) {
        this.constantes = constantes;
    }

    public String getConstante(int indice){
        return this.constantes.get(indice);
    }
    
    public void setConstante(String constante){
        this.constantes.add(constante);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        result.append("Enumerado");
        result.append(newLine);
        result.append("Identificador: ");
        result.append(this.getIdentificador());
        result.append(newLine);
        result.append("Constantes: { ");
        for(String cons : this.constantes){
            result.append(cons + " ");
        }
        result.append(" }");
        return result.toString();
    }
}
