import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import j..util.Objects;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

final class auby implements auad {
    final aucd a;

    public auby(aucd aucd0) {
        Objects.requireNonNull(aucd0);
        this.a = aucd0;
        super();
    }

    @Override  // auad
    public final void a() {
        this.a.S();
    }

    @Override  // auad
    public final void b() {
        aucd aucd0 = this.a;
        auba auba0 = aucd0.X;
        if(auba0 != null) {
            aunj aunj0 = auba0.a("connection success");
            if(aunj0 != null) {
                auba0.c = ((Long)auba0.a.mr()).intValue() + 1;
                if(auba0.d) {
                    String s = auba0.b();
                    auba0.b.n("Reset wake retries device %s", s);
                    aunj0.d = 0;
                }
            }
        }
        avjh avjh0 = aucd0.k;
        avjh0.c("onSocketConnected", new Object[0]);
        if(aucd0.V) {
            aucd0.I(false);
            return;
        }
        Context context0 = aucd0.m;
        avjn avjn0 = avjn.d();
        if(avjn0.c == null) {
            cjpc cjpc0 = avjn.e(context0);
            avjn0.j(cjpd.i(cjpc0, "com.google.android.gms.cast.SETTINGS_KEY_CAST_BYPASS_DEVICE_AUTH", false));
            cjpc0.g(avjn0);
        }
        if(avjn0.c.booleanValue()) {
            avjh0.m("authentication bypassed");
            aucd0.I(false);
            return;
        }
        aucd0.s = new audd(this, context0, aucd0.e, aucd0.g, aucd0.n.c, aucd0.c);
        aucd0.P(aucd0.s);
        audd audd0 = aucd0.s;
        audd0.g = audd0.e.r();
        if(audd0.g == null) {
            audd0.n.c("The authentication failed due to null peerCertificateDer", new Object[0]);
            audd0.h(18);
            return;
        }
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gegy.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gegt.a).v_newBuilder();
        synchronized(audd0.c) {
            cjpc cjpc1 = avjn.e(audd0.d);
            if(System.currentTimeMillis() >= cjpd.b(cjpc1, "PREF_CAST_SENDER_NONCE_GENERATED_TIME", 0L) + TimeUnit.DAYS.toMillis(1L)) {
                audd0.b = audd0.j(cjpc1);
            }
            else if(audd0.b == null) {
                String s1 = cjpd.c(cjpc1, "PREF_CAST_SENDER_NONCE", null);
                if(TextUtils.isEmpty(s1)) {
                    audd0.b = audd0.j(cjpc1);
                }
                else {
                    audd0.b = Base64.decode(s1, 0);
                    audd0.n.f("Reuse old nonce: %s", new Object[]{Arrays.toString(audd0.b)});
                }
            }
        }
        ByteString hfsf0 = ByteString.copyFrom(audd0.b);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((gegt)hftv0).b |= 2;
        ((gegt)hftv0).c = hfsf0;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((gegt)hftp1.b_message).d = 1;
        ((gegt)hftp1.b_message).b |= 4;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gegy gegy0 = (gegy)hftp0.b_message;
        gegt gegt0 = (gegt)hftp1.N_build();
        gegt0.getClass();
        gegy0.c = gegt0;
        gegy0.b |= 1;
        byte[] arr_b = ((gegy)hftp0.N_build()).toBytesArray();
        String s2 = audd0.f.a();
        aurs aurs0 = audd0.n;
        aurz aurz0 = audd0.p;
        if(aurz0 == null) {
            aurs0.d("Attempt to send a binary message without a sink", new Object[0]);
            return;
        }
        aurz0.e(audd0.o, arr_b, s2);
    }

    @Override  // auad
    public final void c(int v) {
        this.a.k.d("onSocketConnectionFailed; socketError=%s, controller state:%s", new Object[]{auaf.h(v), auau.a(this.a.F)});
        gket gket0 = atyg.a(v);
        this.a.K(aucd.ae(v), true, gket0);
    }

    @Override  // auad
    public final void d(int v) {
        int v1;
        aucd aucd0 = this.a;
        String s = auaf.h(v);
        aucd0.k.n("onSocketDisconnected; socketError=%s", s);
        if(aucd0.a.r()) {
            v1 = v;
            aucd0.J.h(aucd0.e, aucd0.L, aucd0.af(), v1, aucd0.M, aucd0.N, aucd0.o);
        }
        else {
            v1 = v;
        }
        aucd0.J(v1);
    }

    @Override  // auad
    public final void e(gehl gehl0) {
        try {
            aucd aucd0 = this.a;
            aucd0.A(true);
            audg audg0 = aucd0.t;
            if(audg0 != null) {
                audg0.b();
            }
            aucd0.U.b(gehl0);
        }
        finally {
            this.a.R(true);
        }
    }
}

