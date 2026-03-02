package com.google.android.setupcompat.logging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.PersistableBundle;
import gacw;
import gadc;
import gadd;
import gadm;
import gadn;
import gaft;
import java.util.Arrays;

public final class CustomEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final long a;
    private final MetricKey b;
    private final PersistableBundle c;
    private final PersistableBundle d;

    static {
        CustomEvent.CREATOR = new gadn();
    }

    public CustomEvent(long v, MetricKey metricKey0, PersistableBundle persistableBundle0, PersistableBundle persistableBundle1) {
        gadd.a(Long.compare(v, 0L) >= 0, "Timestamp cannot be negative.");
        gadd.d(metricKey0, "MetricKey cannot be null.");
        gadd.d(persistableBundle0, "Bundle cannot be null.");
        gadd.a(((boolean)(persistableBundle0.isEmpty() ^ 1)), "Bundle cannot be empty.");
        gadd.d(persistableBundle1, "piiValues cannot be null.");
        for(Object object0: persistableBundle0.keySet()) {
            String s = (String)object0;
            gadm.a(s, "bundle key", 3, 50);
            Object object1 = persistableBundle0.get(s);
            if((object1 instanceof String) && ((String)object1).length() > 50) {
                persistableBundle0.putString(s, CustomEvent.c(((String)object1)));
            }
        }
        this.a = v;
        this.b = metricKey0;
        this.c = new PersistableBundle(persistableBundle0);
        this.d = new PersistableBundle(persistableBundle1);
    }

    public static Bundle a(CustomEvent customEvent0) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("CustomEvent_version", 1);
        bundle0.putLong("CustomEvent_timestamp", customEvent0.a);
        bundle0.putBundle("CustomEvent_metricKey", MetricKey.a(customEvent0.b));
        bundle0.putBundle("CustomEvent_bundleValues", gadc.a(new PersistableBundle(customEvent0.c)));
        bundle0.putBundle("CustomEvent_pii_bundleValues", gadc.a(customEvent0.d));
        return bundle0;
    }

    public static CustomEvent b(MetricKey metricKey0, PersistableBundle persistableBundle0) {
        PersistableBundle persistableBundle1 = PersistableBundle.EMPTY;
        long v = gacw.a();
        gadc.e(persistableBundle0);
        gadc.e(persistableBundle1);
        return new CustomEvent(v, metricKey0, persistableBundle0, persistableBundle1);
    }

    public static String c(String s) {
        return CustomEvent.d(s, 50);
    }

    public static String d(String s, int v) {
        return s.length() > v ? "truncated." + s.substring(s.length() - v + 10) : s;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : (object0 instanceof CustomEvent) && this.a == ((CustomEvent)object0).a && gaft.a(this.b, ((CustomEvent)object0).b) && gadc.d(this.c, ((CustomEvent)object0).c) && gadc.d(this.d, ((CustomEvent)object0).d);
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((long)this.a), this.b, this.c, this.d});
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeLong(this.a);
        parcel0.writeParcelable(this.b, v);
        parcel0.writePersistableBundle(this.c);
        parcel0.writePersistableBundle(this.d);
    }
}

