package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlct;
import java.util.Arrays;

public final class DeleteTicketCentricProductRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public long b;
    public int c;

    static {
        DeleteTicketCentricProductRequest.CREATOR = new dlct();
    }

    public DeleteTicketCentricProductRequest() {
    }

    public DeleteTicketCentricProductRequest(Account account0, long v, int v1) {
        this.a = account0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof DeleteTicketCentricProductRequest) && bata.b(this.a, ((DeleteTicketCentricProductRequest)object0).a) && bata.b(Long.valueOf(this.b), Long.valueOf(((DeleteTicketCentricProductRequest)object0).b)) && bata.b(Integer.valueOf(this.c), Integer.valueOf(((DeleteTicketCentricProductRequest)object0).c));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((long)this.b), ((int)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.q(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

