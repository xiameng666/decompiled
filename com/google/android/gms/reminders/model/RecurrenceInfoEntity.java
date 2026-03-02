package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejur;
import java.util.Arrays;

public class RecurrenceInfoEntity extends AbstractSafeParcelable implements RecurrenceInfo {
    public static final Parcelable.Creator CREATOR;
    public final RecurrenceEntity a;
    public final String b;
    public final Boolean c;
    public final Boolean d;

    static {
        RecurrenceInfoEntity.CREATOR = new ejur();
    }

    public RecurrenceInfoEntity(RecurrenceEntity recurrenceEntity0, String s, Boolean boolean0, Boolean boolean1) {
        this.a = recurrenceEntity0;
        this.b = s;
        this.c = boolean0;
        this.d = boolean1;
    }

    public RecurrenceInfoEntity(RecurrenceInfo recurrenceInfo0) {
        Recurrence recurrence0 = recurrenceInfo0.a();
        String s = recurrenceInfo0.e();
        Boolean boolean0 = recurrenceInfo0.d();
        Boolean boolean1 = recurrenceInfo0.c();
        super();
        this.b = s;
        this.c = boolean0;
        this.d = boolean1;
        this.a = recurrence0 == null ? null : new RecurrenceEntity(recurrence0);
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Recurrence a() {
        return this.a;
    }

    public static int b(RecurrenceInfo recurrenceInfo0) {
        return Arrays.hashCode(new Object[]{recurrenceInfo0.a(), recurrenceInfo0.e(), recurrenceInfo0.d(), recurrenceInfo0.c()});
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Boolean c() {
        return this.d;
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceInfo
    public final Boolean d() {
        return this.c;
    }

    @Override  // com.google.android.gms.reminders.model.RecurrenceInfo
    public final String e() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof RecurrenceInfo)) {
            return false;
        }
        return this == object0 ? true : RecurrenceInfoEntity.f(this, ((RecurrenceInfo)object0));
    }

    public static boolean f(RecurrenceInfo recurrenceInfo0, RecurrenceInfo recurrenceInfo1) {
        return bata.b(recurrenceInfo0.a(), recurrenceInfo1.a()) && bata.b(recurrenceInfo0.e(), recurrenceInfo1.e()) && bata.b(recurrenceInfo0.d(), recurrenceInfo1.d()) && bata.b(recurrenceInfo0.c(), recurrenceInfo1.c());
    }

    @Override
    public final int hashCode() {
        return RecurrenceInfoEntity.b(this);
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejur.a(this, parcel0, v);
    }
}

