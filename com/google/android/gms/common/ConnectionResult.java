package com.google.android.gms.common;

import a;
import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import azpc;
import basz;
import bata;
import batl;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final ConnectionResult a;
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;

    static {
        ConnectionResult.a = new ConnectionResult(0);
        ConnectionResult.CREATOR = new azpc();
    }

    public ConnectionResult(int v) {
        this(v, null, null);
    }

    public ConnectionResult(int v, int v1, PendingIntent pendingIntent0, String s) {
        this.b = v;
        this.c = v1;
        this.d = pendingIntent0;
        this.e = s;
    }

    public ConnectionResult(int v, PendingIntent pendingIntent0) {
        this(v, pendingIntent0, null);
    }

    public ConnectionResult(int v, PendingIntent pendingIntent0, String s) {
        this(1, v, pendingIntent0, s);
    }

    public static String a(int v) {
        switch(v) {
            case -1: {
                return "UNKNOWN";
            }
            case 0: {
                return "SUCCESS";
            }
            case 1: {
                return "SERVICE_MISSING";
            }
            case 2: {
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            }
            case 3: {
                return "SERVICE_DISABLED";
            }
            case 4: {
                return "SIGN_IN_REQUIRED";
            }
            case 5: {
                return "INVALID_ACCOUNT";
            }
            case 6: {
                return "RESOLUTION_REQUIRED";
            }
            case 7: {
                return "NETWORK_ERROR";
            }
            case 8: {
                return "INTERNAL_ERROR";
            }
            case 9: {
                return "SERVICE_INVALID";
            }
            case 10: {
                return "DEVELOPER_ERROR";
            }
            case 11: {
                return "LICENSE_CHECK_FAILED";
            }
            case 13: {
                return "CANCELED";
            }
            case 14: {
                return "TIMEOUT";
            }
            case 15: {
                return "INTERRUPTED";
            }
            case 16: {
                return "API_UNAVAILABLE";
            }
            case 17: {
                return "SIGN_IN_FAILED";
            }
            case 18: {
                return "SERVICE_UPDATING";
            }
            case 19: {
                return "SERVICE_MISSING_PERMISSION";
            }
            case 20: {
                return "RESTRICTED_PROFILE";
            }
            case 21: {
                return "API_VERSION_UPDATE_REQUIRED";
            }
            case 22: {
                return "RESOLUTION_ACTIVITY_NOT_FOUND";
            }
            case 23: {
                return "API_DISABLED";
            }
            case 24: {
                return "API_DISABLED_FOR_CONNECTION";
            }
            case 25: {
                return "API_INSTALL_REQUIRED";
            }
            case 99: {
                return "UNFINISHED";
            }
            case 1500: {
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
            default: {
                return a.f(v, "UNKNOWN_ERROR_CODE(", ")");
            }
        }
    }

    public final void b(Activity activity0, int v) {
        if(!this.c()) {
            return;
        }
        batl.s(this.d);
        activity0.startIntentSenderForResult(this.d.getIntentSender(), v, null, 0, 0, 0);
    }

    public final boolean c() {
        return this.c != 0 && this.d != null;
    }

    public final boolean d() {
        return this.c == 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return (object0 instanceof ConnectionResult) ? this.c == ((ConnectionResult)object0).c && bata.b(this.d, ((ConnectionResult)object0).d) && bata.b(this.e, ((ConnectionResult)object0).e) : false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.c), this.d, this.e});
    }

    @Override
    public final String toString() {
        ArrayList arrayList0 = new ArrayList();
        basz.b("statusCode", ConnectionResult.a(this.c), arrayList0);
        basz.b("resolution", this.d, arrayList0);
        basz.b("message", this.e, arrayList0);
        return basz.a(arrayList0, this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.b);
        baub.o(parcel0, 2, this.c);
        baub.t(parcel0, 3, this.d, v, false);
        baub.v(parcel0, 4, this.e, false);
        baub.c(parcel0, v1);
    }
}

