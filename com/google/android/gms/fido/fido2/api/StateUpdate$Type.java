package com.google.android.gms.fido.fido2.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import bmgh;
import bmgi;

public enum StateUpdate.Type implements Parcelable {
    CANCEL("cancel"),
    PAUSE("pause"),
    RESUME("resume"),
    STOP("stop"),
    DEVICE_SELECTION("user_selected_device"),
    SELECT_VIEW("user_selected_view"),
    SELECT_TRANSPORT_VIEW("user_selected_view_for_transport"),
    UPDATE_CURRENT_VIEW("update_current_view");

    public static final Parcelable.Creator CREATOR;
    public final String i;

    static {
        StateUpdate.Type.CREATOR = new bmgh();
    }

    private StateUpdate.Type(String s1) {
        this.i = s1;
    }

    public static StateUpdate.Type a(String s) {
        StateUpdate.Type[] arr_stateUpdate$Type = StateUpdate.Type.values();
        for(int v = 0; v < arr_stateUpdate$Type.length; ++v) {
            StateUpdate.Type stateUpdate$Type0 = arr_stateUpdate$Type[v];
            if(s.equals(stateUpdate$Type0.i)) {
                return stateUpdate$Type0;
            }
        }
        throw new bmgi(s);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.i;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.i);
    }
}

