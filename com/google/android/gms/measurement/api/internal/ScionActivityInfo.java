package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crbe;
import j..util.Objects;

public class ScionActivityInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;
    public final Intent c;

    static {
        ScionActivityInfo.CREATOR = new crbe();
    }

    public ScionActivityInfo(int v, String s, Intent intent0) {
        this.a = v;
        this.b = s;
        this.c = intent0;
    }

    public static ScionActivityInfo a(Activity activity0) {
        return new ScionActivityInfo(activity0.hashCode(), activity0.getClass().getCanonicalName(), activity0.getIntent());
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ScionActivityInfo) ? this.a == ((ScionActivityInfo)object0).a && Objects.equals(this.b, ((ScionActivityInfo)object0).b) && Objects.equals(this.c, ((ScionActivityInfo)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

