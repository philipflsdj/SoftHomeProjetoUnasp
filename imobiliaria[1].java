
package softhome;
public class imobiliaria implements usable {


    private String nomeFantasia;
    private String email;
    private int cnpj ;
    private int creci;
    private String senha;
    private String descricao;
    imovel imovel; 
    
    
    public imobiliaria() {
    }
    
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getEmail() {
        return email;
    }

    public int getCnpj() {
        return cnpj;
    }

    public int getCreci() {
        return creci;
    }

    public String getSenha() {
        return senha;
    }

    public String getDescricao() {
        return descricao;
    }
    
    
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public void setCreci(int creci) {
        this.creci = creci;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    


 
    public String login(String e,String f){   
        
       if(!(this.email.equals(e)))
        {
        return "não logado";
        }
        if(!(this.email.equals(e)))
        {
        return "não logado";
        }     
        
        return "0";
        
    }
    
    
}
