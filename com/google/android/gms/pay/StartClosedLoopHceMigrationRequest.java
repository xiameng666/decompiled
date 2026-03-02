package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dljk;
import java.util.Arrays;

public final class StartClosedLoopHceMigrationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public Account b;
    public SeTosMigrationOptions c;

    static {
        StartClosedLoopHceMigrationRequest.CREATOR = new dljk();
    }

    public StartClosedLoopHceMigrationRequest() {
    }

    public StartClosedLoopHceMigrationRequest(int v, Account account0, SeTosMigrationOptions seTosMigrationOptions0) {
        this.a = v;
        this.b = account0;
        this.c = seTosMigrationOptions0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof StartClosedLoopHceMigrationRequest) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((StartClosedLoopHceMigrationRequest)object0).a)) && bata.b(this.b, ((StartClosedLoopHceMigrationRequest)object0).b) && bata.b(this.c, ((StartClosedLoopHceMigrationRequest)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

