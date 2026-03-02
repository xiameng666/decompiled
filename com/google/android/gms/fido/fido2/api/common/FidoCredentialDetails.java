package com.google.android.gms.fido.fido2.api.common;

import ByteString;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bmhv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class FidoCredentialDetails extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final ByteString c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final Account g;
    public final boolean h;
    private final ByteString i;

    static {
        FidoCredentialDetails.CREATOR = new bmhv();
    }

    public FidoCredentialDetails(String s, String s1, ByteString hfsf0, ByteString hfsf1, boolean z, boolean z1, long v, Account account0, boolean z2) {
        this.a = s;
        this.b = s1;
        this.i = hfsf0;
        this.c = hfsf1;
        this.d = z;
        this.e = z1;
        this.f = v;
        this.g = account0;
        this.h = z2;
    }

    public final byte[] a() {
        return this.c.toByteArray();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof FidoCredentialDetails) ? bata.b(this.a, ((FidoCredentialDetails)object0).a) && bata.b(this.b, ((FidoCredentialDetails)object0).b) && bata.b(this.i, ((FidoCredentialDetails)object0).i) && bata.b(this.c, ((FidoCredentialDetails)object0).c) && this.d == ((FidoCredentialDetails)object0).d && this.e == ((FidoCredentialDetails)object0).e && this.h == ((FidoCredentialDetails)object0).h && this.f == ((FidoCredentialDetails)object0).f && bata.b(this.g, ((FidoCredentialDetails)object0).g) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.i, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h), ((long)this.f), this.g});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.i(parcel0, 3, (this.i == null ? null : this.i.toByteArray()), false);
        baub.i(parcel0, 4, this.a(), false);
        baub.e(parcel0, 5, this.d);
        baub.e(parcel0, 6, this.e);
        baub.q(parcel0, 7, this.f);
        baub.t(parcel0, 8, this.g, v, false);
        baub.e(parcel0, 9, this.h);
        baub.c(parcel0, v1);
    }
}

