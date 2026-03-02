import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri.Builder;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

public class crjn extends crqc {
    public crjn(crqq crqq0) {
        super(crqq0);
    }

    @Override  // crqc
    protected final void aM() {
    }

    public void b(crca crca0, Map map0, crjk crjk0) {
        crjn crjn0;
        String s2;
        crkq crkq0;
        URL uRL0;
        this.n();
        this.aA();
        Uri.Builder uri$Builder0 = new Uri.Builder();
        String s = crca0.y();
        uri$Builder0.scheme(((String)crif.f.a())).encodedAuthority(((String)crif.g.a())).path("config/app/" + s).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(this.ay().am().i())).appendQueryParameter("runtime_version", "0");
        String s1 = uri$Builder0.build().toString();
        try {
            uRL0 = new URI(s1).toURL();
            crkq0 = this.aK();
            s2 = crca0.t();
            crjn0 = this;
        }
        catch(IllegalArgumentException | MalformedURLException | URISyntaxException unused_ex) {
            crjn0 = this;
            goto label_15;
        }
        try {
            crkq0.d(new crjm(crjn0, s2, uRL0, null, map0, crjk0));
            return;
        }
        catch(IllegalArgumentException | MalformedURLException | URISyntaxException unused_ex) {
        }
    label_15:
        crjn0.aJ().c.c("Failed to parse config URL. Not fetching. appId", crji.a(crca0.t()), s1);
    }

    protected void c(String s) {
    }

    protected void d() {
    }

    public void e(String s, crqd crqd0, crss crss0, crjk crjk0) {
        String s1;
        crjn crjn0;
        crkq crkq0;
        byte[] arr_b;
        URL uRL0;
        this.n();
        this.aA();
        try {
            uRL0 = new URI(crqd0.a).toURL();
            this.aw();
            arr_b = crss0.toBytesArray();
            crkq0 = this.aK();
            crjn0 = this;
            s1 = s;
        }
        catch(IllegalArgumentException | MalformedURLException | URISyntaxException unused_ex) {
            crjn0 = this;
            s1 = s;
            goto label_14;
        }
        try {
            crkq0.d(new crjm(crjn0, s1, uRL0, arr_b, crqd0.a(), crjk0));
            return;
        }
        catch(IllegalArgumentException | MalformedURLException | URISyntaxException unused_ex) {
        }
    label_14:
        crjn0.aJ().c.c("Failed to parse URL. Not uploading MeasurementBatch. appId", crji.a(s1), crqd0.a);
    }

    public final boolean f() {
        this.aA();
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.aj().getSystemService("connectivity");
        NetworkInfo networkInfo0 = null;
        if(connectivityManager0 != null) {
            try {
                networkInfo0 = connectivityManager0.getActiveNetworkInfo();
            }
            catch(SecurityException unused_ex) {
            }
        }
        return networkInfo0 == null ? false : networkInfo0.isConnected();
    }
}

