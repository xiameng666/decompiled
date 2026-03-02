import java.io.PrintWriter;

public final class fvtp {
    long a;
    int b;
    long c;
    final short[] d;
    final int[] e;

    public fvtp(short[] arr_v) {
        this.d = arr_v;
        this.e = new int[7];
    }

    public final void a(long v) {
        this.c = Math.max(v, this.c);
        this.a += v;
        ++this.b;
        boolean z = false;
        for(int v1 = 0; true; ++v1) {
            if(v1 >= 6) {
                if(z) {
                    break;
                }
                ++this.e[6];
                break;
            }
            if(z) {
                break;
            }
            if(v < ((long)this.d[v1])) {
                ++this.e[v1];
                z = true;
            }
            else {
                z = false;
            }
        }
    }

    public final void b(String s, PrintWriter printWriter0, long v) {
        short[] arr_v;
        printWriter0.println(s + ", sumOfDuration= " + (this.a + "ms (" + this.a / 60000L + "min) " + (((int)(((double)this.a) / ((double)v) * 100.0)) + "%")) + ", count= " + this.b);
        for(int v1 = 0; true; ++v1) {
            arr_v = this.d;
            if(v1 >= 6) {
                break;
            }
            printWriter0.println("  x < " + arr_v[v1] + "ms, count " + this.e[v1]);
        }
        printWriter0.println("  x > " + arr_v[5] + "ms, count " + this.e[6] + ", max " + this.c);
    }
}

