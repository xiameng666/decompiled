import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public final class bsic {
    protected static final String a(Context context0, String s) {
        bsie bsie0 = htdz.c() ? bsie.a(context0) : null;
        try {
            CertificateFactory certificateFactory0 = CertificateFactory.getInstance("X.509");
            ghjc ghjc0 = ghjc.f;
            htdz htdz0 = htdz.a;
            byte[] arr_b = ghjc0.q(gfqz.d(htdz0.b().b()));
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(certificateFactory0.generateCertificate(new ByteArrayInputStream(arr_b)));
            if(!Build.TYPE.equals("user")) {
                arrayList0.add(certificateFactory0.generateCertificate(new ByteArrayInputStream(ghjc0.q(gfqz.d(htdz0.b().a())))));
            }
            ha[] arr_ha = (ha[])hb.a(context0, s, arrayList0, Executors.newCachedThreadPool()).get();
            for(int v = 0; v < arr_ha.length; ++v) {
                ha ha0 = arr_ha[v];
                if(ha0.a == 8) {
                    if(htdz.c() && bsie0 != null) {
                        if((ha0.c == null ? null : ((X509Certificate)CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(ha0.c)))) == null) {
                            bsie0.b(14001);
                        }
                        else {
                            bsie0.b(14002);
                        }
                    }
                    return ghjc0.f().o(ha0.b);
                }
            }
        }
        catch(CertificateEncodingException certificateEncodingException0) {
            Log.e("AppDigestProvider", "Malformed trusted signing certificate", certificateEncodingException0);
            return null;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            Log.e("AppDigestProvider", "Could not find package via Appdigest API", packageManager$NameNotFoundException0);
            if(htdz.c() && bsie0 != null) {
                bsie0.b(14003);
                return null;
            }
        }
        catch(ExecutionException executionException0) {
            if(htdz.c() && bsie0 != null) {
                bsie0.b(14004);
            }
            Log.e("AppDigestProvider", "Appdigest API execution failed", executionException0);
            return null;
        }
        catch(InterruptedException interruptedException0) {
            if(htdz.c() && bsie0 != null) {
                bsie0.b(14004);
            }
            Log.e("AppDigestProvider", "Appdigest API execution interrupted", interruptedException0);
            return null;
        }
        catch(CertificateException certificateException0) {
            if(htdz.c() && bsie0 != null) {
                bsie0.b(14005);
            }
            Log.e("AppDigestProvider", "Certificate error", certificateException0);
            return null;
        }
        return null;
    }
}

