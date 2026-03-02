package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class FenceState extends AbstractSafeParcelable {
    public static int a(boolean z) {
        return z ? 2 : 1;
    }

    public abstract int b();

    public abstract String c();
}

