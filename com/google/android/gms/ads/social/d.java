package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import bbfj;
import bwjm;
import cjxt;
import clbj;
import clbk;
import clbv;
import clbz;
import clcg;
import clcj;
import clcl;
import clcn;
import clcp;
import clcs;
import clct;
import cljp;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.ads.internal.util.future.e;
import ggeo;
import hont;
import hopm;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class d {
    private final Context a;
    private final i b;
    private final b c;
    private final aa d;

    public d(Context context0, i i0, b b0, aa aa0) {
        this.a = context0;
        this.b = i0;
        this.c = b0;
        this.d = aa0;
    }

    public final int a(String s) {
        h.d("Running DSID refresh task.");
        if(!TextUtils.isEmpty(s) && Character.isDigit(s.charAt(s.length() - 1))) {
            h.d("Cancelling old DRT task.");
            cljp.a(this.a).d(s, "com.google.android.gms.ads.social.GcmSchedulerWakeupService");
            return 2;
        }
        this.d.d();
        Account[] arr_account = this.b.d();
        c c0 = new c(this.a);
        boolean z = true;
        for(int v = 0; v < arr_account.length; ++v) {
            z = z && this.d(arr_account[v].name, c0);
        }
        if(z) {
            return 0;
        }
        return s.startsWith("ads.social.doritos-oneoff") ? 2 : 1;
    }

    static d b(Context context0) {
        return new d(context0, i.a(context0), new b(context0), aa.a(context0));
    }

    static String c(Map map0) {
        List list0 = null;
        for(Object object0: map0.keySet()) {
            String s = (String)object0;
            if("Set-Cookie".equalsIgnoreCase(s)) {
                list0 = (List)map0.get(s);
                break;
            }
        }
        if(list0 != null) {
            for(Object object1: list0) {
                String s1 = (String)object1;
                if(s1 != null && s1.startsWith("DSID")) {
                    return s1;
                }
            }
        }
        return null;
    }

    final boolean d(String s, c c0) {
        try {
            String s1 = "1";
            if(hopm.j()) {
                boolean z = com.google.android.gms.ads.identifier.settings.b.c(this.a).l();
                String s2 = z ? "1" : "0";
                if(z) {
                    Uri.Builder uri$Builder0 = Uri.parse(hopm.i()).buildUpon();
                    uri$Builder0.appendQueryParameter(hopm.g(), s2);
                    return this.e(s, c0, new URL(uri$Builder0.build().toString()), a.b);
                }
                Uri.Builder uri$Builder1 = Uri.parse(hopm.i()).buildUpon();
                uri$Builder1.appendQueryParameter(hopm.g(), s2).appendQueryParameter(hopm.f(), "1");
                int v = this.e(s, c0, new URL(uri$Builder1.build().toString()), a.a);
                Uri.Builder uri$Builder2 = Uri.parse(hopm.i()).buildUpon();
                uri$Builder2.appendQueryParameter(hopm.g(), s2).appendQueryParameter(hopm.f(), "0");
                return this.e(s, c0, new URL(uri$Builder2.build().toString()), a.b) & v;
            }
            if(hopm.a.e().i()) {
                if(!com.google.android.gms.ads.identifier.settings.b.c(this.a).l()) {
                    s1 = "0";
                }
                Uri.Builder uri$Builder3 = Uri.parse(hopm.i()).buildUpon();
                uri$Builder3.appendQueryParameter(hopm.g(), s1);
                return this.e(s, c0, new URL(uri$Builder3.build().toString()), a.a);
            }
            return this.e(s, c0, new URL(hopm.i()), a.a);
        }
        catch(MalformedURLException unused_ex) {
            return false;
        }
    }

    final boolean e(String s, c c0, URL uRL0, a a0) {
        int v2;
        HttpURLConnection httpURLConnection0;
        String s2;
        clcp clcp0;
        String s1;
        if(hont.d()) {
            for(boolean z = false; true; z = true) {
                try {
                    s1 = c0.a(s, hopm.h());
                }
                catch(Exception exception0) {
                    h.d(("Failed to get auth token for DSID: " + exception0.toString()));
                    return false;
                }
                if(s1 == null) {
                    return false;
                }
                clcp0 = this.f(uRL0, s1);
                if(clcp0 == null) {
                    return false;
                }
                int v = clcp0.a.a();
                if(v == 401) {
                    try {
                        c0.b(s1);
                        v = 401;
                    }
                    catch(Exception exception1) {
                        h.d(("Failed to clear auth token for DSID: " + exception1.toString()));
                        return false;
                    }
                }
                if(v != 401) {
                    break;
                }
                if(z) {
                    return false;
                }
            }
            if(v == 200) {
                ggeo ggeo0 = clcp0.a.d();
                if(ggeo0 != null) {
                    this.g(s, d.c(new HashMap(ggeo0)), a0);
                    return true;
                }
            }
        }
        else {
            bwjm bwjm0 = new bwjm(this.a);
            boolean z1 = false;
            while(true) {
                try {
                label_29:
                    s2 = c0.a(s, hopm.h());
                }
                catch(Exception exception2) {
                    h.d(("Failed to get auth token for DSID: " + exception2.toString()));
                    return false;
                }
                if(s2 == null) {
                    break;
                }
                try {
                    bbfj.c(0x10A, -1);
                    httpURLConnection0 = bwjm0.b(uRL0);
                    if(httpURLConnection0 == null) {
                        return false;
                    }
                    httpURLConnection0.setRequestProperty("Authorization", "Bearer " + s2);
                    v2 = httpURLConnection0.getResponseCode();
                    bwjm0.a(httpURLConnection0, v2);
                }
                catch(IOException unused_ex) {
                    h.f(a.b(uRL0, "Failed to connect to ", ". No DSID retrieved."));
                    return false;
                }
                finally {
                    bbfj.a();
                }
                if(v2 == 401) {
                    try {
                        c0.b(s2);
                        v2 = 401;
                    }
                    catch(Exception exception3) {
                        h.d(("Failed to clear auth token for DSID: " + exception3.toString()));
                        return false;
                    }
                }
                if(v2 == 401) {
                    if(z1) {
                        break;
                    }
                    z1 = true;
                    goto label_29;
                }
                if(v2 == 200) {
                    Map map0 = httpURLConnection0.getHeaderFields();
                    if(map0 != null) {
                        this.g(s, d.c(map0), a0);
                        return true;
                    }
                }
                break;
            }
        }
        return false;
    }

    private final clcp f(URL uRL0, String s) {
        clcj clcj0 = clbv.a(this.a).e(clcg.f(uRL0.toString(), cjxt.b, clbk.a, clbj.a), clcl.a, e.a, -1, 0x10A);
        clcs clcs0 = clbz.a(clbk.a, clbj.a);
        clcs0.a("Authorization", "Bearer " + s);
        clcj0.m(new clct(clcs0));
        clcn clcn0 = clcj0.e();
        try {
            long v = hont.b();
            return (clcp)clcn0.a().get(v, TimeUnit.MILLISECONDS);
        }
        catch(InterruptedException | ExecutionException | CancellationException | TimeoutException exception0) {
            if((exception0 instanceof InterruptedException)) {
                Thread.currentThread().interrupt();
            }
            if((exception0 instanceof ExecutionException)) {
                h.h("Failed to retrieve DSID: ", exception0.getCause());
            }
            else {
                h.h("Failed to retrieve DSID: ", exception0);
            }
            clcn0.b();
            return null;
        }
    }

    private final void g(String s, String s1, a a0) {
        b b0 = this.c;
        if(a0 == a.b) {
            b0.b.edit().putString(s, s1).apply();
        }
        else {
            b0.a.edit().putString(s, s1).apply();
        }
        h.d("Saved DSID.");
    }
}

