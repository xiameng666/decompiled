package com.google.android.gms.reminders.internal.ref;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.reminders.model.Address;
import com.google.android.gms.reminders.model.AddressEntity;
import ejub;
import ejuc;

public class AddressRef extends ejub implements Address {
    public AddressRef(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v, s);
    }

    @Override  // com.google.android.gms.reminders.model.Address
    public final String a() {
        return this.r(this.p("country"));
    }

    @Override  // com.google.android.gms.reminders.model.Address
    public final String c() {
        return this.r(this.p("locality"));
    }

    @Override  // com.google.android.gms.reminders.model.Address
    public final String d() {
        return this.r(this.p("name"));
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.reminders.model.Address
    public final String e() {
        return this.r(this.p("postal_code"));
    }

    @Override  // bakp
    public final boolean equals(Object object0) {
        if(!(object0 instanceof Address)) {
            return false;
        }
        return this == object0 ? true : AddressEntity.j(this, ((Address)object0));
    }

    @Override  // com.google.android.gms.reminders.model.Address
    public final String f() {
        return this.r(this.p("region"));
    }

    @Override  // com.google.android.gms.reminders.model.Address
    public final String g() {
        return this.r(this.p("street_address"));
    }

    @Override  // com.google.android.gms.reminders.model.Address
    public final String h() {
        return this.r(this.p("street_name"));
    }

    @Override  // bakp
    public final int hashCode() {
        return AddressEntity.b(this);
    }

    @Override  // com.google.android.gms.reminders.model.Address
    public final String i() {
        return this.r(this.p("street_number"));
    }

    public static boolean j(DataHolder dataHolder0, int v, int v1, String s) {
        return dataHolder0.f(AddressRef.G(s, "country"), v, v1) && dataHolder0.f(AddressRef.G(s, "locality"), v, v1) && dataHolder0.f(AddressRef.G(s, "region"), v, v1) && dataHolder0.f(AddressRef.G(s, "street_address"), v, v1) && dataHolder0.f(AddressRef.G(s, "street_number"), v, v1) && dataHolder0.f(AddressRef.G(s, "street_name"), v, v1) && dataHolder0.f(AddressRef.G(s, "postal_code"), v, v1) && dataHolder0.f(AddressRef.G(s, "name"), v, v1);
    }

    @Override  // bakp, bakw
    public final Object l() {
        return new AddressEntity(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ejuc.a(new AddressEntity(this), parcel0);
    }
}

