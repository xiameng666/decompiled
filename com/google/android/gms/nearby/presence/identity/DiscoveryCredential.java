package com.google.android.gms.nearby.presence.identity;

import ByteString;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import bata;
import baub;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.PresenceIdentity;
import dawt;
import java.util.Arrays;

public final class DiscoveryCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final byte[] a;
    public final PresenceIdentity b;
    public final IdentityTokenTag c;
    public final EncryptedIdentityMetadata d;
    public final long e;
    public final long f;
    public final long g;

    static {
        DiscoveryCredential.CREATOR = new dawt();
    }

    public DiscoveryCredential(byte[] arr_b, PresenceIdentity presenceIdentity0, IdentityTokenTag identityTokenTag0, EncryptedIdentityMetadata encryptedIdentityMetadata0, long v, long v1, long v2) {
        this.a = arr_b;
        this.b = presenceIdentity0;
        this.c = identityTokenTag0;
        this.d = encryptedIdentityMetadata0;
        this.e = v;
        this.f = v1;
        this.g = v2;
    }

    public final byte[] a(int v) {
        return v == 1 ? this.d.a : this.d.b;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof DiscoveryCredential) && Arrays.equals(this.a, ((DiscoveryCredential)object0).a) && bata.b(this.b, ((DiscoveryCredential)object0).b) && this.c.equals(((DiscoveryCredential)object0).c) && this.d.equals(((DiscoveryCredential)object0).d) && this.e == ((DiscoveryCredential)object0).e && this.f == ((DiscoveryCredential)object0).f && this.g == ((DiscoveryCredential)object0).g;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Arrays.hashCode(this.a), this.b, this.c, this.d, ((long)this.e), ((long)this.f), ((long)this.g)});
    }

    @Override
    public final String toString() {
        return String.format("DiscoveryCredential: keySeed: %s", ByteString.copyFrom(this.a));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = baub.a(parcel0);
        baub.i(parcel0, 1, this.a, false);
        baub.t(parcel0, 2, this.b, v, false);
        baub.t(parcel0, 3, this.c, v, false);
        baub.t(parcel0, 4, this.d, v, false);
        baub.q(parcel0, 5, this.e);
        baub.q(parcel0, 6, this.f);
        baub.q(parcel0, 7, this.g);
        baub.c(parcel0, v1);
    }
}

