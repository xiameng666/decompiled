package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import elwr;
import ggna;
import java.util.List;

public class TimelinePath extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final List a;
    @Deprecated
    public final List b;
    public final Path c;

    static {
        TimelinePath.CREATOR = new elwr();
        TimelinePath.a = ggna.a;
    }

    public TimelinePath(List list0, Path path0) {
        this.b = list0;
        this.c = path0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.b, false);
        baub.t(parcel0, 2, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

