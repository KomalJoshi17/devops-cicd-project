package com.example.devops_app;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Yeah! Finally. CI/CD Pipeline Running 🚀";
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
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }

            body {
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                background-color: #f4f6f8;
                height: 100vh;
                display: flex;
                justify-content: center;
                align-items: center;
            }

            .card {
                background: #ffffff;
                padding: 35px;
                border-radius: 12px;
                box-shadow: 0 10px 25px rgba(0, 0, 0, 0.08);
                text-align: center;
                width: 400px;
            }

            h1 {
                font-size: 28px;
                color: #2c3e50;
                margin-bottom: 10px;
            }

            .reg {
                font-size: 16px;
                color: #555;
                margin-bottom: 15px;
            }

            .title {
                font-size: 18px;
                font-weight: 600;
                color: #34495e;
                margin-bottom: 10px;
            }

            .university {
                font-size: 16px;
                color: #666;
                margin-bottom: 20px;
            }

            hr {
                border: none;
                border-top: 1px solid #e0e0e0;
                margin: 20px 0;
            }

            .status {
                font-size: 16px;
                color: #27ae60;
                font-weight: 600;
                margin-bottom: 8px;
            }

            .tech {
                font-size: 14px;
                color: #7f8c8d;
            }
        </style>
    </head>
    <body>
        <div class="card">
            <h1>Komal Joshi</h1>
            <p class="reg">Registration No: 12300550</p>
            <p class="title">DevOps Assignment Project</p>
            <p class="university">Lovely Professional University</p>

            <hr>

            <p class="status">CI/CD Pipeline Successfully Running</p>
            <p class="tech">Jenkins • Docker • GitHub Webhooks</p>
        </div>
    </body>
    </html>
    """;
}
}