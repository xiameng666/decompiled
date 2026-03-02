package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eoms;
import gged_interceptors;
import ggfp;
import j..util.Objects;
import java.util.List;
import java.util.Locale;

public final class AuthenticationToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final gged_interceptors b;
    public final long c;

    static {
        AuthenticationToken.CREATOR = new eoms();
    }

    public AuthenticationToken(String s, List list0, long v) {
        this.a = s;
        this.b = gged_interceptors.i(list0);
        this.c = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if((object0 instanceof AuthenticationToken) && this.a.equals(((AuthenticationToken)object0).a)) {
            gged_interceptors gged0 = ((AuthenticationToken)object0).b;
            return this.b.size() == gged0.size() && this.b.containsAll(gged0) && this.c == ((AuthenticationToken)object0).c;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        ggfp ggfp0 = ggfp.G(this.b);
        return Objects.hash(new Object[]{this.a, ggfp0, ((long)this.c)});
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "AuthenticationToken[token=%s, cookies=%s, validity=%d]", this.a, this.b, ((long)this.c));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.x(parcel0, 2, this.b, false);
        baub.q(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

