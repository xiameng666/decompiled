package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eomq;
import j..util.Objects;
import java.util.Locale;

public final class AuthenticationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    static {
        AuthenticationRequest.CREATOR = new eomq();
    }

    public AuthenticationRequest(int v, String s, int v1, String s1, String s2, String s3, String s4) {
        this.a = v;
        this.b = s;
        this.c = v1;
        this.d = s1;
        this.e = s2;
        this.f = s3;
        this.g = s4;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AuthenticationRequest) && this.a == ((AuthenticationRequest)object0).a && this.b.equals(((AuthenticationRequest)object0).b) && this.c == ((AuthenticationRequest)object0).c && this.d.equals(((AuthenticationRequest)object0).d) && this.e.equals(((AuthenticationRequest)object0).e) && this.f.equals(((AuthenticationRequest)object0).f) && this.g.equals(((AuthenticationRequest)object0).g);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), this.b, ((int)this.c), this.d, this.e, this.f, this.g});
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "AuthenticationRequest[carrierId=%d, appVersion=%s, slotIndex=%d, entitlementServerAddress=%s, entitlementVersion=%s, appId=%s, aesUrl=%s]", ((int)this.a), this.b, ((int)this.c), this.d, this.e, this.f, this.g);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.o(parcel0, 3, this.c);
        baub.v(parcel0, 4, this.d, false);
        baub.v(parcel0, 5, this.e, false);
        baub.v(parcel0, 6, this.f, false);
        baub.v(parcel0, 7, this.g, false);
        baub.c(parcel0, v1);
    }
}

