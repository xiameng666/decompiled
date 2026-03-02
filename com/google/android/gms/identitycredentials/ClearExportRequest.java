package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import bxtz;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ibuq;
import java.util.List;

public final class ClearExportRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    public final List b;
    public final ClearRegistryRequest.ClearTypedRegistryOption c;

    static {
        ClearExportRequest.CREATOR = new bxtz();
    }

    public ClearExportRequest(boolean z, List list0) {
        ibuq.f(list0, "registryIds");
        super();
        this.a = z;
        this.b = list0;
        this.c = new ClearRegistryRequest.ClearTypedRegistryOption(z, "androidx.identitycredentials.TYPE_CREDENTIALS_SYNC", false, list0);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ibuq.f(parcel0, "dest");
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.x(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

