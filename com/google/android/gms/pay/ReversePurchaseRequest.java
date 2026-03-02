package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhv;
import java.util.Arrays;

public final class ReversePurchaseRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public int b;
    public long c;
    public long d;
    public ProtoSafeParcelable e;

    static {
        ReversePurchaseRequest.CREATOR = new dlhv();
    }

    public ReversePurchaseRequest() {
    }

    public ReversePurchaseRequest(Account account0, int v, long v1, long v2, ProtoSafeParcelable protoSafeParcelable0) {
        this.a = account0;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = protoSafeParcelable0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ReversePurchaseRequest) && bata.b(this.a, ((ReversePurchaseRequest)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((ReversePurchaseRequest)object0).b)) && bata.b(Long.valueOf(this.c), Long.valueOf(((ReversePurchaseRequest)object0).c)) && bata.b(Long.valueOf(this.d), Long.valueOf(((ReversePurchaseRequest)object0).d)) && bata.b(this.e, ((ReversePurchaseRequest)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), ((long)this.c), ((long)this.d), this.e});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.q(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.t(parcel0, 5, this.e, v, false);
        baub.c(parcel0, v1);
    }
}

