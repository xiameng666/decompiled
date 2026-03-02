import com.google.android.libraries.tapandpay.pay.pass.valuable.model.Valuable;
import java.math.BigInteger;
import java.util.Arrays;

public final class dvok extends fgxh {
    public static final bboh a;
    public final Valuable b;
    public final byte[] c;
    private final fgxg e;
    private final byte[] f;
    private final byte[] g;
    private final fgzm h;
    private final Long i;
    private final byte[] j;
    private final fgzm k;

    static {
        dvok.a = bboh.b("Pay", bbcu.cZ);
    }

    public dvok() {
        throw null;
    }

    public dvok(Valuable valuable0, fgxg fgxg0, byte[] arr_b, byte[] arr_b1, byte[] arr_b2, fgzm fgzm0, Long long0, byte[] arr_b3, fgzm fgzm1) {
        if(valuable0 == null) {
            throw new NullPointerException("Null valuable");
        }
        this.b = valuable0;
        if(fgxg0 == null) {
            throw new NullPointerException("Null type");
        }
        this.e = fgxg0;
        if(arr_b == null) {
            throw new NullPointerException("Null serviceId");
        }
        this.f = arr_b;
        if(arr_b1 == null) {
            throw new NullPointerException("Null issuerId");
        }
        this.g = arr_b1;
        if(arr_b2 == null) {
            throw new NullPointerException("Null serviceNumberId");
        }
        this.c = arr_b2;
        if(fgzm0 == null) {
            throw new NullPointerException("Null serviceNumberIdFormat");
        }
        this.h = fgzm0;
        this.i = long0;
        this.j = arr_b3;
        if(fgzm1 == null) {
            throw new NullPointerException("Null pinFormat");
        }
        this.k = fgzm1;
    }

    @Override  // fgxh
    public final fgxe a() {
        return fgxe.b;
    }

    @Override  // fgxh
    public final fgxg b() {
        return this.e;
    }

    @Override  // fgxh
    public final byte[] c() {
        return this.g;
    }

    @Override  // fgxh
    public final byte[] d() {
        return this.f;
    }

    @Override  // fgxh
    public final byte[] e() {
        return this.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if((object0 instanceof dvok) && this.b.equals(((dvok)object0).b) && this.e.equals(((dvok)object0).e) && Arrays.equals(this.f, ((((dvok)object0) instanceof dvok) ? ((dvok)object0).f : ((dvok)object0).f)) && Arrays.equals(this.g, ((((dvok)object0) instanceof dvok) ? ((dvok)object0).g : ((dvok)object0).g)) && (Arrays.equals(this.c, ((((dvok)object0) instanceof dvok) ? ((dvok)object0).c : ((dvok)object0).c)) && this.h.equals(((dvok)object0).h))) {
            Long long0 = this.i;
            if(long0 == null) {
                return ((dvok)object0).i == null ? Arrays.equals(this.j, ((((dvok)object0) instanceof dvok) ? ((dvok)object0).j : ((dvok)object0).j)) && this.k.equals(((dvok)object0).k) : false;
            }
            return long0.equals(((dvok)object0).i) ? Arrays.equals(this.j, ((((dvok)object0) instanceof dvok) ? ((dvok)object0).j : ((dvok)object0).j)) && this.k.equals(((dvok)object0).k) : false;
        }
        return false;
    }

    public static byte[] g(String s) {
        return glxd.h(fgzv.a(fgzv.b(s)));
    }

    public static byte[] h(String s) {
        return new BigInteger(s).toByteArray();
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.f);
        int v1 = Arrays.hashCode(this.g);
        int v2 = Arrays.hashCode(this.c);
        return this.k.hashCode() ^ (((((((((this.b.hashCode() ^ 1000003) * 1000003 ^ this.e.hashCode()) * 1000003 ^ v) * 1000003 ^ v1) * 1000003 ^ v2) * 1000003 ^ this.h.hashCode()) * 1000003 ^ 0x4D5) * 1000003 ^ (this.i == null ? 0 : this.i.hashCode())) * 1000003 ^ Arrays.hashCode(this.j)) * 1000003;
    }

    @Override  // fgxh
    public final fgzm i() {
        return this.k;
    }

    @Override  // fgxh
    public final fgzm j() {
        return this.h;
    }

    @Override  // fgxh
    public final Long k() {
        return this.i;
    }

    @Override  // fgxh
    public final byte[] l() {
        return this.j;
    }

    @Override  // fgxh
    public final void m() {
    }
}

