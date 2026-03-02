package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlgf;
import java.util.Arrays;

public final class MdocIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public int b;

    static {
        MdocIntentArgs.CREATOR = new dlgf();
    }

    public MdocIntentArgs() {
    }

    public MdocIntentArgs(String s, int v) {
        this.a = s;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof MdocIntentArgs) && bata.b(this.a, ((MdocIntentArgs)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((MdocIntentArgs)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.o(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

