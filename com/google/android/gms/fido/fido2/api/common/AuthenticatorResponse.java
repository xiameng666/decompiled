package com.google.android.gms.fido.fido2.api.common;

import blyh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class AuthenticatorResponse extends AbstractSafeParcelable implements blyh {
    public abstract byte[] h();
}

