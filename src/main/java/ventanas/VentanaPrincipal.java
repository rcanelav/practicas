package ventanas;

import javax.swing.*;
import negocio.Evento;
import java.awt.*;
import ventanas.paneles.*;

public class VentanaPrincipal extends JFrame {
    
    private static final long serialVersionUID = 1L;
    Pidioma pIdioma = new Pidioma();
    // PCultural pCultural = new PCultural();
    // PDeportivo pDeportivo = new PDeportivo();
    // PDatosOrganizador pDatosOrganizador = new PDatosOrganizador();
    // PDatosTecnico pDatosTecnico = new PDatosTecnico();
    // PArtistico pArtistico = new PArtistico();
    // PAnalogo pAnalogo = new PAnalogo();
    // PCaracter pCaracter = new PCaracter();
    // PActividad pActividad = new PActividad();
    // PClasificacion pClasificacion = new PClasificacion();
    // PUbicacion pUbicacion = new PUbicacion();
    // PEspacios pEspacios = new PEspacios();
    // PTitularidad pTitularidad = new PTitularidad();
    // PDominioPublico pDominioPublico = new PDominioPublico();
    // PDominioPublicoPortuario pDominioPublicoPortuario = new PDominioPublicoPortuario();
    // PVariosMunicipios pVariosMunicipios = new PVariosMunicipios();
    // PEstablecimientos pEstablecimientos = new PEstablecimientos();
    // PEstablecimientoOtro pEstablecimientoOtro = new PEstablecimientoOtro();
    // PLocalesAsimilados pLocalesAsimilados = new PLocalesAsimilados();
    // PEstablecimientosAP pEstablecimientosAP = new PEstablecimientosAP();
    // PLocalDesmontable pLocalDesmontable = new PLocalDesmontable();
    // PInstalacion pInstalacion = new PInstalacion();
    // PRecintos pRecintos = new PRecintos();
    // PLocalesCerrados pLocalesCerrados = new PLocalesCerrados();
    // PIdentificacionEspectaculo pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
    // PFormularioUbicacion pFormularioUbicacion = new PFormularioUbicacion();
    // PDatosUbicacion pDatosUbicacion = new PDatosUbicacion();
    // PDatosFinales pDatosFinales = new PDatosFinales();
    Evento  evento;
    
    public VentanaPrincipal(){
        //Obtener tamano de pantalla del usuario
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setResizable(true);
        setTitle("AutoZAD | Espectáculos públicos | Galicia");
        Image miIcono = miPantalla.getImage("src/main/java/imagenes/logo.png");
        setIconImage(miIcono);
        setLocationRelativeTo(null);  //opcional
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        

        this.getContentPane().add(pIdioma);
        // this.getContentPane().add(pFormularioUbicacion);
        // this.getContentPane().add(pDatosUbicacion);
        // this.getContentPane().add(pDatosFinales);
        // this.getContentPane().add(pIdentificacionEspectaculo);
        // this.getContentPane().add(pInstalacion);
        // this.getContentPane().add(pRecintos);
        // this.getContentPane().add(pLocalesCerrados);
        // this.getContentPane().add(pLocalDesmontable);
        // this.getContentPane().add(pEstablecimientosAP);
        // this.getContentPane().add(pEstablecimientos);
        // this.getContentPane().add(pEstablecimientoOtro);
        // this.getContentPane().add(pLocalesAsimilados);
        // this.getContentPane().add(pUbicacion);
        // this.getContentPane().add(pEspacios);
        // this.getContentPane().add(pCaracter);
        // this.getContentPane().add(pAnalogo);
        // this.getContentPane().add(pClasificacion);
        // this.getContentPane().add(pTitularidad);
        // this.getContentPane().add(pDominioPublico);
        // this.getContentPane().add(pDominioPublicoPortuario);
        // this.getContentPane().add(pVariosMunicipios);
        // this.getContentPane().add(pActividad);
        // this.getContentPane().add(pDatosOrganizador);
        // this.getContentPane().add(pDatosTecnico);
        // this.getContentPane().add(pCultural);
        // this.getContentPane().add(pDeportivo);
        // this.getContentPane().add(pArtistico);
        evento = new Evento();
        
    }

    public Evento getEvento(){
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}
