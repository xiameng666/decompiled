package com.google.android.gms.auth.aang;

import acto;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

public final class GetAccountsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;
    public final List b;

    static {
        GetAccountsResponse.CREATOR = new acto();
    }

    public GetAccountsResponse(List list0, List list1) {
        this.a = list0;
        this.b = list1;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.a, false);
        baub.y(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

