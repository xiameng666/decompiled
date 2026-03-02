package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import aqdh;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class SnapshotRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final ArrayList b;
    public final int c;
    public long d;

    static {
        SnapshotRequest.CREATOR = new aqdh();
    }

    public SnapshotRequest() {
        this.a = 10005;
        this.b = null;
        this.c = 0;
        this.d = 0L;
    }

    public SnapshotRequest(int v, ArrayList arrayList0, int v1) {
        this.a = v;
        this.b = arrayList0;
        this.c = v1;
        this.d = 0L;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SnapshotRequest)) {
            return false;
        }
        if(this.c != ((SnapshotRequest)object0).c) {
            return false;
        }
        if(this.a == ((SnapshotRequest)object0).a) {
            ArrayList arrayList0 = ((SnapshotRequest)object0).b;
            ArrayList arrayList1 = this.b;
            if(((arrayList1 == null ? 1 : 0) ^ (arrayList0 == null ? 1 : 0)) != 0) {
                return false;
            }
            if(arrayList1 != null) {
                if(arrayList1.size() != arrayList0.size()) {
                    return false;
                }
                int v = arrayList1.size();
                int v1 = 0;
                while(v1 < v) {
                    boolean z = arrayList0.contains(((BeaconStateImpl.TypeFilterImpl)arrayList1.get(v1)));
                    ++v1;
                    if(!z) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        ArrayList arrayList0 = this.b;
        int v = 0;
        if(arrayList0 != null) {
            int v1 = arrayList0.size();
            int v2 = 0;
            while(v < v1) {
                v2 += ((BeaconStateImpl.TypeFilterImpl)arrayList0.get(v)).hashCode() * 13;
                ++v;
            }
            v = v2;
        }
        return Arrays.hashCode(new Object[]{((int)this.a), v, ((int)this.c)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.y(parcel0, 3, this.b, false);
        baub.o(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

