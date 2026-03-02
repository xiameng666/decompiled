import java.util.Objects;

final class cpp implements cnd {
    private final cnd a;
    private final long b;

    public cpp(cnd cnd0, long v) {
        this.a = cnd0;
        this.b = v;
    }

    @Override  // cmx
    public final long a(cht cht0, cht cht1, cht cht2) {
        return this.b;
    }

    @Override  // cmx
    public final cht b(cht cht0, cht cht1, cht cht2) {
        return cmw.a(this, cht0, cht1, cht2);
    }

    @Override  // cmx
    public final cht c(long v, cht cht0, cht cht1, cht cht2) {
        return this.a.c(this.b - v, cht1, cht0, cht2);
    }

    @Override  // cmx
    public final cht d(long v, cht cht0, cht cht1, cht cht2) {
        cht cht3 = this.a.d(this.b - v, cht1, cht0, cht2);
        if((cht3 instanceof chp)) {
            return new chp(-((chp)cht3).a);
        }
        if((cht3 instanceof chq)) {
            return new chq(-((chq)cht3).a, -((chq)cht3).b);
        }
        if((cht3 instanceof chr)) {
            return new chr(-((chr)cht3).a, -((chr)cht3).b, -((chr)cht3).c);
        }
        if((cht3 instanceof chs)) {
            return new chs(-((chs)cht3).a, -((chs)cht3).b, -((chs)cht3).c, -((chs)cht3).d);
        }
        Objects.toString(cht3);
        throw new RuntimeException("Unknown AnimationVector: " + cht3);
    }

    @Override  // cmx
    public final boolean e() {
        return false;
    }
}

