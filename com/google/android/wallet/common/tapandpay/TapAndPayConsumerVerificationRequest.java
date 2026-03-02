package com.google.android.wallet.common.tapandpay;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.wallet.common.moduleapicalltasks.ModuleApiCallTaskLoaderRequest;
import gcic;
import gcid;
import gfdb;
import gfdd;
import gfde;
import gfdf;
import gfdj;

public class TapAndPayConsumerVerificationRequest extends ModuleApiCallTaskLoaderRequest {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final long f;
    public final int g;
    public final String h;
    public final byte[] i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final int m;

    static {
        TapAndPayConsumerVerificationRequest.CREATOR = new gcic();
    }

    public TapAndPayConsumerVerificationRequest(gfdf gfdf0, boolean z) {
        String s1;
        this.a = gfdf0.d;
        this.b = gfdf0.e;
        this.c = z;
        int v = gfdj.a(gfdf0.f);
        int v1 = 1;
        if(v == 0) {
            v = 1;
        }
        this.d = gcid.b(v);
        this.e = (gfdf0.g == null ? gfde.a : gfdf0.g).d;
        gfde gfde0 = gfdf0.g;
        this.f = (gfde0 == null ? gfde.a : gfde0).c;
        this.g = (gfde0 == null ? gfde.a : gfde0).e;
        String s = null;
        if((gfdf0.b & 16) == 0) {
            s1 = null;
        }
        else {
            if(gfde0 == null) {
                gfde0 = gfde.a;
            }
            s1 = gfde0.f;
        }
        this.h = s1;
        this.i = gfdf0.k.toByteArray();
        this.j = gfdf0.l;
        if(((gfdf0.h == null ? gfdb.a : gfdf0.h).b & 1) != 0) {
            s = (gfdf0.h == null ? gfdb.a : gfdf0.h).c;
        }
        this.k = s;
        this.l = gfdf0.m;
        int v2 = gfdd.a(gfdf0.j) == 0 ? 1 : gfdd.a(gfdf0.j);
        if(v2 - 1 != 1) {
            v1 = 2;
            if(v2 - 1 != 2) {
                v1 = 0;
            }
        }
        this.m = v1;
    }

    public TapAndPayConsumerVerificationRequest(String s, int v) {
        this.a = s;
        this.b = true;
        this.c = false;
        this.d = v;
        this.e = 0;
        this.f = 0L;
        this.g = 0;
        this.h = null;
        this.i = new byte[0];
        this.j = false;
        this.k = null;
        this.l = false;
        this.m = 0;
    }

    public TapAndPayConsumerVerificationRequest(String s, boolean z, boolean z1, int v, int v1, long v2, int v3, String s1, byte[] arr_b, boolean z2, String s2, boolean z3, int v4) {
        this.a = s;
        this.b = z;
        this.c = z1;
        this.d = v;
        this.e = v1;
        this.f = v2;
        this.g = v3;
        this.h = s1;
        this.i = arr_b;
        this.j = z2;
        this.k = s2;
        this.l = z3;
        this.m = v4;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.a);
        parcel0.writeByte(((byte)this.b));
        parcel0.writeByte(((byte)this.c));
        parcel0.writeInt(this.d);
        parcel0.writeInt(this.e);
        parcel0.writeLong(this.f);
        parcel0.writeInt(this.g);
        parcel0.writeString(this.h);
        parcel0.writeByteArray(this.i);
        parcel0.writeByte(((byte)this.j));
        parcel0.writeString(this.k);
        parcel0.writeByte(((byte)this.l));
        parcel0.writeInt(this.m);
    }
}

