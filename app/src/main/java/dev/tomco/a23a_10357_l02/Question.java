package dev.tomco.a23a_10357_l02;

public class Question {

    private String question;
    private int image;
    private int score;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    private int correct;
    private String description;


    public Question() {}

    public String getQuestion() {
        return question;
    }

    public Question setQuestion(String question) {
        this.question = question;
        return this;
    }

    public int getImage() {
        return image;
    }

    public Question setImage(int image) {
        this.image = image;
        return this;
    }

    public String getAns1() {
        return ans1;
    }

    public Question setAns1(String ans1) {
        this.ans1 = ans1;
        return this;
    }

    public String getAns2() {
        return ans2;
    }

    public Question setAns2(String ans2) {
        this.ans2 = ans2;
        return this;
    }

    public String getAns3() {
        return ans3;
    }

    public Question setAns3(String ans3) {
        this.ans3 = ans3;
        return this;
    }

    public String getAns4() {
        return ans4;
    }

    public Question setAns4(String ans4) {
        this.ans4 = ans4;
        return this;
    }

    public int getCorrect() {
        return correct;
    }

    public Question setCorrect(int correct) {
        this.correct = correct;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Question setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getScore(){
        return this.score;
    }

    public Question setScore(int score){
        this.score = score;
        return  this;

    }
}
