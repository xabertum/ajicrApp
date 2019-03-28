package es.xabertum.ajicr_app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import es.xabertum.ajicr_app.Encuentros.FragmentCardViewEncuentro;
import es.xabertum.ajicr_app.Jornadas.FragmentCardViewJornada;

import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //loading the default fragment
        loadFragment(new Fragment_presentacion());

        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;

        switch (item.getItemId()) {
            case R.id.navigation_home:
                fragment = new Fragment_presentacion();
                break;

            case R.id.navigation_jornadas:
                fragment = new FragmentCardViewJornada();
                break;
            case R.id.navigation_encuentros:
                fragment = new FragmentCardViewEncuentro();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment (Fragment fragment) {
        // switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return true;
        }

        return false;
    }

}
