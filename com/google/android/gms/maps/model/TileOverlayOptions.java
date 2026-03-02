package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cpsp;
import cptp;
import j..util.Objects;

public final class TileOverlayOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public float b;
    public boolean c;
    public float d;
    private cptp e;

    static {
        TileOverlayOptions.CREATOR = new cpsp();
    }

    public TileOverlayOptions() {
        this.a = true;
        this.c = true;
        this.d = 0.0f;
    }

    public TileOverlayOptions(IBinder iBinder0, boolean z, float f, boolean z1, float f1) {
        cptp cptp0;
        this.a = true;
        this.c = true;
        this.d = 0.0f;
        if(iBinder0 == null) {
            cptp0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            cptp0 = (iInterface0 instanceof cptp) ? ((cptp)iInterface0) : new cptp(iBinder0);
        }
        this.e = cptp0;
        if(cptp0 != null) {
            Objects.requireNonNull(this);
        }
        this.a = z;
        this.b = f;
        this.c = z1;
        this.d = f1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.D(parcel0, 2, (this.e == null ? null : this.e.a));
        baub.e(parcel0, 3, this.a);
        baub.l(parcel0, 4, this.b);
        baub.e(parcel0, 5, this.c);
        baub.l(parcel0, 6, this.d);
        baub.c(parcel0, v1);
    }
}

