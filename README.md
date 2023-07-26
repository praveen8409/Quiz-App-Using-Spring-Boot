# Quiz-App-Using-Spring-Boot

Add Question in DB http://localhost:8001/question/add { "questionTitle": "What is the correct way to declare a variable in Java?", "option1": "variable name = value;", "option2": "var name = value;", "option3": "int name = value;", "option4": "String name = value;", "rightAnswer": "int name = value;", "category": "Java", "difficultylevel": "Easy" }

Create a Quiz http://localhost:8001/quiz/create?category=html&numQ=5&title=JQuiz

Get Quiz http://localhost:8001/quiz/get/1 [ { "id": 15, "questionTitle": "What is the correct way to declare a variable in Java?", "option1": "variable name = value;", "option2": "var name = value;", "option3": "int name = value;", "option4": "String name = value;" }, { "id": 2, "questionTitle": "Which of the following is not a valid Java identifier?", "option1": "my_variable", "option2": "_variable", "option3": "2variable", "option4": "$variable" }, { "id": 3, "questionTitle": "What is the correct way to declare a constant variable in Java?", "option1": "const int x = 10;", "option2": "final int x = 10;", "option3": "constant int x = 10;", "option4": "int x = 10; constant;" }, { "id": 1, "questionTitle": "Java is a ____-oriented programming language.", "option1": "Procedure", "option2": "Object", "option3": "Functional", "option4": "Markup" } ]

Submit Quiz and get Result http://localhost:8001/quiz/submit/1
