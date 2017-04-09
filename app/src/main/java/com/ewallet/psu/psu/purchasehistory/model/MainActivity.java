package com.ewallet.psu.psu.purchasehistory.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ewallet.psu.psu.R;
import com.ewallet.psu.psu.manager.ProfileManager;
import com.ewallet.psu.psu.pay.view.model.Pay;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.nameee);
        btn = (Button) findViewById(R.id.btnGetPlayer);

        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnGetPlayer) {
            String productId = "11";
            Call<Pay> call = ProfileManager.getPayApi().getPlayer();
            call.enqueue(new Callback<Pay>() {
                @Override
                public void onResponse(Call<Pay> call, Response<Pay> response) {
                    Pay pay = response.body();
                    if(pay != null) {
                        textView.setText(pay.getProductName());
                    }
                }

                @Override
                public void onFailure(Call<Pay> call, Throwable t) {
                    Log.d("sddfdfd", "onFailure: kkkkk");

                }
            });
        }
    }
}
