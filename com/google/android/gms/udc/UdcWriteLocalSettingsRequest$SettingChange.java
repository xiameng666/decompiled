package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezmg;

public class UdcWriteLocalSettingsRequest.SettingChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;

    static {
        UdcWriteLocalSettingsRequest.SettingChange.CREATOR = new ezmg();
    }

    public UdcWriteLocalSettingsRequest.SettingChange(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

