import java.io.Closeable;
import java.util.Arrays;

public abstract class qtl implements Closeable {
    public static final String[] a;
    int b;
    int[] c;
    String[] d;
    int[] e;

    static {
        qtl.a = new String[0x80];
        for(int v = 0; v <= 0x1F; ++v) {
            qtl.a[v] = String.format("\\u%04x", v);
        }
        qtl.a[34] = "\\\"";
        qtl.a[92] = "\\\\";
        qtl.a[9] = "\\t";
        qtl.a[8] = "\\b";
        qtl.a[10] = "\\n";
        qtl.a[13] = "\\r";
        qtl.a[12] = "\\f";
    }

    public qtl() {
        this.c = new int[0x20];
        this.d = new String[0x20];
        this.e = new int[0x20];
    }

    public abstract double a();

    public abstract int b();

    public abstract int c(qtj arg1);

    final qti d(String s) {
        throw new qti(s + " at path " + this.e());
    }

    public final String e() {
        int v = this.b;
        int[] arr_v = this.c;
        String[] arr_s = this.d;
        int[] arr_v1 = this.e;
        StringBuilder stringBuilder0 = new StringBuilder("$");
        for(int v1 = 0; v1 < v; ++v1) {
            switch(arr_v[v1]) {
                case 1: 
                case 2: {
                    stringBuilder0.append('[');
                    stringBuilder0.append(arr_v1[v1]);
                    stringBuilder0.append(']');
                    break;
                }
                case 3: 
                case 4: 
                case 5: {
                    stringBuilder0.append('.');
                    String s = arr_s[v1];
                    if(s != null) {
                        stringBuilder0.append(s);
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public abstract String f();

    public abstract String g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    final void l(int v) {
        int v1 = this.b;
        int[] arr_v = this.c;
        if(v1 == arr_v.length) {
            if(v1 == 0x100) {
                throw new qth("Nesting too deep at " + this.e());
            }
            this.c = Arrays.copyOf(arr_v, arr_v.length + arr_v.length);
            int v2 = this.d.length;
            this.d = (String[])Arrays.copyOf(this.d, v2 + v2);
            int v3 = this.e.length;
            this.e = Arrays.copyOf(this.e, v3 + v3);
        }
        int v4 = this.b;
        this.b = v4 + 1;
        this.c[v4] = v;
    }

    public abstract void m();

    public abstract void n();

    public abstract boolean o();

    public abstract boolean p();

    public abstract int q();
}

