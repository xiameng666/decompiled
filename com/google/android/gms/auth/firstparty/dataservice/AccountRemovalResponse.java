package com.google.android.gms.auth.firstparty.dataservice;

import ajmu;
import ajpt;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public class AccountRemovalResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    final String b;

    static {
        AccountRemovalResponse.CREATOR = new ajmu();
    }

    public AccountRemovalResponse(int v, String s) {
        this.a = v;
        this.b = s;
    }

    public AccountRemovalResponse(ajpt ajpt0) {
        this.a = 1;
        batl.s(ajpt0);
        this.b = ajpt0.ak;
    }

    public final ajpt a() {
        return ajpt.a(this.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

