package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eslt;
import java.util.ArrayList;
import java.util.Arrays;

public class InStoreCvmConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    static {
        InStoreCvmConfig.CREATOR = new eslt();
    }

    public InStoreCvmConfig(boolean z, int v, int v1, int v2, boolean z1) {
        this.a = z;
        this.b = v;
        this.c = v1;
        this.d = v2;
        this.e = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof InStoreCvmConfig) && this.a == ((InStoreCvmConfig)object0).a && this.b == ((InStoreCvmConfig)object0).b && this.d == ((InStoreCvmConfig)object0).d && this.c == ((InStoreCvmConfig)object0).c && this.e == ((InStoreCvmConfig)object0).e;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), ((int)this.b), ((int)this.d), ((int)this.c), Boolean.valueOf(this.e)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("requireCdcvmPassing", Boolean.valueOf(this.a), arrayList0);
        basz.b("cdcvmExpirationInSecs", Integer.valueOf(this.b), arrayList0);
        basz.b("unlockedTapLimit", Integer.valueOf(this.c), arrayList0);
        basz.b("cdcvmTapLimit", Integer.valueOf(this.d), arrayList0);
        basz.b("prioritizeOnlinePinOverCdcvm", Boolean.valueOf(this.e), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.o(parcel0, 4, this.c);
        baub.o(parcel0, 5, this.d);
        baub.e(parcel0, 6, this.e);
        baub.c(parcel0, v1);
    }
}

