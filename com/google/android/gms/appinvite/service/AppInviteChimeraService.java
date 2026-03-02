package com.google.android.gms.appinvite.service;

import acbb;
import acbk;
import acbp;
import acbq;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import baqr;
import bbcu;
import bboh;
import bbql;
import cjtg;
import cjtn;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggtj;
import hour;
import java.util.HashSet;

@Deprecated
public class AppInviteChimeraService extends cjtg {
    static final String[] a;
    private static final bboh b;
    private acbk c;
    private acbb d;

    static {
        AppInviteChimeraService.a = new String[]{"com.google.android.gms.appinvite.service.START", "com.google.android.gms.appinvite.service.START_INTERNAL"};
        AppInviteChimeraService.b = bboh.b("AppInvite", bbcu.aK);
    }

    public AppInviteChimeraService() {
        HashSet hashSet0 = new HashSet();
        super(new int[]{77, 106}, AppInviteChimeraService.a, hashSet0, 3, 9);
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        if(hour.f()) {
            ((ggtj)AppInviteChimeraService.b.i()).x("AppInviteChimeraServiceDisabled");
            cjtn0.a(16, null);
            return;
        }
        if(this.c == null) {
            this.c = acbk.a(this);
        }
        if(this.d == null) {
            this.d = new acbb(this.getApplicationContext());
        }
        switch(getServiceRequest0.d) {
            case 77: {
                String s = getServiceRequest0.f;
                String s1 = getServiceRequest0.i.getString("authPackage");
                if("com.google.android.gms".equals(s1)) {
                    AppInviteChimeraService.b();
                }
                else if(!s.equals(s1)) {
                    throw new SecurityException("invalid authPackage");
                }
                baqr baqr0 = new baqr();
                baqr0.a = Binder.getCallingUid();
                baqr0.d = s;
                baqr0.e = "com.google.android.gms";
                cjtn0.c(new acbq(this.l(), baqr0, this.c, this.d));
                return;
            }
            case 106: {
                AppInviteChimeraService.b();
                baqr baqr1 = new baqr();
                baqr1.e = "com.google.android.gms";
                baqr1.a = Binder.getCallingUid();
                baqr1.c = getServiceRequest0.j;
                baqr1.b = getServiceRequest0.a();
                String s2 = getServiceRequest0.i.getString("realClientPackage");
                if(TextUtils.isEmpty(s2)) {
                    s2 = getServiceRequest0.f;
                }
                baqr1.d = s2;
                Scope[] arr_scope = getServiceRequest0.h;
                if(arr_scope != null) {
                    baqr1.n(bbql.d(arr_scope));
                }
                cjtn0.c(new acbp(this.l(), baqr1, this.c));
                return;
            }
            default: {
                cjtn0.a(16, null);
            }
        }
    }

    static void b() {
        if(Process.myUid() == Binder.getCallingUid()) {
            return;
        }
        throw new SecurityException("Calling uid not permitted.");
    }
}

