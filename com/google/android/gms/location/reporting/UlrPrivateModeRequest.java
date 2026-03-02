package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cntz;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class UlrPrivateModeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;

    static {
        UlrPrivateModeRequest.CREATOR = new cntz();
    }

    public UlrPrivateModeRequest(String s, boolean z) {
        this.a = s;
        this.b = z;
    }

    @Override
    public final String toString() {
        return "UlrPrivateModeRequest{Tag=\'" + this.a + ", privateMode=" + this.b + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

