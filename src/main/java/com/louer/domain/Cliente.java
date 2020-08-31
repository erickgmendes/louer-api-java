package com.louer.domain;

import com.louer.domain.enums.TipoCliente;
import com.louer.domain.enums.TipoPessoa;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Date dataCadastro;

    @Column
    private TipoCliente tipoCliente;

    @Column
    private String razaoSocial;

    @Column(unique = true)
    private String nome;

    @Column(unique = true, nullable = false)
    private TipoPessoa tipoPessoa;

    @Column(unique = true, nullable = false)
    private String cpfCnpj;

    @Column(unique = true, nullable = false)
    private String inscricao;

    @Column(unique = true, nullable = false)
    private String endereco;

    @Column
    private String numero;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String uf;

    @Column
    private String complemento;

    @Column
    private String observacoes;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<ClienteTelefone> clienteTelefones;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<ClienteEmail> clienteEmails;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<ClienteReferencia> clienteReferencias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Set<ClienteTelefone> getClienteTelefones() {
        return clienteTelefones;
    }

    public void setClienteTelefones(Set<ClienteTelefone> clienteTelefones) {
        this.clienteTelefones = clienteTelefones;
    }

    public Set<ClienteEmail> getClienteEmails() {
        return clienteEmails;
    }

    public void setClienteEmails(Set<ClienteEmail> clienteEmails) {
        this.clienteEmails = clienteEmails;
    }

    public Set<ClienteReferencia> getClienteReferencias() {
        return clienteReferencias;
    }

    public void setClienteReferencias(Set<ClienteReferencia> clienteReferencias) {
        this.clienteReferencias = clienteReferencias;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}