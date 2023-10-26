
/* Modele uma simplificação da hierarquia do Exército Brasileiro. 
 Existem diferentes patentes militares, como Soldado, Cabo, Sargento, Tenente e Capitão.
Cada patente tem atributos como nome, número de identificação e tempo de serviço.
Os soldados reportam aos cabos, os cabos aos sargentos e assim por diante. 
Implemente métodos para listar os subordinados de um militar em uma patente superior e seu superior imediato.*/

public class Exercito {

        public static void main(String[] args) {

                Conscrito conscrito = new Conscrito("Conscrito: jorge", 1, 0);

                Soldado soldado = new Soldado("Soldado: jorge1", 2, 1);

                Cabo cabo = new Cabo("Cabo: jorge2", 3, 2);

                Sargento sargento = new Sargento("Sargento: jorge3", 4, 3);

                Tenente tenente = new Tenente("Tenente: jorge4", 5, 4);

                Capitao capitao = new Capitao("Capitao: jorge5", 6, 5);

                soldado.addSubordinado(conscrito);
                cabo.addSubordinado(soldado);
                sargento.addSubordinado(cabo);
                tenente.addSubordinado(sargento);
                capitao.addSubordinado(tenente);

                conscrito.setImediato(soldado);
                soldado.setImediato(cabo);
                cabo.setImediato(sargento);
                sargento.setImediato(tenente);
                tenente.setImediato(capitao);

                soldado.addSubordinado(conscrito);
                cabo.addSubordinado(soldado);
                sargento.addSubordinado(cabo);
                tenente.addSubordinado(sargento);
                capitao.addSubordinado(tenente);

                System.out.println(
                                "O imediato do conscrito é o " + conscrito.getNome() + " é o Soldado "
                                                + soldado.getImediato().getNome());
                System.out.println("O imediato do soldado é o " + soldado.getNome()+ " é o  cabo "
                                + cabo.getImediato().getNome());
                System.out.println("O imediato do cabo é o " + cabo.getNome() + " é o sargento"
                                + sargento.getImediato().getNome());
                System.out.println(
                                "O imediato do sargento é o " + sargento.getNome() + " é o tenente "
                                                + tenente.getImediato().getNome());
                /*System.out.println(
                                "O imediato do tenente é o " + Tenente.getNome + " é o capitao "
                                                + Capitao.getImediato().getNome());*/
        }

}
