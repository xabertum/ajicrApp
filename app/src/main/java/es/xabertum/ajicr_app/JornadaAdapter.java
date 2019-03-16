package es.xabertum.ajicr_app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class JornadaAdapter extends RecyclerView.Adapter<JornadaAdapter.JornadaViewHolder>  {

    private Context mCtx;
    private List<Jornada> jornadaList;

    public JornadaAdapter(Context mCtx, List<Jornada> jornadaList) {
        this.mCtx = mCtx;
        this.jornadaList = jornadaList;
    }

    @NonNull
    @Override
    public JornadaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_jornadas, null);
        return new JornadaViewHolder(view);
    }

    private static AppCompatActivity unwrap(Context context) {
        while (!(context instanceof Activity) && context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }

        return (AppCompatActivity) context;
    }

    @Override
    public void onBindViewHolder(@NonNull JornadaViewHolder jornadaViewHolder, int i) {
        final Jornada jornada = jornadaList.get(i);

        jornadaViewHolder.cardTitle.setText(jornada.getCard_title());
        jornadaViewHolder.cardSubTitle.setText(jornada.getCard_subTitle());
        jornadaViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(jornada.getCard_image()));

        jornadaViewHolder.explorar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                switch (jornada.getId()) {
                    case 1: {
                        AppCompatActivity activity = unwrap(v.getContext());
                        Fragment jornadasV = new Fragment_jornadas_v();
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, jornadasV).addToBackStack(null).commit();
                    }
                    case 2: {
                        AppCompatActivity activity = unwrap(v.getContext());
                        Fragment jornadas_4 = new Fragment_jornadas_4();
                        activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, jornadas_4).addToBackStack(null).commit();
                    }

                }



            }
        });





    }

    @Override
    public int getItemCount() {
        return jornadaList.size();
    }

    class JornadaViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        Button explorar;
        TextView cardTitle, cardSubTitle;

        public JornadaViewHolder(@NonNull View itemView) {
            super(itemView);

            explorar = itemView.findViewById(R.id.btn_explorar);
            imageView = itemView.findViewById(R.id.cardImage);
            cardTitle = itemView.findViewById(R.id.cardTitle);
            cardSubTitle = itemView.findViewById(R.id.cardSubTitle);

        }
    }


}
