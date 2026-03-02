package com.google.android.wallet.analytics;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import gamg;

public class CreditCardEntryAction implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public boolean a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;

    static {
        CreditCardEntryAction.CREATOR = new gamg();
    }

    public CreditCardEntryAction() {
        this.s = -1;
        this.u = -1;
    }

    public CreditCardEntryAction(Parcel parcel0) {
        this.s = -1;
        this.u = -1;
        this.a = CreditCardEntryAction.a(parcel0);
        this.b = parcel0.readInt();
        this.c = CreditCardEntryAction.a(parcel0);
        this.d = CreditCardEntryAction.a(parcel0);
        this.e = CreditCardEntryAction.a(parcel0);
        this.f = CreditCardEntryAction.a(parcel0);
        this.g = parcel0.readInt();
        this.h = CreditCardEntryAction.a(parcel0);
        this.i = CreditCardEntryAction.a(parcel0);
        this.j = CreditCardEntryAction.a(parcel0);
        this.k = CreditCardEntryAction.a(parcel0);
        this.l = parcel0.readInt();
        this.m = CreditCardEntryAction.a(parcel0);
        this.n = CreditCardEntryAction.a(parcel0);
        this.o = CreditCardEntryAction.a(parcel0);
        this.p = parcel0.readLong();
        this.q = CreditCardEntryAction.a(parcel0);
        this.r = CreditCardEntryAction.a(parcel0);
        this.s = parcel0.readInt();
        this.t = parcel0.readInt();
        this.u = parcel0.readInt();
        this.v = parcel0.readInt();
        this.w = parcel0.readInt();
        this.x = parcel0.readInt();
        this.y = parcel0.readInt();
    }

    private static boolean a(Parcel parcel0) {
        return parcel0.readInt() == 1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "panOcrEnabled: " + this.a + "\npanEntryType: " + this.b + "\npanRecognizedByOcr: " + this.c + "\npanValidationErrorOccurred: " + this.d + "\npanRecognizedByNfc: " + this.e + "\nexpDateOcrEnabled: " + this.f + "\nexpDateEntryType: " + this.g + "\nexpDateRecognizedByOcr: " + this.h + "\nexpDateValidationErrorOccurred: " + this.i + "\nexpDateRecognizedByNfc: " + this.j + "\nnameOcrEnabled: " + this.k + "\nnameEntryType: " + this.l + "\nnameRecognizedByOcr: " + this.m + "\nnameValidationErrorOccurred: " + this.n + "\nnameRecognizedByNfc: " + this.o + "\nnfcElapsedTimeMillis: " + this.p + "\nnfcFeatureEnabled: " + this.q + "\nnfcAdapterEnabled: " + this.r + "\nnumOcrAttempts: " + this.s + "\nocrExitReason: " + this.t + "\nnumNfcAttempts: " + this.u + "\nnfcExitReason: " + this.v + "\nnfcErrorReason: " + this.w + "\ncameraInputPreference: " + this.x + "\nnfcInputPreference: " + this.y;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(((int)this.a));
        parcel0.writeInt(this.b);
        parcel0.writeInt(((int)this.c));
        parcel0.writeInt(((int)this.d));
        parcel0.writeInt(((int)this.e));
        parcel0.writeInt(((int)this.f));
        parcel0.writeInt(this.g);
        parcel0.writeInt(((int)this.h));
        parcel0.writeInt(((int)this.i));
        parcel0.writeInt(((int)this.j));
        parcel0.writeInt(((int)this.k));
        parcel0.writeInt(this.l);
        parcel0.writeInt(((int)this.m));
        parcel0.writeInt(((int)this.n));
        parcel0.writeInt(((int)this.o));
        parcel0.writeLong(this.p);
        parcel0.writeInt(((int)this.q));
        parcel0.writeInt(((int)this.r));
        parcel0.writeInt(this.s);
        parcel0.writeInt(this.t);
        parcel0.writeInt(this.u);
        parcel0.writeInt(this.v);
        parcel0.writeInt(this.w);
        parcel0.writeInt(this.x);
        parcel0.writeInt(this.y);
    }
}

