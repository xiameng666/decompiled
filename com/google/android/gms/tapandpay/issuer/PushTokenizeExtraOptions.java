package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etiq;
import java.util.ArrayList;
import java.util.Arrays;

public final class PushTokenizeExtraOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final boolean b;
    public final String c;

    static {
        PushTokenizeExtraOptions.CREATOR = new etiq();
    }

    public PushTokenizeExtraOptions(boolean z, boolean z1, String s) {
        this.a = z;
        this.b = z1;
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof PushTokenizeExtraOptions) && this.a == ((PushTokenizeExtraOptions)object0).a && this.b == ((PushTokenizeExtraOptions)object0).b && bata.b(this.c, ((PushTokenizeExtraOptions)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("isBounceProvisioned", Boolean.valueOf(this.a), arrayList0);
        basz.b("enrollForVirtualCards", Boolean.valueOf(this.b), arrayList0);
        basz.b("accountLinkingData", this.c, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

