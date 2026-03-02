package com.google.android.gms.auth.api.credentials.credman.create;

import MoreObjects;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import acp;
import adu;
import aeqg;
import aevw;
import aevx;
import aexx;
import aexy;
import aexz;
import aeya;
import aeyb;
import aeyc;
import aeyt;
import aeyu;
import afge;
import afgg;
import afgi;
import aggi;
import android.os.Bundle;
import bauc;
import bboh;
import bxoc;
import bxod;
import bxol;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import gfqx;
import givi;
import givj;
import gixr;
import j..util.Objects;
import kws;
import kwv;
import lso;
import xni;

@GmsCoreVeId(0x3EC6C)
public class CreatePasswordOrPasskeyChimeraActivity extends xni {
    int j;
    public aeyu k;
    public acp l;
    public acp m;
    private static final bboh n;
    private bxod o;
    private String p;
    private CallingAppInfoCompat q;
    private kwv r;

    static {
        CreatePasswordOrPasskeyChimeraActivity.n = aggi.b("CreatePasswordOrPasskeyChimeraActivity");
    }

    // Detected as a lambda impl.
    public final void a(aevx aevx0) {
        aevx0.h(CreatePasswordOrPasskeyChimeraActivity.n);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)givj.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((givj)hftp0.b_message).c = 1;
        ((givj)hftp0.b_message).b |= 1;
        afge.b(hftp0, this.q);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)givi.a).v_newBuilder();
        int v = afge.a(this.j);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((givi)hftv0).c = v - 1;
        ((givi)hftv0).b |= 1;
        aeyu aeyu0 = this.k;
        if(aeyu0 != null) {
            boolean z = aeyu0.t;
            if(!hftv0.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((givi)hftv1).b |= 2;
            ((givi)hftv1).d = z;
            boolean z1 = aeyu0.u;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            givi givi0 = (givi)hftp1.b_message;
            givi0.b |= 4;
            givi0.e = z1;
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        givj givj0 = (givj)hftp0.b_message;
        givi givi1 = (givi)hftp1.N_build();
        givi1.getClass();
        givj0.n = givi1;
        givj0.b |= 0x4000;
        afge.c(hftp0, aevx0.b);
        bxod bxod0 = this.o;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
        String s = this.p;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        s.getClass();
        ((gixr)hftv2).b |= 2;
        ((gixr)hftv2).e = s;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp2.b_message;
        ((gixr)hftv3).d = 26;
        ((gixr)hftv3).b |= 1;
        if(!hftv3.isImmutable()) {
            hftp2.ensureMutable();
        }
        gixr gixr0 = (gixr)hftp2.b_message;
        givj givj1 = (givj)hftp0.N_build();
        givj1.getClass();
        gixr0.A = givj1;
        gixr0.b |= 0x2000000;
        bxod0.a(((gixr)hftp2.N_build()));
        this.setResult(aevx0.b(), aevx0.d());
        this.finish();
    }

    private final void g(String s) {
        this.a(((aevx)new aevw(gfqx.a).c(0x6F25, s)));
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setTheme(0x7F160C40);  // style:Theme.GisHidden
        this.o = bxoc.a(this, null);
        this.p = (String)MoreObjects.firstNonNull(this.getIntent().getStringExtra("session_id"), bxol.a());
        CallingAppInfoCompat callingAppInfoCompat0 = (CallingAppInfoCompat)bauc.b(this.getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
        if(callingAppInfoCompat0 == null) {
            this.g(aeqg.a("callingAppInfoCompat"));
            return;
        }
        this.q = callingAppInfoCompat0;
        String s = this.getIntent().getStringExtra("credential_provider_account_name");
        if(s == null) {
            this.g(aeqg.a("accountName"));
            return;
        }
        if(!this.getIntent().hasExtra("credential_provider_credential_type")) {
            this.g(aeqg.a("credentialType"));
            return;
        }
        int v = this.getIntent().getIntExtra("credential_provider_credential_type", 0);
        this.j = v;
        if(v != 1 && v != 2) {
            this.g(String.format("Invalid credential type: %s.", v));
            return;
        }
        afgi afgi0 = (afgi)afgi.a.b();
        kwv kwv0 = kws.a(this.getIntent());
        this.r = kwv0;
        if(kwv0 == null) {
            this.g(aeqg.a("providerCreateCredentialRequest"));
            return;
        }
        long v1 = this.getIntent().getLongExtra("start_time_millis", System.currentTimeMillis());
        String s1 = this.getIntent().getStringExtra("caller_verification_token_id");
        aeyu aeyu0 = (aeyu)new lso(this, new aeyt(this.p, this.q, s, this.j, this.r, v1, s1)).a(aeyu.class);
        this.k = aeyu0;
        aexx aexx0 = (aevx aevx0) -> {
            aevx0.h(CreatePasswordOrPasskeyChimeraActivity.n);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)givj.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((givj)hftp0.b_message).c = 1;
            ((givj)hftp0.b_message).b |= 1;
            afge.b(hftp0, this.q);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)givi.a).v_newBuilder();
            int v = afge.a(this.j);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp1.b_message;
            ((givi)hftv0).c = v - 1;
            ((givi)hftv0).b |= 1;
            aeyu aeyu0 = this.k;
            if(aeyu0 != null) {
                boolean z = aeyu0.t;
                if(!hftv0.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp1.b_message;
                ((givi)hftv1).b |= 2;
                ((givi)hftv1).d = z;
                boolean z1 = aeyu0.u;
                if(!hftv1.isImmutable()) {
                    hftp1.ensureMutable();
                }
                givi givi0 = (givi)hftp1.b_message;
                givi0.b |= 4;
                givi0.e = z1;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            givj givj0 = (givj)hftp0.b_message;
            givi givi1 = (givi)hftp1.N_build();
            givi1.getClass();
            givj0.n = givi1;
            givj0.b |= 0x4000;
            afge.c(hftp0, aevx0.b);
            bxod bxod0 = this.o;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
            String s = this.p;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            s.getClass();
            ((gixr)hftv2).b |= 2;
            ((gixr)hftv2).e = s;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv3 = hftp2.b_message;
            ((gixr)hftv3).d = 26;
            ((gixr)hftv3).b |= 1;
            if(!hftv3.isImmutable()) {
                hftp2.ensureMutable();
            }
            gixr gixr0 = (gixr)hftp2.b_message;
            givj givj1 = (givj)hftp0.N_build();
            givj1.getClass();
            gixr0.A = givj1;
            gixr0.b |= 0x2000000;
            bxod0.a(((gixr)hftp2.N_build()));
            this.setResult(aevx0.b(), aevx0.d());
            this.finish();
        };
        aeyu0.n.g(this, aexx0);
        this.k.l.g(this, new aexy(this));
        this.k.m.g(this, new aexz(this));
        this.l = this.registerForActivityResult(new adu(), new aeya(this));
        adu adu0 = new adu();
        aeyu aeyu1 = this.k;
        Objects.requireNonNull(aeyu1);
        aeyb aeyb0 = new aeyb(aeyu1);
        aeyu aeyu2 = this.k;
        Objects.requireNonNull(aeyu2);
        this.m = this.registerForActivityResult(adu0, new afgg(aeyb0, new aeyc(aeyu2), 0x6F23));
    }

    @Override  // xni
    protected final void onStart() {
        super.onStart();
        aeyu aeyu0 = this.k;
        if(aeyu0 != null) {
            aeyu0.j.i();
        }
    }
}

