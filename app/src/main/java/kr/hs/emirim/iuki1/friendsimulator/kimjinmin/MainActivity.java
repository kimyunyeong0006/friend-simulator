package kr.hs.emirim.iuki1.friendsimulator.kimjinmin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "1";
    private ImageView mImageViewFriendVisual;
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual = (ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG, "activity_main 레이아웃 세팅");
    }

    void onClick(View view){
        Log.d(TAG, "onClick 메소드 호출");
        Log.d(TAG, "클릭된 뷰");
        switch (view.getId()){
            case R.id.button1:
                mImageViewFriendVisual.setImageResource(R.drawable.jm_01);
                Toast.makeText(this,"미쳤나봐", Toast.LENGTH_SHORT).show(); break;
            case R.id.button2:
                mImageViewFriendVisual.setImageResource(R.drawable.jm_02);
                Toast.makeText(this,"음⊙_⊙", Toast.LENGTH_SHORT).show();break;
            case R.id.button3:
                mImageViewFriendVisual.setImageResource(R.drawable.jm_03);
                Toast.makeText(this,"엥", Toast.LENGTH_SHORT).show();break;
            case R.id.button4:
                mImageViewFriendVisual.setImageResource(R.drawable.jm_04);
                Toast.makeText(this,"미아넹", Toast.LENGTH_SHORT).show();break;
            case R.id.button5:
                mImageViewFriendVisual.setImageResource(R.drawable.jm_05);
                Toast.makeText(this,"으흠", Toast.LENGTH_SHORT).show();break;
            default: Toast.makeText(this,"다시선택해", Toast.LENGTH_SHORT).show();
        }

        this.view = view;
    }
}