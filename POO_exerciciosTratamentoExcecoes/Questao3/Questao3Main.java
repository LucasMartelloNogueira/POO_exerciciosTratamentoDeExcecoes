package Questao3;

public class Questao3Main {
    public static void main(String[] args) {
        CadastroCliente cc = new CadastroCliente();


        //testando dois cpf's iguais
        try{
            cc.inserir("Lucas", 182);
            cc.inserir("Lu", 182);
            System.out.println("Cliente inserido na lista");
        }
        catch (RepositorioException e){
            System.out.println(e.getMessage());
        }
        catch (ClienteJaExistenteException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        // testando botar mais de 10 clientes
        CadastroCliente cc2 = new CadastroCliente();
        
        for (int i = 0; i < 11; i++){
            try{
                String num = Integer.toString(i);
                String nomeCliente = "Lucas"+num;
                cc2.inserir(nomeCliente, i);
                System.out.println("Cliente inserido na lista / ha " + cc2.indiceAtual + " cliente(s) na lista");
            }
            catch (RepositorioException e){
                System.out.println(e.getMessage());
            }
            catch (ClienteJaExistenteException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println();

        // testando a busca por cpf / com cpf existente
        // nome cliente = "Lucas" + "cpf"
        // entao cpf = 3 deve retornar "Lucas3"

        try{
            Cliente cliente = cc2.buscaPorCpf(3);
            System.out.println("cliente encontrado! / nome: " + cliente.getNome());
        }
        catch (ClienteInexistenteException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("----------------------------");
        System.out.println();
        
        // testando busca por cpf / com cpf inexistente
        // como a lista so tem 10 posicoes (0 a 9), nao ha cpf = 10

        try{
            Cliente cliente = cc2.buscaPorCpf(10);
            System.out.println("cliente encontrado! / nome: " + cliente.getNome());
        }
        catch (ClienteInexistenteException e){
            System.out.println(e.getMessage());
        }

    }
}

