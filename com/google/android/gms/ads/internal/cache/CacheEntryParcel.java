package com.google.android.gms.ads.internal.cache;

import android.os.Parcel;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.InputStream;

public class CacheEntryParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private ParcelFileDescriptor a;
    private final boolean b;
    private final boolean c;
    private final long d;
    private final boolean e;

    static {
        CacheEntryParcel.CREATOR = new c();
    }

    public CacheEntryParcel() {
        this(null, false, false, 0L, false);
    }

    public CacheEntryParcel(ParcelFileDescriptor parcelFileDescriptor0, boolean z, boolean z1, long v, boolean z2) {
        this.a = parcelFileDescriptor0;
        this.b = z;
        this.c = z1;
        this.d = v;
        this.e = z2;
    }

    public final long a() {
        synchronized(this) {
        }
        return this.d;
    }

    final ParcelFileDescriptor b() {
        synchronized(this) {
        }
        return this.a;
    }

    public final InputStream c() {
        InputStream inputStream0;
        synchronized(this) {
            if(this.a == null) {
                return null;
            }
            inputStream0 = new ParcelFileDescriptor.AutoCloseInputStream(this.a);
            this.a = null;
        }
        return inputStream0;
    }

    public final boolean d() {
        synchronized(this) {
        }
        return this.b;
    }

    public final boolean e() {
        synchronized(this) {
        }
        return this.a != null;
    }

    public final boolean f() {
        synchronized(this) {
        }
        return this.c;
    }

    public final boolean g() {
        synchronized(this) {
        }
        return this.e;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.t(parcel0, 2, this.b(), v, false);
        baub.e(parcel0, 3, this.d());
        baub.e(parcel0, 4, this.f());
        baub.q(parcel0, 5, this.a());
        baub.e(parcel0, 6, this.g());
        baub.c(parcel0, v1);
    }
}

