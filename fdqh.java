public final class fdqh {
    public final String a;
    public final fdpl b;
    public final String c;
    public final fdqi d;
    public final int e;

    public fdqh() {
        throw null;
    }

    public fdqh(String s, fdpl fdpl0, String s1, fdqi fdqi0, int v) {
        if(s == null) {
            throw new NullPointerException("Null nodeId");
        }
        this.a = s;
        if(fdpl0 == null) {
            throw new NullPointerException("Null appKey");
        }
        this.b = fdpl0;
        if(s1 == null) {
            throw new NullPointerException("Null name");
        }
        this.c = s1;
        if(fdqi0 == null) {
            throw new NullPointerException("Null type");
        }
        this.d = fdqi0;
        this.e = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : (object0 instanceof fdqh) && this.a.equals(((fdqh)object0).a) && this.b.equals(((fdqh)object0).b) && this.c.equals(((fdqh)object0).c) && this.d.equals(((fdqh)object0).d) && this.e == ((fdqh)object0).e;
    }

    @Override
    public final int hashCode() {
        return this.e ^ ((((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        String s = this.b.toString();
        String s1 = this.d.toString();
        switch(this.e) {
            case 1: {
                return "CapabilityInfo{nodeId=" + this.a + ", appKey=" + s + ", name=" + this.c + ", type=" + s1 + ", processor=" + "UNKNOWN" + "}";
            }
            case 2: {
                return "CapabilityInfo{nodeId=" + this.a + ", appKey=" + s + ", name=" + this.c + ", type=" + s1 + ", processor=" + "AP" + "}";
            }
            default: {
                return "CapabilityInfo{nodeId=" + this.a + ", appKey=" + s + ", name=" + this.c + ", type=" + s1 + ", processor=" + "MCU" + "}";
            }
        }
    }
}

