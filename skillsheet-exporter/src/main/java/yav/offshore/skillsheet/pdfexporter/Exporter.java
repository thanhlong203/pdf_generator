package yav.offshore.skillsheet.pdfexporter;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.JRLoader;
import org.castor.util.concurrent.ConcurrentHashMap;

import java.io.File;
import java.util.Map;

/**
 * Created by Dev ThanhPN on 4/17/2018.
 */
public class Exporter {
    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        dumpPdf();
        System.out.println("quit");
    }

    protected static File dumpPdf() throws Exception {
        Map<String, Object> params = new ConcurrentHashMap();
        params.put("p1", "顧客コード");
        String templatePath = "E:\\skillsheet-exporter\\src\\main\\resources\\report1.jasper";
        String path = "E:\\skillsheet-exporter\\src\\main\\resources\\report1.pdf";
        final JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(templatePath);
        final JasperPrint jp = JasperFillManager.fillReport(jr, params, new JREmptyDataSource());
        JasperExportManager.exportReportToPdfFile(jp, path);
        return new File(path);
    }
}
