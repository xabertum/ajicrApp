package es.xabertum.ajicr_app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Fragment_jornadas_1 extends Fragment {

    View jornadas_1;
    ImageView imageViewCartel;
    ImageView imageViewPortada;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        jornadas_1 = inflater.inflate(R.layout.fragment_jornadas_1,null);
        imageViewCartel = jornadas_1.findViewById(R.id.cartel_jornadas);
        imageViewPortada = jornadas_1.findViewById(R.id.imageViewPortada1);

        Glide.with(this).load(R.drawable.cartel_jornadas_1).into(imageViewCartel);
        Glide.with(this).load(R.drawable.portada_j1).into(imageViewPortada);

        return jornadas_1;
    }

}
