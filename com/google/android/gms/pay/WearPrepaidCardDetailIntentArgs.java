package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlls;
import java.util.Arrays;

public final class WearPrepaidCardDetailIntentArgs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public ProtoSafeParcelable a;
    public int b;
    public byte[] c;

    static {
        WearPrepaidCardDetailIntentArgs.CREATOR = new dlls();
    }

    public WearPrepaidCardDetailIntentArgs() {
    }

    public WearPrepaidCardDetailIntentArgs(ProtoSafeParcelable protoSafeParcelable0, int v, byte[] arr_b) {
        this.a = protoSafeParcelable0;
        this.b = v;
        this.c = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof WearPrepaidCardDetailIntentArgs) && bata.b(this.a, ((WearPrepaidCardDetailIntentArgs)object0).a) && bata.b(Integer.valueOf(this.b), Integer.valueOf(((WearPrepaidCardDetailIntentArgs)object0).b)) && Arrays.equals(this.c, ((WearPrepaidCardDetailIntentArgs)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), Arrays.hashCode(this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.o(parcel0, 2, this.b);
        baub.i(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

