package es.xabertum.ajicr_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_jornadas_4 extends Fragment {

    View jornadas_4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        jornadas_4 = inflater.inflate(R.layout.fragment_jornadas_4,container, false);

        TextView estatutosLink = jornadas_4.findViewById(R.id.link_progama_j4);
        estatutosLink.setMovementMethod(LinkMovementMethod.getInstance());


        return jornadas_4;
    }
}