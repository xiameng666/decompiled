package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eomp;
import j..util.Objects;
import java.util.Locale;

public final class AuthenticationException extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final String c;
    public final String d;

    static {
        AuthenticationException.CREATOR = new eomp();
    }

    public AuthenticationException(int v, int v1, String s, String s1) {
        this.a = v;
        this.b = v1;
        this.c = s;
        this.d = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof AuthenticationException) && this.a == ((AuthenticationException)object0).a && this.b == ((AuthenticationException)object0).b && this.c.equals(((AuthenticationException)object0).c) && this.d.equals(((AuthenticationException)object0).d);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), ((int)this.b), this.c, this.d});
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "AuthenticationException[errorCode=%d, httpStatusCode=%d, retryAfter=%s, message=%s]", ((int)this.a), ((int)this.b), this.c, this.d);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.c(parcel0, v1);
    }
}

