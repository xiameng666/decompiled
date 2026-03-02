package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlkn;
import java.util.Arrays;

public final class UndigitizeTicketCentricProductRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public long b;
    public long c;
    public int d;

    static {
        UndigitizeTicketCentricProductRequest.CREATOR = new dlkn();
    }

    public UndigitizeTicketCentricProductRequest() {
    }

    public UndigitizeTicketCentricProductRequest(Account account0, long v, long v1, int v2) {
        this.a = account0;
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UndigitizeTicketCentricProductRequest) && bata.b(this.a, ((UndigitizeTicketCentricProductRequest)object0).a) && bata.b(Long.valueOf(this.b), Long.valueOf(((UndigitizeTicketCentricProductRequest)object0).b)) && bata.b(Long.valueOf(this.c), Long.valueOf(((UndigitizeTicketCentricProductRequest)object0).c)) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((UndigitizeTicketCentricProductRequest)object0).d));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((long)this.b), ((long)this.c), ((int)this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.q(parcel0, 2, this.b);
        baub.q(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

