package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import crnq;
import crqa;
import java.util.ArrayList;
import java.util.List;

public class UploadBatchesCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final List a;

    static {
        UploadBatchesCriteria.CREATOR = new crqa();
    }

    public UploadBatchesCriteria(List list0) {
        this.a = list0;
    }

    public static UploadBatchesCriteria a(crnq[] arr_crnq) {
        ArrayList arrayList0 = new ArrayList(1);
        arrayList0.add(Integer.valueOf(arr_crnq[0].g));
        return new UploadBatchesCriteria(arrayList0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.E(parcel0, 1, this.a);
        baub.c(parcel0, v1);
    }
}

