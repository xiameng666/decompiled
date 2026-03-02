package com.google.android.gms.ads.internal.state;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import bbsr;
import com.google.android.gms.ads.internal.reward.a;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class b implements Callable {
    public final e a;

    public b(e e0) {
        this.a = e0;
    }

    @Override
    public final Object call() {
        PackageInfo packageInfo0;
        Context context0 = a.a(this.a.d);
        Object object0 = new ArrayList();
        try {
            packageInfo0 = bbsr.b(context0).e(context0.getApplicationInfo().packageName, 0x1000);
            if(packageInfo0.requestedPermissions != null && packageInfo0.requestedPermissionsFlags != null) {
                goto label_4;
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return object0;
    label_4:
        for(int v = 0; v < packageInfo0.requestedPermissions.length; ++v) {
            if((packageInfo0.requestedPermissionsFlags[v] & 2) != 0) {
                ((ArrayList)object0).add(packageInfo0.requestedPermissions[v]);
            }
        }
        return object0;
    }
}

