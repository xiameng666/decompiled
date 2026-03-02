package com.google.android.gms.tapandpay.internal.firstparty;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etby;

public final class GetAllCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final Account b;
    public int c;

    static {
        GetAllCardsRequest.CREATOR = new etby();
    }

    public GetAllCardsRequest() {
        this.a = true;
        this.b = null;
    }

    public GetAllCardsRequest(boolean z, Account account0, int v) {
        this.a = z;
        this.b = account0;
        this.c = v;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 2, this.a);
        baub.t(parcel0, 3, this.b, v, false);
        baub.o(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

