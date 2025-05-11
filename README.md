# Architecture Microservices avec Spring Boot

Ce projet est une démonstration d'une architecture microservices complète utilisant Spring Boot, Spring Cloud, et Netflix Eureka.

## 🏗️ Architecture

Le projet est composé des services suivants :

- **Config Server** (Port 8888)

  - Service centralisé de configuration
  - Gère les configurations pour tous les microservices

- **Eureka Server** (Port 8000)

  - Service de découverte
  - Registre central des services

- **API Gateway** (Port 5555)

  - Point d'entrée unique pour tous les clients
  - Gestion du routage et de la sécurité

- **Bookshelf Service**

  - Gestion des étagères de livres
  - Exemple de microservice métier

- **Book Service**

  - Gestion des livres
  - Exemple de microservice métier

- **Config Value Service**
  - Service de démonstration pour la configuration

## 🚀 Prérequis

- Java 17 ou supérieur
- Maven 3.6 ou supérieur
- IDE (IntelliJ IDEA, Eclipse, VS Code)

## 🛠️ Installation

1. Cloner le repository :

```bash
git clone [URL_DU_REPO]
```

2. Pour chaque service, installer les dépendances :

```bash
cd nom-du-service
mvn clean install
```

## 🏁 Démarrage

L'ordre de démarrage est important. Ouvrez un terminal pour chaque service :

1. Config Server :

```bash
cd configserver
mvn spring-boot:run
```

2. Eureka Server :

```bash
cd eureka
mvn spring-boot:run
```

3. API Gateway :

```bash
cd gateway
mvn spring-boot:run
```

4. Autres services (dans des terminaux séparés) :

```bash
cd bookshelf
mvn spring-boot:run

cd book
mvn spring-boot:run

cd configvalue
mvn spring-boot:run
```

## 📊 Monitoring

- Eureka Dashboard : http://localhost:8000
- Gateway : http://localhost:5555
- Config Server : http://localhost:8888

## 🏗️ Structure du Projet

```
microservices/
├── configserver/     # Service de configuration
├── eureka/          # Service de découverte
├── gateway/         # API Gateway
├── bookshelf/       # Service de gestion des étagères
├── book/            # Service de gestion des livres
└── configvalue/     # Service de démonstration
```

## 🔧 Configuration

Chaque service possède son propre fichier `application.properties` avec des configurations spécifiques. Les configurations communes sont gérées par le Config Server.

## 📝 Notes Importantes

- Chaque service doit être démarré dans un terminal séparé
- L'ordre de démarrage est crucial :
  1. Config Server en premier
  2. Eureka Server en second
  3. Gateway ensuite
  4. Autres services en dernier
- Attendre que chaque service soit complètement démarré avant de lancer le suivant
- Vérifier les logs pour s'assurer qu'il n'y a pas d'erreurs
