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

public class Fragment_inicio extends Fragment {

    ImageView imageViewPortada_Presentacion;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        View inicioView = inflater.inflate(R.layout.fragment_inicio, null);
        imageViewPortada_Presentacion = inicioView.findViewById(R.id.imageViewPortada_presentacion);

        Glide.with(this).load(R.drawable.foto_ejicr_2017_cropped).into(imageViewPortada_Presentacion);

        TextView estatutosLink = inicioView.findViewById(R.id.content_home15);
        estatutosLink.setMovementMethod(LinkMovementMethod.getInstance());

        return inicioView;
    }







}
