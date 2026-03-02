package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import baub;
import bkup;
import bthd;
import bthh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public class GoogleHelp extends AbstractSafeParcelable implements ReflectedParcelable {
    public boolean A;
    public boolean B;
    public int C;
    public static final Parcelable.Creator CREATOR;
    public String D;
    public boolean E;
    public String F;
    public boolean G;
    public ND4CSettings H;
    public boolean I;
    public List J;
    @Deprecated
    public String K;
    public int L;
    public int M;
    public List N;
    public String O;
    public Intent P;
    public List Q;
    public bthd R;
    public bkup S;
    final int a;
    public String b;
    public Account c;
    public Bundle d;
    public String e;
    String f;
    Bitmap g;
    public boolean h;
    public boolean i;
    public List j;
    @Deprecated
    public Bundle k;
    @Deprecated
    public Bitmap l;
    @Deprecated
    public byte[] m;
    @Deprecated
    public int n;
    @Deprecated
    public int o;
    public String p;
    public Uri q;
    public List r;
    public ThemeSettings s;
    public List t;
    public boolean u;
    public ErrorReport v;
    public TogglingData w;
    int x;
    public PendingIntent y;
    public int z;

    static {
        GoogleHelp.CREATOR = new bthh();
    }

    public GoogleHelp(int v, String s, Account account0, Bundle bundle0, String s1, String s2, Bitmap bitmap0, boolean z, boolean z1, List list0, Bundle bundle1, Bitmap bitmap1, byte[] arr_b, int v1, int v2, String s3, Uri uri0, List list1, int v3, ThemeSettings themeSettings0, List list2, boolean z2, ErrorReport errorReport0, TogglingData togglingData0, int v4, PendingIntent pendingIntent0, int v5, boolean z3, boolean z4, int v6, String s4, boolean z5, String s5, boolean z6, ND4CSettings nD4CSettings0, boolean z7, List list3, String s6, int v7, int v8, List list4, String s7, Intent intent0, List list5) {
        this.v = new ErrorReport();
        if(TextUtils.isEmpty(s)) {
            Log.e("gH_GoogleHelp", "Help requires a non-empty appContext. Please fix ASAP.");
        }
        this.a = v;
        this.z = v5;
        this.A = z3;
        this.B = z4;
        this.C = v6;
        this.D = s4;
        this.b = s;
        this.c = account0;
        this.d = bundle0;
        this.e = s1;
        this.f = s2;
        this.g = bitmap0;
        this.h = z;
        this.i = z1;
        this.E = z5;
        this.j = list0;
        this.y = pendingIntent0;
        this.k = bundle1;
        this.l = bitmap1;
        this.m = arr_b;
        this.n = v1;
        this.o = v2;
        this.p = s3;
        this.q = uri0;
        this.r = list1;
        if(v < 4) {
            ThemeSettings themeSettings1 = new ThemeSettings();
            themeSettings1.a = v3;
            this.s = themeSettings1;
        }
        else {
            this.s = themeSettings0 == null ? new ThemeSettings() : themeSettings0;
        }
        this.t = list2;
        this.u = z2;
        this.v = errorReport0;
        if(errorReport0 != null) {
            errorReport0.X = "GoogleHelp";
        }
        this.w = togglingData0;
        this.x = v4;
        this.F = s5;
        this.G = z6;
        this.H = nD4CSettings0;
        this.I = z7;
        this.J = list3;
        this.K = s6;
        this.L = v7;
        this.M = v8;
        this.N = list4;
        this.O = s7;
        this.P = intent0;
        this.Q = list5;
    }

    @Deprecated
    public GoogleHelp(String s) {
        this(23, s, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 3, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false, 200, null, false, null, false, null, false, new ArrayList(), null, 0, 0, new ArrayList(), null, null, new ArrayList());
    }

    public final Intent a() {
        return new Intent("com.google.android.gms.googlehelp.HELP").setPackage("com.google.android.gms").putExtra("EXTRA_GOOGLE_HELP", this);
    }

    public final void b(Context context0) {
        this.f = "Google Settings";
        this.g = BitmapFactory.decodeResource(context0.getResources(), 0x7F08032C);
    }

    public final void c() {
        this.y = null;
    }

    public final void d(FeedbackOptions feedbackOptions0, File file0) {
        this.S = feedbackOptions0.t;
        ErrorReport errorReport0 = new ErrorReport(feedbackOptions0, file0);
        this.v = errorReport0;
        errorReport0.X = "GoogleHelp";
    }

    @Deprecated
    public final void e(Map map0) {
        this.d = new Bundle();
        for(Object object0: map0.entrySet()) {
            this.d.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.g(parcel0, 4, this.d, false);
        baub.e(parcel0, 5, this.h);
        baub.e(parcel0, 6, this.i);
        baub.x(parcel0, 7, this.j, false);
        baub.g(parcel0, 10, this.k, false);
        baub.t(parcel0, 11, this.l, v, false);
        baub.v(parcel0, 14, this.p, false);
        baub.t(parcel0, 15, this.q, v, false);
        baub.y(parcel0, 16, this.r, false);
        baub.o(parcel0, 17, 0);
        baub.y(parcel0, 18, this.t, false);
        baub.i(parcel0, 19, this.m, false);
        baub.o(parcel0, 20, this.n);
        baub.o(parcel0, 21, this.o);
        baub.e(parcel0, 22, this.u);
        baub.t(parcel0, 23, this.v, v, false);
        baub.t(parcel0, 25, this.s, v, false);
        baub.v(parcel0, 28, this.e, false);
        baub.t(parcel0, 0x1F, this.w, v, false);
        baub.o(parcel0, 0x20, this.x);
        baub.t(parcel0, 33, this.y, v, false);
        baub.v(parcel0, 34, this.f, false);
        baub.t(parcel0, 35, this.g, v, false);
        baub.o(parcel0, 36, this.z);
        baub.e(parcel0, 37, this.A);
        baub.e(parcel0, 38, this.B);
        baub.o(parcel0, 39, this.C);
        baub.v(parcel0, 40, this.D, false);
        baub.e(parcel0, 41, this.E);
        baub.v(parcel0, 42, this.F, false);
        baub.e(parcel0, 43, this.G);
        baub.t(parcel0, 44, this.H, v, false);
        baub.e(parcel0, 45, this.I);
        baub.y(parcel0, 46, this.J, false);
        baub.v(parcel0, 0x2F, this.K, false);
        baub.o(parcel0, 0x30, this.L);
        baub.o(parcel0, 49, this.M);
        baub.y(parcel0, 50, this.N, false);
        baub.v(parcel0, 51, this.O, false);
        baub.t(parcel0, 52, this.P, v, false);
        baub.x(parcel0, 53, this.Q, false);
        baub.c(parcel0, v1);
    }
}

