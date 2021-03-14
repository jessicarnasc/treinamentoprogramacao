package programa;

public class aula1 {

	public static void main(String[] args) {


		
		String[][] planilha = new String[3][3];
		planilha[0][0] ="Jessica";
		planilha[0][1] ="Rocha";
		planilha[0][2] ="Nascimento";
		planilha[1][0] ="Marcio";
		planilha[1][1] ="Rocha";
		planilha[1][2] ="Nascimento";
		planilha[2][0] ="Aaliyah";
		planilha[2][1] ="Rocha";
		planilha[2][2] ="Nascimento";
		
//		System.out.println(planilha[0][0] + " " + planilha[0][1] + " " + planilha[0][2]);
		
		String nomeCompleto = "";
		
		
		for (int linha = 0; linha < planilha.length; linha++) {
			for (int coluna = 0; coluna < planilha[linha].length; coluna++) {
				nomeCompleto = nomeCompleto + planilha[linha][coluna] + " ";
			}
			System.out.println(nomeCompleto);
			nomeCompleto = "";
		}
		
		
		//Vetor
		//        String[] meuArray = new String[3];
//		
//        meuArray[0]="Jessica";
//        meuArray[1]="Marcio";
//        meuArray[2]="Aaliyah";
//        
//        for (int i = 0; i < meuArray.length; i++) {
//        	if ( i== 2) {
//				break;
//			}
//        	System.out.println(meuArray[i]);
//			
//			
//		}  
		
		//While
		
		//		int i=1;
//
//		while (i<+1000) {
//			System.out.println("o numero é :" + i);
//			i++;
//		}
		// loops 
//		int i;
//		
//		for (i = 1; i <= 1000; i++) {
//			System.out.println("o numero é :" + i);
//		}
//estruturas basicas		
//		String nome = "Jessica";
//		
//		switch (nome) {
//		case "Jessica":
//			System.out.println("Jessica tem 29 anos");
//			break;
//		case "Marcio":
//			System.out.println("Marcio tem 40 anos");
//			break;
//		default:
//			System.out.println("nao é a Jessica");
//			break;
//		}
		
//		if (nome == "Jessica") {
//			System.out.println("Jessica tem 29 anos");
//		} else if (nome=="Marcio") {
//			System.out.println("Marcio tem 40 anos");
//		} else {
//			System.out.println("nao é a Jessica");
//		}

	}

}
