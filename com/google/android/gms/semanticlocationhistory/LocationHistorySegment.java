package com.google.android.gms.semanticlocationhistory;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.semanticlocation.Activity;
import com.google.android.gms.semanticlocation.PeriodSummary;
import com.google.android.gms.semanticlocation.TimelineMemory;
import com.google.android.gms.semanticlocation.TimelinePath;
import com.google.android.gms.semanticlocation.Visit;
import emuq;

public class LocationHistorySegment extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final String e;
    public final int f;
    public final Visit g;
    public final Activity h;
    public final TimelinePath i;
    public final int j;
    public final int k;
    public final TimelineMemory l;
    public final PeriodSummary m;

    static {
        LocationHistorySegment.CREATOR = new emuq();
    }

    public LocationHistorySegment(long v, long v1, int v2, int v3, String s, int v4, Visit visit0, Activity activity0, TimelinePath timelinePath0, int v5, int v6, TimelineMemory timelineMemory0, PeriodSummary periodSummary0) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = s;
        this.f = v4;
        this.g = visit0;
        this.h = activity0;
        this.i = timelinePath0;
        this.j = v5;
        this.k = v6;
        this.l = timelineMemory0;
        this.m = periodSummary0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        emuq.a(this, parcel0, v);
    }
}

