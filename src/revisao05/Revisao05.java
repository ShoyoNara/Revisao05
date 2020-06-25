
package revisao05;

import javax.swing.JOptionPane;

/**
 *
 * @author samuc
 */
public class Revisao05 {

    /**
     * Uma empresa concederá um aumento de salário aos seus funcionários,
     * variável de acordo com o cargo, conforme a tabela abaixo. Faça um
     * programa que leia o salário e o código do cargo de um funcionário e
     * calcule o seu novo salário. Se o cargo do funcionário não estiver na
     * tabela, ele deverá, então, receber 15% de aumento. Mostre o salário 
     * antigo, o novo salário e a diferença entre ambos. 
     */
    public static void main(String[] args) {
       
        double salario, codigocargo, novosalario, diferença, aumento;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu Salario atual: R$"));
        codigocargo = Double.parseDouble(JOptionPane.showInputDialog("Informe seu código de funcionario: "));
        
        if(codigocargo == 310){
                aumento = salario * 0.05;
                novosalario = salario + aumento;
                diferença = novosalario - salario;
                
                JOptionPane.showMessageDialog(null, "seu salario antigo é de: R$"+salario+"\n Você ganhara um aumento de: R$"+aumento+ "\n seu novo salario sera de: R$"+novosalario+
                        "\n E a diferença é de: R$"+diferença);
                
        }
        else if(codigocargo == 456){
            aumento = salario * 0.075;
            novosalario = salario + aumento;
            diferença = novosalario - salario;
                
            JOptionPane.showMessageDialog(null, "seu salario antigo é de: R$"+salario+"\n Você ganhara um aumento de: R$"+aumento+ "\n seu novo salario sera de: R$"+novosalario+
            "\n E a diferença é de: R$"+diferença);
        }
        else if(codigocargo == 885){
            aumento = salario * 0.1;
            novosalario = salario + aumento;
            diferença = novosalario - salario;
                
            JOptionPane.showMessageDialog(null, "seu salario antigo é de: R$"+salario+"\n Você ganhara um aumento de: R$"+aumento+ "\n seu novo salario sera de: R$"+novosalario+
            "\n E a diferença é de: R$"+diferença);
        }
        else{
            aumento = salario * 0.15;
            novosalario = salario + aumento;
            diferença = novosalario - salario;
                
            JOptionPane.showMessageDialog(null, "seu salario antigo é de: R$"+salario+"\n Você ganhara um aumento de: R$"+aumento+ "\n seu novo salario sera de: R$"+novosalario+
            "\n E a diferença é de: R$"+diferença);
        }
    }
    
}
