package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejuj;
import java.util.Arrays;

public class ExternalApplicationLinkEntity extends AbstractSafeParcelable implements ExternalApplicationLink {
    public static final Parcelable.Creator CREATOR;
    public final Integer a;
    public final String b;

    static {
        ExternalApplicationLinkEntity.CREATOR = new ejuj();
    }

    public ExternalApplicationLinkEntity(ExternalApplicationLink externalApplicationLink0) {
        this(externalApplicationLink0.a(), externalApplicationLink0.c());
    }

    public ExternalApplicationLinkEntity(Integer integer0, String s) {
        this.a = integer0;
        this.b = s;
    }

    @Override  // com.google.android.gms.reminders.model.ExternalApplicationLink
    public final Integer a() {
        return this.a;
    }

    public static int b(ExternalApplicationLink externalApplicationLink0) {
        return Arrays.hashCode(new Object[]{externalApplicationLink0.a(), externalApplicationLink0.c()});
    }

    @Override  // com.google.android.gms.reminders.model.ExternalApplicationLink
    public final String c() {
        return this.b;
    }

    public static boolean d(ExternalApplicationLink externalApplicationLink0, ExternalApplicationLink externalApplicationLink1) {
        return bata.b(externalApplicationLink0.a(), externalApplicationLink1.a()) && bata.b(externalApplicationLink0.c(), externalApplicationLink1.c());
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof ExternalApplicationLink)) {
            return false;
        }
        return this == object0 ? true : ExternalApplicationLinkEntity.d(this, ((ExternalApplicationLink)object0));
    }

    @Override
    public final int hashCode() {
        return ExternalApplicationLinkEntity.b(this);
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejuj.a(this, parcel0);
    }
}

