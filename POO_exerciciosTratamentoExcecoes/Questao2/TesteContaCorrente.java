package Questao2;

public class TesteContaCorrente {
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente(1000.0f, 10.0f, 100.0f);
        
        for (int i = 0; i < 4; i++){
            try{
                switch (i){
                    case 0:
                        cc.sacar(-1.0f);
                        break;
                    case 1:
                        cc.sacar(200.0f);
                        break;
                    case 2:
                        cc.depositar(-1.0f);
                        break;
                    case 3:
                        cc.setValorLimite(-1.0f);
                        break;

                }
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
