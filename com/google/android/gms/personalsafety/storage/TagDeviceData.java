package com.google.android.gms.personalsafety.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import eikh;
import gfqz;
import j..util.Objects;

public class TagDeviceData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final Integer c;

    static {
        TagDeviceData.CREATOR = new eikh();
    }

    public TagDeviceData(int v, String s) {
        this(v, s, null);
    }

    public TagDeviceData(int v, String s, Integer integer0) {
        this.a = v;
        this.b = s;
        this.c = integer0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TagDeviceData) && this.a == ((TagDeviceData)object0).a && gfqz.e(this.b, ((TagDeviceData)object0).b);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), this.b});
    }

    @Override
    public final String toString() {
        return String.format("Device data:<Device Type: %s, Mac Address: %s>", ((int)this.a), this.b);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.F(parcel0, 3, this.c);
        baub.c(parcel0, v1);
    }
}

