import android.content.Context;
import java.io.File;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fvvp {
    public final fvvq a;
    public final long b;
    public bboh c;
    private static fvvp d;
    private final gmcg e;

    private fvvp(fvvq fvvq0, gmcg gmcg0) {
        this.c = bboh.c("Ealert", bbcu.g, "EARStorage");
        this.a = fvvq0;
        this.e = gmcg0;
        this.b = huqg.b();
    }

    public static fvvp a(Context context0) {
        bblp bblp0;
        synchronized(fvvp.class) {
            if(fvvp.d == null) {
                SecureRandom secureRandom0 = new SecureRandom();
                long v1 = bbmq.d(context0);
                if(huqg.a.d().c()) {
                    if(huqg.e() || v1 == 0L) {
                        v1 = 0x1B207L;
                    }
                    bblp0 = new bblp(1, 9);
                    fvvp.d = new fvvp(new fvvq(secureRandom0, Long.toString(v1)), bblp0);
                }
                else {
                    if(huqg.e()) {
                        v1 = 0x1B207L;
                    }
                    if(v1 == 0L) {
                        throw new fvvr();
                    }
                    bblp0 = new bblp(1, 9);
                    fvvp.d = new fvvp(new fvvq(secureRandom0, Long.toString(v1)), bblp0);
                    return fvvp.d;
                }
            }
        }
        return fvvp.d;
    }

    public static fvvp b(Context context0, bboh bboh0) {
        fvvp fvvp0 = fvvp.a(context0);
        fvvp0.c = bboh0;
        return fvvp0;
    }

    public final gmcd c(Context context0) {
        fvvk fvvk0 = new fvvk(this, context0);
        return glzd.f(this.e.e(fvvk0), new fvvl(this, context0), this.e);
    }

    public final gxel d(Context context0) {
        gmcd gmcd0 = this.c(context0);
        try {
            return (gxel)((glyq)gmcd0).v(3L, TimeUnit.SECONDS);
        }
        catch(TimeoutException | CancellationException | InterruptedException | ExecutionException exception0) {
            throw new fvvr(exception0);
        }
    }

    public static File e(Context context0, String s) {
        File file0 = context0.getFilesDir();
        if(file0 != null) {
            return hrnt.i() ? new File(ccsb.a.b(file0, s)) : new File(file0, s);
        }
        throw new fvvr();
    }

    public final void f(Context context0) {
        fvvp.h(this.c(context0), this.e, this.c);
    }

    public final void g(Context context0) {
        fvvm fvvm0 = () -> {
            Class class0 = fvvp.class;
            __monitor_enter(class0);
            try {
                File file0 = fvvp.e(context0, "EARStorage");
                if(file0.exists() && !file0.delete()) {
                    throw new fvvr();
                }
                File file1 = fvvp.e(context0, "EARStorage.tmp");
                if(file1.exists() && !file1.delete()) {
                    throw new fvvr();
                }
            }
            catch(SecurityException | fvvr unused_ex) {
                __monitor_exit(class0);
                return;
            }
            catch(Throwable throwable0) {
                __monitor_exit(class0);
                throw throwable0;
            }
            __monitor_exit(class0);
        };
        fvvp.h(this.e.d(fvvm0), this.e, this.c);
    }

    public static void h(gmcd gmcd0, Executor executor0, bboh bboh0) {
        gmbu.t(gmcd0, new fvvo(bboh0), executor0);
    }

    public final void i(Context context0, List list0, String s) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gxel.a).v_newBuilder();
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        ((gxel)hftv0).b |= 1;
        ((gxel)hftv0).c = v;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxel gxel0 = (gxel)hftp0.b_message;
        hfuo hfuo0 = gxel0.d;
        if(!hfuo0.c()) {
            gxel0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gxel0.d);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gxel gxel1 = (gxel)hftp0.b_message;
        s.getClass();
        gxel1.b |= 2;
        gxel1.e = s;
        fvvn fvvn0 = new fvvn(this, ((gxel)hftp0.N_build()), context0);
        fvvp.h(this.e.d(fvvn0), this.e, this.c);
    }

    // Detected as a lambda impl.
    public static void j(Context context0) {
        Class class0 = fvvp.class;
        __monitor_enter(class0);
        try {
            File file0 = fvvp.e(context0, "EARStorage");
            if(file0.exists() && !file0.delete()) {
                throw new fvvr();
            }
            File file1 = fvvp.e(context0, "EARStorage.tmp");
            if(file1.exists() && !file1.delete()) {
                throw new fvvr();
            }
        }
        catch(SecurityException | fvvr unused_ex) {
            __monitor_exit(class0);
            return;
        }
        catch(Throwable throwable0) {
            __monitor_exit(class0);
            throw throwable0;
        }
        __monitor_exit(class0);
    }
}

