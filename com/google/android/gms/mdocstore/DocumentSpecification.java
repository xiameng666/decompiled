package com.google.android.gms.mdocstore;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cqwn;
import java.util.Arrays;

public final class DocumentSpecification extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;

    static {
        DocumentSpecification.CREATOR = new cqwn();
    }

    public DocumentSpecification() {
    }

    public DocumentSpecification(int v) {
        this.a = v;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DocumentSpecification) ? bata.b(Integer.valueOf(this.a), Integer.valueOf(((DocumentSpecification)object0).a)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

