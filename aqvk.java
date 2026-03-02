public final class aqvk {
    public final aqvj a;
    public final String b;
    public final Exception c;

    public aqvk() {
        throw null;
    }

    public aqvk(aqvj aqvj0, String s, Exception exception0) {
        if(aqvj0 == null) {
            throw new NullPointerException("Null statusOutcome");
        }
        this.a = aqvj0;
        this.b = s;
        this.c = exception0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof aqvk) && this.a.equals(((aqvk)object0).a)) {
            String s = this.b;
            if(s == null) {
                if(((aqvk)object0).b == null) {
                    return this.c == null ? ((aqvk)object0).c == null : this.c.equals(((aqvk)object0).c);
                }
            }
            else if(s.equals(((aqvk)object0).b)) {
                return this.c == null ? ((aqvk)object0).c == null : this.c.equals(((aqvk)object0).c);
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode() ^ 1000003;
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        Exception exception0 = this.c;
        if(exception0 != null) {
            v1 = exception0.hashCode();
        }
        return (v * 1000003 ^ v2) * 1000003 ^ v1;
    }

    @Override
    public final String toString() {
        return "PhotosBackupStatus{statusOutcome=" + this.a.toString() + ", accountName=" + this.b + ", exception=" + this.c + "}";
    }
}

