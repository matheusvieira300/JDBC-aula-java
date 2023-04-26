import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String user = "root";
        String password = "";
        
        BancoDados bd = new BancoDados();
        bd.conectar(url, user, password);
        
        Scanner s = new Scanner(System.in);
        
        
        System.out.println("Digite o CPF:");
        int coluna1 = s.nextInt();
        System.out.println("Digite o Nome:");
        String coluna2 = s.next();
        System.out.println("Digite a Idade:");
        int coluna3 = s.nextInt();
        
        String inserir1 = "INSERT INTO pessoa (ID, nome, idade) VALUES ('" + coluna1 + "', '" + coluna2 + "', " + coluna3 + ")";
       
        
        bd.inserirAlterarExcluir(inserir1);
        
        
        String consultar = "SELECT * FROM pessoa";
        bd.consultar(consultar);
//        System.out.println("Quer inserir mais dados no Banco de Dados: (S/N)");
//        boolean simounao = s.nextBoolean();
//        if(simounao = true){
//        	String inserir2 = "INSERT INTO pessoa (ID, nome, idade) VALUES ('" + coluna1 + "', '" + coluna2 + "', " + coluna3 + ")";
//        	 bd.inserirAlterarExcluir(inserir2);
//        } else {
        bd.desconectar();
       }
    }

