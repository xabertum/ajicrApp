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

public class Fragment_jornadas_6_gallery extends Fragment {

    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12, imageView13, imageView14, imageView15, imageView16, imageView17, imageView18, imageView19, imageView20;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_cursoverano_1_gallery, container, false);

        imageView1 = view.findViewById(R.id.jornada_6_Gallery_1);
        imageView2 = view.findViewById(R.id.jornada_6_Gallery_2);
        imageView3 = view.findViewById(R.id.jornada_6_Gallery_3);
        imageView4 = view.findViewById(R.id.jornada_6_Gallery_4);
        imageView5 = view.findViewById(R.id.jornada_6_Gallery_5);
        imageView6 = view.findViewById(R.id.jornada_6_Gallery_6);
        imageView7 = view.findViewById(R.id.jornada_6_Gallery_7);
        imageView8 = view.findViewById(R.id.jornada_6_Gallery_8);
        imageView9 = view.findViewById(R.id.jornada_6_Gallery_9);
        imageView10 = view.findViewById(R.id.jornada_6_Gallery_10);
        imageView11 = view.findViewById(R.id.jornada_6_Gallery_11);
        imageView12 = view.findViewById(R.id.jornada_6_Gallery_12);
        imageView13 = view.findViewById(R.id.jornada_6_Gallery_13);
        imageView14 = view.findViewById(R.id.jornada_6_Gallery_14);
        imageView15 = view.findViewById(R.id.jornada_6_Gallery_15);
        imageView16 = view.findViewById(R.id.jornada_6_Gallery_16);
        imageView17 = view.findViewById(R.id.jornada_6_Gallery_17);
        imageView18 = view.findViewById(R.id.jornada_6_Gallery_18);
        imageView19 = view.findViewById(R.id.jornada_6_Gallery_19);
        imageView20 = view.findViewById(R.id.jornada_6_Gallery_20);


        Glide.with(this).load(R.drawable.jornada_6_gallery_1).into(imageView1);
        Glide.with(this).load(R.drawable.jornada_6_gallery_2).into(imageView2);
        Glide.with(this).load(R.drawable.jornada_6_gallery_3).into(imageView3);
        Glide.with(this).load(R.drawable.jornada_6_gallery_4).into(imageView4);
        Glide.with(this).load(R.drawable.jornada_6_gallery_5).into(imageView5);
        Glide.with(this).load(R.drawable.jornada_6_gallery_6).into(imageView6);
        Glide.with(this).load(R.drawable.jornada_6_gallery_7).into(imageView7);
        Glide.with(this).load(R.drawable.jornada_6_gallery_8).into(imageView8);
        Glide.with(this).load(R.drawable.jornada_6_gallery_9).into(imageView9);
        Glide.with(this).load(R.drawable.jornada_6_gallery_10).into(imageView10);
        Glide.with(this).load(R.drawable.jornada_6_gallery_11).into(imageView11);
        Glide.with(this).load(R.drawable.jornada_6_gallery_12).into(imageView12);
        Glide.with(this).load(R.drawable.jornada_6_gallery_13).into(imageView13);
        Glide.with(this).load(R.drawable.jornada_6_gallery_14).into(imageView14);
        Glide.with(this).load(R.drawable.jornada_6_gallery_15).into(imageView15);
        Glide.with(this).load(R.drawable.jornada_6_gallery_16).into(imageView16);
        Glide.with(this).load(R.drawable.jornada_6_gallery_17).into(imageView17);
        Glide.with(this).load(R.drawable.jornada_6_gallery_18).into(imageView18);
        Glide.with(this).load(R.drawable.jornada_6_gallery_19).into(imageView19);
        Glide.with(this).load(R.drawable.jornada_6_gallery_20).into(imageView20);


        return view;
    }
}
