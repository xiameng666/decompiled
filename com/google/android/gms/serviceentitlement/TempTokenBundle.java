package com.google.android.gms.serviceentitlement;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eona;
import j..util.Objects;
import java.util.Locale;

public final class TempTokenBundle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final AuthenticationException b;

    static {
        TempTokenBundle.CREATOR = new eona();
    }

    public TempTokenBundle(String s, AuthenticationException authenticationException0) {
        this.a = s;
        this.b = authenticationException0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TempTokenBundle) && Objects.equals(this.a, ((TempTokenBundle)object0).a) && Objects.equals(this.b, ((TempTokenBundle)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        return String.format(Locale.ROOT, "TempTokenResult[tempToken=%s], authenticationException=%s]", this.a, this.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.c(parcel0, v1);
    }
}

