package com.google.android.gms.findmydevice.spot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import bnim;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class GetKeychainLockScreenKnowledgeFactorSupportResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public boolean b;
    public Boolean c;
    public Boolean d;

    static {
        GetKeychainLockScreenKnowledgeFactorSupportResponse.CREATOR = new bnim();
    }

    public GetKeychainLockScreenKnowledgeFactorSupportResponse() {
    }

    public GetKeychainLockScreenKnowledgeFactorSupportResponse(boolean z, boolean z1, Boolean boolean0, Boolean boolean1) {
        this.a = z;
        this.b = z1;
        this.c = boolean0;
        this.d = boolean1;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof GetKeychainLockScreenKnowledgeFactorSupportResponse) && bata.b(Boolean.valueOf(this.a), Boolean.valueOf(((GetKeychainLockScreenKnowledgeFactorSupportResponse)object0).a)) && bata.b(Boolean.valueOf(this.b), Boolean.valueOf(((GetKeychainLockScreenKnowledgeFactorSupportResponse)object0).b)) && bata.b(this.c, ((GetKeychainLockScreenKnowledgeFactorSupportResponse)object0).c) && bata.b(this.d, ((GetKeychainLockScreenKnowledgeFactorSupportResponse)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.c, this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.e(parcel0, 1, this.a);
        baub.e(parcel0, 2, this.b);
        baub.z(parcel0, 3, this.c);
        baub.z(parcel0, 4, this.d);
        baub.c(parcel0, v1);
    }
}

