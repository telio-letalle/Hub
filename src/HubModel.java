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
                <!-- Menu de navigation -->
                <nav>
                  <ul>
                    <li><a href="#">Accueil</a></li>
                    <li><a href="#">À propos</a></li>
                    <li><a href="#">Contact</a></li>
                  </ul>
                </nav>

                <!-- En-tête -->
                <header>
                  <h1>Bienvenue sur mon site</h1>
                  <p>Un petit texte d’introduction sympa.</p>
                </header>

                <!-- Contenu principal -->
                <main>
                  <section>
                    <h2>Section principale</h2>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                  </section>

                  <section>
                    <h3>Sous-section</h3>
                    <p>Du contenu supplémentaire avec un <a href="#">lien</a>.</p>
                  </section>
                </main>

                <!-- Pied de page -->
                <footer>
                  <p>&copy; 2025 - Mon premier site</p>
                </footer>
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
                padding: 0;
                line-height: 1.6;
            }

            a {
                color: #0066cc;
                text-decoration: none;
            }

            a:hover {
                text-decoration: underline;
            }

            /* Menu de navigation */
            nav {
                background: #333;
                padding: 10px 20px;
            }

            nav ul {
                list-style: none;
                margin: 0;
                padding: 0;
                display: flex;
                gap: 20px;
            }

            nav a {
                color: white;
                font-weight: bold;
            }

            nav a:hover {
                color: #ffcc00;
            }

            /* En-tête */
            header {
                text-align: center;
                padding: 50px 20px;
                background: #f4f4f4;
            }

            header h1 {
                font-size: 2.5em;
                margin-bottom: 10px;
            }

            header p {
                font-size: 1.2em;
                color: #666;
            }

            /* Sections */
            main {
                padding: 20px;
                max-width: 900px;
                margin: auto;
            }

            h2 {
                margin-top: 30px;
                border-bottom: 2px solid #ddd;
                padding-bottom: 5px;
            }

            h3 {
                margin-top: 20px;
                color: #444;
            }

            /* Footer */
            footer {
                text-align: center;
                padding: 15px;
                background: #333;
                color: white;
                margin-top: 40px;
            }
            """;
    }

    public String getJavaMainSnippet() {
        return """
                public class Main {
                    public static void main(String[] args) {
                        javax.swing.SwingUtilities.invokeLater(() -> {
                            HubView view = new HubView();
                            HubModel model = new HubModel();
                            new HubController(view, model);
                            view.setVisible(true);
                        });
                    }
                }
                """;
    }

    public String getJavaControllerSnippet() {
        return """
                public class HubController {
                    private HubView view;
                    private HubModel model;

                    public HubController(HubView view, HubModel model) {
                        this.view = view;
                        this.model = model;

                        // Exemple : action sur un bouton
                        view.getHtmlButton().addActionListener(e ->
                            System.out.println("Bouton HTML cliqué"));
                    }
                }
                """;
    }

    public String getJavaViewSnippet() {
        return """
                import javax.swing.*;
                import java.awt.*;

                public class HubView extends JFrame {
                    private JButton htmlButton = new JButton("HTML");

                    public HubView() {
                        setTitle("Hub de modèles");
                        setSize(400, 200);
                        setDefaultCloseOperation(EXIT_ON_CLOSE);
                        setLocationRelativeTo(null);
                        setLayout(new FlowLayout());
                        add(htmlButton);
                    }

                    public JButton getHtmlButton() {
                        return htmlButton;
                    }
                }
                """;
    }

    public String getJavaModelSnippet() {
        return """
                public class HubModel {
                    public String getMessage() {
                        return "Ceci est un exemple de modèle.";
                    }
                }
                """;
    }
}
