package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bndm;

@Deprecated
public enum ErrorCode implements Parcelable {
    OK(0),
    OTHER_ERROR(1),
    BAD_REQUEST(2),
    CONFIGURATION_UNSUPPORTED(3),
    DEVICE_INELIGIBLE(4),
    TIMEOUT(5);

    public static final Parcelable.Creator CREATOR;
    public final int g;

    static {
        ErrorCode.CREATOR = new bndm();
    }

    private ErrorCode(int v1) {
        this.g = v1;
    }

    public static ErrorCode a(int v) {
        ErrorCode[] arr_errorCode = ErrorCode.values();
        for(int v1 = 0; v1 < arr_errorCode.length; ++v1) {
            ErrorCode errorCode0 = arr_errorCode[v1];
            if(v == errorCode0.g) {
                return errorCode0;
            }
        }
        return ErrorCode.b;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.g);
    }
}

