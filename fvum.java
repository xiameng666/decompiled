import java.util.Arrays;

public final class fvum {
    public final hecq a;
    public final long[] b;
    public final gxsx c;
    public final boolean d;
    public final gxfs e;

    public fvum() {
        throw null;
    }

    public fvum(hecq hecq0, long[] arr_v, gxsx gxsx0, boolean z, gxfs gxfs0) {
        this.a = hecq0;
        if(arr_v == null) {
            throw new NullPointerException("Null requestedMobileCommKeys");
        }
        this.b = arr_v;
        if(gxsx0 == null) {
            throw new NullPointerException("Null tilesResponse");
        }
        this.c = gxsx0;
        this.d = z;
        this.e = gxfs0;
    }

    public static fvum a(fvtr fvtr0, gxsx gxsx0, boolean z) {
        return new fvum(new hecu(fvtr0.c()), fvtr0.b(), gxsx0, z, fvtr0.e);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof fvum) && this.a.equals(((fvum)object0).a) && (Arrays.equals(this.b, ((((fvum)object0) instanceof fvum) ? ((fvum)object0).b : ((fvum)object0).b)) && ((ProtoLiteMessage)this.c).equals(((fvum)object0).c) && this.d == ((fvum)object0).d)) {
            return this.e == null ? ((fvum)object0).e == null : this.e.equals(((fvum)object0).e);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v2;
        int v = Arrays.hashCode(this.b);
        int v1 = (this.a.hashCode() ^ 1000003) * 1000003 ^ v;
        gxsx gxsx0 = this.c;
        if(((ProtoLiteMessage)gxsx0).isImmutable()) {
            v2 = ((ProtoLiteMessage)gxsx0).s();
        }
        else {
            int v3 = gxsx0.memoizedHashCode;
            if(v3 == 0) {
                v3 = ((ProtoLiteMessage)gxsx0).s();
                gxsx0.memoizedHashCode = v3;
            }
            v2 = v3;
        }
        int v4 = this.d ? 0x4CF : 0x4D5;
        return this.e == null ? ((v1 * 1000003 ^ v2) * 1000003 ^ v4) * 1000003 : this.e.hashCode() ^ ((v1 * 1000003 ^ v2) * 1000003 ^ v4) * 1000003;
    }

    @Override
    public final String toString() {
        String s = Arrays.toString(this.b);
        return "QueryResponse{requestedBssids=" + this.a.toString() + ", requestedMobileCommKeys=" + s + ", tilesResponse=" + this.c.toString() + ", requestSucceeded=" + this.d + ", glsRequestDebugInfo=" + this.e + "}";
    }
}

