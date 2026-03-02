public final class ctvt {
    public final String a;
    public final String b;

    public ctvt(String s, String s1) {
        ibuq.f(s, "id");
        ibuq.f(s1, "displayName");
        super();
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ctvt)) {
            return false;
        }
        return ibuq.m(this.a, ((ctvt)object0).a) ? ibuq.m(this.b, ((ctvt)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "NotificationSyncServerDevice(id=" + this.a + ", displayName=" + this.b + ")";
    }
}

