package com.google.android.gms.auth.api.fido;

import ByteString;
import ahmy;
import ahmz;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class RegisteredCredentialData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final ByteString b;
    public final boolean c;

    static {
        RegisteredCredentialData.CREATOR = new ahmz();
    }

    public RegisteredCredentialData(String s, ByteString hfsf0, boolean z) {
        batl.t(s, "storage ID shouldn\'t be null");
        this.a = s;
        this.b = hfsf0;
        this.c = z;
    }

    public static ahmy a() {
        ahmy ahmy0 = new ahmy();
        ahmy0.c(false);
        return ahmy0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof RegisteredCredentialData) ? this.c == ((RegisteredCredentialData)object0).c && Objects.equals(this.a, ((RegisteredCredentialData)object0).a) && Objects.equals(this.b, ((RegisteredCredentialData)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, Boolean.valueOf(this.c), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, (this.b == null ? null : this.b.toByteArray()), false);
        baub.e(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

