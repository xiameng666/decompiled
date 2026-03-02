import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

public final class fvpd implements Runnable {
    public final fvpk a;
    public final int b;
    public final gmcd c;
    public final int d;
    public final String e;
    public final BitSet f;
    public final Iterator g;
    public final fvsw h;
    public final fvkf i;

    public fvpd(fvpk fvpk0, int v, gmcd gmcd0, int v1, String s, BitSet bitSet0, Iterator iterator0, fvsw fvsw0, fvkf fvkf0) {
        this.a = fvpk0;
        this.b = v;
        this.c = gmcd0;
        this.d = v1;
        this.e = s;
        this.f = bitSet0;
        this.g = iterator0;
        this.h = fvsw0;
        this.i = fvkf0;
    }

    @Override
    public final void run() {
        int v4;
        Boolean boolean0;
        try {
            boolean0 = (Boolean)this.c.get();
        }
        catch(ExecutionException | InterruptedException unused_ex) {
            boolean0 = Boolean.valueOf(false);
        }
        BitSet bitSet0 = this.f;
        String s = this.e;
        int v1 = this.d;
        int v2 = this.b;
        fvpk fvpk0 = this.a;
        if(boolean0.booleanValue()) {
            ++fvpk0.j.d;
            fvpf fvpf0 = new fvpf(fvpk0);
            fvpk0.e.execute(fvpf0);
            bitSet0.set(v1);
            File file0 = new File(fvpk0.i, "uploadedSeq");
            StringBuilder stringBuilder0 = new StringBuilder();
            int v3;
            for(int v = 0; (v3 = bitSet0.nextSetBit(v)) >= 0; v = v3 + 1) {
                if(stringBuilder0.length() > 0) {
                    stringBuilder0.append(",");
                }
                stringBuilder0.append(v3);
            }
            fyba.a(file0, stringBuilder0.toString().getBytes(StandardCharsets.UTF_8));
            v4 = v2;
        }
        else {
            ++fvpk0.j.e;
            fvpa fvpa0 = new fvpa(fvpk0);
            fvpk0.e.execute(fvpa0);
            v4 = v2 + 1;
        }
        if(v4 >= 3) {
            fvpk0.f();
            return;
        }
        fvpb fvpb0 = new fvpb(fvpk0, this.g, bitSet0, s, this.h, v4, this.i);
        fvpk0.f.execute(fvpb0);
    }
}

