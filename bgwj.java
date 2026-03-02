import android.content.Context;

public final class bgwj {
    private final int a;
    private final boolean b;
    private final boolean c;
    private final int d;

    public bgwj(Context context0) {
        int v3;
        int v2;
        int v = 0;
        int v1 = 3;
        switch(((int)hsbn.a.e().b())) {
            case 0: {
                v2 = 2;
                break;
            }
            case 1: {
                v2 = 3;
                break;
            }
            case 2: {
                v2 = 4;
                break;
            }
            default: {
                v2 = 0;
            }
        }
        if(v2 == 0) {
        label_18:
            if(bbnp.i(context0)) {
                v3 = 204;
            }
            else if(bbnp.d(context0)) {
                v3 = 205;
            }
            else if(bbnp.e(context0)) {
                v3 = 0xCF;
            }
            else if(bbnp.h(context0)) {
                v3 = 0xD0;
            }
            else if(bbnp.n(context0)) {
                v3 = 102;
            }
            else {
                v3 = bbnp.k(context0) ? 101 : 201;
            }
        }
        else {
            switch(v2 - 2) {
                case 1: {
                    v3 = 103;
                    break;
                }
                case 2: {
                    v3 = 202;
                    break;
                }
                default: {
                    goto label_18;
                }
            }
        }
        this.a = v3;
        this.b = v3 == 101 || v3 == 103;
        this.c = bbmn.s(context0);
        switch(((int)hsbn.b())) {
            case 0: {
                v = 2;
                break;
            }
            case 1: {
                v = 3;
                break;
            }
            case 2: {
                v = 4;
                break;
            }
            case 3: {
                v = 5;
                break;
            }
            case 4: {
                v = 6;
            }
        }
        if(v != 0) {
            v1 = v;
        }
        this.d = v1;
    }

    public final boolean a() {
        return this.d == 5 || this.d == 6;
    }

    public final boolean b() {
        return this.b && this.c;
    }

    public final boolean c() {
        return this.d == 4 || this.d == 5;
    }

    public final boolean d() {
        return this.d == 5;
    }

    @Override
    public final String toString() {
        long v = hsbn.b();
        return "Av dt:" + this.a + " u:" + this.c + " al: " + v;
    }
}

