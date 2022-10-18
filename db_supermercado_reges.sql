--create database db_supermercado_reges;

use db_supermercado_reges;

create table pessoa(
	id int primary key identity(1,1)
	,nome				varchar(150) not null
	,dataNascimento		datetime	 not null
	,documento			varchar(20)  not null
	,telefone			varchar(14) 
	,email				varchar(150)	
	,tipo				varchar(2)  not null /*CL - CLIENTE, FO - FORNECEDOR, FU - FUNCIONARIO*/
	);

	create table endereco(
	 id int primary key identity(1,1)
	,logradouro		varchar(150)	 not null
	,numero		    varchar(20)		 not null
	,uf				varchar(2)		 not null
	,bairro			varchar(150)
	,cep		    varchar(9) 		 not null
	,idPessoa		int 		  	 not null
	CONSTRAINT fk_pessoa_endereco FOREIGN KEY (idPessoa) REFERENCES pessoa (id)
	);
	

	create table produto(
	id			  int primary key identity(1,1)  
    ,descricao	  varchar(250)   not null
    ,codigoBarra  varchar(500)   not null
	,quantidade   decimal(10,2)  not null
	,dataValidade datetime		 not null
	,marca		  varchar(40)	 not null
	)

	/*
	private Calendar dataVenda;
	private int numeroVenda;
	private int numeroNota;
    private Cliente cliente;  
	*/
	create table venda(
	id int primary key identity(1,1)
	,dataVenda		   datetime
	,numeroNota			int 
	,idCliente			int
	,idFuncionario		int
	,constraint fk_cliente_venda foreign key (idCliente) references pessoa(id)
	,CONSTRAINT fk_funcionario_venda FOREIGN KEY (idFuncionario) REFERENCES pessoa (id)
	
	)

	create table itemvenda(
	idVenda int
	,idProduto int
	,quantidade decimal(10,2)
	,valorTotal decimal(10,2)
	,constraint fk_itemvenda_venda foreign key (idVenda) references venda(id)
	,constraint fk_itemvenda_produto foreign key (idProduto) references produto(id)
	
	)










