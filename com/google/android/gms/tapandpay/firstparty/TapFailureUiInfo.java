package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import esmy;
import java.util.ArrayList;
import java.util.Arrays;

@Deprecated
public class TapFailureUiInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    static {
        TapFailureUiInfo.CREATOR = new esmy();
    }

    public TapFailureUiInfo(String s, String s1, String s2, String s3, long v) {
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = s3;
        this.e = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof TapFailureUiInfo) && bata.b(this.a, ((TapFailureUiInfo)object0).a) && bata.b(this.b, ((TapFailureUiInfo)object0).b) && bata.b(this.c, ((TapFailureUiInfo)object0).c) && bata.b(this.d, ((TapFailureUiInfo)object0).d) && bata.b(Long.valueOf(this.e), Long.valueOf(((TapFailureUiInfo)object0).e));
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, ((long)this.e)});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("errorMessage", this.a, arrayList0);
        basz.b("actionButtonLabel", this.b, arrayList0);
        basz.b("actionButtonIntentAction", this.c, arrayList0);
        basz.b("googleAnalyticsAction", this.d, arrayList0);
        basz.b("errorTimeoutOverrideMillis", Long.valueOf(this.e), arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.v(parcel0, 1, this.a, false);
        baub.v(parcel0, 2, this.b, false);
        baub.v(parcel0, 3, this.c, false);
        baub.v(parcel0, 4, this.d, false);
        baub.q(parcel0, 5, this.e);
        baub.c(parcel0, v1);
    }
}

