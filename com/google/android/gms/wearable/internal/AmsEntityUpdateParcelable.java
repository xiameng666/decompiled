package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdez;

public class AmsEntityUpdateParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte a;
    public final byte b;
    public final String c;

    static {
        AmsEntityUpdateParcelable.CREATOR = new fdez();
    }

    public AmsEntityUpdateParcelable(byte b, byte b1, String s) {
        this.a = b;
        this.b = b1;
        this.c = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && this.getClass() == object0.getClass()) {
            if(this.a != ((AmsEntityUpdateParcelable)object0).a) {
                return false;
            }
            return this.b == ((AmsEntityUpdateParcelable)object0).b ? this.c.equals(((AmsEntityUpdateParcelable)object0).c) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((this.a + 0x1F) * 0x1F + this.b) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "AmsEntityUpdateParcelable{, mEntityId=" + ((int)this.a) + ", mAttributeId=" + ((int)this.b) + ", mValue=\'" + this.c + "\'}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.h(parcel0, 2, this.a);
        baub.h(parcel0, 3, this.b);
        baub.v(parcel0, 4, this.c, false);
        baub.c(parcel0, v1);
    }
}

