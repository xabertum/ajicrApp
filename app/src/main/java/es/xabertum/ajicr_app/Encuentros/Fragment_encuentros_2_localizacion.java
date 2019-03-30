package es.xabertum.ajicr_app.Encuentros;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import es.xabertum.ajicr_app.R;

public class Fragment_encuentros_2_localizacion extends Fragment implements OnMapReadyCallback {

    View encuentro_2_localizacion;
    GoogleMap mGoogleMap, mGoogleMap2, mGoogleMap3, mGoogleMap4;
    MapView mapView, mapView2, mapView3, mapView4;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        encuentro_2_localizacion = inflater.inflate(R.layout.fragment_encuentro_2_localizacion, null);

        return encuentro_2_localizacion;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mapView = (MapView) encuentro_2_localizacion.findViewById(R.id.mapView);
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
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(40.448922, -3.732564)).title("Sesiones Miércoles y Jueves, Edificio D."));

        mGoogleMap2 = googleMap;
        mGoogleMap2.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mGoogleMap2.addMarker(new MarkerOptions().position(new LatLng(40.448837, -3.730364)).title("Almuerzo, Edificio A, Facultad de Filología."));

        mGoogleMap3 = googleMap;
        mGoogleMap3.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mGoogleMap3.addMarker(new MarkerOptions().position(new LatLng(40.415634, -3.711268)).title("Sesión Viernes, Centro Sefarad-Israel"));

        mGoogleMap4 = googleMap;
        mGoogleMap4.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mGoogleMap4.addMarker(new MarkerOptions().position(new LatLng(40.435680, -3.717796)).title("Cena Jueves, Penalti Lounge Bar (Moncloa)"));

        CameraPosition facultadFilosofia = CameraPosition.builder().target(new LatLng(40.448922, -3.732564)).zoom(11).bearing(0).tilt(45).build();
        mGoogleMap.moveCamera(CameraUpdateFactory.newCameraPosition(facultadFilosofia));



    }
}
