package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dleq;
import java.util.Arrays;

public final class GetPredefinedRotatingBarcodeValuesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public String b;
    public long c;
    public long d;

    static {
        GetPredefinedRotatingBarcodeValuesRequest.CREATOR = new dleq();
    }

    public GetPredefinedRotatingBarcodeValuesRequest() {
    }

    public GetPredefinedRotatingBarcodeValuesRequest(Account account0, String s, long v, long v1) {
        this.a = account0;
        this.b = s;
        this.c = v;
        this.d = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetPredefinedRotatingBarcodeValuesRequest) && bata.b(this.a, ((GetPredefinedRotatingBarcodeValuesRequest)object0).a) && bata.b(this.b, ((GetPredefinedRotatingBarcodeValuesRequest)object0).b) && bata.b(Long.valueOf(this.c), Long.valueOf(((GetPredefinedRotatingBarcodeValuesRequest)object0).c)) && bata.b(Long.valueOf(this.d), Long.valueOf(((GetPredefinedRotatingBarcodeValuesRequest)object0).d));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((long)this.c), ((long)this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.q(parcel0, 3, this.c);
        baub.q(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

