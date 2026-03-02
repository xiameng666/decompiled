package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eslr;
import java.util.ArrayList;
import java.util.Arrays;

public class InAppCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;

    static {
        InAppCvmConfig.CREATOR = new eslr();
    }

    public InAppCvmConfig(int v, int v1) {
        this.a = v;
        this.b = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof InAppCvmConfig) && this.a == ((InAppCvmConfig)object0).a && this.b == ((InAppCvmConfig)object0).b;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("cdcvmExpirationInSecs", Integer.valueOf(this.a), arrayList0);
        basz.b("cdcvmTransactionLimit", Integer.valueOf(this.b), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.c(parcel0, v1);
    }
}

