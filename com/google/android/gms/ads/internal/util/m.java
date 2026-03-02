package com.google.android.gms.ads.internal.util;

import a;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import azqk;
import bbna;
import bbni;
import bbsr;
import clht;
import com.google.android.gms.ads.internal.c;
import com.google.android.gms.ads.internal.config.s;
import com.google.android.gms.ads.internal.util.client.f;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.webview.ah;
import gfud;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public final class m {
    public static final clht a;
    public final AtomicReference b;
    public final Executor c;
    private final AtomicReference d;
    private final AtomicReference e;
    private final AtomicBoolean f;
    private final Object g;
    private String h;
    private volatile String i;

    static {
        m.a = new d(Looper.getMainLooper());
    }

    public m() {
        this.d = new AtomicReference(null);
        this.e = new AtomicReference(null);
        this.b = new AtomicReference(new Bundle());
        this.f = new AtomicBoolean();
        this.g = new Object();
        this.c = Executors.newSingleThreadExecutor();
    }

    public final String a(Context context0, String s) {
        String s2;
        if(((Boolean)s.bG.g()).booleanValue()) {
            if(this.i != null) {
                return this.i;
            }
            this.i = m.w(context0, s);
            return this.i;
        }
        synchronized(this.g) {
            String s1 = this.h;
            if(s1 != null) {
                return s1;
            }
            s2 = m.w(context0, s);
            this.h = s2;
        }
        return s2;
    }

    public static List b() {
        List list0 = s.b();
        List list1 = new ArrayList();
        for(Object object0: list0) {
            for(Object object1: gfud.e(',').l(((String)object0))) {
                String s = (String)object1;
                try {
                    list1.add(Long.valueOf(s));
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
        return list1;
    }

    public final boolean c(String s) {
        String s1 = (String)s.w.g();
        return m.u(s, this.d, s1);
    }

    public final boolean d(String s) {
        String s1 = (String)s.x.g();
        return m.u(s, this.e, s1);
    }

    public final void e(Context context0, String s, HttpURLConnection httpURLConnection0, int v) {
        if(v < 5000) {
            if(v > 0) {
                h.k(a.f(v, "HTTP timeout too low: ", " milliseconds. Reverting to default timeout: 60000 milliseconds."));
            }
            v = 60000;
        }
        h.i(a.f(v, "HTTP timeout: ", " milliseconds."));
        httpURLConnection0.setConnectTimeout(v);
        httpURLConnection0.setInstanceFollowRedirects(false);
        httpURLConnection0.setReadTimeout(v);
        if(TextUtils.isEmpty(httpURLConnection0.getRequestProperty("User-Agent"))) {
            httpURLConnection0.setRequestProperty("User-Agent", this.a(context0, s));
        }
        httpURLConnection0.setUseCaches(false);
    }

    public static final void f(Context context0, Uri uri0) {
        Intent intent0 = new Intent("android.intent.action.VIEW");
        intent0.setData(uri0);
        intent0.addFlags(0x10000000);
        context0.startActivity(intent0);
    }

    static final String g() {
        StringBuilder stringBuilder0 = new StringBuilder(0x100);
        stringBuilder0.append("Mozilla/5.0 (Linux; U; Android");
        if(Build.VERSION.RELEASE != null) {
            stringBuilder0.append(" ");
            stringBuilder0.append(Build.VERSION.RELEASE);
        }
        stringBuilder0.append("; ");
        stringBuilder0.append(Locale.getDefault());
        if(Build.DEVICE != null) {
            stringBuilder0.append("; ");
            stringBuilder0.append(Build.DEVICE);
            if(Build.DISPLAY != null) {
                stringBuilder0.append(" Build/");
                stringBuilder0.append(Build.DISPLAY);
            }
        }
        stringBuilder0.append(") AppleWebKit/533 Version/4.0 Safari/533");
        return stringBuilder0.toString();
    }

    public static final int[] h() {
        return new int[]{0, 0};
    }

    public static final boolean i(Context context0, String s) {
        return bbsr.b(com.google.android.gms.ads.internal.reward.a.a(context0)).b(s, "com.google.android.gms") == 0;
    }

    public static final boolean j() {
        return f.i();
    }

    // Detected as a lambda impl.
    public static final void k(Context context0, String s, String s1) {
        new ae(context0, s, s1).b();
    }

    public static final void l(Context context0, Throwable throwable0) {
        if(context0 != null) {
            try {
                if(((Boolean)com.google.android.gms.ads.internal.flag.s.b.d()).booleanValue()) {
                    goto label_2;
                }
            }
            catch(IllegalStateException unused_ex) {
            }
            return;
        label_2:
            bbni.f(context0, throwable0);
        }
    }

    public final void m(Context context0, String s, String s1, Bundle bundle0) {
        bundle0.putString("device", m.o());
        bundle0.putString("eids", TextUtils.join(",", s.a()));
        if(bundle0.isEmpty()) {
            h.d("Empty or null bundle.");
        }
        else {
            String s2 = (String)s.bv.g();
            if(!this.f.getAndSet(true)) {
                Bundle bundle1 = r.a(context0, s2, new j(this, context0, s2));
                this.b.set(bundle1);
            }
            bundle0.putAll(((Bundle)this.b.get()));
        }
        f.o(context0, s, s1, bundle0, (String s1) -> new ae(context0, s, s1).b());
    }

    public static final Map n(Uri uri0) {
        if(uri0 == null) {
            return null;
        }
        if(((Boolean)s.i.g()).booleanValue()) {
            Map map0 = new HashMap();
            if(!uri0.isOpaque()) {
                String s = uri0.getEncodedQuery();
                if(s == null) {
                    return map0;
                }
                for(int v = 0; true; v = v1 + 1) {
                    int v1 = s.indexOf(38, v);
                    int v2 = v1 == -1 ? s.length() : v1;
                    int v3 = s.indexOf(61, v);
                    v3 = v3 <= v2 && v3 != -1 ? s.indexOf(61, v) : v2;
                    ((HashMap)map0).put(Uri.decode(s.substring(v, v3)), (v3 == v2 ? "" : Uri.decode(s.substring(v3 + 1, v2))));
                    if(v1 == -1) {
                        break;
                    }
                }
            }
            return map0;
        }
        Map map1 = new HashMap();
        for(Object object0: uri0.getQueryParameterNames()) {
            String s1 = (String)object0;
            if(!TextUtils.isEmpty(s1)) {
                ((HashMap)map1).put(s1, uri0.getQueryParameter(s1));
            }
        }
        return map1;
    }

    public static final String o() {
        return Build.MODEL.startsWith(Build.MANUFACTURER) ? Build.MODEL : a.r(Build.MODEL, Build.MANUFACTURER, " ");
    }

    public static final int[] p(Activity activity0) {
        Window window0 = activity0.getWindow();
        if(window0 != null) {
            View view0 = window0.findViewById(0x1020002);
            return view0 == null ? m.h() : new int[]{view0.getWidth(), view0.getHeight()};
        }
        return m.h();
    }

    public static final WebResourceResponse q(Context context0, String s, String s1) {
        try {
            HashMap hashMap0 = new HashMap();
            hashMap0.put("User-Agent", c.e().a(context0, s));
            hashMap0.put("Cache-Control", "max-stale=3600");
            String s2 = (String)new ab(context0).a(0, s1, hashMap0, null).get(60L, TimeUnit.SECONDS);
            if(s2 != null) {
                return new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(s2.getBytes("UTF-8")));
            }
        }
        catch(IOException | ExecutionException | InterruptedException | TimeoutException exception0) {
            h.m("Could not fetch MRAID JS.", exception0);
        }
        return null;
    }

    public static final boolean r(Context context0) {
        try {
            context0.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi");
            return false;
        }
        catch(ClassNotFoundException unused_ex) {
            return true;
        }
        catch(Throwable throwable0) {
            h.h("Error loading class.", throwable0);
            c.d().c(throwable0, "AdUtil.isLiteSdk");
            return false;
        }
    }

    public static final void s(Context context0, Intent intent0) {
        if(((Boolean)s.bA.g()).booleanValue()) {
            try {
                m.v(context0, intent0);
            }
            catch(SecurityException securityException0) {
                h.l(securityException0);
                c.d().c(securityException0, "AdUtil.startActivityWithUnknownContext");
            }
            return;
        }
        m.v(context0, intent0);
    }

    public static final void t(Context context0, Intent intent0) {
        if(((Boolean)s.cd.g()).booleanValue() && (context0 instanceof ah)) {
            try {
                Uri uri0 = intent0.getData();
                if(uri0 != null && uri0.toString() != null && uri0.toString().matches(((String)s.cf.g()))) {
                    if(((ah)context0).a == null) {
                        intent0.setFlags(0x10000000);
                        ((ah)context0).b.startActivity(intent0);
                    }
                    else {
                        intent0.getData();
                        ((ah)context0).a.startActivityForResult(intent0, 0xEC);
                    }
                    Boolean boolean0 = (Boolean)s.ce.g();
                    return;
                }
                m.s(context0, intent0);
            }
            catch(ActivityNotFoundException | SecurityException exception1) {
                h.h("Error occurred while starting activity for result", exception1);
                c.d().c(exception1, "AdUtil.startActivityForResult");
                m.s(context0, intent0);
            }
            catch(Exception exception0) {
                h.h("Error occurred while starting activity for result", exception0);
                c.d().c(exception0, "AdUtil.startActivityForResult");
                m.s(context0, intent0);
            }
            return;
        }
        m.s(context0, intent0);
    }

    private static boolean u(String s, AtomicReference atomicReference0, String s1) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        try {
            Pattern pattern0 = (Pattern)atomicReference0.get();
            if(pattern0 == null || !s1.equals(pattern0.pattern())) {
                pattern0 = Pattern.compile(s1);
                atomicReference0.set(pattern0);
            }
            return pattern0.matcher(s).matches();
        }
        catch(PatternSyntaxException unused_ex) {
            return false;
        }
    }

    private static final void v(Context context0, Intent intent0) {
        try {
            context0.startActivity(intent0);
        }
        catch(Throwable unused_ex) {
            intent0.addFlags(0x10000000);
            context0.startActivity(intent0);
        }
    }

    private static final String w(Context context0, String s) {
        String s2;
        String s1;
        if(s != null) {
            try {
                aj aj0 = aj.a();
                if(TextUtils.isEmpty(aj0.a)) {
                    aj0.a = bbna.d() ? ((String)ag.a(context0, new com.google.android.gms.ads.internal.util.ah(context0))) : ((String)ag.a(context0, new ai(azqk.b(context0), context0)));
                }
                s1 = aj0.a;
            }
            catch(Exception unused_ex) {
                s1 = null;
            }
            if(TextUtils.isEmpty(s1)) {
                s1 = WebSettings.getDefaultUserAgent(context0);
            }
            if(TextUtils.isEmpty(s1)) {
                s1 = m.g();
            }
            try {
                s2 = a.r(s, s1, " (Mobile; ");
                if(bbsr.b(context0).i()) {
                    return s2 + ";aia" + ")";
                }
            }
            catch(Exception exception0) {
                c.d().c(exception0, "AdUtil.getUserAgent");
            }
            return s2 + ")";
        }
        return m.g();
    }
}

