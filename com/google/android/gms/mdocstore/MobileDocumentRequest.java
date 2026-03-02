package com.google.android.gms.mdocstore;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cqxd;
import java.util.Arrays;

public final class MobileDocumentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public DocumentFilter a;

    static {
        MobileDocumentRequest.CREATOR = new cqxd();
    }

    public MobileDocumentRequest() {
    }

    public MobileDocumentRequest(DocumentFilter documentFilter0) {
        this.a = documentFilter0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof MobileDocumentRequest) ? bata.b(this.a, ((MobileDocumentRequest)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 1, this.a, v, false);
        baub.c(parcel0, v1);
    }
}

