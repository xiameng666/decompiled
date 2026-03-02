public final class znp extends aaem {
    public final gged_interceptors a;
    public final String b;
    public final boolean c;
    public final int d;
    private final String e;

    public znp(gged_interceptors gged0, String s, String s1, boolean z, int v) {
        ibuq.f(gged0, "hiddenCardKeys");
        ibuq.f(s, "title");
        ibuq.f(s1, "accessibilityAction");
        super();
        this.a = gged0;
        this.b = s;
        this.e = s1;
        this.c = z;
        this.d = v;
    }

    @Override  // aaem
    public final int a() {
        return 10;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof znp)) {
            return false;
        }
        if(!ibuq.m(this.a, ((znp)object0).a)) {
            return false;
        }
        if(!ibuq.m(this.b, ((znp)object0).b)) {
            return false;
        }
        if(!ibuq.m(this.e, ((znp)object0).e)) {
            return false;
        }
        return this.c == ((znp)object0).c ? this.d == ((znp)object0).d : false;
    }

    @Override
    public final int hashCode() {
        int v = (this.a.hashCode() * 0x1F + this.b.hashCode()) * 0x1F + this.e.hashCode();
        return this.c ? (v * 0x1F + 0x4CF) * 0x1F + this.d : (v * 0x1F + 0x4D5) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "AdviceCardOverflowListItem(hiddenCardKeys=" + this.a + ", title=" + this.b + ", accessibilityAction=" + this.e + ", isExpanded=" + this.c + ", count=" + this.d + ")";
    }
}

