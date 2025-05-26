
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
* Classe que representa a tabela Contrato
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"Contrato\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Contrato")
@CronappTable(role=CronappTableRole.CLASS)
public class Contrato implements Serializable {
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
    @CronappColumn(attributeType="STRING", label="Numero")
    @Column(name = "numero", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String numero;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Descricao")
    @Column(name = "descricao", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String descricao;


    /**
    * @generated
    */
    @CronappColumn(attributeType="DOUBLE", label="Valor Global", mask="#.#00,00")
    @Column(name = "valorGlobal", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Double valorGlobal;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Inicio")
    @Column(name = "dataInicio", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataInicio;


    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @CronappColumn(attributeType="DATE", label="Data Fim")
    @Column(name = "dataFim", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dataFim;


    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_cliente", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
        
        private Cliente cliente;


    /**
    * Construtor
    * @generated
    */
    public Contrato(){
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
    public Contrato setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém numero
    * return numero
    * @generated
    */
    public java.lang.String getNumero() {
        return this.numero;
    }

    /**
    * Define numero
    * @param numero numero
    * @generated
    */
    public Contrato setNumero(java.lang.String numero) {
        this.numero = numero;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    public java.lang.String getDescricao() {
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public Contrato setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém valorGlobal
    * return valorGlobal
    * @generated
    */
    public java.lang.Double getValorGlobal() {
        return this.valorGlobal;
    }

    /**
    * Define valorGlobal
    * @param valorGlobal valorGlobal
    * @generated
    */
    public Contrato setValorGlobal(java.lang.Double valorGlobal) {
        this.valorGlobal = valorGlobal;
        return this;
    }
    /**
    * Obtém dataInicio
    * return dataInicio
    * @generated
    */
    public java.util.Date getDataInicio() {
        return this.dataInicio;
    }

    /**
    * Define dataInicio
    * @param dataInicio dataInicio
    * @generated
    */
    public Contrato setDataInicio(java.util.Date dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }
    /**
    * Obtém dataFim
    * return dataFim
    * @generated
    */
    public java.util.Date getDataFim() {
        return this.dataFim;
    }

    /**
    * Define dataFim
    * @param dataFim dataFim
    * @generated
    */
    public Contrato setDataFim(java.util.Date dataFim) {
        this.dataFim = dataFim;
        return this;
    }
    /**
    * Obtém cliente
    * return cliente
    * @generated
    */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
    * Define cliente
    * @param cliente cliente
    * @generated
    */
    public Contrato setCliente(Cliente cliente) {
        this.cliente = cliente;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Contrato object = (Contrato)obj;
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
