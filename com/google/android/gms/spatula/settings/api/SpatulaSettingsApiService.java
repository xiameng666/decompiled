package com.google.android.gms.spatula.settings.api;

import bbcu;
import bboh;
import cjtn;
import cjts;
import com.google.android.gms.common.internal.GetServiceRequest;
import errp;
import ersh;
import ersm;
import ersw;
import ersx;
import ersz;
import erta;
import ertf;
import ertg;
import ervc;
import ggfn;
import ggfp;
import ggtj;
import hykh;
import ibnf;
import ibuq;
import java.util.Collections;

public final class SpatulaSettingsApiService extends errp {
    public static final ggfp a;
    public ibnf b;
    public ibnf c;
    public ibnf d;
    public ibnf m;
    public ibnf n;
    private static final bboh o;

    static {
        ggfn ggfn0 = new ggfn();
        ggfn0.i("com.google.android.apps.messaging");
        ggfn0.i("com.google.android.gms.kids");
        ggfn0.i("com.google.android.gms.supervision");
        ggfn0.k(hykh.a.b().b().b);
        ggfp ggfp0 = ggfn0.h();
        ibuq.e(ggfp0, "build(...)");
        SpatulaSettingsApiService.a = ggfp0;
        SpatulaSettingsApiService.o = bboh.b("SpatulaSettingsApiService", bbcu.gt);
    }

    public SpatulaSettingsApiService() {
        super(386, "com.google.android.gms.spatula.settings.api.SpatulaSettingsApiService.START", Collections.EMPTY_SET, 0, 10, SpatulaSettingsApiService.a);
    }

    @Override  // cjtg
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        ibuq.f(getServiceRequest0, "request");
        ibnf ibnf0 = null;
        if(hykh.c()) {
            cjts cjts0 = this.l();
            ibnf ibnf1 = this.b;
            if(ibnf1 == null) {
                ibuq.j("spatulaAvailabilityProvider");
                ibnf1 = null;
            }
            Object object0 = ibnf1.get();
            ibnf ibnf2 = this.c;
            if(ibnf2 == null) {
                ibuq.j("spatulaSettingPreferenceProvider");
                ibnf2 = null;
            }
            ersz ersz0 = ((erta)ibnf2).a();
            ibnf ibnf3 = this.d;
            if(ibnf3 == null) {
                ibuq.j("spatulaSettingDefaultValueProvider");
                ibnf3 = null;
            }
            ersw ersw0 = ((ersx)ibnf3).a();
            ibnf ibnf4 = this.m;
            if(ibnf4 == null) {
                ibuq.j("deviceStateProvider");
                ibnf4 = null;
            }
            Object object1 = ibnf4.get();
            ibuq.e(object1, "get(...)");
            ibnf ibnf5 = this.n;
            if(ibnf5 == null) {
                ibuq.j("spatulaSettingsPreferenceSetter");
            }
            else {
                ibnf0 = ibnf5;
            }
            ertf ertf0 = ((ertg)ibnf0).a();
            String s = getServiceRequest0.f;
            ibuq.e(s, "getCallingPackage(...)");
            cjtn0.c(new ervc(cjts0, ((ersm)object0), ersz0, ersw0, ((ersh)object1), ertf0, s, getServiceRequest0.p));
            return;
        }
        ((ggtj)SpatulaSettingsApiService.o.j()).x("SpatulaSettingsAPIService has not launched");
        cjtn0.a(16, null);
    }
}

