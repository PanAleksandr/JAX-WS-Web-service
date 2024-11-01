package com.example.transformer;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLToHTMLTransformer {

    public void transformXMLToHTML() {
        try {
            // Задайте пути к файлам
            File xmlFile = new File("src/main/resources/xml/source.xml");
            File xslFile = new File("src/main/resources/xsl/transform.xsl");
            File htmlFile = new File("src/main/output/output.html");

            // Настройка трансформации
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xslFile));

            // Выполнение преобразования XML в HTML
            try (OutputStream out = new FileOutputStream(htmlFile)) {
                transformer.transform(new StreamSource(xmlFile), new StreamResult(out));
                System.out.println("HTML файл успешно создан: " + htmlFile.getPath());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка при создании HTML файла.");
        }
    }

    public static void main(String[] args) {
        new XMLToHTMLTransformer().transformXMLToHTML();
    }
}
