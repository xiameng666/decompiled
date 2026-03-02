package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import baub;
import bcwk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public class KeyFilterImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final ArrayList a;

    static {
        KeyFilterImpl.CREATOR = new bcwk();
    }

    public KeyFilterImpl(ArrayList arrayList0) {
        this.a = arrayList0;
    }

    public static boolean a(String s, String[] arr_s) {
        if(arr_s != null && arr_s.length != 0) {
            if(!TextUtils.isEmpty(s)) {
                for(int v = 0; v < arr_s.length; ++v) {
                    if(TextUtils.equals(arr_s[v], s)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof KeyFilterImpl) ? this.a.equals(((KeyFilterImpl)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 2, this.a, false);
        baub.c(parcel0, v1);
    }
}

