import android.os.Bundle;
import java.util.Set;

public abstract class fncs implements scz {
    public static final fncm b;
    public static final Set c;
    public final int d;
    public final Bundle e;
    public final int f;

    static {
        fncs.b = new fncm();
        fncs.c = ibqg.c(new Integer[]{((int)1), ((int)4)});
    }

    public fncs(int v, int v1) {
        this(v, Bundle.EMPTY, v1);
    }

    public fncs(int v, Bundle bundle0, int v1) {
        this.d = v;
        this.e = bundle0;
        this.f = v1;
        if(!fncs.c.contains(Integer.valueOf(v1))) {
            return;
        }
        throw new IllegalArgumentException("The responseId \'" + v1 + "\' is reserved and cannot be used.");
    }
}

