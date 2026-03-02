import android.accounts.Account;
import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class aqrn {
    public static final gfsi a;
    private static final ggfp b;
    private static final ggfp c;

    static {
        aqrn.a = new aqrh();
        aqrn.b = ggfp.L(gqtz.L, gqtz.S, gqtz.U);
        aqrn.c = ggfp.O(gqtz.WC, gqtz.WD, gqtz.WF, gqtz.WG, gqtz.WH, gqtz.WE, new gqtz[0]);
    }

    public static evql a(acqj acqj0, grkf grkf0, String s, String s1, grkh grkh0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkr.a).v_newBuilder();
        grkn grkn0 = aqrn.f();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkr grkr0 = (grkr)hftp0.b_message;
        grkn0.getClass();
        grkr0.d = grkn0;
        grkr0.b |= 4;
        if(s1 != null) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)grko.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            grko grko0 = (grko)hftp1.b_message;
            grko0.b = 1;
            grko0.c = s1;
            grko grko1 = (grko)hftp1.N_build();
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            grkr grkr1 = (grkr)hftp0.b_message;
            grko1.getClass();
            grkr1.c = grko1;
            grkr1.b |= 1;
        }
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg0 = (grkg)grkf0.b_message;
        grkr grkr2 = (grkr)hftp0.N_build();
        grkr2.getClass();
        grkg0.e = grkr2;
        grkg0.b |= 2;
        grns grns0 = ((grkg)grkf0.b_message).g;
        if(grns0 == null) {
            grns0 = grns.a;
        }
        gqtz gqtz0 = gqtz.b(grns0.c) == null ? gqtz.a : gqtz.b(grns0.c);
        if(aqrn.b.contains(gqtz0) || aqrn.c.contains(gqtz0)) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((grkr)hftp0.b_message).d = null;
            ((grkr)hftp0.b_message).b &= -5;
        }
        if(!grkf0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)grkf0).ensureMutable();
        }
        grkg grkg1 = (grkg)grkf0.b_message;
        grkr grkr3 = (grkr)hftp0.N_build();
        grkr3.getClass();
        grkg1.d = grkr3;
        grkg1.b |= 1;
        return aqrn.e(acqj0, grkf0, s, grkh0);
    }

    public static evql b(Context context0, Executor executor0, String s) {
        if(s == null) {
            return evrg.d(null);
        }
        evqp evqp0 = new evqp();
        if(hqil.a.j().au()) {
            executor0.execute(() -> try {
                evqp0.b(acso.e(context0, s));
            }
            catch(acse | IOException unused_ex) {
                evqp0.b(null);
            });
            return evqp0.a;
        }
        new aqrm(context0, s, evqp0).start();
        return evqp0.a;
    }

    @Deprecated
    public static evql c(Context context0, grkf grkf0, Account account0) {
        return aqrn.d(context0, grkf0, account0, null);
    }

    public static evql d(Context context0, grkf grkf0, Account account0, grkh grkh0) {
        if(account0 != null) {
            String s = account0.name;
            return aqrn.b(context0, new bblp(1, 9), s).e(new aqri(context0, grkf0, s, grkh0));
        }
        return aqrn.b(context0, new bblp(1, 9), null).e(new aqri(context0, grkf0, null, grkh0));
    }

    public static evql e(acqj acqj0, grkf grkf0, String s, grkh grkh0) {
        acqo acqo0 = new acqo();
        acqo0.b = 15;
        acqo0.a = 2;
        acqo0.b(((grkg)((ProtoLiteBuilder)grkf0).N_build()).toBytesArray());
        if(s != null) {
            acqo0.c = s;
        }
        if(grkh0 != null) {
            acqo0.d = grkh0.toBytesArray();
        }
        return acqj0.b(acqo0.a());
    }

    public static grkn f() {
        String s = Long.toHexString(((Long)bbmq.c.i()).longValue());
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)grkn.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        grkn grkn0 = (grkn)hftp0.b_message;
        s.getClass();
        grkn0.b |= 1;
        grkn0.c = s;
        return (grkn)hftp0.N_build();
    }

    // Detected as a lambda impl.
    public static void g(Context context0, String s, evqp evqp0) {
        try {
            evqp0.b(acso.e(context0, s));
        }
        catch(acse | IOException unused_ex) {
            evqp0.b(null);
        }
    }
}

