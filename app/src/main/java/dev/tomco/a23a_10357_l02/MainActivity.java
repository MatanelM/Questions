package dev.tomco.a23a_10357_l02;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    public int width;
    public int height;
    private MaterialTextView main_LBL_score;
    private MaterialTextView main_LBL_name;
    private MaterialTextView main_TXT_ans1;
    private MaterialTextView main_TXT_ans2;
    private MaterialTextView main_TXT_ans3;
    private MaterialTextView main_TXT_ans4;
    private MaterialTextView[] answers;

    private Button main_BTN_A;
    private Button main_BTN_B;
    private Button main_BTN_C;
    private Button main_BTN_D;
    private Button[] buttons;
    private Button main_BTN_next;

    private ImageView main_IMG_flag;
    private ShapeableImageView[] main_IMG_hearts;

    private GameManager gameManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        height = (int)(metrics.heightPixels * 0.66);
        width = metrics.widthPixels;

        findViews();
        gameManager = new GameManager(main_IMG_hearts.length);

        refreshUI();

        main_BTN_A.setOnClickListener(view -> {
            clicked(1);
        });
        main_BTN_B.setOnClickListener(view -> {
            clicked(2);
        });
        main_BTN_C.setOnClickListener(view -> {
            clicked(3);
        });
        main_BTN_D.setOnClickListener(view -> {
            clicked(4);
        });
        main_BTN_next.setOnClickListener(view -> {
            refreshUI();
        });


    }
    private void findViews() {
        main_LBL_score = findViewById(R.id.main_LBL_score);
        main_LBL_name = findViewById(R.id.main_LBL_name);
        main_BTN_A = findViewById(R.id.main_BTN_A);
        main_BTN_B = findViewById(R.id.main_BTN_B);
        main_BTN_C = findViewById(R.id.main_BTN_C);
        main_BTN_D = findViewById(R.id.main_BTN_D);
        buttons = new Button[]{
                main_BTN_A, main_BTN_B, main_BTN_C, main_BTN_D
        };

        main_TXT_ans1 = findViewById(R.id.main_TXT_ans1);
        main_TXT_ans2 = findViewById(R.id.main_TXT_ans2);
        main_TXT_ans3 = findViewById(R.id.main_TXT_ans3);
        main_TXT_ans4 = findViewById(R.id.main_TXT_ans4);
        answers = new MaterialTextView[]{
                main_TXT_ans1, main_TXT_ans2, main_TXT_ans3, main_TXT_ans4
        };

        main_BTN_next = findViewById(R.id.main_BTN_next);
        main_IMG_flag = findViewById(R.id.main_IMG_flag);
        main_IMG_hearts = new ShapeableImageView[]{
                findViewById(R.id.main_IMG_heart1),
                findViewById(R.id.main_IMG_heart2),
                findViewById(R.id.main_IMG_heart3),
                findViewById(R.id.main_IMG_heart4)
        };
    }

    private void clicked(int answer) {

        if ( gameManager.isGameEnded() ||gameManager.isLose() || gameManager.isLocked() ) return;
        int correct = gameManager.checkAnswer(answer);
        if ( correct != answer){
            answers[answer-1].setBackgroundResource(R.color.wrong);
        }
        answers[correct-1].setBackgroundResource(R.color.correct);
        this.gameManager.lock();
        main_LBL_score.setText("" + gameManager.getScore());
    }

    private void refreshUI() {

        if (gameManager.isLose()) {
            main_LBL_score.setText("Game Over: " + gameManager.getScore());
            return;
        } else if (gameManager.isGameEnded()) {
            main_LBL_score.setText("Winner! " + gameManager.getScore());
            return;
        } else {
            if( gameManager.getCurrentFlag() == 0){
                main_IMG_flag.setImageResource(gameManager.getCurrentFlag());
                main_IMG_flag.setVisibility(View.GONE);
            }else{
                main_IMG_flag.setImageResource(gameManager.getCurrentFlag());
                main_IMG_flag.setVisibility(View.VISIBLE);
                main_IMG_flag.setScaleType(ImageView.ScaleType.CENTER);
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), gameManager.getCurrentFlag());
                int widthBitmap = bitmap.getWidth();
                int heightBitmap = bitmap.getHeight();
                float scaleWidth = ((float) width)/widthBitmap;
                float scaleHeight = ((float)height)/heightBitmap;
                Matrix matrix = new Matrix();
                matrix.postScale(scaleWidth, scaleHeight);
                Bitmap resizedBitmap = Bitmap.createBitmap(bitmap, 0, 0, widthBitmap, heightBitmap, matrix, false);
                main_IMG_flag.setImageBitmap(resizedBitmap);
            }
            for (MaterialTextView answer : answers) {
                answer.setBackgroundColor(0);
            }
            main_LBL_name.setText(gameManager.getCurrentName());
            answers[0].setText(gameManager.getAnswer1());
            answers[1].setText(gameManager.getAnswer2());
            answers[2].setText(gameManager.getAnswer3());
            answers[3].setText(gameManager.getAnswer4());

           for (int i = main_IMG_hearts.length - 1; i >= main_IMG_hearts.length - gameManager.getWrong(); i--) {
                main_IMG_hearts[i].setVisibility(View.INVISIBLE);
            }
            this.gameManager.unlock();
        }
    }


}