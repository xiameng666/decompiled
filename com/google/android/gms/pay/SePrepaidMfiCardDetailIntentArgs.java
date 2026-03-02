package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlim;
import java.util.Arrays;

public final class SePrepaidMfiCardDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public SeServiceProvider a;
    public String b;

    static {
        SePrepaidMfiCardDetailIntentArgs.CREATOR = new dlim();
    }

    public SePrepaidMfiCardDetailIntentArgs() {
    }

    public SePrepaidMfiCardDetailIntentArgs(SeServiceProvider seServiceProvider0, String s) {
        this.a = seServiceProvider0;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SePrepaidMfiCardDetailIntentArgs) && bata.b(this.a, ((SePrepaidMfiCardDetailIntentArgs)object0).a) && bata.b(this.b, ((SePrepaidMfiCardDetailIntentArgs)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

