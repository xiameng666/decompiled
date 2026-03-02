import android.net.Uri;

public final class flap {
    public final ggtl a;
    private final hfuc b;
    private final frii c;
    private final fgvt d;

    public flap() {
        throw null;
    }

    public flap(hfuc hfuc0, frii frii0, fgvt fgvt0, ggtl ggtl0) {
        this.b = hfuc0;
        this.c = frii0;
        this.d = fgvt0;
        this.a = ggtl0;
    }

    public final flae a(Uri uri0) {
        hfuc hfuc0 = this.b;
        if(hfuc0 == null) {
            throw new AssertionError("eventType OR enumMap should be non-null");
        }
        Uri uri1 = uri0.buildUpon().appendPath("sync_metadata.pb").build();
        frie frie0 = frif.a();
        frie0.e(((MessageLite)flak.a));
        frie0.f(uri1);
        frie0.h(frhj.a);
        frif frif0 = frie0.a();
        flaq flaq0 = new flaq(this.c.a(frif0));
        return new flae(new fkzv(hfuc0), flaq0, this.d);
    }

    public static flao b(hfuc hfuc0) {
        flao flao0 = new flao();
        flao0.a = hfuc0;
        flao0.b = new fgvy();
        flao0.c = ggtn.b("mdi.sync.stats");
        return flao0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof flap)) {
            hfuc hfuc0 = this.b;
            if(hfuc0 == null) {
                return ((flap)object0).b == null ? this.c.equals(((flap)object0).c) && this.d.equals(((flap)object0).d) && this.a.equals(((flap)object0).a) : false;
            }
            return hfuc0.equals(((flap)object0).b) ? this.c.equals(((flap)object0).c) && this.d.equals(((flap)object0).d) && this.a.equals(((flap)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.b == null ? this.a.hashCode() ^ ((0x22CD8CDB ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 : this.a.hashCode() ^ (((this.b.hashCode() ^ 0xD5009D89) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003;
    }

    @Override
    public final String toString() {
        return "PdsSyncMetadataManagerFactory{eventType=null, enumMap=" + this.b + ", pdsFactory=" + this.c + ", clock=" + this.d + ", logger=" + this.a + "}";
    }
}

