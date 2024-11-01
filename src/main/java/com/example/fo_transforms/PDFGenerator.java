package com.example.fo_transforms;

import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.MimeConstants;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class PDFGenerator {

    public void generatePDF() {
        try {
            // Определите пути к XML и FO файлам
            File xmlFile = new File("src/main/resources/xml/source.xml");
            File foFile = new File("src/main/resources/fo/transform.fo");
            File pdfFile = new File("src/main/output/sportsmen.pdf");

            // Настройка FOP
            FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
            FOUserAgent foUserAgent = fopFactory.newFOUserAgent();

            try (OutputStream out = new FileOutputStream(pdfFile)) {
                Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);

                // Настройка трансформации
                TransformerFactory factory = TransformerFactory.newInstance();
                Transformer transformer = factory.newTransformer(new StreamSource(foFile));

                // transform XML to PDF
                transformer.transform(new StreamSource(xmlFile), new SAXResult(fop.getDefaultHandler()));
                System.out.println("PDF файл успешно создан: " + pdfFile.getPath());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка при создании PDF файла.");
        }
    }

    public static void main(String[] args) {
        new PDFGenerator().generatePDF();
    }
}
