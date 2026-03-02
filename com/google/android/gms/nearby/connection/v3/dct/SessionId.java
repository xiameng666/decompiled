package com.google.android.gms.nearby.connection.v3.dct;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.Arrays;

public class SessionId extends DctDeviceDataElement {
    public static final int a;
    private static final Charset e;

    static {
        SessionId.e = Charset.forName("UTF-8");
    }

    public SessionId(byte[] arr_b) {
        super(1, 6, Arrays.copyOf(arr_b, arr_b.length));
        if(arr_b.length == 6) {
            return;
        }
        Log.i("SessionId", String.format("Incorrect size for Session Id: expected %d, actual %d", ((int)6), ((int)arr_b.length)));
        throw new IllegalArgumentException("Incorrect size for Session Id.");
    }

    public final byte[] b() {
        return Arrays.copyOf(this.d, this.d.length);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof SessionId) ? Arrays.equals(this.d, ((SessionId)object0).d) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    @Override  // com.google.android.gms.nearby.connection.v3.dct.DctDeviceDataElement
    public final String toString() {
        return new String(this.d, SessionId.e);
    }
}

