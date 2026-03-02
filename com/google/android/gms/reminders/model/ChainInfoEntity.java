package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejue;
import java.util.Arrays;

public class ChainInfoEntity extends AbstractSafeParcelable implements ChainInfo {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final FeatureIdProtoEntity b;

    static {
        ChainInfoEntity.CREATOR = new ejue();
    }

    public ChainInfoEntity(ChainInfo chainInfo0) {
        String s = chainInfo0.c();
        FeatureIdProto featureIdProto0 = chainInfo0.a();
        super();
        this.a = s;
        this.b = featureIdProto0 == null ? null : new FeatureIdProtoEntity(featureIdProto0);
    }

    public ChainInfoEntity(String s, FeatureIdProtoEntity featureIdProtoEntity0) {
        this.a = s;
        this.b = featureIdProtoEntity0;
    }

    @Override  // com.google.android.gms.reminders.model.ChainInfo
    public final FeatureIdProto a() {
        return this.b;
    }

    public static int b(ChainInfo chainInfo0) {
        return Arrays.hashCode(new Object[]{chainInfo0.c(), chainInfo0.a()});
    }

    @Override  // com.google.android.gms.reminders.model.ChainInfo
    public final String c() {
        return this.a;
    }

    public static boolean d(ChainInfo chainInfo0, ChainInfo chainInfo1) {
        return bata.b(chainInfo0.c(), chainInfo1.c()) && bata.b(chainInfo0.a(), chainInfo1.a());
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof ChainInfo)) {
            return false;
        }
        return this == object0 ? true : ChainInfoEntity.d(this, ((ChainInfo)object0));
    }

    @Override
    public final int hashCode() {
        return ChainInfoEntity.b(this);
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejue.a(this, parcel0, v);
    }
}

