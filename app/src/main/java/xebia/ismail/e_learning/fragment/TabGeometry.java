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
import android.widget.Toast;

import xebia.ismail.e_learning.R;

/**
 * Created by Admin on 5/25/2016.
 */
public class TabGeometry extends Fragment {

    EditText side;
    TextView tv_vol, tv_luas, tv_kel;
    Button hasil;

    double vol, luas, kel;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.geometry_cube, container, false);
        hasil = (Button) v.findViewById(R.id.has);

        side = (EditText) v.findViewById(R.id.side);
        tv_vol = (TextView) v.findViewById(R.id.volume);
        tv_luas = (TextView) v.findViewById(R.id.area);
        tv_kel = (TextView)v.findViewById(R.id.kel);

        hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (side.getText().toString().trim().length() == 0) {
                    Toast.makeText(getContext(), "Diisi dulu dong", Toast.LENGTH_SHORT).show();
                } else {
                    double edit1 = Double.valueOf(side.getText().toString());
                    vol = edit1 * edit1 * edit1;
                    luas = 6 * edit1 * edit1;
                    kel = 12*edit1;
                    tv_vol.setText(String.valueOf(vol));
                    tv_luas.setText(String.valueOf(luas));
                    tv_kel.setText(String.valueOf(kel));
                }
            }
        });

        return v;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}

