/* Modele uma simplificação da hierarquia do Exército Brasileiro. 
 Existem diferentes patentes militares, como Soldado, Cabo, Sargento, Tenente e Capitão.
Cada patente tem atributos como nome, número de identificação e tempo de serviço.
Os soldados reportam aos cabos, os cabos aos sargentos e assim por diante. 
Implemente métodos para listar os subordinados de um militar em uma patente superior e seu superior imediato.*/

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Collections;


public class Exercito {

    private static final char[] subordinados = null;

    public static void main(String[] args) {

        Conscrito conscrito = new conscrito();
        conscrito.nome("Soldado: jorge", 1, 0);
        Soldado soldado = new soldado();
        soldado.nome("Cabo: jorge1", 2, 1);
        Cabo cabo = new cabo();
        cabo.nome("Sargento: jorge2", 3, 2);
        Sargento sargento = new sargento();
        sargento.nome("Tenente: jorge3", 4, 3);
        Tenente tenente = new tenente();
        tenente.nome("Capitao: jorge4", 5, 4);
        Capitao capitao = new capitao();
        capitao.imediato("O proprio Capitao: jorge4", 6, 5);

        
        /*soldado.addsubordinados(conscrito);
        cabo.addsubordinados(soldado);
        sargento.addsubordinados(cabo);
        tenente.addSubordinados(sargento);
        capitao.addsubordinados(tenente);*/
         

        conscrito.addImediato(soldado);
        soldado.addImediato(cabo);
        cabo.addImediato(sargento);
        sargento.addImediato(tenente);
        tenente.addImediato(capitao);

        System.out.println(
                "O imediato do conscrito é o " + conscrito.getnome + " é o Soldado " + soldado.getimediato.getnome());
        System.out.println("O imediato do soldado é o " + soldado.getnome + " é o  cabo " + cabo.getimediato.getnome());
        System.out.println("O imediato do cabo é o " + cabo.getnome + " é o sargento" + sargento.getimediato.getnome());
        System.out.println(
                "O imediato do sargento é o " + sargento.getnome + " é o tenente " + tenente.getimediato.getnome());
        System.out.println(
                "O imediato do tenente é o " + tenente.getnome + " é o capitao " + capitao.getimediato.getnome());

        System.out.println(subordinados);

    }


}
