package com.example.devops_app;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Yeah! CI/CD Pipeline Running 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "UP";
    }

    @GetMapping("/version")
    public String version() {
        return "Version 1.0";
    }

    // NEW PAGE
    @GetMapping("/profile")
    public String profile() {
        return """
        <!DOCTYPE html>
        <html>
        <head>
            <title>Komal Joshi - DevOps Assignment</title>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    background: linear-gradient(135deg, #667eea, #764ba2);
                    color: white;
                    text-align: center;
                    padding: 50px;
                }
                .card {
                    background: rgba(255,255,255,0.1);
                    padding: 30px;
                    border-radius: 15px;
                    box-shadow: 0 8px 20px rgba(0,0,0,0.3);
                    max-width: 500px;
                    margin: auto;
                }
                h1 {
                    font-size: 32px;
                    margin-bottom: 10px;
                }
                p {
                    font-size: 18px;
                    margin: 8px 0;
                }
                .highlight {
                    font-weight: bold;
                    color: #ffd700;
                }
            </style>
        </head>
        <body>
            <div class="card">
                <h1>Komal Joshi</h1>
                <p class="highlight">Registration No: 12300550</p>
                <p>DevOps Assignment Project</p>
                <p>Lovely Professional University</p>
                <hr>
                <p>🚀 CI/CD Pipeline Successfully Implemented</p>
                <p>Using Jenkins, Docker & GitHub Webhooks</p>
            </div>
        </body>
        </html>
        """;
    }
}