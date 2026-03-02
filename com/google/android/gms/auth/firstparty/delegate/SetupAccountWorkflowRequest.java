package com.google.android.gms.auth.firstparty.delegate;

import ajoz;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.List;

public class SetupAccountWorkflowRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public boolean b;
    public boolean c;
    public List d;
    public final Bundle e;
    public final AppDescription f;
    public boolean g;
    public final String h;
    public AccountAuthenticatorResponse i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public ManagedAuthOptions t;
    public String u;
    @Deprecated
    public boolean v;
    public int w;
    public boolean x;

    static {
        SetupAccountWorkflowRequest.CREATOR = new ajoz();
    }

    public SetupAccountWorkflowRequest(int v, boolean z, boolean z1, List list0, Bundle bundle0, AppDescription appDescription0, boolean z2, String s, AccountAuthenticatorResponse accountAuthenticatorResponse0, boolean z3, boolean z4, String s1, String s2, String s3, String s4, boolean z5, boolean z6, boolean z7, boolean z8, ManagedAuthOptions managedAuthOptions0, String s5, boolean z9, int v1, boolean z10) {
        this.a = v;
        this.b = z;
        this.c = z1;
        this.d = list0;
        this.e = bundle0;
        batl.s(appDescription0);
        this.f = appDescription0;
        this.g = z2;
        this.h = s;
        this.i = accountAuthenticatorResponse0;
        this.j = z3;
        this.k = z4;
        this.l = s1;
        this.m = s2;
        this.n = s3;
        this.o = s4;
        this.p = z5;
        this.q = z6;
        this.r = z7;
        this.s = z8;
        this.t = managedAuthOptions0;
        this.u = s5;
        this.v = z9;
        this.w = v1;
        this.x = z10;
    }

    public SetupAccountWorkflowRequest(AppDescription appDescription0, String s) {
        this.a = 14;
        this.e = new Bundle();
        this.t = new ManagedAuthOptions();
        this.f = appDescription0;
        this.h = s;
    }

    public final Bundle a() {
        return new Bundle(this.e);
    }

    public final List b() {
        return this.d == null ? null : DesugarCollections.unmodifiableList(this.d);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.x(parcel0, 4, this.d, false);
        baub.g(parcel0, 5, this.e, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.e(parcel0, 7, this.g);
        baub.v(parcel0, 8, this.h, false);
        baub.t(parcel0, 9, this.i, v, false);
        baub.e(parcel0, 10, this.j);
        baub.e(parcel0, 11, this.k);
        baub.v(parcel0, 12, this.l, false);
        baub.v(parcel0, 13, this.m, false);
        baub.v(parcel0, 14, this.n, false);
        baub.v(parcel0, 15, this.o, false);
        baub.e(parcel0, 16, this.p);
        baub.e(parcel0, 17, this.q);
        baub.e(parcel0, 18, this.r);
        baub.e(parcel0, 19, this.s);
        baub.t(parcel0, 20, this.t, v, false);
        baub.v(parcel0, 21, this.u, false);
        baub.e(parcel0, 22, this.v);
        baub.o(parcel0, 23, this.w);
        baub.e(parcel0, 24, this.x);
        baub.c(parcel0, v1);
    }
}

