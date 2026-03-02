package com.google.android.gms.update;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import basz;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ezvt;
import java.util.ArrayList;
import java.util.Arrays;

public class UpdateInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final boolean a;
    private final String b;
    private final String c;
    private final String d;

    static {
        UpdateInfo.CREATOR = new ezvt();
    }

    public UpdateInfo(boolean z, String s, String s1, String s2) {
        this.a = z;
        this.b = s;
        this.c = s1;
        this.d = s2;
    }

    public final String a() {
        return this.a ? this.d : null;
    }

    public final String b() {
        return this.a ? this.b : null;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof UpdateInfo) ? this.a == ((UpdateInfo)object0).a && bata.b(this.b, ((UpdateInfo)object0).b) && bata.b(this.c, ((UpdateInfo)object0).c) && bata.b(this.d, ((UpdateInfo)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("metadataAvailable", Boolean.valueOf(this.a), arrayList0);
        basz.b("targetSdkLevel", this.b, arrayList0);
        basz.b("targetSecurityPatchLevel", this.c, arrayList0);
        basz.b("targetBuildFingerprint", this.d, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b(), false);
        baub.v(parcel0, 3, (this.a ? this.c : null), false);
        baub.v(parcel0, 4, this.a(), false);
        baub.c(parcel0, v1);
    }
}

