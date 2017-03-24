package xebia.ismail.e_learning.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import xebia.ismail.e_learning.R;

/**
 * Created by Admin on 5/25/2016.
 */
public class TabGeoCone extends Fragment {

    EditText radius, height,lukis;
    TextView tv_vol, tv_luas, tv_kel;
    Button hasil;

    double vol, luas, luasper;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.geometry_cone, container, false);

        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
