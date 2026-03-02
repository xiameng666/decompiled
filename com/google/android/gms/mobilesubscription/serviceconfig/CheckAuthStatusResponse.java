package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import csnf;
import java.util.Arrays;

public final class CheckAuthStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public CarrierInfo b;
    public AuthType c;
    public AuthStatus d;
    public UserKey e;
    public Bundle f;

    static {
        CheckAuthStatusResponse.CREATOR = new csnf();
    }

    public CheckAuthStatusResponse() {
    }

    public CheckAuthStatusResponse(String s, CarrierInfo carrierInfo0, AuthType authType0, AuthStatus authStatus0, UserKey userKey0, Bundle bundle0) {
        this.a = s;
        this.b = carrierInfo0;
        this.c = authType0;
        this.d = authStatus0;
        this.e = userKey0;
        this.f = bundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CheckAuthStatusResponse) && bata.b(this.a, ((CheckAuthStatusResponse)object0).a) && bata.b(this.b, ((CheckAuthStatusResponse)object0).b) && bata.b(this.c, ((CheckAuthStatusResponse)object0).c) && bata.b(this.d, ((CheckAuthStatusResponse)object0).d) && bata.b(this.e, ((CheckAuthStatusResponse)object0).e) && bata.b(this.f, ((CheckAuthStatusResponse)object0).f);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.t(parcel0, 5, this.e, v, false);
        baub.g(parcel0, 0x3F, this.f, false);
        baub.c(parcel0, v1);
    }
}

