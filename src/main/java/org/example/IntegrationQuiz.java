package org.example;

import java.util.Scanner;

public class IntegrationQuiz {

    public IntegrationQuiz (){

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 0;

        // Fråga 1
        totalQuestions++;
        System.out.println("Fråga " + totalQuestions + ": Vad står API för?");
        System.out.println("a) Application Programming Interface");
        System.out.println("b) Advanced Programming Interaction");
        System.out.println("c) Application Program Integration");
        System.out.print("Svar: ");
        String answer1 = scanner.nextLine();
        if (answer1.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) Application Programming Interface'.");
        }

        // Fråga 2
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsaklig skillnad mellan REST och SOAP i API-design?");
        System.out.println("a) REST använder XML, SOAP använder JSON.");
        System.out.println("b) REST använder HTTP-verb som GET, POST och PUT, medan SOAP använder XML och kan använda olika transportprotokoll.");
        System.out.println("c) REST är en version av SOAP.");
        System.out.print("Svar: ");
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) REST använder HTTP-verb som GET, POST och PUT, medan SOAP använder XML och kan använda olika transportprotokoll.'");
        }

        // Fråga 3
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är skillnaden mellan FTP och SFTP?");
        System.out.println("a) FTP är säkert och använder kryptering, medan SFTP är osäker.");
        System.out.println("b) FTP är osäker och använder inte kryptering, medan SFTP använder SSH för säker dataöverföring.");
        System.out.println("c) FTP använder XML, medan SFTP använder JSON.");
        System.out.print("Svar: ");
        String answer3 = scanner.nextLine();
        if (answer3.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) FTP är osäker och använder inte kryptering, medan SFTP använder SSH för säker dataöverföring.'");
        }


        // Fråga 4
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilket integrationsmönster möjliggör realtidsdatadelning mellan flera system?");
        System.out.println("a) Punkt-till-punkt");
        System.out.println("b) Publish-subscribe");
        System.out.println("c) Request-Reply");
        System.out.print("Svar: ");
        String answer4 = scanner.nextLine();
        if (answer4.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Publish-subscribe'.");
        }

// Fråga 5
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är fördelen med löst kopplade system i integration?");
        System.out.println("a) De är enklare att implementera.");
        System.out.println("b) De är mer flexibla och skalbara.");
        System.out.println("c) De har högre prestanda.");
        System.out.print("Svar: ");
        String answer5 = scanner.nextLine();
        if (answer5.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) De är mer flexibla och skalbara'.");
        }

// Fråga 6
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av Apache Kafka?");
        System.out.println("a) Att skicka e-postmeddelanden.");
        System.out.println("b) Att strömma och hantera stora mängder data i realtid.");
        System.out.println("c) Att göra databasförfrågningar.");
        System.out.print("Svar: ");
        String answer6 = scanner.nextLine();
        if (answer6.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att strömma och hantera stora mängder data i realtid'.");
        }

        // Fråga 7
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilken typ av protokoll används vanligtvis för att överföra e-postmeddelanden?");
        System.out.println("a) HTTP");
        System.out.println("b) SMTP");
        System.out.println("c) FTP");
        System.out.print("Svar: ");
        String answer7 = scanner.nextLine();
        if (answer7.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) SMTP'.");
        }

// Fråga 8
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilket meddelandeformat används vanligtvis för att representera data i webb-API:er?");
        System.out.println("a) JSON");
        System.out.println("b) XML");
        System.out.println("c) CSV");
        System.out.print("Svar: ");
        String answer8 = scanner.nextLine();
        if (answer8.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) JSON'.");
        }

// Fråga 9
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av XML?");
        System.out.println("a) Att skapa webbsidor.");
        System.out.println("b) Att representera hierarkiska datastrukturer och konfigurationsfiler.");
        System.out.println("c) Att generera slumpmässiga tal.");
        System.out.print("Svar: ");
        String answer9 = scanner.nextLine();
        if (answer9.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att representera hierarkiska datastrukturer och konfigurationsfiler'.");
        }

        // Fråga 10
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilken typ av datakommunikationsprotokoll används vanligtvis för att överföra filer över nätverk med stöd för kryptering?");
        System.out.println("a) FTP");
        System.out.println("b) HTTP");
        System.out.println("c) SMTP");
        System.out.print("Svar: ");
        String answer10 = scanner.nextLine();
        if (answer10.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) FTP'.");
        }

// Fråga 11
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad innebär begreppet 'event-driven arkitektur'?");
        System.out.println("a) Arkitekturen där alla komponenter är starkt beroende av varandra.");
        System.out.println("b) Arkitekturen där systemet reagerar på händelser eller händelser som inträffar i realtid.");
        System.out.println("c) Arkitekturen där all kommunikation sker genom textbaserade meddelanden.");
        System.out.print("Svar: ");
        String answer11 = scanner.nextLine();
        if (answer11.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Arkitekturen där systemet reagerar på händelser eller händelser som inträffar i realtid'.");
        }

// Fråga 12
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av XML Schema (XSD)?");
        System.out.println("a) Att skapa webbsidor.");
        System.out.println("b) Att beskriva strukturen och datavalidering av XML-dokument.");
        System.out.println("c) Att skapa Java-program.");
        System.out.print("Svar: ");
        String answer12 = scanner.nextLine();
        if (answer12.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att beskriva strukturen och datavalidering av XML-dokument'.");
        }

        // Fråga 13
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av JSON Web Tokens (JWT) inom API-säkerhet?");
        System.out.println("a) Att kryptera hela API-kommunikationen.");
        System.out.println("b) Att autentisera och auktorisera användare i en API.");
        System.out.println("c) Att komprimera JSON-data för snabbare överföring.");
        System.out.print("Svar: ");
        String answer13 = scanner.nextLine();
        if (answer13.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att autentisera och auktorisera användare i en API'.");
        }

// Fråga 14
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av HTTPS i datakommunikation?");
        System.out.println("a) Att skapa statiska webbsidor.");
        System.out.println("b) Att säkra kommunikationen genom kryptering.");
        System.out.println("c) Att hantera databasförfrågningar.");
        System.out.print("Svar: ");
        String answer14 = scanner.nextLine();
        if (answer14.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att säkra kommunikationen genom kryptering'.");
        }

// Fråga 15
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med ett integrationsschema?");
        System.out.println("a) Att beskriva strukturen av en relationsdatabas.");
        System.out.println("b) Att definiera hur data ska transformeras och överföras mellan olika system.");
        System.out.println("c) Att skapa användargränssnitt för webbapplikationer.");
        System.out.print("Svar: ");
        String answer15 = scanner.nextLine();
        if (answer15.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att definiera hur data ska transformeras och överföras mellan olika system'.");
        }


        // Fråga 16
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilken typ av HTTP-verb används vanligtvis för att hämta data från en webb-API?");
        System.out.println("a) GET");
        System.out.println("b) POST");
        System.out.println("c) PUT");
        System.out.print("Svar: ");
        String answer16 = scanner.nextLine();
        if (answer16.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) GET'.");
        }

// Fråga 17
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med en XML Schema Definition (XSD) i XML-dokumentation?");
        System.out.println("a) Att ange vilka element som är tillåtna i ett XML-dokument.");
        System.out.println("b) Att definiera hur data ska presenteras grafiskt.");
        System.out.println("c) Att specificera färger för XML-element.");
        System.out.print("Svar: ");
        String answer17 = scanner.nextLine();
        if (answer17.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) Att ange vilka element som är tillåtna i ett XML-dokument'.");
        }

// Fråga 18
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en API-nyckel (API key) i API-säkerhet?");
        System.out.println("a) Att skapa grafiska användargränssnitt.");
        System.out.println("b) Att autentisera användare genom användarnamn och lösenord.");
        System.out.println("c) Att identifiera och autentisera en applikation gentemot en API.");
        System.out.print("Svar: ");
        String answer18 = scanner.nextLine();
        if (answer18.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att identifiera och autentisera en applikation gentemot en API'.");
        }

        // Fråga 19
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av Web Services Description Language (WSDL) i webbtjänstintegration?");
        System.out.println("a) Att beskriva webbsidor i HTML.");
        System.out.println("b) Att specificera hur webbtjänster kommunicerar med varandra.");
        System.out.println("c) Att definiera färgteman för webbapplikationer.");
        System.out.print("Svar: ");
        String answer19 = scanner.nextLine();
        if (answer19.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att specificera hur webbtjänster kommunicerar med varandra'.");
        }

// Fråga 20
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är fördelen med att använda Asynchronous Messaging i integrationsarkitektur?");
        System.out.println("a) Snabbare överföring av data.");
        System.out.println("b) Minskad komplexitet.");
        System.out.println("c) Förmåga att hantera stora datavolymer och fördröjningar.");
        System.out.print("Svar: ");
        String answer20 = scanner.nextLine();
        if (answer20.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Förmåga att hantera stora datavolymer och fördröjningar'.");
        }

// Fråga 21
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med en ESB (Enterprise Service Bus) i integrationsarkitektur?");
        System.out.println("a) Att överföra e-postmeddelanden mellan företag.");
        System.out.println("b) Att hantera kommunikationen mellan olika applikationer och tjänster.");
        System.out.println("c) Att skapa webbplatser.");
        System.out.print("Svar: ");
        String answer21 = scanner.nextLine();
        if (answer21.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att hantera kommunikationen mellan olika applikationer och tjänster'.");
        }

        // Fråga 22
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av XML-RPC och JSON-RPC i webbapplikationer?");
        System.out.println("a) Att skapa användargränssnitt.");
        System.out.println("b) Att göra fjärranrop (remote procedure calls) över nätverk.");
        System.out.println("c) Att skapa visuella effekter i webbsidor.");
        System.out.print("Svar: ");
        String answer22 = scanner.nextLine();
        if (answer22.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att göra fjärranrop (remote procedure calls) över nätverk'.");
        }

// Fråga 23
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av XML Namespaces i XML-dokument?");
        System.out.println("a) Att specificera färger för text i XML.");
        System.out.println("b) Att undvika användning av XML.");
        System.out.println("c) Att undvika konflikter mellan elementnamn från olika källor.");
        System.out.print("Svar: ");
        String answer23 = scanner.nextLine();
        if (answer23.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att undvika konflikter mellan elementnamn från olika källor'.");
        }

// Fråga 24
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en webhook i API-integration?");
        System.out.println("a) Att skapa API-dokumentation.");
        System.out.println("b) Att skicka e-postmeddelanden.");
        System.out.println("c) Att låta en tjänst reagera på händelser från en annan tjänst.");
        System.out.print("Svar: ");
        String answer24 = scanner.nextLine();
        if (answer24.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att låta en tjänst reagera på händelser från en annan tjänst'.");
        }


        // Fråga 25
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av GraphQL i API-design?");
        System.out.println("a) Att skapa statiska webbsidor.");
        System.out.println("b) Att beskriva och hämta data från en API med flexibla och anpassningsbara frågor.");
        System.out.println("c) Att skicka e-postmeddelanden.");
        System.out.print("Svar: ");
        String answer25 = scanner.nextLine();
        if (answer25.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att beskriva och hämta data från en API med flexibla och anpassningsbara frågor'.");
        }

// Fråga 26
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är skillnaden mellan SQL och NoSQL-databaser?");
        System.out.println("a) SQL-databaser är snabbare än NoSQL-databaser.");
        System.out.println("b) SQL-databaser använder tabeller med en fast struktur, medan NoSQL-databaser är flexiblare och kan använda olika datamodeller.");
        System.out.println("c) SQL-databaser kan inte använda indexering.");
        System.out.print("Svar: ");
        String answer26 = scanner.nextLine();
        if (answer26.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) SQL-databaser använder tabeller med en fast struktur, medan NoSQL-databaser är flexiblare och kan använda olika datamodeller'.");
        }

// Fråga 27
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av WebSocket-protokollet i realtidskommunikation?");
        System.out.println("a) Att skicka e-postmeddelanden.");
        System.out.println("b) Att hämta data från en webbserver.");
        System.out.println("c) Att möjliggöra tvåvägskommunikation i realtid mellan klient och server.");
        System.out.print("Svar: ");
        String answer27 = scanner.nextLine();
        if (answer27.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att möjliggöra tvåvägskommunikation i realtid mellan klient och server'.");
        }


        // Fråga 28
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av RESTful API i webbapplikationer?");
        System.out.println("a) Att skapa användargränssnitt.");
        System.out.println("b) Att definiera datastrukturer i databaser.");
        System.out.println("c) Att tillhandahålla ett gränssnitt för att hämta och manipulera resurser över HTTP.");
        System.out.print("Svar: ");
        String answer28 = scanner.nextLine();
        if (answer28.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att tillhandahålla ett gränssnitt för att hämta och manipulera resurser över HTTP'.");
        }

// Fråga 29
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är fördelen med att använda ETL (Extract, Transform, Load) i datamigrering?");
        System.out.println("a) Att minska datavolymer.");
        System.out.println("b) Att automatisera datatransformation och laddning från en källa till en måldatabas.");
        System.out.println("c) Att eliminera behovet av databaser.");
        System.out.print("Svar: ");
        String answer29 = scanner.nextLine();
        if (answer29.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att automatisera datatransformation och laddning från en källa till en måldatabas'.");
        }

// Fråga 30
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av OAuth i API-autentisering?");
        System.out.println("a) Att kryptera API-data.");
        System.out.println("b) Att autentisera användare med användarnamn och lösenord.");
        System.out.println("c) Att tillåta tredjepartsapplikationer att få åtkomst till användardata utan att dela lösenordet.");
        System.out.print("Svar: ");
        String answer30 = scanner.nextLine();
        if (answer30.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att tillåta tredjepartsapplikationer att få åtkomst till användardata utan att dela lösenordet'.");
        }


        // Fråga 31
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en API Gateway i API-hanteringen?");
        System.out.println("a) Att skicka e-postmeddelanden.");
        System.out.println("b) Att aggregera och hantera flera API-anrop till en enda punkt.");
        System.out.println("c) Att skapa databaser.");
        System.out.print("Svar: ");
        String answer31 = scanner.nextLine();
        if (answer31.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att aggregera och hantera flera API-anrop till en enda punkt'.");
        }

// Fråga 32
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är fördelen med att använda Content Delivery Networks (CDN) i webbapplikationer?");
        System.out.println("a) Att minska antalet användare som kan komma åt webbapplikationen.");
        System.out.println("b) Att öka prestandan genom att distribuera innehåll närmare användarna.");
        System.out.println("c) Att förhindra angrepp mot webbapplikationen.");
        System.out.print("Svar: ");
        String answer32 = scanner.nextLine();
        if (answer32.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att öka prestandan genom att distribuera innehåll närmare användarna'.");
        }

// Fråga 33
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av SOAP-protokollet i webbtjänstintegration?");
        System.out.println("a) Att sända TV-program över internet.");
        System.out.println("b) Att skapa webb-API:er.");
        System.out.println("c) Att definiera standardiserade meddelandestrukturer och protokoll för kommunikation.");
        System.out.print("Svar: ");
        String answer33 = scanner.nextLine();
        if (answer33.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att definiera standardiserade meddelandestrukturer och protokoll för kommunikation'.");
        }

// Fråga 34
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en API-nyckel (API key) i API-säkerhet?");
        System.out.println("a) Att kryptera all data som skickas till och från en API.");
        System.out.println("b) Att autentisera och auktorisera användare.");
        System.out.println("c) Att identifiera och autentisera en applikation gentemot en API.");
        System.out.print("Svar: ");
        String answer34 = scanner.nextLine();
        if (answer34.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att identifiera och autentisera en applikation gentemot en API'.");
        }

// Fråga 35
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av ett meddelandekösystem i integrationsarkitektur?");
        System.out.println("a) Att hantera användarautentisering.");
        System.out.println("b) Att skapa statiska webbsidor.");
        System.out.println("c) Att skicka och ta emot meddelanden mellan olika system med fördröjning.");
        System.out.print("Svar: ");
        String answer35 = scanner.nextLine();
        if (answer35.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att skicka och ta emot meddelanden mellan olika system med fördröjning'.");
        }

// Fråga 36
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en XML-parser i integrationsarkitektur?");
        System.out.println("a) Att skapa grafiska användargränssnitt.");
        System.out.println("b) Att konvertera XML-data till ett användbart format och vice versa.");
        System.out.println("c) Att köra databasförfrågningar.");
        System.out.print("Svar: ");
        String answer36 = scanner.nextLine();
        if (answer36.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att konvertera XML-data till ett användbart format och vice versa'.");
        }

// Fråga 37
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av ett API-schema (API schema) i API-design?");
        System.out.println("a) Att beskriva användargränssnittet för en webbapplikation.");
        System.out.println("b) Att definiera hur data ska överföras och struktureras i en API.");
        System.out.println("c) Att skapa användarprofiler.");
        System.out.print("Svar: ");
        String answer37 = scanner.nextLine();
        if (answer37.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att definiera hur data ska överföras och struktureras i en API'.");
        }

// Fråga 38
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är fördelen med att använda en Reverse Proxy i webbapplikationens arkitektur?");
        System.out.println("a) Att alltid blockera användare från att komma åt webbapplikationen.");
        System.out.println("b) Att öka säkerheten genom att dölja interna systemdetaljer.");
        System.out.println("c) Att visa källkoden för webbapplikationen för alla användare.");
        System.out.print("Svar: ");
        String answer38 = scanner.nextLine();
        if (answer38.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att öka säkerheten genom att dölja interna systemdetaljer'.");
        }

// Fråga 39
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av HTTP-statuskoder i API-kommunikation?");
        System.out.println("a) Att ange färger för webbsidor.");
        System.out.println("b) Att specificera hur data ska struktureras i en JSON-fil.");
        System.out.println("c) Att indikera resultatet av en begäran, till exempel om den lyckades eller misslyckades.");
        System.out.print("Svar: ");
        String answer39 = scanner.nextLine();
        if (answer39.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att indikera resultatet av en begäran, till exempel om den lyckades eller misslyckades'.");
        }

// Fråga 40
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en OAuth 2.0-bärare (Bearer) token i API-autentisering?");
        System.out.println("a) Att skapa användarprofiler.");
        System.out.println("b) Att autentisera användare med användarnamn och lösenord.");
        System.out.println("c) Att auktorisera en användare att få åtkomst till en resurs.");
        System.out.print("Svar: ");
        String answer40 = scanner.nextLine();
        if (answer40.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att auktorisera en användare att få åtkomst till en resurs'.");
        }

        // Fråga 41
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av CORS (Cross-Origin Resource Sharing) i webbutveckling?");
        System.out.println("a) Att kryptera lösenord i databaser.");
        System.out.println("b) Att tillåta eller begränsa resursåtkomst från olika domäner i webbläsaren.");
        System.out.println("c) Att blockera all inkommande trafik till en webbplats.");
        System.out.print("Svar: ");
        String answer41 = scanner.nextLine();
        if (answer41.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att tillåta eller begränsa resursåtkomst från olika domäner i webbläsaren'.");
        }

// Fråga 42
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en serviceorienterad arkitektur (SOA) i systemintegration?");
        System.out.println("a) Att skapa interaktiva webbplatser.");
        System.out.println("b) Att organisera data i en databas.");
        System.out.println("c) Att strukturera och integrera tjänster för att möjliggöra systeminteraktion.");
        System.out.print("Svar: ");
        String answer42 = scanner.nextLine();
        if (answer42.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att strukturera och integrera tjänster för att möjliggöra systeminteraktion'.");
        }

// Fråga 43
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en API-dokumentation i utvecklingen av API:er?");
        System.out.println("a) Att generera lösenord för användare.");
        System.out.println("b) Att definiera vilka användare som har åtkomst till ett API.");
        System.out.println("c) Att beskriva hur man använder och integrerar med ett API.");
        System.out.print("Svar: ");
        String answer43 = scanner.nextLine();
        if (answer43.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att beskriva hur man använder och integrerar med ett API'.");
        }

// Fråga 44
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en webhook i API-integration?");
        System.out.println("a) Att skapa grafiska användargränssnitt.");
        System.out.println("b) Att skicka e-postmeddelanden.");
        System.out.println("c) Att låta en tjänst reagera på händelser från en annan tjänst.");
        System.out.print("Svar: ");
        String answer44 = scanner.nextLine();
        if (answer44.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att låta en tjänst reagera på händelser från en annan tjänst'.");
        }

// Fråga 45
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en SQL-injektion i cyberangrepp?");
        System.out.println("a) Att kryptera data under överföring.");
        System.out.println("b) Att injicera skadlig SQL-kod i en applikation för att kompromettera en databas.");
        System.out.println("c) Att använda en webbläsare för att surfa på internet.");
        System.out.print("Svar: ");
        String answer45 = scanner.nextLine();
        if (answer45.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att injicera skadlig SQL-kod i en applikation för att kompromettera en databas'.");
        }

// Fråga 46
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en HTTP GET-förfrågan i API-kommunikation?");
        System.out.println("a) Att skicka data till en server för lagring.");
        System.out.println("b) Att hämta data från en server.");
        System.out.println("c) Att uppdatera data på en server.");
        System.out.print("Svar: ");
        String answer46 = scanner.nextLine();
        if (answer46.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att hämta data från en server'.");
        }

// Fråga 47
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en FTP (File Transfer Protocol)-server?");
        System.out.println("a) Att spela upp musikfiler.");
        System.out.println("b) Att överföra filer över nätverket.");
        System.out.println("c) Att skapa användarprofiler.");
        System.out.print("Svar: ");
        String answer47 = scanner.nextLine();
        if (answer47.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att överföra filer över nätverket'.");
        }

// Fråga 48
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en SQL JOIN-operation i databashantering?");
        System.out.println("a) Att ta bort data från en tabell.");
        System.out.println("b) Att uppdatera befintlig data i en tabell.");
        System.out.println("c) Att kombinera data från flera tabeller baserat på gemensamma kolumner.");
        System.out.print("Svar: ");
        String answer48 = scanner.nextLine();
        if (answer48.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att kombinera data från flera tabeller baserat på gemensamma kolumner'.");
        }

// Fråga 49
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en DNS (Domain Name System)-server?");
        System.out.println("a) Att lagra användarnamn och lösenord.");
        System.out.println("b) Att översätta webbadresser (URL:er) till IP-adresser.");
        System.out.println("c) Att skicka e-postmeddelanden.");
        System.out.print("Svar: ");
        String answer49 = scanner.nextLine();
        if (answer49.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att översätta webbadresser (URL:er) till IP-adresser'.");
        }

// Fråga 50
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en HTTPS-anslutning i webbapplikationer?");
        System.out.println("a) Att skicka e-postmeddelanden.");
        System.out.println("b) Att säkert överföra data över internet med kryptering.");
        System.out.println("c) Att visa reklam på webbsidor.");
        System.out.print("Svar: ");
        String answer50 = scanner.nextLine();
        if (answer50.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att säkert överföra data över internet med kryptering'.");
        }


        // Visa resultat
        System.out.println("\nDitt resultat: " + score + " av " + totalQuestions + " rätt.");
        scanner.close();

    }

}
