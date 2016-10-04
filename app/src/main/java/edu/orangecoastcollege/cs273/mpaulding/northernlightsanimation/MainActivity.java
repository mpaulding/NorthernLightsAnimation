package edu.orangecoastcollege.cs273.mpaulding.northernlightsanimation;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private AnimationDrawable frameAnimation;
    private ImageView lightsImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lightsImageView = (ImageView) findViewById(R.id.lightsImageView);
        lightsImageView.setBackgroundResource(R.drawable.frame_anim);
        frameAnimation = (AnimationDrawable) lightsImageView.getBackground();





    }

    public void startFrameAnim(View view)
    {
        if (frameAnimation.isRunning())
            frameAnimation.stop();
        else
            frameAnimation.start();
    }
}
