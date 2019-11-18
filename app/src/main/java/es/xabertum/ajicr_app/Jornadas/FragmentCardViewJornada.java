package es.xabertum.ajicr_app.Jornadas;import android.os.Bundle;import androidx.annotation.Nullable;import androidx.fragment.app.Fragment;import androidx.recyclerview.widget.LinearLayoutManager;import androidx.recyclerview.widget.LinearSmoothScroller;import androidx.recyclerview.widget.RecyclerView;import es.xabertum.ajicr_app.R;import android.util.DisplayMetrics;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import java.util.ArrayList;import java.util.List;public class FragmentCardViewJornada extends Fragment {    RecyclerView recyclerView;    RecyclerViewAdapater recyclerViewAdapater;    List<Jornada> jornadaList;    @Nullable    @Override    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {        getActivity().setTitle("AJICR - Jornadas");        View view = inflater.inflate(R.layout.recyclerview_cardview, container, false);        jornadaList = new ArrayList<>();        recyclerView = view.findViewById(R.id.recyclerView);        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()) {            @Override            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {                LinearSmoothScroller smoothScroller = new LinearSmoothScroller(getActivity()) {                    private static final float SPEED = 50f;// Change this value (default=25f)                    @Override                    protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {                        return SPEED / displayMetrics.densityDpi;                    }                };                smoothScroller.setTargetPosition(position);                startSmoothScroll(smoothScroller);            }        });        recyclerViewAdapater = new RecyclerViewAdapater(getActivity(), jornadaList);        recyclerView.setAdapter(recyclerViewAdapater);        jornadaList.add(                new Jornada(                        "VI Jornadas Universitarias de AJICR: “La Experiencia Siniestra”",                        "Desde AJICR y junto a la colaboración de Satanistas de España os presentamos nuestras próximas jornadas con el formato de seminario...",                        R.drawable.card_j7,                        7                )        );        jornadaList.add(                new Jornada(                        "Curso de Verano: “Visiones desde la Frontera“",                        "Desde la Asociación de Jóvenes Investigadores en Ciencias de las Religiones (AJICR) tenemos el honor de presentaros el evento que se organiza en...",                        R.drawable.card_j6,                        6                )        );        jornadaList.add(              new Jornada(                      "V Jornadas Universitarias de AJICR: “Política y Religiones”",                      "Religiones y Educación: ¿Por qué? ¿Cómo?",                      R.drawable.card_j5,                      1              )        );        jornadaList.add(                new Jornada(                        "IV Jornadas Universitarias de AJICR: “La muerte sale de fiesta”",                        "Con motivo de la tradicional festividad de los difuntos compartida en Occidente, la Asociación decidió...",                        R.drawable.card_j4,                        2                )        );        jornadaList.add(                new Jornada(                        "III Jornadas Universitarias de AJICR: “Arte y Religiones: Simbología y Espacios de Culto”",                        "A la luz de la incuestionable relevancia de los significados de los símbolos y manifestaciones artísticas...",                        R.drawable.card_j3,                        3                )        );        jornadaList.add(                new Jornada(                        "II Jornadas Universitarias de AJICR: “Voces de Religiones y de Políticas en la Esfera Pública”",                        "El día 7 de Junio de 2017 se han celebrado, en el Salón de Actos de la Facultad de Filología de la Universidad Complutense de Madrid...",                        R.drawable.card_j2,                        4                )        );        jornadaList.add(                new Jornada(                        "I Jornadas Universitarias de AJICR: RELIGIO.NET: Cibertecnología y creencias religiosas.",                        "Religio.Net nace como proyecto emergente de la voluntad de los miembros de la Asociación de Jóvenes Investigadores en Ciencias de las Religiones...",                        R.drawable.card_j1,                        5                )        );        return view;    }}