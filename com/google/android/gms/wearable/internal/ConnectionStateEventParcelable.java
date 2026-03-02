package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fdgi;
import j..util.Objects;

public class ConnectionStateEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int a;
    public final String b;

    static {
        ConnectionStateEventParcelable.CREATOR = new fdgi();
    }

    public ConnectionStateEventParcelable(int v, String s) {
        this.a = v;
        this.b = s;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof ConnectionStateEventParcelable) ? this.a == ((ConnectionStateEventParcelable)object0).a && Objects.equals(this.b, ((ConnectionStateEventParcelable)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{((int)this.a), this.b});
    }

    @Override
    public final String toString() {
        int v = this.a;
        switch(v) {
            case -9: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Migration was cancelled");
            }
            case -8: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Another migration is already in progress");
            }
            case -7: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Connect message malformed");
            }
            case -6: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Migration status mismatch between watch and phone");
            }
            case -5: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Phone switching feature disabled");
            }
            case -4: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Did not receive connect msg");
            }
            case -3: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "No bluetooth connection");
            }
            case -2: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Accounts mismatch");
            }
            case -1: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Unknown failure");
            }
            case 0: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Connected");
            }
            case 1: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Connection handshake in progress");
            }
            case 2: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Connection handshake complete");
            }
            case 3: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Sync with old node suspended");
            }
            case 4: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Control plane transport connected");
            }
            case 5: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Accounts Matched");
            }
            case 6: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Association to watch terminated");
            }
            default: {
                return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, "Unrecognized state value: " + v);
            }
        }
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a);
        baub.v(parcel0, 2, this.b, false);
        baub.c(parcel0, v1);
    }
}

