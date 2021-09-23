public class Pessoa extends Object{
    private String nome;
    private int idade;
    private int altura;
    private String endereco;
    
    Pessoa(){
        super();
    }
    Pessoa (int altura, int idade, String nome){
        this();
    }

    Pessoa (String nome, int idade, int altura){
        this();
    }

    Pessoa (String nome, int idade, int altura, String endereco){
        this();
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setEndereco(endereco);
    }

    Pessoa (String nome, int idade){
        this();
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }




    public void setNome(String nome) {
        if (nome.length() >= 3)
            this.nome = nome;
    }

    

    //esse é o construtor padrão da classe Pessoa
    // Pessoa (){
    //     System.out.println ("Construindo uma pessoa...");
    // }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getIdade() {
        return idade;
    }


    public String getNome() {
        return nome;
    }


}