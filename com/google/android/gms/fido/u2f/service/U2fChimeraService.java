package com.google.android.gms.fido.u2f.service;

import bbmq;
import bnfo;
import bnfq;
import bnfs;
import cjtg;
import cjtn;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggfp;

public final class U2fChimeraService extends cjtg {
    static final String[] a;
    private static final ggfp b;

    static {
        U2fChimeraService.b = ggfp.K("android.permission-group.LOCATION", "android.permission-group.STORAGE");
        U2fChimeraService.a = new String[]{"com.google.android.gms.fido.u2f.zeroparty.START", "com.google.android.gms.fido.u2f.privileged.START", "com.google.android.gms.fido.u2f.thirdparty.START"};
    }

    public U2fChimeraService() {
        super(new int[]{0x77, 0x76, 0x75}, U2fChimeraService.a, U2fChimeraService.b, 3, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        String s = getServiceRequest0.f;
        String s1 = getServiceRequest0.p;
        String s2 = getServiceRequest0.i.getString("ACTION_START_SERVICE");
        if("com.google.android.gms.fido.u2f.zeroparty.START".equals(s2)) {
            if(!bbmq.Y(this)) {
                throw new SecurityException("0P only API being called from outside GMSCore!");
            }
            cjtn0.c(new bnfs(this.l(), s, s1));
            return;
        }
        if("com.google.android.gms.fido.u2f.privileged.START".equals(s2)) {
            cjtn0.c(new bnfo(this.l(), s, s1));
            return;
        }
        if("com.google.android.gms.fido.u2f.thirdparty.START".equals(s2)) {
            cjtn0.c(new bnfq(this.l(), s, s1));
        }
    }
}

