package edu.udc.psw.arquivos;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ArquivoSerial {
	private ObjectOutputStream out;
	public void openfile() {
		try {
			out=new ObjectOutputStream(new FileOutputStream( ("C:\\Users\\adeli\\Desktop\\CC 2018\\projeto de "
					+ "software 1\\politicos.txt")));
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.exit(0);
	}
	
}
	public void adiciona_registros() {
		Politico politico= new Politico();
		Scanner sc =new Scanner(System.in);
		
		System.out.printf(
				"para terminar, digite <ctrl> de no unix/linux/mac os x"+
				"ou <crtl> no windows");
		System.out.println("informe os dados do politico (numero, nome, eo partido");
		while(sc.hasNext());// enquanto nao for pressionada a tecla de saida do windows ou do linux
			politico.setNumero(sc.nextInt());
			politico.setNome(sc.next());
			politico.setPartido(sc.next());
			
		if (politico.getNumero()>0) {
			try {
				out.writeObject(                               //objEscrita.append(
						String.format("%5s - %5d - %s",
							politico.getPartido(),
								politico.getNome(),
								politico.getNumero())
							);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
							
	public void fecha_arquivo() {
		Object objEscrita;
		if(objEscrita !=null) {
			try {
			objEscrita.close();
			objEscrita=null;
		}
		catch(IOException e) 
		{
			e.printStackTrace();
			System.exit(0);
		}
		}
		}
	}
		
	
							
				

