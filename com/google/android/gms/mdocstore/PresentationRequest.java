package com.google.android.gms.mdocstore;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cqxj;
import java.util.Arrays;

public final class PresentationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public DocumentRequest[] a;

    static {
        PresentationRequest.CREATOR = new cqxj();
    }

    private PresentationRequest() {
    }

    public PresentationRequest(DocumentRequest[] arr_documentRequest) {
        this.a = arr_documentRequest;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof PresentationRequest) ? Arrays.equals(this.a, ((PresentationRequest)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.c(parcel0, v1);
    }
}

