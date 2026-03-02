package com.google.android.gms.fido.fido2.api.common;

import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gfsx;

public abstract class RequestOptions extends AbstractSafeParcelable {
    public abstract ResultReceiver b();

    public abstract AuthenticationExtensions c();

    public abstract TokenBinding d();

    public abstract gfsx e();

    public abstract Double f();

    public abstract Integer g();

    public abstract void h(ResultReceiver arg1);

    public abstract byte[] i();

    public byte[] j() {
        throw null;
    }
}

