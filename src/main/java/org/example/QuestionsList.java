package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionsList {


    public QuestionsList(){

    }
    public List<Question> makeQuestionsList() {
        List<Question> questions = new ArrayList<>();

        // Question 1
        List<Answer> question1Answers = new ArrayList<>();
        question1Answers.add(new Answer("a) Punkt till punkt - integration"));
        question1Answers.add(new Answer("b) Systemintegration"));
        question1Answers.add(new Answer("c) Applikationsintegration"));
        question1Answers.add(new Answer("d) Partnerintegration"));

        // Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question1Answers);
        int question1CorrectAnswer = question1Answers.indexOf(
                question1Answers.stream().filter(answer -> answer.getAnswerText().equals("a) Punkt till punkt - integration")).findFirst().orElse(null)
        );

        Question question1 = new Question("Vad kallas integration utan plattform?", question1Answers, question1CorrectAnswer);
        questions.add(question1);

        // Repeat the process for other questions...

        // Question 2
        List<Answer> question2Answers = new ArrayList<>();
        question2Answers.add(new Answer("a) Integration utan plattform"));
        question2Answers.add(new Answer("b) Systemintegration"));
        question2Answers.add(new Answer("c) Punkt till punkt - integration"));
        question2Answers.add(new Answer("d) Dataintegration"));

        // Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question2Answers);
        int question2CorrectAnswer = question2Answers.indexOf(
                question2Answers.stream().filter(answer -> answer.getAnswerText().equals("b) Systemintegration")).findFirst().orElse(null)
        );

        Question question2 = new Question("Vad kallas integration med plattform?", question2Answers, question2CorrectAnswer);
        questions.add(question2);

        // Question 3
        List<Answer> question3Answers = new ArrayList<>();
        question3Answers.add(new Answer("a) Integration utan plattform"));
        question3Answers.add(new Answer("b) Återanvändning av tjänster och lösningar"));
        question3Answers.add(new Answer("c) Beroende av en specifik lösning"));
        question3Answers.add(new Answer("d) Svår dokumentation av systemet"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question3Answers);
        int question3CorrectAnswer = question3Answers.indexOf(
                question3Answers.stream().filter(answer -> answer.getAnswerText().equals("b) Återanvändning av tjänster och lösningar")).findFirst().orElse(null)
        );

        // Question 4
        List<Answer> question4Answers = new ArrayList<>();
        question4Answers.add(new Answer("a) Analys och rapportering"));
        question4Answers.add(new Answer("b) Expanderbar plattform"));
        question4Answers.add(new Answer("c) Informationsfilter"));
        question4Answers.add(new Answer("d) Schemalagda aktiviteter"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question4Answers);
        int question4CorrectAnswer = question4Answers.indexOf(
                question4Answers.stream().filter(answer -> answer.getAnswerText().equals("b) Expanderbar plattform")).findFirst().orElse(null)
        );

        Question question4 = new Question("Vad är en funktion hos ett iPaaS-system som möjliggör enkel expansion till flera system?", question4Answers, question4CorrectAnswer);
        questions.add(question4);
        // Question 5
        List<Answer> question5Answers = new ArrayList<>();
        question5Answers.add(new Answer("a) Varningssystem"));
        question5Answers.add(new Answer("b) Behörigheter"));
        question5Answers.add(new Answer("c) Grafisk översikt över plattformen"));
        question5Answers.add(new Answer("d) Kontinuerlig informationskontroll"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question5Answers);
        int question5CorrectAnswer = question5Answers.indexOf(
                question5Answers.stream().filter(answer -> answer.getAnswerText().equals("a) Varningssystem")).findFirst().orElse(null)
        );

        Question question5 = new Question("Vad är en funktion hos ett iPaaS-system som ger möjlighet att varna vid misstänkta eller bekräftade fel i systemet?", question5Answers, question5CorrectAnswer);
        questions.add(question5);

        // Question 6
        List<Answer> question6Answers = new ArrayList<>();
        question6Answers.add(new Answer("a) Systemintegration"));
        question6Answers.add(new Answer("b) Applicationsintegration"));
        question6Answers.add(new Answer("c) Dataintegration"));
        question6Answers.add(new Answer("d) PartnerIntegration"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question6Answers);
        int question6CorrectAnswer = question6Answers.indexOf(
                question6Answers.stream().filter(answer -> answer.getAnswerText().equals("b) Applicationsintegration")).findFirst().orElse(null)
        );

        Question question6 = new Question("Vad används API:er för inom applicationsintegration?", question6Answers, question6CorrectAnswer);
        questions.add(question6);


        // Question 7
        List<Answer> question7Answers = new ArrayList<>();
        question7Answers.add(new Answer("a) XML"));
        question7Answers.add(new Answer("b) EDIFACT"));
        question7Answers.add(new Answer("c) JSON"));
        question7Answers.add(new Answer("d) Apache Kafka"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question7Answers);
        int question7CorrectAnswer = question7Answers.indexOf(
                question7Answers.stream().filter(answer -> answer.getAnswerText().equals("c) JSON")).findFirst().orElse(null)
        );

        Question question7 = new Question("Vilket dataformat används ofta inom NoSQL och är självbeskrivande?", question7Answers, question7CorrectAnswer);
        questions.add(question7);

        // Question 8
        List<Answer> question8Answers = new ArrayList<>();
        question8Answers.add(new Answer("a) FTP används för säker filöverföring."));
        question8Answers.add(new Answer("b) FTP används för att överföra stora datamängder."));
        question8Answers.add(new Answer("c) SFTP är en otrygg överföringsmetod."));
        question8Answers.add(new Answer("d) SFTP används för krypterad filöverföring."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question8Answers);
        int question8CorrectAnswer = question8Answers.indexOf(
                question8Answers.stream().filter(answer -> answer.getAnswerText().equals("d) SFTP används för krypterad filöverföring.")).findFirst().orElse(null)
        );

        Question question8 = new Question("Vilket påstående om FTP och SFTP är korrekt?", question8Answers, question8CorrectAnswer);
        questions.add(question8);


        // Question 9
        List<Answer> question9Answers = new ArrayList<>();
        question9Answers.add(new Answer("a) UDP används för pålitlig och ordnad dataöverföring."));
        question9Answers.add(new Answer("b) UDP använder ACK/NACK för dataöverföring."));
        question9Answers.add(new Answer("c) TCP är lämpligt när hastighet är viktigare än pålitlighet."));
        question9Answers.add(new Answer("d) UDP är lämpligt för större filer där pålitligheten är viktigare än hastigheten."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question9Answers);
        int question9CorrectAnswer = question9Answers.indexOf(
                question9Answers.stream().filter(answer -> answer.getAnswerText().equals("c) TCP är lämpligt när hastighet är viktigare än pålitlighet.")).findFirst().orElse(null)
        );

        Question question9 = new Question("Vilket påstående om TCP och UDP är korrekt?", question9Answers, question9CorrectAnswer);
        questions.add(question9);




        // Question 10
        List<Answer> question10Answers = new ArrayList<>();
        question10Answers.add(new Answer("a) En grupp av konsumenter som delar samma groupID."));
        question10Answers.add(new Answer("b) En grupp av producenter som delar samma topic."));
        question10Answers.add(new Answer("c) En grupp av konsumenter som delar samma topic."));
        question10Answers.add(new Answer("d) En grupp av Kafka-brokers som hanterar dataflödet."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question10Answers);
        int question10CorrectAnswer = question10Answers.indexOf(
                question10Answers.stream().filter(answer -> answer.getAnswerText().equals("a) En grupp av konsumenter som delar samma groupID.")).findFirst().orElse(null)
        );

        // Question 11
        List<Answer> question11Answers = new ArrayList<>();
        question11Answers.add(new Answer("a) Enkel återanvändning av lösningar"));
        question11Answers.add(new Answer("b) Skapar en 'blackbox'-upplevelse"));
        question11Answers.add(new Answer("c) Ger god insyn i integrationen"));
        question11Answers.add(new Answer("d) Minskar beroendet till en specifik lösning"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question11Answers);
        int question11CorrectAnswer = question11Answers.indexOf(
                question11Answers.stream().filter(answer -> answer.getAnswerText().equals("b) Skapar en 'blackbox'-upplevelse")).findFirst().orElse(null)
        );

        Question question11 = new Question("Vad är karakteristiskt för P2P-integration (punkt till punkt - integration)?", question11Answers, question11CorrectAnswer);
        questions.add(question11);


        // Question 12
        List<Answer> question12Answers = new ArrayList<>();
        question12Answers.add(new Answer("a) Integrerar externa applikationer och tjänster"));
        question12Answers.add(new Answer("b) Använder API:er för att koppla samman system och appar"));
        question12Answers.add(new Answer("c) Tillåter kommunikation mellan mobilapplikationer och bakomliggande system"));
        question12Answers.add(new Answer("d) Integrerar enheter och sensorer för datainsamling"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question12Answers);
        int question12CorrectAnswer = question12Answers.indexOf(
                question12Answers.stream().filter(answer -> answer.getAnswerText().equals("a) Integrerar externa applikationer och tjänster")).findFirst().orElse(null)
        );

        Question question12 = new Question("Vad används API:er för inom integrationsplattformar?", question12Answers, question12CorrectAnswer);
        questions.add(question12);

// Question 13
        List<Answer> question13Answers = new ArrayList<>();
        question13Answers.add(new Answer("a) Automatiserad filhantering"));
        question13Answers.add(new Answer("b) Säker filöverföring"));
        question13Answers.add(new Answer("c) Analys och rapportering"));
        question13Answers.add(new Answer("d) Grafisk översikt över plattformen"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question13Answers);
        int question13CorrectAnswer = question13Answers.indexOf(
                question13Answers.stream().filter(answer -> answer.getAnswerText().equals("a) Automatiserad filhantering")).findFirst().orElse(null)
        );

        Question question13 = new Question("Vad är syftet med FTP (File Transfer Protocol) inom integrationsplattformar?", question13Answers, question13CorrectAnswer);
        questions.add(question13);

// Question 14
        List<Answer> question14Answers = new ArrayList<>();
        question14Answers.add(new Answer("a) Ger tillförlitlig och ordnad dataöverföring"));
        question14Answers.add(new Answer("b) Fokuserar på snabb förbindelselös överföring"));
        question14Answers.add(new Answer("c) Använder ACK/NACK och flödeskontroll"));
        question14Answers.add(new Answer("d) Hanterar överbelastning i nätverket"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question14Answers);
        int question14CorrectAnswer = question14Answers.indexOf(
                question14Answers.stream().filter(answer -> answer.getAnswerText().equals("a) Ger tillförlitlig och ordnad dataöverföring")).findFirst().orElse(null)
        );

        Question question14 = new Question("Vilket överföringsprotokoll används för att säkerställa ordnad dataöverföring?", question14Answers, question14CorrectAnswer);
        questions.add(question14);

// Question 15
        List<Answer> question15Answers = new ArrayList<>();
        question15Answers.add(new Answer("a) När filen är kritisk och ordningen är viktig."));
        question15Answers.add(new Answer("b) För små filer där förlorade paket är oavgörande."));
        question15Answers.add(new Answer("c) När nätverkskvaliteten är varierande."));
        question15Answers.add(new Answer("d) För större filer där pålitligheten är viktigare än hastigheten."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question15Answers);
        int question15CorrectAnswer = question15Answers.indexOf(
                question15Answers.stream().filter(answer -> answer.getAnswerText().equals("b) För små filer där förlorade paket är oavgörande.")).findFirst().orElse(null)
        );

        Question question15 = new Question("När är det lämpligt att använda UDP (User Datagram Protocol) för filöverföring?", question15Answers, question15CorrectAnswer);
        questions.add(question15);

// Question 16
        List<Answer> question16Answers = new ArrayList<>();
        question16Answers.add(new Answer("a) En grupp av konsumenter som delar samma groupID."));
        question16Answers.add(new Answer("b) En grupp av producenter som delar samma topic."));
        question16Answers.add(new Answer("c) En grupp av konsumenter som delar samma topic."));
        question16Answers.add(new Answer("d) En grupp av Kafka-brokers som hanterar dataflödet."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question16Answers);
        int question16CorrectAnswer = question16Answers.indexOf(
                question16Answers.stream().filter(answer -> answer.getAnswerText().equals("a) En grupp av konsumenter som delar samma groupID.")).findFirst().orElse(null)
        );

        Question question16 = new Question("Vad är en Consumergroup inom Kafka?", question16Answers, question16CorrectAnswer);
        questions.add(question16);

// Question 17
        List<Answer> question17Answers = new ArrayList<>();
        question17Answers.add(new Answer("a) Skapar en \"blackbox\"-upplevelse"));
        question17Answers.add(new Answer("b) Återanvändning av tjänster och lösningar"));
        question17Answers.add(new Answer("c) Svår dokumentation av systemet"));
        question17Answers.add(new Answer("d) Beroende av en specifik lösning"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question17Answers);
        int question17CorrectAnswer = question17Answers.indexOf(
                question17Answers.stream().filter(answer -> answer.getAnswerText().equals("b) Återanvändning av tjänster och lösningar")).findFirst().orElse(null)
        );

        Question question17 = new Question("Vad kännetecknar integration med plattform (systemintegration)?", question17Answers, question17CorrectAnswer);
        questions.add(question17);

// Question 18
        List<Answer> question18Answers = new ArrayList<>();
        question18Answers.add(new Answer("a) XML, JSON, EDIFACT"));
        question18Answers.add(new Answer("b) HTTP, FTP, SMTP"));
        question18Answers.add(new Answer("c) Producers, Consumers, Topics"));
        question18Answers.add(new Answer("d) TCP, UDP, IP"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question18Answers);
        int question18CorrectAnswer = question18Answers.indexOf(
                question18Answers.stream().filter(answer -> answer.getAnswerText().equals("c) Producers, Consumers, Topics")).findFirst().orElse(null)
        );

        Question question18 = new Question("Vad ingår vanligtvis i en integrationsplattform?", question18Answers, question18CorrectAnswer);
        questions.add(question18);

// Question 19
        List<Answer> question19Answers = new ArrayList<>();
        question19Answers.add(new Answer("a) Analys och rapportering"));
        question19Answers.add(new Answer("b) Behörigheter"));
        question19Answers.add(new Answer("c) Expanderbar plattform"));
        question19Answers.add(new Answer("d) Varningssystem"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question19Answers);
        int question19CorrectAnswer = question19Answers.indexOf(
                question19Answers.stream().filter(answer -> answer.getAnswerText().equals("d) Varningssystem")).findFirst().orElse(null)
        );

        Question question19 = new Question("Vilken funktion möjliggör felhantering och loggning i en integrationsplattform?", question19Answers, question19CorrectAnswer);
        questions.add(question19);

// Question 20
        List<Answer> question20Answers = new ArrayList<>();
        question20Answers.add(new Answer("a) Systemintegration"));
        question20Answers.add(new Answer("b) Applicationsintegration"));
        question20Answers.add(new Answer("c) Mobilintegration"));
        question20Answers.add(new Answer("d) LoT-integration"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question20Answers);
        int question20CorrectAnswer = question20Answers.indexOf(
                question20Answers.stream().filter(answer -> answer.getAnswerText().equals("a) Systemintegration")).findFirst().orElse(null)
        );

        Question question20 = new Question("Vad används API:er för inom integrationsplattformar?", question20Answers, question20CorrectAnswer);
        questions.add(question20);

        List<Answer> question21Answers = new ArrayList<>();
        question21Answers.add(new Answer("a) Integrerar externa applikationer och tjänster"));
        question21Answers.add(new Answer("b) Använder API:er för att koppla samman system och appar"));
        question21Answers.add(new Answer("c) Tillåter kommunikation mellan mobilapplikationer och bakomliggande system"));
        question21Answers.add(new Answer("d) Integrerar enheter och sensorer för datainsamling"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question21Answers);
        int question21CorrectAnswer = question21Answers.indexOf(
                question21Answers.stream().filter(answer -> answer.getAnswerText().equals("a) Integrerar externa applikationer och tjänster")).findFirst().orElse(null)
        );

        Question question21 = new Question("Vad används API:er för inom integrationsplattformar?", question21Answers, question21CorrectAnswer);
        questions.add(question21);

// Question 22
        List<Answer> question22Answers = new ArrayList<>();
        question22Answers.add(new Answer("a) Systemintegration"));
        question22Answers.add(new Answer("b) Applicationsintegration"));
        question22Answers.add(new Answer("c) Dataintegration"));
        question22Answers.add(new Answer("d) Partnerintegration"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question22Answers);
        int question22CorrectAnswer = question22Answers.indexOf(
                question22Answers.stream().filter(answer -> answer.getAnswerText().equals("c) Dataintegration")).findFirst().orElse(null)
        );

        Question question22 = new Question("Vad används API:er för inom integrationsplattformar?", question22Answers, question22CorrectAnswer);
        questions.add(question22);

// Question 23
        List<Answer> question23Answers = new ArrayList<>();
        question23Answers.add(new Answer("a) Analys och rapportering"));
        question23Answers.add(new Answer("b) Behörigheter"));
        question23Answers.add(new Answer("c) Expanderbar plattform"));
        question23Answers.add(new Answer("d) Varningssystem"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question23Answers);
        int question23CorrectAnswer = question23Answers.indexOf(
                question23Answers.stream().filter(answer -> answer.getAnswerText().equals("c) Expanderbar plattform")).findFirst().orElse(null)
        );

        Question question23 = new Question("Vilken funktion möjliggör felhantering och loggning i en integrationsplattform?", question23Answers, question23CorrectAnswer);
        questions.add(question23);

// Question 24
        List<Answer> question24Answers = new ArrayList<>();
        question24Answers.add(new Answer("a) Automatiserad filhantering"));
        question24Answers.add(new Answer("b) Säker filöverföring"));
        question24Answers.add(new Answer("c) Analys och rapportering"));
        question24Answers.add(new Answer("d) Grafisk översikt över plattformen"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question24Answers);
        int question24CorrectAnswer = question24Answers.indexOf(
                question24Answers.stream().filter(answer -> answer.getAnswerText().equals("a) Automatiserad filhantering")).findFirst().orElse(null)
        );

        Question question24 = new Question("Vad är syftet med FTP (File Transfer Protocol) inom integrationsplattformar?", question24Answers, question24CorrectAnswer);
        questions.add(question24);

// Question 25
        List<Answer> question25Answers = new ArrayList<>();
        question25Answers.add(new Answer("a) TCP (Transmisson Control Protocol)"));
        question25Answers.add(new Answer("b) UDP (User Datagram Protocol)"));
        question25Answers.add(new Answer("c) HTTP (Hypertext Transfer Protocol)"));
        question25Answers.add(new Answer("d) SMTP (Simple Mail Transfer Protocol)"));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question25Answers);
        int question25CorrectAnswer = question25Answers.indexOf(
                question25Answers.stream().filter(answer -> answer.getAnswerText().equals("a) TCP (Transmisson Control Protocol)")).findFirst().orElse(null)
        );

        Question question25 = new Question("Vilket överföringsprotokoll används för att säkerställa ordnad dataöverföring?", question25Answers, question25CorrectAnswer);
        questions.add(question25);

// Question 26
        List<Answer> question26Answers = new ArrayList<>();
        question26Answers.add(new Answer("a) När filen är kritisk och ordningen är viktig."));
        question26Answers.add(new Answer("b) För små filer där förlorade paket är oavgörande."));
        question26Answers.add(new Answer("c) När nätverkskvaliteten är varierande."));
        question26Answers.add(new Answer("d) För större filer där pålitligheten är viktigare än hastigheten."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question26Answers);
        int question26CorrectAnswer = question26Answers.indexOf(
                question26Answers.stream().filter(answer -> answer.getAnswerText().equals("b) För små filer där förlorade paket är oavgörande.")).findFirst().orElse(null)
        );

        Question question26 = new Question("När är det lämpligt att använda UDP (User Datagram Protocol) för filöverföring?", question26Answers, question26CorrectAnswer);
        questions.add(question26);

// Question 27
        List<Answer> question27Answers = new ArrayList<>();
        question27Answers.add(new Answer("a) En grupp av konsumenter som delar samma groupID."));
        question27Answers.add(new Answer("b) En grupp av producenter som delar samma topic."));
        question27Answers.add(new Answer("c) En grupp av konsumenter som delar samma topic."));
        question27Answers.add(new Answer("d) En grupp av Kafka-brokers som hanterar dataflödet."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question27Answers);
        int question27CorrectAnswer = question27Answers.indexOf(
                question27Answers.stream().filter(answer -> answer.getAnswerText().equals("a) En grupp av konsumenter som delar samma groupID.")).findFirst().orElse(null)
        );

        Question question27 = new Question("Vad är en Consumergroup inom Kafka?", question27Answers, question27CorrectAnswer);
        questions.add(question27);

// Question 28
        List<Answer> question28Answers = new ArrayList<>();
        question28Answers.add(new Answer("a) Handshaking för att etablera en förbindelse"));
        question28Answers.add(new Answer("b) Pålitlig överföring med ACK (Acknowledge) och NACK (Not Acknowledge)."));
        question28Answers.add(new Answer("c) Flödeskontroll för att hantera dataflödet"));
        question28Answers.add(new Answer("d) Kongestionshantering för att underlätta överbelastning i nätverket."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question28Answers);
        int question28CorrectAnswer = question28Answers.indexOf(
                question28Answers.stream().filter(answer -> answer.getAnswerText().equals("b) Pålitlig överföring med ACK (Acknowledge) och NACK (Not Acknowledge).")).findFirst().orElse(null)
        );

        Question question28 = new Question("Vad använder TCP (Transmisson Control Protocol) för att säkerställa ordnad dataöverföring?", question28Answers, question28CorrectAnswer);
        questions.add(question28);

// Question 29
        List<Answer> question29Answers = new ArrayList<>();
        question29Answers.add(new Answer("a) Ingen kongestionshantering, vilket kan leda till att nätverket överbelastas."));
        question29Answers.add(new Answer("b) Kort sagt, UDP är exakt tvärtom från TCP."));
        question29Answers.add(new Answer("c) När hastigheten är viktigare än pålitligheten."));
        question29Answers.add(new Answer("d) För små filer eller streams, där förlorade paket inte är avgörande."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question29Answers);
        int question29CorrectAnswer = question29Answers.indexOf(
                question29Answers.stream().filter(answer -> answer.getAnswerText().equals("d) För små filer eller streams, där förlorade paket inte är avgörande.")).findFirst().orElse(null)
        );

        Question question29 = new Question("När ska man använda UDP (User Datagram Protocol) för filöverföring?", question29Answers, question29CorrectAnswer);
        questions.add(question29);

// Question 30
        List<Answer> question30Answers = new ArrayList<>();
        question30Answers.add(new Answer("a) Intresserad av att använda Kafka."));
        question30Answers.add(new Answer("b) Nyckeln till att automatisera processer över flera olika system."));
        question30Answers.add(new Answer("c) Använder API:er för att koppla samman system och appar."));
        question30Answers.add(new Answer("d) Fokuserar på beställningar, fakturor, leveranser och handelsrelaterade ärenden."));

// Shuffle the answers and choose a random correct answer index
        Collections.shuffle(question30Answers);
        int question30CorrectAnswer = question30Answers.indexOf(
                question30Answers.stream().filter(answer -> answer.getAnswerText().equals("d) Fokuserar på beställningar, fakturor, leveranser och handelsrelaterade ärenden.")).findFirst().orElse(null)
        );

        Question question30 = new Question("Vad används EDIFACT som en internationell standard för inom företag och organisationer?", question30Answers, question30CorrectAnswer);
        questions.add(question30);





        Question question10 = new Question("Vad är en Consumergroup inom Kafka?", question10Answers, question10CorrectAnswer);
        questions.add(question10);

        return questions;
    }

}
