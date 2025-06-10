
package app.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela USERDETAIL
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"USERDETAIL\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.UserDetail")
@CronappTable(role=CronappTableRole.CLASS)
public class UserDetail implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @CronappColumn(attributeType="DATETIME", label="Data Cadastro")
    @Column(name = "dataCadastro", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataCadastro;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Forma Pagamento")
    @Column(name = "formaPagamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String formaPagamento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor", mask="#.#00,00")
    @Column(name = "valor", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valor;


    /**
    * @generated
    */
    @CronappColumn(attributeType="BOOLEAN", label="Abono Anual")
    @Column(name = "abonoAnual", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Boolean abonoAnual;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Variavel Desenvolivmento", mask="#.#00,00")
    @Column(name = "valorVariavelDesenvolivmento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorVariavelDesenvolivmento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Variavel Treinamento", mask="#.#00,00")
    @Column(name = "valorVariavelTreinamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorVariavelTreinamento;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Ressarcimento Telefone", mask="#.#00,00")
    @Column(name = "valorRessarcimentoTelefone", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorRessarcimentoTelefone;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Pro Labore", mask="#.#00,00")
    @Column(name = "valorProLabore", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorProLabore;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_tipoOcasiaoPagamento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private TipoOcasiaoPagamento tipoOcasiaoPagamento;


    /**
    * @generated
    */
    @OneToOne
    @JoinColumn(name="fk_unidadePagamento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private UnidadePagamento unidadePagamento;


    /**
    * Construtor
    * @generated
    */
    public UserDetail(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public UserDetail setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém dataCadastro
    * return dataCadastro
    * @generated
    */
    public java.util.Date getDataCadastro() {
        return this.dataCadastro;
    }

    /**
    * Define dataCadastro
    * @param dataCadastro dataCadastro
    * @generated
    */
    public UserDetail setDataCadastro(java.util.Date dataCadastro) {
        this.dataCadastro = dataCadastro;
        return this;
    }
    /**
    * Obtém formaPagamento
    * return formaPagamento
    * @generated
    */
    public java.lang.String getFormaPagamento() {
        return this.formaPagamento;
    }

    /**
    * Define formaPagamento
    * @param formaPagamento formaPagamento
    * @generated
    */
    public UserDetail setFormaPagamento(java.lang.String formaPagamento) {
        this.formaPagamento = formaPagamento;
        return this;
    }
    /**
    * Obtém valor
    * return valor
    * @generated
    */
    public java.lang.Double getValor() {
        return this.valor;
    }

    /**
    * Define valor
    * @param valor valor
    * @generated
    */
    public UserDetail setValor(java.lang.Double valor) {
        this.valor = valor;
        return this;
    }
    /**
    * Obtém abonoAnual
    * return abonoAnual
    * @generated
    */
    public java.lang.Boolean getAbonoAnual() {
        return this.abonoAnual;
    }

    /**
    * Define abonoAnual
    * @param abonoAnual abonoAnual
    * @generated
    */
    public UserDetail setAbonoAnual(java.lang.Boolean abonoAnual) {
        this.abonoAnual = abonoAnual;
        return this;
    }
    /**
    * Obtém valorVariavelDesenvolivmento
    * return valorVariavelDesenvolivmento
    * @generated
    */
    public java.lang.Double getValorVariavelDesenvolivmento() {
        return this.valorVariavelDesenvolivmento;
    }

    /**
    * Define valorVariavelDesenvolivmento
    * @param valorVariavelDesenvolivmento valorVariavelDesenvolivmento
    * @generated
    */
    public UserDetail setValorVariavelDesenvolivmento(java.lang.Double valorVariavelDesenvolivmento) {
        this.valorVariavelDesenvolivmento = valorVariavelDesenvolivmento;
        return this;
    }
    /**
    * Obtém valorVariavelTreinamento
    * return valorVariavelTreinamento
    * @generated
    */
    public java.lang.Double getValorVariavelTreinamento() {
        return this.valorVariavelTreinamento;
    }

    /**
    * Define valorVariavelTreinamento
    * @param valorVariavelTreinamento valorVariavelTreinamento
    * @generated
    */
    public UserDetail setValorVariavelTreinamento(java.lang.Double valorVariavelTreinamento) {
        this.valorVariavelTreinamento = valorVariavelTreinamento;
        return this;
    }
    /**
    * Obtém valorRessarcimentoTelefone
    * return valorRessarcimentoTelefone
    * @generated
    */
    public java.lang.Double getValorRessarcimentoTelefone() {
        return this.valorRessarcimentoTelefone;
    }

    /**
    * Define valorRessarcimentoTelefone
    * @param valorRessarcimentoTelefone valorRessarcimentoTelefone
    * @generated
    */
    public UserDetail setValorRessarcimentoTelefone(java.lang.Double valorRessarcimentoTelefone) {
        this.valorRessarcimentoTelefone = valorRessarcimentoTelefone;
        return this;
    }
    /**
    * Obtém valorProLabore
    * return valorProLabore
    * @generated
    */
    public java.lang.Double getValorProLabore() {
        return this.valorProLabore;
    }

    /**
    * Define valorProLabore
    * @param valorProLabore valorProLabore
    * @generated
    */
    public UserDetail setValorProLabore(java.lang.Double valorProLabore) {
        this.valorProLabore = valorProLabore;
        return this;
    }
    /**
    * Obtém tipoOcasiaoPagamento
    * return tipoOcasiaoPagamento
    * @generated
    */
    public TipoOcasiaoPagamento getTipoOcasiaoPagamento() {
        return this.tipoOcasiaoPagamento;
    }

    /**
    * Define tipoOcasiaoPagamento
    * @param tipoOcasiaoPagamento tipoOcasiaoPagamento
    * @generated
    */
    public UserDetail setTipoOcasiaoPagamento(TipoOcasiaoPagamento tipoOcasiaoPagamento) {
        this.tipoOcasiaoPagamento = tipoOcasiaoPagamento;
        return this;
    }
    /**
    * Obtém unidadePagamento
    * return unidadePagamento
    * @generated
    */
    public UnidadePagamento getUnidadePagamento() {
        return this.unidadePagamento;
    }

    /**
    * Define unidadePagamento
    * @param unidadePagamento unidadePagamento
    * @generated
    */
    public UserDetail setUnidadePagamento(UnidadePagamento unidadePagamento) {
        this.unidadePagamento = unidadePagamento;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
UserDetail object = (UserDetail)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
