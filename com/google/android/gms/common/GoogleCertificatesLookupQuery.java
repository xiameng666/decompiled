package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azqa;
import baub;
import bjgu;
import bjgw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.ObjectWrapper;

public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Context d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    static {
        GoogleCertificatesLookupQuery.CREATOR = new azqa();
    }

    public GoogleCertificatesLookupQuery(String s, boolean z, boolean z1, IBinder iBinder0, boolean z2, boolean z3, boolean z4) {
        bjgw bjgw0;
        this.a = s;
        this.b = z;
        this.c = z1;
        if(iBinder0 == null) {
            bjgw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
        }
        this.d = (Context)ObjectWrapper.a(bjgw0);
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.D(parcel0, 4, new ObjectWrapper(this.d));
        baub.e(parcel0, 5, this.e);
        baub.e(parcel0, 6, this.f);
        baub.e(parcel0, 8, this.g);
        baub.c(parcel0, v1);
    }
}

