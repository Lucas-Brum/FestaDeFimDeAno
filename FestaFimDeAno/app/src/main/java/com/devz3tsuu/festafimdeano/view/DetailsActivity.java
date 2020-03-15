package com.devz3tsuu.festafimdeano.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.devz3tsuu.festafimdeano.R;
import com.devz3tsuu.festafimdeano.data.SecuretyPreferences;

import constant.FimDeAnoContants;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    private SecuretyPreferences mSecuretyPreferences;


    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        this.mSecuretyPreferences = new SecuretyPreferences(this);

        this.mViewHolder.checkParticipate = findViewById(R.id.check_participate);
        this.mViewHolder.checkParticipate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.check_participate){
            if(this.mViewHolder.checkParticipate.isChecked()) {
                //Salva a presença
                this.mSecuretyPreferences.storedString(FimDeAnoContants.PRESENCE_KEY, FimDeAnoContants.CONFIRMATION_YES);
            }
            else{
                //Salva a ausencia
                this.mSecuretyPreferences.storedString(FimDeAnoContants.PRESENCE_KEY, FimDeAnoContants.CONFIRMATION_NO);

            }
        }
    }

    private static class ViewHolder {
        CheckBox checkParticipate;
    }

}
