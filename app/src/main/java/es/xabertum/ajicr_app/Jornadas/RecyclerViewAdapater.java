package es.xabertum.ajicr_app.Jornadas;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import es.xabertum.ajicr_app.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class RecyclerViewAdapater extends RecyclerView.Adapter<RecyclerViewAdapater.JornadaViewHolder>  {

    private Context mCtx;
    private List<Jornada> jornadaList;


    public RecyclerViewAdapater(Context mCtx, List<Jornada> jornadaList) {
        this.mCtx = mCtx;
        this.jornadaList = jornadaList;
    }

    @NonNull
    @Override
    public JornadaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_jornadas, viewGroup, false);
        JornadaViewHolder jornadaViewHolder = new JornadaViewHolder(view);

        return jornadaViewHolder;
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

                AppCompatActivity activity = unwrap(v.getContext());

                switch (jornada.getId()) {
                    case 1: {
                        Fragment jornadas_5 = new Fragment_jornadas_v();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, jornadas_5)
                                .addToBackStack(null).commit();
                        break;
                    }
                    case 2: {
                        Fragment jornadas_4 = new Fragment_jornadas_4();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, jornadas_4)
                                .addToBackStack(null).commit();
                        break;
                    }
                    case 3: {
                        Fragment jornadas_3 = new Fragment_jornadas_3();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, jornadas_3)
                                .addToBackStack(null).commit();
                        break;

                    }
                    case 4: {
                        Fragment jornadas_2 = new Fragment_jornadas_2();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, jornadas_2)
                                .addToBackStack(null).commit();
                        break;
                    }
                    case 5: {
                        Fragment jornadas_1 = new Fragment_jornadas_1();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, jornadas_1)
                                .addToBackStack(null).commit();
                        break;
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

    private static AppCompatActivity unwrap(Context context) {
        while (!(context instanceof Activity) && context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }

        return (AppCompatActivity) context;
    }

}
