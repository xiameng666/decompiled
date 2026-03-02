import java.io.UnsupportedEncodingException;

final class abwt {
    int a;
    int b;
    final int[] c;
    final byte[] d;

    public abwt(int[] arr_v, byte[] arr_b) {
        this.a = 0;
        this.b = 0;
        this.c = arr_v;
        this.d = arr_b;
    }

    public final String a(int v) {
        this.b(v);
        try {
            return new String(this.d, this.b, this.c[this.a], "UTF-8");
        }
        catch(UnsupportedEncodingException unused_ex) {
            return null;
        }
    }

    public final void b(int v) {
        if(v < this.a) {
            this.a = 0;
            this.b = 0;
        }
        int v1;
        while((v1 = this.a) < v) {
            this.b += this.c[v1];
            this.a = v1 + 1;
        }
    }
}

