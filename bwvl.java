import j..util.Objects;

public final class bwvl implements Comparable {
    final String a;
    final String b;
    final String c;

    public bwvl(bwnr bwnr0) {
        this((bwnr0.c == null ? bwnq.a : bwnr0.c).f, (bwnr0.c == null ? bwnq.a : bwnr0.c).d, (bwnx.a((bwnr0.d == null ? bwny.a : bwnr0.d).d) == 3 ? Integer.toString((bwnr0.c == null ? bwnq.a : bwnr0.c).c) : null));
    }

    public bwvl(String s, String s1) {
        this(s, s1, null);
    }

    public bwvl(String s, String s1, String s2) {
        this.a = s;
        this.b = s1;
        this.c = s2;
    }

    public final int a(bwvl bwvl0) {
        String s = this.a;
        if(s == null) {
            return bwvl0.a == null ? 0 : -1;
        }
        int v = bwvl0.a == null ? 1 : s.compareTo(bwvl0.a);
        if(v != 0) {
            return v;
        }
        String s1 = this.b;
        if(s1 == null) {
            return bwvl0.b == null ? 0 : -1;
        }
        int v1 = bwvl0.b == null ? 1 : s1.compareTo(bwvl0.b);
        if(v1 != 0) {
            return v1;
        }
        String s2 = this.c;
        if(s2 == null) {
            return bwvl0.c == null ? 0 : -1;
        }
        return bwvl0.c == null ? 1 : s2.compareTo(bwvl0.c);
    }

    public final String b() {
        gfss gfss0 = new gfss("-");
        return new gfsp(gfss0, gfss0).g(this.a, this.b, new Object[]{this.c});
    }

    public final String c() {
        String s = !bbnp.p() || (this.b == null || !this.b.startsWith("messages/")) ? this.b : "messages/<redacted>";
        gfss gfss0 = new gfss("-");
        return new gfsp(gfss0, gfss0).g(this.a, s, new Object[]{this.c});
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((bwvl)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bwvl) && this.a(((bwvl)object0)) == 0;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }
}

