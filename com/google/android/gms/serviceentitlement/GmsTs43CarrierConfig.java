package com.google.android.gms.serviceentitlement;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eomt;
import j..util.Objects;
import java.util.Locale;

public final class GmsTs43CarrierConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final Network f;

    static {
        GmsTs43CarrierConfig.CREATOR = new eomt();
    }

    public GmsTs43CarrierConfig(String s, String s1, boolean z, int v, String s2, Network network0) {
        this.a = s;
        this.b = s1;
        this.c = z;
        this.d = v;
        this.e = s2;
        this.f = network0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof GmsTs43CarrierConfig) && Objects.equals(this.a, ((GmsTs43CarrierConfig)object0).a) && Objects.equals(this.b, ((GmsTs43CarrierConfig)object0).b) && this.c == ((GmsTs43CarrierConfig)object0).c && this.d == ((GmsTs43CarrierConfig)object0).d && Objects.equals(this.e, ((GmsTs43CarrierConfig)object0).e) && Objects.equals(this.f, ((GmsTs43CarrierConfig)object0).f);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, Boolean.valueOf(this.c), ((int)this.d), this.e, this.f});
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "GmsTs43CarrierConfig[serverUrl=%s, clientTs43=%s, useHttpPost=%b, timeoutInSec=%d, eapAkaRealm=%s]", this.a, this.b, Boolean.valueOf(this.c), ((int)this.d), this.e);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.e(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.v(parcel0, 5, this.e, false);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}

