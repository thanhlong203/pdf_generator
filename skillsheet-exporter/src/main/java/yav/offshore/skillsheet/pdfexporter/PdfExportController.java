package yav.offshore.skillsheet.pdfexporter;

import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.castor.util.concurrent.ConcurrentHashMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

@RestController
public class PdfExportController {
	@RequestMapping("/greeting")
    public Result greeting(@RequestParam(value="name", defaultValue="World") String name) {
		dumpPdf();
		Result r = new Result();
		r.setResponse("xxx");
        return r;
    }
	
	class Result {
		private String response;

		public String getResponse() {
			return response;
		}

		public void setResponse(String response) {
			this.response = response;
		}
		
	}
	
	protected static File dumpPdf() {
		String templatePath = "E:\\skillsheet-exporter\\src\\main\\resources\\report1.jasper";
		String path = "E:\\skillsheet-exporter\\src\\main\\resources\\report1.pdf";
		try {
			Map<String, Object> params = new ConcurrentHashMap();
			params.put("p1", "顧客コード");
			final JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile(templatePath);
			final JasperPrint jp = JasperFillManager.fillReport(jr, params, new JREmptyDataSource());
			JasperExportManager.exportReportToPdfFile(jp, path);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return new File(path);
    }
}
