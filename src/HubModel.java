package model;

public class HubModel {

    public String getHtmlSnippet() {
        return """
                <!DOCTYPE html>
                            <html lang="en">
                            <head>
                            <meta charset="utf-8"/>
                            <meta content="width=device-width, initial-scale=1.0" name="viewport"/>
                            <title>R&amp;T Department - IUT Béziers</title>
                            <link href="snippet.css" rel="stylesheet"/>
                            </head>
                            <body>
                            <header>
                            <div class="top-bar">
                            <div>
                            <span><i class="fas fa-phone"></i> 04 67 11 60 00</span>
                            <span><i class="fas fa-envelope"></i> rt.beziers@iut.fr</span>
                            <span><i class="fas fa-map-marker-alt"></i> 3 place du 14 Juillet, 34500 Béziers</span>
                            </div>
                            <div class="social-icons">
                            <i class="fas fa-book"></i>
                            <i class="fas fa-search"></i>
                            <i class="fab fa-twitter"></i>
                            <i class="fab fa-linkedin"></i>
                            <i class="fab fa-facebook"></i>
                            <i class="fab fa-instagram"></i>
                            </div>
                            </div>
                            <div class="second-bar">
                            <img alt="Logo IUT Béziers" class="logo" src="C:\\Users\\telio\\Downloads\\RT_Promotion_AllStyled\\R&T Department Promotion\\images\\logo-iut.png"/>
                            <nav class="main-nav">
                            <ul>
                            <li><a href="index.html">Formation</a></li>
                            <li><a href="contact.html">Contact</a></li>
                            <li><a href="forum.html">Forum</a></li>
                            </ul>
                            </nav>
                            </div>
                            </header>
                            <main>
                            <section id="formation">
                            <h1>Discover the BUT RT</h1>
                            <section class="highlight-box">
                            <section class="highlight-box"><p>A 3-year hands-on degree in cybersecurity, cloud, and telecom systems. Start building networks and securing data now!</p></section>
                            </section>
                            <h2>🎓 What is the BUT RT?</h2>
                            <section class="highlight-box"><p>The BUT 'Réseaux &amp; Télécommunications' is a 3-year program focused on digital systems, networks, and cybersecurity. It blends theory and hands-on practice. Perfect for tech enthusiasts after high school or during reorientation.</p></section>
                            <h3>🎥 A Day in the Life</h3>
                            <section class="highlight-box"><p>Watch a humorous video created to promote the BUT RT, it describes the entire training in just under 3 minutes.
                                <iframe width="500" height="300" src="https://www.youtube.com/embed/jE5VrJKhZC8?si=arMvBkQTAYvu0OII" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
                            </p></section>
                            <h4>📚 Two Specializations</h4>
                            <ul>
                            <li>Network Infrastructure and System Administration</li>
                            <li>Cybersecurity and Communication Systems</li>
                            </ul>
                            <h2>🛠️ Skills You Will Learn</h2>
                            <section class="highlight-box"><p>You'll learn to manage networks, configure secure systems, create communication infrastructures, and more — all through practical labs and real-world projects.</p></section>
                            <h2>💼 Career Opportunities</h2>
                            <section class="highlight-box"><p>Career paths include network administrator, IT security specialist, telecom engineer. Continue with engineering schools, licenses, or enter the job market directly.</p></section>
                            <h3>💬 Student Testimonials</h3>
                            <section class="highlight-box"><p>“I chose BUT RT because I love technology and solving real problems.” – Clara, 2nd year</p></section>
                            <section class="highlight-box"><p>“My internship in a cybersecurity startup taught me a lot!” – Nathan, 3rd year</p></section>
                            <h3>🌍 International &amp; Projects</h3>
                            <section class="highlight-box"><p>Opportunities for internships abroad and international programs. Final-year students carry out impactful real-world projects.</p></section>
                            </section>
                            </main>
                            </body>
                            </html>
                
            """;
    }

    public String getCssSnippet() {
        return """
                
                      body {
                          margin: 0;
                          font-family: Arial, sans-serif;
                          line-height: 1.6;
                      }
                
                      header .top-bar{
                          background-color: #141547;
                          color: white;
                          display: flex;
                          justify-content: space-between;
                          align-items: center;
                          padding: 8px 20px;
                
                      }
                      header .second-bar {
                          background-color: #141547;
                          color: white;
                          display: flex;
                          justify-content: space-between;
                          align-items: center;
                          padding: 8px 20px;
                      }
                
                      header .second-bar nav {
                          color: white;
                          display: flex;
                          justify-content: space-between;
                          align-items: center;
                          padding: 8px 20px;
                      }
                
                      header .top-bar span {
                          margin-right: 20px;
                          font-size: 0.9rem;
                      }
                
                      header .social-icons i {
                          margin-left: 12px;
                          cursor: pointer;
                      }
                
                      header .second-bar {
                          background-color: #fff;
                          color: #141547;
                          border-bottom: 1px solid #ddd;
                          position: sticky;
                          top: 45px;
                
                      }
                
                      header .second-bar .logo {
                          height: 50px;
                      }
                
                      header .main-nav ul {
                          list-style: none;
                          display: flex;
                          margin: 0;
                          padding: 0;
                      }
                
                      header .main-nav ul li {
                          margin-left: 20px;
                      }
                
                      header .main-nav ul li a {
                          text-decoration: none;
                          color: #141547;
                          font-weight: 600;
                          font-size: 1rem;
                      }
                
                      header .top-bar {
                          position: sticky;
                          top: 0;
                          z-index: 1001;
                      }
                
                      main {
                          padding: 40px 20px;
                          max-width: 1000px;
                          margin: auto;
                      }
                
                      h1 {
                          font-size: 1.8rem;
                          color: #141547;
                          margin-bottom: 10px;
                      }
                
                      h2 {
                          color: #1c1c1c;
                          margin-top: 40px;
                          border-left: 5px solid #0074D9;
                          padding-left: 10px;
                          font-size: 25px;
                      }
                
                      ul {
                          padding-left: 23px;
                          font-size: 18px;
                      }
                
                
                      /* Highlight Box Style */
                      .highlight-box {
                          background: linear-gradient(135deg, #3b82f6, #60a5fa);
                          color: white;
                          padding: 5px;
                          border-radius: 10px;
                          box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
                          margin: 10px 40px;
                          max-width: 600px;
                          text-align: center;
                          font-family: 'Segoe UI', sans-serif;
                          font-size: 13px;
                      }
                
                      .highlight-box h2 {
                          font-size: 1.8em;
                          margin-bottom: 10px;
                      }
                
                      .highlight-box p {
                          font-size: 1.3em;
                          line-height: 1.5;
                      }
                
                      h4 {
                          font-size: 27px;
                          margin-bottom: 10px;
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