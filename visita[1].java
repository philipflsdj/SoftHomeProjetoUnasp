package softhome;
public class visita {
 private Cliente cliente;
 private imobiliaria imobiliaria;
 private imovel imovel;
 private String data; 

    public visita() {
    }

    public Cliente getCliente() {
        return cliente;
    }

    public imobiliaria getImobiliaria() {
        return imobiliaria;
    }

    public imovel getImovel() {
        return imovel;
    }

    public String getData() {
        return data;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setImobiliaria(imobiliaria imobiliaria) {
        this.imobiliaria = imobiliaria;
    }

    public void setImovel(imovel imovel) {
        this.imovel = imovel;
    }

    public void setData(String data) {
        this.data = data;
    }
 
}
