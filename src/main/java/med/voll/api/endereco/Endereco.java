package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String cep;

    public Endereco(DadosEndereco endereco){
        this.logradouro = endereco.logradouro();
        this.numero = endereco.numero();
        this.complemento = endereco.complemento();
        this.bairro = endereco.bairro();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.cep = endereco.cep();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if(dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }

        if(dados.numero() != null){
            this.numero = dados.numero();
        }

        if(dados.complemento() != null){
            this.complemento = dados.complemento();
        }

        if(dados.bairro() != null){
            this.bairro = dados.bairro();
        }

        if(dados.cidade() != null){
            this.cidade = dados.cidade();
        }

        if(dados.uf() != null){
            this.uf = dados.uf();
        }

        if(dados.cep() != null){
            this.cep = dados.cep();
        }
    }
}