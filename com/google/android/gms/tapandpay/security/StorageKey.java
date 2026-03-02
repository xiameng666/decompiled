package com.google.android.gms.tapandpay.security;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import etvf;
import java.util.ArrayList;
import java.util.Arrays;

public final class StorageKey extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final byte[] b;

    static {
        StorageKey.CREATOR = new etvf();
    }

    public StorageKey(String s, byte[] arr_b) {
        this.a = s;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof StorageKey) && bata.b(this.a, ((StorageKey)object0).a) && Arrays.equals(this.b, ((StorageKey)object0).b);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("id", this.a, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.i(parcel0, 3, this.b, false);
        baub.c(parcel0, v1);
    }
}

