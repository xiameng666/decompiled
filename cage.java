import j..time.LocalDate;

public final class cage {
    public final long a;
    public final String b;
    public final LocalDate c;
    private final boolean d;

    public cage(long v, String s, LocalDate localDate0) {
        ibuq.f(s, "deviceName");
        ibuq.f(localDate0, "backupDate");
        super();
        this.a = v;
        this.b = s;
        this.d = false;
        this.c = localDate0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cage)) {
            return false;
        }
        if(this.a != ((cage)object0).a) {
            return false;
        }
        return ibuq.m(this.b, ((cage)object0).b) ? ibuq.m(this.c, ((cage)object0).c) : false;
    }

    @Override
    public final int hashCode() {
        return ((((int)(this.a ^ this.a >>> 0x20)) * 0x1F + this.b.hashCode()) * 0x1F + 0x4D5) * 0x1F + this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "DeviceCardUiModel(id=" + this.a + ", deviceName=" + this.b + ", isCurrentDevice=false, backupDate=" + this.c + ")";
    }
}

