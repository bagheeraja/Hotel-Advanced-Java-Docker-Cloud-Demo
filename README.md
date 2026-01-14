# Hotel – Advanced Java Docker & Cloud Demo

This project extends the Landon Hotel scheduling sample application. It adds multithreaded localization features, internationalized UI elements, Docker-based packaging, and a deployment plan for Azure cloud services.

## Project goals

- Demonstrate **multithreading** and **localization** in a Spring Boot + Angular application.
- Enhance the UI for international guests with bilingual greetings, multi-currency pricing, and multi–time zone messaging.
- Package the Java back end into a Docker image and outline deployment steps to Azure Container Apps.

## Key features

### Multithreaded localization

- Java resource bundles `language_en.properties` and `language_ca.properties` store English and French welcome messages required for Canadian deployments.
- `WelcomeService` and `WelcomeController` start separate threads to retrieve localized greetings and expose them via REST endpoints.
- The Angular `app.component.ts` calls these endpoints and displays both English and French welcome messages on the home page.

### Internationalized UI

- Room cards show prices in **USD, CAD, and EUR** on separate lines for each available room.
- A `TimeZoneConvert` utility and `TimeZoneConvertController` compute and serve the time of a live online presentation across **ET, MT, and UTC**, which the Angular component renders near the top of the page.

## Docker & cloud deployment

- A `Dockerfile` builds a single image that includes the packaged Spring Boot application.
- The `D387_Deploy_to_Cloud.pdf` guide documents how to:
  - Package the app with Maven.
  - Build and tag the Docker image.
  - Push it to Docker Hub.
  - Deploy the image to **Azure Container Apps**, configure ingress, and expose port 8080.

## Tech stack

- **Back end:** Java, Spring Boot, Spring MVC  
- **Front end:** Angular  
- **Build & packaging:** Maven, Docker  
- **Cloud target:** Azure Container Apps (via Docker Hub image)

## Running locally (high level)

1. Build the Spring Boot application with Maven to create the JAR file in `target/`.
2. Build the Docker image:
   ```bash
   docker build -t landon-hotel-d387 .
