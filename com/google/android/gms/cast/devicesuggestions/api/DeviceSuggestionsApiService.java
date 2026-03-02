package com.google.android.gms.cast.devicesuggestions.api;

import auds;
import aueg;
import aufd;
import auop;
import avij;
import bbcu;
import bboh;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggnj;
import ggtj;
import hfuo;
import ibuk;
import ibuq;

public final class DeviceSuggestionsApiService extends cjtg {
    public static final bboh a;

    static {
        String s = new ibuk(DeviceSuggestionsApiService.class).c();
        DeviceSuggestionsApiService.a = bboh.c("device_suggestions", bbcu.gU, s);
    }

    public DeviceSuggestionsApiService() {
        super(0x1B0, "com.google.android.gms.cast.devicesuggestions.api.DeviceSuggestionsApiService.START", ggnj.a, 3, 10);
    }

    @Override  // cjtg
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ibuq.f(getServiceRequest0, "request");
        String s = getServiceRequest0.f;
        if(aufd.c(this)) {
            ibuq.c(s);
            ibuq.f(s, "clientAppName");
            hfuo hfuo0 = avij.e().f().b;
            ibuq.e(hfuo0, "getElementList(...)");
            if(hfuo0.isEmpty() || !aufd.a() && !hfuo0.contains(s)) {
                ((ggtj)aufd.a.h()).B("App %s is not in allowlist for device suggestions.", s);
            }
            else if(aufd.f(this, s)) {
                aueg aueg0 = auds.a;
                if(!aueg0.e.get()) {
                    cjtn0.a(16, null);
                    return;
                }
                cjtn0.c(new auop(s, aueg0));
                return;
            }
        }
        cjtn0.a(16, null);
    }
}

