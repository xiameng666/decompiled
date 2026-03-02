package com.google.android.gms.semanticlocation;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elwn;
import ggna;
import java.util.Arrays;
import java.util.List;

public class SemanticLocationState extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final List a;
    public final List b;
    public final long c;
    public final DebugData d;

    static {
        SemanticLocationState.a = ggna.a;
        SemanticLocationState.CREATOR = new elwn();
    }

    public SemanticLocationState(List list0, long v, DebugData debugData0) {
        this.b = list0;
        this.c = v;
        this.d = debugData0;
    }

    public static SemanticLocationState a(Intent intent0) {
        return intent0 == null || !intent0.hasExtra("com.google.android.gms.semanticlocation.EXTRA_SEMANTIC_LOCATION_STATE") ? null : ((SemanticLocationState)intent0.getParcelableExtra("com.google.android.gms.semanticlocation.EXTRA_SEMANTIC_LOCATION_STATE"));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SemanticLocationState) ? bata.b(this.b, ((SemanticLocationState)object0).b) && bata.b(Long.valueOf(this.c), Long.valueOf(((SemanticLocationState)object0).c)) && bata.b(this.d, ((SemanticLocationState)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, ((long)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.b, false);
        baub.q(parcel0, 2, this.c);
        baub.t(parcel0, 3, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

