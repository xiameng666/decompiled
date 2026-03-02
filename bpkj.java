import j..util.Objects;

final class bpkj implements Comparable {
    final double a;
    final double b;
    final float c;
    final bpko d;
    final gtch e;
    final gfsx f;

    public bpkj(gtch gtch0, bpko bpko0, gfsx gfsx0, double f, double f1, float f2) {
        this.e = gtch0;
        this.d = bpko0;
        this.f = gfsx0;
        this.a = f;
        this.b = f1;
        this.c = f2;
    }

    public final int a(bpkj bpkj0) {
        bpko bpko0 = bpkj0.d;
        bpko bpko1 = this.d;
        boolean z = bpko1.b;
        if(z != bpko0.b) {
            return z ? 1 : -1;
        }
        gtch gtch0 = this.e;
        int v = gtch0.b;
        int v1 = 0;
        gtch gtch1 = bpkj0.e;
        if(gtch1.b == 7) {
            v1 = 1;
        }
        if((v == 7 ? 1 : 0) != v1) {
            return v == 7 ? 1 : -1;
        }
        int v2 = Long.compare(bpko1.f, bpko0.f);
        if(v2 != 0) {
            return v2;
        }
        if(gtch0.b == 7) {
            int v3 = bpko1.d.compareTo(bpko0.d);
            if(v3 != 0) {
                return v3;
            }
            ByteString hfsf0 = gtch0.b == 7 ? ((ByteString)gtch0.c) : ByteString.b;
            return gtch1.b == 7 ? ByteString.c.compare(hfsf0, ((ByteString)gtch1.c)) : ByteString.c.compare(hfsf0, ByteString.b);
        }
        ByteString hfsf1 = gtch0.b == 6 ? ((ByteString)gtch0.c) : ByteString.b;
        return gtch1.b == 6 ? ByteString.c.compare(hfsf1, ((ByteString)gtch1.c)) : ByteString.c.compare(hfsf1, ByteString.b);
    }

    @Override
    public final int compareTo(Object object0) {
        return this.a(((bpkj)object0));
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof bpkj) && this.a(((bpkj)object0)) == 0;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(new Object[]{this.e, ((long)this.d.f)});
    }
}

