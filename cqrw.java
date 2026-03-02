import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.EOFException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;

public final class cqrw {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    private final SparseArray e;

    public cqrw(DatagramPacket datagramPacket0) {
        this.a = datagramPacket0.getData();
        this.b = datagramPacket0.getLength();
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

    public final void e(int v) {
        this.d(v);
        this.c += v;
    }

    public final String[] f() {
        ArrayList arrayList0 = new ArrayList(5);
        SparseBooleanArray sparseBooleanArray0 = new SparseBooleanArray();
        cqrv cqrv0 = null;
        while(this.a() > 0) {
            this.d(1);
            byte[] arr_b = this.a;
            int v = this.c;
            int v1 = arr_b[v];
            if(v1 == 0) {
                this.e(1);
                return (String[])arrayList0.toArray(new String[0]);
            }
            if((v1 & 0xC0) == 0xC0) {
                int v2 = (this.c() & 0x3F) << 8 | this.c();
                if(cqrv0 != null) {
                    cqrv0.b = v2;
                }
                while(true) {
                    if(v2 == 0) {
                        break;
                    }
                    if(sparseBooleanArray0.get(v2)) {
                        throw new IOException("Invalid MDNS response packet: Infinite Label loop found.");
                    }
                    sparseBooleanArray0.put(v2, true);
                    cqrv cqrv1 = (cqrv)this.e.get(v2);
                    if(cqrv1 == null) {
                        throw new IOException(String.format(Locale.ROOT, "Invalid label pointer: %04X", v2));
                    }
                    arrayList0.add(cqrv1.a);
                    v2 = cqrv1.b;
                    continue;
                }
                break;
            }
            int v3 = this.c();
            this.d(v3);
            String s = new String(arr_b, this.c, v3, StandardCharsets.UTF_8);
            this.c += v3;
            cqrv cqrv2 = new cqrv(s);
            this.e.put(v, cqrv2);
            if(cqrv0 != null) {
                cqrv0.b = v;
            }
            arrayList0.add(s);
            cqrv0 = cqrv2;
        }
        return (String[])arrayList0.toArray(new String[0]);
    }
}

