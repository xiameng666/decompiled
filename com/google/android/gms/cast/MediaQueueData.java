package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import attf;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.Arrays;
import java.util.List;

public class MediaQueueData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String b;
    public int c;
    public String d;
    public MediaQueueContainerMetadata e;
    public int f;
    public List g;
    public int h;
    public long i;
    public boolean j;

    static {
        MediaQueueData.CREATOR = new attf();
    }

    public MediaQueueData() {
        this.a();
    }

    public MediaQueueData(MediaQueueData mediaQueueData0) {
        this.a = mediaQueueData0.a;
        this.b = mediaQueueData0.b;
        this.c = mediaQueueData0.c;
        this.d = mediaQueueData0.d;
        this.e = mediaQueueData0.e;
        this.f = mediaQueueData0.f;
        this.g = mediaQueueData0.g;
        this.h = mediaQueueData0.h;
        this.i = mediaQueueData0.i;
        this.j = mediaQueueData0.j;
    }

    public MediaQueueData(String s, String s1, int v, String s2, MediaQueueContainerMetadata mediaQueueContainerMetadata0, int v1, List list0, int v2, long v3, boolean z) {
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = s2;
        this.e = mediaQueueContainerMetadata0;
        this.f = v1;
        this.g = list0;
        this.h = v2;
        this.i = v3;
        this.j = z;
    }

    public final void a() {
        this.a = null;
        this.b = null;
        this.c = 0;
        this.d = null;
        this.f = 0;
        this.g = null;
        this.h = 0;
        this.i = -1L;
        this.j = false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof MediaQueueData) ? TextUtils.equals(this.a, ((MediaQueueData)object0).a) && TextUtils.equals(this.b, ((MediaQueueData)object0).b) && this.c == ((MediaQueueData)object0).c && TextUtils.equals(this.d, ((MediaQueueData)object0).d) && bata.b(this.e, ((MediaQueueData)object0).e) && this.f == ((MediaQueueData)object0).f && bata.b(this.g, ((MediaQueueData)object0).g) && this.h == ((MediaQueueData)object0).h && this.i == ((MediaQueueData)object0).i && this.j == ((MediaQueueData)object0).j : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, ((int)this.c), this.d, this.e, ((int)this.f), this.g, ((int)this.h), ((long)this.i), Boolean.valueOf(this.j)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 2, this.a, false);
        baub.v(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.v(parcel0, 5, this.d, false);
        baub.t(parcel0, 6, this.e, v, false);
        baub.o(parcel0, 7, this.f);
        baub.y(parcel0, 8, (this.g == null ? null : DesugarCollections.unmodifiableList(this.g)), false);
        baub.o(parcel0, 9, this.h);
        baub.q(parcel0, 10, this.i);
        baub.e(parcel0, 11, this.j);
        baub.c(parcel0, v1);
    }
}

