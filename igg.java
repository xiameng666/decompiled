import java.util.Map;

public final class igg extends idr {
    public igg(ids ids0) {
        super(ids0);
    }

    @Override  // idr
    protected final int a(ihy ihy0, hxw hxw0) {
        igm igm0 = ihy0.C();
        ibuq.c(igm0);
        return igm0.ee(hxw0);
    }

    @Override  // idr
    protected final long b(ihy ihy0, long v) {
        igm igm0 = ihy0.C();
        ibuq.c(igm0);
        return hjz.d(((long)Float.floatToRawIntBits(jlf.b(igm0.h))) & 0xFFFFFFFFL | ((long)Float.floatToRawIntBits(jlf.a(igm0.h))) << 0x20, v);
    }

    @Override  // idr
    protected final Map c(ihy ihy0) {
        igm igm0 = ihy0.C();
        ibuq.c(igm0);
        return igm0.K().e();
    }
}

