package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azpn;
import barg;
import barw;
import barx;
import bary;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collection;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Scope[] a;
    public static final Feature[] b;
    public final int c;
    public final int d;
    public int e;
    public String f;
    public IBinder g;
    public Scope[] h;
    public Bundle i;
    public Account j;
    public Feature[] k;
    public Feature[] l;
    public boolean m;
    public int n;
    public boolean o;
    public String p;

    static {
        GetServiceRequest.CREATOR = new barg();
        GetServiceRequest.a = new Scope[0];
        GetServiceRequest.b = new Feature[0];
    }

    public GetServiceRequest(int v) {
        this(v, null);
    }

    public GetServiceRequest(int v, int v1, int v2, String s, IBinder iBinder0, Scope[] arr_scope, Bundle bundle0, Account account0, Feature[] arr_feature, Feature[] arr_feature1, boolean z, int v3, boolean z1, String s1) {
        if(arr_scope == null) {
            arr_scope = GetServiceRequest.a;
        }
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        if(arr_feature == null) {
            arr_feature = GetServiceRequest.b;
        }
        if(arr_feature1 == null) {
            arr_feature1 = GetServiceRequest.b;
        }
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = "com.google.android.gms".equals(s) ? "com.google.android.gms" : s;
        if(v < 2) {
            this.j = GetServiceRequest.c(iBinder0);
        }
        else {
            this.g = iBinder0;
            this.j = account0;
        }
        this.h = arr_scope;
        this.i = bundle0;
        this.k = arr_feature;
        this.l = arr_feature1;
        this.m = z;
        this.n = v3;
        this.o = z1;
        this.p = s1;
    }

    public GetServiceRequest(int v, String s) {
        Bundle bundle0 = new Bundle();
        this(6, v, azpn.c, null, null, GetServiceRequest.a, bundle0, null, GetServiceRequest.b, GetServiceRequest.b, true, 0, false, s);
    }

    public final Account a() {
        return GetServiceRequest.c(this.g);
    }

    public final void b(Collection collection0) {
        this.h = (Scope[])collection0.toArray(new Scope[0]);
    }

    private static Account c(IBinder iBinder0) {
        if(iBinder0 != null) {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return (iInterface0 instanceof bary) ? barx.c(((bary)iInterface0)) : barx.c(new barw(iBinder0));
        }
        return null;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        barg.a(this, parcel0, v);
    }
}

