package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import MoreObjects;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import adzm;
import adzn;
import adzu;
import aecj;
import aeck;
import aecl;
import aeoc;
import aeoi;
import aeqg;
import aggi;
import android.os.Bundle;
import bauc;
import bbmq;
import bboh;
import bxoc;
import bxod;
import bxoh;
import bxol;
import ca;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fyhn;
import gged_interceptors;
import giwr;
import gixp;
import gixr;
import lqi;
import lso;
import xni;

@GmsCoreVeId(0x3EC65)
public class PhoneNumberHintChimeraActivity extends xni {
    public String j;
    public bxod k;
    private static final bboh l;
    private String m;
    private aecl n;

    static {
        PhoneNumberHintChimeraActivity.l = aggi.b("PhoneNumberHintChimeraActivity");
    }

    // Detected as a lambda impl.
    public final void a(aecj aecj0) {
        aecj0.h(PhoneNumberHintChimeraActivity.l);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giwr.a).v_newBuilder();
        aecl aecl0 = this.n;
        int v = 0;
        if(aecl0 != null) {
            gged_interceptors gged0 = (gged_interceptors)aecl0.c.ij();
            if(gged0 != null) {
                v = gged0.size();
            }
        }
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        giwr giwr0 = (giwr)hftp0.b_message;
        giwr0.b |= 1;
        giwr0.c = v;
        boolean z = aecj0.i();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((giwr)hftv0).b |= 2;
        ((giwr)hftv0).d = z;
        String s = this.m;
        if(s != null) {
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            giwr giwr1 = (giwr)hftp0.b_message;
            giwr1.b |= 4;
            giwr1.e = s;
        }
        bxod bxod0 = this.k;
        gixr gixr0 = gixr.a;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp1.b_message;
        ((gixr)hftv1).d = 24;
        ((gixr)hftv1).b |= 1;
        if(!hftv1.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr1 = (gixr)hftp1.b_message;
        giwr giwr2 = (giwr)hftp0.N_build();
        giwr2.getClass();
        gixr1.z = giwr2;
        gixr1.b |= 0x800000;
        String s1 = this.j;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        gixr gixr2 = (gixr)hftp1.b_message;
        s1.getClass();
        gixr2.b |= 2;
        gixr2.e = s1;
        bxod0.a(((gixr)hftp1.N_build()));
        bxod bxod1 = this.k;
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gixr0).v_newBuilder();
        String s2 = this.j;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        s2.getClass();
        ((gixr)hftv2).b |= 2;
        ((gixr)hftv2).e = s2;
        if(!hftv2.isImmutable()) {
            hftp2.ensureMutable();
        }
        ((gixr)hftp2.b_message).d = 17;
        ((gixr)hftp2.b_message).b |= 1;
        ProtoLiteBuilder hftp3 = aecj0.n();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        ((gixp)hftp3.b_message).f = 0xD0;
        ((gixp)hftp3.b_message).b |= 8;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        gixr gixr3 = (gixr)hftp2.b_message;
        gixp gixp0 = (gixp)hftp3.N_build();
        gixp0.getClass();
        gixr3.s = gixp0;
        gixr3.b |= 0x10000;
        bxod1.a(((gixr)hftp2.N_build()));
        this.setResult(aecj0.b(), aecj0.d());
        this.finish();
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        this.j = (String)MoreObjects.firstNonNull(this.getIntent().getStringExtra("session_id"), bxol.a());
        this.k = bxoc.a(this.getApplicationContext(), null);
        GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest0 = (GetPhoneNumberHintIntentRequest)bauc.b(this.getIntent(), "get_phone_number_hint_intent_request", GetPhoneNumberHintIntentRequest.CREATOR);
        if(getPhoneNumberHintIntentRequest0 == null) {
            this.j = bxol.a();
            this.a(((aecj)aecj.a().c(0x6F25, aeqg.a("getPhoneNumberHintIntentRequest"))));
            return;
        }
        aeoi.a(this, getPhoneNumberHintIntentRequest0.a);
        super.onCreate(bundle0);
        fyhn.b(this.getContainerActivity());
        bxoh.a(this, new adzm(this));
        String s = bbmq.p(this);
        if(s == null) {
            this.a(((aecj)aecj.a().c(0x6F1A, "Cannot get calling package name.")));
            return;
        }
        this.m = s;
        aecl aecl0 = (aecl)new lso(this, new aeck(this.getApplication(), this.j, this.k)).a(aecl.class);
        this.n = aecl0;
        adzn adzn0 = (aecj aecj0) -> {
            aecj0.h(PhoneNumberHintChimeraActivity.l);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)giwr.a).v_newBuilder();
            aecl aecl0 = this.n;
            int v = 0;
            if(aecl0 != null) {
                gged_interceptors gged0 = (gged_interceptors)aecl0.c.ij();
                if(gged0 != null) {
                    v = gged0.size();
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            giwr giwr0 = (giwr)hftp0.b_message;
            giwr0.b |= 1;
            giwr0.c = v;
            boolean z = aecj0.i();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((giwr)hftv0).b |= 2;
            ((giwr)hftv0).d = z;
            String s = this.m;
            if(s != null) {
                if(!hftv0.isImmutable()) {
                    hftp0.ensureMutable();
                }
                giwr giwr1 = (giwr)hftp0.b_message;
                giwr1.b |= 4;
                giwr1.e = s;
            }
            bxod bxod0 = this.k;
            gixr gixr0 = gixr.a;
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gixr0).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp1.b_message;
            ((gixr)hftv1).d = 24;
            ((gixr)hftv1).b |= 1;
            if(!hftv1.isImmutable()) {
                hftp1.ensureMutable();
            }
            gixr gixr1 = (gixr)hftp1.b_message;
            giwr giwr2 = (giwr)hftp0.N_build();
            giwr2.getClass();
            gixr1.z = giwr2;
            gixr1.b |= 0x800000;
            String s1 = this.j;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gixr gixr2 = (gixr)hftp1.b_message;
            s1.getClass();
            gixr2.b |= 2;
            gixr2.e = s1;
            bxod0.a(((gixr)hftp1.N_build()));
            bxod bxod1 = this.k;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gixr0).v_newBuilder();
            String s2 = this.j;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            s2.getClass();
            ((gixr)hftv2).b |= 2;
            ((gixr)hftv2).e = s2;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gixr)hftp2.b_message).d = 17;
            ((gixr)hftp2.b_message).b |= 1;
            ProtoLiteBuilder hftp3 = aecj0.n();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gixp)hftp3.b_message).f = 0xD0;
            ((gixp)hftp3.b_message).b |= 8;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            gixr gixr3 = (gixr)hftp2.b_message;
            gixp gixp0 = (gixp)hftp3.N_build();
            gixp0.getClass();
            gixr3.s = gixp0;
            gixr3.b |= 0x10000;
            bxod1.a(((gixr)hftp2.N_build()));
            this.setResult(aecj0.b(), aecj0.d());
            this.finish();
        };
        aecl0.d.g(this, adzn0);
        aecl aecl1 = this.n;
        lqi lqi0 = aecl1.c;
        if(lqi0.ij() == null) {
            gged_interceptors gged0 = ((aeoc)aeoc.a.b()).a(aecl1.a());
            if(gged0.isEmpty()) {
                aecj aecj0 = (aecj)aecj.a().c(0x6F16, null);
                aecl1.d.ii(aecj0);
            }
            lqi0.ii(gged0);
        }
        if(this.getSupportFragmentManager().h("PhoneNumberHintDialogFragment") != null) {
            return;
        }
        ca ca0 = new ca(this.getSupportFragmentManager());
        ca0.v(new adzu(), "PhoneNumberHintDialogFragment");
        ca0.f();
    }
}

