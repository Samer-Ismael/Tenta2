package org.example;

import java.util.Scanner;

public class IntegrationQuizApp {
    public IntegrationQuizApp (){
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        int totalQuestions = 0;

        // Define your integration-related questions, choices, and correct answers here
        String[][] questionsChoicesAndAnswers = {
                {"What is P2P integration also known as?",
                        "a) Peer-to-Peer Integration",
                        "b) Platform Integration",
                        "c) Point-to-Point Integration",
                        "d) Producer-Consumer Integration",
                        "a"},

                {"What are the disadvantages of P2P integration?",
                        "a) Reusability of solutions",
                        "b) Lack of transparency",
                        "c) Dependency on specific solutions",
                        "d) All of the above",
                        "d"},

                {"What does a black box experience mean in integration?",
                        "a) A seamless integration process",
                        "b) Lack of visibility into the integration",
                        "c) A highly efficient integration",
                        "d) A well-documented integration",
                        "b"},

                {"In P2P integration, do systems interact with each other through a platform?",
                        "a) Yes",
                        "b) No",
                        "c) Only some systems do",
                        "d) It depends on the system",
                        "b"},

                {"What is an advantage of Integration with a platform?",
                        "a) Lack of control",
                        "b) Hard dependency on the platform",
                        "c) Flexibility and control",
                        "d) Inefficient processes",
                        "c"},

                {"What are the components of a typical integration platform?",
                        "a) Producers and Consumers",
                        "b) Topics or keys",
                        "c) Error handling and logging",
                        "d) All of the above",
                        "d"},

                {"What does iPaaS stand for?",
                        "a) Internet Protocol as a Service",
                        "b) Integrated Platform as an Application",
                        "c) Integration Platform as a Service",
                        "d) Interactive Program as a Service",
                        "c"},

                {"Why do many companies prefer iPaaS platforms?",
                        "a) They require a lot of infrastructure management",
                        "b) They lack predefined integrations",
                        "c) They are cost-effective and save time",
                        "d) They have limited data transformation capabilities",
                        "c"},

                {"What should you consider when choosing an iPaaS system?",
                        "a) The color of the user interface",
                        "b) The number of features it offers",
                        "c) Its relevance and future focus",
                        "d) Its popularity on social media",
                        "c"},

                {"What are some functions of an iPaaS system?",
                        "a) Analysis and reporting",
                        "b) Behörigheter",
                        "c) Expanderbar plattform",
                        "d) All of the above",
                        "d"},

                {"What is the purpose of API within integration platforms?",
                        "a) To integrate external applications",
                        "b) To provide access to a portal",
                        "c) To allow communication between systems",
                        "d) To control permissions on the platform",
                        "c"},

                {"What is the role of FTP in integration platforms?",
                        "a) File Text Processing",
                        "b) File Transfer between servers",
                        "c) Internet Protocol as a Service",
                        "d) None of the above",
                        "b"},

                {"What is the purpose of SFTP in integration platforms?",
                        "a) To provide secure file transfer",
                        "b) To automate data transformation",
                        "c) To create data filters",
                        "d) None of the above",
                        "a"},

                {"What is the difference between TCP and UDP?",
                        "a) TCP is connectionless, while UDP is connection-oriented.",
                        "b) TCP guarantees ordered and reliable data transmission, while UDP does not.",
                        "c) TCP is faster than UDP.",
                        "d) UDP uses a handshake protocol.",
                        "b"},

                {"When should you use TCP over UDP?",
                        "a) When speed is more important than reliability.",
                        "b) When you need ordered and reliable data transmission.",
                        "c) When network quality is unpredictable.",
                        "d) When dealing with small files.",
                        "b"},
                {"What is the primary role of Apache Kafka in integration?",
                        "a) To process data within a single system",
                        "b) To facilitate communication between applications",
                        "c) To manage database connections",
                        "d) To create web services",
                        "b"},

                {"What is the purpose of a Kafka producer?",
                        "a) To consume data from Kafka topics",
                        "b) To transform data within Kafka",
                        "c) To publish data to Kafka topics",
                        "d) To manage Kafka brokers",
                        "c"},

                {"What is the Kafka topic used for?",
                        "a) To represent a category or feed name to which records are published",
                        "b) To define the Kafka cluster configuration",
                        "c) To store data permanently in Kafka",
                        "d) To manage Kafka consumer groups",
                        "a"},

                {"In Kafka, what is an offset?",
                        "a) The number of Kafka brokers in a cluster",
                        "b) A unique identifier for a Kafka record within a partition",
                        "c) The name of a Kafka topic",
                        "d) The timestamp of a Kafka record",
                        "b"},

                {"What is the purpose of a Kafka consumer group?",
                        "a) To produce data to Kafka topics",
                        "b) To subscribe to Kafka topics and process data in parallel",
                        "c) To monitor Kafka broker performance",
                        "d) To manage Kafka producer configurations",
                        "b"},

                {"What does EDIFACT stand for?",
                        "a) Electronic Data Integration Format",
                        "b) Enterprise Data and Information Format",
                        "c) Electronic Data Interchange for Administration, Commerce, and Transport",
                        "d) Extended Data Integration and Formatting",
                        "c"},

                {"Which data format is self-descriptive and commonly used for data interchange?",
                        "a) XML",
                        "b) JSON",
                        "c) EDIFACT",
                        "d) CSV",
                        "b"},

                {"In EDIFACT, what are segments?",
                        "a) The primary data format for EDIFACT messages",
                        "b) A category of data exchanged between organizations",
                        "c) The individual data elements within a message",
                        "d) The communication channels used for EDIFACT",
                        "c"},

                {"What is XSLT used for in integration?",
                        "a) To create XML documents from scratch",
                        "b) To transform data between XML and other formats",
                        "c) To query XML documents",
                        "d) To validate XML against a schema",
                        "b"},

                {"What is the main purpose of IoT integration?",
                        "a) To create interactive web applications",
                        "b) To integrate Internet of Things (IoT) devices and sensors",
                        "c) To build mobile applications",
                        "d) To manage cloud services",
                        "b"},
                {"What are the disadvantages of point-to-point (P2P) integration?",
                        "a) High cost of implementation",
                        "b) Limited flexibility",
                        "c) Lack of transparency",
                        "d) Easy maintenance and documentation",
                        "c"},

                {"What is the main drawback of P2P integration?",
                        "a) Easy reusability of solutions",
                        "b) Creating a black box experience",
                        "c) Reduced dependency on specific vendors",
                        "d) Integration through a platform",
                        "b"},

                {"What is a key advantage of integration with a platform?",
                        "a) High cost of implementation",
                        "b) Limited flexibility",
                        "c) Reusability of services and solutions",
                        "d) Lack of transparency",
                        "c"},

                {"What are the primary components of an integration platform?",
                        "a) Producers, consumers, topics",
                        "b) Plugins, servers, clients",
                        "c) Databases, APIs, FTP",
                        "d) Logs, notifications, reports",
                        "a"},

                {"What does iPaaS stand for in the context of integration platforms?",
                        "a) Internet Protocol as a Service",
                        "b) Integration Platform as a Service",
                        "c) Interactive Programming and Analysis System",
                        "d) Integrated Protocol and Application Service",
                        "b"},

                {"Why do many businesses prefer iPaaS solutions hosted in the cloud?",
                        "a) To increase infrastructure management",
                        "b) To decrease flexibility",
                        "c) To avoid cost savings",
                        "d) To simplify infrastructure management",
                        "d"},

                {"What is one of the benefits of iPaaS platforms having ready-made integrations?",
                        "a) Slowing down the integration process",
                        "b) Increasing the need for custom development",
                        "c) Speeding up the integration process",
                        "d) Reducing the need for data transformation",
                        "c"},

                {"When choosing an iPaaS system, what should you consider regarding its future relevance?",
                        "a) Select the one with the lowest cost",
                        "b) Choose based on current integration needs only",
                        "c) Focus on its long-term relevance and scalability",
                        "d) Rely on vendor recommendations",
                        "c"},

                {"What does API stand for in the context of integration platforms?",
                        "a) Application Program Interface",
                        "b) Advanced Protocol Integration",
                        "c) Automated Platform Integration",
                        "d) Analytical Process Information",
                        "a"},

                {"What is the primary purpose of continuous information control in integration platforms?",
                        "a) To increase data transfer speed",
                        "b) To reduce errors during transformation or transmission",
                        "c) To store information indefinitely",
                        "d) To provide real-time analytics",
                        "b"},
                {"What is the purpose of a Producer in an integration platform?",
                        "a) To consume data from other systems",
                        "b) To manage incoming data to the platform",
                        "c) To transform data between systems",
                        "d) To visualize integration flow",
                        "b"},

                {"In the context of integration, what does 'Consumers' refer to?",
                        "a) People who buy integrated solutions",
                        "b) The clients of the integration platform",
                        "c) The producers of data",
                        "d) The middleware used for data transformation",
                        "b"},

                {"Why is data transformation important in integration platforms?",
                        "a) To slow down the integration process",
                        "b) To increase dependency on specific vendors",
                        "c) To allow seamless communication between systems with different data formats",
                        "d) To reduce the need for API usage",
                        "c"},

                {"What does 'FTP' stand for in the context of integration?",
                        "a) File Transfer Protocol",
                        "b) Flexible Transmission Process",
                        "c) Fast Track Protocol",
                        "d) Free Transfer Protocol",
                        "a"},

                {"How does SFTP differ from FTP in terms of security?",
                        "a) SFTP uses a different file format",
                        "b) SFTP does not use encryption",
                        "c) SFTP uses krypterad kommunikation to protect data from unauthorized access",
                        "d) SFTP allows remote access without authentication",
                        "c"},

                {"What is the primary function of TCP in data transmission?",
                        "a) To provide unreliable and unordered data transfer",
                        "b) To ensure data transfer without loss and in the correct order",
                        "c) To limit data transfer speed for congestion control",
                        "d) To allow unreliable but faster data transfer",
                        "b"},

                {"When should you use UDP instead of TCP for data transfer?",
                        "a) When data integrity and order are crucial",
                        "b) When you need reliable data transfer",
                        "c) When speed is more important than reliability",
                        "d) When dealing with large files",
                        "c"},

                {"What is the key difference between 'data' and 'information'?",
                        "a) Data is stored in databases, while information is in spreadsheets",
                        "b) Data is raw values without context, while information is data in a meaningful context",
                        "c) Data is always numerical, while information is textual",
                        "d) Data is static, while information is dynamic",
                        "b"},

                {"What is the purpose of XPATH in XML processing?",
                        "a) To encrypt XML data",
                        "b) To validate XML documents",
                        "c) To navigate and search within XML files with a hierarchical structure",
                        "d) To transform XML data into JSON format",
                        "c"},

                {"In the context of integration, what does EDIFACT focus on?",
                        "a) Data storage",
                        "b) Data analytics",
                        "c) Data exchange within businesses and organizations, particularly in areas like orders, invoices, and deliveries",
                        "d) Data transformation",
                        "c"},

                {"What does JSON stand for, and what is it commonly used for in integration?",
                        "a) JavaScript Object Notation, used for transferring binary data",
                        "b) Java Server Object Network, used for web development",
                        "c) Just Simple Object Notation, used for creating complex data structures",
                        "d) JSON is not an acronym, but it's used for self-describing data interchange in NoSQL and other scenarios",
                        "d"},

                {"How does Kafka ensure fault tolerance and high availability in its distributed system?",
                        "a) By using only a single broker for all data",
                        "b) By replicating data across multiple brokers and allowing for leader failover",
                        "c) By relying on a central data storage system",
                        "d) By avoiding the use of partitions",
                        "b"},

                {"What is the purpose of a Consumer Group in Kafka?",
                        "a) To distribute data across multiple topics",
                        "b) To consolidate data into a single topic",
                        "c) To ensure that data is consumed by multiple consumers in a round-robin fashion",
                        "d) To provide access to the Kafka Zookeeper",
                        "c"},

                {"What is the role of an Offset in Kafka's message processing?",
                        "a) It determines the order in which consumers receive messages",
                        "b) It ensures that messages are processed only once by a consumer within a Consumer Group",
                        "c) It controls the number of replicas for each partition",
                        "d) It specifies the location of Kafka brokers",
                        "b"},
                {"What does 'iPaaS' stand for in the context of integration platforms?",
                        "a) Integrated Platform as a Service",
                        "b) Internet Protocol and Application Service",
                        "c) Interactive Program as a Solution",
                        "d) International Payment and Accounting System",
                        "a"},

                {"What are some benefits of using an iPaaS system?",
                        "a) Limited scalability and flexibility",
                        "b) Vendor lock-in and high costs",
                        "c) Reusability of services, time and cost savings, and better control over integrations",
                        "d) Decreased security and transparency",
                        "c"},

                {"What factors should be considered when choosing an iPaaS system?",
                        "a) The color of the user interface",
                        "b) Current weather conditions",
                        "c) Integration requirements, cost, support, and security",
                        "d) The number of vowels in the vendor's name",
                        "c"},

                {"What are some functions typically offered by iPaaS systems?",
                        "a) Recipe recommendations and weather forecasts",
                        "b) Data analysis and gaming services",
                        "c) Analysing and reporting data, API calls, and scheduled activities",
                        "d) Playing music and video streaming",
                        "c"},

                {"In what scenarios would you use event-based integration with APIs?",
                        "a) To manually trigger integrations",
                        "b) When you need real-time responses to specific events or actions",
                        "c) For batch processing of data",
                        "d) To create static reports",
                        "b"},

                {"What is the primary purpose of FTP (File Transfer Protocol) in integrations?",
                        "a) To securely transmit sensitive data",
                        "b) To create dynamic web content",
                        "c) To automate the transfer of files between servers and systems",
                        "d) To send emails with attachments",
                        "c"},

                {"What are some characteristics of EDIFACT in data exchange?",
                        "a) It focuses on social media interactions",
                        "b) It is primarily used for streaming video content",
                        "c) It's an international standard for exchanging business-related data like orders and invoices",
                        "d) It is designed for encrypting email communications",
                        "c"},

                {"What distinguishes XSLT from XPATH in XML processing?",
                        "a) XSLT is used for navigation, while XPATH is used for transformations",
                        "b) XSLT and XPATH are interchangeable terms",
                        "c) XSLT is for JSON data, and XPATH is for XML data",
                        "d) XSLT and XPATH serve the same purpose",
                        "a"},

                {"What is the primary role of Zookeeper in a Kafka cluster?",
                        "a) To manage the zoo animals",
                        "b) To distribute data between Kafka brokers",
                        "c) To organize and coordinate the Kafka brokers and leader elections",
                        "d) To monitor consumer activities",
                        "c"},

                {"How does Kafka ensure that messages are not lost during processing?",
                        "a) By discarding messages that fail to reach consumers",
                        "b) By storing multiple copies of messages in different partitions",
                        "c) By encrypting messages to prevent loss",
                        "d) By relying on external backup systems",
                        "b"},
        };

        System.out.println("Integration Quiz with Multiple Choice");
        System.out.println("Answer the following questions:");

        for (String[] questionAndChoices : questionsChoicesAndAnswers) {
            String question = questionAndChoices[0];
            String[] choices = new String[4];
            for (int i = 0; i < 4; i++) {
                choices[i] = questionAndChoices[i + 1];
            }
            String correctAnswer = questionAndChoices[6];

            System.out.println("\nQuestion: " + question);
            for (int i = 0; i < 4; i++) {
                System.out.println(choices[i]);
            }
            System.out.print("Your Choice (a/b/c/d): ");
            String userChoice = scanner.nextLine().trim();

            if (userChoice.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + correctAnswer);
            }

            totalQuestions++;
        }

        double percentage = (double) score / totalQuestions * 100;
        System.out.println("\nQuiz completed!");
        System.out.println("Your Score: " + score + " out of " + totalQuestions);
        System.out.println("Percentage Correct: " + percentage + "%");

        scanner.close();
    }
}
