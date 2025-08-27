package model;

public class HubModel {

    public String getHtmlSnippet() {
        return """
            <!DOCTYPE html>
            <html lang="fr">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Mon Site Exemple</title>
                <link rel="stylesheet" href="style.css">
            </head>
            <body>
                <!-- Navigation -->
                <header>
                    <nav>
                        <ul>
                            <li><a href="#accueil">Accueil</a></li>
                            <li><a href="#services">Services</a></li>
                            <li><a href="#contact">Contact</a></li>
                        </ul>
                    </nav>
                </header>

                <!-- Section Accueil -->
                <section id="accueil">
                    <h1>Bienvenue sur mon site</h1>
                    <p>Ceci est une page de base pour démarrer rapidement un projet.</p>
                </section>

                <!-- Section Services -->
                <section id="services">
                    <h2>Nos Services</h2>
                    <h3>Développement</h3>
                    <p>Création d’applications web et mobiles.</p>
                    <h3>Design</h3>
                    <p>UI/UX moderne et accessible.</p>
                </section>

                <!-- Section Contact -->
                <section id="contact">
                    <h2>Contact</h2>
                    <form>
                        <label for="name">Nom :</label>
                        <input type="text" id="name" name="name" required>

                        <label for="email">Email :</label>
                        <input type="email" id="email" name="email" required>

                        <button type="submit">Envoyer</button>
                    </form>
                </section>

                <!-- Footer -->
                <footer>
                    <p>&copy; 2025 - Mon Site Exemple</p>
                </footer>
            </body>
            </html>
            """;
    }

    public String getCssSnippet() {
        return """
            /* Reset rapide */
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }

            body {
                font-family: Arial, sans-serif;
                line-height: 1.6;
                background-color: #f4f4f9;
                color: #333;
            }

            /* Navigation */
            nav {
                background: #333;
                padding: 10px 0;
            }
            nav ul {
                display: flex;
                justify-content: center;
                list-style: none;
            }
            nav ul li {
                margin: 0 15px;
            }
            nav ul li a {
                color: white;
                text-decoration: none;
                font-weight: bold;
            }
            nav ul li a:hover {
                color: #ff9800;
            }

            /* Titres */
            h1 {
                font-size: 2.5em;
                margin: 20px 0;
                text-align: center;
                color: #222;
            }
            h2 {
                font-size: 2em;
                margin: 15px 0;
                color: #444;
            }
            h3, h4 {
                font-size: 1.5em;
                margin: 10px 0;
                color: #555;
            }

            /* Sections */
            section {
                padding: 40px 20px;
                max-width: 900px;
                margin: auto;
            }

            /* Formulaire */
            form {
                display: flex;
                flex-direction: column;
                max-width: 400px;
                margin: auto;
            }
            input, button {
                padding: 10px;
                margin: 10px 0;
                border: 1px solid #ccc;
                border-radius: 5px;
            }
            button {
                background: #333;
                color: white;
                cursor: pointer;
            }
            button:hover {
                background: #555;
            }

            /* Footer */
            footer {
                text-align: center;
                padding: 20px;
                background: #333;
                color: white;
                margin-top: 40px;
            }

            /* Responsive */
            @media (max-width: 600px) {
                nav ul {
                    flex-direction: column;
                }
                h1 {
                    font-size: 2em;
                }
            }
            """;
    }

    public String getJavaMainSnippet() {
        return """
            public class Main {
                public static void main(String[] args) {
                    javax.swing.SwingUtilities.invokeLater(() -> {
                        HubModel model = new HubModel();
                        HubView view = new HubView();
                        new HubController(view, model);
                        view.setVisible(true);
                    });
                }
            }
            """;
    }

    public String getJavaControllerSnippet() {
        return """
            import javax.swing.*;
            
            public class HubController {
                private HubView view;
                private HubModel model;

                public HubController(HubView view, HubModel model) {
                    this.view = view;
                    this.model = model;

                    // Exemple : bouton HTML
                    view.getHtmlButton().addActionListener(e ->
                        JOptionPane.showMessageDialog(view, "Bouton HTML cliqué !"));

                    // Exemple : bouton CSS
                    view.getCssButton().addActionListener(e ->
                        JOptionPane.showMessageDialog(view, "Bouton CSS cliqué !"));

                    // Exemple : bouton pour changer le titre
                    view.getJavaButton().addActionListener(e ->
                        view.setTitle("Fenêtre Java Swing !"));
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
                private JButton cssButton = new JButton("CSS");
                private JButton javaButton = new JButton("Java");

                public HubView() {
                    setTitle("Hub de modèles");
                    setSize(600, 400);
                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                    setLocationRelativeTo(null);

                    // Layout principal
                    setLayout(new BorderLayout());

                    // --- Barre de menu ---
                    JMenuBar menuBar = new JMenuBar();
                    JMenu fileMenu = new JMenu("Fichier");
                    JMenuItem exitItem = new JMenuItem("Quitter");
                    fileMenu.add(exitItem);
                    menuBar.add(fileMenu);
                    setJMenuBar(menuBar);

                    // --- Panel central ---
                    JPanel centerPanel = new JPanel();
                    centerPanel.setLayout(new FlowLayout());
                    centerPanel.add(htmlButton);
                    centerPanel.add(cssButton);
                    centerPanel.add(javaButton);

                    add(centerPanel, BorderLayout.CENTER);
                }

                public JButton getHtmlButton() { return htmlButton; }
                public JButton getCssButton() { return cssButton; }
                public JButton getJavaButton() { return javaButton; }
            }
            """;
    }

    public String getJavaModelSnippet() {
        return """
            public class HubModel {
                private String message = "Ceci est un exemple de modèle Swing.";

                public String getMessage() {
                    return message;
                }

                public void setMessage(String message) {
                    this.message = message;
                }
            }
            """;
    }

}
