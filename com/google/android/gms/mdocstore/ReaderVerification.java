package com.google.android.gms.mdocstore;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cqxl;
import java.util.Arrays;

public final class ReaderVerification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public byte[] c;

    static {
        ReaderVerification.CREATOR = new cqxl();
    }

    private ReaderVerification() {
    }

    public ReaderVerification(int v, String s, byte[] arr_b) {
        this.a = v;
        this.b = s;
        this.c = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof ReaderVerification) && bata.b(Integer.valueOf(this.a), Integer.valueOf(((ReaderVerification)object0).a)) && bata.b(this.b, ((ReaderVerification)object0).b) && Arrays.equals(this.c, ((ReaderVerification)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, Arrays.hashCode(this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.i(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

