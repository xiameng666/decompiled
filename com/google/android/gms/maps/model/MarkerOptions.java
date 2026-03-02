package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View;
import baub;
import bjgu;
import bjgw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;
import cprm;
import cpsb;

public class MarkerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public LatLng a;
    public String b;
    public String c;
    public cprm d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public int p;
    public String q;
    private View r;

    static {
        MarkerOptions.CREATOR = new cpsb();
    }

    public MarkerOptions() {
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.o = 0;
    }

    public MarkerOptions(LatLng latLng0, String s, String s1, IBinder iBinder0, float f, float f1, boolean z, boolean z1, boolean z2, float f2, float f3, float f4, float f5, float f6, int v, IBinder iBinder1, int v1, String s2) {
        bjgw bjgw1;
        this.e = 0.5f;
        this.f = 1.0f;
        this.h = true;
        this.i = false;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.0f;
        this.m = 1.0f;
        this.o = 0;
        this.a = latLng0;
        this.b = s;
        this.c = s1;
        View view0 = null;
        if(iBinder0 == null) {
            this.d = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bjgw bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
            this.d = new cprm(bjgw0);
        }
        this.e = f;
        this.f = f1;
        this.g = z;
        this.h = z1;
        this.i = z2;
        this.j = f2;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        this.n = f6;
        this.p = v1;
        this.o = v;
        if(iBinder1 == null) {
            bjgw1 = null;
        }
        else {
            IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bjgw1 = (iInterface1 instanceof bjgw) ? ((bjgw)iInterface1) : new bjgu(iBinder1);
        }
        if(bjgw1 != null) {
            view0 = (View)ObjectWrapper.a(bjgw1);
        }
        this.r = view0;
        this.q = s2;
    }

    public final void a(LatLng latLng0) {
        if(latLng0 == null) {
            throw new IllegalArgumentException("latlng cannot be null - a position is required.");
        }
        this.a = latLng0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.D(parcel0, 5, (this.d == null ? null : this.d.a.asBinder()));
        baub.l(parcel0, 6, this.e);
        baub.l(parcel0, 7, this.f);
        baub.e(parcel0, 8, this.g);
        baub.e(parcel0, 9, this.h);
        baub.e(parcel0, 10, this.i);
        baub.l(parcel0, 11, this.j);
        baub.l(parcel0, 12, this.k);
        baub.l(parcel0, 13, this.l);
        baub.l(parcel0, 14, this.m);
        baub.l(parcel0, 15, this.n);
        baub.o(parcel0, 17, this.o);
        baub.D(parcel0, 18, new ObjectWrapper(this.r));
        baub.o(parcel0, 19, this.p);
        baub.v(parcel0, 20, this.q, false);
        baub.c(parcel0, v1);
    }
}

