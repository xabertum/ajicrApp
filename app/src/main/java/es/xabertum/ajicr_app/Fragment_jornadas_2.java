package es.xabertum.ajicr_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment_jornadas_2 extends Fragment {

    View jornadas_2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        jornadas_2 = inflater.inflate(R.layout.fragment_jornadas_2,null);

        return jornadas_2;
    }

}
