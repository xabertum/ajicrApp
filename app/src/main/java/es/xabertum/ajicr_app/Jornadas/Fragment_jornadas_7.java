package es.xabertum.ajicr_app.Jornadas;


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

public class Fragment_jornadas_7 extends Fragment implements OnMapReadyCallback {

    GoogleMap mGoogleMap;
    MapView mapView;
    View jornadasVI;
    ImageView imageViewPortada_j7;
    ImageView cartel_j7;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {
        jornadasVI = inflater.inflate(R.layout.fragment_jornadas_6, null);
        jornadasVI.setSaveFromParentEnabled(false);
        imageViewPortada_j7 = jornadasVI.findViewById(R.id.imageViewPortada_j7);
        cartel_j7 = jornadasVI.findViewById(R.id.cartelJornadas7);

        Glide.with(this).load(R.drawable.portada_j7).into(imageViewPortada_j7);
        Glide.with(this).load(R.drawable.cartel_jornadas_7).into(cartel_j7);

        TextView estatutosLink = jornadasVI.findViewById(R.id.link_progama_j5);
        estatutosLink.setMovementMethod(LinkMovementMethod.getInstance());

        return jornadasVI;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mapView = (MapView) jornadasVI.findViewById(R.id.mapView);
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
