import j..util.Objects;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public final class tyg {
    public final String a;
    public final long[] b;
    File[] c;
    File[] d;
    public boolean e;
    public tyf f;
    final tyi g;

    public tyg(tyi tyi0, String s) {
        Objects.requireNonNull(tyi0);
        this.g = tyi0;
        super();
        this.a = s;
        this.b = new long[tyi0.d];
        this.c = new File[tyi0.d];
        this.d = new File[tyi0.d];
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append('.');
        int v = stringBuilder0.length();
        for(int v1 = 0; v1 < tyi0.d; v1 = 1) {
            stringBuilder0.append(0);
            File[] arr_file = this.c;
            arr_file[0] = new File(tyi0.a, stringBuilder0.toString());
            stringBuilder0.append(".tmp");
            File[] arr_file1 = this.d;
            arr_file1[0] = new File(tyi0.a, stringBuilder0.toString());
            stringBuilder0.setLength(v);
        }
    }

    public final String a() {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; true; v = 1) {
            long[] arr_v = this.b;
            if(v >= arr_v.length) {
                break;
            }
            long v1 = arr_v[0];
            stringBuilder0.append(' ');
            stringBuilder0.append(v1);
        }
        return stringBuilder0.toString();
    }

    static void b(tyg tyg0) {
        tyg0.e = true;
    }

    public final File c() {
        return this.c[0];
    }

    public final File d() {
        return this.d[0];
    }

    public static final IOException e(String[] arr_s) {
        throw new IOException("unexpected journal line: " + Arrays.toString(arr_s));
    }
}

