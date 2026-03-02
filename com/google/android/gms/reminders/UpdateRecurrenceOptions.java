package com.google.android.gms.reminders;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejtd;

public class UpdateRecurrenceOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final boolean b;
    public final Long c;

    static {
        UpdateRecurrenceOptions.CREATOR = new ejtd();
        new UpdateRecurrenceOptions(null, null, null);
    }

    public UpdateRecurrenceOptions(Integer integer0, Boolean boolean0, Long long0) {
        boolean z = false;
        batl.c(integer0 == null || (((int)integer0) == 0 || ((int)integer0) == 1), "Invalid update mode");
        this.a = integer0 == null ? 0 : ((int)integer0);
        if(boolean0 != null) {
            z = boolean0.booleanValue();
        }
        this.b = z;
        this.c = long0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 2, this.a);
        baub.e(parcel0, 3, this.b);
        baub.I(parcel0, 4, this.c);
        baub.c(parcel0, v1);
    }
}

