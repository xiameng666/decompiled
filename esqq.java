import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public final class esqq {
    public static final bboh a;
    public final LinkedHashMap b;
    public int c;
    private int d;

    static {
        esqq.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public esqq() {
        this.b = new LinkedHashMap();
    }

    public final Set a() {
        return this.b.keySet();
    }

    public final void b(byte[] arr_b) {
        for(int v = 0; v < arr_b.length; v = v + v3 + 1) {
            try {
                esvi esvi0 = new esvi(arr_b, v);
                int v1 = esvi0.b();
                int v2 = esvi0.a();
                int v3 = esvj.k(v1);
                this.d(v1, v2);
            }
            catch(IllegalArgumentException | ArrayIndexOutOfBoundsException exception0) {
                throw new esvk(exception0);
            }
        }
    }

    public final byte[] c() {
        int v1;
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(this.d);
        for(Object object0: this.b.entrySet()) {
            int v = (int)(((Integer)((Map.Entry)object0).getKey()));
            try {
                v1 = esvj.k(v);
            }
            catch(esvm esvm0) {
                throw new RuntimeException("keys should be validated already", esvm0);
            }
            byteBuffer0.put(glwy.l(v), 4 - v1, v1);
            byteBuffer0.put(((esqp)((Map.Entry)object0).getValue()).b);
        }
        return byteBuffer0.array();
    }

    public final void d(int v, int v1) {
        batl.c(v1 <= 0x7F, "Only PDOL tag lengths < 128 are supported");
        LinkedHashMap linkedHashMap0 = this.b;
        if(linkedHashMap0.containsKey(Integer.valueOf(v))) {
            ((ggtj)((ggtj)esqq.a.j()).ar(0x3D39)).F("Attempted to add / override a PDOL field twice. This is not allowed. The entry will remain: %d, with length: %d", v, v1);
            return;
        }
        esqp esqp0 = new esqp(v, ((byte)v1), this.c);
        this.c += esqp0.b;
        this.d += esvj.k(v) + 1;
        linkedHashMap0.put(Integer.valueOf(esqp0.a), esqp0);
    }
}

