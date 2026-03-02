import android.content.Context;
import android.net.Uri;
import j..util.Collection.-EL;
import j..util.DesugarCollections;
import j..util.Optional;
import java.util.Set;
import java.util.concurrent.ExecutionException;

public final class atmk implements atmd {
    public static final gmcg a;
    public final baun b;
    public final atmb c;
    public final atmm d;
    public final frli e;
    private static volatile Optional f;

    static {
        atmk.f = Optional.empty();
        atmk.a = new bblp(1, 9);
    }

    public atmk(Context context0, atmm atmm0) {
        this.b = aqql.a("PostD2dAppTransferRecordsDataStore");
        frce frce0 = new frce(context0);
        frce0.d("backup");
        frce0.e("packages_post_d2d_records.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)aqdu.a));
        frie0.h(new frjp(cjtd.a));
        frif frif0 = frie0.a();
        this.e = cjtb.a.a(frif0);
        this.d = atmm0;
        this.c = new atmb(context0);
    }

    @Override  // atmd
    public final long a(String s) {
        aqhy aqhy0 = this.j(s);
        gftb.check(aqhy0);
        return aqhy0.d;
    }

    @Override  // atmd
    public final gged_interceptors b(Set set0) {
        return (gged_interceptors)Collection.-EL.stream(DesugarCollections.unmodifiableMap(this.m().c).entrySet()).filter(new atmh(set0)).map(new atmf()).collect(ggaf.a);
    }

    @Override  // atmd
    public final gged_interceptors c() {
        return (gged_interceptors)Collection.-EL.stream(DesugarCollections.unmodifiableMap(this.m().c).entrySet()).filter(new atme()).map(new atmf()).collect(ggaf.a);
    }

    @Override  // atmd
    public final void d(String s, long v) {
        this.l(s, Boolean.valueOf(true), Long.valueOf(v), null, null);
        if(this.f(s)) {
            this.d.d(s, v);
        }
    }

    @Override  // atmd
    public final void e(String s, boolean z) {
        this.l(s, Boolean.valueOf(true), null, Boolean.valueOf(z), null);
        if(z) {
            this.d.e(s, true);
        }
    }

    @Override  // atmd
    public final boolean f(String s) {
        aqhy aqhy0 = this.j(s);
        gftb.check(aqhy0);
        return aqhy0.e;
    }

    @Override  // atmd
    public final boolean g(String s) {
        return this.j(s) != null;
    }

    @Override  // atmd
    public final int h(String s) {
        aqhy aqhy0 = this.j(s);
        gftb.check(aqhy0);
        if(aqhy0.c) {
            int v = Long.compare(aqhy0.d, 0L);
            if(v != 0) {
                return v <= 0 ? 5 : 2;
            }
            return 1;
        }
        return 5;
    }

    @Override  // atmd
    public final void i(String s, int v) {
        if(v != 3 && v != 5) {
            v = 4;
        }
        this.l(s, Boolean.valueOf(false), null, null, null);
        if(this.f(s)) {
            this.d.i(s, v);
        }
    }

    public final aqhy j(String s) {
        aqdu aqdu0 = this.m();
        s.getClass();
        aqhy aqhy0 = (aqhy)aqdu0.c.get(s);
        return aqhy0 == null ? null : aqhy0;
    }

    public static atmk k(Context context0, atmm atmm0) {
        return (atmk)atmk.f.orElseGet(new atmg(context0, atmm0));
    }

    public final void l(String s, Boolean boolean0, Long long0, Boolean boolean1, Long long1) {
        try {
            ((glyq)this.e.b(new atmi(this, s, boolean0, long0, boolean1, long1), atmk.a)).u();
            this.b.j("Successfully updated app record for %s", new Object[]{s});
            atmb atmb0 = this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gifi.a).v_newBuilder();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            s.getClass();
            ((gifi)hftv0).b |= 1;
            ((gifi)hftv0).c = s;
            gifh gifh0 = gifh.f;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gifi)hftp0.b_message).d = gifh0.s;
            ((gifi)hftp0.b_message).b |= 2;
            gifi gifi0 = (gifi)hftp0.N_build();
            aqqk aqqk0 = atmb0.a;
            ProtoLiteBuilder hftp1 = aqra.b();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp1.b_message;
            gifi0.getClass();
            ghys0.ax = gifi0;
            ghys0.d |= 0x8000000;
            aqqk0.a(((ghys)hftp1.N_build()), ghyr.aM);
        }
        catch(ExecutionException | InterruptedException exception0) {
            this.b.f("Failed to update app record for %s: %s", new Object[]{s, exception0.getMessage()});
            atmb atmb1 = this.c;
            String s1 = exception0.getMessage();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gifi.a).v_newBuilder();
            gifh gifh1 = gifh.g;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv1 = hftp2.b_message;
            ((gifi)hftv1).d = gifh1.s;
            ((gifi)hftv1).b |= 2;
            if(!hftv1.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv2 = hftp2.b_message;
            s.getClass();
            ((gifi)hftv2).b |= 1;
            ((gifi)hftv2).c = s;
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            gifi gifi1 = (gifi)hftp2.b_message;
            gifi1.b |= 4;
            gifi1.e = "failed to update app record: " + s1;
            gifi gifi2 = (gifi)hftp2.N_build();
            aqqk aqqk1 = atmb1.a;
            ProtoLiteBuilder hftp3 = aqra.b();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ghys ghys1 = (ghys)hftp3.b_message;
            gifi2.getClass();
            ghys1.ax = gifi2;
            ghys1.d |= 0x8000000;
            aqqk1.a(((ghys)hftp3.N_build()), ghyr.aM);
        }
    }

    private final aqdu m() {
        try {
            aqdu aqdu0 = (aqdu)this.e.a().get();
            atmb atmb0 = this.c;
            ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gifi.a).v_newBuilder();
            gifh gifh0 = gifh.d;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gifi)hftp0.b_message).d = gifh0.s;
            ((gifi)hftp0.b_message).b |= 2;
            gifi gifi0 = (gifi)hftp0.N_build();
            aqqk aqqk0 = atmb0.a;
            ProtoLiteBuilder hftp1 = aqra.b();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            ghys ghys0 = (ghys)hftp1.b_message;
            gifi0.getClass();
            ghys0.ax = gifi0;
            ghys0.d |= 0x8000000;
            aqqk0.a(((ghys)hftp1.N_build()), ghyr.aM);
            return aqdu0;
        }
        catch(ExecutionException | InterruptedException exception0) {
            atmb atmb1 = this.c;
            String s = exception0.getMessage();
            ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gifi.a).v_newBuilder();
            gifh gifh1 = gifh.e;
            if(!hftp2.b_message.isImmutable()) {
                hftp2.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp2.b_message;
            ((gifi)hftv0).d = gifh1.s;
            ((gifi)hftv0).b |= 2;
            if(!hftv0.isImmutable()) {
                hftp2.ensureMutable();
            }
            gifi gifi1 = (gifi)hftp2.b_message;
            gifi1.b |= 4;
            gifi1.e = "failed to get app record: " + s;
            gifi gifi2 = (gifi)hftp2.N_build();
            aqqk aqqk1 = atmb1.a;
            ProtoLiteBuilder hftp3 = aqra.b();
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ghys ghys1 = (ghys)hftp3.b_message;
            gifi2.getClass();
            ghys1.ax = gifi2;
            ghys1.d |= 0x8000000;
            aqqk1.a(((ghys)hftp3.N_build()), ghyr.aM);
            return aqdu.a;
        }
    }
}

