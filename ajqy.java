import android.content.Context;
import j..io.FileRetargetClass;
import j..nio.file.Files;
import j..nio.file.OpenOption;
import java.io.File;
import java.io.IOException;
import jeb.synthetic.FIN;

public final class ajqy {
    public static final ajqy a;
    private static final baun b;

    static {
        ajqy.b = akea.a("SignedCertificatesCache");
        ajqy.a = new ajqy();
    }

    public final gfsx a(Context context0) {
        aktq aktq0;
        byte[] arr_b;
        File file0;
        synchronized(this) {
            if(hput.a.c().E()) {
                ajqy.b.m("Not getting cached certificates list, as cache is disabled.", new Object[0]);
                return gfqx.a;
            }
            try {
                file0 = ajqy.d(context0);
            }
            catch(IOException iOException0) {
                ajqy.b.g("IO error opening cached certs", iOException0, new Object[0]);
                return gfqx.a;
            }
            if(!file0.exists()) {
                ajqy.b.d("Certs cache file did not exist", new Object[0]);
                return gfqx.a;
            }
            try {
                arr_b = Files.readAllBytes(FileRetargetClass.toPath(file0));
            }
            catch(IOException iOException1) {
                ajqy.b.g("IO error reading cached certs", iOException1, new Object[0]);
                return gfqx.a;
            }
            try {
                hftc hftc0 = hftc.a();
                ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)aktq.a), arr_b, 0, arr_b.length, hftc0);
                ProtoLiteMessage.P_makeImmutable(hftv0);
                aktq0 = (aktq)hftv0;
            }
            catch(hfur hfur0) {
                ajqy.b.g("Could not decode signed certs proto", hfur0, new Object[0]);
                return gfqx.a;
            }
            if(!aktq0.c.isEmpty()) {
                if(!aktq0.d.isEmpty()) {
                    try {
                        if(hput.a.c().e() > gqpa.a(aktq0.c.toByteArray()).a) {
                            ajqy.b.h("Invalidate cert cache because it\'s version is too old. ", new Object[0]);
                            this.c(context0);
                            return gfqx.a;
                        }
                    }
                    catch(gqox gqox0) {
                        ajqy.b.g("Failed to parse the certificates when checking serial.", gqox0, new Object[0]);
                    }
                    long v1 = System.currentTimeMillis();
                    long v2 = aktq0.e;
                    if(v1 >= v2) {
                        ajqy.b.h("Invalidating expired cached value (current time %d, cache expired %d)", new Object[]{v1, ((long)aktq0.e)});
                        this.c(context0);
                        return gfqx.a;
                    }
                    if(v2 - v1 > hput.a.c().d()) {
                        ajqy.b.m("Device clock skewed. Invalidating cache. (current time %d, cache expired %d)", new Object[]{v1, ((long)aktq0.e)});
                        this.c(context0);
                        return gfqx.a;
                    }
                    return gfsx.m(aktq0);
                }
                ajqy.b.f("Cached certificates signature was empty", new Object[0]);
                return gfqx.a;
            }
            ajqy.b.f("Cached certificates list was empty", new Object[0]);
        }
        return gfqx.a;
    }

    public final void b(Context context0, aktq aktq0) {
        File file0;
        boolean z = true;
        __monitor_enter(this);
        int v = FIN.finallyOpen$NT();
        gftb.r((aktq0.b & 2) != 0, "Null certificates");
        gftb.b(aktq0.c.size() > 0, "Empty certificates byte array");
        gftb.r((aktq0.b & 4) != 0, "Null signature");
        if(aktq0.d.size() <= 0) {
            z = false;
        }
        gftb.b(z, "Empty signature byte array");
        try {
            file0 = ajqy.d(context0);
        }
        catch(IOException iOException0) {
            ajqy.b.g("Failed to open certs cache file for writing", iOException0, new Object[0]);
            FIN.finallyExec$NT(v);
            return;
        }
        try {
            aktq0.writeToStream(Files.newOutputStream(FileRetargetClass.toPath(file0), new OpenOption[0]));
            FIN.finallyExec$NT(v);
        }
        catch(IOException iOException1) {
            ajqy.b.g("Failed to write certs to file", iOException1, new Object[0]);
            FIN.finallyCodeBegin$NT(v);
        }
    }

    public final void c(Context context0) {
        synchronized(this) {
            try {
                ajqy.d(context0).delete();
            }
            catch(IOException iOException0) {
                ajqy.b.g("IO error while invalidating cache", iOException0, new Object[0]);
            }
        }
    }

    private static final File d(Context context0) {
        File file0 = hrnt.i() ? new File(ccsb.a.b(context0.getFilesDir(), "auth_folsom")) : new File(context0.getFilesDir(), "auth_folsom");
        file0.mkdir();
        return hrnt.i() ? new File(ccsb.a.b(file0, "signed_certificates")) : new File(file0, "signed_certificates");
    }
}

