import android.os.SystemClock;
import java.io.IOException;
import java.util.UUID;

final class azbn {
    public static final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final azbq f;
    public final azbq g;
    public final ayws h;
    public int i;
    public final azbo j;
    private static final int k;
    private static final int l;
    private final int m;
    private final int n;

    static {
        azbl azbl0 = azbl.values()[0];
        int v = (azbl.k.ordinal() + 1) * 4;
        azbn.k = v;
        int v1 = v + 0x1074;
        azbn.a = v1;
        azbn.l = v1 + v;
    }

    public azbn(aywt aywt0, azbo azbo0) {
        this.i = 1;
        int v = azbb.j + azbc.ai + 7;
        batl.b(azbo0.c() > v + v + azbn.l);
        this.h = new ayws(azbo0);
        this.m = azbb.j;
        this.b = azbn.l;
        this.c = azbn.l + azbb.j;
        this.n = azbc.ai;
        int v1 = azbb.j + (azbn.l + azbb.j);
        this.d = v1;
        this.e = v1 + azbc.ai;
        int v2 = azbc.ai + (v1 + azbc.ai);
        int v3 = azbo0.c() - v2;
        batl.b(azbn.l % 4 == 0);
        batl.b((azbn.l + azbb.j) % 4 == 0);
        batl.b(v1 % 4 == 0);
        batl.b((v1 + azbc.ai) % 4 == 0);
        batl.b(v3 / 2 > 7);
        this.j = azbo0;
        if(azbo0.b(0) != 5 || azbo0.b(4) != 4) {
            aywr.a(azbo0, 0, azbo0.c());
            azbo0.g(0, 5);
            azbo0.g(4, 4);
        }
        this.f = new azbq(azbo0, v2, v3 / 2, aywt0);
        this.g = new azbq(azbo0, v2 + v3 / 2, v3 / 2, aywt0);
        int v4 = this.k();
        if(v4 == 5) {
            azbo0.g(8, 1);
            this.g();
        }
        else if(v4 == 6) {
            azbo0.g(8, 0);
            this.g();
        }
        if(azbo0.d(0x20) == 0L && azbo0.d(40) == 0L) {
            azbo0.h(0x20, SystemClock.elapsedRealtime());
            azbo0.h(40, -1L);
        }
    }

    public final int a(aywt aywt0, int v, int v1) {
        boolean z = azbm.b(this.j());
        int v2 = aywt0.a();
        if(z) {
            v = v1;
        }
        return this.j.b(v + v2);
    }

    public final int b(azbl azbl0) {
        return this.a(azbl0, 0x1074, azbn.a);
    }

    public final int c() {
        this.j();
        return this.j.b(28);
    }

    public final long d() {
        return azbm.b(this.j()) ? this.j.d(4204) : this.j.d(0x1064);
    }

    public final void e() {
        if(this.i != 1) {
            return;
        }
        try {
            int v = this.k();
            if(v == 3) {
                this.j.g(8, 0);
            }
            else if(v == 4) {
                this.j.g(8, 1);
            }
            aywr.a(this.j, 12, 16);
            aywr.a(this.h.a, 80, 4100);
        }
        catch(IOException unused_ex) {
            this.i = 3;
        }
        catch(ayyr unused_ex) {
            this.i = 4;
        }
    }

    public final void f(int v, int v1, aywt aywt0, int v2) {
        long v3 = glun.d(this.j.d(v), v2);
        this.j.h(v, v3);
        int v4 = v1 + aywt0.a();
        aywr.b(this.j, v4, v2);
    }

    public final void g() {
        this.h(null);
    }

    public final void h(String s) {
        int v1;
        if(this.i != 1) {
            return;
        }
        try {
            int v = this.k();
            if(azbm.a(v)) {
                aywr.b(this.j, 28, 1);
                return;
            }
            boolean z = azbm.b(v);
            if(z) {
                this.j.g(8, 5);
                v1 = 4;
            }
            else {
                this.j.g(8, 4);
                v1 = 3;
            }
            azbo azbo0 = this.j;
            aywr.a(azbo0, (z ? 4204 : 0x1064), 8);
            aywr.a(azbo0, (z ? azbn.a : 0x1074), azbn.k);
            aywr.a(azbo0, (z ? this.c : this.b), this.m);
            aywr.a(azbo0, (z ? this.e : this.d), this.n);
            azbq azbq0 = z ? this.g : this.f;
            azbq0.e = null;
            int v2 = 0;
            azbq0.f.g(azbq0.a, 0);
            UUID uUID0 = UUID.randomUUID();
            azbo0.h(12, uUID0.getMostSignificantBits());
            azbo0.h(20, uUID0.getLeastSignificantBits());
            azbo0.g(28, 0);
            azbo0.f(4180, 0);
            if(azbo0.d(40) >= 0L) {
                azbo0.h(0x20, azbo0.d(40));
            }
            azbo0.h(40, SystemClock.elapsedRealtime());
            if(s == null) {
                azbo0.g(8, v1 - 1);
                return;
            }
            ayws ayws0 = this.h;
            int v3 = s.length();
            if(v3 + v3 + 4 > 4100) {
                ayws0.a.g(80, -1);
                azbo0.g(8, v1 - 1);
                return;
            }
            azbo azbo1 = ayws0.a;
            azbo1.g(80, v3);
            int v4 = 84;
            while(true) {
                if(v2 >= v3) {
                    azbo0.g(8, v1 - 1);
                    return;
                }
                try {
                    azbo1.a.putChar(v4, s.charAt(v2));
                    v4 += 2;
                    ++v2;
                    continue;
                }
                catch(RuntimeException runtimeException0) {
                }
                break;
            }
            throw new IOException("Exception writing to buffer", runtimeException0);
        }
        catch(IOException unused_ex) {
            this.i = 3;
        }
        catch(ayyr unused_ex) {
            this.i = 4;
        }
    }

    public final boolean i() {
        return azbm.a(this.k());
    }

    public final int j() {
        switch(this.i) {
            case 1: {
                int v = this.k();
                if(azbm.a(v)) {
                    return v;
                }
                throw new IllegalStateException("Attempt to read when there is no snapshot");
            }
            case 3: {
                throw new IOException("Attempt to read after an IOException");
            }
            case 4: {
                throw new ayyr("Attempt to read after a FormatException");
            }
            default: {
                throw new IllegalStateException("Attempt to read when status is not ok");
            }
        }
    }

    final int k() {
        try {
            int v = this.j.b(8);
            if(v == 0) {
                return 1;
            }
            switch(v) {
                case 1: {
                    return 2;
                }
                case 2: {
                    return 3;
                }
                case 3: {
                    return 4;
                }
                case 4: {
                    return 5;
                }
                case 5: {
                    return 6;
                }
                default: {
                    throw new ayyr("Invalid state");
                }
            }
        }
        catch(IOException iOException0) {
            this.i = 3;
            throw iOException0;
        }
        catch(ayyr ayyr0) {
            this.i = 4;
            throw ayyr0;
        }
    }
}

