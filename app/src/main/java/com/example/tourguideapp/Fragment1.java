package com.example.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class Fragment1 extends Fragment {

    private Button btnone,btntwo,btnthree,btnfour;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment1,container,false);
        init(view);

        btnone.setOnClickListener((View v)-> {
                MainActivity myactivity=(MainActivity) getActivity();
                assert myactivity!=null;
                myactivity.setDisplay("The Ngorongoro Conservation Area (NCA) in northern Tanzania is home to one of the most spectacular safari experiences on the continent.\n" +"\n"+
                        "The famous Ngorongoro Crater — one of the new Seven Natural Wonders of Africa and the feature from which the NCA takes its name — is the world’s largest inactive and empty volcanic caldera, formed 2 to 3 million years ago. Around 25,000 large animals live in the 30,000-hectare crater, including lion, black rhino and elephant.");
        });

        btntwo.setOnClickListener((View v)-> {
            MainActivity myactivity=(MainActivity) getActivity();
            assert myactivity!=null;
            myactivity.setDisplay("One of Tanzania's largest parks is Mikumi National Park, located in the southeastern part of the country. On its own, Mikumi National Park covers roughly 1,250 square miles spread across the floodplain of the Mkata River. Just to the south of Mikumi is Africa's largest game reserve, the Selous, making this a particularly interesting place to see abundant wildlife.\n" +
                    "\n" +
                    "Animals you might see during a visit to Mikumi include lions, zebras, impala, buffalo, wildebeest, kudu, giraffe, elephants, baboons, and elands – the biggest antelope in the world. There have also been more than 400 bird species seen in the park, including lilac-breasted rollers, bateleur eagles, and yellow-throated longclaws.");
        });




        btnthree.setOnClickListener((View v)->{
                MainActivity myactivity=(MainActivity) getActivity();
                assert myactivity!=null;
                myactivity.setDisplay("Ranking as the 6th largest National Park in Tanzania and covering an area of 2,600 square kilometers, The Tarangire National Park is most popular for its large elephant herds and mini-wildlife migration that takes place during the dry season which sees about 250,000 animals enter the park.");
        });

        btnfour.setOnClickListener((View v)-> {
                MainActivity myactivity=(MainActivity) getActivity();
                assert myactivity!=null;
                myactivity.setDisplay("Chances are that you have dreamt of Africa, and when you did, you probably dreamt about the Serengeti. Countless wildlife movies have been recorded in the Serengeti, and with good reason: this is the home of the Great Migration and may very well be one of the last true natural wonders on planet earth.\n" +
                        "\n" +
                        "Serengeti National Park is a World Heritage Site teeming with wildlife: over 2 million ungulates, 4000 lions, 1000 leopard, 550 cheetahs and some 500 bird species inhabit an area close to 15,000 square kilometers in size. Join us on a safari and explore the endless Serengeti plains dotted with trees and kopjes from which majestic lions control their kingdom; gaze upon the Great Migration in awe or find an elusive leopard in a riverine forest. Or perhaps see everything from a bird’s-eye view and soar over the plains at sunrise during a hot air balloon safari. Accommodation options come in every price range - the sound of lions roaring at night is complimentary.");
        });

        return view;

    }
    private void init(View view){
        btnone=view.findViewById(R.id.ngorongoroButton);
        btntwo=view.findViewById(R.id.mikumiButton);
        btnthree=view.findViewById(R.id.tarangireButton);
        btnfour=view.findViewById(R.id.serengetiButton);
    }
}
