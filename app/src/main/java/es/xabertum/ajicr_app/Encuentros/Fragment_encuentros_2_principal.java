package es.xabertum.ajicr_app.Encuentros;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import es.xabertum.ajicr_app.R;

public class Fragment_encuentros_2_principal extends Fragment {

    View encuentro_2;
    ImageView imageViewCartel;
    ImageView imageViewPortada;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        encuentro_2 = inflater.inflate(R.layout.fragment_encuentro_2_principal,null);
        imageViewCartel = encuentro_2.findViewById(R.id.cartel_encuentro_2);
        imageViewPortada = encuentro_2.findViewById(R.id.imageViewPortada_e1);

        Glide.with(this).load(R.drawable.cartel_encuentro_2).into(imageViewCartel);
        Glide.with(this).load(R.drawable.portada_e2).into(imageViewPortada);

        TextView formularioLink = encuentro_2.findViewById(R.id.formularioLink);
        formularioLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView programaLink = encuentro_2.findViewById(R.id.programaLink);
        programaLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView resumenesLink = encuentro_2.findViewById(R.id.comunicacionesLink);
        resumenesLink.setMovementMethod(LinkMovementMethod.getInstance());

        return encuentro_2;
    }

}
