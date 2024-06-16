
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String Selection[]=new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is the size of float and double in java ?", "32 and 64", "32 and 32", "64 and 64", "64 and 32", "32 and 64");
        questions[1] = new Question(2, "Arrays in java are-", "Object references", "objects", "Primitive data type", "None", "objects");
        questions[2] = new Question(3, "When is the object created with new keyword ? ", "At run time", "At compile time", "Depends on the code", "None", "At run time");
        questions[3] = new Question(4, " \r\n" + //
                        "Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class.", "final", "static", "volatile",
                                                        "abstract", "static");
        questions[4] = new Question(5, "In which of the following is toString() method defined?", "java.lang.Object", "java.lang.String", "java.lang.util", "none", "java.lang.Object");
    }

    public void playQuiz() {
        int i=0;
        for (Question q : questions) {
            System.out.println("Question No. : "+q.getId());
            System.out.println("Question :- " + q.getQuestion());
            System.out.println("option 1 :- " + q.getOpt1());
            System.out.println("option 2 :- " + q.getOpt2());
            System.out.println("option 3 :- " + q.getOpt3());
            System.out.println("option 4 :- " + q.getOpt4());

           Scanner sc=new Scanner(System.in);
           System.out.print("your Answer is :- ");
           Selection[i]=sc.nextLine();
           System.out.println();
           i++;
        }


        System.out.println("Users Answer");
        for(String s:Selection){
            System.out.println(s);
        }
    }



    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question que=questions[i];
            String actualAnswer=que.getAnswer();
            String userAnswer=Selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }

        System.out.println("your score is " + score);
    }
}
