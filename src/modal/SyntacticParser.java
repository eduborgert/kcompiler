/**
 * @author Gabriel Hegler Klok
 * @since 2019/10
 */
package modal;

import java.io.StringReader;
import java.util.ArrayList;

public class SyntacticParser {
    private static SyntacticParser instance = null;
    private MaquinaVirtual vm;
    private SyntacticParser(){}
    
    public static SyntacticParser getInstance(){
        if (instance == null) {
            instance = new SyntacticParser();
        }
        return instance;
    }
    
    public String analyze(String text) {
        Parser parser = new Parser(new StringReader(text));
        
        StringBuilder output = new StringBuilder();
        try {
            Semantic sem = parser.syntaxAnalisys();
            
            if (sem.getErros().size() > 0) {
                for (String erro : sem.getErros()) {
                    output.append(erro).append("\n");
                }
            } else {
                
                vm = new MaquinaVirtual(sem.getSimbolos(), sem.getInstructions(),sem.getEnums());
                vm.executar();
                if(vm.getErros().size() > 0){
                    for (String erro : vm.getErros()) {
                        output.append(erro).append("\n");
                    }
                } else {
                    output.append("Build Successfull!\n");
                    output.append("Running:\n");
                    output.append(vm.getResult());
                    
                }
                
            }
        } catch (Exception e) {
            output.append(e.getMessage());
        }
        return output.toString();
    }
}
