package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import atte;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

public class MediaQueueContainerMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public int a;
    public String b;
    public List c;
    public List d;
    public double e;

    static {
        MediaQueueContainerMetadata.CREATOR = new atte();
    }

    public MediaQueueContainerMetadata() {
        this.a();
    }

    public MediaQueueContainerMetadata(int v, String s, List list0, List list1, double f) {
        this.a = v;
        this.b = s;
        this.c = list0;
        this.d = list1;
        this.e = f;
    }

    public MediaQueueContainerMetadata(MediaQueueContainerMetadata mediaQueueContainerMetadata0) {
        this.a = mediaQueueContainerMetadata0.a;
        this.b = mediaQueueContainerMetadata0.b;
        this.c = mediaQueueContainerMetadata0.c;
        this.d = mediaQueueContainerMetadata0.d;
        this.e = mediaQueueContainerMetadata0.e;
    }

    public final void a() {
        this.a = 0;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = 0.0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof MediaQueueContainerMetadata) ? this.a == ((MediaQueueContainerMetadata)object0).a && TextUtils.equals(this.b, ((MediaQueueContainerMetadata)object0).b) && bata.b(this.c, ((MediaQueueContainerMetadata)object0).c) && bata.b(this.d, ((MediaQueueContainerMetadata)object0).d) && this.e == ((MediaQueueContainerMetadata)object0).e : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.a), this.b, this.c, this.d, ((double)this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.v(parcel0, 3, this.b, false);
        List list0 = null;
        baub.y(parcel0, 4, (this.c == null ? null : DesugarCollections.unmodifiableList(this.c)), false);
        List list1 = this.d;
        if(list1 != null) {
            list0 = DesugarCollections.unmodifiableList(list1);
        }
        baub.y(parcel0, 5, list0, false);
        baub.j(parcel0, 6, this.e);
        baub.c(parcel0, v1);
    }
}

