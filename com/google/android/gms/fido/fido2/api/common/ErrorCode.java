package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bmhr;
import bmhs;

public enum ErrorCode implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator CREATOR;
    public final int m;

    static {
        ErrorCode.CREATOR = new bmhr();
    }

    private ErrorCode(int v1) {
        this.m = v1;
    }

    public static ErrorCode a(int v) {
        ErrorCode[] arr_errorCode = ErrorCode.values();
        for(int v1 = 0; v1 < arr_errorCode.length; ++v1) {
            ErrorCode errorCode0 = arr_errorCode[v1];
            if(v == errorCode0.m) {
                return errorCode0;
            }
        }
        throw new bmhs(v);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.m);
    }
}

