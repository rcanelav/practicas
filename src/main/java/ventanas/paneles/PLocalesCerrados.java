package ventanas.paneles;
import ventanas.VentanaPrincipal;
import ventanas.botones.RadioBut;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;

import negocio.UbicacionEvento.LocalCerrado;

import java.awt.event.ActionEvent;
import java.awt.*;

public class PLocalesCerrados extends PFondoStandard {
    private GridBagConstraints grid = new Grid();
    private RadioBut rbTeatro;
    private RadioBut rbAuditorio;
    private RadioBut rbCirco;
    private RadioBut rbCine;
    private RadioBut rbPlazaToros;
    private RadioBut rbEspectaculosDeportivos;
    private ButtonGroup radioButtons;
    private String texto;
    private PIdentificacionEspectaculo pIdentificacionEspectaculo;

    public PLocalesCerrados(){
        colocarTexto();
        colocarBotones();
    }

    public void colocarTexto(){
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -300, 0);
        this.add(textoTitulo, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  "+
                "el  Catálogo  de espectáculos  públicos,  actividades  recreativas  y  establecimientos"+
                " abiertos  al público  de la  Comunidad  Autónoma  de  Galicia  y  se  establecen  "+
                "determinadas disposiciones generales de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -150, 0);
        this.add(textoLey, grid);
    }

    private void colocarBotones(){
        
        rbTeatro = new RadioBut("TEATRO", 16);
        rbTeatro.addActionListener(this);
        grid = new Grid(0, 3, 0, 0, 50, 30, 20);
        this.add(rbTeatro, grid);

        rbAuditorio = new RadioBut("AUDITORIO", 16);
        rbAuditorio.addActionListener(this);
        grid = new Grid(0, 3, 0, 0, 450, 30, 20);
        this.add(rbAuditorio, grid);

        rbCirco = new RadioBut("CIRCO", 16);
        rbCirco.addActionListener(this);
        grid = new Grid(1, 3, 2, 0, -300, 30, 20);
        this.add(rbCirco, grid);
        
        rbCine = new RadioBut("CINE", 16);
        rbCine.addActionListener(this);
        grid = new Grid(1, 3, 2, 0, 0, 30, 20);
        this.add(rbCine, grid);
        
        rbPlazaToros = new RadioBut("PLAZA DE TOROS", 16);
        rbPlazaToros.addActionListener(this);
        grid = new Grid(0, 4, 0, 0, 120, 30, 20);
        this.add(rbPlazaToros, grid);
        
        rbEspectaculosDeportivos = new RadioBut("ESTABLECIMIENTO ESPECTÁCULOS DEPORTIVOS", 16);
        rbEspectaculosDeportivos.addActionListener(this);
        grid = new Grid(0, 4, 2, 0, 265, 30, 20);
        this.add(rbEspectaculosDeportivos, grid);
        radioButtons = new ButtonGroup();
        radioButtons.add(rbTeatro);
        radioButtons.add(rbAuditorio);
        radioButtons.add(rbCirco);
        radioButtons.add(rbCine);
        radioButtons.add(rbPlazaToros);
        radioButtons.add(rbEspectaculosDeportivos);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        String mensaje;
        Object[] options = { "Continuar", "Cancelar" };
        if(e.getSource() == rbTeatro){
            texto = "- Establecimiento abierto al público destinado a la celebración de espectáculos teatrales" 
            +" y musicales al aire libre o en una o varias salas, que cuente con escenario, camerinos y localidades" 
            +" de asiento, así como con servicios e instalaciones adecuadas para su uso.";
            mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",400, texto);
            int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (res == 0) {
                frame.getEvento().setTipoLocalCerrado(LocalCerrado.TEATRO);
                pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
                frame.add(pIdentificacionEspectaculo);
                this.setVisible(false);
            }
                    
        }else if(e.getSource() == rbAuditorio){
            texto = "- Establecimiento abierto al público destinado a la celebración de espectáculos teatrales" 
            +" y musicales y actividades culturales al aire libre o en una o varias salas, que cuente con escenario,"
            +" camerinos, localidades de asiento y locales auxiliares, así como con servicios e instalaciones adecuadas" 
            +" para su uso.";
            mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",400, texto);
            int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (res == 0) {
                frame.getEvento().setTipoLocalCerrado(LocalCerrado.AUDITORIO);
                pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
                frame.add(pIdentificacionEspectaculo);
                this.setVisible(false);
            }
        }else if(e.getSource() == rbCirco){
            texto = "- Establecimiento abierto al público destinado exclusivamente a la celebración de espectáculos" 
            +" circenses, que cuenten con, por lo menos, una pista para la celebración de éstos y bancadas para las" 
            +" personas que asisten al espectáculo.";
            mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",400, texto);
            int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (res == 0) {
                frame.getEvento().setTipoLocalCerrado(LocalCerrado.CIRCO);
                pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
                frame.add(pIdentificacionEspectaculo);
                this.setVisible(false);
            }
        }else if(e.getSource() == rbCine){
            texto = "- Establecimiento abierto al público preparado especialmente para la proyección de películas" 
            +" cinematográficas al aire libre o en una o varias salas de exhibición, con independencia de los" 
            +" procedimientos técnicos que se empleen.";
            mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",400, texto);
            int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (res == 0) {
                frame.getEvento().setTipoLocalCerrado(LocalCerrado.CINE);
                pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
                frame.add(pIdentificacionEspectaculo);
                this.setVisible(false);
            }
        }else if(e.getSource() == rbPlazaToros){
            texto = "- Establecimiento abierto al público regulado y definido en la normativa específica" 
            +" taurina que se destinen a la celebración de espectáculos taurinos y festejos taurinos populares,"
            +" en los términos establecidos en la normativa específica.";
            mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",400, texto);
            int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (res == 0) {
                frame.getEvento().setTipoLocalCerrado(LocalCerrado.PLAZA_TOROS);
                pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
                frame.add(pIdentificacionEspectaculo);
                this.setVisible(false);
            }
        }else if(e.getSource() == rbEspectaculosDeportivos){
            texto = "- Establecimiento abierto al público cerrado o al aire libre, destinado a la exhibición" 
            +" en público de espectáculos deportivos en cualquiera de sus modalidades, con los requisitos y" 
            +" condiciones que establezca la normativa sectorial específica.";
            mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",400, texto);
            int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (res == 0) {
            frame.getEvento().setTipoLocalCerrado(LocalCerrado.ESPECTACULO_DEPORTIVO);
                pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
                frame.add(pIdentificacionEspectaculo);
                this.setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Para otras opciones vaya a ESTABLECIMIENTOS/ OTRO");
        }
        
    }
}
