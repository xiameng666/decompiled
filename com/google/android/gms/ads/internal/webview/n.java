package com.google.android.gms.ads.internal.webview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import batl;
import cjwq;
import clht;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.cache.CacheEntryParcel;
import com.google.android.gms.ads.internal.cache.CacheOffering;
import com.google.android.gms.ads.internal.cache.j;
import com.google.android.gms.ads.internal.cache.o;
import com.google.android.gms.ads.internal.cache.p;
import com.google.android.gms.ads.internal.cache.r;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.js.f;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.scionintegration.d;
import com.google.android.gms.ads.internal.util.client.g;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.k;
import com.google.android.gms.ads.internal.util.m;
import com.google.android.gms.ads.nonagon.ad.event.e;
import com.google.android.gms.dynamic.ObjectWrapper;
import gfud;
import ghji;
import gmbu;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wbs;

public class n extends WebViewClient implements a, e {
    protected final i a;
    public final HashMap b;
    public final Object c;
    public boolean d;
    public f e;
    public static final int f;
    private final HashSet g;

    public n(i i0) {
        this.b = new HashMap();
        this.c = new Object();
        this.a = i0;
        this.d = false;
        this.g = new HashSet(Arrays.asList(((String)s.aJ.g()).split(",")));
    }

    @Override  // com.google.android.gms.ads.internal.client.a
    public final void a() {
    }

    protected final WebResourceResponse b(String s, Map map0) {
        InputStream inputStream1;
        CacheEntryParcel cacheEntryParcel0;
        Object object5;
        l l0;
        clht clht0;
        ghji ghji0;
        boolean z1;
        InputStream inputStream0;
        r r0;
        Object object4;
        o o0;
        com.google.android.gms.ads.internal.cache.n n0;
        j j0;
        p p0;
        long v8;
        long v7;
        int v6;
        HashMap hashMap2;
        CacheOffering cacheOffering0;
        String s9;
        WebResourceResponse webResourceResponse0;
        String s7;
        URL uRL0;
        String s3;
        String s1;
        i i0;
        try {
            HashMap hashMap0 = new HashMap();
            i0 = this.a;
            Context context0 = i0.getContext();
            if(!((Boolean)s.E.g()).booleanValue() && c.c().e(context0) && !TextUtils.isEmpty(s)) {
                d d0 = c.c();
                if(d0.e(context0)) {
                    Object object0 = d0.a("generateEventId", context0);
                    s1 = object0 == null ? null : object0.toString();
                }
                else {
                    s1 = null;
                }
                if(s1 == null) {
                    s3 = s;
                }
                else {
                    String s2 = (String)s.A.g();
                    if(!((Boolean)s.z.g()).booleanValue() || !s.contains(s2)) {
                        if(s.contains("fbs_aeid") || ((Boolean)s.y.g()).booleanValue()) {
                            s3 = s;
                        }
                        else if(c.e().c(s)) {
                            c.c().c(context0, s1, ((Map)hashMap0.get("_ac")));
                            s3 = com.google.android.gms.ads.internal.scionintegration.e.a(com.google.android.gms.ads.internal.scionintegration.e.b(s, context0), "fbs_aeid", s1).toString();
                        }
                        else if(c.e().d(s)) {
                            c.c().d(context0, s1, ((Map)hashMap0.get("_ai")));
                            s3 = com.google.android.gms.ads.internal.scionintegration.e.a(com.google.android.gms.ads.internal.scionintegration.e.b(s, context0), "fbs_aeid", s1).toString();
                        }
                        else {
                            s3 = s;
                        }
                    }
                    else if(c.e().c(s)) {
                        c.c().c(context0, s1, ((Map)hashMap0.get("_ac")));
                        s3 = com.google.android.gms.ads.internal.scionintegration.e.b(s, context0).replace(s2, s1);
                    }
                    else if(c.e().d(s)) {
                        c.c().d(context0, s1, ((Map)hashMap0.get("_ai")));
                        s3 = com.google.android.gms.ads.internal.scionintegration.e.b(s, context0).replace(s2, s1);
                    }
                    else {
                        s3 = s;
                    }
                }
            }
            else {
                s3 = s;
            }
            if(!s3.equals(s)) {
                uRL0 = new URL(s3);
                goto label_44;
            }
            goto label_119;
        }
        catch(Exception | NoClassDefFoundError throwable0) {
            c.d().c(throwable0, "AdWebViewClient.interceptRequest");
            return n.g();
        }
        try {
        label_44:
            TrafficStats.setThreadStatsTag(0x108);
            int v = 0;
            while(true) {
                ++v;
                if(v > 20) {
                    goto label_117;
                }
                URLConnection uRLConnection0 = cjwq.b().a(uRL0, "client-admob");
                uRLConnection0.setConnectTimeout(10000);
                uRLConnection0.setReadTimeout(10000);
                for(Object object1: map0.entrySet()) {
                    uRLConnection0.addRequestProperty(((String)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
                }
                if(!(uRLConnection0 instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                c.e().e(i0.getContext(), i0.i().a, ((HttpURLConnection)uRLConnection0), 60000);
                new g();
                int v1 = ((HttpURLConnection)uRLConnection0).getResponseCode();
                if(v1 < 300 || v1 >= 400) {
                    String s4 = ((HttpURLConnection)uRLConnection0).getContentType();
                    String s5 = TextUtils.isEmpty(s4) ? "" : s4.split(";")[0].trim();
                    String s6 = ((HttpURLConnection)uRLConnection0).getContentType();
                    if(TextUtils.isEmpty(s6)) {
                        s7 = "";
                    }
                    else {
                        String[] arr_s = s6.split(";");
                        if(arr_s.length == 1) {
                            s7 = "";
                        }
                        else {
                            s7 = "";
                            for(int v2 = 1; v2 < arr_s.length; ++v2) {
                                if(arr_s[v2].trim().startsWith("charset")) {
                                    String[] arr_s1 = arr_s[v2].trim().split("=");
                                    if(arr_s1.length > 1) {
                                        s7 = arr_s1[1].trim();
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    Map map1 = ((HttpURLConnection)uRLConnection0).getHeaderFields();
                    HashMap hashMap1 = new HashMap(map1.size());
                    for(Object object2: map1.entrySet()) {
                        Map.Entry map$Entry0 = (Map.Entry)object2;
                        if(map$Entry0.getKey() != null && map$Entry0.getValue() != null && !((List)map$Entry0.getValue()).isEmpty()) {
                            hashMap1.put(((String)map$Entry0.getKey()), ((String)((List)map$Entry0.getValue()).get(0)));
                        }
                    }
                    webResourceResponse0 = new WebResourceResponse(s5, s7, ((HttpURLConnection)uRLConnection0).getResponseCode(), ((HttpURLConnection)uRLConnection0).getResponseMessage(), hashMap1, ((HttpURLConnection)uRLConnection0).getInputStream());
                }
                else {
                    String s8 = ((HttpURLConnection)uRLConnection0).getHeaderField("Location");
                    if(s8 == null) {
                        throw new IOException("Missing Location header in redirect");
                    }
                    if(s8.startsWith("tel:")) {
                        webResourceResponse0 = null;
                    }
                    else {
                        URL uRL1 = new URL(uRL0, s8);
                        s9 = uRL1.getProtocol();
                        if(s9 == null) {
                            h.k("Protocol is null");
                            webResourceResponse0 = n.g();
                        }
                        else {
                            if(s9.equals("http") || s9.equals("https")) {
                                h.d(("Redirecting to " + s8));
                                ((HttpURLConnection)uRLConnection0).disconnect();
                                uRL0 = uRL1;
                                continue;
                            }
                            break;
                        }
                    }
                }
                goto label_115;
            }
            h.k(("Unsupported scheme: " + s9));
            webResourceResponse0 = n.g();
            goto label_115;
        }
        catch(Throwable throwable1) {
            try {
                TrafficStats.clearThreadStatsTag();
                throw throwable1;
            label_115:
                TrafficStats.clearThreadStatsTag();
                return webResourceResponse0;
            label_117:
                TrafficStats.clearThreadStatsTag();
                throw new IOException("Too many redirects (20)");
            label_119:
                Uri uri0 = Uri.parse(s);
                try {
                    if("gcache".equals(uri0.getScheme())) {
                        List list0 = uri0.getPathSegments();
                        if(list0.size() == 2) {
                            String s10 = (String)list0.get(0);
                            String s11 = (String)list0.get(1);
                            String s12 = uri0.getHost();
                            String s13 = uri0.getQueryParameter("url");
                            boolean z = "1".equals(uri0.getQueryParameter("read_only"));
                            String s14 = uri0.getQueryParameter("expiration");
                            long v3 = s14 == null ? 0L : Long.parseLong(s14);
                            Bundle bundle0 = new Bundle();
                            for(Object object3: uri0.getQueryParameterNames()) {
                                String s15 = (String)object3;
                                if(s15.startsWith("tag.")) {
                                    bundle0.putString(s15.substring(4), uri0.getQueryParameter(s15));
                                }
                            }
                            cacheOffering0 = new CacheOffering(s13, v3, s12, s10, s11, bundle0, z, 0L, "", 0);
                        }
                        else {
                            h.k(a.S(list0, "Expected 2 path parts for namespace and id, found :"));
                            cacheOffering0 = null;
                        }
                    }
                    else {
                        cacheOffering0 = null;
                    }
                }
                catch(NullPointerException | NumberFormatException exception0) {
                    h.m("Unable to parse Uri into cache offering.", exception0);
                    cacheOffering0 = null;
                }
                if(cacheOffering0 == null) {
                    return null;
                }
                hashMap2 = new HashMap();
                hashMap2.put("Access-Control-Allow-Origin", "*");
                Uri uri1 = Uri.parse(s);
                if(uri1.getQueryParameterNames().contains("range")) {
                    List list1 = gfud.e('-').n(uri1.getQueryParameter("range"));
                    if(list1.size() == 2) {
                        int v4 = Integer.parseInt(((String)list1.get(0)));
                        int v5 = Integer.parseInt(((String)list1.get(1))) + 1;
                        if(v4 > 0) {
                            cacheOffering0.h = (long)v4;
                        }
                        v6 = v5 - v4;
                    }
                    else {
                        v6 = -1;
                    }
                }
                else {
                    v6 = -1;
                }
                if(((Boolean)s.an.g()).booleanValue()) {
                    this.a.c();
                    cacheOffering0.i = "";
                    ((com.google.android.gms.ads.internal.webview.r)this.a).a.d();
                    cacheOffering0.j = 0;
                    v7 = (long)(cacheOffering0.g ? ((Long)s.ap.g()) : ((Long)s.ao.g()));
                    v8 = SystemClock.elapsedRealtime();
                    p0 = new p(this.a.getContext());
                    j0 = new j(p0);
                    n0 = new com.google.android.gms.ads.internal.cache.n(p0, cacheOffering0, j0);
                    o0 = new o(p0, j0);
                    object4 = p0.d;
                    __monitor_enter(object4);
                    goto label_176;
                }
                else {
                    goto label_242;
                }
                return inputStream1 == null ? null : new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream1);
            }
            catch(Exception | NoClassDefFoundError throwable0) {
                c.d().c(throwable0, "AdWebViewClient.interceptRequest");
                return n.g();
            }
        }
        try {
        label_176:
            p0.a = new com.google.android.gms.ads.internal.cache.d(p0.c, c.f().a(), n0, o0);
            p0.a.M();
            goto label_182;
        }
        catch(Throwable throwable2) {
            try {
                __monitor_exit(object4);
                throw throwable2;
            label_182:
                __monitor_exit(object4);
            }
            catch(Exception | NoClassDefFoundError throwable0) {
                c.d().c(throwable0, "AdWebViewClient.interceptRequest");
                return n.g();
            }
        }
        try {
            r0 = (r)j0.get(v7, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | TimeoutException exception1) {
            inputStream0 = null;
            z1 = false;
            goto label_211;
        }
        catch(InterruptedException interruptedException0) {
            inputStream0 = null;
            z1 = false;
            goto label_220;
        }
        catch(Throwable throwable3) {
            z1 = false;
            goto label_233;
        }
        try {
            hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(r0.b));
            hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(r0.c));
            hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(r0.e));
            inputStream0 = null;
            hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(r0.d));
            inputStream0 = r0.a;
            goto label_206;
        }
        catch(ExecutionException | TimeoutException exception1) {
        }
        catch(InterruptedException interruptedException0) {
            goto label_219;
        }
        catch(Throwable throwable3) {
            goto label_232;
        }
        inputStream0 = null;
        goto label_210;
    label_206:
        if(v6 != -1) {
            try {
                ghji0 = new ghji(inputStream0, ((long)v6));
                goto label_236;
            }
            catch(ExecutionException | TimeoutException exception1) {
            }
            catch(InterruptedException interruptedException0) {
                goto label_219;
            }
            catch(Throwable throwable3) {
                goto label_232;
            }
        label_210:
            z1 = true;
            try {
            label_211:
                if(((Boolean)s.at.g()).booleanValue()) {
                    c.d().c(exception1, "AdWebViewClient.interceptRequest.gcache");
                }
                j0.cancel(true);
            }
            catch(Throwable throwable3) {
                goto label_233;
            }
            try {
                long v9 = SystemClock.elapsedRealtime() - v8;
                clht0 = m.a;
                l0 = new l(this, z1, v9);
                goto label_240;
            }
            catch(Exception | NoClassDefFoundError throwable0) {
                c.d().c(throwable0, "AdWebViewClient.interceptRequest");
                return n.g();
            }
        label_219:
            z1 = true;
            try {
            label_220:
                if(((Boolean)s.at.g()).booleanValue()) {
                    c.d().c(interruptedException0, "AdWebViewClient.interceptRequest.gcache");
                }
                j0.cancel(true);
                Thread.currentThread().interrupt();
            }
            catch(Throwable throwable3) {
                goto label_233;
            }
            try {
                long v10 = SystemClock.elapsedRealtime() - v8;
                clht0 = m.a;
                l0 = new l(this, z1, v10);
                goto label_240;
            label_232:
                z1 = true;
            label_233:
                l l1 = new l(this, z1, SystemClock.elapsedRealtime() - v8);
                m.a.post(l1);
                throw throwable3;
            label_236:
                inputStream0 = ghji0;
            label_237:
                long v11 = SystemClock.elapsedRealtime() - v8;
                clht0 = m.a;
                l0 = new l(this, true, v11);
            label_240:
                clht0.post(l0);
                inputStream1 = inputStream0;
                return inputStream1 == null ? null : new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream1);
            label_242:
                object5 = c.a.e.a;
                __monitor_enter(object5);
                cacheEntryParcel0 = new CacheEntryParcel();
                goto label_249;
            }
            catch(Exception | NoClassDefFoundError throwable0) {
                c.d().c(throwable0, "AdWebViewClient.interceptRequest");
                return n.g();
            }
        }
        goto label_237;
        try {
            cacheEntryParcel0 = new CacheEntryParcel();
            goto label_249;
        }
        catch(Throwable throwable4) {
            try {
                __monitor_exit(object5);
                throw throwable4;
            label_249:
                __monitor_exit(object5);
                if(cacheEntryParcel0.e()) {
                    hashMap2.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(cacheEntryParcel0.d()));
                    hashMap2.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(cacheEntryParcel0.g()));
                    hashMap2.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(cacheEntryParcel0.f()));
                    hashMap2.put("X-Afma-Gcache-CachedBytes", Long.toString(cacheEntryParcel0.a()));
                    inputStream0 = cacheEntryParcel0.c();
                    inputStream1 = v6 == -1 ? inputStream0 : new ghji(inputStream0, ((long)v6));
                }
                else {
                    inputStream1 = null;
                }
                return inputStream1 == null ? null : new WebResourceResponse("", "", 200, "OK", hashMap2, inputStream1);
            }
            catch(Exception | NoClassDefFoundError throwable0) {
            }
        }
        c.d().c(throwable0, "AdWebViewClient.interceptRequest");
        return n.g();
    }

    public final void c() {
        synchronized(this.c) {
            this.b.clear();
            this.e = null;
            this.d = false;
        }
    }

    public final void d(Uri uri0) {
        String s = uri0.getPath();
        List list0 = (List)this.b.get(s);
        if(s != null && list0 != null) {
            String s1 = uri0.getEncodedQuery();
            if(((Boolean)s.aI.g()).booleanValue() && this.g.contains(s) && s1 != null && s1.length() >= ((int)(((Integer)s.aK.g())))) {
                k k0 = new k(uri0);
                com.google.android.gms.ads.internal.webview.m m0 = new com.google.android.gms.ads.internal.webview.m(this, list0, uri0);
                gmbu.t(gmbu.m(k0, c.e().c), m0, com.google.android.gms.ads.internal.util.future.e.c);
                return;
            }
            this.e(m.n(uri0), list0);
            return;
        }
        if(((Boolean)s.aT.g()).booleanValue() && c.d().a() != null) {
            com.google.android.gms.ads.internal.util.future.e.a.execute(new com.google.android.gms.ads.internal.webview.k((s == null || s.length() < 2 ? "null" : s.substring(1))));
        }
    }

    public final void e(Map map0, List list0) {
        if(com.google.android.gms.ads.internal.util.c.a()) {
            for(Object object0: map0.keySet()) {
                String s = (String)map0.get(((String)object0));
            }
        }
        for(Object object1: list0) {
            ((com.google.android.gms.ads.internal.gmsg.e)object1).a(this.a, map0);
        }
    }

    public final void f() {
        synchronized(this.c) {
        }
    }

    private static WebResourceResponse g() {
        return ((Boolean)s.F.g()).booleanValue() ? new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0])) : null;
    }

    @Override  // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView0, String s) {
        Uri uri0 = Uri.parse(s);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.d(uri0);
        }
    }

    @Override  // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView0, String s) {
        synchronized(this.c) {
            i i0 = this.a;
            if(i0.l()) {
                com.google.android.gms.ads.internal.webview.r r0 = (com.google.android.gms.ads.internal.webview.r)i0;
                batl.h("onDestroy must be called from the UI thread.");
                ((com.google.android.gms.ads.internal.webview.r)i0).a.k();
                return;
            }
        }
        f f0 = this.e;
        if(f0 != null) {
            f0.a.b.add(Long.valueOf(System.currentTimeMillis() - f0.a.c));
            f0.a.b.get(0);
            com.google.android.gms.ads.internal.js.o o0 = new com.google.android.gms.ads.internal.js.o(f0.a.a, f0.a.d, f0.a.e, f0.a.b);
            long v1 = (long)(((int)(((Integer)s.c.g()))));
            m.a.postDelayed(o0, v1);
            this.e = null;
        }
        i i1 = this.a;
        x x0 = (x)((com.google.android.gms.ads.internal.webview.r)i1).a;
        if(x0.d == null) {
            x0.d = com.google.android.gms.ads.internal.csi.k.a();
            x0.e.a("native:view_load", x0.d);
        }
        i1.n();
    }

    @Override  // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView0, int v, String s, String s1) {
    }

    @Override  // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView0, String s) {
        return this.b(s, Collections.EMPTY_MAP);
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView0, KeyEvent keyEvent0) {
        int v = keyEvent0.getKeyCode();
        if(v != 0x4F && v != 0xDE) {
            switch(v) {
                case 85: 
                case 86: 
                case 87: 
                case 88: 
                case 89: 
                case 90: 
                case 91: {
                    break;
                }
                default: {
                    return v == 0x7E || v == 0x7F || v == 0x80 || v == 0x81 || v == 130;
                }
            }
        }
        return true;
    }

    @Override  // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView0, String s) {
        String s1;
        Uri uri0 = Uri.parse(s);
        if("gmsg".equalsIgnoreCase(uri0.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri0.getHost())) {
            this.d(uri0);
            return true;
        }
        if(!((WebView)((com.google.android.gms.ads.internal.webview.r)this.a).a).willNotDraw()) {
            try {
                Boolean boolean0 = (Boolean)s.bW.g();
            }
            catch(wbs unused_ex) {
                h.k(("Unable to append parameter to URL: " + s));
            }
            AdLauncherIntentInfoParcel adLauncherIntentInfoParcel0 = new AdLauncherIntentInfoParcel("android.intent.action.VIEW", uri0.toString(), null, null, null, null, null, null, new ObjectWrapper(null), false);
            i i0 = this.a;
            if(i0 == null) {
                s1 = "";
            }
            else {
                i0.c();
                s1 = null;
            }
            i0.q();
            AdOverlayInfoParcel adOverlayInfoParcel0 = new AdOverlayInfoParcel(adLauncherIntentInfoParcel0, i0.i(), i0, s1);
            Context context0 = i0.getContext();
            if(adOverlayInfoParcel0.l == 4 && adOverlayInfoParcel0.d == null) {
                a a0 = adOverlayInfoParcel0.c;
                if(a0 != null) {
                    a0.a();
                }
                AdLauncherIntentInfoParcel adLauncherIntentInfoParcel1 = adOverlayInfoParcel0.b;
                Activity activity0 = adOverlayInfoParcel0.e.f();
                if(adLauncherIntentInfoParcel1 != null && adLauncherIntentInfoParcel1.j && activity0 != null) {
                    context0 = activity0;
                }
                com.google.android.gms.ads.internal.overlay.i i1 = adOverlayInfoParcel0.j;
                com.google.android.gms.ads.internal.overlay.h h0 = adLauncherIntentInfoParcel1 == null ? null : adLauncherIntentInfoParcel1.i;
                if(adLauncherIntentInfoParcel1 == null) {
                    h.k("No intent data for launcher overlay.");
                    return true;
                }
                s.c(context0);
                Intent intent0 = adLauncherIntentInfoParcel1.h;
                if(intent0 != null) {
                    com.google.android.gms.ads.internal.overlay.a.a(context0, intent0, i1, h0, adLauncherIntentInfoParcel1.j);
                    return true;
                }
                Intent intent1 = new Intent();
                String s2 = adLauncherIntentInfoParcel1.b;
                if(TextUtils.isEmpty(s2)) {
                    h.k("Open GMSG did not contain a URL.");
                    return true;
                }
                String s3 = adLauncherIntentInfoParcel1.c;
                if(TextUtils.isEmpty(s3)) {
                    intent1.setData(Uri.parse(s2));
                }
                else {
                    intent1.setDataAndType(Uri.parse(s2), s3);
                }
                intent1.setAction("android.intent.action.VIEW");
                String s4 = adLauncherIntentInfoParcel1.d;
                if(!TextUtils.isEmpty(s4)) {
                    intent1.setPackage(s4);
                }
                String s5 = adLauncherIntentInfoParcel1.e;
                int v = 0;
                if(!TextUtils.isEmpty(s5)) {
                    String[] arr_s = s5.split("/", 2);
                    if(arr_s.length < 2) {
                        h.k(("Could not parse component name from open GMSG: " + s5));
                        return true;
                    }
                    intent1.setClassName(arr_s[0], arr_s[1]);
                }
                String s6 = adLauncherIntentInfoParcel1.f;
                if(!TextUtils.isEmpty(s6)) {
                    try {
                        v = Integer.parseInt(s6);
                    }
                    catch(NumberFormatException unused_ex) {
                        h.k("Could not parse intent flags.");
                    }
                    intent1.addFlags(v);
                }
                if(((Boolean)s.ay.g()).booleanValue()) {
                    intent1.addFlags(0x10000000);
                    intent1.putExtra("android.support.customtabs.extra.user_opt_out", true);
                }
                else if(((Boolean)s.ax.g()).booleanValue()) {
                    Bundle bundle0 = intent1.getExtras() == null ? new Bundle() : intent1.getExtras();
                    bundle0.putBinder("android.support.customtabs.extra.SESSION", null);
                    bundle0.putString("com.android.browser.application_id", "com.google.android.gms");
                    intent1.putExtras(bundle0);
                }
                com.google.android.gms.ads.internal.overlay.a.a(context0, intent1, i1, h0, adLauncherIntentInfoParcel1.j);
                return true;
            }
            Intent intent2 = new Intent();
            intent2.setClassName(context0, "com.google.android.gms.ads.AdActivity");
            intent2.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel0.n.d);
            intent2.putExtra("shouldCallOnOverlayOpened", true);
            Bundle bundle1 = new Bundle(1);
            bundle1.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel0);
            intent2.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle1);
            if(!(context0 instanceof Activity)) {
                intent2.addFlags(0x10000000);
            }
            if(((Boolean)s.cd.g()).booleanValue()) {
                m.t(context0, intent2);
                return true;
            }
            m.s(context0, intent2);
            return true;
        }
        h.k(("AdWebView unable to handle URL: " + s));
        return true;
    }
}

