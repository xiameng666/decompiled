import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public final class iaof_metadata {
    public static final Logger a;
    public static final ianw b;
    public static final ianu c;
    static final ghjc d;
    public Object[] e;
    public int f;

    static {
        iaof_metadata.a = Logger.getLogger(iaof_metadata.class.getName());
        iaof_metadata.b = new ianr();
        iaof_metadata.c = new ians();
        iaof_metadata.d = ghjc.d.g();
    }

    public iaof_metadata() {
    }

    public iaof_metadata(int v, Object[] arr_object) {
        this.f = v;
        this.e = arr_object;
    }

    public iaof_metadata(byte[][] arr2_b) {
        this(arr2_b.length >> 1, arr2_b);
    }

    public final int a() {
        return this.f + this.f;
    }

    public final Iterable b(iaoa iaoa0) {
        for(int v = 0; v < this.f; ++v) {
            byte[] arr_b = this.k(v);
            if(Arrays.equals(iaoa0.b, arr_b)) {
                return new ianz(this, iaoa0, v);
            }
        }
        return null;
    }

    public final Iterable c(iaoa iaoa0) {
        if(!this.r()) {
            int v1 = 0;
            Iterable iterable0 = null;
            for(int v = 0; v < this.f; ++v) {
                byte[] arr_b = this.k(v);
                if(Arrays.equals(iaoa0.b, arr_b)) {
                    if(iterable0 == null) {
                        iterable0 = new ArrayList();
                    }
                    ((List)iterable0).add(this.f(v, iaoa0));
                }
                else {
                    this.p(v1, this.k(v));
                    this.q(v1, this.e(v));
                    ++v1;
                }
            }
            Arrays.fill(this.e, v1 + v1, this.a(), null);
            this.f = v1;
            return iterable0;
        }
        return null;
    }

    public final Object d(iaoa iaoa0) {
        int v = this.f;
        while(true) {
            --v;
            if(v < 0) {
                break;
            }
            byte[] arr_b = this.k(v);
            if(Arrays.equals(iaoa0.b, arr_b)) {
                return this.f(v, iaoa0);
            }
        }
        return null;
    }

    public final Object e(int v) {
        return this.e[v + v + 1];
    }

    public final Object f(int v, iaoa iaoa0) {
        Object object0 = this.e(v);
        if((object0 instanceof byte[])) {
            return iaoa0.a(((byte[])object0));
        }
        if(iaoa0.c()) {
            ianx ianx0 = iaoc.a(iaoa0);
            return ianx0 == null ? iaoa0.a(((iaoc)object0).c()) : ianx0.b(((iaoc)object0).b());
        }
        return iaoa0.a(((iaoc)object0).c());
    }

    public final void g(iaoa iaoa0) {
        if(!this.r()) {
            int v1 = 0;
            for(int v = 0; v < this.f; ++v) {
                byte[] arr_b = this.k(v);
                if(!Arrays.equals(iaoa0.b, arr_b)) {
                    this.p(v1, this.k(v));
                    this.q(v1, this.e(v));
                    ++v1;
                }
            }
            Arrays.fill(this.e, v1 + v1, this.a(), null);
            this.f = v1;
        }
    }

    public final void h(iaof_metadata iaof0) {
        if(iaof0.r()) {
            return;
        }
        if(this.r() || this.n() - this.a() < iaof0.a()) {
            this.o(this.a() + iaof0.a());
        }
        System.arraycopy(iaof0.e, 0, this.e, this.a(), iaof0.a());
        this.f += iaof0.f;
    }

    public final void i(iaoa iaoa0, Object object0) {
        gftb.z(iaoa0, "key");
        gftb.z(object0, "value");
        if(this.a() == 0 || this.a() == this.n()) {
            int v = this.a();
            this.o(Math.max(v + v, 8));
        }
        this.p(this.f, iaoa0.b);
        if(iaoa0.c()) {
            int v1 = this.f;
            ianx ianx0 = iaoc.a(iaoa0);
            gftb.check(ianx0);
            this.q(v1, new iaoc(ianx0, object0));
        }
        else {
            int v2 = this.f;
            this.e[v2 + v2 + 1] = iaoa0.b(object0);
        }
        ++this.f;
    }

    public final boolean j(iaoa iaoa0) {
        for(int v = 0; v < this.f; ++v) {
            byte[] arr_b = this.k(v);
            if(Arrays.equals(iaoa0.b, arr_b)) {
                return true;
            }
        }
        return false;
    }

    public final byte[] k(int v) {
        return (byte[])this.e[v + v];
    }

    public static byte[] l(InputStream inputStream0) {
        try {
            return ghjj.g(inputStream0);
        }
        catch(IOException iOException0) {
            throw new RuntimeException("failure reading serialized stream", iOException0);
        }
    }

    public final byte[] m(int v) {
        Object object0 = this.e(v);
        return (object0 instanceof byte[]) ? ((byte[])object0) : ((iaoc)object0).c();
    }

    private final int n() {
        return this.e == null ? 0 : this.e.length;
    }

    private final void o(int v) {
        Object[] arr_object = new Object[v];
        if(!this.r()) {
            System.arraycopy(this.e, 0, arr_object, 0, this.a());
        }
        this.e = arr_object;
    }

    private final void p(int v, byte[] arr_b) {
        this.e[v + v] = arr_b;
    }

    private final void q(int v, Object object0) {
        if((this.e instanceof byte[][])) {
            this.o(this.n());
        }
        this.e[v + v + 1] = object0;
    }

    private final boolean r() {
        return this.f == 0;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Metadata(");
        for(int v = 0; v < this.f; ++v) {
            if(v != 0) {
                stringBuilder0.append(',');
            }
            String s = new String(this.k(v), StandardCharsets.US_ASCII);
            stringBuilder0.append(s);
            stringBuilder0.append('=');
            if(s.endsWith("-bin")) {
                byte[] arr_b = this.m(v);
                stringBuilder0.append(iaof_metadata.d.o(arr_b));
            }
            else {
                stringBuilder0.append(new String(this.m(v), StandardCharsets.US_ASCII));
            }
        }
        stringBuilder0.append(')');
        return stringBuilder0.toString();
    }
}

