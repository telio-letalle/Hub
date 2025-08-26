package model;

public class HubModel {

    public String getHtmlSnippet() {
        return """
                <!DOCTYPE html>
                <html lang="fr">
                  <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Mon premier site</title>
                    <link rel="stylesheet" href="style.css">
                  </head>
                  <body>
                    <h1>Bienvenue sur mon site</h1>
                    <h2>Une section importante</h2>
                    <p>Ceci est un paragraphe d'exemple avec un peu de texte pour tester le style CSS.</p>
                    
                    <h3>Un sous-titre</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                    
                    <h4>Un petit titre</h4>
                    <p><a href="#">Ceci est un lien d'exemple</a>.</p>
                  </body>
                </html>
                """;
    }

    public String getCssSnippet() {
        return """
                /* Style global */
                body {
                    font-family: Arial, Helvetica, sans-serif;
                    background-color: #fafafa;
                    color: #333;
                    margin: 0;
                    padding: 0 20px;
                    line-height: 1.6;
                }

                a {
                    color: #0066cc;
                    text-decoration: none;
                }

                a:hover {
                    text-decoration: underline;
                }

                /* Titres */
                h1 {
                    font-size: 2.5em;
                    color: #222;
                    text-align: center;
                    margin-top: 40px;
                    margin-bottom: 20px;
                }

                h2 {
                    font-size: 2em;
                    color: #444;
                    margin-top: 30px;
                    margin-bottom: 15px;
                    border-bottom: 2px solid #ddd;
                    padding-bottom: 5px;
                }

                h3 {
                    font-size: 1.5em;
                    color: #555;
                    margin-top: 25px;
                    margin-bottom: 10px;
                }

                h4 {
                    font-size: 1.2em;
                    font-weight: bold;
                    color: #666;
                    margin-top: 20px;
                    margin-bottom: 5px;
                }

                /* Paragraphes */
                p {
                    margin-bottom: 15px;
                }
                """;
    }
}
