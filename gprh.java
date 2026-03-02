import android.util.SparseArray;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

public final class gprh {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    private final SparseArray e;

    public gprh(byte[] arr_b, int v) {
        this.a = arr_b;
        this.b = v;
        this.c = 0;
        this.d = -1;
        this.e = new SparseArray(16);
    }

    public final int a() {
        return (this.d >= 0 ? this.d : this.b) - this.c;
    }

    public final int b() {
        this.d(2);
        int v = this.c;
        int v1 = v + 1;
        this.c = v1;
        this.c = v + 2;
        return this.a[v1] & 0xFF | (this.a[v] & 0xFF) << 8;
    }

    public final int c() {
        this.d(1);
        int v = this.c;
        this.c = v + 1;
        return this.a[v] & 0xFF;
    }

    public final void d(int v) {
        if(this.a() >= v) {
            return;
        }
        throw new EOFException();
    }

    public final void e(byte[] arr_b) {
        this.d(arr_b.length);
        System.arraycopy(this.a, this.c, arr_b, 0, arr_b.length);
        this.c += arr_b.length;
    }

    public final void f(int v) {
        this.d(v);
        this.c += v;
    }

    public final String[] g() {
        ArrayList arrayList0 = new ArrayList(5);
        gprg gprg0 = null;
        while(this.a() > 0) {
            this.d(1);
            byte[] arr_b = this.a;
            int v = this.c;
            int v1 = arr_b[v];
            if(v1 == 0) {
                this.f(1);
                return (String[])arrayList0.toArray(new String[arrayList0.size()]);
            }
            if((v1 & 0xC0) == 0xC0) {
                int v2 = (this.c() & 0x3F) << 8 | this.c();
                int v3 = 0;
                if(gprg0 != null) {
                    gprg0.b = v2;
                }
                while(true) {
                    if(v2 == 0) {
                        break;
                    }
                    if(v3 > 0x80) {
                        throw new IOException("Invalid MDNS response packet: Too many labels.");
                    }
                    gprg gprg1 = (gprg)this.e.get(v2);
                    if(gprg1 == null) {
                        throw new IOException(String.format(Locale.ROOT, "Invalid label pointer: %04X", v2));
                    }
                    arrayList0.add(gprg1.a);
                    ++v3;
                    v2 = gprg1.b;
                    continue;
                }
                break;
            }
            int v4 = this.c();
            this.d(v4);
            String s = new String(arr_b, this.c, v4, StandardCharsets.UTF_8);
            this.c += v4;
            gprg gprg2 = new gprg(s);
            this.e.put(v, gprg2);
            if(gprg0 != null) {
                gprg0.b = v;
            }
            arrayList0.add(s);
            gprg0 = gprg2;
        }
        return (String[])arrayList0.toArray(new String[arrayList0.size()]);
    }
}

