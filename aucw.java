import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class aucw {
    public static final avjh a;
    public final Object b;
    private static aucw c;

    static {
        aucw.a = new avjh("CrlManager");
    }

    private aucw() {
        this.b = new Object();
    }

    public static aucw a() {
        synchronized(aucw.class) {
            if(aucw.c == null) {
                aucw.c = new aucw();
            }
        }
        return aucw.c;
    }

    public final gehe b(byte[] arr_b) {
        try {
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)gehe.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            return (gehe)hftv0;
        }
        catch(hfur hfur0) {
            aucw.a.e(hfur0, "Failed to parse CRL bundle from bytes.", new Object[0]);
            return null;
        }
    }

    public final File c(Context context0) {
        File file0 = hrnt.i() ? new File(ccsb.a.a(String.format("%s/%s", context0.getFilesDir(), "cast/controller"))) : new File(String.format("%s/%s", context0.getFilesDir(), "cast/controller"));
        if(!file0.exists()) {
            try {
                file0.mkdirs();
                return hrnt.i() ? new File(ccsb.a.a(String.format("%s/%s", file0.getAbsolutePath(), "crl"))) : new File(String.format("%s/%s", file0.getAbsolutePath(), "crl"));
            }
            catch(SecurityException securityException0) {
                aucw.a.e(securityException0, "Failed to create project directory.", new Object[0]);
                return null;
            }
        }
        return hrnt.i() ? new File(ccsb.a.a(String.format("%s/%s", file0.getAbsolutePath(), "crl"))) : new File(String.format("%s/%s", file0.getAbsolutePath(), "crl"));
    }

    public final void d(Context context0, int v, evqp evqp0) {
        if(v >= 3) {
            aucw.a.m("Max download attempts reached. Failed to download the CRL bundle File.");
            evqp0.b(null);
            return;
        }
        avjh avjh0 = aucw.a;
        avjh0.m("Downloading CRL bundle.");
        try {
            byte[] arr_b = aucw.e(context0);
            File file0 = this.c(context0);
            if(file0 == null) {
                evqp0.b(null);
                return;
            }
            synchronized(this.b) {
                if(!file0.exists()) {
                    file0.createNewFile();
                }
                try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0, false)) {
                    fileOutputStream0.write(arr_b);
                }
            }
            gehe gehe0 = this.b(arr_b);
            if(gehe0 == null) {
                avjh0.d("Failed to parse CRL bundle from bytes. Download failed.", new Object[0]);
                evqp0.b(null);
                return;
            }
            avjh0.m("Successfully downloaded CRL bundle file.");
            evqp0.b(gehe0);
        }
        catch(SecurityException securityException0) {
            aucw.a.e(securityException0, "Failed to download CRL bundle file.", new Object[0]);
            evqp0.b(null);
        }
        catch(ExecutionException | TimeoutException | InterruptedException | IOException exception0) {
            aucw.a.e(exception0, "Failed to download CRL bundle file on attempt #%d. Retrying.", new Object[]{((int)(v + 1))});
            this.d(context0, v + 1, evqp0);
        }
    }

    static final byte[] e(Context context0) {
        clcf clcf0 = clcg.c("https://www.gstatic.com/cast-crl/latest", ckbg.b);
        aucv aucv0 = new aucv();
        clcn clcn0 = clbv.a(context0).e(clcf0, aucv0, clhl.b.b(clhr.a), context0.getApplicationInfo().uid, 0x900).e();
        try {
            clcn0.a();
            return (byte[])evrg.o(aucv0.a.a, 1L, TimeUnit.SECONDS);
        }
        catch(ExecutionException | TimeoutException exception0) {
            clcn0.b();
            throw exception0;
        }
        catch(InterruptedException interruptedException0) {
            Thread.currentThread().interrupt();
            clcn0.b();
            throw interruptedException0;
        }
    }
}

