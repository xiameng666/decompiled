package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fawl;

public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public int c;

    static {
        InstrumentInfo.CREATOR = new fawl();
    }

    public InstrumentInfo() {
    }

    public InstrumentInfo(String s, String s1, int v) {
        this.a = s;
        this.b = s1;
        this.c = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        int v2 = 0;
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        int v3 = this.c;
        if(v3 == 1 || v3 == 2 || v3 == 3) {
            v2 = v3;
        }
        baub.o(parcel0, 4, v2);
        baub.c(parcel0, v1);
    }
}

