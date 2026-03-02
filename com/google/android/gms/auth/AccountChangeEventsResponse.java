package com.google.android.gms.auth;

import acrr;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    public final List b;

    static {
        AccountChangeEventsResponse.CREATOR = new acrr();
    }

    public AccountChangeEventsResponse(int v, List list0) {
        this.a = v;
        batl.s(list0);
        this.b = list0;
    }

    public AccountChangeEventsResponse(List list0) {
        this.a = 1;
        this.b = list0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.y(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

