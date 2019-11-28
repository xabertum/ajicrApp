package es.xabertum.ajicr_app;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_contacto extends Fragment {

    ImageView icon1, icon2, icon3, icon4, icon5, icon6;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState ) {

        getActivity().setTitle("AJICR - Contacto");

        View contactoView = inflater.inflate(R.layout.fragment_contacto, null);

        icon1 = contactoView.findViewById(R.id.instagram);
        icon2 = contactoView.findViewById(R.id.twitter);
        icon3 =contactoView.findViewById(R.id.facebook);
        icon4 = contactoView.findViewById(R.id.linkedin);
        icon5 = contactoView.findViewById(R.id.gmail);
        icon6 = contactoView.findViewById(R.id.website);

        Glide.with(this).load(R.drawable.instagramicon).into(icon1);
        Glide.with(this).load(R.drawable.twittericon).into(icon2);
        Glide.with(this).load(R.drawable.facebook_icon).into(icon3);
        Glide.with(this).load(R.drawable.squarelinkedin).into(icon4);
        Glide.with(this).load(R.drawable.gmailicon).into(icon5);
        Glide.with(this).load(R.drawable.webicon).into(icon6);

        TextView instagramLink = contactoView.findViewById(R.id.instragramLink);
        instagramLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView facebookLink = contactoView.findViewById(R.id.facebookLink);
        facebookLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView twitterLink = contactoView.findViewById(R.id.twitterLink);
        twitterLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linkedinLink = contactoView.findViewById(R.id.linkedinLink);
        linkedinLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView gmailLink = contactoView.findViewById(R.id.gmailLink);
        gmailLink.setMovementMethod(LinkMovementMethod.getInstance());

        TextView websiteLink = contactoView.findViewById(R.id.websiteLink);
        websiteLink.setMovementMethod(LinkMovementMethod.getInstance());


        return contactoView;
    }

}
