package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ethg;
import java.util.ArrayList;
import java.util.Arrays;

public final class CobadgedTokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final boolean c;

    static {
        CobadgedTokenInfo.CREATOR = new ethg();
    }

    public CobadgedTokenInfo(int v, int v1, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof CobadgedTokenInfo) && this.a == ((CobadgedTokenInfo)object0).a && this.b == ((CobadgedTokenInfo)object0).b && this.c == ((CobadgedTokenInfo)object0).c;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), Boolean.valueOf(this.c)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("auxiliaryTokenServiceProvider", Integer.valueOf(this.a), arrayList0);
        basz.b("auxiliaryNetwork", Integer.valueOf(this.b), arrayList0);
        basz.b("presentAuxiliaryTokenFirst", Boolean.valueOf(this.c), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.o(parcel0, 2, this.b);
        baub.e(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

