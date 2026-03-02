package com.google.android.gms.auth.api.credentials.fido.registration.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import acp;
import adu;
import aeok;
import aeom;
import aeqg;
import aezj;
import afgg;
import afgi;
import afli;
import aflx;
import aflz;
import agcm;
import agcn;
import agdb;
import agdc;
import agdd;
import agde;
import agdf;
import agdg;
import aggi;
import ahmr;
import ahna;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import bauc;
import bboh;
import bbqa;
import bxoc;
import bxod;
import bxol;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fm;
import fyhn;
import gfqx;
import gfsx;
import gftm;
import giwa;
import gixp;
import gixr;
import hpkt;
import hpob;
import j..util.Objects;
import kjb;
import kle;
import kwr;
import kws;
import kwv;
import lso;
import xni;

@GmsCoreVeId(0x3EC71)
public final class RegistrationChimeraActivity extends xni {
    public agcn j;
    public static final int k;
    private static final bboh l;
    private bxod m;
    private String n;
    private RegistrationOptions o;

    static {
        RegistrationChimeraActivity.l = aggi.b("RegistrationChimeraActivity");
    }

    // Detected as a lambda impl.
    public final void a(aeom aeom0) {
        Intent intent0;
        if(hpob.e() && ahmr.a(this.o)) {
            aeom0 = aflx.a(aeom0);
            intent0 = new Intent();
            if(aeom0.i()) {
                kjb kjb0 = new kjb(((PublicKeyCredential)aeom0.a).d());
                afgi afgi0 = (afgi)afgi.a.b();
                kwr.f(intent0, kjb0);
            }
            else {
                kle kle0 = (kle)aezj.a.a(aeom0.b);
                afgi afgi1 = (afgi)afgi.a.b();
                kwr.e(intent0, kle0);
            }
        }
        else {
            intent0 = aeom0.d();
        }
        aeom0.h(RegistrationChimeraActivity.l);
        ProtoLiteBuilder hftp0 = aeom0.n();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixp)hftp0.b_message).f = 0xD3;
        ((gixp)hftp0.b_message).b |= 8;
        agcn agcn0 = this.j;
        if(agcn0 == null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giwa.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            giwa giwa2 = (giwa)hftp2.b_message;
            giwa2.b |= 0x20;
            giwa2.g = false;
            giwa giwa3 = (giwa)hftp2.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixp gixp1 = (gixp)hftp0.b_message;
            giwa3.getClass();
            gixp1.j = giwa3;
            gixp1.b |= 0x80;
        }
        else {
            ProtoLiteBuilder hftp1 = afli.c((agcn0.D == null ? -1 : ((int)(((Integer)((gftm)agcn0.D).a)))), agcn0.r, agcn0.F);
            boolean z = agcn0.G instanceof aflz;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giwa giwa0 = (giwa)hftp1.b_message;
            giwa0.b |= 0x20;
            giwa0.g = z;
            giwa giwa1 = (giwa)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixp gixp0 = (gixp)hftp0.b_message;
            giwa1.getClass();
            gixp0.j = giwa1;
            gixp0.b |= 0x80;
        }
        bxod bxod0 = this.m;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = this.n;
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp3.b_message;
        s.getClass();
        ((gixr)hftv0).b |= 2;
        ((gixr)hftv0).e = s;
        if(!hftv0.isImmutable()) {
            hftp3.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp3.b_message;
        ((gixr)hftv1).d = 17;
        ((gixr)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp3.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp3.b_message;
        gixp gixp2 = (gixp)hftp0.N_build();
        gixp2.getClass();
        gixr0.s = gixp2;
        gixr0.b |= 0x10000;
        bxod0.a(((gixr)hftp3.N_build()));
        this.setResult(aeom0.b(), intent0);
        ResultReceiver resultReceiver0 = this.o == null ? null : this.o.j;
        if(hpkt.h() && resultReceiver0 != null) {
            resultReceiver0.send(-1, aeom0.j());
        }
        this.finish();
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        this.m = bxoc.a(this, null);
        this.n = bxol.a();
        this.hQ().s(-1);
        this.setTheme(0x7F160EBD);  // style:ThemeTranslucentDayNight
        super.onCreate(bundle0);
        fyhn.b(this.getContainerActivity());
        Intent intent0 = this.getIntent();
        RegistrationOptions registrationOptions0 = (RegistrationOptions)bauc.b(intent0, "registration_options", RegistrationOptions.CREATOR);
        this.o = registrationOptions0;
        if(registrationOptions0 == null) {
            this.a(new aeok(gfqx.a, null).c(50170, aeqg.a("registrationOptions")));
            return;
        }
        ahna ahna0 = new ahna(this.o);
        ahna0.f = bbqa.c() ? ((ResultReceiver)intent0.getParcelableExtra("result_receiver", ResultReceiver.class)) : ((ResultReceiver)intent0.getParcelableExtra("result_receiver"));
        this.o = ahna0.a();
        if(hpob.e()) {
            afgi afgi0 = (afgi)afgi.a.b();
            kwv kwv0 = kws.a(this.getIntent());
            if(kwv0 != null) {
                ahna ahna1 = new ahna(this.o);
                ahna1.d = kwv0.c;
                this.o = ahna1.a();
            }
        }
        this.n = this.o.b;
        ComponentName componentName0 = this.getCallingActivity();
        gfsx gfsx0 = componentName0 == null ? gfqx.a : gfsx.m(componentName0.getClassName());
        agcn agcn0 = (agcn)new lso(this, new agcm(this.o, gfsx0)).a(agcn.class);
        this.j = agcn0;
        agdc agdc0 = (aeom aeom0) -> {
            Intent intent0;
            if(hpob.e() && ahmr.a(this.o)) {
                aeom0 = aflx.a(aeom0);
                intent0 = new Intent();
                if(aeom0.i()) {
                    kjb kjb0 = new kjb(((PublicKeyCredential)aeom0.a).d());
                    afgi afgi0 = (afgi)afgi.a.b();
                    kwr.f(intent0, kjb0);
                }
                else {
                    kle kle0 = (kle)aezj.a.a(aeom0.b);
                    afgi afgi1 = (afgi)afgi.a.b();
                    kwr.e(intent0, kle0);
                }
            }
            else {
                intent0 = aeom0.d();
            }
            aeom0.h(RegistrationChimeraActivity.l);
            ProtoLiteBuilder hftp0 = aeom0.n();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gixp)hftp0.b_message).f = 0xD3;
            ((gixp)hftp0.b_message).b |= 8;
            agcn agcn0 = this.j;
            if(agcn0 == null) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giwa.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                giwa giwa2 = (giwa)hftp2.b_message;
                giwa2.b |= 0x20;
                giwa2.g = false;
                giwa giwa3 = (giwa)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gixp gixp1 = (gixp)hftp0.b_message;
                giwa3.getClass();
                gixp1.j = giwa3;
                gixp1.b |= 0x80;
            }
            else {
                ProtoLiteBuilder hftp1 = afli.c((agcn0.D == null ? -1 : ((int)(((Integer)((gftm)agcn0.D).a)))), agcn0.r, agcn0.F);
                boolean z = agcn0.G instanceof aflz;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                giwa giwa0 = (giwa)hftp1.b_message;
                giwa0.b |= 0x20;
                giwa0.g = z;
                giwa giwa1 = (giwa)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gixp gixp0 = (gixp)hftp0.b_message;
                giwa1.getClass();
                gixp0.j = giwa1;
                gixp0.b |= 0x80;
            }
            bxod bxod0 = this.m;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
            String s = this.n;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp3.b_message;
            s.getClass();
            ((gixr)hftv0).b |= 2;
            ((gixr)hftv0).e = s;
            if(!hftv0.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp3.b_message;
            ((gixr)hftv1).d = 17;
            ((gixr)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp3.ensureMutable();
            }
            gixr gixr0 = (gixr)hftp3.b_message;
            gixp gixp2 = (gixp)hftp0.N_build();
            gixp2.getClass();
            gixr0.s = gixp2;
            gixr0.b |= 0x10000;
            bxod0.a(((gixr)hftp3.N_build()));
            this.setResult(aeom0.b(), intent0);
            ResultReceiver resultReceiver0 = this.o == null ? null : this.o.j;
            if(hpkt.h() && resultReceiver0 != null) {
                resultReceiver0.send(-1, aeom0.j());
            }
            this.finish();
        };
        agcn0.c.g(this, agdc0);
        adu adu0 = new adu();
        agcn agcn1 = this.j;
        Objects.requireNonNull(agcn1);
        agdd agdd0 = new agdd(agcn1);
        agcn agcn2 = this.j;
        Objects.requireNonNull(agcn2);
        acp acp0 = this.registerForActivityResult(adu0, new afgg(agdd0, new agde(agcn2), 0xC3FC));
        this.j.y.g(this, new agdf(acp0));
        this.j.f.g(this, new agdg(this));
        fm fm0 = this.getSupportFragmentManager();
        if(fm0.h("RegistrationBottomSheetDialog") == null) {
            new agdb().show(fm0, "RegistrationBottomSheetDialog");
        }
    }
}

