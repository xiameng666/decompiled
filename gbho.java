import java.util.ArrayList;

public final class gbho {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ArrayList e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final int j;
    public final hhdc k;
    public final String l;
    public final long m;

    public gbho(String s, String s1, String s2, boolean z, ArrayList arrayList0, boolean z1, boolean z2, boolean z3, String s3, int v, hhdc hhdc0, String s4, long v1) {
        ibuq.f(s, "configLocale");
        ibuq.f(s1, "configLocaleCountry");
        ibuq.f(s2, "configLocaleLanguage");
        ibuq.f(s4, "timeZoneName");
        super();
        this.a = s;
        this.b = s1;
        this.c = s2;
        this.d = z;
        this.e = arrayList0;
        this.f = z1;
        this.g = z2;
        this.h = z3;
        this.i = s3;
        this.j = v;
        this.k = hhdc0;
        this.l = s4;
        this.m = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof gbho)) {
            return false;
        }
        if(!ibuq.m(this.a, ((gbho)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((gbho)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.c, ((gbho)object0).c)) {
            return false;
        }
        if(this.d != ((gbho)object0).d) {
            return false;
        }
        if(!ibuq.m(this.e, ((gbho)object0).e)) {
            return false;
        }
        if(this.f != ((gbho)object0).f) {
            return false;
        }
        if(this.g != ((gbho)object0).g) {
            return false;
        }
        if(this.h != ((gbho)object0).h) {
            return false;
        }
        if(!ibuq.m(this.i, ((gbho)object0).i)) {
            return false;
        }
        if(this.j != ((gbho)object0).j) {
            return false;
        }
        if(!ibuq.m(this.k, ((gbho)object0).k)) {
            return false;
        }
        return ibuq.m(this.l, ((gbho)object0).l) ? this.m == ((gbho)object0).m : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = (((((((((this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode()) * 0x1F + gbhn.a(this.d)) * 0x1F + this.e.hashCode()) * 0x1F + gbhn.a(this.f)) * 0x1F + gbhn.a(this.g)) * 0x1F + gbhn.a(this.h)) * 0x1F + (this.i == null ? 0 : this.i.hashCode())) * 0x1F + this.j) * 0x1F;
        hhdc hhdc0 = this.k;
        if(hhdc0 != null) {
            if(((ProtoLiteMessage)hhdc0).isImmutable()) {
                return ((v1 + ((ProtoLiteMessage)hhdc0).s()) * 0x1F + this.l.hashCode()) * 0x1F + ((int)(this.m ^ this.m >>> 0x20));
            }
            v = hhdc0.memoizedHashCode;
            if(v == 0) {
                v = ((ProtoLiteMessage)hhdc0).s();
                hhdc0.memoizedHashCode = v;
            }
        }
        return ((v1 + v) * 0x1F + this.l.hashCode()) * 0x1F + ((int)(this.m ^ this.m >>> 0x20));
    }

    @Override
    public final String toString() {
        return "DeviceStateData(configLocale=" + this.a + ", configLocaleCountry=" + this.b + ", configLocaleLanguage=" + this.c + ", hasMonkeyRunner=" + this.d + ", inetAddressList=" + this.e + ", isBeingCharged=" + this.f + ", isCallInProgress=" + this.g + ", isUsbAccessoryOrDeviceAttached=" + this.h + ", iso3Language=" + this.i + ", screenBrightness=" + this.j + ", screenDimensions=" + this.k + ", timeZoneName=" + this.l + ", timeZoneOffSetMillis=" + this.m + ")";
    }
}

