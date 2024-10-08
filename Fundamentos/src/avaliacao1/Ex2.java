package avaliacao1;

import java.util.Scanner;

//	Uma transportadora precisa disponibilizar um aplicativo aos seus clientes para cálculo rápido de frete de encomendas que possuam apenas um determinado tipo de produto. Inicialmente, será desenvolvido um algoritmo para verificar a aplicabilidade da solução proposta.
//	
//	O objetivo é que, ao receber as informações sobre o frete, o algoritmo consiga estimar o valor, respeitando os requisitos especificados.
//	
//	Para cálculo do frete, é necessário informar:
//	
//	Código do produto
//	001 – Mouse Óptico USB – R$ 35,00
//	002 – SSD 240GB – R$ 200,00
//	003 – Adaptador wireless USB – R$ 75,00
//	004 – Pen Drive 16GB – R$ 20,00
//	005 – Webcam – R$ 159,00
//	Quantidade
//	Região de destino
//	Sul (7%)
//	Sudeste (5%)
//	Centro-Oeste (9%)
//	Nordeste (12%)
//	Norte (15%)
//	Tipo de embalagem
//	Caixa de papelão grande comum (10,00)
//	Caixa de papelão grande triplex (20,00)
//	Plástico bolha (12,00)
//	Saco plástico (5,00)
//	Adicionais, que são opcionais
//	Seguro (5%)
//	Rastreamento (3%)
//	Escolta armada (10%)
//	Após receber as informações, o algoritmo deverá exibir as seguintes informações:
//	
//	valor total do produto (qtd x preço unitário)
//	valor subtotal do frete (de acordo com a região)
//	valor da embalagem
//	valor cobrado pelos adicionais
//	valor final da operação (soma de todos os valores).
//	
//	
//	Informações:
//	
//	A quantidade não poderá ser superior a 10
//	A embalagem é apenas uma, independentemente da quantidade de produtos
//	Os adicionais são opcionais
//	Pode ser escolhido mais de um adicional
//	Critérios de avaliação
//	
//	Identificação e declaração das variáveis (10%)
//	Validação de dados (25%)
//	Cálculo do valor (45%)
//	Exibição das informações (20%)

public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Resultados
		double vrTotalDoProduto, vrSubTotalDoFrete, vrCobradoPelosAdicionais, vrFinal;
		// E a vrEmbalagem que já está declarada.
		
		// Para cálculo do frete, é necessário informar:
		// Para o produto
		String dsProduto = "", cdProduto;
		double vrProdutoUnitario = 0;
		
		// Quantidade
		int quantidade;
		
		// Região de destino
		String dsRegiaoDestino;
		double pcRegiaoDestino = 0;
		
		// Tipo de embalagem
		String dsEmbalagem;
		double vrEmbalagem = 0;
		
		// Adicionais, que são opcionais
		String dsAdicionais, ehOpcional = "", temSeguro = "", temRastreamento = "", temEscoltaArmada = "";
		double pcAdicionais = 0;
		
		// Estrutura dos inputs
		
		// Identificação do produto
		do {			
			System.out.println("Digite o código do produto");
			cdProduto = in.nextLine();
			if(cdProduto.equals("001")) {
				dsProduto = "Mouse Óptico USB";
				vrProdutoUnitario =  35;
			} else if(cdProduto.equals("002")) {
				dsProduto = "SSD 240GB";
				vrProdutoUnitario =  200;			
			} else if(cdProduto.equals("003")) {
				dsProduto = "Adaptador wireless USB";
				vrProdutoUnitario = 75;
			} else if(cdProduto.equals("004")) {
				dsProduto = "Pen Drive 16GB";
				vrProdutoUnitario = 20;
			} else if(cdProduto.equals("005")) {
				dsProduto = "Webcam";
				vrProdutoUnitario = 59;
			}
		} while (dsProduto.isEmpty());
		
		do {
			System.out.println("Digite a quantidade");
			quantidade = in.nextInt();
			// A quantidade não poderá ser superior a 10
		} while (quantidade < 1 || quantidade > 10);
		in.nextLine();
		
		do {
			System.out.println("Digite a região de destino: ");
			dsRegiaoDestino = in.nextLine();
			if(dsRegiaoDestino.equalsIgnoreCase("Sul")) {
				pcRegiaoDestino = 0.07;
			} 
			else if(dsRegiaoDestino.equalsIgnoreCase("Sudeste")) {
				pcRegiaoDestino = 0.05;
			}
			else if(dsRegiaoDestino.equalsIgnoreCase("Centro-Oeste") || dsRegiaoDestino.equalsIgnoreCase("Centro Oeste")) {
				pcRegiaoDestino = 0.09;
			}
			else if(dsRegiaoDestino.equalsIgnoreCase("Nordeste")) {
				pcRegiaoDestino = 0.12;
			}
			else if(dsRegiaoDestino.equalsIgnoreCase("Norte")) {
				pcRegiaoDestino = 0.15;				
			}
		} while (pcRegiaoDestino == 0);
		
		// A embalagem é apenas uma, independentemente da quantidade de produtos
		do {
			System.out.println("Digite o tipo de embalagem");
			dsEmbalagem = in.nextLine();
			if(dsEmbalagem.equalsIgnoreCase("Caixa de papelão grande comum") ||
				dsEmbalagem.equalsIgnoreCase("Caixa de papelao grande comum")) {
				vrEmbalagem = 10;
			} else if(dsEmbalagem.equalsIgnoreCase("Caixa de papelão grande triplex")||
					dsEmbalagem.equalsIgnoreCase("Caixa de papelao grande triplex")) {
				vrEmbalagem = 20;
			} else if(dsEmbalagem.equalsIgnoreCase("Plástico bolha") ||
					dsEmbalagem.equalsIgnoreCase("Plástico bolha")) {
				vrEmbalagem = 12;
			} else if(dsEmbalagem.equalsIgnoreCase("Saco plástico") ||
				dsEmbalagem.equalsIgnoreCase("Saco plastico")) {
				vrEmbalagem = 5;
			}
		} while (vrEmbalagem == 0);
		
		// Os adicionais são opcionais
		System.out.println("Deseja incluir opcionais? Digite sim, se sim.");
		ehOpcional = in.nextLine();
		if(ehOpcional.equalsIgnoreCase("sim")) {
			// Pode ser escolhido mais de um adicional
			System.out.println("Tem seguro? Digite sim, se sim.");
			temSeguro = in.nextLine();
			if(temSeguro.equalsIgnoreCase("sim")) {
				pcAdicionais += 0.05;
			}
			System.out.println("Tem rastreamento? Digite sim, se sim.");
			temRastreamento = in.nextLine();
			if(temRastreamento.equalsIgnoreCase("sim")) {
				pcAdicionais += 0.03;
			}
			System.out.println("Tem escolta armada? Digite sim, se sim.");
			temEscoltaArmada = in.nextLine();
			if(temEscoltaArmada.equalsIgnoreCase("sim")) {
				pcAdicionais += 0.1;
			}
		}
		System.out.println(pcAdicionais);
		
		vrTotalDoProduto = vrProdutoUnitario * quantidade;
		System.out.printf("Valor total do produto: %.2f%n", vrTotalDoProduto);
		
		vrSubTotalDoFrete = vrTotalDoProduto * pcRegiaoDestino;
		System.out.printf("Valor subtotal do frete: %.2f%n", vrSubTotalDoFrete);
		
		System.out.printf("Valor da embalagem: %.2f%n", vrEmbalagem);
		
		vrCobradoPelosAdicionais = vrTotalDoProduto * pcAdicionais;
		System.out.printf("Valor cobrado pelos adicionais: %.2f%n", vrCobradoPelosAdicionais);
		
		// A soma de todos os valores
		vrFinal = vrTotalDoProduto + vrSubTotalDoFrete + vrCobradoPelosAdicionais + vrEmbalagem;
		System.out.printf("Valor final: %.2f%n", vrFinal);
		
		in.close();		
	}
}
