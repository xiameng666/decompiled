package com.google.android.gms.contextmanager.fence.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import bauc;
import bcuf;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class FenceStateMapImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Map a;

    static {
        FenceStateMapImpl.CREATOR = new bcuf();
    }

    public FenceStateMapImpl(Bundle bundle0) {
        this.a = new HashMap();
        if(bundle0 != null) {
            for(Object object0: bundle0.keySet()) {
                byte[] arr_b = bundle0.getByteArray(((String)object0));
                batl.s(arr_b);
                FenceStateImpl fenceStateImpl0 = (FenceStateImpl)bauc.a(arr_b, FenceStateImpl.CREATOR);
                this.a.put(((String)object0), fenceStateImpl0);
            }
        }
    }

    public FenceStateMapImpl(Map map0) {
        this.a = map0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        Bundle bundle0;
        Map map0 = this.a;
        int v1 = baub.a(parcel0);
        if(map0 == null) {
            bundle0 = null;
        }
        else {
            Bundle bundle1 = new Bundle();
            for(Object object0: map0.entrySet()) {
                bundle1.putByteArray(((String)((Map.Entry)object0).getKey()), bauc.n(((FenceStateImpl)((Map.Entry)object0).getValue())));
            }
            bundle0 = bundle1;
        }
        baub.g(parcel0, 2, bundle0, false);
        baub.c(parcel0, v1);
    }
}

