package es.xabertum.ajicr_app.Encuentros;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import es.xabertum.ajicr_app.R;

public class fragment_encuentros_1_gallery extends Fragment {

    private ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_encuentro_1_gallery, container, false);

        imageView1 = view.findViewById(R.id.encuentroGallery_1);
        imageView2 = view.findViewById(R.id.encuentroGallery_2);
        imageView3 = view.findViewById(R.id.encuentroGallery_3);
        imageView4 = view.findViewById(R.id.encuentroGallery_4);
        imageView5 = view.findViewById(R.id.encuentroGallery_5);
        imageView6 = view.findViewById(R.id.encuentroGallery_6);
        imageView7 = view.findViewById(R.id.encuentroGallery_7);
        imageView8 = view.findViewById(R.id.encuentroGallery_8);
        imageView9 = view.findViewById(R.id.encuentroGallery_9);
        imageView10 = view.findViewById(R.id.encuentroGallery_10);

        Glide.with(this).load(R.drawable.encuentro1_1).into(imageView1);
        Glide.with(this).load(R.drawable.encuentro1_2).into(imageView2);
        Glide.with(this).load(R.drawable.encuentro1_3).into(imageView3);
        Glide.with(this).load(R.drawable.encuentro1_4).into(imageView4);
        Glide.with(this).load(R.drawable.encuentro1_5).into(imageView5);
        Glide.with(this).load(R.drawable.encuentro1_6).into(imageView6);
        Glide.with(this).load(R.drawable.encuentro1_7).into(imageView7);
        Glide.with(this).load(R.drawable.encuentro1_8).into(imageView8);
        Glide.with(this).load(R.drawable.encuentro1_9).into(imageView9);
        Glide.with(this).load(R.drawable.encuentro1_10).into(imageView10);

        return view;
    }
}
