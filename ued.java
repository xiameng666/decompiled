import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class ued implements uay {
    private static final uql b;
    private final uay c;
    private final uay d;
    private final int e;
    private final int f;
    private final Class g;
    private final ubc h;
    private final ubg i;
    private final ues j;

    static {
        ued.b = new uql(50L);
    }

    public ued(ues ues0, uay uay0, uay uay1, int v, int v1, ubg ubg0, Class class0, ubc ubc0) {
        this.j = ues0;
        this.c = uay0;
        this.d = uay1;
        this.e = v;
        this.f = v1;
        this.i = ubg0;
        this.g = class0;
        this.h = ubc0;
    }

    @Override  // uay
    public final void a(MessageDigest messageDigest0) {
        ues ues0 = this.j;
        byte[] arr_b = (byte[])ues0.e(byte[].class);
        ByteBuffer.wrap(arr_b).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest0);
        this.c.a(messageDigest0);
        messageDigest0.update(arr_b);
        ubg ubg0 = this.i;
        if(ubg0 != null) {
            ubg0.a(messageDigest0);
        }
        this.h.a(messageDigest0);
        Class class0 = this.g;
        uql uql0 = ued.b;
        byte[] arr_b1 = (byte[])uql0.g(class0);
        if(arr_b1 == null) {
            arr_b1 = class0.getName().getBytes(ued.a);
            uql0.h(class0, arr_b1);
        }
        messageDigest0.update(arr_b1);
        ues0.c(arr_b);
    }

    @Override  // uay
    public final boolean equals(Object object0) {
        return (object0 instanceof ued) && this.f == ((ued)object0).f && this.e == ((ued)object0).e && uqq.j(this.i, ((ued)object0).i) && this.g.equals(((ued)object0).g) && this.c.equals(((ued)object0).c) && this.d.equals(((ued)object0).d) && this.h.equals(((ued)object0).h);
    }

    @Override  // uay
    public final int hashCode() {
        ubg ubg0 = this.i;
        int v = ((this.c.hashCode() * 0x1F + this.d.hashCode()) * 0x1F + this.e) * 0x1F + this.f;
        if(ubg0 != null) {
            v = v * 0x1F + ubg0.hashCode();
        }
        return (v * 0x1F + this.g.hashCode()) * 0x1F + this.h.hashCode();
    }

    @Override
    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation=\'" + this.i + "\', options=" + this.h + "}";
    }
}

