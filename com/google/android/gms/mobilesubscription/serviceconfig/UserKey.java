package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import csnp;
import java.util.Arrays;

public final class UserKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Long a;
    public AuthType b;
    public String c;
    public Long d;

    static {
        UserKey.CREATOR = new csnp();
    }

    private UserKey() {
    }

    public UserKey(Long long0, AuthType authType0, String s, Long long1) {
        this.a = long0;
        this.b = authType0;
        this.c = s;
        this.d = long1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UserKey) && bata.b(this.a, ((UserKey)object0).a) && bata.b(this.b, ((UserKey)object0).b) && bata.b(this.c, ((UserKey)object0).c) && bata.b(this.d, ((UserKey)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.I(parcel0, 1, this.a);
        baub.t(parcel0, 2, this.b, v, false);
        baub.v(parcel0, 3, this.c, false);
        baub.I(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

