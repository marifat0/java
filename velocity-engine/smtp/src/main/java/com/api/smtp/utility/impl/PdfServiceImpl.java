package com.api.smtp.utility.impl;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.springframework.stereotype.Component;

import com.api.smtp.utility.PdfService;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

@Component
public class PdfServiceImpl implements PdfService {
    public String generatePdfWithAnImage(String htmlPath, String imagePath) {
        // Create a PDF with an image
        InputStream stream = null;
        Image img = null;

        String basePath = "src/main/resources";
        String destinationPath = basePath + "Attachment.pdf";


        try {
            stream = new ByteArrayInputStream(htmlPath.getBytes("UTF-8"));
            img = Image.getInstance(imagePath);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(destinationPath));
            document.open();

            img.scaleToFit(500, 500);
            // img.setAbsolutePosition(50, 700);

            document.add(img);

            XMLWorkerHelper.getInstance().parseXHtml(writer, document, stream);

            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return destinationPath;
    }
}
