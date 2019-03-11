package es.xabertum.ajicr_app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private TextView contentHome;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    contentHome.setText(R.string.content_home);
                    return true;
                case R.id.navigation_jornadas:
                    mTextMessage.setText(R.string.title_jornadas);
                    return true;
                case R.id.navigation_encuentros
                        :
                    mTextMessage.setText(R.string.title_encuentros);
                    return true;
                case R.id.navigation_contacto:
                    mTextMessage.setText(R.string.title_contacto);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentHome = (TextView) findViewById(R.id.content_home);
        //contentHome.setJustificationMode(JUSTIFICATION_MODE_INTER_WORD);

        mTextMessage = (TextView) findViewById(R.id.content_home);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
