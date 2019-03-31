package es.xabertum.ajicr_app.Jornadas;

import android.os.Bundle;
import androidx.annotation.NonNull;
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

public class Fragment_jornadas_1 extends Fragment {

    private View jornadas_1;
    private ImageView imageViewCartel;
    private ImageView imageViewPortada;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        jornadas_1 = inflater.inflate(R.layout.fragment_jornadas_1,container, false);
        imageViewCartel = jornadas_1.findViewById(R.id.cartel_jornadas);
        imageViewPortada = jornadas_1.findViewById(R.id.imageViewPortada1);

        Glide.with(this).load(R.drawable.cartel_jornadas_1).into(imageViewCartel);
        Glide.with(this).load(R.drawable.portada_j1).into(imageViewPortada);

        TextView Link = jornadas_1.findViewById(R.id.link_progama_j1);
        Link.setMovementMethod(LinkMovementMethod.getInstance());

        return jornadas_1;
    }

}
