public final class cnf implements cnd {
    private final chv a;
    private cht b;
    private cht c;
    private cht d;

    public cnf(chv chv0) {
        this.a = chv0;
    }

    public cnf(cik cik0) {
        this(new cne(cik0));
    }

    @Override  // cmx
    public final long a(cht cht0, cht cht1, cht cht2) {
        int v = cht0.b();
        long v2 = 0L;
        for(int v1 = 0; v1 < v; ++v1) {
            v2 = Math.max(v2, this.a.a(v1).e(cht0.a(v1), cht1.a(v1), cht2.a(v1)));
        }
        return v2;
    }

    @Override  // cmx
    public final cht b(cht cht0, cht cht1, cht cht2) {
        if(this.d == null) {
            this.d = cht2.c();
        }
        cht cht3 = this.d;
        if(cht3 == null) {
            ibuq.j("endVelocityVector");
            cht3 = null;
        }
        int v = cht3.b();
        for(int v1 = 0; v1 < v; ++v1) {
            cht cht4 = this.d;
            if(cht4 == null) {
                ibuq.j("endVelocityVector");
                cht4 = null;
            }
            cht4.e(v1, this.a.a(v1).b(cht0.a(v1), cht1.a(v1), cht2.a(v1)));
        }
        cht cht5 = this.d;
        if(cht5 == null) {
            ibuq.j("endVelocityVector");
            return null;
        }
        return cht5;
    }

    @Override  // cmx
    public final cht c(long v, cht cht0, cht cht1, cht cht2) {
        if(this.b == null) {
            this.b = cht0.c();
        }
        cht cht3 = this.b;
        if(cht3 == null) {
            ibuq.j("valueVector");
            cht3 = null;
        }
        int v1 = cht3.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            cht cht4 = this.b;
            if(cht4 == null) {
                ibuq.j("valueVector");
                cht4 = null;
            }
            cht4.e(v2, this.a.a(v2).c(v, cht0.a(v2), cht1.a(v2), cht2.a(v2)));
        }
        cht cht5 = this.b;
        if(cht5 == null) {
            ibuq.j("valueVector");
            return null;
        }
        return cht5;
    }

    @Override  // cmx
    public final cht d(long v, cht cht0, cht cht1, cht cht2) {
        if(this.c == null) {
            this.c = cht2.c();
        }
        cht cht3 = this.c;
        if(cht3 == null) {
            ibuq.j("velocityVector");
            cht3 = null;
        }
        int v1 = cht3.b();
        for(int v2 = 0; v2 < v1; ++v2) {
            cht cht4 = this.c;
            if(cht4 == null) {
                ibuq.j("velocityVector");
                cht4 = null;
            }
            cht4.e(v2, this.a.a(v2).d(v, cht0.a(v2), cht1.a(v2), cht2.a(v2)));
        }
        cht cht5 = this.c;
        if(cht5 == null) {
            ibuq.j("velocityVector");
            return null;
        }
        return cht5;
    }

    @Override  // cmx
    public final boolean e() {
        return false;
    }
}

