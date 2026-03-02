package com.google.android.gms.nnapi.drivermanager.service;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import android.content.Intent;
import android.opengl.GLUtils;
import avzf;
import bbcu;
import bboh;
import djqf;
import djqo;
import djqp;
import djqr;
import einq;
import evql;
import fhso;
import fhsp;
import fhsq;
import ggtj;
import gobv;
import hftr;

public class NnApiDriverManagerModuleInitIntentOperation extends avzf {
    public static final bboh a;

    static {
        NnApiDriverManagerModuleInitIntentOperation.a = bboh.b("NnApiDriverManager", bbcu.eS);
    }

    @Override  // avzf
    protected final void a(Intent intent0, boolean z) {
        this.e();
    }

    @Override  // avzf
    protected final void c(Intent intent0) {
        this.e();
    }

    @Override  // avzf
    protected final void d(Intent intent0, boolean z) {
        this.e();
    }

    private final void e() {
        fhsp fhsp0;
        String s = djqr.a();
        ((ggtj)NnApiDriverManagerModuleInitIntentOperation.a.h()).B("Registering application with chipset \'%s\'", s);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)djqf.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        djqf djqf0 = (djqf)hftp0.b_message;
        djqf0.b |= 1;
        djqf0.c = s;
        try {
            fhsp0 = fhsq.a();
        }
        catch(fhso fhso0) {
            ggtj ggtj0 = (ggtj)NnApiDriverManagerModuleInitIntentOperation.a.j();
            String s1 = GLUtils.getEGLErrorString(fhso0.a);
            ggtj0.H("Failed to get GPU info, EGL error %d: %s", fhso0.a, s1);
            fhsp0 = null;
        }
        if(fhsp0 != null) {
            ggtj ggtj1 = (ggtj)NnApiDriverManagerModuleInitIntentOperation.a.h();
            String s2 = fhsp0.e;
            String s3 = fhsp0.a;
            ggtj1.R("Registering application with GPU \'%s\' by \'%s\'", s3, s2);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s2.getClass();
            ((djqf)hftv0).b |= 2;
            ((djqf)hftv0).d = s2;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            djqf djqf1 = (djqf)hftp0.b_message;
            s3.getClass();
            djqf1.b |= 4;
            djqf1.e = s3;
        }
        hftr hftr0 = (hftr)((ProtoLiteMessage)gobv.a).v_newBuilder();
        djqf djqf2 = (djqf)hftp0.N_build();
        hftr0.n(djqf.f, djqf2);
        gobv gobv0 = (gobv)((ProtoLiteBuilder)hftr0).N_build();
        evql evql0 = new einq(this).cC("com.google.android.gms.nnapi.drivermanager", gobv0, ((djqf)hftp0.N_build()).toBytesArray());
        evql0.b(new djqo());
        evql0.A(new djqp());
    }
}

