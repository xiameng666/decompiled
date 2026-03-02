package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlex;
import java.util.Arrays;

public final class GetSortOrderRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public SortOrderInfo a;
    public Account b;

    static {
        GetSortOrderRequest.CREATOR = new dlex();
    }

    public GetSortOrderRequest() {
    }

    public GetSortOrderRequest(SortOrderInfo sortOrderInfo0, Account account0) {
        this.a = sortOrderInfo0;
        this.b = account0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetSortOrderRequest) && bata.b(this.a, ((GetSortOrderRequest)object0).a) && bata.b(this.b, ((GetSortOrderRequest)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

