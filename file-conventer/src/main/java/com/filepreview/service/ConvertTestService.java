package com.filepreview.service;

import com.filepreview.conventer.OfficeFileConventer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * added by  xuren
 * test office to pdf
 */
@Service
public class ConvertTestService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private OfficeFileConventer officeFileConventer;

    public void convertOffice(String inputFile,String outputFile){
        officeFileConventer.conventerToPdfTest(inputFile,outputFile);
    }

    public void convertOfficeXlsx(String inputFile,String outputFile){
        officeFileConventer.conventerToHtmlTest(inputFile, outputFile);
    }

}



