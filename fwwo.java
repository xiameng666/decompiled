import android.content.Context;

public final class fwwo {
    public static final short[] a;
    final esaa b;
    public final String c;
    public long d;
    final short[] e;

    static {
        fwwo.a = new short[]{0xFA, 500, 1000, 2000, 4000, 8000};
    }

    public fwwo(Context context0, boolean z, String s, short[] arr_v) {
        this.d = -1L;
        esaa esaa0 = new esaa(context0, 1, s, s);
        this.b = esaa0;
        if(!z) {
            esaa0.j(false);
        }
        this.c = s;
        this.e = arr_v;
    }

    public final long a(long v) {
        long v1;
        synchronized(fwwp.a) {
            v1 = this.d;
            if(v1 == -1L) {
                return -1L;
            }
        }
        return v - v1;
    }

    public final boolean b() {
        return this.b.l();
    }
}

