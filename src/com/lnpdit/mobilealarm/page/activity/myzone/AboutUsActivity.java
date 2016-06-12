package com.lnpdit.mobilealarm.page.activity.myzone;

import com.lnpdit.mobilealarm.R;
import com.lnpdit.mobilealarm.base.component.BaseActivity;
import com.lnpdit.mobilealarm.http.RdaResultPack;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutUsActivity extends BaseActivity{

    Context context;
    
    TextView aboutus_tv;
    Button back_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_aboutus);
        
        context = this;
        initView();
    }
 
    private void initView(){
        aboutus_tv = (TextView) findViewById(R.id.aboutus_tv);
        back_bt = (Button) findViewById(R.id.back_bt);
        back_bt.setOnClickListener(this);
        aboutus_tv.setText("        通信工程设计与勘察自动化系统主要是一种利用软、硬件相结合，在通信工程领域中实现设计与勘察自动化的智能系统，该系统通过采集器、智能终端与后台服务系统进行交互，针对通信工程中的不同专业实现勘察信息的自动化上传，实现无纸化勘察设计。");
    }
    @Override
    protected void onEventMainThread(RdaResultPack http) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onEvent(Object obj) {
        // TODO Auto-generated method stub
        super.onEvent(obj);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
        case R.id.back_bt:
            finish();
            break;
       
        default:
            break;
        }
    }

}
