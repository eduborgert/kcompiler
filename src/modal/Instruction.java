/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modal;

/**
 *
 * @author Eduardo
 */
class Instruction {
    private int ponteiro;
        private String instrucao;
        private String endereco;

        public Instruction() {}

        public Instruction(int ponteiro, String instrucao, String endereco) {
            this.ponteiro = ponteiro;
            this.instrucao = instrucao;
            this.endereco = endereco;
        }

        public int getPonteiro() {
            return ponteiro;
        }

        public void setPonteiro(int ponteiro) {
            this.ponteiro = ponteiro;
        }

        public String getInstrucao() {
            return instrucao;
        }

        public void setInstrucao(String instrucao) {
            this.instrucao = instrucao;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        String newLine = System.getProperty("line.separator");
        result.append("Ponteiro: ");
        result.append(this.ponteiro);
        result.append(newLine);
        result.append("Instrução: ");
        result.append(this.instrucao);
        result.append(newLine);
        result.append("Endereço: ");
        result.append(this.endereco);
        result.append(newLine);
        return result.toString();
    }
}
