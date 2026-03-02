package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlca;
import java.util.Arrays;

public final class ChangeSePostpaidDefaultStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;
    public Account c;

    static {
        ChangeSePostpaidDefaultStatusRequest.CREATOR = new dlca();
    }

    public ChangeSePostpaidDefaultStatusRequest() {
    }

    public ChangeSePostpaidDefaultStatusRequest(String s, int v, Account account0) {
        this.a = s;
        this.b = v;
        this.c = account0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ChangeSePostpaidDefaultStatusRequest) && bata.b(this.a, ((ChangeSePostpaidDefaultStatusRequest)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((ChangeSePostpaidDefaultStatusRequest)object0).b)) && bata.b(this.c, ((ChangeSePostpaidDefaultStatusRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

