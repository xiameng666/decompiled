package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dljb;
import java.util.Arrays;

public final class SetPassesUpdateNotificationsEnabledRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public boolean b;

    static {
        SetPassesUpdateNotificationsEnabledRequest.CREATOR = new dljb();
    }

    public SetPassesUpdateNotificationsEnabledRequest() {
    }

    public SetPassesUpdateNotificationsEnabledRequest(Account account0, boolean z) {
        this.a = account0;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SetPassesUpdateNotificationsEnabledRequest) && bata.b(this.a, ((SetPassesUpdateNotificationsEnabledRequest)object0).a) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((SetPassesUpdateNotificationsEnabledRequest)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

