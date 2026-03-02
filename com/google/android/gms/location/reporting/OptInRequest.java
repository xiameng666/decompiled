package com.google.android.gms.location.reporting;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import cntq;
import cntr;
import cnug;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class OptInRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Account a;
    public final String b;
    public final String c;
    private final boolean d;

    static {
        OptInRequest.CREATOR = new cntr();
    }

    public OptInRequest(Account account0, String s, String s1, boolean z) {
        this.a = account0;
        this.b = s;
        this.c = s1;
        this.d = z;
    }

    public OptInRequest(cntq cntq0) {
        this.a = cntq0.a;
        this.b = cntq0.b;
        this.c = cntq0.c;
        this.d = false;
    }

    public final Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof OptInRequest) ? this.a.equals(((OptInRequest)object0).a) && bata.b(this.b, ((OptInRequest)object0).b) && bata.b(this.c, ((OptInRequest)object0).c) && bata.b(Boolean.valueOf(this.d), Boolean.valueOf(((OptInRequest)object0).d)) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Boolean.valueOf(this.d)});
    }

    @Override
    public final String toString() {
        return "UploadRequest{, account=" + cnug.a(this.a) + ", tag=\'" + this.b + ", auditToken=" + this.c + ", enableAdsSubconsent=" + this.d + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.a, v, false);
        baub.v(parcel0, 3, this.b, false);
        baub.v(parcel0, 4, this.c, false);
        baub.e(parcel0, 5, this.a().booleanValue());
        baub.c(parcel0, v1);
    }
}

