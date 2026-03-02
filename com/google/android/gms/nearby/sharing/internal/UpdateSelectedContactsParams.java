package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azxq;
import azxs;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.sharing.Contact;
import dduu;
import java.util.Arrays;

public final class UpdateSelectedContactsParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public Contact[] a;
    public Contact[] b;
    public azxs c;

    static {
        UpdateSelectedContactsParams.CREATOR = new dduu();
    }

    private UpdateSelectedContactsParams() {
    }

    public UpdateSelectedContactsParams(Contact[] arr_contact, Contact[] arr_contact1, IBinder iBinder0) {
        azxs azxs0;
        if(iBinder0 == null) {
            azxs0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
        }
        super();
        this.a = arr_contact;
        this.b = arr_contact1;
        this.c = azxs0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof UpdateSelectedContactsParams) && Arrays.equals(this.a, ((UpdateSelectedContactsParams)object0).a) && Arrays.equals(this.b, ((UpdateSelectedContactsParams)object0).b) && bata.b(this.c, ((UpdateSelectedContactsParams)object0).c);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), Arrays.hashCode(this.b), this.c});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.J(parcel0, 1, this.a, v);
        baub.J(parcel0, 2, this.b, v);
        baub.D(parcel0, 3, this.c.asBinder());
        baub.c(parcel0, v1);
    }
}

