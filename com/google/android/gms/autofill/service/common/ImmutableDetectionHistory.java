package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import aort;
import aoru;
import aorv;
import bbcu;
import bboh;
import ggaf;
import gged_interceptors;
import j..util.Collection.-EL;

public final class ImmutableDetectionHistory extends AbstractDetectionHistory implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final bboh b;
    private final gged_interceptors c;

    static {
        ImmutableDetectionHistory.b = bboh.b("ImmutableDetectionHistory", bbcu.cD);
        ImmutableDetectionHistory.CREATOR = new aorv();
    }

    public ImmutableDetectionHistory(gged_interceptors gged0) {
        this.c = gged0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final gged_interceptors h() {
        return (gged_interceptors)Collection.-EL.stream(this.c).map(new aoru()).collect(ggaf.a);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final void i(gged_interceptors gged0) {
    }

    public static final ImmutableDetectionHistory j(IDetectionHistory iDetectionHistory0) {
        return (iDetectionHistory0 instanceof ImmutableDetectionHistory) ? ((ImmutableDetectionHistory)iDetectionHistory0) : new ImmutableDetectionHistory(((gged_interceptors)Collection.-EL.stream(iDetectionHistory0.h()).map(new aort()).collect(ggaf.a)));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeTypedList(this.c);
    }
}

