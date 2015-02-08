package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Controller {
    public Random random = new Random();
    public String[] answers = {"да", "нет", "это не важно", "тебе нужно успокоиться", "ты толстишь", "да, но лучше бы нет", "никогда", "100%", "шанс = 1%", "тебе нужно спросить еще раз"};
    private String thisQuestion, previousQuestion;

    //@FXML
   // public void think(int x) throws InterruptedException {
        //otvet.setText(".");
        //while (x>0){
        //    TimeUnit.SECONDS.sleep(1);
        //    otvet.setText(otvet.getText()+".");
        //    x--;
        //}


        //TimerTask task = new TimerTask() {
          //  @Override
            //public void run() {
                // your code goes here
            //}
       // };
   // }

    @FXML
    private javafx.scene.control.TextField question;

    @FXML
    private Button Answer;

    @FXML
    private CheckBox  simplify;
    @FXML
    private CheckBox wait;

    @FXML
    private Label otvet;

    @FXML
    public void Answer() throws InterruptedException {
        thisQuestion = question.getText();
        if (thisQuestion.equals(previousQuestion)) {
            otvet.setText("Ты меня уже спрашивал об этом");
        }
        else {
            //if (wait.isSelected()) think(5);
            if (simplify.isSelected()) otvet.setText("Я думаю, что " + answers[random.nextInt(2)]);
            else otvet.setText("Я думаю, что " + answers[random.nextInt(9)]);
        }
        previousQuestion = question.getText();
    }
}
