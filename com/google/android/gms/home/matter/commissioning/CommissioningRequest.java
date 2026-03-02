package com.google.android.gms.home.matter.commissioning;

import android.accounts.Account;
import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bwhd;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class CommissioningRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public final String b;
    public final DeviceInfo c;
    public final String d;
    public final String e;
    public final ComponentName f;
    public final boolean g;
    public final Long h;
    public final boolean i;
    public final String j;

    static {
        CommissioningRequest.CREATOR = new bwhd();
    }

    public CommissioningRequest(Account account0, String s, DeviceInfo deviceInfo0, String s1, String s2, ComponentName componentName0, boolean z, Long long0, boolean z1, String s3) {
        this.a = account0;
        this.b = s;
        this.c = deviceInfo0;
        this.d = s1;
        this.e = s2;
        this.f = componentName0;
        this.g = z;
        this.h = long0;
        this.i = z1;
        this.j = s3;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof CommissioningRequest) ? bata.b(this.a, ((CommissioningRequest)object0).a) && bata.b(this.b, ((CommissioningRequest)object0).b) && bata.b(this.c, ((CommissioningRequest)object0).c) && bata.b(this.d, ((CommissioningRequest)object0).d) && bata.b(this.e, ((CommissioningRequest)object0).e) && bata.b(this.f, ((CommissioningRequest)object0).f) && bata.b(Boolean.valueOf(this.g), Boolean.valueOf(((CommissioningRequest)object0).g)) && bata.b(this.h, ((CommissioningRequest)object0).h) && bata.b(Boolean.valueOf(this.i), Boolean.valueOf(((CommissioningRequest)object0).i)) && bata.b(this.j, ((CommissioningRequest)object0).j) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), this.h, Boolean.valueOf(this.i), this.j});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.e(parcel0, 7, this.g);
        baub.I(parcel0, 8, this.h);
        baub.e(parcel0, 9, this.i);
        baub.v(parcel0, 10, this.j, false);
        baub.c(parcel0, v1);
    }
}

