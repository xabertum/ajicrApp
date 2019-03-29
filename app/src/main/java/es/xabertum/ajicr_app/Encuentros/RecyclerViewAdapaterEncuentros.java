package es.xabertum.ajicr_app.Encuentros;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import es.xabertum.ajicr_app.Jornadas.Fragment_jornadas_4;
import es.xabertum.ajicr_app.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapaterEncuentros extends RecyclerView.Adapter<RecyclerViewAdapaterEncuentros.EncuentroViewHolder>  {

    private Context mCtx;
    private List<Encuentro> encuentroList;


    public RecyclerViewAdapaterEncuentros(Context mCtx, List<Encuentro> encuentroList) {
        this.mCtx = mCtx;
        this.encuentroList = encuentroList;
    }

    @NonNull
    @Override
    public EncuentroViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_jornadas, viewGroup, false);
        EncuentroViewHolder encuentroViewHolder = new EncuentroViewHolder(view);

        return encuentroViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull EncuentroViewHolder encuentroViewHolder, int i) {

        final Encuentro encuentro = encuentroList.get(i);
        encuentroViewHolder.cardTitle.setText(encuentro.getCard_title());
        encuentroViewHolder.cardSubTitle.setText(encuentro.getCard_subTitle());
        encuentroViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(encuentro.getCard_image()));
        encuentroViewHolder.explorar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AppCompatActivity activity = unwrap(v.getContext());

                switch (encuentro.getId()) {
                    case 1: {
                        Fragment encuentros_1 = new ViewPagerEncuentros1();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, encuentros_1)
                                .addToBackStack(null).commit();
                        break;
                    }
                    case 2: {
                        Fragment encuentros_2 = new ViewPagerEncuentros2();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, encuentros_2)
                                .addToBackStack(null).commit();
                        break;
                    }
                }
            }
        });

     }

    @Override
    public int getItemCount() {
        return encuentroList.size();
    }

    class EncuentroViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        Button explorar;
        TextView cardTitle, cardSubTitle;

        public EncuentroViewHolder(@NonNull View itemView) {
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
