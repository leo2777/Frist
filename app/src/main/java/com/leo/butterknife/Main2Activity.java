package com.leo.butterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.main2_edi)
    EditText main2Edi;
    @BindView(R.id.main2_btn)
    Button main2Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.main2_btn)
    public void onClick(){
        EventBus.getDefault().post(new Base(main2Edi.getText().toString()));
        finish();
    }
}
