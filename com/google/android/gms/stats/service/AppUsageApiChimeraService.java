package com.google.android.gms.stats.service;

import acns;
import android.text.TextUtils.SimpleStringSplitter;
import cjtg;
import cjtn;
import com.google.android.gms.chimera.modules.stats.AppContextProvider;
import com.google.android.gms.common.internal.GetServiceRequest;
import hymr;
import java.util.Collections;

public class AppUsageApiChimeraService extends cjtg {
    public AppUsageApiChimeraService() {
        super(0xC1, "com.google.android.gms.appusage.service.START", Collections.EMPTY_SET, 1, 10);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        String s1 = hymr.a.b().f();
        TextUtils.SimpleStringSplitter textUtils$SimpleStringSplitter0 = new TextUtils.SimpleStringSplitter(',');
        textUtils$SimpleStringSplitter0.setString(s1);
        for(Object object0: textUtils$SimpleStringSplitter0) {
            if(!((String)object0).equals(s)) {
                continue;
            }
            if(AppContextProvider.a().getPackageManager().checkPermission("android.permission.PACKAGE_USAGE_STATS", s) != 0) {
                cjtn0.a(16, null);
            }
            goto label_12;
        }
        cjtn0.a(16, null);
    label_12:
        cjtn0.c(new acns(this.l(), getServiceRequest0.f, getServiceRequest0.p));
    }
}

