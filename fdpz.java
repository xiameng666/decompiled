import android.content.Context;
import java.io.OutputStream;

final class fdpz {
    public fdvx a;
    public feyl b;
    public fdzr c;
    public fdpd d;
    public fens e;
    public brzr f;
    public gfuv g;
    public ffml h;
    private Context i;
    private OutputStream j;
    private int k;
    private boolean l;
    private int m;
    private byte n;

    public final fdzb a() {
        if(this.n == 7 && this.i != null && this.a != null && this.j != null && this.b != null && this.c != null && this.g != null) {
            return new fdzb(this.i, this.a, this.j, this.b, this.c, this.k, this.l, this.d, this.e, this.m, this.f, this.g, this.h);
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.i == null) {
            stringBuilder0.append(" context");
        }
        if(this.a == null) {
            stringBuilder0.append(" dataUsageStats");
        }
        if(this.j == null) {
            stringBuilder0.append(" out");
        }
        if(this.b == null) {
            stringBuilder0.append(" connect");
        }
        if(this.c == null) {
            stringBuilder0.append(" sessionStats");
        }
        if((this.n & 1) == 0) {
            stringBuilder0.append(" messagePieceSize");
        }
        if((this.n & 2) == 0) {
            stringBuilder0.append(" isBtleMode");
        }
        if((this.n & 4) == 0) {
            stringBuilder0.append(" negotiatedWireVersion");
        }
        if(this.g == null) {
            stringBuilder0.append(" ticker");
        }
        throw new IllegalStateException("Missing required properties:" + stringBuilder0.toString());
    }

    public final void b(Context context0) {
        if(context0 == null) {
            throw new NullPointerException("Null context");
        }
        this.i = context0;
    }

    public final void c(boolean z) {
        this.l = z;
        this.n = (byte)(this.n | 2);
    }

    public final void d(int v) {
        this.k = v;
        this.n = (byte)(this.n | 1);
    }

    public final void e(int v) {
        this.m = v;
        this.n = (byte)(this.n | 4);
    }

    public final void f(OutputStream outputStream0) {
        if(outputStream0 == null) {
            throw new NullPointerException("Null out");
        }
        this.j = outputStream0;
    }
}

