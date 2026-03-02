package com.google.android.gms.auth.blockstore.restorecredential.service;

import a;
import aink;
import aiqb;
import aiqy;
import aiqz;
import aisi;
import aisv;
import aith;
import aiti;
import aitj;
import aitk;
import aitl;
import aitm;
import aiuc;
import aiwh;
import aiyg;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import bbmq;
import bboh;
import cjtg;
import cjtn;
import cjts;
import com.google.android.gms.auth.blockstore.service.BlockstoreApiChimeraService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.GetServiceRequest;
import ggtj;
import hpsk;
import ibnn;
import ibnz;
import ibuq;
import java.util.Collections;

public final class RestoreCredentialApiChimeraService extends cjtg {
    public final ibnn a;
    public static final int b;
    private static final bboh c;
    private final ibnn d;
    private final ibnn m;
    private final ibnn n;
    private final ibnn o;
    private final ibnn p;

    static {
        RestoreCredentialApiChimeraService.c = aiqz.b("RestoreCredentialApiChimeraService");
    }

    public RestoreCredentialApiChimeraService() {
        super(381, "com.google.android.gms.auth.blockstore.restorecredential.service.START_RESTORE_CRED", Collections.EMPTY_SET, 3, 10);
        this.a = new ibnz(new aith(this));
        this.d = new ibnz(new aiti(this));
        this.m = new ibnz(new aitj(this));
        this.n = new ibnz(new aitk());
        this.o = new ibnz(new aitl(this));
        this.p = new ibnz(new aitm());
    }

    @Override  // cjtg
    protected final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        Signature[] arr_signature1;
        Signature[] arr_signature;
        String s;
        ibuq.f(getServiceRequest0, "request");
        if(hpsk.d()) {
            try {
                s = getServiceRequest0.f;
                arr_signature = BlockstoreApiChimeraService.b(this, s);
                ibuq.e(arr_signature, "getPackageSignatures(...)");
                arr_signature1 = BlockstoreApiChimeraService.b(this, "com.google.android.gms");
                ibuq.e(arr_signature1, "getPackageSignatures(...)");
            }
            catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
                a.ae(RestoreCredentialApiChimeraService.c.j(), "Calling package not found by package manager.", packageManager$NameNotFoundException0);
                cjtn0.a(Status.d.i, null);
                return;
            }
            aiqy aiqy0 = this.b();
            Object object0 = this.o.a();
            ibuq.e(object0, "getValue(...)");
            aink aink0 = new aink(aiqy0, ((aiwh)object0), ((aiuc)this.d.a()), this.c(), ((aiqb)this.p.a()), "com.google.android.gms", arr_signature1, this);
            boolean z = bbmq.R(this, s);
            cjts cjts0 = this.l();
            ibuq.c(s);
            PackageManager packageManager0 = this.getPackageManager();
            ibuq.e(packageManager0, "getPackageManager(...)");
            cjtn0.c(new aisv(cjts0, new aisi(aink0, s, arr_signature, packageManager0, z, this.b())));
            return;
        }
        ((ggtj)RestoreCredentialApiChimeraService.c.h()).x("Restore Credential flag is disabled.");
        cjtn0.a(16, null);
    }

    public final aiqy b() {
        Object object0 = this.m.a();
        ibuq.e(object0, "getValue(...)");
        return (aiqy)object0;
    }

    public final aiyg c() {
        Object object0 = this.n.a();
        ibuq.e(object0, "getValue(...)");
        return (aiyg)object0;
    }
}

