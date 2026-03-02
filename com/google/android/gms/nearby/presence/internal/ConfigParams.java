package com.google.android.gms.nearby.presence.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dbah;
import gged_interceptors;
import ggna;
import java.util.Arrays;
import java.util.List;

public final class ConfigParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Account a;
    public String b;
    public List c;

    static {
        ConfigParams.CREATOR = new dbah();
    }

    public ConfigParams() {
        this.c = ggna.a;
    }

    public ConfigParams(Account account0, String s, List list0) {
        this.a = account0;
        this.b = s;
        this.c = gged_interceptors.i(list0);
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ConfigParams) && bata.b(this.a, ((ConfigParams)object0).a) && bata.b(this.b, ((ConfigParams)object0).b) && this.c.equals(((ConfigParams)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c.toString()});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.y(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

