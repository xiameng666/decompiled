import com.google.android.gms.auth.folsom.RecoveryRequest;
import com.google.android.gms.auth.folsom.RecoveryResult;
import com.google.android.gms.common.Feature;
import j..util.Optional;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public final class fcpu {
    public static final baun a;
    public final fcom b;
    public final aqle c;
    public final fcps d;
    public final fcfe e;
    public final fcfd f;
    public boolean g;
    public final fcpc h;
    private final fcrl i;
    private final fcok j;
    private final gmcg k;
    private boolean l;
    private final azts m;

    static {
        fcpu.a = new fcgf(new String[]{"KeyRecoveryHelper"});
    }

    public fcpu(azts azts0, fcrl fcrl0, fcom fcom0, aqle aqle0, fcps fcps0, fcpc fcpc0, fcok fcok0, gmcg gmcg0, fcfe fcfe0) {
        this.l = false;
        this.m = azts0;
        this.i = fcrl0;
        this.b = fcom0;
        this.c = aqle0;
        this.d = fcps0;
        this.h = fcpc0;
        this.j = fcok0;
        this.k = gmcg0;
        this.e = fcfe0;
        this.f = new fcpm(this, fcok0, fcpc0);
    }

    public final void a(RecoveryResult recoveryResult0, aqej aqej0) {
        int v1;
        Optional optional0;
        int v = 0;
        if(aqej0 == null) {
            optional0 = Optional.empty();
        }
        else {
            try {
                ByteString hfsf0 = aqej0.d;
                hftc hftc0 = hftc.a();
                hfsl hfsl0 = hfsf0.k();
                ProtoLiteMessage hftv0 = ((ProtoLiteMessage)aktv.a).x_newMutableInstance();
                try {
                    hfwc hfwc0 = hfvu.a.c(hftv0);
                    hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
                    hfwc0.g(hftv0);
                }
                catch(hfur hfur0) {
                    if(hfur0.b) {
                        hfur0 = new hfur(hfur0);
                    }
                    hfur0.a = hftv0;
                    throw hfur0;
                }
                catch(hfwr hfwr0) {
                    hfur hfur1 = hfwr0.a();
                    hfur1.a = hftv0;
                    throw hfur1;
                }
                catch(IOException iOException0) {
                    if((iOException0.getCause() instanceof hfur)) {
                        throw (hfur)iOException0.getCause();
                    }
                    hfur hfur2 = new hfur(iOException0);
                    hfur2.a = hftv0;
                    throw hfur2;
                }
                catch(RuntimeException runtimeException0) {
                    if((runtimeException0.getCause() instanceof hfur)) {
                        throw (hfur)runtimeException0.getCause();
                    }
                    throw runtimeException0;
                }
                try {
                    hfsl0.z(0);
                }
                catch(hfur hfur3) {
                    hfur3.a = hftv0;
                    throw hfur3;
                }
                ProtoLiteMessage.P_makeImmutable(hftv0);
                optional0 = Optional.of(((aktv)hftv0));
            }
            catch(hfur unused_ex) {
                optional0 = Optional.empty();
            }
        }
        if(aqej0 == null) {
            v1 = 10;
        }
        else {
            int v2 = fcpu.g((aqej0.c == null ? aqek.a : aqej0.c));
            if((aqej0.b & 16) != 0) {
                v = aqej0.f;
            }
            v1 = v2 - v;
        }
        fcok fcok0 = this.j;
        fcps fcps0 = this.d;
        aktu aktu0 = (aktu)optional0.map(new fcpk()).orElse(aktu.a);
        akts akts0 = (akts)optional0.map(new fcpl()).orElse(akts.a);
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gidf.a).v_newBuilder();
        int v3 = recoveryResult0.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gidf)hftv1).b |= 2;
        ((gidf)hftv1).d = v3;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((gidf)hftv2).b |= 4;
        ((gidf)hftv2).e = v1;
        long v4 = recoveryResult0.b;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gidf)hftv3).b |= 8;
        ((gidf)hftv3).f = v4;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv4 = hftp0.b_message;
        ((gidf)hftv4).h = akts0.d;
        ((gidf)hftv4).b |= 0x20;
        if(!hftv4.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv5 = hftp0.b_message;
        ((gidf)hftv5).b |= 1;
        ((gidf)hftv5).c = fcps0.c;
        if(!hftv5.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gidf)hftp0.b_message).g = aktu0.e;
        ((gidf)hftp0.b_message).b |= 16;
        gidf gidf0 = (gidf)hftp0.N_build();
        ProtoLiteBuilder hftp1 = fcok.e();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gidf0.getClass();
        ghys0.G = gidf0;
        ghys0.c |= 0x20;
        fcok0.g(hftp1, ghyr.I);
    }

    // Detected as a lambda impl.
    public final void b(Exception exception0, aqej aqej0) {
        fcpu.a.n("Unable to start recovery.", exception0, new Object[0]);
        this.f(4);
        this.h.a();
        RecoveryResult recoveryResult0 = new RecoveryResult();
        recoveryResult0.a = 9;
        this.a(recoveryResult0, aqej0);
    }

    public final void c() {
        if(this.g) {
            this.f(4);
        }
    }

    public final void d(byte[] arr_b) {
        gmcd gmcd0;
        fcpu.a.h("startRecovery()", new Object[0]);
        if(this.l) {
            fcpp fcpp0 = new fcpp(this);
            gmcd0 = glzd.f(this.k.e(fcpp0), new fcpq(this), gmap.a);
        }
        else {
            this.l = true;
            gmcd0 = gmbu.i(this.d.d);
        }
        gmcd0.hB(new fcpf(this, arr_b, gmcd0), gmap.a);
    }

    public final void e(byte[] arr_b, aqej aqej0) {
        byte[] arr_b1;
        ProtoLiteMessage hftv0;
        hfsl hfsl0;
        hftc hftc0;
        try {
            ByteString hfsf0 = aqej0.d;
            hftc0 = hftc.a();
            hfsl0 = hfsf0.k();
            hftv0 = ((ProtoLiteMessage)aktv.a).x_newMutableInstance();
        }
        catch(NoSuchAlgorithmException | hfur exception0) {
            fcpu.a.m("Failed to generate secret hash.", new Object[0]);
            this.b(exception0, aqej0);
            return;
        }
        try {
            hfwc hfwc0 = hfvu.a.c(hftv0);
            hfwc0.l(hftv0, hfsm.p(hfsl0), hftc0);
            hfwc0.g(hftv0);
            goto label_27;
        }
        catch(hfur hfur0) {
        }
        catch(hfwr hfwr0) {
            goto label_14;
        }
        catch(IOException iOException0) {
            goto label_18;
        }
        catch(RuntimeException runtimeException0) {
            goto label_24;
        }
        catch(NoSuchAlgorithmException exception0) {
            fcpu.a.m("Failed to generate secret hash.", new Object[0]);
            this.b(exception0, aqej0);
            return;
        }
        try {
            if(hfur0.b) {
                hfur0 = new hfur(hfur0);
            }
            hfur0.a = hftv0;
            throw hfur0;
        label_14:
            hfur hfur1 = hfwr0.a();
            hfur1.a = hftv0;
            throw hfur1;
        label_18:
            if((iOException0.getCause() instanceof hfur)) {
                throw (hfur)iOException0.getCause();
            }
            hfur hfur2 = new hfur(iOException0);
            hfur2.a = hftv0;
            throw hfur2;
        label_24:
            if((runtimeException0.getCause() instanceof hfur)) {
                throw (hfur)runtimeException0.getCause();
            }
            throw runtimeException0;
        }
        catch(NoSuchAlgorithmException | hfur exception0) {
            fcpu.a.m("Failed to generate secret hash.", new Object[0]);
            this.b(exception0, aqej0);
            return;
        }
        try {
        label_27:
            hfsl0.z(0);
            goto label_32;
        }
        catch(hfur hfur3) {
            try {
                hfur3.a = hftv0;
                throw hfur3;
            label_32:
                ProtoLiteMessage.P_makeImmutable(hftv0);
                arr_b1 = fgeg.a(fgeh.a(((aktv)hftv0)), arr_b);
                goto label_39;
            }
            catch(NoSuchAlgorithmException | hfur exception0) {
            }
            fcpu.a.m("Failed to generate secret hash.", new Object[0]);
            this.b(exception0, aqej0);
            return;
        }
        catch(NoSuchAlgorithmException exception0) {
            fcpu.a.m("Failed to generate secret hash.", new Object[0]);
            this.b(exception0, aqej0);
            return;
        }
    label_39:
        RecoveryRequest recoveryRequest0 = new RecoveryRequest();
        recoveryRequest0.a = this.d.a.name;
        recoveryRequest0.b = this.d.a.type;
        recoveryRequest0.c = arr_b1;
        aqek aqek0 = aqej0.c == null ? aqek.a : aqej0.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gmlt.a).v_newBuilder();
        ByteString hfsf1 = aqek0.c;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        hfsf1.getClass();
        ((gmlt)hftv1).b = hfsf1;
        ByteString hfsf2 = aqek0.d;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        hfsf2.getClass();
        ((gmlt)hftv2).c = hfsf2;
        int v = aqek0.e;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv3 = hftp0.b_message;
        ((gmlt)hftv3).d = v;
        ByteString hfsf3 = aqek0.f;
        if(!hftv3.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmlt gmlt0 = (gmlt)hftp0.b_message;
        hfsf3.getClass();
        gmlt0.e = hfsf3;
        recoveryRequest0.d = ((gmlt)hftp0.N_build()).toBytesArray();
        recoveryRequest0.e = aqej0.e.toByteArray();
        recoveryRequest0.f = aqej0.d.toByteArray();
        azzc azzc0 = new azzc();
        azzc0.a = new ajvm(this.m, recoveryRequest0);
        azzc0.c = new Feature[]{amjz.c};
        azzc0.d = 1640;
        azzd azzd0 = azzc0.a();
        evql evql0 = this.m.iG(azzd0);
        fcpg fcpg0 = new fcpg(this, aqej0);
        evql0.y(gmap.a, fcpg0);
        fcph fcph0 = (Exception exception0) -> {
            fcpu.a.n("Unable to start recovery.", exception0, new Object[0]);
            this.f(4);
            this.h.a();
            RecoveryResult recoveryResult0 = new RecoveryResult();
            recoveryResult0.a = 9;
            this.a(recoveryResult0, aqej0);
        };
        evql0.v(gmap.a, fcph0);
        fcpi fcpi0 = new fcpi(this, aqej0);
        evql0.p(gmap.a, fcpi0);
    }

    public final void f(int v) {
        this.g = false;
        fcrl.a.j("sending key_recovery_result request: %s", new Object[]{ffao.a(v)});
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ffap.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ffap)hftp0.b_message).c = v - 1;
        ((ffap)hftp0.b_message).b |= 1;
        ffap ffap0 = (ffap)hftp0.N_build();
        fcrk fcrk0 = new fcrk(this.i, this.d.e, ffap0);
        this.i.b("sendKeyRecoveryResult", fcrk0);
    }

    public static final int g(aqek aqek0) {
        return (aqek0.b & 4) == 0 ? 10 : aqek0.e;
    }
}

