package com.google.android.gms.romanesco.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ekfo;
import java.util.Arrays;

public class RestoreResultEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final int b;
    public final Status c;

    static {
        RestoreResultEntity.CREATOR = new ekfo();
    }

    public RestoreResultEntity(int v, int v1, Status status0) {
        this.a = v;
        this.b = v1;
        this.c = status0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof RestoreResultEntity)) {
            return false;
        }
        return this == object0 ? true : bata.b(Integer.valueOf(((RestoreResultEntity)object0).a), Integer.valueOf(this.a)) && bata.b(Integer.valueOf(((RestoreResultEntity)object0).b), Integer.valueOf(this.b)) && bata.b(((RestoreResultEntity)object0).c, this.c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), ((int)this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.o(parcel0, 3, this.b);
        baub.t(parcel0, 4, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

