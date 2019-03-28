package es.xabertum.ajicr_app.Jornadas;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import es.xabertum.ajicr_app.R;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Fragment_jornadas_3 extends Fragment {

    View jornadas_3;
    ImageView imageViewPortada_j3;
    ImageView cartel_j3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {
        jornadas_3 = inflater.inflate(R.layout.fragment_jornadas_3,null);
        imageViewPortada_j3 = jornadas_3.findViewById(R.id.imageViewPortada_j3);
        cartel_j3 = jornadas_3.findViewById(R.id.cartel_jornadas_3);

        Glide.with(this).load(R.drawable.portada_j3).into(imageViewPortada_j3);
        Glide.with(this).load(R.drawable.cartel_jornadas_3).into(cartel_j3);

        TextView estatutosLink = jornadas_3.findViewById(R.id.link_progama_j3);
        estatutosLink.setMovementMethod(LinkMovementMethod.getInstance());

        return jornadas_3;
    }
}
