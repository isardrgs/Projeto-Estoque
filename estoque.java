class Produto{
    int codigo_prod, estoque_atual, estoque_maximo, estoque_minimo;
    String nome;
    double preco;
    
    void inserir (int inserir){
        this.estoque_atual += inserir;
    }
    
    void retirar (int retirar){
        this.estoque_atual -= retirar;
    }
    
    void verificar (){
        if (this.estoque_atual < this.estoque_minimo){
            int quantidade;
            
            quantidade = this.estoque_minimo - this.estoque_atual;
            
            System.out.println("Será necessário comprar " + quantidade + " de " + this.nome);
        }
        else
            System.out.println("Não será necessário comprar " + this.nome);
    }
    
    void mostrar (){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Código do produto: " + this.codigo_prod);
        System.out.println("Estoque atual: " + this.estoque_atual);
        System.out.println("Estoque máximo: " + this.estoque_maximo);
        System.out.println("Estoque mínimo: " + this.estoque_minimo);
        System.out.println("Preço do produto: R$" + this.preco);
    }
}
public class JavaApplication2 {

    public static void main(String[] args) {
        Produto macarrao = new Produto();
        macarrao.codigo_prod = 12345;
        macarrao.estoque_atual = 12;
        macarrao.estoque_maximo = 15;
        macarrao.estoque_minimo = 10;
        macarrao.nome = "Macarrão Renata";  
        macarrao.preco = 6.30;
        
        macarrao.mostrar();
        
        Produto cafe = new Produto();
        cafe.codigo_prod = 54321;
        cafe.estoque_atual = 9;
        cafe.estoque_maximo = 15;
        cafe.estoque_minimo = 10;
        cafe.nome = "Sobrinho's coffee";
        cafe.preco = 8.99;  
        
    }
    
}
