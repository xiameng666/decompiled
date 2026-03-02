package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import csne;
import java.util.Arrays;

public final class CheckAuthStatusRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public ServiceType b;
    public Long c;
    public AuthType d;
    public String e;
    public Bundle f;

    static {
        CheckAuthStatusRequest.CREATOR = new csne();
    }

    public CheckAuthStatusRequest() {
    }

    public CheckAuthStatusRequest(String s, ServiceType serviceType0, Long long0, AuthType authType0, String s1, Bundle bundle0) {
        this.a = s;
        this.b = serviceType0;
        this.c = long0;
        this.d = authType0;
        this.e = s1;
        this.f = bundle0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CheckAuthStatusRequest) && bata.b(this.a, ((CheckAuthStatusRequest)object0).a) && bata.b(this.b, ((CheckAuthStatusRequest)object0).b) && bata.b(this.c, ((CheckAuthStatusRequest)object0).c) && bata.b(this.d, ((CheckAuthStatusRequest)object0).d) && bata.b(this.e, ((CheckAuthStatusRequest)object0).e) && bata.b(this.f, ((CheckAuthStatusRequest)object0).f);
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
        baub.I(parcel0, 3, this.c);
        baub.t(parcel0, 4, this.d, v, false);
        baub.v(parcel0, 5, this.e, false);
        baub.g(parcel0, 0x3F, this.f, false);
        baub.c(parcel0, v1);
    }
}

