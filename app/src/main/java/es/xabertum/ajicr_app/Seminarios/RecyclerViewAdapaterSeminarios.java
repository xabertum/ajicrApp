package es.xabertum.ajicr_app.Seminarios;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import es.xabertum.ajicr_app.R;

public class RecyclerViewAdapaterSeminarios extends RecyclerView.Adapter<RecyclerViewAdapaterSeminarios.SeminarioViewHolder>  {

    private Context mCtx;
    private List<Seminario> seminarioList;


    public RecyclerViewAdapaterSeminarios(Context mCtx, List<Seminario> seminarioList) {
        this.mCtx = mCtx;
        this.seminarioList = seminarioList;
    }

    @NonNull
    @Override
    public SeminarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_jornadas, viewGroup, false);
        SeminarioViewHolder seminarioViewHolder = new SeminarioViewHolder(view);

        return seminarioViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SeminarioViewHolder seminarioViewHolder, int i) {

        final Seminario seminario = seminarioList.get(i);
        seminarioViewHolder.cardTitle.setText(seminario.getCard_title());
        seminarioViewHolder.cardSubTitle.setText(seminario.getCard_subTitle());
        seminarioViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(seminario.getCard_image()));
        seminarioViewHolder.explorar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                AppCompatActivity activity = unwrap(v.getContext());

                switch (seminario.getId()) {
                    case 1: {
                        Fragment seminario_PR_1 = new Fragment_seminarios_PR_1();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, seminario_PR_1)
                                .addToBackStack(null).commit();
                        break;
                    }
                    case 2: {
                        Fragment seminario_AR_1 = new Fragment_seminarios_AR_1();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, seminario_AR_1)
                                .addToBackStack(null).commit();
                        break;
                    }

                    case 3: {
                        Fragment seminario_PR_2 = new Fragment_seminarios_PR_2();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, seminario_PR_2)
                                .addToBackStack(null).commit();
                        break;

                    }
                    case 4: {
                        Fragment seminario_AR_2 = new Fragment_seminarios_AR_2();
                        activity.getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container, seminario_AR_2)
                                .addToBackStack(null).commit();
                        break;

                    }
                }
            }
        });

     }

    @Override
    public int getItemCount() {
        return seminarioList.size();
    }

    class SeminarioViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        Button explorar;
        TextView cardTitle, cardSubTitle;

        public SeminarioViewHolder(@NonNull View itemView) {
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
