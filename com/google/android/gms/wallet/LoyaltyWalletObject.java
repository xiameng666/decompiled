package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import fawr;
import fcdn;
import java.util.ArrayList;

public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    String a;
    public String b;
    String c;
    String d;
    public String e;
    String f;
    String g;
    String h;
    @Deprecated
    String i;
    String j;
    int k;
    final ArrayList l;
    TimeInterval m;
    final ArrayList n;
    @Deprecated
    String o;
    @Deprecated
    String p;
    final ArrayList q;
    boolean r;
    final ArrayList s;
    final ArrayList t;
    final ArrayList u;
    public LoyaltyPoints v;

    static {
        LoyaltyWalletObject.CREATOR = new fawr();
    }

    LoyaltyWalletObject() {
        this.l = new ArrayList();
        this.n = new ArrayList();
        this.q = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
    }

    public LoyaltyWalletObject(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, int v, ArrayList arrayList0, TimeInterval timeInterval0, ArrayList arrayList1, String s10, String s11, ArrayList arrayList2, boolean z, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, LoyaltyPoints loyaltyPoints0) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
        this.h = s7;
        this.i = s8;
        this.j = s9;
        this.k = v;
        this.l = arrayList0;
        this.m = timeInterval0;
        this.n = arrayList1;
        this.o = s10;
        this.p = s11;
        this.q = arrayList2;
        this.r = z;
        this.s = arrayList3;
        this.t = arrayList4;
        this.u = arrayList5;
        this.v = loyaltyPoints0;
    }

    public final CommonWalletObject a() {
        fcdn fcdn0 = CommonWalletObject.a();
        fcdn0.a(this.a);
        fcdn0.a.b = this.j;
        fcdn0.a.c = this.d;
        fcdn0.a.d = this.c;
        fcdn0.a.e = this.f;
        fcdn0.a.f = this.g;
        fcdn0.a.g = this.h;
        fcdn0.a.h = this.i;
        fcdn0.a.i = this.k;
        fcdn0.a.j.addAll(this.l);
        fcdn0.a.k = this.m;
        fcdn0.a.l.addAll(this.n);
        fcdn0.a.m = this.o;
        fcdn0.a.n = this.p;
        fcdn0.a.o.addAll(this.q);
        fcdn0.a.p = this.r;
        fcdn0.a.q.addAll(this.s);
        fcdn0.a.r.addAll(this.t);
        fcdn0.a.s.addAll(this.u);
        return fcdn0.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.v(parcel0, 5, this.d, false);
        baub.v(parcel0, 6, this.e, false);
        baub.v(parcel0, 7, this.f, false);
        baub.v(parcel0, 8, this.g, false);
        baub.v(parcel0, 9, this.h, false);
        baub.v(parcel0, 10, this.i, false);
        baub.v(parcel0, 11, this.j, false);
        baub.o(parcel0, 12, this.k);
        baub.y(parcel0, 13, this.l, false);
        baub.t(parcel0, 14, this.m, v, false);
        baub.y(parcel0, 15, this.n, false);
        baub.v(parcel0, 16, this.o, false);
        baub.v(parcel0, 17, this.p, false);
        baub.y(parcel0, 18, this.q, false);
        baub.e(parcel0, 19, this.r);
        baub.y(parcel0, 20, this.s, false);
        baub.y(parcel0, 21, this.t, false);
        baub.y(parcel0, 22, this.u, false);
        baub.t(parcel0, 23, this.v, v, false);
        baub.c(parcel0, v1);
    }
}

