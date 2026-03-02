package com.google.android.libraries.photos.backup.api;

import ProtoLiteMessage;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Base64;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import fptc;
import frbc;
import gftb;
import grkh;
import grnc;
import hftc;
import hfur;

public class BackupDisableRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final grnc a;
    private final grkh b;

    static {
        BackupDisableRequest.CREATOR = new fptc();
    }

    public BackupDisableRequest(int v, byte[] arr_b) {
        try {
            this.a = grnc.b(v) == null ? grnc.a : grnc.b(v);
            hftc hftc0 = hftc.a();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)grkh.a), arr_b, 0, arr_b.length, hftc0);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            this.b = (grkh)hftv0;
        }
        catch(hfur hfur0) {
            throw new IllegalArgumentException("Invalid Audit Token bytes", hfur0);
        }
    }

    public BackupDisableRequest(grnc grnc0, grkh grkh0) {
        gftb.check(grnc0);
        this.a = grnc0;
        gftb.check(grkh0);
        this.b = grkh0;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof BackupDisableRequest) && this.a.equals(((BackupDisableRequest)object0).a) && ((ProtoLiteMessage)this.b).equals(((BackupDisableRequest)object0).b);
    }

    @Override
    public final int hashCode() {
        return frbc.b(this.a, frbc.b(this.b, 17));
    }

    @Override
    public final String toString() {
        String s = Base64.encodeToString(this.b.toBytesArray(), 2);
        return "BackupDisableRequest{, source=" + this.a.h + ", auditToken=" + s + "}";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.o(parcel0, 1, this.a.h);
        baub.i(parcel0, 2, this.b.toBytesArray(), false);
        baub.c(parcel0, v1);
    }
}

