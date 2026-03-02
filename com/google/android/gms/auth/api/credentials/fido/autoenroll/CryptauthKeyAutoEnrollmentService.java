package com.google.android.gms.auth.api.credentials.fido.autoenroll;

import afkh;
import afoy;
import afxs;
import agff;
import bxlw;
import cllr;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import gmbu;
import gmcd;

public class CryptauthKeyAutoEnrollmentService extends GmsTaskBoundService {
    public static final int a;

    @Override  // com.google.android.gms.libs.scheduler.GmsTaskBoundService
    public final gmcd iL(cllr cllr0) {
        String s = cllr0.b == null ? null : cllr0.b.getString("intent_action");
        if(s != null) {
            agff agff0 = (agff)afxs.a.mr();
            agff0.v();
            return agff0.l(afoy.a.v(), s).c().k(new afkh()).e(new bxlw(Exception.class).c(Integer.valueOf(2)));
        }
        return gmbu.i(Integer.valueOf(2));
    }
}

