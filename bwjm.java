import android.content.Context;
import android.net.Network;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.webkit.URLUtil;
import java.io.Closeable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class bwjm extends bwjf implements Closeable {
    public int c;
    public int d;
    public SSLSocketFactory e;
    public HostnameVerifier f;
    private Context g;

    public bwjm(Context context0) {
        this(context0, true);
    }

    public bwjm(Context context0, boolean z) {
        this(context0, z, bwje.a);
    }

    public bwjm(Context context0, boolean z, bwje bwje0) {
        super(context0, bwje0);
        this.c = 60000;
        this.d = 60000;
        this.g = context0;
        if(z) {
            this.e = new elgh(context0, 60000, true);
        }
    }

    public final HttpURLConnection b(URL uRL0) {
        return this.c(uRL0, null);
    }

    public final HttpURLConnection c(URL uRL0, Network network0) {
        URLConnection uRLConnection0;
        batl.s(uRL0);
        batl.s(uRL0);
        if(this.b != bwje.c) {
            bwjl bwjl0 = this.a;
            String s = uRL0.toString();
            Bundle bundle0 = null;
            if(bwjl0.c()) {
                try {
                    if(bwjl0.a == null && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        CountDownLatch countDownLatch0 = bwjl0.b;
                        if(!countDownLatch0.await(500L, TimeUnit.MILLISECONDS)) {
                            Log.w("GoogleHttpServiceClient", "Timeout on service connection", new Throwable());
                            countDownLatch0.countDown();
                        }
                    }
                    if(bwjl0.a != null) {
                        bundle0 = bwjl0.a.a(s);
                    }
                }
                catch(RemoteException remoteException0) {
                    Log.w("GoogleHttpServiceClient", "Exception in Google Http Service: ", remoteException0);
                }
                catch(InterruptedException interruptedException0) {
                    Log.w("GoogleHttpServiceClient", a.ab(interruptedException0, "Interrupted waiting for binder: "));
                }
                finally {
                    bwjl0.b();
                }
            }
            else {
                bwjl0.b();
            }
            if(bundle0 != null) {
                if(bundle0.getString("block") != null) {
                    Log.w("GoogleURLConnFactory", "Blocked by " + bundle0.getString("name") + ": " + uRL0);
                    throw new bwjg(bundle0);
                }
                if(this.b == bwje.a) {
                    String s1 = bundle0.getString("rewrite");
                    if(s1 != null && (URLUtil.isHttpUrl(s1) || URLUtil.isHttpsUrl(s1))) {
                        uRL0 = new URL(s1);
                    }
                }
            }
        }
        if(network0 == null) {
            uRLConnection0 = cjwq.b().a(uRL0, "client-http");
        }
        else {
            this.g.getSystemService("connectivity");
            uRLConnection0 = network0.openConnection(uRL0);
        }
        uRLConnection0.setConnectTimeout(this.d);
        uRLConnection0.setReadTimeout(this.c);
        if((uRLConnection0 instanceof HttpsURLConnection)) {
            SSLSocketFactory sSLSocketFactory0 = this.e;
            if(sSLSocketFactory0 != null) {
                ((HttpsURLConnection)uRLConnection0).setSSLSocketFactory(sSLSocketFactory0);
            }
            HostnameVerifier hostnameVerifier0 = this.f;
            if(hostnameVerifier0 != null) {
                ((HttpsURLConnection)uRLConnection0).setHostnameVerifier(hostnameVerifier0);
            }
        }
        return (HttpURLConnection)uRLConnection0;
    }

    @Override
    @Deprecated
    public final void close() {
    }
}

