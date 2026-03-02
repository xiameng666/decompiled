package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import atto;
import aurs;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class VideoInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final aurs a;
    public final int b;
    public final int c;
    public final int d;

    static {
        VideoInfo.a = new aurs("VideoInfo");
        VideoInfo.CREATOR = new atto();
    }

    public VideoInfo(int v, int v1, int v2) {
        this.b = v;
        this.c = v1;
        this.d = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof VideoInfo) ? this.c == ((VideoInfo)object0).c && this.b == ((VideoInfo)object0).b && this.d == ((VideoInfo)object0).d : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.c), ((int)this.b), ((int)this.d)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.b);
        baub.o(parcel0, 3, this.c);
        baub.o(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

