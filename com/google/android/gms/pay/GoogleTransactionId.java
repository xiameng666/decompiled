package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlfm;
import java.util.Arrays;

public final class GoogleTransactionId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;

    static {
        GoogleTransactionId.CREATOR = new dlfm();
    }

    public GoogleTransactionId() {
    }

    public GoogleTransactionId(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GoogleTransactionId) && bata.b(this.a, ((GoogleTransactionId)object0).a) && bata.b(this.b, ((GoogleTransactionId)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

