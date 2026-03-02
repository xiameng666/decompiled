package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import evro;

public class SettingsLookupResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;

    static {
        SettingsLookupResult.CREATOR = new evro();
    }

    public SettingsLookupResult(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    public SettingsLookupResult(boolean z) {
        this.a = 1;
        this.b = z;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

