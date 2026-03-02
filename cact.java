import j..time.LocalDate;

public final class cact {
    public final long a;
    public final LocalDate b;
    public final String c;
    private final String d;

    public cact(long v, String s, LocalDate localDate0, String s1) {
        ibuq.f(s, "androidId");
        ibuq.f(s1, "deviceDescription");
        super();
        this.a = v;
        this.d = s;
        this.b = localDate0;
        this.c = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cact)) {
            return false;
        }
        if(this.a != ((cact)object0).a) {
            return false;
        }
        if(!ibuq.m(this.d, ((cact)object0).d)) {
            return false;
        }
        return ibuq.m(this.b, ((cact)object0).b) ? ibuq.m(this.c, ((cact)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        int v = ((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.d.hashCode();
        return this.b == null ? v * 0x1F * 0x1F + this.c.hashCode() : (v * 0x1F + this.b.hashCode()) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "DeviceInfo(deviceId=" + this.a + ", androidId=" + this.d + ", lastUploadTimestamp=" + this.b + ", deviceDescription=" + this.c + ")";
    }
}

