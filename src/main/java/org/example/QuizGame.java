package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QuizGame {
    private List<Question> questions;
    private int score;

    public QuizGame(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (Question question : questions) {
            displayQuestion(question);

            // Validate user input to ensure it's an integer
            int userAnswer = getUserInput(scanner);

            // För att jämföra användarens svar med det korrekta svaret,
            // subtrahera 1 från användarens svar eftersom alternativen är indexbaserade.
            if (userAnswer - 1 == question.getCorrectAnswer()) {
                System.out.println("Rätt svar!");
                score++;
            } else {
                System.out.println("Fel svar. Rätt svar var alternativ " + (question.getCorrectAnswer() + 1));
            }

            System.out.println("Ditt resultat: " + score + " av " + questions.size());
            System.out.println();
        }

        System.out.println("Spelet är slut. Din totala poäng är: " + score + " av " + questions.size());
    }


    private int getUserInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Felaktig inmatning. Ange en siffra som svar.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
    }
    public void displayQuestion(Question question) {
        System.out.println(question.getQuestionText());

        // Display answer choices
        List<Answer> answers = question.getAnswers();
        for (int i = 0; i < answers.size(); i++) {
            System.out.println((i + 1) + ") " + answers.get(i).getAnswerText());
        }

        System.out.print("Ange ditt svar (1, 2, 3, etc.): ");
    }
}
