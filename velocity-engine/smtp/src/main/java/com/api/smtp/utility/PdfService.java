package com.api.smtp.utility;

import org.springframework.stereotype.Service;

@Service
public interface PdfService {
    public String generatePdfWithAnImage(String htmlPath, String imagePath);
}
