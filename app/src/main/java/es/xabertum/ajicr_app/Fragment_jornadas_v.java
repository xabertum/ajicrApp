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
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Fragment_jornadas_v extends Fragment implements OnMapReadyCallback {

    GoogleMap mGoogleMap;
    MapView mapView;
    View jornadasV;
    ImageView imageViewPortada_j5;
    ImageView cartel_j5;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {
        jornadasV = inflater.inflate(R.layout.fragment_jornadas_v, null);
        jornadasV.setSaveFromParentEnabled(false);
        imageViewPortada_j5 = jornadasV.findViewById(R.id.imageViewPortada_j5);
        cartel_j5 = jornadasV.findViewById(R.id.cartelJornadasV);

        Glide.with(this).load(R.drawable.portada_j5).into(imageViewPortada_j5);
        Glide.with(this).load(R.drawable.cartel_jornadas_5).into(cartel_j5);

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
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(40.448837, -3.730364)).title("Facultad de Filosofía UCM"));
        CameraPosition facultadFilosofia = CameraPosition.builder().target(new LatLng(40.448837, -3.730364)).zoom(15).bearing(0).tilt(45).build();
        mGoogleMap.moveCamera(CameraUpdateFactory.newCameraPosition(facultadFilosofia));

    }
}
