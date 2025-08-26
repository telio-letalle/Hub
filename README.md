# 🧮 PiGame – Java

## 📌 Description

PiGame est une application éducative développée en Java qui propose au joueur de découvrir et mémoriser les décimales du nombre π (pi).
L’objectif est simple : saisir correctement autant de décimales de π que possible, dans l’ordre, sans se tromper.
Ce projet illustre l’usage de l’architecture MVC (Model – View – Controller) et l’interaction entre une logique mathématique et une interface graphique.

---

## 🎮 Fonctionnalités

- Interface graphique intuitive en Java (Swing).
- Validation en temps réel des décimales saisies.
- Comptage automatique du nombre de décimales trouvées.
- Message de fin en cas d’erreur.

---

## 🏗️ Structure du projet
PiGame/

│

├── Main.java              # Point d’entrée du programme

├── PiGameController.java  # Contrôle la logique : vérification des saisies, gestion du score

├── PiGameModel.java       # Contient les données : liste des décimales de π

└── PiGameView.java        # Interface graphique : affichage et saisie utilisateur



👉 Cette séparation respecte le modèle MVC :
- **Model** → stocke les décimales de π et le score du joueur.
- **View** → gère l’affichage et la saisie de l’utilisateur.
- **Controller** → orchestre la vérification et la progression du jeu.

---

## 🚀 Installation & Lancement
### Prérequis

- Java 17+ (ou version compatible).
- Un IDE comme IntelliJ IDEA, Eclipse, ou NetBeans.

### Étapes
1. Clonez le dépôt :  
   ```bash
   git clone https://github.com/ton-compte/PiGame.git


Ouvrez le projet dans votre IDE.

Compilez et exécutez Main.java.

---

## 📷 Aperçu du jeu

<img width="1919" height="1077" alt="image" src="https://github.com/user-attachments/assets/0f170d17-c083-446b-90d7-5b4b94024ef8" />
<img width="1919" height="1077" alt="image" src="https://github.com/user-attachments/assets/27ef0556-7e69-44b3-865a-44e640b0e1cb" />

---

## 🔮 Améliorations possibles

Classement des meilleurs scores (mode compétitif).

Différents niveaux de difficulté (aide visuelle, indices, etc.).

Export des résultats dans un fichier texte ou base de données.

# 👨‍💻 Auteur

Projet développé en Java dans un but d’apprentissage et de mise en pratique de l’architecture MVC, appliquée à un jeu éducatif sur le nombre π.
