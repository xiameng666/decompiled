package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezmu;

@Deprecated
public class UdcSettingsListActivityRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;

    static {
        UdcSettingsListActivityRequest.CREATOR = new ezmu();
    }

    public UdcSettingsListActivityRequest(String s, boolean z) {
        this.a = s;
        this.b = z;
    }

    public final boolean a() {
        return this.a != null;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.e(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

