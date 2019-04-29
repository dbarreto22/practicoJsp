package ControlJSP;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.enterprise.inject.Model;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;
import org.jboss.logging.Logger;
import com.practicoJSP.Controladores.controladorILocal;
import com.practicoJSP.Persistencia.Persistencia;
import com.practicoJSP.clases.NoticiaJsp;


@Stateful
@Model
public class ControlJsp{

	public static final Logger logger = Logger.getLogger(ControlJsp.class);
	
	@Inject
	controladorILocal local;

	private NoticiaJsp noticia;

	private List<NoticiaJsp> noticias = new ArrayList<>();

	
	public void crearNoticia(NoticiaJsp noticia) throws Exception {
		try {

			logger.info(noticia);

			local.crearNoticia(noticia);
			
		//	this.noticias.add(noticia);

			init();

		} catch (Exception e) {
			// TODO: handle exception
			logger.info(e);
		}

	}

	@Produces
	@Named
	public List<NoticiaJsp> getNoticias() {
		if (local.getNoticias() != null) {
			this.noticias = local.getNoticias();
			return noticias;
		} else {
			return noticias;
		}

	}

	@PostConstruct
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void init() {
		noticia = new NoticiaJsp();
		logger.info("@PostConstruct:initNewMember called");
	}

}
