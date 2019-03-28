package es.xabertum.ajicr_app.Encuentros;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import es.xabertum.ajicr_app.R;

public class fragment_encuentros_gallery extends Fragment {

    ImageView imageView1, imageView2, imageView3, imageView4;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_encuentros_gallery, container, false);






        return view;
    }
}
