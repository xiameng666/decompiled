package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import ggna;
import j..util.DesugarCollections;
import j..util.Objects;
import java.util.List;

public final class MusicGroup extends Thing {
    public final List a;
    public final List b;

    public MusicGroup(String s, String s1, String s2, List list0, List list1, List list2, List list3, G3AttributionInfo g3AttributionInfo0) {
        super(s, s1, s2, list0, list1, g3AttributionInfo0);
        List list4 = list2 == null ? ggna.a : DesugarCollections.unmodifiableList(list2);
        this.a = list4;
        List list5 = list3 == null ? ggna.a : DesugarCollections.unmodifiableList(list3);
        this.b = list5;
    }

    @Override  // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object object0) {
        if(!(object0 instanceof MusicGroup)) {
            return false;
        }
        return super.equals(object0) ? Objects.equals(this.a, ((MusicGroup)object0).a) && Objects.equals(this.b, ((MusicGroup)object0).b) : false;
    }

    @Override  // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, super.hashCode()});
    }

    @Override  // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        return "MusicGroup{\'" + super.toString() + "\', tracks=" + this.a + ", albums=" + this.b + "}";
    }
}

