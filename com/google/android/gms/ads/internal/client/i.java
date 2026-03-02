package com.google.android.gms.ads.internal.client;

import abbo;
import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.f;
import j..util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public final class i {
    public static final i a;

    static {
        i.a = new i();
    }

    public final AdRequestParcel a(Context context0, bo bo0) {
        String s4;
        String s2;
        List list0 = bo0.b.isEmpty() ? null : DesugarCollections.unmodifiableList(new ArrayList(bo0.b));
        abbo abbo0 = bs.a().a;
        String s = f.m(context0);
        boolean z = bo0.e.contains(s) || new ArrayList(abbo0.b).contains(s);
        Bundle bundle0 = bo0.c;
        Bundle bundle1 = bundle0.getBundle(AdMobAdapter.class.getName());
        if(context0.getApplicationContext() == null) {
            s4 = null;
        }
        else {
            String s1 = "com.google.android.gms";
            StackTraceElement[] arr_stackTraceElement = Thread.currentThread().getStackTrace();
            for(int v = 0; true; ++v) {
                s2 = null;
                if(v + 1 >= arr_stackTraceElement.length) {
                    break;
                }
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                String s3 = stackTraceElement0.getClassName();
                if("loadAd".equalsIgnoreCase(stackTraceElement0.getMethodName()) && (f.b.equalsIgnoreCase(s3) || f.c.equalsIgnoreCase(s3) || f.d.equalsIgnoreCase(s3) || f.e.equalsIgnoreCase(s3) || f.f.equalsIgnoreCase(s3) || f.g.equalsIgnoreCase(s3))) {
                    s2 = arr_stackTraceElement[v + 1].getClassName();
                    break;
                }
            }
            StringTokenizer stringTokenizer0 = new StringTokenizer("com.google.android.gms", ".");
            StringBuilder stringBuilder0 = new StringBuilder();
            if(stringTokenizer0.hasMoreElements()) {
                stringBuilder0.append(stringTokenizer0.nextToken());
                for(int v1 = 2; v1 > 0 && stringTokenizer0.hasMoreElements(); --v1) {
                    stringBuilder0.append(".");
                    stringBuilder0.append(stringTokenizer0.nextToken());
                }
                s1 = stringBuilder0.toString();
            }
            s4 = s2 != null && !s2.contains(s1) ? s2 : null;
        }
        bs.a();
        String s5 = (String)Collections.max(Arrays.asList(new String[]{0, ""}), new h());
        ArrayList arrayList0 = new ArrayList(bo0.a);
        List list1 = DesugarCollections.unmodifiableList(new ArrayList(bo0.g));
        return new AdRequestParcel(8, -1L, bundle1, -1, list0, z, Math.max(bo0.d, -1), false, null, null, null, null, bundle0, bo0.f, list1, null, s4, bo0.h, null, -1, s5, arrayList0, 60000, null, 0, bo0.i, 0L);
    }
}

