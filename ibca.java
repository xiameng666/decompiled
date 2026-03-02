import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Locale;

public final class ibca {
    public int a;
    public ibfv b;
    public int c;
    public ialh d;
    public final ibby e;
    public final ByteBuffer f;
    public final ibfw g;
    public final ibfn h;
    public boolean i;
    public int j;
    public int k;
    public long l;
    private final ibbz m;

    public ibca(ibbz ibbz0, ibfw ibfw0, ibfn ibfn0) {
        this.a = -1;
        this.d = ialf.a;
        this.e = new ibby(this);
        this.f = ByteBuffer.allocate(5);
        this.k = -1;
        this.m = ibbz0;
        this.g = ibfw0;
        this.h = ibfn0;
    }

    public static int a(InputStream inputStream0, OutputStream outputStream0) {
        MessageLite hfvm0 = ((ibjg)inputStream0).a;
        if(hfvm0 != null) {
            int v = hfvm0.getSerializedSize();
            ((ibjg)inputStream0).a.writeToStream(outputStream0);
            ((ibjg)inputStream0).a = null;
            return v;
        }
        ByteArrayInputStream byteArrayInputStream0 = ((ibjg)inputStream0).c;
        if(byteArrayInputStream0 != null) {
            gftb.z(outputStream0, "outputStream cannot be null!");
            byte[] arr_b = new byte[0x2000];
            long v1 = 0L;
            int v2;
            while((v2 = byteArrayInputStream0.read(arr_b)) != -1) {
                outputStream0.write(arr_b, 0, v2);
                v1 += (long)v2;
            }
            ((ibjg)inputStream0).c = null;
            return (int)v1;
        }
        return 0;
    }

    public final void b(boolean z, boolean z1) {
        ibfv ibfv0 = this.b;
        this.b = null;
        this.m.u(ibfv0, z, z1, this.j);
        this.j = 0;
    }

    public final void c(ibbx ibbx0, boolean z) {
        List list0 = ibbx0.a;
        int v = 0;
        for(Object object0: list0) {
            v += ((ibfv)object0).a();
        }
        if(this.a >= 0 && v > this.a) {
            throw new iapn(iapk.k.f(String.format(Locale.US, "message too large %d > %d", v, ((int)this.a))));
        }
        this.f.clear();
        this.f.put(((byte)z)).putInt(v);
        ibfv ibfv0 = this.g.a(5);
        ibfv0.d(this.f.array(), 0, this.f.position());
        if(v == 0) {
            this.b = ibfv0;
            return;
        }
        ibbz ibbz0 = this.m;
        ibbz0.u(ibfv0, false, false, this.j - 1);
        this.j = 1;
        for(int v1 = 0; v1 < list0.size() - 1; ++v1) {
            ibbz0.u(((ibfv)list0.get(v1)), false, false, 0);
        }
        this.b = (ibfv)list0.get(list0.size() - 1);
        this.l = (long)v;
    }

    public final void d(byte[] arr_b, int v, int v1) {
        boolean z;
        while(v1 > 0) {
            if(this.b != null && this.b.b() == 0) {
                this.b(false, false);
            }
            if(this.b == null) {
                if(this.c > 0) {
                    z = true;
                }
                gftb.r(z, "knownLengthPendingAllocation reached 0");
                ibfv ibfv0 = this.g.a(this.c);
                this.b = ibfv0;
                this.c -= Math.min(this.c, ibfv0.b());
            }
            z = false;
            int v2 = Math.min(v1, this.b.b());
            this.b.d(arr_b, v, v2);
            v += v2;
            v1 -= v2;
        }
    }
}

