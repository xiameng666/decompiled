import j..util.Objects;
import java.io.File;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;

public final class fvrs {
    public final fwyk a;
    public final fwyi b;
    public final gwwo c;

    public fvrs(gwwo gwwo0, fwyi fwyi0, fwyk fwyk0) {
        Objects.requireNonNull(gwwo0);
        this.c = gwwo0;
        super();
        this.b = fwyi0;
        this.a = fwyk0;
    }

    public final File a() {
        if(huqs.c()) {
            fwyk fwyk0 = this.a;
            if(fwyk0.i() == null) {
                return new File(ccsb.a.a("cfpc1"));
            }
            ccsg ccsg0 = ccsb.a;
            File file0 = fwyk0.i();
            gftb.check(file0);
            return new File(ccsg0.b(file0, "cfpc1"));
        }
        return new File(this.a.i(), "cfpc1");
    }

    public final void b(int v) {
        if(!this.a.n()) {
            return;
        }
        fyba.c(this.c()[v]);
    }

    public final File[] c() {
        File[] arr_file = new File[1];
        File file0 = this.a();
        arr_file[0] = huqs.c() ? new File(ccsb.a.b(file0, "cfpc1." + 0)) : new File(file0, "cfpc1." + 0);
        return arr_file;
    }

    public final void d(byte[] arr_b) {
        gwwo gwwo0 = this.c;
        fwze fwze0 = gwwo0.d;
        fwze0.mJ().a();
        try {
            gxmk gxmk0 = gwwo0.k;
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            gwps gwps0 = new gwps(gxmk0.b);
            gwps0.b = new gwre(gwps0.c, byteBuffer0).a();
            if(!gwqz.b(byteBuffer0)) {
                throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
            }
            LongBuffer longBuffer0 = byteBuffer0.asLongBuffer();
            longBuffer0.get(gwps0.a);
            byteBuffer0.position(byteBuffer0.position() + longBuffer0.position() * 8);
            gxmk0.c = gwps0;
            if(!gwqz.b(byteBuffer0)) {
                throw new IllegalArgumentException("The read checksum is not equal to the calculated checksum.");
            }
            LongBuffer longBuffer1 = byteBuffer0.asLongBuffer();
            longBuffer1.get(gxmk0.a);
            byteBuffer0.position(byteBuffer0.position() + longBuffer1.position() * 8);
            int v = gxmk0.d.length;
            IntBuffer intBuffer0 = byteBuffer0.asIntBuffer();
            byteBuffer0.position(byteBuffer0.position() + v * 4);
            for(int v1 = 0; v1 < v; ++v1) {
                int v2 = intBuffer0.get();
                if(v2 != -1) {
                    byte[][] arr2_b = gxmk0.d;
                    byte[] arr_b1 = new byte[v2];
                    arr2_b[v1] = arr_b1;
                    byteBuffer0.get(arr_b1);
                }
            }
            gwwo0.a(fwze0.f().c() - 604800000L);
        }
        catch(IllegalArgumentException | ArrayIndexOutOfBoundsException | BufferUnderflowException unused_ex) {
            this.c.k = gxmk.c(this.c.a).a();
            this.c.j = true;
        }
    }
}

