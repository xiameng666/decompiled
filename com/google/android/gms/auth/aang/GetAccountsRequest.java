package com.google.android.gms.auth.aang;

import actm;
import actn;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class GetAccountsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final List b;
    public final List c;
    public final boolean d;

    static {
        GetAccountsRequest.CREATOR = new actn();
    }

    public GetAccountsRequest(String s, List list0, List list1, boolean z) {
        this.a = s;
        this.b = list0;
        this.c = list1;
        this.d = z;
    }

    public static actm a() {
        actm actm0 = new actm();
        actm0.c = 1;
        return actm0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.x(parcel0, 2, this.b, false);
        baub.x(parcel0, 3, this.c, false);
        baub.e(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

