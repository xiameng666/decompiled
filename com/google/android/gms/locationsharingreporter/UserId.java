package com.google.android.gms.locationsharingreporter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import cocp;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.Objects;

public class UserId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;

    static {
        UserId.CREATOR = new cocp();
    }

    public UserId(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof UserId) && Objects.equals(this.a, ((UserId)object0).a) && this.b == ((UserId)object0).b;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, ((int)this.b)});
    }

    @Override
    public final String toString() {
        return "UserId [id=" + this.a + ", idType=" + this.b + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

