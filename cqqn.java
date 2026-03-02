import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class cqqn {
    public static final int a;
    private static final bboh b;

    static {
        cqqn.b = bboh.b("FmdGmsCoreLogger", bbcu.dX);
    }

    public static void b(gmcd gmcd0, String s) {
        gmcd0.hB(() -> try {
            gmbu.r(gmcd0);
        }
        catch(ExecutionException executionException0) {
            a.ae(cqqn.b.i(), s, executionException0.getCause());
        }
        catch(CancellationException unused_ex) {
        }, gmap.a);
    }

    public static void c(gmcd gmcd0) {
        cqqn.b(glzd.f(gmcd0, new cqql(), gmap.a), "Failed to logQuickRemoteLockEvent");
    }

    public static void d(hgzq hgzq0) {
        cexe.v().j(((ProtoLiteMessage)hgzq0));
    }

    public static void e(ProtoLiteBuilder hftp0) {
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hgzn.a).v_newBuilder();
        hgzk hgzk0 = hgzk.e;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hgzn)hftv0).c = hgzk0.i;
        ((hgzn)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hgzn.b(((hgzn)hftp1.b_message));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hgzq hgzq0 = (hgzq)hftp0.b_message;
        hgzn hgzn0 = (hgzn)hftp1.N_build();
        hgzn0.getClass();
        hgzq0.f = hgzn0;
        hgzq0.b |= 16;
        hgzq hgzq1 = (hgzq)hftp0.N_build();
        cexa.v().j(((ProtoLiteMessage)hgzq1));
    }
}

