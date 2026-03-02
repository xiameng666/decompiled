package com.google.android.gms.fido.fido2.api.common;

import ByteString;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bbmu;
import bmid;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import hhrn;
import hhrs;
import java.util.Arrays;

public class HmacSecretExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final hhrs a;
    public static final hhrs b;
    public static final hhrs c;
    public static final hhrs d;
    public final ByteString e;
    public final ByteString f;
    public final ByteString g;
    public final int h;

    static {
        HmacSecretExtension.CREATOR = new bmid();
        HmacSecretExtension.a = new hhrn(1L);
        HmacSecretExtension.b = new hhrn(2L);
        HmacSecretExtension.c = new hhrn(3L);
        HmacSecretExtension.d = new hhrn(4L);
    }

    public HmacSecretExtension(ByteString hfsf0, ByteString hfsf1, ByteString hfsf2, int v) {
        this.e = hfsf0;
        this.f = hfsf1;
        this.g = hfsf2;
        this.h = v;
    }

    public final byte[] a() {
        return this.e == null ? null : this.e.toByteArray();
    }

    public final byte[] b() {
        return this.g == null ? null : this.g.toByteArray();
    }

    public final byte[] c() {
        return this.f == null ? null : this.f.toByteArray();
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof HmacSecretExtension) ? bata.b(this.e, ((HmacSecretExtension)object0).e) && bata.b(this.f, ((HmacSecretExtension)object0).f) && bata.b(this.g, ((HmacSecretExtension)object0).g) && this.h == ((HmacSecretExtension)object0).h : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f, this.g, ((int)this.h)});
    }

    @Override
    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + bbmu.c(this.a()) + ", saltEnc=" + bbmu.c(this.c()) + ", saltAuth=" + bbmu.c(this.b()) + ", getPinUvAuthProtocol=" + this.h + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a(), false);
        baub.i(parcel0, 2, this.c(), false);
        baub.i(parcel0, 3, this.b(), false);
        baub.o(parcel0, 4, this.h);
        baub.c(parcel0, v1);
    }
}

