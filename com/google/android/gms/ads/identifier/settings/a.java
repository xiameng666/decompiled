package com.google.android.gms.ads.identifier.settings;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import azox;
import azqi;
import azqk;
import bbic;
import java.io.IOException;

public final class a {
    public static azox a(Context context0) {
        try {
            context0.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new azqi(9);
        }
        try {
            azqk.k(context0);
        }
        catch(azqi azqi0) {
            throw new IOException(azqi0);
        }
        azox azox0 = new azox();
        Intent intent0 = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent0.setPackage("com.google.android.gms");
        if(bbic.a().d(context0, intent0, azox0, 1)) {
            return azox0;
        }
        throw new IOException("Connection failure");
    }
}

