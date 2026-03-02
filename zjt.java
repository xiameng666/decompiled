import android.accounts.Account;
import android.os.SystemClock;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.concurrent.ExecutorService;

public final class zjt implements zjp {
    public static final baun a;
    public static final grxw b;
    public final aatb c;
    public final zkl d;
    public final ibnf e;
    public final aauo f;
    private final ExecutorService g;
    private final aavk h;
    private final aauf i;

    static {
        zjt.a = new baun("AccountSettings", new String[]{"RemoteResourceProducer"});
        grxu grxu0 = (grxu)((ProtoLiteMessage)grxw.a).v_newBuilder();
        if(!grxu0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grxu0).ensureMutable();
        }
        grxw grxw0 = (grxw)grxu0.b_message;
        grxw0.b |= 1;
        grxw0.c = 10002;
        zjt.b = (grxw)((ProtoLiteBuilder)grxu0).N_build();
    }

    public zjt(aatb aatb0, aavk aavk0, aauo aauo0, ExecutorService executorService0, zkl zkl0, ibnf ibnf0, aauf aauf0) {
        this.c = aatb0;
        this.h = aavk0;
        this.f = aauo0;
        this.g = executorService0;
        this.d = zkl0;
        this.e = ibnf0;
        this.i = aauf0;
    }

    public final zkx a(grxr grxr0, long v, String s, boolean z, fhrt fhrt0, int v1) {
        zho zho0 = new zho(grxr0, v);
        return new zkx(this.c.b, s, (zho0.a.e == null ? grxw.a : zho0.a.e), z, fhrt0.a, v1, zho0);
    }

    public final baqr b() {
        Account account0 = new Account(this.c.b, "com.google");
        baqr baqr0 = new baqr();
        baqr0.d = "com.google.android.gms";
        baqr0.e = "com.google.android.gms";
        baqr0.a = bbmq.b;
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.l(hojn.j());
        return baqr0;
    }

    public final grxq c(fhrt fhrt0) {
        return this.h.b(fhrt0.a);
    }

    public final void d(Runnable runnable0) {
        zjq zjq0 = new zjq(runnable0);
        evrg.a(this.g, zjq0);
    }

    public final void e(String s, String s1, grxw grxw0, long v, Exception exception0) {
        String s3;
        String s2 = "OTHER";
        if((exception0 instanceof iapl)) {
            s3 = "GRPC_STATUS:" + ((iapl)exception0).a.t.r;
        }
        else if((exception0 instanceof acse)) {
            if((((acse)exception0) instanceof UserRecoverableAuthException)) {
                s2 = "URA";
            }
            else if((((acse)exception0) instanceof acsy)) {
                s2 = "URN";
            }
            s3 = "AUTH:" + s2;
        }
        else {
            s3 = (exception0 instanceof SecurityException) ? "SEC" : "OTHER";
        }
        aauf aauf0 = this.i;
        int v1 = grxw0.c;
        long v2 = SystemClock.elapsedRealtime() - v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        gqsp gqsp0 = gqsp.fI;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).c = gqsp0.fJ;
        ((gqxs)hftr0.b_message).b |= 1;
        gqsm gqsm0 = gqsm.dh;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).e = gqsm0.UH;
        ((gqxs)hftr0.b_message).b |= 4;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqxs0.b |= 16;
        gqxs0.g = v1;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs.b(((gqxs)hftr0.b_message));
        gqwf gqwf0 = aauf.h(s, v2, s3);
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs1 = (gqxs)hftr0.b_message;
        gqwf0.getClass();
        gqxs1.h = gqwf0;
        gqxs1.b |= 0x40;
        gqvx gqvx0 = aauf0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs2 = (gqxs)hftr0.b_message;
        gqvx0.getClass();
        gqxs2.i = gqvx0;
        gqxs2.b |= 0x80;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs gqxs3 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        gqxs3.getClass();
        gqxt0.c = gqxs3;
        gqxt0.b |= 1;
        aauf0.e(v1, ((gqxt)hftp0.N_build()));
        if((exception0 instanceof iapl)) {
            zjt.a.f("%s RPC failed - %s", new Object[]{s1, s3});
            return;
        }
        zjt.a.g("%s RPC failed - %s", exception0, new Object[]{s1, s3});
    }

    public final void f(String s, String s1, grxw grxw0, long v) {
        int v1 = grxw0.c;
        long v2 = SystemClock.elapsedRealtime() - v;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gqxt.a).v_newBuilder();
        hftr hftr0 = (hftr)((ProtoLiteMessage)gqxs.a).v_newBuilder();
        gqsp gqsp0 = gqsp.fI;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).c = gqsp0.fJ;
        ((gqxs)hftr0.b_message).b |= 1;
        gqsm gqsm0 = gqsm.dg;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        ((gqxs)hftr0.b_message).e = gqsm0.UH;
        ((gqxs)hftr0.b_message).b |= 4;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs0 = (gqxs)hftr0.b_message;
        gqxs0.b |= 16;
        gqxs0.g = v1;
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs.b(((gqxs)hftr0.b_message));
        gqwf gqwf0 = aauf.h(s, v2, null);
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        aauf aauf0 = this.i;
        gqxs gqxs1 = (gqxs)hftr0.b_message;
        gqwf0.getClass();
        gqxs1.h = gqwf0;
        gqxs1.b |= 0x40;
        gqvx gqvx0 = aauf0.a();
        if(!hftr0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr0).ensureMutable();
        }
        gqxs gqxs2 = (gqxs)hftr0.b_message;
        gqvx0.getClass();
        gqxs2.i = gqvx0;
        gqxs2.b |= 0x80;
        gqxs gqxs3 = (gqxs)((ProtoLiteBuilder)hftr0).N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gqxt gqxt0 = (gqxt)hftp0.b_message;
        gqxs3.getClass();
        gqxt0.c = gqxs3;
        gqxt0.b |= 1;
        aauf0.e(v1, ((gqxt)hftp0.N_build()));
        zjt.a.j("%s RPC succeeded", new Object[]{s1});
    }
}

