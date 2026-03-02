package com.google.android.gms.autofill.service.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import aorl;
import aorm;
import aorn;
import aoro;
import bbcu;
import bboh;
import ggaf;
import gged_interceptors;
import j..util.Collection.-EL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class DetectionHistory extends AbstractDetectionHistory implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final bboh b;
    public static final Parcelable.Creator c;
    private final List d;

    static {
        DetectionHistory.b = bboh.b("DetectionHistory", bbcu.cD);
        DetectionHistory.CREATOR = new aorn();
        DetectionHistory.c = new aoro();
    }

    public DetectionHistory() {
        this.d = new ArrayList();
    }

    public DetectionHistory(gged_interceptors gged0) {
        this.d = new ArrayList();
        this.i(gged0);
    }

    public DetectionHistory(Collection collection0) {
        ArrayList arrayList0 = new ArrayList();
        this.d = arrayList0;
        arrayList0.addAll(collection0);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final gged_interceptors h() {
        return (gged_interceptors)Collection.-EL.stream(this.d).map(new aorm()).collect(ggaf.a);
    }

    @Override  // com.google.android.gms.autofill.service.common.IDetectionHistory
    public final void i(gged_interceptors gged0) {
        Collection collection0 = (Collection)Collection.-EL.stream(gged0).map(new aorl()).collect(ggaf.a);
        this.d.addAll(collection0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeTypedList(this.d);
    }
}

