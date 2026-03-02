import j..util.Optional;

public final class eidq {
    public final boolean a;
    public final Optional b;
    public final boolean c;

    public eidq() {
        throw null;
    }

    public eidq(boolean z, Optional optional0, boolean z1) {
        this.a = z;
        this.b = optional0;
        this.c = z1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof eidq) && this.a == ((eidq)object0).a && this.b.equals(((eidq)object0).b) && this.c == ((eidq)object0).c;
    }

    @Override
    public final int hashCode() {
        int v = 0x4D5;
        int v1 = ((this.a ? 0x4CF : 0x4D5) ^ 1000003) * 1000003 ^ this.b.hashCode();
        if(this.c) {
            v = 0x4CF;
        }
        return v1 * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "CpNotificationInfo{postCpNotificationOnUnlock=" + this.a + ", cpMostRecentLockTime=" + this.b + ", cpFirstNotificationSent=" + this.c + "}";
    }
}

