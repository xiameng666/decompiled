package com.google.android.wallet.bender3.framework.storage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import gblt;
import gblu;
import ibuq;

public final class SessionEntity implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final long e;
    public final long f;

    static {
        SessionEntity.CREATOR = new gblu();
    }

    public SessionEntity() {
        this("0", null, null, null, 0L, 0L);
    }

    public SessionEntity(String s, String s1, String s2, Integer integer0, long v, long v1) {
        ibuq.f(s, "sessionId");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = integer0;
        this.e = v;
        this.f = v1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SessionEntity)) {
            return false;
        }
        if(!ibuq.m(this.a, ((SessionEntity)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((SessionEntity)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((SessionEntity)object0).c)) {
            return false;
        }
        if(!ibuq.m(this.d, ((SessionEntity)object0).d)) {
            return false;
        }
        return this.e == ((SessionEntity)object0).e ? this.f == ((SessionEntity)object0).f : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() * 0x1F;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        Integer integer0 = this.d;
        if(integer0 != null) {
            v1 = integer0.hashCode();
        }
        return ((((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F + gblt.a(this.e)) * 0x1F + gblt.a(this.f);
    }

    @Override
    public final String toString() {
        return "SessionEntity(sessionId=" + this.a + ", clientSessionId=" + this.b + ", accountName=" + this.c + ", environment=" + this.d + ", lastAccessTime=" + this.e + ", expirationTime=" + this.f + ")";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1;
        ibuq.f(parcel0, "dest");
        parcel0.writeString(this.a);
        parcel0.writeString(this.b);
        parcel0.writeString(this.c);
        Integer integer0 = this.d;
        if(integer0 == null) {
            v1 = 0;
        }
        else {
            parcel0.writeInt(1);
            v1 = (int)integer0;
        }
        parcel0.writeInt(v1);
        parcel0.writeLong(this.e);
        parcel0.writeLong(this.f);
    }
}

