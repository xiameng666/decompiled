package com.google.android.gms.pay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlji;
import java.util.Arrays;

public final class SortItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public long b;
    public String c;

    static {
        SortItem.CREATOR = new dlji();
    }

    public SortItem() {
    }

    public SortItem(String s, long v, String s1) {
        this.a = s;
        this.b = v;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SortItem) && bata.b(this.a, ((SortItem)object0).a) && bata.b(Long.valueOf(this.b), Long.valueOf(((SortItem)object0).b)) && bata.b(this.c, ((SortItem)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((long)this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.v(parcel0, 3, this.c, false);
        baub.c(parcel0, v1);
    }
}

