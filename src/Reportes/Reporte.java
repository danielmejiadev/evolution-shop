package Reportes;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

public class Reporte 
{
    public static void abrirReporte(String ruta, Map parametros,String titulo) {
        if(Persistencia.conectar())
        {
            try {
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(ruta+".jasper");
                JasperPrint jp = JasperFillManager.fillReport(jr,parametros,Persistencia.con);
                 //JasperViewer.viewReport(jp,false);
                  JasperExportManager.exportReportToPdfFile( jp, ruta + ".pdf");
                  File pdf = new File(ruta + ".pdf");
                  Desktop.getDesktop().open(pdf);
                  pdf.deleteOnExit();
            } catch (JRException | IOException ex) 
            {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                
            }
        }
    }
    
}

