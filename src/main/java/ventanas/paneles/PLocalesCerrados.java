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
        grid = new Grid(0, 3, 0, 0, 50, 30, 40);
        this.add(rbTeatro, grid);

        rbAuditorio = new RadioBut("AUDITORIO", 16);
        rbAuditorio.addActionListener(this);
        grid = new Grid(0, 3, 0, 0, 450, 30, 40);
        this.add(rbAuditorio, grid);

        rbCirco = new RadioBut("CIRCO", 16);
        rbCirco.addActionListener(this);
        grid = new Grid(1, 3, 2, 0, -300, 30, 40);
        this.add(rbCirco, grid);
        
        rbCine = new RadioBut("CINE", 16);
        rbCine.addActionListener(this);
        grid = new Grid(1, 3, 2, 0, 0, 30, 40);
        this.add(rbCine, grid);
        
        rbPlazaToros = new RadioBut("PLAZA DE TOROS", 16);
        rbPlazaToros.addActionListener(this);
        grid = new Grid(0, 4, 0, 0, 120, 30, 40);
        this.add(rbPlazaToros, grid);
        
        rbEspectaculosDeportivos = new RadioBut("ESTABLECIMIENTO ESPECTÁCULOS DEPORTIVOS", 16);
        rbEspectaculosDeportivos.addActionListener(this);
        grid = new Grid(0, 4, 2, 0, 265, 30, 40);
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
        if(e.getSource() == rbTeatro){
            frame.getEvento().setTipoLocalCerrado(LocalCerrado.TEATRO);
            // JOptionPane.showMessageDialog(null, "Local cerrado habilitado como TEATRO");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }else if(e.getSource() == rbAuditorio){
            frame.getEvento().setTipoLocalCerrado(LocalCerrado.AUDITORIO);
            // JOptionPane.showMessageDialog(null, "Local cerrado habilitado como AUDITORIO");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }else if(e.getSource() == rbCirco){
            frame.getEvento().setTipoLocalCerrado(LocalCerrado.CIRCO);
            // JOptionPane.showMessageDialog(null, "Local cerrado habilitado como CIRCO");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }else if(e.getSource() == rbCine){
            frame.getEvento().setTipoLocalCerrado(LocalCerrado.CINE);
            // JOptionPane.showMessageDialog(null, "Local cerrado habilitado como CINE");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }else if(e.getSource() == rbPlazaToros){
            frame.getEvento().setTipoLocalCerrado(LocalCerrado.PLAZA_TOROS);
            // JOptionPane.showMessageDialog(null, "Local cerrado habilitado como PLAZA TOROS");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }else if(e.getSource() == rbEspectaculosDeportivos){
            frame.getEvento().setTipoLocalCerrado(LocalCerrado.ESPECTACULO_DEPORTIVO);
            // JOptionPane.showMessageDialog(null, "Local cerrado habilitado como ESTABLECIMIENTO DE ESPECTÁCULOS DEPORTIVOS");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Para otras opciones vaya a ESTABLECIMIENTOS/ OTRO");
        }
        pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
        frame.add(pIdentificacionEspectaculo);
        this.setVisible(false);
    }
}