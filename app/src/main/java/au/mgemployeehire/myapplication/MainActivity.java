package au.mgemployeehire.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView titlerate, resultrate;
    Button btnFeedback;
    ImageView charPlace;
    RatingBar rateStars;
    String answerValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titlerate = findViewById(R.id.titlerate);
        resultrate = findViewById(R.id.resultrate);

        btnFeedback = findViewById(R.id.btnFeedback);
        charPlace = findViewById(R.id.charPlace);

        rateStars = findViewById(R.id.rateStars);


        //condition
        rateStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                answerValue = String.valueOf((int) (rateStars.getRating()));

                if (answerValue.equals("1")){
                    charPlace.setImageResource(R.drawable.one_star);
                    resultrate.setText("Very Bad");
                }else if (answerValue.equals("2")){
                    charPlace.setImageResource(R.drawable.one_star);
                    resultrate.setText("Bad");
                }else if (answerValue.equals("3")){
                    charPlace.setImageResource(R.drawable.three_star);
                    resultrate.setText("Fair");
                }else if (answerValue.equals("4")){
                    charPlace.setImageResource(R.drawable.five_star);
                    resultrate.setText("Good");
                }else if (answerValue.equals("5")){
                    charPlace.setImageResource(R.drawable.five_star);
                    resultrate.setText("Awesome");
                }else {
                    //nothing
                }
            }
        });
    }
}