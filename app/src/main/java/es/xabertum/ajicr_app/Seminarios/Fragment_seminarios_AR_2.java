package es.xabertum.ajicr_app.Seminarios;


import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import es.xabertum.ajicr_app.R;

public class Fragment_seminarios_AR_2 extends Fragment implements OnMapReadyCallback {

    GoogleMap mGoogleMap;
    MapView mapView;
    View jornadasV;
    ImageView imageViewPortada_j5;
    ImageView cartel_j5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {
        jornadasV = inflater.inflate(R.layout.fragment_seminarios_ar_2, null);
        jornadasV.setSaveFromParentEnabled(false);
        imageViewPortada_j5 = jornadasV.findViewById(R.id.imageViewPortada_j7);
        cartel_j5 = jornadasV.findViewById(R.id.cartelJornadas7);

        Glide.with(this).load(R.drawable.portada_s_ar_2).into(imageViewPortada_j5);
        Glide.with(this).load(R.drawable.cartel_seminario_ar_2).into(cartel_j5);

        TextView estatutosLink = jornadasV.findViewById(R.id.link_seminario_AR_2);
        estatutosLink.setMovementMethod(LinkMovementMethod.getInstance());

        return jornadasV;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mapView = (MapView) jornadasV.findViewById(R.id.mapView);
        if (mapView != null) {
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());
        mGoogleMap = googleMap;
        mGoogleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(40.436964, -3.685404)).title("O_LUMEN"));
        CameraPosition facultadFilosofia = CameraPosition.builder().target(new LatLng(40.436964, -3.685404)).zoom(15).bearing(0).tilt(45).build();
        mGoogleMap.moveCamera(CameraUpdateFactory.newCameraPosition(facultadFilosofia));

    }
}
