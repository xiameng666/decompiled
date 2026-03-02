package com.google.android.gms.maps.auth;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import azqk;
import bbnp;
import ccze;
import chfs;
import com.google.android.chimera.Service;
import cpny;
import cpnz;
import cpoa;
import gjak;
import glxu;
import glxv;
import hvcr;
import j..time.Duration;
import java.util.concurrent.TimeUnit;

public class ApiTokenChimeraService extends Service {
    public static final Duration a;
    public chfs b;
    public cpoa c;
    public glxv d;
    public final cpny e;
    private final cpnz f;

    static {
        ApiTokenChimeraService.a = Duration.ofDays(5L);
        TimeUnit.SECONDS.toMillis(30L);
    }

    public ApiTokenChimeraService() {
        this(cpny.a, null, glxu.a);
    }

    public ApiTokenChimeraService(cpny cpny0, cpoa cpoa0, glxv glxv0) {
        this.d = glxu.a;
        this.f = new cpnz(this);
        this.e = cpny0;
        this.c = cpoa0;
        this.d = glxv0;
    }

    public static Bundle a(short v) {
        Bundle bundle0 = new Bundle(1);
        bundle0.putShort("ERROR_CODE", v);
        return bundle0;
    }

    public final void b(int v) {
        ProtoLiteMessage hftv0;
        if(hvcr.e()) {
            Context context0 = this.getApplicationContext();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gjak.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp0.b_message;
            ((gjak)hftv1).f = 4001;
            ((gjak)hftv1).b |= 0x2000;
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp0.b_message;
            ((gjak)hftv2).b |= 0x10000;
            ((gjak)hftv2).g = v - 1;
            if(!hftv2.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjak.b(((gjak)hftp0.b_message));
            int v1 = azqk.a(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gjak gjak0 = (gjak)hftp0.b_message;
            gjak0.b |= 0x40;
            gjak0.d = v1;
            if(bbnp.l(context0)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjak)hftp0.b_message).e = 8;
            }
            else if(bbnp.k(context0)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjak)hftp0.b_message).e = 1;
            }
            else if(bbnp.n(context0)) {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjak)hftp0.b_message).e = 2;
            }
            else {
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((gjak)hftp0.b_message).e = 0;
            }
            ((gjak)hftp0.b_message).b |= 0x200;
            hftv0 = (gjak)hftp0.N_build();
        }
        else {
            hftv0 = null;
        }
        if(ccze.b(this.b) && hftv0 != null) {
            this.b.j(hftv0);
        }
    }

    @Override  // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent0) {
        return this.f;
    }

    @Override  // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent0) {
        return false;
    }
}

