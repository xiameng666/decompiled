package com.google.android.gms.mdocstore;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cqwg;
import java.util.Arrays;

public final class DataElement extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public boolean b;

    static {
        DataElement.CREATOR = new cqwg();
    }

    private DataElement() {
    }

    public DataElement(String s, boolean z) {
        this.a = s;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof DataElement) && bata.b(this.a, ((DataElement)object0).a) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((DataElement)object0).b));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.e(parcel0, 2, this.b);
        baub.c(parcel0, v1);
    }
}

