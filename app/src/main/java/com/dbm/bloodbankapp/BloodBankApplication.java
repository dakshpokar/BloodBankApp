package com.dbm.bloodbankapp;

import android.app.Application;

import com.mmi.LicenceManager;

public class BloodBankApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LicenceManager.getInstance().setRestAPIKey("nnrh9qrut667yujhhc6j5t8rx2mhl3h8");
        LicenceManager.getInstance().setMapSDKKey("2kommrhfwmm7shzm5559xod8qyond5uq");
    }
}
