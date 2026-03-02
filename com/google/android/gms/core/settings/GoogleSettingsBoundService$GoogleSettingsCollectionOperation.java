package com.google.android.gms.core.settings;

import a;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import avzc;
import cjac;
import cjah;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import gfuy;
import ggdy;
import gged_interceptors;
import ggtj;
import java.util.List;

public final class GoogleSettingsBoundService.GoogleSettingsCollectionOperation extends avzc {
    @Override  // avzc
    public final void onHandleIntent(Intent intent0) {
        if("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent0.getAction()) && !GoogleSettingsBoundService.GoogleSettingsCollectionOperation.j(intent0, "GoogleSettingsBoundService")) {
            Bundle bundle0 = intent0.getExtras();
            gfuy.e(bundle0);
            ggdy ggdy0 = new ggdy();
            List list0 = cjah.a(bundle0);
            if(list0 != null) {
                for(Object object0: list0) {
                    ((Parcel)object0).setDataPosition(0);
                    ggdy0.i(((GoogleSettingsItem)GoogleSettingsItem.CREATOR.createFromParcel(((Parcel)object0))));
                    ((Parcel)object0).recycle();
                }
            }
            gged_interceptors gged0 = ggdy0.h();
            List list1 = GoogleSettingsBoundService.b;
            synchronized(list1) {
                if(list1.isEmpty()) {
                    ((ggtj)GoogleSettingsBoundService.a.j()).x("onGoogleSettingsCollected invoked without any pending clients.");
                }
                else {
                    try {
                        try {
                            for(Object object1: list1) {
                                ((cjac)object1).a(gged0);
                            }
                        }
                        catch(RemoteException remoteException0) {
                            a.ae(GoogleSettingsBoundService.a.j(), "RemoteException when attempting to return GoogleSettings items.", remoteException0);
                        }
                    }
                    catch(Throwable throwable1) {
                        GoogleSettingsBoundService.b.clear();
                        throw throwable1;
                    }
                    GoogleSettingsBoundService.b.clear();
                }
            }
        }
    }
}

