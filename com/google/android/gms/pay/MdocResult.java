package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlgg;
import java.util.Arrays;

public final class MdocResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public byte[] b;
    public EncryptionParameters c;

    static {
        MdocResult.CREATOR = new dlgg();
    }

    public MdocResult() {
    }

    public MdocResult(String s, byte[] arr_b, EncryptionParameters encryptionParameters0) {
        this.a = s;
        this.b = arr_b;
        this.c = encryptionParameters0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof MdocResult) && bata.b(this.a, ((MdocResult)object0).a) && Arrays.equals(this.b, ((MdocResult)object0).b) && bata.b(this.c, ((MdocResult)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.i(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

