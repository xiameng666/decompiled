package com.google.android.gms.auth.api.credentials.fido.authentication.ui;

import ProtoLiteBuilder;
import ProtoLiteMessage;
import acp;
import adu;
import aeok;
import aeom;
import aeqg;
import aezk;
import afgg;
import afgi;
import afhv;
import afhw;
import afhx;
import afhy;
import afhz;
import afia;
import afio;
import afli;
import aflx;
import aflz;
import aggi;
import ahlm;
import ahmr;
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
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fm;
import fyhn;
import gfqx;
import gfsx;
import giwa;
import gixp;
import gixr;
import hpkt;
import hpob;
import j..util.Objects;
import kkb;
import kkn;
import kln;
import kwr;
import kws;
import kwx;
import lsk;
import lso;
import xni;

@GmsCoreVeId(0x3EC77)
public class AuthenticationChimeraActivity extends xni {
    public static final int j;
    private static final bboh k;
    private bxod l;
    private String m;
    private afhw n;
    private AuthenticationOptions o;

    static {
        AuthenticationChimeraActivity.k = aggi.b("AuthenticationChimeraActivity");
    }

    // Detected as a lambda impl.
    public final void a(aeom aeom0) {
        Intent intent0;
        if(hpob.d() && ahmr.a(this.o)) {
            aeom0 = aflx.a(aeom0);
            intent0 = new Intent();
            if(aeom0.i()) {
                kkb kkb0 = new kkb(new kkn(((PublicKeyCredential)aeom0.a).d()));
                afgi afgi0 = (afgi)afgi.a.b();
                kwr.h(intent0, kkb0);
            }
            else {
                kln kln0 = (kln)aezk.a.a(aeom0.b);
                afgi afgi1 = (afgi)afgi.a.b();
                kwr.g(intent0, kln0);
            }
        }
        else {
            intent0 = aeom0.d();
        }
        aeom0.h(AuthenticationChimeraActivity.k);
        ProtoLiteBuilder hftp0 = aeom0.n();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gixp)hftp0.b_message).f = 210;
        ((gixp)hftp0.b_message).b |= 8;
        afhw afhw0 = this.n;
        if(afhw0 == null) {
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giwa.a).v_newBuilder();
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            giwa giwa3 = (giwa)hftp2.b_message;
            giwa3.b |= 0x20;
            giwa3.g = false;
            giwa giwa4 = (giwa)hftp2.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixp gixp1 = (gixp)hftp0.b_message;
            giwa4.getClass();
            gixp1.j = giwa4;
            gixp1.b |= 0x80;
        }
        else {
            ProtoLiteBuilder hftp1 = afli.c(afhw0.v, afhw0.i, afhw0.q);
            int v = afhw0.p;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giwa giwa0 = (giwa)hftp1.b_message;
            giwa0.b |= 1;
            giwa0.c = v;
            boolean z = afhw0.w instanceof aflz;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            giwa giwa1 = (giwa)hftp1.b_message;
            giwa1.b |= 0x20;
            giwa1.g = z;
            giwa giwa2 = (giwa)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gixp gixp0 = (gixp)hftp0.b_message;
            giwa2.getClass();
            gixp0.j = giwa2;
            gixp0.b |= 0x80;
        }
        bxod bxod0 = this.l;
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = this.m;
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
        ResultReceiver resultReceiver0 = this.o == null ? null : this.o.i;
        if(hpkt.h() && resultReceiver0 != null) {
            resultReceiver0.send(-1, aeom0.j());
        }
        this.finish();
    }

    @Override  // xnb
    public final lsk getDefaultViewModelProviderFactory() {
        ComponentName componentName0 = this.getCallingActivity();
        if(componentName0 != null) {
            gfsx gfsx0 = gfsx.m(componentName0.getClassName());
            return new afhv(this.o, gfsx0);
        }
        return new afhv(this.o, gfqx.a);
    }

    @Override  // xoi
    public final void onCreate(Bundle bundle0) {
        this.l = bxoc.a(this, null);
        this.m = bxol.a();
        Intent intent0 = this.getIntent();
        AuthenticationOptions authenticationOptions0 = (AuthenticationOptions)bauc.b(intent0, "authentication_options", AuthenticationOptions.CREATOR);
        this.o = authenticationOptions0;
        if(authenticationOptions0 == null) {
            this.a(new aeok(gfqx.a, null).c(50170, aeqg.a("authenticationOptions")));
            return;
        }
        this.setTheme(0x7F160EBD);  // style:ThemeTranslucentDayNight
        super.onCreate(bundle0);
        fyhn.b(this.getContainerActivity());
        ahlm ahlm0 = new ahlm(this.o);
        ahlm0.d = bbqa.c() ? ((ResultReceiver)intent0.getParcelableExtra("result_receiver", ResultReceiver.class)) : ((ResultReceiver)intent0.getParcelableExtra("result_receiver"));
        this.o = ahlm0.a();
        if(hpob.d()) {
            afgi afgi0 = (afgi)afgi.a.b();
            kwx kwx0 = kws.b(this.getIntent());
            if(kwx0 != null) {
                ahlm ahlm1 = new ahlm(this.o);
                ahlm1.c = kwx0.c;
                this.o = ahlm1.a();
            }
        }
        this.m = this.o.b;
        afhw afhw0 = (afhw)new lso(this).a(afhw.class);
        this.n = afhw0;
        afhx afhx0 = (aeom aeom0) -> {
            Intent intent0;
            if(hpob.d() && ahmr.a(this.o)) {
                aeom0 = aflx.a(aeom0);
                intent0 = new Intent();
                if(aeom0.i()) {
                    kkb kkb0 = new kkb(new kkn(((PublicKeyCredential)aeom0.a).d()));
                    afgi afgi0 = (afgi)afgi.a.b();
                    kwr.h(intent0, kkb0);
                }
                else {
                    kln kln0 = (kln)aezk.a.a(aeom0.b);
                    afgi afgi1 = (afgi)afgi.a.b();
                    kwr.g(intent0, kln0);
                }
            }
            else {
                intent0 = aeom0.d();
            }
            aeom0.h(AuthenticationChimeraActivity.k);
            ProtoLiteBuilder hftp0 = aeom0.n();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gixp)hftp0.b_message).f = 210;
            ((gixp)hftp0.b_message).b |= 8;
            afhw afhw0 = this.n;
            if(afhw0 == null) {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)giwa.a).v_newBuilder();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                giwa giwa3 = (giwa)hftp2.b_message;
                giwa3.b |= 0x20;
                giwa3.g = false;
                giwa giwa4 = (giwa)hftp2.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gixp gixp1 = (gixp)hftp0.b_message;
                giwa4.getClass();
                gixp1.j = giwa4;
                gixp1.b |= 0x80;
            }
            else {
                ProtoLiteBuilder hftp1 = afli.c(afhw0.v, afhw0.i, afhw0.q);
                int v = afhw0.p;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                giwa giwa0 = (giwa)hftp1.b_message;
                giwa0.b |= 1;
                giwa0.c = v;
                boolean z = afhw0.w instanceof aflz;
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                giwa giwa1 = (giwa)hftp1.b_message;
                giwa1.b |= 0x20;
                giwa1.g = z;
                giwa giwa2 = (giwa)hftp1.N_build();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gixp gixp0 = (gixp)hftp0.b_message;
                giwa2.getClass();
                gixp0.j = giwa2;
                gixp0.b |= 0x80;
            }
            bxod bxod0 = this.l;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
            String s = this.m;
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
            ResultReceiver resultReceiver0 = this.o == null ? null : this.o.i;
            if(hpkt.h() && resultReceiver0 != null) {
                resultReceiver0.send(-1, aeom0.j());
            }
            this.finish();
        };
        afhw0.c.g(this, afhx0);
        adu adu0 = new adu();
        afhw afhw1 = this.n;
        Objects.requireNonNull(afhw1);
        afhy afhy0 = new afhy(afhw1);
        afhw afhw2 = this.n;
        Objects.requireNonNull(afhw2);
        acp acp0 = this.registerForActivityResult(adu0, new afgg(afhy0, new afhz(afhw2), 0xC3FC));
        this.n.u.g(this, new afia(acp0));
        fm fm0 = this.getSupportFragmentManager();
        if(fm0.h("dialog") == null) {
            new afio().showNow(fm0, "dialog");
        }
    }
}

