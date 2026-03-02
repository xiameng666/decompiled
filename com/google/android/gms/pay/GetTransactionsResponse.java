package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlfa;
import java.util.Arrays;

public final class GetTransactionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Transaction[] a;

    static {
        GetTransactionsResponse.CREATOR = new dlfa();
    }

    public GetTransactionsResponse() {
    }

    public GetTransactionsResponse(Transaction[] arr_transaction) {
        this.a = arr_transaction;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof GetTransactionsResponse) ? Arrays.equals(this.a, ((GetTransactionsResponse)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.c(parcel0, v1);
    }
}

