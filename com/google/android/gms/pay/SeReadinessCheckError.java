package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlin;
import java.util.Arrays;

public final class SeReadinessCheckError extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;

    static {
        SeReadinessCheckError.CREATOR = new dlin();
    }

    public SeReadinessCheckError() {
    }

    public SeReadinessCheckError(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SeReadinessCheckError) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((SeReadinessCheckError)object0).a)) && bata.b(this.b, ((SeReadinessCheckError)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

