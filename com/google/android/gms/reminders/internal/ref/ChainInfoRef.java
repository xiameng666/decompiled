package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.ChainInfo;
import com.google.android.gms.reminders.model.ChainInfoEntity;
import com.google.android.gms.reminders.model.FeatureIdProto;
import ejub;
import ejue;

public class ChainInfoRef extends ejub implements ChainInfo {
    private boolean f;
    private FeatureIdProtoRef g;

    public ChainInfoRef(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v, s);
        this.f = false;
    }

    @Override  // com.google.android.gms.reminders.model.ChainInfo
    public final FeatureIdProto a() {
        if(!this.f) {
            this.f = true;
            DataHolder dataHolder0 = this.a;
            String s = this.d;
            if(FeatureIdProtoRef.d(dataHolder0, this.b, this.e, s + "chain_id_")) {
                this.g = null;
                return this.g;
            }
            this.g = new FeatureIdProtoRef(dataHolder0, this.b, s + "chain_id_");
        }
        return this.g;
    }

    @Override  // com.google.android.gms.reminders.model.ChainInfo
    public final String c() {
        return this.r(this.p("chain_name"));
    }

    public static boolean d(DataHolder dataHolder0, int v, int v1, String s) {
        return dataHolder0.f(ChainInfoRef.G(s, "chain_name"), v, v1) && FeatureIdProtoRef.d(dataHolder0, v, v1, s + "chain_id_");
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // bakp
    public final boolean equals(Object object0) {
        if(!(object0 instanceof ChainInfo)) {
            return false;
        }
        return this == object0 ? true : ChainInfoEntity.d(this, ((ChainInfo)object0));
    }

    @Override  // bakp
    public final int hashCode() {
        return ChainInfoEntity.b(this);
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new ChainInfoEntity(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejue.a(new ChainInfoEntity(this), parcel0, v);
    }
}

