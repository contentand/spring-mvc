package com.dy.spring.view;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class FirstExcelView extends AbstractXlsView {

    @Override
    protected void buildExcelDocument(Map<String, Object> model,
                                      Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        Sheet sheet = workbook.createSheet("My new sheet");
        Row titleRow = sheet.createRow(2);
        Cell titleCell = titleRow.createCell(2);
        titleCell.setCellValue((String) model.get("title"));
        Cell textCell = titleRow.createCell(4);
        textCell.setCellValue((String) model.get("text"));

    }
}
