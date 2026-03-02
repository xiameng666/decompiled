package com.google.android.gms.pay;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import dlhy;
import java.util.Arrays;

public final class SaveImagesForValuableRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public String[] b;
    public Account c;
    public boolean d;
    public String[] e;

    static {
        SaveImagesForValuableRequest.CREATOR = new dlhy();
    }

    public SaveImagesForValuableRequest() {
    }

    public SaveImagesForValuableRequest(String s, String[] arr_s, Account account0, boolean z, String[] arr_s1) {
        this.a = s;
        this.b = arr_s;
        this.c = account0;
        this.d = z;
        this.e = arr_s1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof SaveImagesForValuableRequest) && bata.b(this.a, ((SaveImagesForValuableRequest)object0).a) && Arrays.equals(this.b, ((SaveImagesForValuableRequest)object0).b) && bata.b(this.c, ((SaveImagesForValuableRequest)object0).c) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((SaveImagesForValuableRequest)object0).d)) && Arrays.equals(this.e, ((SaveImagesForValuableRequest)object0).e);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Arrays.hashCode(this.b), this.c, Boolean.valueOf(this.d), Arrays.hashCode(this.e)});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.w(parcel0, 2, this.b, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.e(parcel0, 4, this.d);
        baub.w(parcel0, 5, this.e, false);
        baub.c(parcel0, v1);
    }
}

