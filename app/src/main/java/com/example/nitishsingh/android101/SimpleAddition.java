package com.example.nitishsingh.android101;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Nitish Singh on 01-08-2017.
 */

public class SimpleAddition extends Fragment {
    //declaration
    EditText num1, num2;
    Button add;
    TextView txt;
    int res;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_main, container, false);
        num1 = (EditText) view.findViewById(R.id.editText2);
        num2 = (EditText) view.findViewById(R.id.editText3);
        add = (Button) view.findViewById(R.id.button2);
        txt = (TextView) view.findViewById(R.id.textView2);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myNum1=num1.getText().toString();
                int mNum1=Integer.parseInt(myNum1);
                String myNum2=num2.getText().toString();
                int mNum2=Integer.parseInt(myNum2);
                //adding to no
                res=mNum1+mNum2;
                txt.setText(Integer.toString(res));
            }
        });
        return view;

    }

}