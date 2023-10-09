package org.example;

import java.util.Scanner;

public class IntegrationQuiz {

    public IntegrationQuiz (){

        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 0;
        // Fråga 169
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med 'Controller-klasser' inom webutveckling?");
        System.out.println("a) Att spela gitarr.");
        System.out.println("b) Att hantera användarens inmatning och besluta hur applikationen ska svara på förfrågningar.");
        System.out.println("c) Att lagra data i en databas.");
        System.out.print("Svar: ");
        String answer169 = scanner.nextLine();
        if (answer169.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar kan vara 'b) Att hantera användarens inmatning och besluta hur applikationen ska svara på förfrågningar', men det beror på sammanhanget.");
        }

        // Fråga 170
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en 'Handler' inom webutveckling?");
        System.out.println("a) En person som hanterar pappersdokument.");
        System.out.println("b) En komponent som utför specifika åtgärder för att behandla en förfrågan eller händelse.");
        System.out.println("c) En grafisk designer som skapar användargränssnitt.");
        System.out.print("Svar: ");
        String answer170 = scanner.nextLine();
        if (answer170.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) En komponent som utför specifika åtgärder för att behandla en förfrågan eller händelse'.");
        }

        // Fråga 171
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilket påstående beskriver 'Controller-klasser' inom en MVC-arkitektur (Model-View-Controller)?");
        System.out.println("a) Controller-klasser hanterar en applikations affärslogik och databasinteraktion.");
        System.out.println("b) Controller-klasser är ansvariga för att visa data för användaren.");
        System.out.println("c) Controller-klasser är en del av användargränssnittet och används för att skapa webbsidor.");
        System.out.print("Svar: ");
        String answer171 = scanner.nextLine();
        if (answer171.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar kan vara 'a) Controller-klasser hanterar en applikations affärslogik och databasinteraktion', men det beror på sammanhanget.");
        }

        // Fråga 172
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med en 'Handler' i samband med en webbapplikation?");
        System.out.println("a) Att skapa en lista över användare och deras lösenord.");
        System.out.println("b) Att ta emot förfrågningar från klienter och utföra åtgärder som svarar på dessa förfrågningar.");
        System.out.println("c) Att formatera och layouta webbsidor.");
        System.out.print("Svar: ");
        String answer172 = scanner.nextLine();
        if (answer172.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att ta emot förfrågningar från klienter och utföra åtgärder som svarar på dessa förfrågningar'.");
        }

        // Fråga 173
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en fördel med att använda 'Controller-klasser' och 'Handlers' i en webbapplikation?");
        System.out.println("a) Det gör webbapplikationen långsammare och mindre skalbar.");
        System.out.println("b) Det möjliggör en klar separation av affärslogik och användargränssnitt.");
        System.out.println("c) Det ökar risken för fel och buggar i applikationen.");
        System.out.print("Svar: ");
        String answer173 = scanner.nextLine();
        if (answer173.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar kan vara 'b) Det möjliggör en klar separation av affärslogik och användargränssnitt', men det beror på sammanhanget.");
        }

        // Fråga 174
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en vanlig användning av en 'Handler' inom webutveckling?");
        System.out.println("a) Att skicka e-postmeddelanden.");
        System.out.println("b) Att hantera HTTP-förfrågningar och svara med lämplig data eller åtgärder.");
        System.out.println("c) Att skapa 3D-animerade filmer.");
        System.out.print("Svar: ");
        String answer174 = scanner.nextLine();
        if (answer174.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att hantera HTTP-förfrågningar och svara med lämplig data eller åtgärder'.");
        }
// Fråga 175
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad representerar en 'Entity' inom ramen för databasmodellering?");
        System.out.println("a) En tabell i en databas.");
        System.out.println("b) En uppsättning av funktioner som hanterar databasoperationer.");
        System.out.println("c) En fysisk enhet som lagrar databasinformation.");
        System.out.print("Svar: ");
        String answer175 = scanner.nextLine();
        if (answer175.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar kan vara 'a) En tabell i en databas', men det beror på sammanhanget.");
        }

        // Fråga 176
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med ett 'Repository' i en mjukvaruapplikation?");
        System.out.println("a) Att lagra fysiska kopior av källkoden.");
        System.out.println("b) Att erbjuda en abstraktionsnivå som underlättar åtkomst till data och databasoperationer.");
        System.out.println("c) Att organisera användargränssnittet och layouten.");
        System.out.print("Svar: ");
        String answer176 = scanner.nextLine();
        if (answer176.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar kan vara 'b) Att erbjuda en abstraktionsnivå som underlättar åtkomst till data och databasoperationer', men det beror på sammanhanget.");
        }

        // Fråga 177
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en potentiell fördel med att använda 'Entity' i samband med databasmodellering?");
        System.out.println("a) Det ökar komplexiteten hos databasen.");
        System.out.println("b) Det möjliggör representation av data i form av objekt, vilket kan förenkla utvecklingen.");
        System.out.println("c) Det minskar antalet tabeller i databasen.");
        System.out.print("Svar: ");
        String answer177 = scanner.nextLine();
        if (answer177.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar kan vara 'b) Det möjliggör representation av data i form av objekt, vilket kan förenkla utvecklingen', men det beror på sammanhanget.");
        }

        // Fråga 178
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en typisk funktion hos ett 'Repository' i en mjukvaruapplikation?");
        System.out.println("a) Att rendera grafik och hantera användarens muspekare.");
        System.out.println("b) Att erbjuda metoder för att utföra CRUD-operationer (Create, Read, Update, Delete) på databasen.");
        System.out.println("c) Att spela ljudfiler och video.");
        System.out.print("Svar: ");
        String answer178 = scanner.nextLine();
        if (answer178.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar kan vara 'b) Att erbjuda metoder för att utföra CRUD-operationer (Create, Read, Update, Delete) på databasen', men det beror på sammanhanget.");
        }

        // Fråga 179
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilken av följande påståenden beskriver bäst vad en 'Entity' är inom databasmodellering?");
        System.out.println("a) En extern enhet som används för att lagra backupdata.");
        System.out.println("b) En logisk representation av en datatabell med attribut och relationer.");
        System.out.println("c) En separat enhet som är ansvarig för att hantera nätverkstrafik.");
        System.out.print("Svar: ");
        String answer179 = scanner.nextLine();
        if (answer179.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar kan vara 'b) En logisk representation av en datatabell med attribut och relationer', men det beror på sammanhanget.");
        }

        // Fråga 147
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilket syfte har 'Analys och rapportering' i ett iPaaS-system?");
        System.out.println("a) Att bestämma företagets semesterplan.");
        System.out.println("b) Att samla in och tolka data från olika system för att skapa användbar information.");
        System.out.println("c) Att skapa musikspår.");
        System.out.print("Svar: ");
        String answer147 = scanner.nextLine();
        if (answer147.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att samla in och tolka data från olika system för att skapa användbar information'.");
        }

        // Fråga 148
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med 'API' inom ett iPaaS-system?");
        System.out.println("a) Att skapa en virtuell värld.");
        System.out.println("b) Att erbjuda ett gemensamt gränssnitt för att koppla samman och möjliggöra kommunikation mellan olika system.");
        System.out.println("c) Att baka tårtor.");
        System.out.print("Svar: ");
        String answer148 = scanner.nextLine();
        if (answer148.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att erbjuda ett gemensamt gränssnitt för att koppla samman och möjliggöra kommunikation mellan olika system'.");
        }

        // Fråga 149
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad innebär 'Behörigheter' inom ett iPaaS-system?");
        System.out.println("a) Att välja vilka som får tillgång till företagets fika.");
        System.out.println("b) Att definiera och styra vilka användare som har rättigheter att utföra olika åtgärder i plattformen.");
        System.out.println("c) Att arrangera spelkvällar.");
        System.out.print("Svar: ");
        String answer149 = scanner.nextLine();
        if (answer149.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att definiera och styra vilka användare som har rättigheter att utföra olika åtgärder i plattformen'.");
        }

        // Fråga 150
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad möjliggör en 'Expanderbar plattform' inom ett iPaaS-system?");
        System.out.println("a) Möjligheten att växa blommor.");
        System.out.println("b) Förmågan att enkelt lägga till nya integrationer med flera system för framtida behov.");
        System.out.println("c) Kapaciteten att planera framtida kontorslokaler.");
        System.out.print("Svar: ");
        String answer150 = scanner.nextLine();
        if (answer150.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Förmågan att enkelt lägga till nya integrationer med flera system för framtida behov'.");
        }

        // Fråga 151
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Varför är 'Grafisk översikt över plattformen' en viktig funktion inom ett iPaaS-system?");
        System.out.println("a) För att göra konstverk med datorgrafik.");
        System.out.println("b) För att ge användarna en visuell representation av hur deras system är sammankopplade och fungerar.");
        System.out.println("c) För att styra trafikljus.");
        System.out.print("Svar: ");
        String answer151 = scanner.nextLine();
        if (answer151.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) För att ge användarna en visuell representation av hur deras system är sammankopplade och fungerar'.");
        }

        // Fråga 152
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad innebär 'Informationsfilter' inom ett iPaaS-system?");
        System.out.println("a) Att rensa bort onödig information.");
        System.out.println("b) Att välja vilken del av informationen från ett system som ska vidare till ett annat system.");
        System.out.println("c) Att skapa ett filter för kaffe.");
        System.out.print("Svar: ");
        String answer152 = scanner.nextLine();
        if (answer152.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att välja vilken del av informationen från ett system som ska vidare till ett annat system'.");
        }

        // Fråga 153
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med 'Kontinuerlig informationskontroll' inom ett iPaaS-system?");
        System.out.println("a) Att övervaka vädret kontinuerligt.");
        System.out.println("b) Att kontrollera och övervaka informationen som skickas mellan olika system för att minska fel.");
        System.out.println("c) Att övervaka trafik i staden.");
        System.out.print("Svar: ");
        String answer153 = scanner.nextLine();
        if (answer153.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att kontrollera och övervaka informationen som skickas mellan olika system för att minska fel'.");
        }

        // Fråga 154
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med 'Portal för utveckling' inom ett iPaaS-system?");
        System.out.println("a) Att bygga portaler till fantasy-världar.");
        System.out.println("b) Att erbjuda utvecklare tillgång till en plattform där tidigare förändringar dokumenteras och nyckelinformation delas.");
        System.out.println("c) Att skapa en portal för telefonsamtal.");
        System.out.print("Svar: ");
        String answer154 = scanner.nextLine();
        if (answer154.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att erbjuda utvecklare tillgång till en plattform där tidigare förändringar dokumenteras och nyckelinformation delas'.");
        }


// Fråga 131
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med ZooKeeper inom en Kafka-miljö?");
        System.out.println("a) Att övervaka serverns prestanda.");
        System.out.println("b) Att organisera och hantera metadata om Kafka-brokarna.");
        System.out.println("c) Att administrera användarbehörigheter.");
        System.out.print("Svar: ");
        String answer131 = scanner.nextLine();
        if (answer131.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att organisera och hantera metadata om Kafka-brokarna'.");
        }

        // Fråga 132
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en zNode i ZooKeeper?");
        System.out.println("a) En sorts nätverkskabel.");
        System.out.println("b) En abstrakt representation av en nod som kan innehålla data eller information om andra noder.");
        System.out.println("c) En zebra i en djurpark.");
        System.out.print("Svar: ");
        String answer132 = scanner.nextLine();
        if (answer132.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) En abstrakt representation av en nod som kan innehålla data eller information om andra noder'.");
        }

        // Fråga 133
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilket av följande användningsområden är vanligt för ZooKeeper?");
        System.out.println("a) Att baka kakor.");
        System.out.println("b) Att hantera distribuerade system och koordinera processer.");
        System.out.println("c) Att skapa webbplatser.");
        System.out.print("Svar: ");
        String answer133 = scanner.nextLine();
        if (answer133.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att hantera distribuerade system och koordinera processer'.");
        }

        // Fråga 134
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad innebär begreppet 'Analys och rapportering' inom iPaaS?");
        System.out.println("a) Möjligheten att skapa snygga diagram.");
        System.out.println("b) Förmågan att samla in och analysera data från olika system och generera rapporter.");
        System.out.println("c) Att kontrollera användares åtkomst till systemet.");
        System.out.print("Svar: ");
        String answer134 = scanner.nextLine();
        if (answer134.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Förmågan att samla in och analysera data från olika system och generera rapporter'.");
        }

        // Fråga 135
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Varför är 'Grafisk översikt över plattformen' en viktig funktion inom iPaaS?");
        System.out.println("a) För att rita fina bilder.");
        System.out.println("b) För att ge användare en visuell representation av hur deras system är sammankopplade.");
        System.out.println("c) För att spara pengar.");
        System.out.print("Svar: ");
        String answer135 = scanner.nextLine();
        if (answer135.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) För att ge användare en visuell representation av hur deras system är sammankopplade'.");
        }

        // Fråga 136
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad möjliggör 'Schemalagda aktiviteter' inom iPaaS?");
        System.out.println("a) Att spela in schemalagda TV-program.");
        System.out.println("b) Möjligheten att schemalägga transformationer eller dataöverföringar vid specifika tider.");
        System.out.println("c) Att skapa en kalender för företagsevenemang.");
        System.out.print("Svar: ");
        String answer136 = scanner.nextLine();
        if (answer136.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Möjligheten att schemalägga transformationer eller dataöverföringar vid specifika tider'.");
        }

        // Fråga 137
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med replikor inom iPaaS?");
        System.out.println("a) Att skapa backupkopior av användardata.");
        System.out.println("b) Att garantera hög tillförlitlighet och felsäkerhet.");
        System.out.println("c) Att distribuera datan till flera consumers.");
        System.out.print("Svar: ");
        String answer137 = scanner.nextLine();
        if (answer137.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att garantera hög tillförlitlighet och felsäkerhet'.");
        }

        // Fråga 138
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med en Consumergroup inom iPaaS?");
        System.out.println("a) Att fördela reklam till olika målgrupper.");
        System.out.println("b) Att fördela dataflödet mellan consumers och säkerställa att data endast behandlas en gång.");
        System.out.println("c) Att analysera användarbeteenden på webbplatser.");
        System.out.print("Svar: ");
        String answer138 = scanner.nextLine();
        if (answer138.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att fördela dataflödet mellan consumers och säkerställa att data endast behandlas en gång'.");
        }

        // Fråga 139
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med Zookeeper inom iPaaS?");
        System.out.println("a) Att underhålla en djurpark.");
        System.out.println("b) Att organisera och identifiera mäklarna i Kafka-klustret.");
        System.out.println("c) Att övervaka trafikljus.");
        System.out.print("Svar: ");
        String answer139 = scanner.nextLine();
        if (answer139.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att organisera och identifiera mäklarna i Kafka-klustret'.");
        }

        // Fråga 71
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad står förkortningen 'API' för inom datavetenskap och programutveckling?");
        System.out.println("a) Application Programming Interface");
        System.out.println("b) Advanced Programming Instruction");
        System.out.println("c) Automated Protocol Integration");
        System.out.print("Svar: ");
        String answer71 = scanner.nextLine();
        if (answer71.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) Application Programming Interface'.");
        }

// Fråga 72
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med en RESTful API (Representational State Transfer) i webbtjänster?");
        System.out.println("a) Att lagra användardata.");
        System.out.println("b) Att möjliggöra kommunikation och datautbyte mellan olika system över HTTP-protokollet.");
        System.out.println("c) Att skapa webbplatser med interaktiva användargränssnitt.");
        System.out.print("Svar: ");
        String answer72 = scanner.nextLine();
        if (answer72.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att möjliggöra kommunikation och datautbyte mellan olika system över HTTP-protokollet'.");
        }

// Fråga 73
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilken HTTP-metod används vanligtvis för att hämta data från en server via en RESTful API?");
        System.out.println("a) POST");
        System.out.println("b) GET");
        System.out.println("c) PUT");
        System.out.print("Svar: ");
        String answer73 = scanner.nextLine();
        if (answer73.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) GET'.");
        }

        FTP:

// Fråga 74
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad står förkortningen 'FTP' för inom datavetenskap och nätverkskommunikation?");
        System.out.println("a) File Transfer Protocol");
        System.out.println("b) Fast Text Processing");
        System.out.println("c) File Tracking Platform");
        System.out.print("Svar: ");
        String answer74 = scanner.nextLine();
        if (answer74.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) File Transfer Protocol'.");
        }

// Fråga 75
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilket syfte tjänar FTP (File Transfer Protocol) främst inom nätverkskommunikation?");
        System.out.println("a) Att spela upp musikfiler.");
        System.out.println("b) Att överföra filer över ett nätverk.");
        System.out.println("c) Att hantera e-postmeddelanden.");
        System.out.print("Svar: ");
        String answer75 = scanner.nextLine();
        if (answer75.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att överföra filer över ett nätverk'.");
        }

// Fråga 76
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilket portnummer används vanligtvis för FTP (File Transfer Protocol) över TCP?");
        System.out.println("a) Port 80");
        System.out.println("b) Port 21");
        System.out.println("c) Port 443");
        System.out.print("Svar: ");
        String answer76 = scanner.nextLine();
        if (answer76.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Port 21'.");
        }

        SFTP:

// Fråga 77
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad står förkortningen 'SFTP' för inom nätverkskommunikation?");
        System.out.println("a) Secure File Transfer Protocol");
        System.out.println("b) Simple Text Formatting Protocol");
        System.out.println("c) Server File Tracking Platform");
        System.out.print("Svar: ");
        String answer77 = scanner.nextLine();
        if (answer77.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) Secure File Transfer Protocol'.");
        }

// Fråga 78
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudskillnaden mellan FTP och SFTP?");
        System.out.println("a) FTP använder UDP (User Datagram Protocol), medan SFTP använder TCP (Transmission Control Protocol).");
        System.out.println("b) SFTP är en säker version av FTP som krypterar dataöverföring.");
        System.out.println("c) FTP kan använda alla portnummer, medan SFTP är begränsad till port 22.");
        System.out.print("Svar: ");
        String answer78 = scanner.nextLine();
        if (answer78.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) SFTP är en säker version av FTP som krypterar dataöverföring'.");
        }

// Fråga 79
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilket protokoll används vanligtvis för att säkerställa krypterad kommunikation i SFTP?");
        System.out.println("a) HTTP");
        System.out.println("b) SSL/TLS");
        System.out.println("c) SMTP");
        System.out.print("Svar: ");
        String answer79 = scanner.nextLine();
        if (answer79.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) SSL/TLS'.");
        }

// Fråga 80
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en typisk användning av SFTP i en organisation eller på en server?");
        System.out.println("a) Att lagra användares lösenord.");
        System.out.println("b) Att säkert överföra filer och data över nätverk.");
        System.out.println("c) Att skapa webbplatser med dynamiskt innehåll.");
        System.out.print("Svar: ");
        String answer80 = scanner.nextLine();
        if (answer80.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att säkert överföra filer och data över nätverk'.");
        }

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

        // Fråga 81
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad kallas integration utan plattform, där systemen interagerar direkt med varandra?");
        System.out.println("a) API");
        System.out.println("b) Peer to peer (P2P)");
        System.out.println("c) REST");
        System.out.print("Svar: ");
        String answer81 = scanner.nextLine();
        if (answer81.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Peer to peer (P2P)'.");
        }

        // Fråga 82
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en nackdel med integration utan plattform?");
        System.out.println("a) Bättre insyn i integrationen.");
        System.out.println("b) Återanvändbara lösningar.");
        System.out.println("c) Varje lösning blir individuell och skapar dålig insyn i integrationen.");
        System.out.print("Svar: ");
        String answer82 = scanner.nextLine();
        if (answer82.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Varje lösning blir individuell och skapar dålig insyn i integrationen'.");
        }

        // Fråga 83
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en plattform inom integration känd som?");
        System.out.println("a) Systemintegration");
        System.out.println("b) Peer to peer (P2P)");
        System.out.println("c) P2P");
        System.out.print("Svar: ");
        String answer83 = scanner.nextLine();
        if (answer83.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) Systemintegration'.");
        }

        // Fråga 84
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är fördelen med integration med plattform?");
        System.out.println("a) Skapar en blackbox-upplevelse.");
        System.out.println("b) Återanvändning av lösningar.");
        System.out.println("c) Ökar beroendet av en specifik lösning.");
        System.out.print("Svar: ");
        String answer84 = scanner.nextLine();
        if (answer84.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Återanvändning av lösningar'.");
        }

        // Fråga 85
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad ingår vanligtvis i en integrationsplattform?");
        System.out.println("a) Endast Producers och Consumers.");
        System.out.println("b) Producers, Consumers, och Topics.");
        System.out.println("c) Endast Topics.");
        System.out.print("Svar: ");
        String answer85 = scanner.nextLine();
        if (answer85.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Producers, Consumers, och Topics'.");
        }

        // Fråga 86
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad möjliggör en integrationsplattform utöver datautbyte?");
        System.out.println("a) Felhantering och loggning.");
        System.out.println("b) Filöverföringar via FTP.");
        System.out.println("c) Schemalagda aktiviteter.");
        System.out.print("Svar: ");
        String answer86 = scanner.nextLine();
        if (answer86.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) Felhantering och loggning'.");
        }

        // Fråga 87
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med en iPaaS (Integration Platform as a Service)?");
        System.out.println("a) Att skapa molnbaserade applikationer.");
        System.out.println("b) Att möjliggöra integration mellan olika system.");
        System.out.println("c) Att erbjuda datatransformationstjänster.");
        System.out.print("Svar: ");
        String answer87 = scanner.nextLine();
        if (answer87.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att möjliggöra integration mellan olika system'.");
        }

        // Fråga 88
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är relevant att överväga när man väljer ett iPaaS-system?");
        System.out.println("a) Vilka system kräver integration och hur de kommunicerar.");
        System.out.println("b) Plattformens nuvarande popularitet.");
        System.out.println("c) Systemens ålder.");
        System.out.print("Svar: ");
        String answer88 = scanner.nextLine();
        if (answer88.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) Vilka system kräver integration och hur de kommunicerar'.");
        }

        // Fråga 89
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilken funktion används för att samla in och analysera data från olika system i en integrationsplattform?");
        System.out.println("a) API");
        System.out.println("b) Analys och rapportering.");
        System.out.println("c) Behörigheter.");
        System.out.print("Svar: ");
        String answer89 = scanner.nextLine();
        if (answer89.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Analys och rapportering'.");
        }

        // Fråga 90
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilken typ av integration använder API:er för att koppla samman system och appar?");
        System.out.println("a) Dataintegration.");
        System.out.println("b) Mobilintegration.");
        System.out.println("c) Systemintegration.");
        System.out.print("Svar: ");
        String answer90 = scanner.nextLine();
        if (answer90.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Systemintegration'.");
        }

        // Fråga 91
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad används EDIFACT för inom företag och organisationer?");
        System.out.println("a) Att skapa webbplatser.");
        System.out.println("b) För att hantera e-postmeddelanden.");
        System.out.println("c) För datautbyte i beställningar, fakturor och leveranser.");
        System.out.print("Svar: ");
        String answer91 = scanner.nextLine();
        if (answer91.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) För datautbyte i beställningar, fakturor och leveranser'.");
        }

        // Fråga 92
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är JSON (JavaScript Object Notation)?");
        System.out.println("a) Ett datatransformationsspråk.");
        System.out.println("b) Ett filöverföringsprotokoll.");
        System.out.println("c) Ett självbeskrivande dataformat.");
        System.out.print("Svar: ");
        String answer92 = scanner.nextLine();
        if (answer92.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Ett självbeskrivande dataformat'.");
        }

        // Fråga 93
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är Kafka?");
        System.out.println("a) En integrationsplattform.");
        System.out.println("b) Ett distributionsverktyg med brokers.");
        System.out.println("c) En databashanterare.");
        System.out.print("Svar: ");
        String answer93 = scanner.nextLine();
        if (answer93.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Ett distributionsverktyg med brokers'.");
        }

        // Fråga 94
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är Consumergroups inom Kafka?");
        System.out.println("a) Grupper av konsumenter som delar samma kaffe.");
        System.out.println("b) Grupper av consumers som arbetar tillsammans under en eller flera topics.");
        System.out.println("c) Grupper av producenter som samarbetar för att producera data.");
        System.out.print("Svar: ");
        String answer94 = scanner.nextLine();
        if (answer94.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Grupper av consumers som arbetar tillsammans under en eller flera topics'.");
        }


        // Fråga 95
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med en FTP (File Transfer Protocol)?");
        System.out.println("a) Att skapa dynamiska webbplatser.");
        System.out.println("b) Att möjliggöra överföring av filer mellan servrar och system.");
        System.out.println("c) Att hantera användares lösenord.");
        System.out.print("Svar: ");
        String answer95 = scanner.nextLine();
        if (answer95.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att möjliggöra överföring av filer mellan servrar och system'.");
        }

        // Fråga 96
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med en SFTP (Secure File Transfer Protocol)?");
        System.out.println("a) Att skapa dynamiska webbplatser.");
        System.out.println("b) Att möjliggöra säker överföring av filer via krypterad kommunikation.");
        System.out.println("c) Att hantera användares lösenord.");
        System.out.print("Svar: ");
        String answer96 = scanner.nextLine();
        if (answer96.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att möjliggöra säker överföring av filer via krypterad kommunikation'.");
        }

        // Fråga 97
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är TCP (Transmission Control Protocol) användbart för?");
        System.out.println("a) Att erbjuda enkelt och snabbt datautbyte.");
        System.out.println("b) Att säkerställa tillförlitlig och ordnad dataöverföring med flödeskontroll.");
        System.out.println("c) Att hantera osorterad dataöverföring.");
        System.out.print("Svar: ");
        String answer97 = scanner.nextLine();
        if (answer97.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att säkerställa tillförlitlig och ordnad dataöverföring med flödeskontroll'.");
        }

        // Fråga 98
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": När är det lämpligt att använda UDP (User Datagram Protocol)?");
        System.out.println("a) När hastigheten är viktigare än pålitligheten.");
        System.out.println("b) När nätverkskvaliteten är varierande.");
        System.out.println("c) För större filer där pålitligheten är viktigare än hastigheten.");
        System.out.print("Svar: ");
        String answer98 = scanner.nextLine();
        if (answer98.equalsIgnoreCase("a")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'a) När hastigheten är viktigare än pålitligheten'.");
        }

        // Fråga 99
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med att använda Consumergroups inom Kafka?");
        System.out.println("a) Att skapa backupkopior av data.");
        System.out.println("b) Att dela på dataflödet mellan consumers och säkerställa att data bara blir läst av en consumer i gruppen.");
        System.out.println("c) Att skapa flera topics för att lagra data.");
        System.out.print("Svar: ");
        String answer99 = scanner.nextLine();
        if (answer99.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att dela på dataflödet mellan consumers och säkerställa att data bara blir läst av en consumer i gruppen'.");
        }

        // Fråga 100
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad används API:er inom integrationsplattformar för att göra?");
        System.out.println("a) Hantera användares lösenord.");
        System.out.println("b) Koppla samman system och appar och möjliggöra kommunikation och datautbyte mellan dem.");
        System.out.println("c) Skapa dynamiska webbplatser.");
        System.out.print("Svar: ");
        String answer100 = scanner.nextLine();
        if (answer100.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Koppla samman system och appar och möjliggöra kommunikation och datautbyte mellan dem'.");
        }

        // Fråga 101
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med en iPaaS (Integration Platform as a Service)?");
        System.out.println("a) Att hantera interna e-postmeddelanden.");
        System.out.println("b) Att erbjuda en plattform för att automatisera processer över flera olika system och möjliggöra integration.");
        System.out.println("c) Att skapa dynamiska webbplatser.");
        System.out.print("Svar: ");
        String answer101 = scanner.nextLine();
        if (answer101.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att erbjuda en plattform för att automatisera processer över flera olika system och möjliggöra integration'.");
        }

        // Fråga 102
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är viktigt att beakta när man väljer ett iPaaS-system?");
        System.out.println("a) Mängden lediga servrar i närmaste datacenter.");
        System.out.println("b) Plattformens förmåga att erbjuda ready-made integrationer mot populära system.");
        System.out.println("c) Vilka språk som används för att skapa webbplatser.");
        System.out.print("Svar: ");
        String answer102 = scanner.nextLine();
        if (answer102.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Plattformens förmåga att erbjuda ready-made integrationer mot populära system'.");
        }

        // Fråga 103
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en funktion hos ett iPaaS-system?");
        System.out.println("a) Att spara och organisera lösenord.");
        System.out.println("b) Att kunna expanderas till flera system för framtida planering.");
        System.out.println("c) Att kontinuerligt kontrollera hur många användare som använder systemet.");
        System.out.print("Svar: ");
        String answer103 = scanner.nextLine();
        if (answer103.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att kunna expanderas till flera system för framtida planering'.");
        }

        // Fråga 104
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad används Xpath för inom XML-filer?");
        System.out.println("a) Att skapa HTML-dokument.");
        System.out.println("b) Att navigera och söka i XML-filer.");
        System.out.println("c) Att skapa Java-program.");
        System.out.print("Svar: ");
        String answer104 = scanner.nextLine();
        if (answer104.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att navigera och söka i XML-filer'.");
        }

        // Fråga 105
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med att använda XSLT inom XML?");
        System.out.println("a) Att skapa HTML-dokument.");
        System.out.println("b) Att omvandla data från XML-format till andra format.");
        System.out.println("c) Att skapa JavaScript-kod.");
        System.out.print("Svar: ");
        String answer105 = scanner.nextLine();
        if (answer105.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att omvandla data från XML-format till andra format'.");
        }

        // Fråga 106
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med EDIFACT inom företag och organisationer?");
        System.out.println("a) Att hantera sociala medier.");
        System.out.println("b) Att strukturera data för statistisk analys.");
        System.out.println("c) Att möjliggöra standardiserat datautbyte för beställningar, fakturor och leveranser.");
        System.out.print("Svar: ");
        String answer106 = scanner.nextLine();
        if (answer106.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att möjliggöra standardiserat datautbyte för beställningar, fakturor och leveranser'.");
        }

        // Fråga 107
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med Kafka som distributionsverktyg?");
        System.out.println("a) Att skapa dynamiska webbplatser.");
        System.out.println("b) Att distribuera meddelanden och kommunicera mellan producenter och consumers.");
        System.out.println("c) Att hantera användares lösenord.");
        System.out.print("Svar: ");
        String answer107 = scanner.nextLine();
        if (answer107.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att distribuera meddelanden och kommunicera mellan producenter och consumers'.");
        }

        // Fråga 108
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en fördel med att använda replikor inom Kafka?");
        System.out.println("a) Att minska datalagringen.");
        System.out.println("b) Att garantera hög tillförlitlighet, felsäkerhet och skalbarhet.");
        System.out.println("c) Att minska behovet av consumers.");
        System.out.print("Svar: ");
        String answer108 = scanner.nextLine();
        if (answer108.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att garantera hög tillförlitlighet, felsäkerhet och skalbarhet'.");
        }

        // Fråga 109
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med Consumergroups inom Kafka?");
        System.out.println("a) Att skapa backupkopior av data.");
        System.out.println("b) Att fördela dataflödet mellan consumers och säkerställa att data bara blir läst av en consumer i gruppen.");
        System.out.println("c) Att skapa flera producentgrupper.");
        System.out.print("Svar: ");
        String answer109 = scanner.nextLine();
        if (answer109.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att fördela dataflödet mellan consumers och säkerställa att data bara blir läst av en consumer i gruppen'.");
        }

        // Fråga 111
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är skillnaden mellan TCP och UDP som överföringsprotokoll?");
        System.out.println("a) TCP är snabbare än UDP.");
        System.out.println("b) TCP garanterar ordnad dataöverföring medan UDP inte gör det.");
        System.out.println("c) UDP används enbart för filöverföring.");
        System.out.print("Svar: ");
        String answer111 = scanner.nextLine();
        if (answer111.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) TCP garanterar ordnad dataöverföring medan UDP inte gör det'.");
        }

        // Fråga 112
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": När är det lämpligt att använda TCP som överföringsprotokoll?");
        System.out.println("a) När hastigheten är viktigare än pålitligheten.");
        System.out.println("b) För små filer där förlorade paket inte är avgörande.");
        System.out.println("c) När filen är kritisk och varje del måste komma fram i rätt ordning.");
        System.out.print("Svar: ");
        String answer112 = scanner.nextLine();
        if (answer112.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) När filen är kritisk och varje del måste komma fram i rätt ordning'.");
        }

        // Fråga 113
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med Kafka's Zookeeper-server inom ett Kafka-kluster?");
        System.out.println("a) Att skapa en säkerhetskopia av datan.");
        System.out.println("b) Att organisera och identifiera mäklarna i klustret.");
        System.out.println("c) Att hantera användares lösenord.");
        System.out.print("Svar: ");
        String answer113 = scanner.nextLine();
        if (answer113.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att organisera och identifiera mäklarna i klustret'.");
        }

        // Fråga 114
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en ConsumerGroup inom Kafka?");
        System.out.println("a) En grupp konsumenter som endast jobbar med försäljning.");
        System.out.println("b) Flera consumers som jobbar tillsammans under en topic eller flera topics.");
        System.out.println("c) En grupp av servrar som hanterar datalagring.");
        System.out.print("Svar: ");
        String answer114 = scanner.nextLine();
        if (answer114.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Flera consumers som jobbar tillsammans under en topic eller flera topics'.");
        }

        // Fråga 115
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med offsets inom Kafka?");
        System.out.println("a) Att skapa en kopia av data.");
        System.out.println("b) Att hålla reda på det senaste lästa meddelandet i varje partition.");
        System.out.println("c) Att distribuera meddelanden inom klustret.");
        System.out.print("Svar: ");
        String answer115 = scanner.nextLine();
        if (answer115.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att hålla reda på det senaste lästa meddelandet i varje partition'.");
        }

        // Fråga 116
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad används replikor till inom Kafka?");
        System.out.println("a) Att skapa backupkopior av Kafka-servern.");
        System.out.println("b) Att garantera hög tillförlitlighet och felsäkerhet.");
        System.out.println("c) Att kontrollera flödet av meddelanden.");
        System.out.print("Svar: ");
        String answer116 = scanner.nextLine();
        if (answer116.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att garantera hög tillförlitlighet och felsäkerhet'.");
        }

        // Fråga 117
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med Topics inom Kafka?");
        System.out.println("a) Att gruppera meddelanden baserat på deras storlek.");
        System.out.println("b) Att organisera Kafka-mäklare i klustret.");
        System.out.println("c) Att låta Kafka-servern veta vilken data som kommer från vilken källa och vart den ska skickas.");
        System.out.print("Svar: ");
        String answer117 = scanner.nextLine();
        if (answer117.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att låta Kafka-servern veta vilken data som kommer från vilken källa och vart den ska skickas'.");
        }

        // Fråga 118
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad används SFTP för inom integrationsplattformar?");
        System.out.println("a) Att skicka filer över nätverket utan någon form av säkerhet.");
        System.out.println("b) Att möjliggöra överföring av filer på ett säkert sätt via krypterad kommunikation.");
        System.out.println("c) Att spela upp ljudfiler i realtid.");
        System.out.print("Svar: ");
        String answer118 = scanner.nextLine();
        if (answer118.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att möjliggöra överföring av filer på ett säkert sätt via krypterad kommunikation'.");
        }

        // Fråga 119
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad används Xpath för när det gäller XML-filer?");
        System.out.println("a) Att omvandla XML-filer till JSON-format.");
        System.out.println("b) Att navigera och söka i XML-filer.");
        System.out.println("c) Att skapa hierarkiska strukturer i XML.");
        System.out.print("Svar: ");
        String answer119 = scanner.nextLine();
        if (answer119.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att navigera och söka i XML-filer'.");
        }

        // Fråga 120
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad används XSLT för inom XML?");
        System.out.println("a) Att konvertera XML-filer till binär data.");
        System.out.println("b) Att omvandla hämtad data från XML-format till ett annat format, som HTML eller XHTML.");
        System.out.println("c) Att kryptera XML-filer.");
        System.out.print("Svar: ");
        String answer120 = scanner.nextLine();
        if (answer120.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att omvandla hämtad data från XML-format till ett annat format, som HTML eller XHTML'.");
        }


        // Fråga 121
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med FTP (File Transfer Protocol) inom integrationsplattformar?");
        System.out.println("a) Att skapa krypterade tunnelnätverk.");
        System.out.println("b) Att automatisera processen att flytta eller hantera filer mellan olika platser.");
        System.out.println("c) Att skicka e-postmeddelanden över nätverket.");
        System.out.print("Svar: ");
        String answer121 = scanner.nextLine();
        if (answer121.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att automatisera processen att flytta eller hantera filer mellan olika platser'.");
        }

        // Fråga 122
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är huvudsyftet med SFTP (Secure File Transfer Protocol) inom integrationsplattformar?");
        System.out.println("a) Att göra filöverföringar med hög hastighet.");
        System.out.println("b) Att möjliggöra överföring av filer på ett säkert sätt via krypterad kommunikation.");
        System.out.println("c) Att övervaka nätverkstrafik.");
        System.out.print("Svar: ");
        String answer122 = scanner.nextLine();
        if (answer122.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att möjliggöra överföring av filer på ett säkert sätt via krypterad kommunikation'.");
        }

        // Fråga 123
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vilken typ av datautbyte används EDIFACT för inom företag och organisationer?");
        System.out.println("a) Streaming av videofiler.");
        System.out.println("b) Beställningar, fakturor, leveranser och handelsrelaterade ärenden.");
        System.out.println("c) Sociala medier inlägg.");
        System.out.print("Svar: ");
        String answer123 = scanner.nextLine();
        if (answer123.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Beställningar, fakturor, leveranser och handelsrelaterade ärenden'.");
        }

        // Fråga 124
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är JSON (JavaScript Object Notation)?");
        System.out.println("a) En avancerad programmeringsspråk.");
        System.out.println("b) Ett självbeskrivande format som används för datautbyte.");
        System.out.println("c) En webbläsare.");
        System.out.print("Svar: ");
        String answer124 = scanner.nextLine();
        if (answer124.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Ett självbeskrivande format som används för datautbyte'.");
        }

        // Fråga 125
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är Kafka?");
        System.out.println("a) En typ av kaffe.");
        System.out.println("b) Ett webbhotellföretag.");
        System.out.println("c) Ett distributionsverktyg med ett kluster av minst 3 mäklare.");
        System.out.print("Svar: ");
        String answer125 = scanner.nextLine();
        if (answer125.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Ett distributionsverktyg med ett kluster av minst 3 mäklare'.");
        }

        // Fråga 126
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad används Topics till inom Kafka?");
        System.out.println("a) Att organisera kategorier av användare på en webbplats.");
        System.out.println("b) Att organisera Kafka-mäklare i klustret.");
        System.out.println("c) Att låta Kafka-servern veta vilken data som kommer från vilken källa och vart den ska skickas.");
        System.out.print("Svar: ");
        String answer126 = scanner.nextLine();
        if (answer126.equalsIgnoreCase("c")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'c) Att låta Kafka-servern veta vilken data som kommer från vilken källa och vart den ska skickas'.");
        }

        // Fråga 127
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är en Offset inom Kafka?");
        System.out.println("a) En kaka med choklad.");
        System.out.println("b) En läsposition som används för att hålla reda på det senaste lästa meddelandet i varje partition.");
        System.out.println("c) En kopia av datan.");
        System.out.print("Svar: ");
        String answer127 = scanner.nextLine();
        if (answer127.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) En läsposition som används för att hålla reda på det senaste lästa meddelandet i varje partition'.");
        }

        // Fråga 128
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med replikor inom Kafka?");
        System.out.println("a) Att skapa backupkopior av användardata.");
        System.out.println("b) Att garantera hög tillförlitlighet och felsäkerhet.");
        System.out.println("c) Att distribuera datan till flera consumers.");
        System.out.print("Svar: ");
        String answer128 = scanner.nextLine();
        if (answer128.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att garantera hög tillförlitlighet och felsäkerhet'.");
        }

        // Fråga 129
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med en Consumergroup inom Kafka?");
        System.out.println("a) Att fördela reklam till olika målgrupper.");
        System.out.println("b) Att fördela dataflödet mellan consumers och säkerställa att data endast behandlas en gång.");
        System.out.println("c) Att analysera användarbeteenden på webbplatser.");
        System.out.print("Svar: ");
        String answer129 = scanner.nextLine();
        if (answer129.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att fördela dataflödet mellan consumers och säkerställa att data endast behandlas en gång'.");
        }

        // Fråga 130
        totalQuestions++;
        System.out.println("\nFråga " + totalQuestions + ": Vad är syftet med Zookeeper inom Kafka?");
        System.out.println("a) Att underhålla en djurpark.");
        System.out.println("b) Att organisera och identifiera mäklarna i Kafka-klustret.");
        System.out.println("c) Att övervaka trafikljus.");
        System.out.print("Svar: ");
        String answer130 = scanner.nextLine();
        if (answer130.equalsIgnoreCase("b")) {
            System.out.println("Rätt svar!");
            score++;
        } else {
            System.out.println("Fel svar. Rätt svar är 'b) Att organisera och identifiera mäklarna i Kafka-klustret'.");
        }

        // Visa resultat
        System.out.println("\nDitt resultat: " + score + " av " + totalQuestions + " rätt.");
        scanner.close();

    }

}
