import java.io.Closeable;
import java.util.Map.Entry;

final class cjco implements Closeable {
    public int a;
    public bxf b;
    final cjcp c;

    public cjco(cjcp cjcp0) {
        this.c = cjcp0;
        super();
    }

    @Override
    public final void close() {
        int v = this.a - 1;
        this.a = v;
        if(v == 0) {
            bxf bxf0 = this.b;
            if(bxf0 != null) {
                this.b = null;
                int v1 = bxf0.c;
                for(int v2 = 0; v2 < v1; ++v2) {
                    Map.Entry map$Entry0 = (Map.Entry)bxf0.b(v2);
                    Object object0 = map$Entry0.getKey();
                    cjdm cjdm0 = (cjdm)map$Entry0.getValue();
                    this.c.t(object0, cjdm0);
                }
            }
        }
    }
}

