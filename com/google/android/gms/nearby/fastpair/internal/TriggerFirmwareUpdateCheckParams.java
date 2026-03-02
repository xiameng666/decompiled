package com.google.android.gms.nearby.fastpair.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cyid;
import cyif;
import cyja;
import java.util.Arrays;

public final class TriggerFirmwareUpdateCheckParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public byte[] a;
    public String b;
    public cyif c;
    public String d;

    static {
        TriggerFirmwareUpdateCheckParams.CREATOR = new cyja();
    }

    public TriggerFirmwareUpdateCheckParams() {
    }

    public TriggerFirmwareUpdateCheckParams(byte[] arr_b, String s, IBinder iBinder0, String s1) {
        cyif cyif0;
        if(iBinder0 == null) {
            cyif0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.nearby.fastpair.internal.IFastPairStatusCallback");
            cyif0 = (iInterface0 instanceof cyif) ? ((cyif)iInterface0) : new cyid(iBinder0);
        }
        super();
        this.a = arr_b;
        this.b = s;
        this.c = cyif0;
        this.d = s1;
    }

    public final IBinder a() {
        return this.c.asBinder();
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof TriggerFirmwareUpdateCheckParams) && Arrays.equals(this.a, ((TriggerFirmwareUpdateCheckParams)object0).a) && bata.b(this.b, ((TriggerFirmwareUpdateCheckParams)object0).b) && bata.b(this.c, ((TriggerFirmwareUpdateCheckParams)object0).c) && bata.b(this.d, ((TriggerFirmwareUpdateCheckParams)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b, this.c, this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.D(parcel0, 3, this.a());
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

