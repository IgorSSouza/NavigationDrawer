package com.example.navigationdrawer.ui.sobre;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdrawer.R;

import mehdi.sakout.aboutpage.AboutPage;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return new AboutPage(getActivity())

                .setImage(R.drawable.logo)
                


                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um Email")
                .addWebsite("https://www.google.com.br/", "Acesse o nosso site!")

                .addGroup("Redes sociais")
                .addFacebook("igorsouza", "Facebook")
                .addInstagram("igor_souza16" , "Instagram")
                .addYoutube("igorsouza", "Youtube")


                .create();

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }

}
