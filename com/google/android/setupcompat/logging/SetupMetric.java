package com.google.android.setupcompat.logging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.PersistableBundle;
import gacw;
import gadc;
import gadd;
import gadw;
import gaft;
import java.util.Arrays;

public class SetupMetric implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final int b;
    public final PersistableBundle c;

    static {
        SetupMetric.CREATOR = new gadw();
    }

    public SetupMetric(String s, int v, PersistableBundle persistableBundle0) {
        gadd.a(s != null && s.length() != 0, "name cannot be null or empty.");
        this.a = s;
        this.b = v;
        this.c = persistableBundle0;
    }

    public static SetupMetric a(String s, int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("error", v);
        bundle0.putLong("timestamp", gacw.a());
        return new SetupMetric(s, 6, gadc.b(bundle0));
    }

    public static SetupMetric b(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("timestamp", gacw.a());
        return new SetupMetric(s, 2, gadc.b(bundle0));
    }

    public static SetupMetric c(String s, boolean z) {
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("opt_in", z);
        bundle0.putLong("timestamp", gacw.a());
        return new SetupMetric(s, 3, gadc.b(bundle0));
    }

    public static SetupMetric d(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("timestamp", gacw.a());
        return new SetupMetric(s, 5, gadc.b(bundle0));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static SetupMetric e(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putLong("timestamp", gacw.a());
        return new SetupMetric(s, 4, gadc.b(bundle0));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof SetupMetric) ? gaft.a(this.a, ((SetupMetric)object0).a) && gaft.a(Integer.valueOf(this.b), Integer.valueOf(((SetupMetric)object0).b)) && gadc.d(this.c, ((SetupMetric)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, ((int)this.b), this.c});
    }

    @Override
    public final String toString() {
        return "SetupMetric {name=" + this.a + ", type=" + this.b + ", bundle=" + this.c.toString() + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
        parcel0.writePersistableBundle(this.c);
    }
}

