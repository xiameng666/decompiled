public final class cjay {
    public final String a;
    private final int b;
    private final String c;

    public cjay(int v, String s) {
        ibuq.f(s, "packageName");
        super();
        this.b = v;
        this.a = s;
        this.c = null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof cjay)) {
            return false;
        }
        if(this.b != ((cjay)object0).b) {
            return false;
        }
        return ibuq.m(this.a, ((cjay)object0).a) ? ibuq.m(null, null) : false;
    }

    @Override
    public final int hashCode() {
        return (this.b * 0x1F + this.a.hashCode()) * 0x1F;
    }

    @Override
    public final String toString() {
        return "Source(uid=" + this.b + ", packageName=" + this.a + ", attributionTag=null)";
    }
}

