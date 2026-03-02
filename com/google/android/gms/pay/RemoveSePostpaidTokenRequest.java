package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhs;
import java.util.Arrays;

public final class RemoveSePostpaidTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public Account b;

    static {
        RemoveSePostpaidTokenRequest.CREATOR = new dlhs();
    }

    public RemoveSePostpaidTokenRequest() {
    }

    public RemoveSePostpaidTokenRequest(String s, Account account0) {
        this.a = s;
        this.b = account0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof RemoveSePostpaidTokenRequest) && bata.b(this.a, ((RemoveSePostpaidTokenRequest)object0).a) && bata.b(this.b, ((RemoveSePostpaidTokenRequest)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

