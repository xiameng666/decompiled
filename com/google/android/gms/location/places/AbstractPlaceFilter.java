package com.google.android.gms.location.places;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import j..util.DesugarCollections;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class AbstractPlaceFilter extends AbstractSafeParcelable {
    static Set a(List list0) {
        return list0 == null || list0.isEmpty() ? Collections.EMPTY_SET : DesugarCollections.unmodifiableSet(new HashSet(list0));
    }
}

