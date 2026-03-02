package com.google.android.gms.ads.internal.util.client;

import abad;
import abah;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import azpn;
import azqk;
import clht;
import com.google.android.gms.ads.admanager.a;
import com.google.android.gms.ads.internal.flag.s;
import com.google.android.gms.ads.interstitial.b;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    public static final Handler a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    private float h;

    static {
        f.a = new clht(Looper.getMainLooper());
        f.b = abah.class.getName();
        f.c = b.class.getName();
        f.d = a.class.getName();
        f.e = com.google.android.gms.ads.admanager.b.class.getName();
        f.f = com.google.android.gms.ads.search.a.class.getName();
        f.g = abad.class.getName();
    }

    public f() {
        this.h = -1.0f;
    }

    public final int a(Context context0, int v) {
        if((this.h < 0.0f)) {
            synchronized(this) {
                if((this.h < 0.0f)) {
                    WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
                    if(windowManager0 == null) {
                        return 0;
                    }
                    Display display0 = windowManager0.getDefaultDisplay();
                    DisplayMetrics displayMetrics0 = new DisplayMetrics();
                    display0.getMetrics(displayMetrics0);
                    this.h = displayMetrics0.density;
                }
            }
            return Math.round(((float)v) / this.h);
        }
        return Math.round(((float)v) / this.h);
    }

    public static String b() {
        UUID uUID0 = UUID.randomUUID();
        byte[] arr_b = BigInteger.valueOf(uUID0.getLeastSignificantBits()).toByteArray();
        byte[] arr_b1 = BigInteger.valueOf(uUID0.getMostSignificantBits()).toByteArray();
        String s = new BigInteger(1, arr_b).toString();
        for(int v = 0; v < 2; ++v) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance("MD5");
                messageDigest0.update(arr_b);
                messageDigest0.update(arr_b1);
                byte[] arr_b2 = new byte[8];
                System.arraycopy(messageDigest0.digest(), 0, arr_b2, 0, 8);
                s = new BigInteger(1, arr_b2).toString();
            }
            catch(NoSuchAlgorithmException unused_ex) {
            }
        }
        return s;
    }

    public static String c(String s, String s1) {
        int v = 0;
        while(v < 2) {
            try {
                MessageDigest messageDigest0 = MessageDigest.getInstance(s1);
                messageDigest0.update(s.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest0.digest()));
            }
            catch(NoSuchAlgorithmException unused_ex) {
                ++v;
            }
            catch(ArithmeticException unused_ex) {
                return null;
            }
        }
        return null;
    }

    final JSONArray d(Object[] arr_object) {
        JSONArray jSONArray0 = new JSONArray();
        for(int v = 0; v < arr_object.length; ++v) {
            this.q(jSONArray0, arr_object[v]);
        }
        return jSONArray0;
    }

    public final JSONObject e(Bundle bundle0) {
        JSONObject jSONObject0 = new JSONObject();
        for(Object object0: bundle0.keySet()) {
            this.r(jSONObject0, ((String)object0), bundle0.get(((String)object0)));
        }
        return jSONObject0;
    }

    public final JSONObject f(Map map0) {
        try {
            JSONObject jSONObject0 = new JSONObject();
            for(Object object0: map0.keySet()) {
                this.r(jSONObject0, ((String)object0), map0.get(((String)object0)));
            }
            return jSONObject0;
        }
        catch(ClassCastException classCastException0) {
            throw new JSONException("Could not convert map to JSON: " + classCastException0.getMessage());
        }
    }

    public static boolean g(String s) {
        return TextUtils.isEmpty(s) ? false : s.startsWith(((String)s.d.d()));
    }

    public static final int h(DisplayMetrics displayMetrics0, int v) {
        return (int)TypedValue.applyDimension(1, ((float)v), displayMetrics0);
    }

    public static final boolean i() {
        boolean z = ((Boolean)com.google.android.gms.ads.internal.config.s.bL.g()).booleanValue();
        return Build.FINGERPRINT.contains("generic") || Build.FINGERPRINT.contains("emulator") ? true : z && Build.HARDWARE.contains("ranchu");
    }

    public static final int j(DisplayMetrics displayMetrics0, int v) {
        return Math.round(((float)v) / displayMetrics0.density);
    }

    public final void k(Context context0, String s, Bundle bundle0) {
        f.o(context0, s, "gmob-apps", bundle0, new c(this, context0));
    }

    public static final int l(Context context0, int v) {
        return f.h(context0.getResources().getDisplayMetrics(), v);
    }

    public static final String m(Context context0) {
        ContentResolver contentResolver0 = context0.getContentResolver();
        String s = contentResolver0 == null ? null : Settings.Secure.getString(contentResolver0, "android_id");
        if(s == null || f.i()) {
            s = "emulator";
        }
        return f.c(s, "MD5");
    }

    public static final boolean n(Context context0) {
        return azpn.d.m(context0) == 0;
    }

    public static final void o(Context context0, String s, String s1, Bundle bundle0, e e0) {
        boolean z = context0.getApplicationContext() != null;
        bundle0.putString("os", Build.VERSION.RELEASE);
        bundle0.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle0.putString("appid", "com.google.android.gms");
        if(s == null) {
            s = a.H(azqk.a(context0), ".253434000");
        }
        bundle0.putString("js", s);
        Uri.Builder uri$Builder0 = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", s1);
        for(Object object0: bundle0.keySet()) {
            uri$Builder0.appendQueryParameter(((String)object0), bundle0.getString(((String)object0)));
        }
        e0.a(uri$Builder0.toString());
    }

    private final JSONArray p(Collection collection0) {
        JSONArray jSONArray0 = new JSONArray();
        for(Object object0: collection0) {
            this.q(jSONArray0, object0);
        }
        return jSONArray0;
    }

    private final void q(JSONArray jSONArray0, Object object0) {
        if((object0 instanceof Bundle)) {
            jSONArray0.put(this.e(((Bundle)object0)));
            return;
        }
        if((object0 instanceof Map)) {
            jSONArray0.put(this.f(((Map)object0)));
            return;
        }
        if((object0 instanceof Collection)) {
            jSONArray0.put(this.p(((Collection)object0)));
            return;
        }
        if((object0 instanceof Object[])) {
            jSONArray0.put(this.d(((Object[])object0)));
            return;
        }
        jSONArray0.put(object0);
    }

    private final void r(JSONObject jSONObject0, String s, Object object0) {
        Boolean[] arr_boolean;
        Long[] arr_long;
        Double[] arr_double;
        Integer[] arr_integer;
        if(((Boolean)com.google.android.gms.ads.internal.config.s.h.g()).booleanValue()) {
            s = String.valueOf(s);
        }
        int v = 0;
        if((object0 instanceof Bundle)) {
            jSONObject0.put(s, this.e(((Bundle)object0)));
            return;
        }
        if((object0 instanceof Map)) {
            jSONObject0.put(s, this.f(((Map)object0)));
            return;
        }
        if((object0 instanceof Collection)) {
            jSONObject0.put(String.valueOf(s), this.p(((Collection)object0)));
            return;
        }
        if((object0 instanceof Object[])) {
            jSONObject0.put(s, this.p(Arrays.asList(((Object[])object0))));
            return;
        }
        if((object0 instanceof int[])) {
            if(((int[])object0) == null) {
                arr_integer = new Integer[0];
            }
            else {
                Integer[] arr_integer1 = new Integer[((int[])object0).length];
                while(v < ((int[])object0).length) {
                    arr_integer1[v] = (int)((int[])object0)[v];
                    ++v;
                }
                arr_integer = arr_integer1;
            }
            jSONObject0.put(s, this.d(arr_integer));
            return;
        }
        if((object0 instanceof double[])) {
            if(((double[])object0) == null) {
                arr_double = new Double[0];
            }
            else {
                Double[] arr_double1 = new Double[((double[])object0).length];
                while(v < ((double[])object0).length) {
                    arr_double1[v] = (double)((double[])object0)[v];
                    ++v;
                }
                arr_double = arr_double1;
            }
            jSONObject0.put(s, this.d(arr_double));
            return;
        }
        if((object0 instanceof long[])) {
            if(((long[])object0) == null) {
                arr_long = new Long[0];
            }
            else {
                Long[] arr_long1 = new Long[((long[])object0).length];
                while(v < ((long[])object0).length) {
                    arr_long1[v] = (long)((long[])object0)[v];
                    ++v;
                }
                arr_long = arr_long1;
            }
            jSONObject0.put(s, this.d(arr_long));
            return;
        }
        if((object0 instanceof boolean[])) {
            if(((boolean[])object0) == null) {
                arr_boolean = new Boolean[0];
            }
            else {
                Boolean[] arr_boolean1 = new Boolean[((boolean[])object0).length];
                while(v < ((boolean[])object0).length) {
                    arr_boolean1[v] = Boolean.valueOf(((boolean[])object0)[v]);
                    ++v;
                }
                arr_boolean = arr_boolean1;
            }
            jSONObject0.put(s, this.d(arr_boolean));
            return;
        }
        jSONObject0.put(s, object0);
    }
}

