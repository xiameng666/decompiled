import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class dvmd {
    public final dvlp a;
    public final Context b;
    private static final bboh c;
    private final dydx d;
    private final dvlr e;

    static {
        dvmd.c = bboh.b("Pay", bbcu.cZ);
    }

    public dvmd(dydx dydx0, dvlp dvlp0, dvlr dvlr0, Context context0) {
        this.d = dydx0;
        this.a = dvlp0;
        this.e = dvlr0;
        this.b = context0;
    }

    public final String a(byte[] arr_b, gjcw gjcw0, String s) {
        ibuq.f(arr_b, "imageRawBytes");
        ibuq.f(gjcw0, "actionType");
        return this.b(this.a.a(arr_b), hwvf.c(), gjcw0, s);
    }

    private final String b(byte[] arr_b, String s, gjcw gjcw0, String s1) {
        Integer integer0;
        Bitmap bitmap0 = BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length);
        Object object0 = this.b.getSystemService("connectivity");
        ibuq.d(object0, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager0 = (ConnectivityManager)object0;
        Network network0 = connectivityManager0.getActiveNetwork();
        if(network0 != null) {
            try {
                NetworkCapabilities networkCapabilities0 = connectivityManager0.getNetworkCapabilities(network0);
                if(networkCapabilities0 == null) {
                    goto label_14;
                }
                else {
                    integer0 = networkCapabilities0.getLinkUpstreamBandwidthKbps();
                }
            }
            catch(SecurityException securityException0) {
                a.ae(dvmd.c.j(), "Fail to retrieve the network capability", securityException0);
                integer0 = null;
            }
            goto label_17;
        }
    label_14:
        integer0 = null;
        try {
        label_17:
            hjjc hjjc0 = new hjjc();
            hjjc0.e("Content-Type", s);
            hjjc0.e("Content-Length", String.valueOf(arr_b.length));
            Account account0 = new Account(this.d.c, "com.google");
            hjjc0.e("Authorization", "Bearer " + dlnx.b(this.d.e, account0, dmgv.b(this.d.d)));
            int v = gjcw0 == gjcw.d ? glwy.a(hwkt.a.g().h()) : this.d.a;
            hjjz hjjz0 = new hjjz();
            hjjz0.a = (long)v;
            hjka hjka0 = new hjka(hjjz0);
            hjjj hjjj0 = new hjjj(new ByteArrayInputStream(arr_b), 0xA00000);
            TimeUnit timeUnit0 = TimeUnit.SECONDS;
            hjjw hjjw0 = (hjjw)this.d.f.a(this.d.b.toString(), "POST", hjjc0, hjjj0, "", hjka0).b().get(((long)this.d.a), timeUnit0);
            gvbm gvbm0 = gvbm.a;
            if(hjjw0.b()) {
                throw new dydz(hjjw0.a);
            }
            if(!hjjw0.a()) {
                throw new dydz("No response found for the upload.");
            }
            hjjd hjjd0 = hjjw0.b;
            int v1 = hjjd0.a;
            if(v1 == 200) {
                gvbm gvbm1 = (gvbm)((Parser)((ProtoLiteMessage)gvbm0).jf(7, null)).k(hjjd0.c);
                this.e.b(bitmap0, gjcw0, gjcy.b, Integer.valueOf(arr_b.length), s1, integer0);
                String s2 = gvbm1.b;
                ibuq.c(s2);
                return s2;
            }
            hjjd0.a();
            throw new dydz("Expecting status code to be 200, but received " + v1);
        }
        catch(ExecutionException executionException0) {
            this.e.b(bitmap0, gjcw0, gjcy.c, Integer.valueOf(arr_b.length), s1, integer0);
            throw executionException0;
        }
        catch(InterruptedException interruptedException0) {
            this.e.b(bitmap0, gjcw0, gjcy.c, Integer.valueOf(arr_b.length), s1, integer0);
            throw interruptedException0;
        }
        catch(TimeoutException timeoutException0) {
            this.e.b(bitmap0, gjcw0, gjcy.d, Integer.valueOf(arr_b.length), s1, integer0);
            throw timeoutException0;
        }
        catch(dydz dydz0) {
            this.e.b(bitmap0, gjcw0, gjcy.c, Integer.valueOf(arr_b.length), s1, integer0);
            throw dydz0;
        }
        catch(IOException iOException0) {
            this.e.b(bitmap0, gjcw0, gjcy.c, Integer.valueOf(arr_b.length), s1, integer0);
            throw iOException0;
        }
    }
}

