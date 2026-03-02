package com.google.android.gms.reminders.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ejul;
import java.util.Arrays;

public class LocationEntity extends AbstractSafeParcelable implements Location {
    public static final Parcelable.Creator CREATOR;
    public final Double a;
    public final Double b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final FeatureIdProtoEntity f;
    public final String g;
    public final AddressEntity h;
    public final String i;

    static {
        LocationEntity.CREATOR = new ejul();
    }

    public LocationEntity(Location location0) {
        Double double0 = location0.d();
        Double double1 = location0.e();
        String s = location0.j();
        Integer integer0 = location0.g();
        Integer integer1 = location0.f();
        FeatureIdProto featureIdProto0 = location0.c();
        String s1 = location0.h();
        Address address0 = location0.a();
        String s2 = location0.i();
        super();
        this.a = double0;
        this.b = double1;
        this.c = s;
        this.d = integer0;
        this.e = integer1;
        this.g = s1;
        this.i = s2;
        AddressEntity addressEntity0 = null;
        this.f = featureIdProto0 == null ? null : new FeatureIdProtoEntity(featureIdProto0);
        if(address0 != null) {
            addressEntity0 = new AddressEntity(address0);
        }
        this.h = addressEntity0;
    }

    public LocationEntity(Double double0, Double double1, String s, Integer integer0, Integer integer1, FeatureIdProtoEntity featureIdProtoEntity0, String s1, AddressEntity addressEntity0, String s2) {
        this.a = double0;
        this.b = double1;
        this.c = s;
        this.d = integer0;
        this.e = integer1;
        this.f = featureIdProtoEntity0;
        this.g = s1;
        this.h = addressEntity0;
        this.i = s2;
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final Address a() {
        return this.h;
    }

    public static int b(Location location0) {
        return Arrays.hashCode(new Object[]{location0.d(), location0.e(), location0.j(), location0.g(), location0.f(), location0.c(), location0.h(), location0.a(), location0.i()});
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final FeatureIdProto c() {
        return this.f;
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final Double d() {
        return this.a;
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final Double e() {
        return this.b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof Location)) {
            return false;
        }
        return this == object0 ? true : LocationEntity.k(this, ((Location)object0));
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final Integer f() {
        return this.e;
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final Integer g() {
        return this.d;
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final String h() {
        return this.g;
    }

    @Override
    public final int hashCode() {
        return LocationEntity.b(this);
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final String i() {
        return this.i;
    }

    @Override  // com.google.android.gms.reminders.model.Location
    public final String j() {
        return this.c;
    }

    public static boolean k(Location location0, Location location1) {
        return bata.b(location0.d(), location1.d()) && bata.b(location0.e(), location1.e()) && bata.b(location0.j(), location1.j()) && bata.b(location0.g(), location1.g()) && bata.b(location0.f(), location1.f()) && bata.b(location0.c(), location1.c()) && bata.b(location0.h(), location1.h()) && bata.b(location0.a(), location1.a()) && bata.b(location0.i(), location1.i());
    }

    @Override  // bakw
    public final Object l() {
        return this;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejul.a(this, parcel0, v);
    }
}

