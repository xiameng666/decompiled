package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.WorkSource;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import daso;
import j..util.Objects;
import java.util.Arrays;

public class DiscoveryOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final long b;
    public final boolean c;
    public final WorkSource d;
    private final int[] e;

    static {
        DiscoveryOptions.CREATOR = new daso();
    }

    public DiscoveryOptions(boolean z, long v, boolean z1, int[] arr_v, WorkSource workSource0) {
        this.a = z;
        this.b = v;
        this.c = z1;
        this.e = arr_v;
        if(workSource0 == null) {
            this.d = new WorkSource();
            return;
        }
        this.d = workSource0;
    }

    public final int[] a() {
        int[] arr_v = this.e;
        if(arr_v == null) {
            return null;
        }
        int[] arr_v1 = (int[])arr_v.clone();
        if(arr_v1 == null) {
            return null;
        }
        int[] arr_v2 = new int[arr_v1.length];
        for(int v = 0; v < arr_v1.length; ++v) {
            switch(arr_v1[v]) {
                case 4: {
                    arr_v2[v] = 4;
                    break;
                }
                case 5: {
                    arr_v2[v] = 5;
                    break;
                }
                default: {
                    arr_v2[v] = 0;
                }
            }
        }
        return arr_v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof DiscoveryOptions) ? this.a == ((DiscoveryOptions)object0).a && this.b == ((DiscoveryOptions)object0).b && this.c == ((DiscoveryOptions)object0).c && Arrays.equals(this.e, ((DiscoveryOptions)object0).e) && this.d.equals(((DiscoveryOptions)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        Integer integer0 = Arrays.hashCode(this.e);
        return Objects.hash(new Object[]{Boolean.valueOf(this.a), ((long)this.b), Boolean.valueOf(this.c), integer0, this.d});
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.e);
        return "DiscoveryOptions{localWifiOnly=" + this.a + ", rangingReportingIntervalMillis=" + this.b + ", requestAllMotions=" + this.c + ", discoveryMediums=" + s + ", workSource=" + this.d.toString() + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.q(parcel0, 2, this.b);
        baub.e(parcel0, 3, this.c);
        baub.p(parcel0, 4, this.a(), false);
        baub.t(parcel0, 5, this.d, v, false);
        baub.c(parcel0, v1);
    }
}

