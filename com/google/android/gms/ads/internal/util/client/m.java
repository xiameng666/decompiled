package com.google.android.gms.ads.internal.util.client;

import a;
import android.content.Context;
import android.net.TrafficStats;
import bbna;
import cjwq;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.report.d;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public final class m implements e {
    private final Context a;
    private final String b;

    public m(Context context0) {
        this(context0, null);
    }

    public m(Context context0, String s) {
        this.a = context0;
        this.b = s;
    }

    @Override  // com.google.android.gms.ads.internal.util.client.e
    public final void a(String s) {
        try {
            if(bbna.d()) {
                TrafficStats.setThreadStatsTag(0x107);
            }
            h.d(("Pinging URL: " + s));
            URL uRL0 = this.b(s);
            HttpURLConnection httpURLConnection0 = (HttpURLConnection)cjwq.b().a(uRL0, "client-admob");
            try {
                String s1 = this.b;
                httpURLConnection0.setConnectTimeout(60000);
                httpURLConnection0.setInstanceFollowRedirects(true);
                httpURLConnection0.setReadTimeout(60000);
                if(s1 != null) {
                    httpURLConnection0.setRequestProperty("User-Agent", s1);
                }
                httpURLConnection0.setUseCaches(false);
                new g();
                int v2 = httpURLConnection0.getResponseCode();
                if(v2 < 200 || v2 >= 300) {
                    h.k(a.s(s, v2, "Received non-success response code ", " from pinging URL: "));
                }
                else if(((Boolean)s.bh.g()).booleanValue()) {
                    httpURLConnection0.getHeaderField("X-Afma-Ad-Event-Value");
                }
            }
            finally {
                httpURLConnection0.disconnect();
            }
        }
        catch(IndexOutOfBoundsException | MalformedURLException exception1) {
            this.d(s, exception1);
        }
        catch(IOException | RuntimeException exception0) {
            h.k(("Error while pinging URL: " + s + ". " + exception0.getMessage()));
        }
        finally {
            if(bbna.d()) {
                TrafficStats.clearThreadStatsTag();
            }
        }
    }

    private final URL b(String s) {
        URL uRL0 = null;
        try {
            uRL0 = new URI(s).toURL();
        }
        catch(URISyntaxException uRISyntaxException0) {
            this.d(s, uRISyntaxException0);
            if(((Boolean)s.g.g()).booleanValue()) {
                uRL0 = this.c(s);
            }
        }
        catch(MalformedURLException | IllegalArgumentException exception0) {
            this.d(s, exception0);
        }
        if(uRL0 == null) {
            h.d(a.a(s, "Falling back to direct new URL(\"", "\") constructor."));
            return new URL(s);
        }
        return uRL0;
    }

    private final URL c(String s) {
        URL uRL1;
        URI uRI0;
        try {
            h.d("Attempting to parse components, encode, and reconstruct URI.");
            URL uRL0 = new URL(s);
            uRI0 = new URI(uRL0.getProtocol(), uRL0.getUserInfo(), uRL0.getHost(), uRL0.getPort(), uRL0.getPath(), uRL0.getQuery(), uRL0.getRef());
            uRL1 = uRI0.toURL();
        }
        catch(MalformedURLException | URISyntaxException | IllegalArgumentException exception0) {
            this.d(s, exception0);
            return null;
        }
        try {
            h.d(a.q(s, uRI0, "Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"", "\" -> encoded URI: "));
            return uRL1;
        }
        catch(MalformedURLException | URISyntaxException | IllegalArgumentException exception0) {
        }
        this.d(s, exception0);
        return uRL1;
    }

    private final void d(String s, Throwable throwable0) {
        h.k(("Error while parsing ping URL: " + s + ". " + throwable0.getMessage()));
        d.a(this.a).f(throwable0, "HttpUrlPinger.pingUrl", ((float)(((int)(((Integer)s.ca.g()))))) / 100.0f);
    }
}

