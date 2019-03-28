package es.xabertum.ajicr_app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_encuentros_1A extends Fragment {

    View encuentro_1;
    ImageView imageViewCartel;
    ImageView imageViewPortada;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        encuentro_1 = inflater.inflate(R.layout.fragment_encuentro_1a,null);
        imageViewCartel = encuentro_1.findViewById(R.id.cartel_encuentro_1);
        imageViewPortada = encuentro_1.findViewById(R.id.imageViewPortada_e1);

        Glide.with(this).load(R.drawable.cartel_encuentro_1).into(imageViewCartel);
        Glide.with(this).load(R.drawable.portada_e1).into(imageViewPortada);

        return encuentro_1;
    }

}
