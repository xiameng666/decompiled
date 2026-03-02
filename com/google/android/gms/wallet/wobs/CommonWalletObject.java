package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fcdn;
import fcdo;
import java.util.ArrayList;

public class CommonWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    @Deprecated
    public String h;
    public int i;
    public final ArrayList j;
    public TimeInterval k;
    public final ArrayList l;
    @Deprecated
    public String m;
    @Deprecated
    public String n;
    public final ArrayList o;
    public boolean p;
    public final ArrayList q;
    public final ArrayList r;
    public final ArrayList s;

    static {
        CommonWalletObject.CREATOR = new fcdo();
    }

    public CommonWalletObject() {
        this.j = new ArrayList();
        this.l = new ArrayList();
        this.o = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
        this.s = new ArrayList();
    }

    public CommonWalletObject(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, int v, ArrayList arrayList0, TimeInterval timeInterval0, ArrayList arrayList1, String s8, String s9, ArrayList arrayList2, boolean z, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = s4;
        this.f = s5;
        this.g = s6;
        this.h = s7;
        this.i = v;
        this.j = arrayList0;
        this.k = timeInterval0;
        this.l = arrayList1;
        this.m = s8;
        this.n = s9;
        this.o = arrayList2;
        this.p = z;
        this.q = arrayList3;
        this.r = arrayList4;
        this.s = arrayList5;
    }

    public static fcdn a() {
        return new fcdn(new CommonWalletObject());
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
        baub.o(parcel0, 10, this.i);
        baub.y(parcel0, 11, this.j, false);
        baub.t(parcel0, 12, this.k, v, false);
        baub.y(parcel0, 13, this.l, false);
        baub.v(parcel0, 14, this.m, false);
        baub.v(parcel0, 15, this.n, false);
        baub.y(parcel0, 16, this.o, false);
        baub.e(parcel0, 17, this.p);
        baub.y(parcel0, 18, this.q, false);
        baub.y(parcel0, 19, this.r, false);
        baub.y(parcel0, 20, this.s, false);
        baub.c(parcel0, v1);
    }
}

