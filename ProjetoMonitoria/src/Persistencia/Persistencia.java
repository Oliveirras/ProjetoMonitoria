package Persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.security.AnyTypePermission;

import CentralDeInformacoes.CentralDeInformacoes;

public class Persistencia {
	
	private XStream xstream= new XStream(new DomDriver("UTF-8"));
	
	public Persistencia() {
	 xstream.addPermission(AnyTypePermission.ANY);
	}
	public void salvarCentral(CentralDeInformacoes central,String nomeDoArquivo) throws Exception{
		File arquivo= new File(nomeDoArquivo);
			
		try {
			if(!arquivo.exists())
			arquivo.createNewFile();
			PrintWriter gravar = new PrintWriter(arquivo);
			String xml="<?xml version = \"1.0\" encoding =\"UTF-8\"?>\n";
			xml=xstream.toXML(central);
			gravar.print(xml);
			gravar.close();
	   } catch (IOException e) {
				e.printStackTrace();
			}	
	}
	public CentralDeInformacoes recuperarCentral(String nomeDoArquivo) {
		File arquivo= new File(nomeDoArquivo);
		
		try {
			if(arquivo.exists()) {
				FileInputStream fis= new FileInputStream(arquivo);
				return (CentralDeInformacoes)xstream.fromXML(fis);	
	 	    }
		}catch(FileNotFoundException e) {
			e.printStackTrace();	  
		}
		return new CentralDeInformacoes();	
	}

}
