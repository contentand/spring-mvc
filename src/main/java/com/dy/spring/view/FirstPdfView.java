package com.dy.spring.view;

import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.util.Map;

public class FirstPdfView extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> model,
                                    Document document,
                                    PdfWriter writer,
                                    HttpServletRequest request,
                                    HttpServletResponse response) throws Exception {

        String title = (String) model.get("title");
        String text = (String) model.get("text");
        Font font = new Font();
        font.setSize(30);
        font.setColor(Color.CYAN);

        document.add(new Paragraph(title, font));

        document.add(new Paragraph(text));
    }
}
