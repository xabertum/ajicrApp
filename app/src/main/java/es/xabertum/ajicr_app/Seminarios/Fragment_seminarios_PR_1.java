package es.xabertum.ajicr_app.Seminarios;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import es.xabertum.ajicr_app.R;

public class Fragment_seminarios_PR_1 extends Fragment {

    private View jornadas_2;
    private ImageView imageViewPortada_j2;
    private ImageView cartel_j2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {
        jornadas_2 = inflater.inflate(R.layout.fragment_seminarios_pr_1,container, false);
        imageViewPortada_j2 = jornadas_2.findViewById(R.id.ImageViewPortada_j2);
        cartel_j2 = jornadas_2.findViewById(R.id.cartel_jornadas_2);

        Glide.with(this).load(R.drawable.portada_j2).into(imageViewPortada_j2);
        Glide.with(this).load(R.drawable.cartel_jornadas_2).into(cartel_j2);

        TextView Link = jornadas_2.findViewById(R.id.link_progama_j2);
        Link.setMovementMethod(LinkMovementMethod.getInstance());

        return jornadas_2;
    }

}
