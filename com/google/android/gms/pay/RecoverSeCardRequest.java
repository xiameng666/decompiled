package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlho;
import java.util.Arrays;

public final class RecoverSeCardRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public SeServiceProvider a;
    public String b;
    public Account c;

    static {
        RecoverSeCardRequest.CREATOR = new dlho();
    }

    public RecoverSeCardRequest() {
    }

    public RecoverSeCardRequest(SeServiceProvider seServiceProvider0, String s, Account account0) {
        this.a = seServiceProvider0;
        this.b = s;
        this.c = account0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RecoverSeCardRequest) && bata.b(this.a, ((RecoverSeCardRequest)object0).a) && bata.b(this.b, ((RecoverSeCardRequest)object0).b) && bata.b(this.c, ((RecoverSeCardRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

