package com.google.android.gms.auth.account.demoaccount;

import adns;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class SetUpDemoAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final int c;

    static {
        SetUpDemoAccountResponse.CREATOR = new adns();
    }

    public SetUpDemoAccountResponse(int v, String s, int v1) {
        this.a = v;
        this.b = s;
        this.c = v1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

