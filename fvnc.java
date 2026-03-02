import java.util.concurrent.TimeUnit;

public final class fvnc implements Runnable {
    public final fvne a;
    public final int b;
    public final String c;
    public final byte[] d;

    public fvnc(fvne fvne0, int v, String s, byte[] arr_b) {
        this.a = fvne0;
        this.b = v;
        this.c = s;
        this.d = arr_b;
    }

    @Override
    public final void run() {
        fvnp fvnp0;
        byte[] arr_b1;
        fvne fvne0 = this.a;
        fvne0.c.i(fwzf.s, 600000L, fvne0.b);
        String s = this.c;
        byte[] arr_b = this.d;
        int v = this.b;
        try {
            if(fvne0.e) {
            label_17:
                fvne0.d(s);
                fvne0.c();
                synchronized(fvne0) {
                    if(fvne0.g == null) {
                        arr_b1 = fvne0.a;
                        if(arr_b1 == null) {
                            fvnp0 = new fvnp(false, null, "Encryption Key invalid.");
                        }
                        else {
                            goto label_26;
                        }
                    }
                    else {
                        goto label_31;
                    }
                }
                goto label_33;
            label_26:
                fvne0.g = new fvkg(fvne0.d, fvsw.b(arr_b1, fvne0.i));
            label_31:
                fvnp0 = fvne0.g.a(v, arr_b);
            label_33:
                fvlt fvlt1 = fvne0.h;
                if(fvlt1 != null) {
                    String s2 = fvnp0.b;
                    if(fvnp0.a) {
                        gftb.check(s2);
                        fvlt1.e(v, s2);
                    }
                    else {
                        fvlt1.f(v, s2, (fvnp0.c == null ? "" : fvnp0.c));
                    }
                }
            }
            else if(fvne0.c() == null) {
                String s1 = fvne0.d;
                long v2 = TimeUnit.DAYS.toMillis(24L);
                boolean z = fvno.a.d(s1, v2);
                fvne0.e = z;
                if(z) {
                    goto label_17;
                }
                else {
                    goto label_13;
                }
            }
            else {
            label_13:
                fvlt fvlt0 = fvne0.h;
                if(fvlt0 != null) {
                    fvlt0.f(v, null, "Failed to create lock file.");
                }
            }
        }
        finally {
            fvne0.c.j(fwzf.s);
        }
    }
}

