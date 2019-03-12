package es.xabertum.ajicr_app;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    @Override
    public void onBindViewHolder(@NonNull JornadaViewHolder jornadaViewHolder, int i) {
        Jornada jornada = jornadaList.get(i);

        jornadaViewHolder.cardTitle.setText(jornada.getCard_title());
        jornadaViewHolder.cardSubTitle.setText(jornada.getCard_subTitle());
        jornadaViewHolder.imageView.setImageDrawable(mCtx.getResources().getDrawable(jornada.getCard_image()));

    }

    @Override
    public int getItemCount() {
        return jornadaList.size();
    }

    class JornadaViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView cardTitle, cardSubTitle;

        public JornadaViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.cardImage);
            cardTitle = itemView.findViewById(R.id.cardTitle);
            cardSubTitle = itemView.findViewById(R.id.cardSubTitle);

        }
    }


}
