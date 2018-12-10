package softhome;
public class Cliente implements usable {
    private String nome;
    private String email;
    private String senha;

    public Cliente() {
         
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

    public String login(String e,String f){   
        
       if(!(this.email.equals(e)))
        {
        return "não logado";
        }
        if(!(this.senha.equals(e)))
        {
        return "não logado";
        }     
        
        return "0";
        
    }
    

    
    
    
    
}
