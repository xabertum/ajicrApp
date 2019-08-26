package es.xabertum.ajicr_app.Jornadas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import es.xabertum.ajicr_app.R;

public class Fragment_jornadas_6_principal extends Fragment {

    View jornadas_6;
    ImageView imageViewCartel;
    ImageView imageViewPortada;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        jornadas_6 = inflater.inflate(R.layout.fragment_jornadas_6_principal, null);
        imageViewCartel = jornadas_6.findViewById(R.id.cartel_jornadas_6);
        imageViewPortada = jornadas_6.findViewById(R.id.imageViewPortada_j6);

        Glide.with(this).load(R.drawable.cartel_jornadas_5).into(imageViewCartel);
        Glide.with(this).load(R.drawable.portada_j5).into(imageViewPortada);

        return jornadas_6;
    }

}
