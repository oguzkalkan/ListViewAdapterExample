package com.asktroapp.myapplication.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.asktroapp.myapplication.R;

/**
 * Created by mobiltek26 on 9/6/16.
 */
public class PurposesInFragment extends Fragment {


    public String[] PurposesIn = {"İstanbul Hatırası", "Kitap Hırsızı", "Olasılıksız"};
    ListView listView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.purposesin_fragment, container, false);

        listView = (ListView) view.findViewById(R.id.PurposesInLV);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>
                (getActivity(), android.R.layout.simple_list_item_1, android.R.id.text1, PurposesIn);


        listView.setAdapter(dataAdapter);

        return view;
    }

}
