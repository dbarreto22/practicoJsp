package ControlJSP;

import java.util.List;
import java.util.Scanner;

import javax.ejb.EJB;
import com.practicoJSP.Controladores.controladorIRemote;
import com.practicoJSP.clases.NoticiaJsp;

public class Main {


	@EJB
	private static controladorIRemote remoto;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		try {
			
			// TODO Auto-generated method stub
			Scanner entradaEscaner = new Scanner(System.in);
			System.out.println("INGERSE ID");
			String id = entradaEscaner.nextLine();
			System.out.println("INGERSE TITULO");
			String titulo = entradaEscaner.nextLine();
			System.out.println("INGERSE DESCRIPCION");
			String descripcion = entradaEscaner.nextLine();
			
			System.out.println(id);
			System.out.println("antes");
			System.out.println(remoto.getClass().getName());
		//	remoto.crearNoticiaRemoto(id, titulo, descripcion);
			System.out.println("DESPUES");
			
			List<NoticiaJsp> noticiaMostrar = remoto.getNoticias();

			for (NoticiaJsp noticiaJsp : noticiaMostrar) {
				System.out.println("ID" + noticiaJsp.getId());
				System.out.println("");
				System.out.println("TITULO" + noticiaJsp.getTitulo());
				System.out.println("");
				System.out.println("DESCRIPCION" + noticiaJsp.getDescripcion());

			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
