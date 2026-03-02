package com.google.android.gms.auth.api.credentials.assistedsignin.ui;

import MoreObjects;
import ProtoLiteBuilder;
import ProtoLiteMessage;
import acp;
import adt;
import adu;
import advu;
import adxv;
import adxw;
import adxx;
import adxy;
import adxz;
import adya;
import adyb;
import adyc;
import adyd;
import adyw;
import adzw;
import adzx;
import adzy;
import adzz;
import aeab;
import aecg;
import aech;
import aeoi;
import aeok;
import aeqg;
import afge;
import afgg;
import afgi;
import aggi;
import aggj;
import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bauc;
import bbmq;
import bboh;
import bbqa;
import bxjr;
import bxoc;
import bxod;
import bxoh;
import bxol;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.auth.api.identity.GetCredentialUserSelection;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SigningInfoCompat;
import com.google.android.gms.fido.fido2.api.common.FidoCredentialDetails;
import com.google.android.gms.libs.ui.metrics.gmscore.annotation.GmsCoreVeId;
import fm;
import fyhn;
import gfqx;
import gfsx;
import gged_interceptors;
import givj;
import givl;
import giwe;
import gixp;
import gixr;
import hpob;
import j..util.Objects;
import kau;
import kws;
import kwx;
import lso;
import xni;

@GmsCoreVeId(0x3EC76)
public class AssistedSignInChimeraActivity extends xni {
    public aech j;
    public bxod k;
    public String l;
    public acp m;
    public acp n;
    public acp o;
    private static final bboh p;
    private CredentialRequest q;
    private CallingAppInfoCompat r;
    private GetCredentialUserSelection s;

    static {
        AssistedSignInChimeraActivity.p = aggi.a("AssistedSignInChimeraActivity");
    }

    // Detected as a lambda impl.
    public final void a(aeab aeab0) {
        String s4;
        int v1;
        Intent intent0;
        int v;
        String s = null;
        if((bbqa.d() || hpob.c()) && this.s != null) {
            v = aeab0.a();
            intent0 = aeab0.c();
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)givj.a).v_newBuilder();
            GetCredentialUserSelection getCredentialUserSelection0 = this.s;
            if(getCredentialUserSelection0 == null) {
                v1 = 1;
            }
            else {
                v1 = 3;
                switch(getCredentialUserSelection0.a) {
                    case 1: 
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        v1 = 1;
                    }
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((givj)hftp0.b_message).c = v1 - 1;
            ((givj)hftp0.b_message).b |= 1;
            afge.b(hftp0, this.r);
            afge.c(hftp0, aeab0.b);
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)givl.a).v_newBuilder();
            int v2 = afge.a(this.s.a);
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((givl)hftp1.b_message).c = v2 - 1;
            ((givl)hftp1.b_message).b |= 1;
            aech aech0 = this.j;
            if(aech0 != null) {
                InternalSignInCredentialWrapper internalSignInCredentialWrapper0 = aech0.P;
                if(internalSignInCredentialWrapper0 != null) {
                    int v3 = internalSignInCredentialWrapper0.b() ^ 1;
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    ProtoLiteMessage hftv0 = hftp1.b_message;
                    ((givl)hftv0).b |= 2;
                    ((givl)hftv0).d = v3;
                    int v4 = this.j.ad;
                    if(!hftv0.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    givl givl0 = (givl)hftp1.b_message;
                    if(v4 == 0) {
                        throw null;
                    }
                    givl0.e = v4 - 1;
                    givl0.b |= 4;
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            givj givj0 = (givj)hftp0.b_message;
            givl givl1 = (givl)hftp1.N_build();
            givl1.getClass();
            givj0.l = givl1;
            givj0.b |= 0x1000;
            bxod bxod0 = this.k;
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
            String s1 = this.l;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            s1.getClass();
            ((gixr)hftv1).b |= 2;
            ((gixr)hftv1).e = s1;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            ((gixr)hftv2).d = 26;
            ((gixr)hftv2).b |= 1;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            gixr gixr0 = (gixr)hftp2.b_message;
            givj givj1 = (givj)hftp0.N_build();
            givj1.getClass();
            gixr0.A = givj1;
            gixr0.b |= 0x2000000;
            bxod0.a(((gixr)hftp2.N_build()));
        }
        else {
            CredentialRequest credentialRequest0 = this.q;
            if(credentialRequest0 == null) {
                intent0 = aeab0.d();
            }
            else {
                intent0 = new Intent();
                Object object0 = aeab0.a;
                if(object0 != null) {
                    advu advu0 = new advu(((SignInCredential)object0).a);
                    String s2 = ((SignInCredential)object0).f;
                    if(TextUtils.isEmpty(s2)) {
                        advu0.e = "https://accounts.google.com";
                        if(credentialRequest0.f) {
                            Objects.requireNonNull(advu0);
                            adzw adzw0 = new adzw(advu0);
                            aeab.e(((SignInCredential)object0).b, adzw0);
                            Objects.requireNonNull(advu0);
                            adzx adzx0 = new adzx(advu0);
                            aeab.e(((SignInCredential)object0).d, adzx0);
                            Objects.requireNonNull(advu0);
                            adzy adzy0 = new adzy(advu0);
                            aeab.e(((SignInCredential)object0).c, adzy0);
                            Objects.requireNonNull(advu0);
                            adzz adzz0 = new adzz(advu0);
                            aeab.e(((SignInCredential)object0).e, adzz0);
                            String s3 = ((SignInCredential)object0).g;
                            if(s3 != null) {
                                advu0.c = gged_interceptors.l(new IdToken("https://accounts.google.com", s3));
                            }
                        }
                    }
                    else {
                        advu0.d = s2;
                    }
                    intent0.putExtra("com.google.android.gms.credentials.Credential", advu0.a());
                }
            }
            v = aeab0.b();
            ProtoLiteBuilder hftp3 = aeab0.n();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ((gixp)hftp3.b_message).f = 203;
            ((gixp)hftp3.b_message).b |= 8;
            aech aech1 = this.j;
            if(aech1 != null) {
                FidoCredentialDetails fidoCredentialDetails0 = aech1.Q;
                if(fidoCredentialDetails0 == null) {
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper1 = aech1.P;
                    if(internalSignInCredentialWrapper1 == null) {
                        s4 = null;
                    }
                    else {
                        Account account0 = internalSignInCredentialWrapper1.f;
                        s4 = account0 == null ? null : account0.name;
                    }
                }
                else {
                    s4 = fidoCredentialDetails0.a;
                }
                aech aech2 = this.j;
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)giwe.a).v_newBuilder();
                int v5 = aech2.G.size();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv3 = hftp4.b_message;
                ((giwe)hftv3).b |= 2;
                ((giwe)hftv3).d = v5;
                boolean z = aech2.T;
                if(!hftv3.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv4 = hftp4.b_message;
                ((giwe)hftv4).b |= 4;
                ((giwe)hftv4).e = z;
                boolean z1 = aech2.U;
                if(!hftv4.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv5 = hftp4.b_message;
                ((giwe)hftv5).b |= 8;
                ((giwe)hftv5).f = z1;
                boolean z2 = aech2.W;
                if(!hftv5.isImmutable()) {
                    hftp4.ensureMutable();
                }
                giwe giwe0 = (giwe)hftp4.b_message;
                giwe0.b |= 16;
                giwe0.g = z2;
                boolean z3 = aech2.w();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                ProtoLiteMessage hftv6 = hftp4.b_message;
                ((giwe)hftv6).b |= 0x20;
                ((giwe)hftv6).h = z3;
                int v6 = aech2.ad;
                if(!hftv6.isImmutable()) {
                    hftp4.ensureMutable();
                }
                giwe giwe1 = (giwe)hftp4.b_message;
                if(v6 == 0) {
                    throw null;
                }
                giwe1.i = v6 - 1;
                giwe1.b |= 0x40;
                aeab aeab1 = (aeab)aech2.o.ij();
                if(aeab1 != null && aeab1.a != null) {
                    if(aech2.Z) {
                        s = aggj.a();
                    }
                    else if(aech2.Q == null) {
                        InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = aech2.P;
                        if(internalSignInCredentialWrapper2 != null) {
                            s = aggj.c(internalSignInCredentialWrapper2);
                        }
                    }
                    else {
                        s = aggj.b();
                    }
                    if(s != null) {
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        ((giwe)hftp4.b_message).c = s;
                        ((giwe)hftp4.b_message).b |= 1;
                    }
                }
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gixp gixp0 = (gixp)hftp3.b_message;
                giwe giwe2 = (giwe)hftp4.N_build();
                giwe2.getClass();
                gixp0.g = giwe2;
                gixp0.b |= 16;
                boolean z4 = aech2.X;
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                gixp gixp1 = (gixp)hftp3.b_message;
                gixp1.b |= 0x200;
                gixp1.k = z4;
                s = s4;
            }
            if(s != null) {
                this.k = bxoc.a(this, s);
            }
            bxod bxod1 = this.k;
            ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
            String s5 = this.l;
            if(!hftp5.b_message.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv7 = hftp5.b_message;
            s5.getClass();
            ((gixr)hftv7).b |= 2;
            ((gixr)hftv7).e = s5;
            if(!hftv7.isImmutable()) {
                hftp5.ensureMutable();
            }
            ProtoLiteMessage hftv8 = hftp5.b_message;
            ((gixr)hftv8).d = 17;
            ((gixr)hftv8).b |= 1;
            if(!hftv8.isImmutable()) {
                hftp5.ensureMutable();
            }
            gixr gixr1 = (gixr)hftp5.b_message;
            gixp gixp2 = (gixp)hftp3.N_build();
            gixp2.getClass();
            gixr1.s = gixp2;
            gixr1.b |= 0x10000;
            bxod1.a(((gixr)hftp5.N_build()));
        }
        aeab0.h(AssistedSignInChimeraActivity.p);
        this.setResult(v, intent0);
        this.finish();
    }

    private final void g(String s) {
        this.a(((aeab)new aeok(gfqx.a).c(0x6F25, s)));
    }

    @Override  // xoi
    protected final void onCreate(Bundle bundle0) {
        kwx kwx0;
        this.k = bxoc.a(this, null);
        this.l = (String)MoreObjects.firstNonNull(this.getIntent().getStringExtra("session_id"), bxol.a());
        BeginSignInRequest beginSignInRequest0 = (BeginSignInRequest)bauc.b(this.getIntent(), "begin_sign_in_request", BeginSignInRequest.CREATOR);
        if(beginSignInRequest0 == null) {
            this.g(aeqg.a("beginSignInRequest"));
            return;
        }
        long v = this.getIntent().getLongExtra("start_time_millis", System.currentTimeMillis());
        this.q = (CredentialRequest)bauc.b(this.getIntent(), "credential_request", CredentialRequest.CREATOR);
        this.s = (GetCredentialUserSelection)bauc.b(this.getIntent(), "get_credential_user_selection", GetCredentialUserSelection.CREATOR);
        if((bbqa.d() || hpob.c()) && this.s != null) {
            afgi afgi0 = (afgi)afgi.a.b();
            kwx0 = kws.b(this.getIntent());
        }
        else {
            kwx0 = null;
        }
        if(this.s != null && kwx0 == null) {
            this.g(aeqg.a("providerGetCredentialRequest"));
        }
        ChromeOptions chromeOptions0 = (ChromeOptions)bauc.b(this.getIntent(), "chrome_option", ChromeOptions.CREATOR);
        aeoi.a(this, beginSignInRequest0.e);
        super.onCreate(bundle0);
        fyhn.b(this.getContainerActivity());
        bxoh.a(this, new adxv(this));
        if(this.s == null) {
            String s = bbmq.p(this);
            if(s == null) {
                this.a(((aeab)new aeok(gfqx.a).c(0x6F1A, "Cannot get calling package name.")));
                return;
            }
            this.r = new CallingAppInfoCompat(s, SigningInfoCompat.a, null);
        }
        else {
            CallingAppInfoCompat callingAppInfoCompat0 = (CallingAppInfoCompat)bauc.b(this.getIntent(), "calling_app_info_compat", CallingAppInfoCompat.CREATOR);
            if(callingAppInfoCompat0 == null) {
                this.g(aeqg.a("callingAppInfoCompat"));
                return;
            }
            this.r = callingAppInfoCompat0;
        }
        gfsx gfsx0 = bxjr.a(this.getApplicationContext(), this.r.a);
        if(!gfsx0.i()) {
            this.a(((aeab)new aeok(gfqx.a).c(0x6F1A, "Cannot get app name and icon.")));
            return;
        }
        String s1 = this.getIntent().getStringExtra("caller_verification_token_id");
        aech aech0 = (aech)new lso(this, new aecg(this.getApplication(), this.r, ((kau)gfsx0.d()), beginSignInRequest0, this.l, this.s, kwx0, chromeOptions0, v, s1)).a(aech.class);
        this.j = aech0;
        adxw adxw0 = (aeab aeab0) -> {
            String s4;
            int v1;
            Intent intent0;
            int v;
            String s = null;
            if((bbqa.d() || hpob.c()) && this.s != null) {
                v = aeab0.a();
                intent0 = aeab0.c();
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)givj.a).v_newBuilder();
                GetCredentialUserSelection getCredentialUserSelection0 = this.s;
                if(getCredentialUserSelection0 == null) {
                    v1 = 1;
                }
                else {
                    v1 = 3;
                    switch(getCredentialUserSelection0.a) {
                        case 1: 
                        case 2: {
                            v1 = 2;
                            break;
                        }
                        case 3: {
                            break;
                        }
                        default: {
                            v1 = 1;
                        }
                    }
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                ((givj)hftp0.b_message).c = v1 - 1;
                ((givj)hftp0.b_message).b |= 1;
                afge.b(hftp0, this.r);
                afge.c(hftp0, aeab0.b);
                ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)givl.a).v_newBuilder();
                int v2 = afge.a(this.s.a);
                if(!hftp1.b_message.isImmutable()) {
                    hftp1.ensureMutable();
                }
                ((givl)hftp1.b_message).c = v2 - 1;
                ((givl)hftp1.b_message).b |= 1;
                aech aech0 = this.j;
                if(aech0 != null) {
                    InternalSignInCredentialWrapper internalSignInCredentialWrapper0 = aech0.P;
                    if(internalSignInCredentialWrapper0 != null) {
                        int v3 = internalSignInCredentialWrapper0.b() ^ 1;
                        if(!hftp1.b_message.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp1.b_message;
                        ((givl)hftv0).b |= 2;
                        ((givl)hftv0).d = v3;
                        int v4 = this.j.ad;
                        if(!hftv0.isImmutable()) {
                            hftp1.ensureMutable();
                        }
                        givl givl0 = (givl)hftp1.b_message;
                        if(v4 == 0) {
                            throw null;
                        }
                        givl0.e = v4 - 1;
                        givl0.b |= 4;
                    }
                }
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                givj givj0 = (givj)hftp0.b_message;
                givl givl1 = (givl)hftp1.N_build();
                givl1.getClass();
                givj0.l = givl1;
                givj0.b |= 0x1000;
                bxod bxod0 = this.k;
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
                String s1 = this.l;
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv1 = hftp2.b_message;
                s1.getClass();
                ((gixr)hftv1).b |= 2;
                ((gixr)hftv1).e = s1;
                if(!hftv1.isImmutable()) {
                    hftp2.ensureMutable();
                }
                ProtoLiteMessage hftv2 = hftp2.b_message;
                ((gixr)hftv2).d = 26;
                ((gixr)hftv2).b |= 1;
                if(!hftv2.isImmutable()) {
                    hftp2.ensureMutable();
                }
                gixr gixr0 = (gixr)hftp2.b_message;
                givj givj1 = (givj)hftp0.N_build();
                givj1.getClass();
                gixr0.A = givj1;
                gixr0.b |= 0x2000000;
                bxod0.a(((gixr)hftp2.N_build()));
            }
            else {
                CredentialRequest credentialRequest0 = this.q;
                if(credentialRequest0 == null) {
                    intent0 = aeab0.d();
                }
                else {
                    intent0 = new Intent();
                    Object object0 = aeab0.a;
                    if(object0 != null) {
                        advu advu0 = new advu(((SignInCredential)object0).a);
                        String s2 = ((SignInCredential)object0).f;
                        if(TextUtils.isEmpty(s2)) {
                            advu0.e = "https://accounts.google.com";
                            if(credentialRequest0.f) {
                                Objects.requireNonNull(advu0);
                                adzw adzw0 = new adzw(advu0);
                                aeab.e(((SignInCredential)object0).b, adzw0);
                                Objects.requireNonNull(advu0);
                                adzx adzx0 = new adzx(advu0);
                                aeab.e(((SignInCredential)object0).d, adzx0);
                                Objects.requireNonNull(advu0);
                                adzy adzy0 = new adzy(advu0);
                                aeab.e(((SignInCredential)object0).c, adzy0);
                                Objects.requireNonNull(advu0);
                                adzz adzz0 = new adzz(advu0);
                                aeab.e(((SignInCredential)object0).e, adzz0);
                                String s3 = ((SignInCredential)object0).g;
                                if(s3 != null) {
                                    advu0.c = gged_interceptors.l(new IdToken("https://accounts.google.com", s3));
                                }
                            }
                        }
                        else {
                            advu0.d = s2;
                        }
                        intent0.putExtra("com.google.android.gms.credentials.Credential", advu0.a());
                    }
                }
                v = aeab0.b();
                ProtoLiteBuilder hftp3 = aeab0.n();
                if(!hftp3.b_message.isImmutable()) {
                    hftp3.ensureMutable();
                }
                ((gixp)hftp3.b_message).f = 203;
                ((gixp)hftp3.b_message).b |= 8;
                aech aech1 = this.j;
                if(aech1 != null) {
                    FidoCredentialDetails fidoCredentialDetails0 = aech1.Q;
                    if(fidoCredentialDetails0 == null) {
                        InternalSignInCredentialWrapper internalSignInCredentialWrapper1 = aech1.P;
                        if(internalSignInCredentialWrapper1 == null) {
                            s4 = null;
                        }
                        else {
                            Account account0 = internalSignInCredentialWrapper1.f;
                            s4 = account0 == null ? null : account0.name;
                        }
                    }
                    else {
                        s4 = fidoCredentialDetails0.a;
                    }
                    aech aech2 = this.j;
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)giwe.a).v_newBuilder();
                    int v5 = aech2.G.size();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv3 = hftp4.b_message;
                    ((giwe)hftv3).b |= 2;
                    ((giwe)hftv3).d = v5;
                    boolean z = aech2.T;
                    if(!hftv3.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv4 = hftp4.b_message;
                    ((giwe)hftv4).b |= 4;
                    ((giwe)hftv4).e = z;
                    boolean z1 = aech2.U;
                    if(!hftv4.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv5 = hftp4.b_message;
                    ((giwe)hftv5).b |= 8;
                    ((giwe)hftv5).f = z1;
                    boolean z2 = aech2.W;
                    if(!hftv5.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    giwe giwe0 = (giwe)hftp4.b_message;
                    giwe0.b |= 16;
                    giwe0.g = z2;
                    boolean z3 = aech2.w();
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    ProtoLiteMessage hftv6 = hftp4.b_message;
                    ((giwe)hftv6).b |= 0x20;
                    ((giwe)hftv6).h = z3;
                    int v6 = aech2.ad;
                    if(!hftv6.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    giwe giwe1 = (giwe)hftp4.b_message;
                    if(v6 == 0) {
                        throw null;
                    }
                    giwe1.i = v6 - 1;
                    giwe1.b |= 0x40;
                    aeab aeab1 = (aeab)aech2.o.ij();
                    if(aeab1 != null && aeab1.a != null) {
                        if(aech2.Z) {
                            s = aggj.a();
                        }
                        else if(aech2.Q == null) {
                            InternalSignInCredentialWrapper internalSignInCredentialWrapper2 = aech2.P;
                            if(internalSignInCredentialWrapper2 != null) {
                                s = aggj.c(internalSignInCredentialWrapper2);
                            }
                        }
                        else {
                            s = aggj.b();
                        }
                        if(s != null) {
                            if(!hftp4.b_message.isImmutable()) {
                                hftp4.ensureMutable();
                            }
                            ((giwe)hftp4.b_message).c = s;
                            ((giwe)hftp4.b_message).b |= 1;
                        }
                    }
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gixp gixp0 = (gixp)hftp3.b_message;
                    giwe giwe2 = (giwe)hftp4.N_build();
                    giwe2.getClass();
                    gixp0.g = giwe2;
                    gixp0.b |= 16;
                    boolean z4 = aech2.X;
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gixp gixp1 = (gixp)hftp3.b_message;
                    gixp1.b |= 0x200;
                    gixp1.k = z4;
                    s = s4;
                }
                if(s != null) {
                    this.k = bxoc.a(this, s);
                }
                bxod bxod1 = this.k;
                ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)gixr.a).v_newBuilder();
                String s5 = this.l;
                if(!hftp5.b_message.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv7 = hftp5.b_message;
                s5.getClass();
                ((gixr)hftv7).b |= 2;
                ((gixr)hftv7).e = s5;
                if(!hftv7.isImmutable()) {
                    hftp5.ensureMutable();
                }
                ProtoLiteMessage hftv8 = hftp5.b_message;
                ((gixr)hftv8).d = 17;
                ((gixr)hftv8).b |= 1;
                if(!hftv8.isImmutable()) {
                    hftp5.ensureMutable();
                }
                gixr gixr1 = (gixr)hftp5.b_message;
                gixp gixp2 = (gixp)hftp3.N_build();
                gixp2.getClass();
                gixr1.s = gixp2;
                gixr1.b |= 0x10000;
                bxod1.a(((gixr)hftp5.N_build()));
            }
            aeab0.h(AssistedSignInChimeraActivity.p);
            this.setResult(v, intent0);
            this.finish();
        };
        aech0.o.g(this, adxw0);
        this.j.r.g(this, new adxx(this));
        this.j.s.g(this, new adxy(this));
        this.j.t.g(this, new adxz(this));
        this.m = this.registerForActivityResult(new adu(), new adya(this));
        adu adu0 = new adu();
        aech aech1 = this.j;
        Objects.requireNonNull(aech1);
        adyb adyb0 = new adyb(aech1);
        aech aech2 = this.j;
        Objects.requireNonNull(aech2);
        this.n = this.registerForActivityResult(adu0, new afgg(adyb0, new adyc(aech2), 0x6F23));
        this.o = this.registerForActivityResult(new adt(), new adyd(this));
        fm fm0 = this.getSupportFragmentManager();
        if(fm0.h("AssistedSignInDialogFragment") == null) {
            new adyw().show(fm0, "AssistedSignInDialogFragment");
        }
    }
}

