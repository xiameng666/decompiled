package com.google.android.gms.smartdevice.utils;

import android.util.Log;
import bbgs;
import bbgu;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import erpd;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

public abstract class BinarySerializableFastSafeParcelableJson extends FastSafeParcelableJsonResponse {
    public final void aw(byte[] arr_b) {
        try {
            new bbgu().h(new ByteArrayInputStream(arr_b), this);
        }
        catch(bbgs bbgs0) {
            throw new erpd(bbgs0);
        }
    }

    public final byte[] ax() {
        try {
            return this.toString().getBytes("UTF-8");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            Log.e("SmartDevice", "Error serializing object.", unsupportedEncodingException0);
            return new byte[0];
        }
    }
}

