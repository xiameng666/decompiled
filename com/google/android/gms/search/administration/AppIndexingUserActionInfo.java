package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.ActionImpl;
import ekzc;

public class AppIndexingUserActionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public String a;
    public long b;
    public ActionImpl c;

    static {
        AppIndexingUserActionInfo.CREATOR = new ekzc();
    }

    public AppIndexingUserActionInfo() {
    }

    public AppIndexingUserActionInfo(String s, long v, ActionImpl actionImpl0) {
        this.a = s;
        this.b = v;
        this.c = actionImpl0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.q(parcel0, 2, this.b);
        baub.t(parcel0, 3, this.c, v, false);
        baub.c(parcel0, v1);
    }
}

