package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import ggna;
import j..util.Objects;
import java.util.List;

public final class ContactPoint extends Thing {
    public final List a;
    public final List b;
    public final List c;

    public ContactPoint(String s, String s1, String s2, List list0, List list1, List list2, List list3, List list4, G3AttributionInfo g3AttributionInfo0) {
        super(s, s1, s2, list0, list1, g3AttributionInfo0);
        if(list2 == null) {
            list2 = ggna.a;
        }
        this.a = list2;
        if(list3 == null) {
            list3 = ggna.a;
        }
        this.b = list3;
        if(list4 == null) {
            list4 = ggna.a;
        }
        this.c = list4;
    }

    @Override  // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object object0) {
        if(!(object0 instanceof ContactPoint)) {
            return false;
        }
        return super.equals(object0) ? Objects.equals(this.a, ((ContactPoint)object0).a) && Objects.equals(this.b, ((ContactPoint)object0).b) && Objects.equals(this.c, ((ContactPoint)object0).c) : false;
    }

    @Override  // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c, super.hashCode()});
    }

    @Override  // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        return "ContactPoint{\'" + super.toString() + "\', address=\'" + this.a + "\', email=\'" + this.b + "\', telephone=\'" + this.c + "\'}";
    }
}

