package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import evrq;

public class UpdateSpamSettingsOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;

    static {
        UpdateSpamSettingsOptions.CREATOR = new evrq();
    }

    public UpdateSpamSettingsOptions(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

