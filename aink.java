import android.content.Context;
import android.content.pm.Signature;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import com.google.android.gms.auth.blockstore.DeleteBytesRequest;
import com.google.android.gms.auth.blockstore.RetrieveBytesRequest;
import com.google.android.gms.auth.blockstore.StoreBytesData;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.ExecutionException;

public final class aink {
    public static final bboh a;
    public static final byte[] b;
    public static final ggfp c;
    public final String d;
    public final Signature[] e;
    public final aiuc f;
    public final aiqy g;
    public final aiyg h;
    public final Context i;
    public final bbng j;
    public final gmcg k;
    private final aiqb l;
    private final aiwh m;
    private final gmbg n;

    static {
        aink.a = aiqz.b("BlockstoreImpl");
        aink.b = new byte[0];
        aink.c = ggfp.G(new HashSet(Arrays.asList(new String[]{"com.google.android.gms.auth.blockstore.testapp", "com.google.android.gms", "com.google.android.gms.api_test"})));
    }

    public aink(aiqy aiqy0, aiwh aiwh0, aiuc aiuc0, aiyg aiyg0, aiqb aiqb0, String s, Signature[] arr_signature, Context context0) {
        this.n = new ainj(this);
        this.j = bbnk.a;
        new bblp(0x7FFFFFFF, 10);
        this.k = new bblp(0x7FFFFFFF, 9);
        this.g = aiqy0;
        this.f = aiuc0;
        this.h = aiyg0;
        this.l = aiqb0;
        this.d = s;
        this.e = arr_signature;
        this.i = context0;
        this.m = aiwh0;
    }

    public final gmcd a(DeleteBytesRequest deleteBytesRequest0) {
        long v = SystemClock.elapsedRealtime();
        return glzd.g(gmbt.h(this.h.a(this.d, this.e, deleteBytesRequest0)), new aing(this, deleteBytesRequest0, v), gmap.a);
    }

    public final gmcd b() {
        Boolean boolean0 = Boolean.valueOf(false);
        if(!bbod.c(hprv.d())) {
            ((ggtj)aink.a.h()).x("Blockstore feature not enabled. Return false.");
            return gmbu.i(boolean0);
        }
        if(!hpsd.a.b().n()) {
            ((ggtj)aink.a.h()).x("isEndToEndEncryptionAvailable feature flag is not enabled. Return false.");
            return gmbu.i(boolean0);
        }
        long v = SystemClock.elapsedRealtime();
        return glzd.f(gmbt.h(this.m.b()), new aina(this, v), gmap.a);
    }

    public final gmcd c(RetrieveBytesRequest retrieveBytesRequest0) {
        long v = SystemClock.elapsedRealtime();
        return glzd.f(gmbt.h(this.d(retrieveBytesRequest0, v)), new aind(this, v, retrieveBytesRequest0), this.k);
    }

    public final gmcd d(RetrieveBytesRequest retrieveBytesRequest0, long v) {
        hfuo hfuo0 = hprv.e().b;
        String s = this.d;
        if(hfuo0.contains(s)) {
            ((ggtj)aink.a.h()).B("Skip trying to update access for exempt package %s", s);
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvj.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((wvj)hftp0.b_message).g = 7;
            ((wvj)hftp0.b_message).b |= 16;
            return glzd.g(gmbt.h(gmbu.i(((wvj)hftp0.N_build()))), new aimr(this, retrieveBytesRequest0), this.k);
        }
        ajbj ajbj0 = ajbj.a;
        if(hprv.g()) {
            try {
                ajbj0 = (ajbj)((glyq)this.h.d()).u();
            }
            catch(ExecutionException | InterruptedException exception0) {
                a.ae(aink.a.i(), "getAppRestoreNotificationStatus failed.", exception0);
            }
        }
        if(hprv.g() && ajbj0 == ajbj.b) {
            ((ggtj)aink.a.h()).x("Notification API called. Skipping updateAccessPerSnapshotIfEligible.");
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wvj.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ((wvj)hftp1.b_message).g = 5;
            ((wvj)hftp1.b_message).b |= 16;
            return glzd.g(gmbt.h(gmbu.i(((wvj)hftp1.N_build()))), new aimr(this, retrieveBytesRequest0), this.k);
        }
        if(hprv.h()) {
            ((ggtj)aink.a.h()).B("Snapshot enabled. updateAccessPerSnapshotIfEligible for package: %s", this.d);
            return glzd.g(gmbt.h(this.f.f(this.d)), new aimr(this, retrieveBytesRequest0), this.k);
        }
        return glzd.g(gmbt.h(gmbu.i(wvj.a)), new aimr(this, retrieveBytesRequest0), this.k);
    }

    public final gmcd e(StoreBytesData storeBytesData0) {
        long v = SystemClock.elapsedRealtime();
        String s = storeBytesData0.c;
        byte[] arr_b = ajca.c(storeBytesData0);
        int v1 = ajca.b(s);
        if(bbod.c(hprv.d())) {
            boolean z = storeBytesData0.b;
            if(((long)(v1 ? arr_b.length : gluj.c(gfux.a(s), arr_b.length))) > hprv.b()) {
                hprv.b();
                this.g.n(this.d, arr_b.length, 3, z, ((boolean)(v1 ^ 1)), v);
                return gmbu.h(new aiml(40000));
            }
            return glzd.f(glzd.g(gmbt.h(this.h.l(this.d, this.e, storeBytesData0)), new aimu(this, arr_b, z, ((boolean)v1), v), this.k), new aimv(), this.k);
        }
        return gmbu.i(Integer.valueOf(0));
    }

    public final void f(wvp wvp0) {
        if(Settings.Secure.getInt(this.i.getContentResolver(), "user_setup_complete", 0) == 1) {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)wvp0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)wvp0));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((wvp)hftp0.b_message).n = 1;
            ((wvp)hftp0.b_message).b |= 0x1000;
            wvp wvp1 = (wvp)hftp0.N_build();
            this.g.k(wvp1);
            return;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)wvp0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)wvp0));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((wvp)hftp1.b_message).n = 2;
        ((wvp)hftp1.b_message).b |= 0x1000;
        wvp wvp2 = (wvp)hftp1.N_build();
        gmbu.t(glzd.g(gmbt.h(this.l.a(wvp2)), new ainc(this), gmap.a), this.n, gmap.a);
    }

    public static int g(boolean z, int v) {
        if(z) {
            return 5;
        }
        return v == 3 ? 4 : 3;
    }

    public final gmcd h(int v, long v1, int v2, int v3) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)wvr.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        this.d.getClass();
        ((wvr)hftv0).b |= 1;
        ((wvr)hftv0).c = this.d;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((wvr)hftv1).b |= 2;
        ((wvr)hftv1).d = v2;
        if(!hftv1.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp0.b_message;
        ((wvr)hftv2).e = v - 1;
        ((wvr)hftv2).b |= 4;
        if(!hftv2.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvr wvr0 = (wvr)hftp0.b_message;
        wvr0.b |= 16;
        wvr0.g = v3;
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)wvd.a).v_newBuilder();
        long v4 = SystemClock.elapsedRealtime() - v1;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        wvd wvd0 = (wvd)hftp1.b_message;
        wvd0.b |= 1;
        wvd0.c = (int)v4;
        wvd wvd1 = (wvd)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        wvr wvr1 = (wvr)hftp0.b_message;
        wvd1.getClass();
        wvr1.f = wvd1;
        wvr1.b |= 8;
        wvr wvr2 = (wvr)hftp0.N_build();
        return glzd.g(gmbt.h(this.l.b(wvr2)), new ainf(this), gmap.a);
    }
}

