package com.google.android.gms.smartdevice.d2d.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.smartdevice.d2d.ConnectionRequest;
import eqhv;
import eqih;
import eqik;

public class ConnectParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public eqik a;
    public ConnectionRequest b;
    public eqih c;

    static {
        ConnectParams.CREATOR = new eqhv();
    }

    private ConnectParams() {
    }

    public ConnectParams(eqik eqik0, ConnectionRequest connectionRequest0, eqih eqih0) {
        this.a = eqik0;
        this.b = connectionRequest0;
        this.c = eqih0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        IBinder iBinder0 = null;
        baub.D(parcel0, 1, (this.a == null ? null : this.a.asBinder()));
        baub.t(parcel0, 2, this.b, v, false);
        eqih eqih0 = this.c;
        if(eqih0 != null) {
            iBinder0 = eqih0.asBinder();
        }
        baub.D(parcel0, 3, iBinder0);
        baub.c(parcel0, v1);
    }
}

