package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esnc;
import java.util.ArrayList;
import java.util.Arrays;

public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int a;
    final int b;
    public final int c;
    public final int d;

    static {
        TransactionInfo.CREATOR = new esnc();
    }

    public TransactionInfo(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TransactionInfo) && this.a == ((TransactionInfo)object0).a && this.b == ((TransactionInfo)object0).b && this.c == ((TransactionInfo)object0).c && this.d == ((TransactionInfo)object0).d;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), ((int)this.c), ((int)this.d)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("transactionDelivery", Integer.valueOf(this.a), arrayList0);
        basz.b("transactionLimit", Integer.valueOf(this.b), arrayList0);
        basz.b("supportedTransactions", Integer.valueOf(this.c), arrayList0);
        basz.b("deliveryPreference", Integer.valueOf(this.d), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.o(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.c(parcel0, v1);
    }
}

