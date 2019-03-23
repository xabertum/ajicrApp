package es.xabertum.ajicr_app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Fragment_jornadas_4 extends Fragment {

    View jornadas_4;
    ImageView imageViewPortada_j4;
    ImageView cartel_j4;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {
        jornadas_4 = inflater.inflate(R.layout.fragment_jornadas_4,null);
        imageViewPortada_j4 = jornadas_4.findViewById(R.id.imageViewPortada_j4);
        cartel_j4 = jornadas_4.findViewById(R.id.cartel_jornadas_4);

        Glide.with(this).load(R.drawable.portada_j4).into(imageViewPortada_j4);
        Glide.with(this).load(R.drawable.cartel_jornadas_4).into(cartel_j4);

        TextView estatutosLink = jornadas_4.findViewById(R.id.link_progama_j4);
        estatutosLink.setMovementMethod(LinkMovementMethod.getInstance());

        return jornadas_4;
    }
}
