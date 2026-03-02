package com.google.android.gms.multidevice;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import csrk;
import cteo;
import ibuq;
import java.util.List;

public final class XdFeatureListenerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final cteo a;

    static {
        XdFeatureListenerOptions.CREATOR = new csrk();
    }

    public XdFeatureListenerOptions(cteo cteo0) {
        this.a = cteo0;
    }

    public final List a() {
        List list0 = this.a.b;
        ibuq.e(list0, "getFeatureKeysList(...)");
        return list0;
    }

    public final boolean b() {
        return this.a.c;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a.toBytesArray(), false);
        baub.c(parcel0, v1);
    }
}

