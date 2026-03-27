# 💰 EcoTrack — Personal Finance Android App

> Une application mobile Android pour suivre ses dépenses, gérer ses budgets et visualiser sa santé financière.

---

## 📱 Aperçu

EcoTrack est un projet académique de groupe développé dans le cadre de notre formation en Informatique (spécialisation IA & Big Data). L'application permet à l'utilisateur de saisir ses revenus et dépenses, de définir des objectifs budgétaires par catégorie et de visualiser ses données financières sous forme de graphiques dynamiques.

---

## ✨ Fonctionnalités

- **Gestion des transactions** : Ajout de revenus et dépenses par catégorie (Alimentation, Transport, Études, Loisirs)
- **Tableau de bord (Dashboard)** : Solde total, revenus et dépenses du mois en un coup d'œil
- **Visualisation graphique** : Graphique circulaire (Pie Chart) pour la répartition des dépenses par catégorie
- **Objectifs budgétaires** : Définir un plafond par catégorie avec barre de progression (Vert → Orange → Rouge)
- **Historique** : Liste chronologique avec suppression par glissement (Swipe-to-delete)
- **Exportation** : Génération d'un récapitulatif CSV des dépenses

---

## 🛠️ Stack Technique

| Composant        | Technologie                          |
|------------------|--------------------------------------|
| Langage          | Kotlin                               |
| UI               | Jetpack Compose + Material Design 3  |
| Architecture     | MVVM (Model-View-ViewModel)          |
| Base de données  | Room Database (SQLite local)         |
| Graphiques       | MPAndroidChart                       |
| Navigation       | Navigation Compose                   |
| Injection        | Hilt                                 |
| Design           | Figma                                |
| Versioning       | Git & GitHub                         |
| Communication    | Slack (intégration GitHub)           |

---

## 🏗️ Architecture du Projet

Le projet suit l'architecture **MVVM avec Clean Architecture** :

```
com.ecotrack.app/
├── data/                    # Couche de persistance
│   ├── local/               # Room (Entity, DAO, AppDatabase)
│   ├── repository/          # Implémentation des repositories
│   └── mapper/              # Conversion Entity ↔ Model
├── domain/                  # Logique métier pure
│   ├── model/               # Modèles de données (POJO Kotlin)
│   ├── repository/          # Interfaces (contrats)
│   └── usecase/             # Cas d'utilisation
├── ui/                      # Couche de présentation
│   ├── screens/
│   │   ├── home/            # HomeScreen + HomeViewModel
│   │   ├── add/             # AddTransactionScreen + AddViewModel
│   │   └── stats/           # StatsScreen + StatsViewModel
│   ├── components/          # Composants réutilisables
│   └── theme/               # Color, Type, Theme (Material 3)
├── di/                      # Injection de dépendances (Hilt)
└── util/                    # Classes utilitaires
```

---

## 🚀 Installation & Lancement

### Prérequis

- Android Studio (dernière version stable)
- JDK 17+
- Android SDK API 24+ (Android 7.0 minimum)
- Un émulateur ou un téléphone Android physique

### Étapes

```bash
# 1. Cloner le dépôt
git clone https://github.com/[nom-organisation]/EcoTrack.git

# 2. Ouvrir le projet dans Android Studio
# File → Open → Sélectionner le dossier EcoTrack

# 3. Laisser Gradle synchroniser les dépendances (automatique)

# 4. Lancer l'application
# Cliquer sur le bouton Run ▶ ou Shift+F10
```

---

## 👥 Équipe & Répartition des Rôles

| Membre | Rôle | Responsabilités |
|--------|------|-----------------|
| [Prénom NOM] | Responsable Architecture & Data | Room Database, Repository, ViewModels |
| [Prénom NOM] | Responsable Interface & Design | Jetpack Compose UI, Figma, Thème Material 3 |
| [Prénom NOM] | Responsable Visualisation & Intégration | MPAndroidChart, Navigation, Tests |
| [Prénom NOM] | QA & Documentation | Tests unitaires, README, Manuel utilisateur |

---

## 📅 Roadmap (4 Semaines)

- [x] **Semaine 1** — Infrastructure, Design Figma & Environnement Git
- [ ] **Semaine 2** — UI Layer : Écrans Compose + Navigation + Mock Data
- [ ] **Semaine 3** — Data Layer : Room Database + Repository + ViewModels
- [ ] **Semaine 4** — Visualisation MPAndroidChart + Tests + APK de release

---

## 🔧 Workflow Git

Nous utilisons le **Feature Branch Workflow** :

```bash
# Créer une branche pour chaque fonctionnalité
git checkout -b feat-nom-fonctionnalite

# Commiter avec un message sémantique
git commit -am "feat: Ajout de l'écran de statistiques"

# Récupérer les derniers changements avant de soumettre
git pull origin main

# Pousser sa branche et ouvrir une Pull Request
git push origin feat-nom-fonctionnalite
```

> ⚠️ **Règle d'or** : Personne ne pousse directement sur `main`. Toute fusion nécessite l'approbation d'au moins un autre membre.

---

## 📚 Ressources

- [Jetpack Compose — Documentation officielle](https://developer.android.com/develop/ui/compose)
- [Room Database — Guide complet](https://developer.android.com/training/data-storage/room)
- [Architecture MVVM — Guide officiel](https://developer.android.com/topic/architecture)
- [MPAndroidChart — GitHub](https://github.com/PhilJay/MPAndroidChart)
- [Android Basics with Compose — Cours Google gratuit](https://developer.android.com/courses/android-basics-compose/course)

---

## 📄 Licence

Ce projet est réalisé dans un cadre académique. Tous droits réservés © 2026 — Équipe EcoTrack.
