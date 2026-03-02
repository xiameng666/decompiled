import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import j..util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class ubu implements ubl {
    private final uhb a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public ubu(uhb uhb0, int v) {
        this.a = uhb0;
        this.b = v;
    }

    @Override  // ubl
    public final Class a() {
        return InputStream.class;
    }

    private static int c(HttpURLConnection httpURLConnection0) {
        try {
            return httpURLConnection0.getResponseCode();
        }
        catch(IOException unused_ex) {
            return -1;
        }
    }

    @Override  // ubl
    public final void d() {
        this.e = true;
    }

    @Override  // ubl
    public final void e() {
        InputStream inputStream0 = this.d;
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException unused_ex) {
            }
        }
        HttpURLConnection httpURLConnection0 = this.c;
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        this.c = null;
    }

    private final InputStream f(URL uRL0, int v, URL uRL1, Map map0) {
        URL uRL2;
        HttpURLConnection httpURLConnection1;
        HttpURLConnection httpURLConnection0;
        if(v < 5) {
            if(uRL1 != null) {
                try {
                    if(uRL0.toURI().equals(uRL1.toURI())) {
                        throw new uaj("In re-direct loop", -1);
                    }
                }
                catch(URISyntaxException unused_ex) {
                }
            }
            try {
                httpURLConnection0 = (HttpURLConnection)uRL0.openConnection();
            }
            catch(IOException iOException0) {
                throw new uaj("URL.openConnection threw", 0, iOException0);
            }
            for(Object object0: map0.entrySet()) {
                httpURLConnection0.addRequestProperty(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
            }
            httpURLConnection0.setConnectTimeout(this.b);
            httpURLConnection0.setReadTimeout(this.b);
            httpURLConnection0.setUseCaches(false);
            httpURLConnection0.setDoInput(true);
            httpURLConnection0.setInstanceFollowRedirects(false);
            this.c = httpURLConnection0;
            try {
                httpURLConnection0.connect();
                this.d = this.c.getInputStream();
            }
            catch(IOException iOException1) {
                throw new uaj("Failed to connect or obtain data", ubu.c(this.c), iOException1);
            }
            if(this.e) {
                return null;
            }
            int v1 = ubu.c(this.c);
            if(v1 / 100 == 2) {
                try {
                    httpURLConnection1 = this.c;
                    if(TextUtils.isEmpty(httpURLConnection1.getContentEncoding())) {
                        int v2 = httpURLConnection1.getContentLength();
                        this.d = new uqc(httpURLConnection1.getInputStream(), ((long)v2));
                        return this.d;
                    }
                    this.d = httpURLConnection1.getInputStream();
                    return this.d;
                }
                catch(IOException iOException2) {
                    throw new uaj("Failed to obtain InputStream", ubu.c(httpURLConnection1), iOException2);
                }
            }
            if(v1 / 100 == 3) {
                String s = this.c.getHeaderField("Location");
                if(TextUtils.isEmpty(s)) {
                    throw new uaj("Received empty or null redirect url", v1);
                }
                try {
                    uRL2 = new URL(uRL0, s);
                }
                catch(MalformedURLException malformedURLException0) {
                    throw new uaj("Bad redirect url: " + s, v1, malformedURLException0);
                }
                this.e();
                return this.f(uRL2, v + 1, uRL0, map0);
            }
            if(v1 == -1) {
                throw new uaj("Http request failed", -1);
            }
            try {
                throw new uaj(this.c.getResponseMessage(), v1);
            }
            catch(IOException iOException3) {
                throw new uaj("Failed to get a response message", v1, iOException3);
            }
        }
        throw new uaj("Too many (> 5) redirects!", -1);
    }

    @Override  // ubl
    public final uag fw() {
        return uag.b;
    }

    @Override  // ubl
    public final void g(txn txn0, ubk ubk0) {
        SystemClock.elapsedRealtimeNanos();
        try {
            uhb uhb0 = this.a;
            if(uhb0.f == null) {
                if(TextUtils.isEmpty(uhb0.e)) {
                    String s = uhb0.d;
                    if(TextUtils.isEmpty(s)) {
                        uqo.f(uhb0.c);
                        s = uhb0.c.toString();
                    }
                    uhb0.e = Uri.encode(s, "@#&=*+-_.,:!?()/~\'%;$");
                }
                uhb0.f = new URL(uhb0.e);
            }
            URL uRL0 = uhb0.f;
            uhc uhc0 = uhb0.b;
            if(((uhf)uhc0).c == null) {
                synchronized(uhc0) {
                    if(((uhf)uhc0).c == null) {
                        HashMap hashMap0 = new HashMap();
                        for(Object object0: ((uhf)uhc0).b.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object0;
                            List list0 = (List)map$Entry0.getValue();
                            StringBuilder stringBuilder0 = new StringBuilder();
                            int v = list0.size();
                            for(int v1 = 0; v1 < v; ++v1) {
                                String s1 = ((uhe)list0.get(v1)).a;
                                if(!TextUtils.isEmpty(s1)) {
                                    stringBuilder0.append(s1);
                                    if(v1 != list0.size() - 1) {
                                        stringBuilder0.append(',');
                                    }
                                }
                            }
                            String s2 = stringBuilder0.toString();
                            if(!TextUtils.isEmpty(s2)) {
                                hashMap0.put(((String)map$Entry0.getKey()), s2);
                            }
                        }
                        ((uhf)uhc0).c = DesugarCollections.unmodifiableMap(hashMap0);
                    }
                }
            }
            ubk0.c(this.f(uRL0, 0, null, ((uhf)uhc0).c));
        }
        catch(IOException iOException0) {
            ubk0.f(iOException0);
        }
    }
}

