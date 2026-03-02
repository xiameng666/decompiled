package com.google.android.gms.mdd;

import android.accounts.Account;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import cpvo;

public class OverrideFileGroupRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String[] c;
    public final String[] d;
    public final ParcelFileDescriptor[] e;
    public final Account f;

    static {
        OverrideFileGroupRequest.CREATOR = new cpvo();
    }

    public OverrideFileGroupRequest(String s, String s1, String[] arr_s, String[] arr_s1, ParcelFileDescriptor[] arr_parcelFileDescriptor, Account account0) {
        this.a = s;
        this.b = s1;
        this.c = arr_s;
        this.d = arr_s1;
        this.e = arr_parcelFileDescriptor;
        this.f = account0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.w(parcel0, 3, this.c, false);
        baub.w(parcel0, 4, this.d, false);
        baub.J(parcel0, 5, this.e, v);
        baub.t(parcel0, 6, this.f, v, false);
        baub.c(parcel0, v1);
    }
}

