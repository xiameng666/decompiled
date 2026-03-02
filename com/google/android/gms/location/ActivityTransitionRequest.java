package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import batl;
import baub;
import bauc;
import cmmv;
import cmmw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ActivityTransitionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Comparator a;
    public final List b;
    public final String c;
    public final List d;
    public String e;

    static {
        ActivityTransitionRequest.CREATOR = new cmmw();
        ActivityTransitionRequest.a = new cmmv();
    }

    public ActivityTransitionRequest(List list0) {
        this(list0, null, null);
    }

    public ActivityTransitionRequest(List list0, String s, List list1) {
        this(list0, s, list1, null);
    }

    public ActivityTransitionRequest(List list0, String s, List list1, String s1) {
        batl.t(list0, "transitions can\'t be null");
        batl.c(((boolean)(list0.isEmpty() ^ 1)), "transitions can\'t be empty.");
        batl.s(list0);
        TreeSet treeSet0 = new TreeSet(ActivityTransitionRequest.a);
        for(Object object0: list0) {
            batl.c(treeSet0.add(((ActivityTransition)object0)), String.format("Found duplicated transition: %s.", ((ActivityTransition)object0)));
        }
        this.b = DesugarCollections.unmodifiableList(list0);
        this.c = s;
        this.d = list1 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list1);
        this.e = s1;
    }

    public static ActivityTransitionRequest a(Intent intent0) {
        return intent0.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST") ? ((ActivityTransitionRequest)bauc.b(intent0, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST", ActivityTransitionRequest.CREATOR)) : null;
    }

    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && this.getClass() == object0.getClass() && bata.b(this.b, ((ActivityTransitionRequest)object0).b) && bata.b(this.c, ((ActivityTransitionRequest)object0).c) && bata.b(this.e, ((ActivityTransitionRequest)object0).e) && bata.b(this.d, ((ActivityTransitionRequest)object0).d);
    }

    @Override
    public final int hashCode() {
        int v = this.b.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.c == null ? 0 : this.c.hashCode();
        int v3 = this.d == null ? 0 : this.d.hashCode();
        String s = this.e;
        if(s != null) {
            v1 = s.hashCode();
        }
        return ((v + v2) * 0x1F + v3) * 0x1F + v1;
    }

    @Override
    public final String toString() {
        return "ActivityTransitionRequest [mTransitions=" + this.b + ", mTag=\'" + this.c + "\', mClients=" + this.d + ", mAttributionTag=" + this.e + "]";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        batl.s(parcel0);
        int v1 = baub.a(parcel0);
        baub.y(parcel0, 1, this.b, false);
        baub.v(parcel0, 2, this.c, false);
        baub.y(parcel0, 3, this.d, false);
        baub.v(parcel0, 4, this.e, false);
        baub.c(parcel0, v1);
    }
}

