import java.util.List;

public final class aoi implements bpa {
    public final aow a;
    public final List b;
    public final int c;
    public final int d;
    public final int e;

    public aoi(aow aow0, List list0, int v, int v1, int v2) {
        this.a = aow0;
        this.b = list0;
        this.c = v;
        this.d = v1;
        this.e = v2;
    }

    @Override  // bpa
    public final gmcd a(Object object0) {
        Void void0 = (Void)object0;
        arf arf0 = this.a.e.a(this.c, this.d, this.e);
        gmcd gmcd0 = bpt.g(bpf.a(arf0.a(this.d)), new aqx(arf0, this.b, this.d), arf0.c);
        gmcd0.hB(new aqy(arf0), arf0.c);
        return bpt.d(gmcd0);
    }
}

