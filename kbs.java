import java.util.Arrays;
import java.util.Locale;

public final class kbs {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final long g;
    public final float h;
    public final float i;
    public final long j;
    public final long k;
    public final int l;
    public final byte[] m;
    public final byte[] n;

    public kbs(int v, int v1, int v2, int v3, int v4, long v5, long v6, float f, float f1, long v7, long v8, int v9, byte[] arr_b, byte[] arr_b1) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
        this.e = v4;
        this.f = v5;
        this.g = v6;
        this.h = f;
        this.i = f1;
        this.j = v7;
        this.k = v8;
        this.l = v9;
        this.m = arr_b;
        this.n = arr_b1;
    }

    @Override
    public final String toString() {
        return String.format(Locale.US, " | messageType : %d", ((int)this.a)) + String.format(Locale.US, " | messageControl : %d", ((int)this.b)) + String.format(Locale.US, " | blockIndex : %d", ((int)this.c)) + String.format(Locale.US, " | roundIndex : %d", ((int)this.d)) + String.format(Locale.US, " | nLoS : %d", ((int)this.e)) + String.format(Locale.US, " | txTimestamp : %d", ((long)this.f)) + String.format(Locale.US, " | rxTimestamp : %d", ((long)this.g)) + String.format(Locale.US, " | anchorCfo : %f", ((float)this.h)) + String.format(Locale.US, " | cfo : %f", ((float)this.i)) + String.format(Locale.US, " | initiatorReplyTime : %d", ((long)this.j)) + String.format(Locale.US, " | responderReplyTime : %d", ((long)this.k)) + String.format(Locale.US, " | initiatorResponderTof : %d", ((int)this.l)) + String.format(Locale.US, " | anchorLocation : %s", Arrays.toString(this.m)) + String.format(Locale.US, " | activeRangingRounds : %s", Arrays.toString(this.n));
    }
}

