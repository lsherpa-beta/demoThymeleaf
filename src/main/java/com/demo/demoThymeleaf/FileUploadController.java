package com.demo.demoThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

@Controller
public class FileUploadController {

    @GetMapping("/")
    public String showUploadPage() {
        return "upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
        try {
            String content = new BufferedReader(
                    new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8))
                    .lines()
                    .collect(Collectors.joining("\n"));

            model.addAttribute("fileName", file.getOriginalFilename());
            model.addAttribute("fileContent", content);
            return "result";
        } catch (Exception e) {
            model.addAttribute("message", "Failed to read file: " + e.getMessage());
            return "upload";
        }
    }
}
