import android.os.ParcelUuid;
import android.util.Base64;
import java.util.Arrays;

public final class ddkv {
    public static final ParcelUuid a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final int e;
    public final int f;
    public final int g;
    public final int h;
    public final cuuq i;
    public final boolean j;
    private final cuur k;
    private final byte[] l;
    private final byte[] m;

    static {
        ddkv.a = cutq.a("FE2C");
        byte[] arr_b = bboy.d("FC128E");
        ddkv.b = arr_b;
        byte[] arr_b1 = Base64.encode(arr_b, 11);
        ddkv.c = arr_b1;
        ddkv.d = bboy.d(new String(new char[arr_b1.length + arr_b1.length]).replace('\u0000', 'F'));
        ddkv.e = arr_b.length + 2;
    }

    public ddkv(int v, int v1, int v2, cuur cuur0, cuuq cuuq0, byte[] arr_b, byte[] arr_b1, boolean z) {
        this.f = v;
        this.g = v1;
        this.h = v2;
        this.k = cuur0;
        this.i = cuuq0;
        this.l = arr_b;
        this.m = arr_b1;
        this.j = z;
    }

    public static int a() {
        return -Math.abs(((int)hvqs.a.aT().h()));
    }

    final cuur b() {
        return this.d() ? this.k : null;
    }

    public final boolean c() {
        return this.l != null && this.m != null;
    }

    public final boolean d() {
        return this.k != null && this.i != null;
    }

    public final byte[] e() {
        return this.c() ? this.l : null;
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof ddkv) && bata.b(Integer.valueOf(this.f), Integer.valueOf(((ddkv)object0).f)) && bata.b(Integer.valueOf(this.g), Integer.valueOf(((ddkv)object0).g)) && bata.b(Integer.valueOf(this.h), Integer.valueOf(((ddkv)object0).h)) && bata.b(this.k, ((ddkv)object0).k) && bata.b(this.i, ((ddkv)object0).i) && Arrays.equals(this.l, ((ddkv)object0).l) && Arrays.equals(this.m, ((ddkv)object0).m) && bata.b(Boolean.valueOf(this.j), Boolean.valueOf(((ddkv)object0).j));
    }

    public final byte[] f() {
        return this.c() ? this.m : null;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((int)this.g), ((int)this.f), ((int)this.h), this.k, this.i, this.l, this.m, Boolean.valueOf(this.j)});
    }
}

