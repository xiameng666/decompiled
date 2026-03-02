package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bjgu;
import bjgw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cprm;
import cpsj;

public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    protected final cprm a;

    static {
        StampStyle.CREATOR = new cpsj();
    }

    public StampStyle(IBinder iBinder0) {
        bjgw bjgw0;
        if(iBinder0 == null) {
            bjgw0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bjgw0 = (iInterface0 instanceof bjgw) ? ((bjgw)iInterface0) : new bjgu(iBinder0);
        }
        this.a = new cprm(bjgw0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 2, this.a.a.asBinder());
        baub.c(parcel0, v1);
    }
}

