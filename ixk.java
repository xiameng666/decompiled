public final class ixk {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final iwc g;

    public ixk(iwc iwc0, int v, int v1, int v2, int v3, float f, float f1) {
        this.g = iwc0;
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = f;
        this.f = f1;
    }

    public final float a(float f) {
        return f + this.e;
    }

    public final int b() {
        return this.b - this.a;
    }

    public final int c(int v) {
        return v + this.a;
    }

    public final int d(int v) {
        return v + this.c;
    }

    public final int e(int v) {
        return ibwt.j(v, this.a, this.b) - this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ixk)) {
            return false;
        }
        if(!ibuq.m(this.g, ((ixk)object0).g)) {
            return false;
        }
        if(this.a != ((ixk)object0).a) {
            return false;
        }
        if(this.b != ((ixk)object0).b) {
            return false;
        }
        if(this.c != ((ixk)object0).c) {
            return false;
        }
        if(this.d != ((ixk)object0).d) {
            return false;
        }
        return Float.compare(this.e, ((ixk)object0).e) == 0 ? Float.compare(this.f, ((ixk)object0).f) == 0 : false;
    }

    public final int f(int v) {
        return v - this.c;
    }

    public final long g(long v, boolean z) {
        if(z) {
            return jbk.i(v, jbk.a) ? jbk.a : jbl.a(this.c(jbk.e(v)), this.c(jbk.a(v)));
        }
        return jbl.a(this.c(jbk.e(v)), this.c(jbk.a(v)));
    }

    public final hka h(hka hka0) {
        return hka0.f(((long)Float.floatToRawIntBits(0.0f)) << 0x20 | ((long)Float.floatToRawIntBits(this.e)) & 0xFFFFFFFFL);
    }

    @Override
    public final int hashCode() {
        return (((((this.g.hashCode() * 0x1F + this.a) * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d) * 0x1F + Float.floatToIntBits(this.e)) * 0x1F + Float.floatToIntBits(this.f);
    }

    public final hka i(hka hka0) {
        return hka0.f(((long)Float.floatToRawIntBits(0.0f)) << 0x20 | ((long)Float.floatToRawIntBits(-this.e)) & 0xFFFFFFFFL);
    }

    public static long j(ixk ixk0, long v) {
        return ixk0.g(v, true);
    }

    @Override
    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.g + ", startIndex=" + this.a + ", endIndex=" + this.b + ", startLineIndex=" + this.c + ", endLineIndex=" + this.d + ", top=" + this.e + ", bottom=" + this.f + ')';
    }
}

