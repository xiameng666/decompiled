import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.hardware.biometrics.BiometricPrompt.Builder;
import android.hardware.biometrics.BiometricPrompt.CryptoObject;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager.CryptoObject;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.wallet.firstparty.SetUpBiometricAuthenticationKeysRequest;
import com.google.android.gms.wallet.intentoperation.RemoveSignatureBasedAuthPublicKeyOperation;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.gms.wallet.ui.common.FingerprintButton;
import com.google.android.wallet.clientlog.LogContext;
import j..util.Objects;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;

public final class fbyx extends gdak implements View.OnClickListener, gcjs {
    gcyd a;
    private Intent aG;
    private fbdw aH;
    private fbel aI;
    private View aJ;
    private geuw aK;
    private geuy aL;
    private gevb aM;
    private gevi aN;
    private int aO;
    private boolean aP;
    private boolean aQ;
    private String aR;
    private final List aS;
    private final List aT;
    private final List aU;
    FingerprintButton ag;
    View ah;
    ViewGroup ai;
    ViewGroup aj;
    ViewGroup ak;
    ViewGroup al;
    fbzb am;
    fccd an;
    public gcyd ao;
    public fbyv ap;
    public fbyw aq;
    boolean ar;
    boolean as;
    boolean at;
    public int au;
    public int av;
    public geut aw;
    private final gamj ax;
    private final gdew ay;
    private Intent az;
    gcyd b;
    gcyd c;
    gcyd d;

    public fbyx() {
        this.ax = new gamj(18);
        this.ay = new gdew();
        this.ar = true;
        this.as = true;
        this.at = false;
        this.aS = new ArrayList();
        this.aT = new ArrayList();
        this.aU = new ArrayList();
        this.au = 3;
        this.av = 0;
        this.aw = null;
    }

    public final geut A() {
        if(this.aw == null && this.an != null) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geut.a).v_newBuilder();
            gfbo gfbo0 = this.an.U();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            geut geut0 = (geut)hftp0.b_message;
            gfbo0.getClass();
            geut0.d = gfbo0;
            geut0.c = 4;
            this.aw = (geut)hftp0.N_build();
        }
        return this.aw;
    }

    @Override  // gami
    public final gamj B() {
        return this.ax;
    }

    @Override  // gdak
    protected final gewg C() {
        this.aj();
        gewg gewg0 = ((geus)this.aA).c;
        return gewg0 == null ? gewg.a : gewg0;
    }

    @Override  // gdak
    protected final Parser D() {
        return (Parser)((ProtoLiteMessage)geus.a).jf(7, null);
    }

    public final void H(boolean z) {
        this.ar = z;
        this.W(z);
    }

    @Override  // gdak
    public final void K(gffq gffq0, List list0) {
        if((gfev.a(gffq0.e) == 0 ? 1 : gfev.a(gffq0.e)) - 1 != 36) {
            super.K(gffq0, list0);
            return;
        }
        int v = this.aO;
        if(v != 6) {
            throw new UnsupportedOperationException("START_AUTHENTICATION resulting action is not yet supported for auth type " + v);
        }
        this.ad();
    }

    public final void L() {
        this.at = false;
        this.W(false);
        if(!this.aQ) {
            this.aQ = true;
            this.ar();
            this.aq();
        }
    }

    @Override  // gdcm
    protected final void M() {
        boolean z = this.ca;
        gcyd gcyd0 = this.c;
        boolean z1 = true;
        if(gcyd0 != null && !this.aP) {
            gcyd0.c().setEnabled(z && !this.aI.c);
        }
        FingerprintButton fingerprintButton0 = this.ag;
        if(fingerprintButton0 != null && !this.aP) {
            if(!z || this.aI.c) {
                z1 = false;
            }
            fingerprintButton0.setEnabled(z1);
        }
        gcyd gcyd1 = this.b;
        if(gcyd1 != null) {
            gcyd1.c().setEnabled(z);
        }
        fccd fccd0 = this.an;
        if(fccd0 != null) {
            fccd0.ll(z);
        }
        gcyd gcyd2 = this.a;
        if(gcyd2 != null) {
            gcyd2.c().setEnabled(z);
        }
        gcyd gcyd3 = this.ao;
        if(gcyd3 != null) {
            gcyd3.c().setEnabled(z);
        }
    }

    public final void N() {
        if(!this.aQ) {
            this.aQ = true;
            this.ar();
        }
    }

    @Override  // gdak
    protected final void O() {
        this.U(8);
    }

    @Override  // gdak
    protected final void P() {
        this.U(0);
    }

    public final void Q(int v, ByteString hfsf0) {
        geut geut1;
        if(hfsf0 == null) {
            gevn gevn0 = this.Z(v);
            if(gevn0.e) {
                Context context0 = this.getContext();
                Context context1 = this.getContext();
                BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig");
                int v1 = geuv.a(gevn0.c) == 0 ? 1 : geuv.a(gevn0.c);
                Intent intent0 = IntentOperation.getStartIntent(context1, RemoveSignatureBasedAuthPublicKeyOperation.class, "com.google.android.gms.wallet.ACTION_REMOVE_SIGNATURE_BASED_AUTH_PUBLIC_KEY");
                bauc.l(buyFlowConfig0, intent0, "com.google.android.gms.wallet.buyFlowConfig");
                intent0.putExtra("EXTRA_AUTHENTICATOR", v1 - 1);
                context0.startService(intent0);
            }
            if(v == 2) {
                ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                ProtoLiteBuilder hftp7 = this.au();
                if(!hftp7.b_message.isImmutable()) {
                    hftp7.ensureMutable();
                }
                gevj gevj2 = (gevj)hftp7.b_message;
                gevj2.b |= 4;
                gevj2.e = true;
                if(!hftp6.b_message.isImmutable()) {
                    hftp6.ensureMutable();
                }
                geut geut4 = (geut)hftp6.b_message;
                gevj gevj3 = (gevj)hftp7.N_build();
                gevj3.getClass();
                geut4.d = gevj3;
                geut4.c = 5;
                this.aw = (geut)hftp6.N_build();
                this.ae(2);
            }
            else {
                if(v == 4) {
                    this.aQ = true;
                }
                else {
                    this.an(this.aR);
                }
                this.ar();
                this.aq();
            }
        }
        else {
            switch(v) {
                case 1: {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = this.at();
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    gevc gevc0 = (gevc)hftp1.b_message;
                    gevc0.b |= 2;
                    gevc0.d = hfsf0;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    geut geut0 = (geut)hftp0.b_message;
                    gevc gevc1 = (gevc)hftp1.N_build();
                    gevc1.getClass();
                    geut0.d = gevc1;
                    geut0.c = 2;
                    geut1 = (geut)hftp0.N_build();
                    break;
                }
                case 2: {
                    ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                    ProtoLiteBuilder hftp3 = this.au();
                    if(!hftp3.b_message.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    gevj gevj0 = (gevj)hftp3.b_message;
                    gevj0.b |= 2;
                    gevj0.d = hfsf0;
                    if(!hftp2.b_message.isImmutable()) {
                        hftp2.ensureMutable();
                    }
                    geut geut2 = (geut)hftp2.b_message;
                    gevj gevj1 = (gevj)hftp3.N_build();
                    gevj1.getClass();
                    geut2.d = gevj1;
                    geut2.c = 5;
                    geut1 = (geut)hftp2.N_build();
                    break;
                }
                case 4: {
                    ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                    ProtoLiteBuilder hftp5 = this.as();
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    geux geux0 = (geux)hftp5.b_message;
                    geux0.b |= 2;
                    geux0.d = hfsf0;
                    if(!hftp4.b_message.isImmutable()) {
                        hftp4.ensureMutable();
                    }
                    geut geut3 = (geut)hftp4.b_message;
                    geux geux1 = (geux)hftp5.N_build();
                    geux1.getClass();
                    geut3.d = geux1;
                    geut3.c = 7;
                    geut1 = (geut)hftp4.N_build();
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unexpected authenticationMethod = " + v);
                }
            }
            this.aw = geut1;
            this.ae(v);
        }
        this.M();
    }

    public final void R() {
        boolean z = false;
        for(Object object0: this.aU) {
            gcjm gcjm0 = (gcjm)object0;
            if(this.cb.f(gcjm0) && gcjm0.a.f) {
                z = true;
            }
        }
        this.au = 1;
        fbyv fbyv0 = this.ap;
        if(fbyv0 != null && !z) {
            fbyv0.ax();
        }
    }

    public final void S() {
        FingerprintButton fingerprintButton0 = this.ag;
        if(fingerprintButton0 != null) {
            fingerprintButton0.a();
        }
    }

    public final void U(int v) {
        this.getView().setVisibility(v);
        FingerprintButton fingerprintButton0 = this.ag;
        if(fingerprintButton0 != null) {
            fingerprintButton0.setVisibility(v);
        }
        fccd fccd0 = this.an;
        if(fccd0 != null && v == 0) {
            fccd0.b.v(3);
            this.T(9, Bundle.EMPTY);
        }
    }

    public final void V(int v, Signature signature0) {
        gevn gevn0 = this.Z(v);
        if(gevn0 != null && geuv.a(gevn0.c) == 3) {
            signature0 = this.aH.h(3);
            if(signature0 == null) {
                this.Q(v, null);
                return;
            }
        }
        if(gevn0 != null && signature0 != null) {
            fbel fbel0 = this.aI;
            fbdw fbdw0 = this.aH;
            byte[] arr_b = ByteString.A(gevn0.b).toByteArray();
            fbel0.c = true;
            bbmq.E(new fbek(fbel0, fbel0.a(), fbdw0, arr_b, signature0, v), new Void[0]);
            return;
        }
        switch(v) {
            case 2: {
                ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                ProtoLiteBuilder hftp3 = this.au();
                if(!hftp2.b_message.isImmutable()) {
                    hftp2.ensureMutable();
                }
                geut geut1 = (geut)hftp2.b_message;
                gevj gevj0 = (gevj)hftp3.N_build();
                gevj0.getClass();
                geut1.d = gevj0;
                geut1.c = 5;
                this.aw = (geut)hftp2.N_build();
                break;
            }
            case 4: {
                ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                ProtoLiteBuilder hftp5 = this.as();
                if(!hftp4.b_message.isImmutable()) {
                    hftp4.ensureMutable();
                }
                geut geut2 = (geut)hftp4.b_message;
                geux geux0 = (geux)hftp5.N_build();
                geux0.getClass();
                geut2.d = geux0;
                geut2.c = 7;
                this.aw = (geut)hftp4.N_build();
                break;
            }
            default: {
                ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                ProtoLiteBuilder hftp1 = this.at();
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                geut geut0 = (geut)hftp0.b_message;
                gevc gevc0 = (gevc)hftp1.N_build();
                gevc0.getClass();
                geut0.d = gevc0;
                geut0.c = 2;
                this.aw = (geut)hftp0.N_build();
            }
        }
        this.ae(v);
    }

    public final void W(boolean z) {
        boolean z1 = true;
        if(this.am == null) {
            FingerprintButton fingerprintButton0 = this.ag;
            if(fingerprintButton0 != null) {
                fingerprintButton0.i = z;
                fingerprintButton0.d();
            }
        }
        else {
            boolean z2 = this.at && z && !this.aQ;
            xob xob0 = (xob)this.getContext();
            if(xob0 != null) {
                if(this.c == null && z2) {
                    z1 = false;
                }
                xob0.setVisible(z1);
            }
            if(z2) {
                fbzb fbzb0 = this.am;
                fbzb0.d = new CancellationSignal();
                clht clht0 = new clht(Looper.getMainLooper());
                Objects.requireNonNull(clht0);
                fbyy fbyy0 = new fbyy(clht0);
                BiometricPrompt.Builder biometricPrompt$Builder0 = new BiometricPrompt.Builder(fbzb0.a).setTitle(fbzb0.b.d).setSubtitle(fbzb0.b.e).setDescription(fbzb0.b.f).setNegativeButton(fbzb0.b.g, fbyy0, new fbyz(fbzb0));
                if(hzlv.o() && jys.d()) {
                    biometricPrompt$Builder0.setLogoRes(0x7F080A64);
                    biometricPrompt$Builder0.setLogoDescription("Google Pay");
                }
                BiometricPrompt biometricPrompt0 = biometricPrompt$Builder0.build();
                fbza fbza0 = new fbza(fbzb0);
                BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0 = fbzb0.c;
                if(biometricPrompt$CryptoObject0 == null) {
                    biometricPrompt0.authenticate(fbzb0.d, fbyy0, fbza0);
                    return;
                }
                biometricPrompt0.authenticate(biometricPrompt$CryptoObject0, fbzb0.d, fbyy0, fbza0);
                return;
            }
            fbzb fbzb1 = this.am;
            if(fbzb1.d != null && !fbzb1.d.isCanceled()) {
                fbzb1.d.cancel();
            }
        }
    }

    private final gevn Z(int v) {
        switch(v) {
            case 1: {
                gevb gevb0 = this.aM;
                if(gevb0 != null) {
                    return gevb0.j == null ? gevn.a : gevb0.j;
                }
                break;
            }
            case 2: {
                gevi gevi0 = this.aN;
                if(gevi0 != null) {
                    return gevi0.g == null ? gevn.a : gevi0.g;
                }
                break;
            }
            case 4: {
                geuw geuw0 = this.aK;
                if(geuw0 != null && (geuw0.b & 0x20) != 0) {
                    return geuw0.h == null ? gevn.a : geuw0.h;
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Unexpected authenticationMethod = " + v);
            }
        }
        return null;
    }

    @Override  // gcjs
    public final boolean aO(gfga gfga0) {
        return false;
    }

    private final void aa(gevd gevd0) {
        boolean z = true;
        gftb.b(((gevd0.b & 4) == 0 ? 0 : 1) == ((((geus)this.aA).b & 2) == 0 ? 0 : 1), "gaia_pin_form.enroll_signature_based_auth_confirmation_dialog and setup_signature_based_auth must be both present if any one exists");
        Context context0 = this.getContext();
        BuyFlowConfig buyFlowConfig0 = (BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig");
        Intent intent0 = faxy.i(context0, new Intent(), this.cM());
        intent0.setAction("com.google.android.gms.wallet.firstparty.ACTION_VERIFY_PIN_ACTIVITY").putExtra("com.google.android.gms.wallet.buyFlowConfig", buyFlowConfig0);
        gciq.k(intent0, "gaiaPinForm", ((MessageLite)gevd0));
        this.aG = intent0;
        this.aj = (ViewGroup)this.aJ.findViewById(0x7F0B14E4);  // id:gaia_pin_button_container
        gevs gevs0 = gevd0.d == null ? gevs.a : gevd0.d;
        int v = gevr.a(gevs0.j);
        gcyd gcyd0 = gcyh.c(gevs0, (v == 0 ? 1 : v), this.bV, this.cb, this.cM(), this.bW, this.aj, 0, 0, gcqy.d().a(), true, false);
        this.ao = gcyd0;
        gcyd0.c().setOnClickListener(this);
        FingerprintButton fingerprintButton0 = this.ag;
        if(fingerprintButton0 != null) {
            if(this.aO == 3) {
                z = false;
            }
            fingerprintButton0.c(z);
        }
        if(this.aO == 3) {
            this.aj.setVisibility(0);
        }
    }

    private final void ab(gevi gevi0) {
        boolean z = true;
        this.aN = gevi0;
        this.az = gevh.a(gevi0.c) == 3 ? new Intent("android.app.action.SET_NEW_PASSWORD") : ((KeyguardManager)this.getContext().getSystemService("keyguard")).createConfirmDeviceCredentialIntent(gevi0.e, gevi0.f);
        this.ak = (ViewGroup)this.aJ.findViewById(0x7F0B1862);  // id:lockscreen_button_container
        int v = gevr.a((gevi0.d == null ? gevs.a : gevi0.d).j);
        gcyd gcyd0 = gcyh.c((gevi0.d == null ? gevs.a : gevi0.d), (v == 0 ? 1 : v), this.bV, this.cb, this.cM(), this.bW, this.ak, 0, 0, gcqy.d().a(), true, false);
        this.a = gcyd0;
        gcyd0.c().setOnClickListener(this);
        FingerprintButton fingerprintButton0 = this.ag;
        if(fingerprintButton0 != null) {
            if(this.aO == 2) {
                z = false;
            }
            fingerprintButton0.c(z);
        }
        if(this.aO == 2) {
            this.ak.setVisibility(0);
        }
    }

    private final void ac(gfbn gfbn0) {
        View view0 = this.aJ.findViewById(0x7F0B242F);  // id:username_password_form_holder
        this.ah = view0;
        if(this.aO == 5) {
            view0.setVisibility(0);
        }
        fccd fccd0 = (fccd)this.getChildFragmentManager().h("usernamePasswordFragment");
        this.an = fccd0;
        if(fccd0 == null) {
            this.an = fccd.Q(gfbn0, this.bU, this.cM());
            ca ca0 = new ca(this.getChildFragmentManager());
            ca0.u(0x7F0B242F, this.an, "usernamePasswordFragment");  // id:username_password_form_holder
            ca0.a();
        }
        this.ay.d(this.an);
        this.ay.n();
    }

    private final void ad() {
        if(this.aL == null) {
            throw new IllegalStateException("FidoVerificationComponent is not initialized yet");
        }
        bmei bmei0 = new bmei(this.getContext());
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this.aL.e) {
            arrayList0.add(new PublicKeyCredentialDescriptor("public-key", ((gqvj)object0).b.toByteArray(), null));
        }
        if(arrayList0.size() == 1) {
            PublicKeyCredentialDescriptor publicKeyCredentialDescriptor0 = (PublicKeyCredentialDescriptor)arrayList0.get(0);
            bmei0.h(this.aL.g, publicKeyCredentialDescriptor0.e()).z((evql evql0) -> try {
                if(((Boolean)evql0.k(aztb.class)).booleanValue()) {
                    this.ap(bmei0, this.aL, arrayList0);
                    return;
                }
                this.ao("Cryptauth key is invalid");
            }
            catch(aztb | CancellationException exception0) {
                this.ao(String.format("IsUvpaa failed: %s", exception0.getMessage()));
            });
            return;
        }
        this.ap(bmei0, this.aL, arrayList0);
    }

    private final void ae(int v) {
        this.am(v, true);
    }

    private final void am(int v, boolean z) {
        this.av = v;
        if(z) {
            geus geus0 = (geus)this.aA;
            if((geus0.b & 2) != 0) {
                fbyw fbyw0 = this.aq;
                if(fbyw0 != null) {
                    fbyw0.aL(new SetUpBiometricAuthenticationKeysRequest((geus0.e == null ? gevk.a : geus0.e).toBytesArray()));
                    return;
                }
            }
        }
        this.R();
    }

    private final void an(String s) {
        this.aQ = true;
        this.ag.b(s);
        this.ag.setEnabled(((boolean)(this.aP ^ 1)));
    }

    private final void ao(String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geut.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)geva.a).v_newBuilder();
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)geuz.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        geuz geuz0 = (geuz)hftp2.b_message;
        s.getClass();
        geuz0.b |= 2;
        geuz0.d = s;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        geva geva0 = (geva)hftp1.b_message;
        geuz geuz1 = (geuz)hftp2.N_build();
        geuz1.getClass();
        geva0.d = geuz1;
        geva0.b |= 2;
        int v = this.aL.i;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        geva geva1 = (geva)hftp1.b_message;
        geva1.b |= 8;
        geva1.f = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geut geut0 = (geut)hftp0.b_message;
        geva geva2 = (geva)hftp1.N_build();
        geva2.getClass();
        geut0.d = geva2;
        geut0.c = 8;
        this.aw = (geut)hftp0.N_build();
        for(Object object0: this.aS) {
            this.cb.c(((gcjm)object0));
        }
    }

    private final void ap(bmei bmei0, geuy geuy0, List list0) {
        bmio bmio0 = new bmio();
        bmio0.b(geuy0.d.toByteArray());
        bmio0.c(geuy0.g);
        bmio0.a = (double)geuy0.f;
        bmio0.b = list0;
        int v = geuy0.i;
        if(v != 0) {
            bmio0.c = v;
        }
        bmei0.f(bmio0.a()).b((PendingIntent pendingIntent0) -> try {
            this.startIntentSenderForResult(pendingIntent0.getIntentSender(), 3, null, 0, 0, 0, null);
        }
        catch(IntentSender.SendIntentException unused_ex) {
            for(Object object0: this.aS) {
                this.cb.c(((gcjm)object0));
            }
        });
    }

    private final void aq() {
        View view0;
        if(this.aQ && this.aO == 4) {
            gcyd gcyd0 = this.b;
            if(gcyd0 != null) {
                view0 = gcyd0.c();
            }
            else if(this.ak != null) {
                view0 = this.a.c();
            }
            else if(this.aj == null) {
                view0 = this.an == null ? null : this.ah;
            }
            else {
                view0 = this.ao.c();
            }
            if(view0 == null) {
                throw new IllegalStateException("Should provide a valid secondary authentication method");
            }
            if(view0 != this.ah) {
                this.onClick(view0);
                this.aQ = false;
            }
        }
    }

    private final void ar() {
        boolean z = this.aQ;
        int v = 0;
        int v1 = !z || this.am != null ? 4 : 0;
        gcyd gcyd0 = this.b;
        if(gcyd0 != null) {
            gcyd0.c().setVisibility(v1);
            return;
        }
        ViewGroup viewGroup0 = this.ak;
        if(viewGroup0 != null && this.aO != 2) {
            viewGroup0.setVisibility(v1);
            return;
        }
        ViewGroup viewGroup1 = this.aj;
        if(viewGroup1 != null && this.aO != 3) {
            viewGroup1.setVisibility(v1);
            return;
        }
        if(this.an != null && this.aO != 5) {
            View view0 = this.ah;
            if(!z) {
                v = 4;
            }
            view0.setVisibility(v);
        }
    }

    private final ProtoLiteBuilder as() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geux.a).v_newBuilder();
        ByteString hfsf0 = (this.aK.c == null ? gewg.a : this.aK.c).e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        geux geux0 = (geux)hftp0.b_message;
        hfsf0.getClass();
        geux0.b |= 1;
        geux0.c = hfsf0;
        return hftp0;
    }

    private final ProtoLiteBuilder at() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gevc.a).v_newBuilder();
        ByteString hfsf0 = (this.aM.c == null ? gewg.a : this.aM.c).e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gevc gevc0 = (gevc)hftp0.b_message;
        hfsf0.getClass();
        gevc0.b |= 1;
        gevc0.c = hfsf0;
        return hftp0;
    }

    private final ProtoLiteBuilder au() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gevj.a).v_newBuilder();
        ByteString hfsf0 = (this.aN.b == null ? gewg.a : this.aN.b).e;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gevj gevj0 = (gevj)hftp0.b_message;
        hfsf0.getClass();
        gevj0.b |= 1;
        gevj0.c = hfsf0;
        return hftp0;
    }

    @Override  // gdaa
    public final boolean la() {
        return true;
    }

    @Override  // gczu
    public final ArrayList lh() {
        ArrayList arrayList0 = new ArrayList(1);
        if(this.getView() != null && this.ah != null && this.getView().getVisibility() == 0 && this.ah.getVisibility() == 0) {
            arrayList0.add(new gczs(this.an));
        }
        return arrayList0;
    }

    @Override  // gami
    public final List li() {
        return Collections.EMPTY_LIST;
    }

    @Override  // gcjs
    public final void lk(ArrayList arrayList0) {
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            gcjm gcjm0 = (gcjm)arrayList0.get(v1);
            gfga gfga0 = gcjm0.a;
            int v2 = gffw.a(gfga0.e);
            int v3 = 1;
            if(v2 == 0) {
                v2 = 1;
            }
            switch(v2 - 1) {
                case 20: {
                    this.aS.add(gcjm0);
                    break;
                }
                case 21: {
                    this.aT.add(gcjm0);
                    break;
                }
                case 22: {
                    this.aU.add(gcjm0);
                    break;
                }
                default: {
                    Locale locale0 = Locale.US;
                    int v4 = gffw.a(gfga0.e);
                    if(v4 != 0) {
                        v3 = v4;
                    }
                    throw new IllegalArgumentException(String.format(locale0, "Unsupported trigger type: %s", ((int)(v3 - 1))));
                }
            }
        }
    }

    @Override  // gdcm
    public final void lu() {
        throw new UnsupportedOperationException("UiNode doesn\'t support custom parents.");
    }

    @Override  // gdaa
    public final boolean ly(getg getg0) {
        return false;
    }

    @Override  // gcyg
    public final gdew mb() {
        return this.ay;
    }

    @Override  // du
    public final void onActivityResult(int v, int v1, Intent intent0) {
        if(v == 1) {
            if(gevh.a(this.aN.c) == 3) {
                v1 = gcut.g(this.getContext().getApplicationContext()) ? -1 : 0;
            }
            v = 1;
        }
        if(v1 == -1) {
            switch(v) {
                case 1: {
                    this.V(2, null);
                    return;
                }
                case 2: {
                    ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                    ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)geve.a).v_newBuilder();
                    String s = intent0.getStringExtra("encodedPreauthProofToken");
                    if(!hftp1.b_message.isImmutable()) {
                        hftp1.ensureMutable();
                    }
                    geve geve0 = (geve)hftp1.b_message;
                    s.getClass();
                    geve0.b |= 1;
                    geve0.c = s;
                    if(!hftp0.b_message.isImmutable()) {
                        hftp0.ensureMutable();
                    }
                    geut geut0 = (geut)hftp0.b_message;
                    geve geve1 = (geve)hftp1.N_build();
                    geve1.getClass();
                    geut0.d = geve1;
                    geut0.c = 1;
                    this.aw = (geut)hftp0.N_build();
                    this.am(3, intent0.getBooleanExtra("shouldPerformFingerprintAuthEnrollment", false));
                    return;
                }
                case 3: {
                    if(intent0.hasExtra("FIDO2_ERROR_EXTRA")) {
                        AuthenticatorErrorResponse authenticatorErrorResponse0 = AuthenticatorErrorResponse.c(intent0.getByteArrayExtra("FIDO2_ERROR_EXTRA"));
                        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)geva.a).v_newBuilder();
                        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)geuz.a).v_newBuilder();
                        long v2 = (long)authenticatorErrorResponse0.b();
                        if(!hftp4.b_message.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        ProtoLiteMessage hftv0 = hftp4.b_message;
                        ((geuz)hftv0).b |= 1;
                        ((geuz)hftv0).c = v2;
                        String s1 = authenticatorErrorResponse0.b;
                        if(!hftv0.isImmutable()) {
                            hftp4.ensureMutable();
                        }
                        geuz geuz0 = (geuz)hftp4.b_message;
                        s1.getClass();
                        geuz0.b |= 2;
                        geuz0.d = s1;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        geva geva0 = (geva)hftp3.b_message;
                        geuz geuz1 = (geuz)hftp4.N_build();
                        geuz1.getClass();
                        geva0.d = geuz1;
                        geva0.b |= 2;
                        int v3 = this.aL.i;
                        if(!hftp3.b_message.isImmutable()) {
                            hftp3.ensureMutable();
                        }
                        geva geva1 = (geva)hftp3.b_message;
                        geva1.b |= 8;
                        geva1.f = v3;
                        if(!hftp2.b_message.isImmutable()) {
                            hftp2.ensureMutable();
                        }
                        geut geut1 = (geut)hftp2.b_message;
                        geva geva2 = (geva)hftp3.N_build();
                        geva2.getClass();
                        geut1.d = geva2;
                        geut1.c = 8;
                        this.aw = (geut)hftp2.N_build();
                        for(Object object0: this.aS) {
                            this.cb.c(((gcjm)object0));
                        }
                        return;
                    }
                    AuthenticatorAssertionResponse authenticatorAssertionResponse0 = AuthenticatorAssertionResponse.b(intent0.getByteArrayExtra("FIDO2_RESPONSE_EXTRA"));
                    ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)geut.a).v_newBuilder();
                    ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)geva.a).v_newBuilder();
                    ByteString hfsf0 = (this.aL.c == null ? gewg.a : this.aL.c).e;
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    geva geva3 = (geva)hftp6.b_message;
                    hfsf0.getClass();
                    geva3.b |= 4;
                    geva3.e = hfsf0;
                    ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)gqvh.a).v_newBuilder();
                    ByteString hfsf1 = ByteString.copyFrom(authenticatorAssertionResponse0.c());
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gqvh gqvh0 = (gqvh)hftp7.b_message;
                    gqvh0.b |= 2;
                    gqvh0.d = hfsf1;
                    ByteString hfsf2 = ByteString.copyFrom(authenticatorAssertionResponse0.e());
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gqvh gqvh1 = (gqvh)hftp7.b_message;
                    gqvh1.b |= 1;
                    gqvh1.c = hfsf2;
                    ByteString hfsf3 = ByteString.copyFrom(authenticatorAssertionResponse0.f());
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gqvh gqvh2 = (gqvh)hftp7.b_message;
                    gqvh2.b |= 8;
                    gqvh2.f = hfsf3;
                    ByteString hfsf4 = ByteString.copyFrom(authenticatorAssertionResponse0.d());
                    if(!hftp7.b_message.isImmutable()) {
                        hftp7.ensureMutable();
                    }
                    gqvh gqvh3 = (gqvh)hftp7.b_message;
                    gqvh3.b |= 4;
                    gqvh3.e = hfsf4;
                    if(!hftp6.b_message.isImmutable()) {
                        hftp6.ensureMutable();
                    }
                    geva geva4 = (geva)hftp6.b_message;
                    gqvh gqvh4 = (gqvh)hftp7.N_build();
                    gqvh4.getClass();
                    geva4.c = gqvh4;
                    geva4.b |= 1;
                    if(!hftp5.b_message.isImmutable()) {
                        hftp5.ensureMutable();
                    }
                    geut geut2 = (geut)hftp5.b_message;
                    geva geva5 = (geva)hftp6.N_build();
                    geva5.getClass();
                    geut2.d = geva5;
                    geut2.c = 8;
                    this.aw = (geut)hftp5.N_build();
                    this.am(6, false);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        if(v1 == 0 && v == 3) {
            for(Object object1: this.aT) {
                this.cb.c(((gcjm)object1));
            }
        }
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        if(this.b != null && view0.getId() == this.b.c().getId()) {
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)geut.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((geut)hftp0.b_message).c = 3;
            ((geut)hftp0.b_message).d = Boolean.valueOf(true);
            this.aw = (geut)hftp0.N_build();
            this.au = 2;
            fbyv fbyv0 = this.ap;
            if(fbyv0 != null) {
                fbyv0.ax();
                FingerprintButton fingerprintButton0 = this.ag;
                if(fingerprintButton0 != null) {
                    fingerprintButton0.a();
                }
            }
        }
        else {
            if(this.a != null && view0.getId() == this.a.c().getId()) {
                this.startActivityForResult(this.az, 1);
                return;
            }
            if(this.ao != null && view0.getId() == this.ao.c().getId()) {
                this.startActivityForResult(this.aG, 2);
                return;
            }
            if(this.c != null && view0.getId() == this.c.c().getId()) {
                this.at = true;
                this.W(true);
                return;
            }
            if(this.d != null && view0.getId() == this.d.c().getId()) {
                this.ad();
            }
        }
    }

    @Override  // gdcm
    public final void onPause() {
        super.onPause();
        FingerprintButton fingerprintButton0 = this.ag;
        if(fingerprintButton0 == null) {
            fbzb fbzb0 = this.am;
            if(fbzb0 != null) {
                fbzb0.e = null;
            }
        }
        else {
            fingerprintButton0.f(null);
        }
        this.aI.b(null);
        this.W(false);
    }

    @Override  // gdcm
    public final void onResume() {
        super.onResume();
        this.aI.b(this);
        FingerprintButton fingerprintButton0 = this.ag;
        if(fingerprintButton0 == null) {
            fbzb fbzb0 = this.am;
            if(fbzb0 != null) {
                fbzb0.e = this;
            }
        }
        else {
            fingerprintButton0.f(this);
        }
        this.W(this.ar);
    }

    @Override  // gdak
    public final void onSaveInstanceState(Bundle bundle0) {
        super.onSaveInstanceState(bundle0);
        this.aI.b(null);
        bundle0.putBoolean("showSecondaryAuthentication", this.aQ);
        bundle0.putInt("authenticationStatus", this.au);
        bundle0.putInt("authenticationMethod", this.av);
        gciq.j(bundle0, "authenticationFormValue", ((MessageLite)this.aw));
        bundle0.putBoolean("isAuthenticationEnabled", this.ar);
        bundle0.putBoolean("shouldRunBiometricAuthentication", this.at);
        FingerprintButton fingerprintButton0 = this.ag;
        if(fingerprintButton0 != null) {
            fingerprintButton0.f(null);
        }
    }

    @Override  // gcyg
    protected final View y(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        boolean z1;
        boolean z;
        this.aI = (fbel)new lso(this).a(fbel.class);
        this.aJ = layoutInflater0.inflate(0x7F0E0D21, viewGroup0, false);  // layout:wallet_fragment_authentication_form
        BiometricPrompt.CryptoObject biometricPrompt$CryptoObject0 = null;
        if(bundle0 != null) {
            this.aQ = bundle0.getBoolean("showSecondaryAuthentication", false);
            this.au = bundle0.getInt("authenticationStatus");
            this.av = bundle0.getInt("authenticationMethod");
            this.aw = (geut)gciq.a(bundle0, "authenticationFormValue", ((Parser)((ProtoLiteMessage)geut.a).jf(7, null)));
            this.ar = bundle0.getBoolean("isAuthenticationEnabled", true);
            this.at = bundle0.getBoolean("shouldRunBiometricAuthentication", true);
        }
        this.aH = fbdw.a(this.getContext(), ((BuyFlowConfig)this.getArguments().getParcelable("buyFlowConfig")));
        geur geur0 = (geur)((geus)this.aA).d.get(0);
        int v = geur0.b;
        if(v == 6) {
            this.aO = 4;
            geuw geuw0 = (geuw)geur0.c;
            this.aK = geuw0;
            if((geuw0.b & 0x20) != 0) {
                switch(geuv.a((geuw0.h == null ? gevn.a : geuw0.h).c)) {
                    case 0: {
                        z = true;
                        break;
                    }
                    case 2: {
                        Signature signature0 = this.aH.h(2);
                        z = signature0 != null;
                        if(z) {
                            biometricPrompt$CryptoObject0 = new BiometricPrompt.CryptoObject(signature0);
                        }
                        break;
                    }
                    default: {
                        z = true;
                    }
                }
                if(z) {
                    this.aP = false;
                }
                else {
                    this.aP = true;
                    this.aQ = true;
                }
            }
            this.am = new fbzb(this.getContext(), biometricPrompt$CryptoObject0, geuw0);
            if((geuw0.b & 0x40) == 0) {
                this.at = true;
            }
            else {
                this.al = (ViewGroup)this.aJ.findViewById(0x7F0B235A);  // id:trigger_biometric_button_container
                gevs gevs0 = geuw0.i == null ? gevs.a : geuw0.i;
                int v1 = gevr.a(gevs0.j);
                gcyd gcyd0 = gcyh.c(gevs0, (v1 == 0 ? 1 : v1), this.bV, this.cb, this.cM(), this.bW, this.al, 0, 0, gcqy.d().a(), true, false);
                this.c = gcyd0;
                gcyd0.c().setOnClickListener(this);
                this.al.setVisibility(0);
                this.as = false;
            }
        }
        else if(v == 1) {
            this.aO = 1;
            gevb gevb0 = (gevb)geur0.c;
            this.aM = gevb0;
            FingerprintButton fingerprintButton0 = (FingerprintButton)this.aJ.findViewById(0x7F0B13E7);  // id:fingerprint_button
            this.ag = fingerprintButton0;
            fingerprintButton0.setVisibility(0);
            this.ag.f(this);
            this.ag.g = this.cM();
            if((gevb0.b & 0x80) != 0) {
                this.aR = (gevb0.j == null ? gevn.a : gevb0.j).d;
                switch(geuv.a((gevb0.j == null ? gevn.a : gevb0.j).c)) {
                    case 0: {
                        z1 = true;
                        break;
                    }
                    case 2: {
                        Signature signature1 = this.aH.h(2);
                        z1 = signature1 != null;
                        if(z1) {
                            biometricPrompt$CryptoObject0 = new FingerprintManager.CryptoObject(signature1);
                        }
                        break;
                    }
                    default: {
                        z1 = true;
                    }
                }
                if(z1) {
                    this.aP = false;
                }
                else {
                    this.aP = true;
                    this.an(this.aR);
                }
            }
            FingerprintButton fingerprintButton1 = this.ag;
            fingerprintButton1.k = biometricPrompt$CryptoObject0;
            fingerprintButton1.f = gevb0;
            fingerprintButton1.e(fingerprintButton1.e);
            fingerprintButton1.d();
        }
        else if(v == 3) {
            this.aO = 5;
            this.ac(((gfbn)geur0.c));
        }
        else if(v == 4) {
            this.aO = 2;
            this.ab(((gevi)geur0.c));
        }
        else if(v == 5) {
            this.aO = 3;
            this.aa(((gevd)geur0.c));
        }
        else if(v == 7) {
            this.aO = 6;
            geuy geuy0 = (geuy)geur0.c;
            this.aL = geuy0;
            if((geuy0.b & 0x20) != 0) {
                this.ai = (ViewGroup)this.aJ.findViewById(0x7F0B1398);  // id:fido_button_container
                int v2 = gevr.a((geuy0.h == null ? gevs.a : geuy0.h).j);
                gcyd gcyd1 = gcyh.c((geuy0.h == null ? gevs.a : geuy0.h), (v2 == 0 ? 1 : v2), this.bV, this.cb, this.cM(), this.bW, this.ai, 0, 0, gcqy.d().a(), true, false);
                this.d = gcyd1;
                gcyd1.c().setOnClickListener(this);
                this.ai.setVisibility(0);
            }
        }
        if(((geus)this.aA).d.size() > 1) {
            switch(((geur)((geus)this.aA).d.get(1)).b) {
                case 2: {
                    geur geur1 = (geur)((geus)this.aA).d.get(1);
                    gevs gevs1 = geur1.b == 2 ? ((gevs)geur1.c) : gevs.a;
                    gcyd gcyd2 = (gcyd)this.aJ.findViewById(0x7F0B2415);  // id:use_skip_authentication_button
                    this.b = gcyd2;
                    gcyd2.i(gevs1);
                    this.b.m(this.cM());
                    this.b.d().setTextColor(gdcb.l(this.bV));
                    this.b.c().setOnClickListener(this);
                    this.ag.c(true);
                    break;
                }
                case 3: {
                    geur geur2 = (geur)((geus)this.aA).d.get(1);
                    this.ac((geur2.b == 3 ? ((gfbn)geur2.c) : gfbn.a));
                    break;
                }
                case 4: {
                    geur geur3 = (geur)((geus)this.aA).d.get(1);
                    this.ab((geur3.b == 4 ? ((gevi)geur3.c) : gevi.a));
                    break;
                }
                case 5: {
                    geur geur4 = (geur)((geus)this.aA).d.get(1);
                    this.aa((geur4.b == 5 ? ((gevd)geur4.c) : gevd.a));
                }
            }
        }
        this.ar();
        this.aq();
        this.M();
        return this.aJ;
    }

    public static fbyx z(geus geus0, int v, LogContext logContext0, BuyFlowConfig buyFlowConfig0) {
        boolean z2;
        boolean z1;
        boolean z = false;
        gftb.b(geus0 != null && geus0.d.size() > 0, "Must provide an AuthType");
        gftb.checkTrue(((geur)geus0.d.get(0)).b != 7 || geus0.d.size() == 1);
    alab1:
        switch(geus0.d.size()) {
            case 1: {
            label_12:
                z1 = true;
                break;
            }
            case 2: {
                switch(((geur)geus0.d.get(0)).b) {
                    case 1: 
                    case 3: 
                    case 6: {
                        switch(((geur)geus0.d.get(1)).b) {
                            case 2: 
                            case 3: 
                            case 4: 
                            case 5: {
                                goto label_12;
                            }
                            default: {
                                z1 = false;
                                break alab1;
                            }
                        }
                    }
                    default: {
                        z1 = false;
                        break alab1;
                    }
                }
            }
            default: {
                z1 = false;
            }
        }
        gftb.b(z1, "This type of AuthenticationForm not supported.");
        if(((geur)geus0.d.get(0)).b == 6) {
            geur geur0 = (geur)geus0.d.get(0);
            z2 = ((geur0.b == 6 ? ((geuw)geur0.c) : geuw.a).b & 0x20) == 0 || geus0.d.size() == 2;
        }
        else {
            z2 = true;
        }
        gftb.b(z2, "Should always have backup authentication method for signature based biometrics.");
        if(((geur)geus0.d.get(0)).b == 1) {
            geur geur1 = (geur)geus0.d.get(0);
            if(((geur1.b == 1 ? ((gevb)geur1.c) : gevb.a).b & 0x80) == 0 || geus0.d.size() == 2) {
                z = true;
            }
        }
        else {
            z = true;
        }
        gftb.b(z, "Should always have backup authentication method for signature based fingerprint.");
        fbyx fbyx0 = new fbyx();
        Bundle bundle0 = fbyx.al(v, ((MessageLite)geus0), logContext0);
        bundle0.putParcelable("buyFlowConfig", buyFlowConfig0);
        fbyx0.setArguments(bundle0);
        return fbyx0;
    }
}

