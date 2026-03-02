package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlev;
import java.util.Arrays;

public final class GetSePrepaidCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public SeServiceProvider b;
    public String c;
    public int d;
    public int e;

    static {
        GetSePrepaidCardRequest.CREATOR = new dlev();
    }

    public GetSePrepaidCardRequest() {
    }

    public GetSePrepaidCardRequest(Account account0, SeServiceProvider seServiceProvider0, String s, int v, int v1) {
        this.a = account0;
        this.b = seServiceProvider0;
        this.c = s;
        this.d = v;
        this.e = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetSePrepaidCardRequest) && bata.b(this.a, ((GetSePrepaidCardRequest)object0).a) && bata.b(this.b, ((GetSePrepaidCardRequest)object0).b) && bata.b(this.c, ((GetSePrepaidCardRequest)object0).c) && bata.b(Integer.valueOf(this.d), Integer.valueOf(((GetSePrepaidCardRequest)object0).d)) && bata.b(Integer.valueOf(this.e), Integer.valueOf(((GetSePrepaidCardRequest)object0).e));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, ((int)this.d), ((int)this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.o(parcel0, 4, this.d);
        baub.o(parcel0, 6, this.e);
        baub.c(parcel0, v1);
    }
}

