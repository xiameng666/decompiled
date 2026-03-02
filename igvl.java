import java.util.Locale;

public final class igvl extends igve {
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;

    public igvl(byte[] arr_b, int v) {
        super(arr_b, v);
    }

    @Override  // igve
    public final void a(byte[] arr_b) {
        this.b = igvq.b(arr_b, 0, 1) != 0;
        this.c = igvq.b(arr_b, 1, 5);
        this.d = igvq.b(arr_b, 6, 2);
        this.e = igvq.b(arr_b, 8, 24);
        this.f = igvq.b(arr_b, 0x20, 2);
    }

    @Override
    public final String toString() {
        for(int v = 0; v < 5; ++v) {
            if(this.a[v] != 0) {
                return this.b ? String.format(Locale.UK, "%s Log.%d ro=%d", "Normal", ((int)this.c), ((int)this.f)) : String.format(Locale.UK, "%s Log.%d ro=%d", "Basic", ((int)this.c), ((int)this.f));
            }
        }
        return "Empty Log";
    }
}

