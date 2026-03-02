import java.io.IOException;
import java.util.BitSet;
import java.util.Iterator;

public final class fvph implements Runnable {
    public final fvpk a;
    public final Iterator b;
    public final BitSet c;
    public final String d;
    public final fvsw e;
    public final fvkf f;
    public final int g;
    public final byte[] h;

    public fvph(fvpk fvpk0, Iterator iterator0, BitSet bitSet0, String s, fvsw fvsw0, fvkf fvkf0, int v, byte[] arr_b) {
        this.a = fvpk0;
        this.b = iterator0;
        this.c = bitSet0;
        this.d = s;
        this.e = fvsw0;
        this.f = fvkf0;
        this.g = v;
        this.h = arr_b;
    }

    @Override
    public final void run() {
        int v;
        byte[] arr_b = this.h;
        hfsl hfsl0 = hfsl.P(arr_b);
        try {
        alab1:
            while(true) {
                v = -1;
                if(hfsl0.D()) {
                    break;
                }
                int v1 = hfsl0.m();
                if(v1 >>> 3 == 6) {
                    hfsl hfsl1 = hfsl0.w().k();
                    while(!hfsl1.D()) {
                        int v2 = hfsl1.m();
                        if(v2 >>> 3 != 3) {
                            hfsl1.F(v2);
                            continue;
                        }
                        v = hfsl1.j();
                        break alab1;
                    }
                }
                else {
                    hfsl0.F(v1);
                }
            }
        }
        catch(IOException unused_ex) {
        }
        int v3 = this.g;
        fvkf fvkf0 = this.f;
        fvsw fvsw0 = this.e;
        String s = this.d;
        BitSet bitSet0 = this.c;
        Iterator iterator0 = this.b;
        fvpk fvpk0 = this.a;
        if(v != -1 && !bitSet0.get(v)) {
            ByteString hfsf0 = ByteString.copyFrom(arr_b);
            gmcd gmcd0 = fvpk0.c.g(3, hfsf0, fvpk0.g);
            gmcd0.hB(new fvpd(fvpk0, v3, gmcd0, v, s, bitSet0, iterator0, fvsw0, fvkf0), fvpk0.f);
            fwye.a(fvpk0.b, gmcd0);
            return;
        }
        fvpc fvpc0 = new fvpc(fvpk0, iterator0, bitSet0, s, fvsw0, v3, fvkf0);
        fvpk0.f.execute(fvpc0);
    }
}

