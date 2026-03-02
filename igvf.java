import java.util.Locale;

public final class igvf extends igve {
    public int b;
    public int c;
    public int d;
    private int e;

    public igvf(byte[] arr_b, int v) {
        super(arr_b, v);
    }

    @Override  // igve
    public final void a(byte[] arr_b) {
        this.e = ((arr_b[0] & 0x7F) << 6) + (arr_b[1] >> 2 & 0x3F);
        this.b = ((arr_b[1] & 3) << 3) + (arr_b[2] >> 5 & 7);
        this.c = arr_b[2] & 0x1F;
        this.d = igvq.b(arr_b, 26, 14);
    }

    public final boolean b() {
        return (this.a[3] & 0xFFFFFF80) == 0xFFFFFF80;
    }

    @Override
    public final String toString() {
        for(int v = 0; v < 5; ++v) {
            if(this.a[v] != 0) {
                return String.format(Locale.UK, "IPE.%d.%d (%04x)", ((int)this.b), ((int)this.c), ((int)this.e));
            }
        }
        return "Empty";
    }
}

