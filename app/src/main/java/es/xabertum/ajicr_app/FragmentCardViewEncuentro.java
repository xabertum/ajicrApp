package es.xabertum.ajicr_app;import android.os.Bundle;import androidx.annotation.Nullable;import androidx.fragment.app.Fragment;import androidx.recyclerview.widget.LinearLayoutManager;import androidx.recyclerview.widget.LinearSmoothScroller;import androidx.recyclerview.widget.RecyclerView;import android.util.DisplayMetrics;import android.view.LayoutInflater;import android.view.View;import android.view.ViewGroup;import java.util.ArrayList;import java.util.List;public class FragmentCardViewEncuentro extends Fragment {    RecyclerView recyclerView;    RecyclerViewAdapaterEncuentros recyclerViewAdapaterEncuentros;    List<Encuentro> encuentrosList;    @Nullable    @Override    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {        View view = inflater.inflate(R.layout.recyclerview_cardview, container, false);        encuentrosList = new ArrayList<>();        recyclerView = view.findViewById(R.id.recyclerView);        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()) {            @Override            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int position) {                LinearSmoothScroller smoothScroller = new LinearSmoothScroller(getActivity()) {                    private static final float SPEED = 50f;// Change this value (default=25f)                    @Override                    protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {                        return SPEED / displayMetrics.densityDpi;                    }                };                smoothScroller.setTargetPosition(position);                startSmoothScroll(smoothScroller);            }        });        recyclerViewAdapaterEncuentros = new RecyclerViewAdapaterEncuentros(getActivity(), encuentrosList);        recyclerView.setAdapter(recyclerViewAdapaterEncuentros);        encuentrosList.add(              new Encuentro(                      "I Encuentro de Jóvenes Investigadores en Ciencias de las Religiones 2017",                      "En nombre del comité organizador del I Encuentro de Jóvenes Investigadores en Ciencias de las Religiones...",                      R.drawable.card_e1,                      1              )        );        encuentrosList.add(                new Encuentro(                        "II Encuentro de Jóvenes Investigadores en Ciencias de las Religiones 2019",                        "Lorem ipsum Lorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem ipsumLorem...",                        R.drawable.card_j4,                        2                )        );        return view;    }}