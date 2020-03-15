package com.devz3tsuu.festafimdeano.data;

import android.content.Context;
import android.content.SharedPreferences;

public class SecuretyPreferences {

    private  SharedPreferences mSharedPreferences;

    public SecuretyPreferences(Context mContext){
        this.mSharedPreferences = mContext.getSharedPreferences("FestaFimAno", mContext.MODE_PRIVATE);
    }
    public void storedString(String key, String value) {
        this.mSharedPreferences.edit().putString(key, value).apply();
    }
    public String getStoredString(String key){
        return this.mSharedPreferences.getString(key,"");
    }

}
