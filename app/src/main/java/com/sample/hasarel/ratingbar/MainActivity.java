package com.sample.hasarel.ratingbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Ui Components
    private RatingBar mRbrRatingBar1;
    private Button mBtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mRbrRatingBar1 = findViewById(R.id.main_activity_rb_rating_bar1);
        mBtnClick = findViewById(R.id.main_activity_btn_click);
        mBtnClick.setOnClickListener(this);
    }

    private void clickRatingBar(){

        //Getting the rating and displaying it on the toast
        String rating = String.valueOf(mRbrRatingBar1.getRating());
        Toast.makeText(getApplicationContext(),"This is my Rating : " + rating, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_activity_btn_click:
                clickRatingBar();
                break;
            default:
                break;
        }
    }
}