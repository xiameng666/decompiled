import java.util.Arrays;
import java.util.Locale;

public final class ighl {
    public final igcm a;
    public final Locale b;
    public igcw c;
    public Integer d;
    public ighj[] e;
    public int f;
    public boolean g;
    private final igcw h;
    private Object i;

    public ighl(igcm igcm0) {
        igcm igcm1 = igct.d(igcm0);
        igcw igcw0 = igcm1.B();
        this.h = igcw0;
        this.a = igcm1.c();
        this.b = Locale.getDefault();
        this.c = igcw0;
        this.e = new ighj[8];
    }

    static int a(igcy igcy0, igcy igcy1) {
        if(igcy0 != null && igcy0.g()) {
            return igcy1 == null || !igcy1.g() ? 1 : -igcy0.compareTo(igcy1);
        }
        return igcy1 == null || !igcy1.g() ? 0 : -1;
    }

    public final Object b() {
        if(this.i == null) {
            this.i = new ighk(this);
        }
        return this.i;
    }

    public final ighj c() {
        ighj[] arr_ighj = this.e;
        int v = this.f;
        int v1 = arr_ighj.length;
        if(v == v1 || this.g) {
            if(v == v1) {
                v1 = v + v;
            }
            ighj[] arr_ighj1 = new ighj[v1];
            System.arraycopy(arr_ighj, 0, arr_ighj1, 0, v);
            this.e = arr_ighj1;
            this.g = false;
            arr_ighj = arr_ighj1;
        }
        this.i = null;
        ighj ighj0 = arr_ighj[v];
        if(ighj0 == null) {
            ighj0 = new ighj();
            arr_ighj[v] = ighj0;
        }
        this.f = v + 1;
        return ighj0;
    }

    public final void d(igcr igcr0, int v) {
        this.c().c(igcr0.a(this.a), v);
    }

    public final void e(Integer integer0) {
        this.i = null;
        this.d = integer0;
    }

    public final void f(igcw igcw0) {
        this.i = null;
        this.c = igcw0;
    }

    public final long g(CharSequence charSequence0) {
        ighj[] arr_ighj = this.e;
        int v = this.f;
        if(this.g) {
            arr_ighj = (ighj[])arr_ighj.clone();
            this.e = arr_ighj;
            this.g = false;
        }
        if(v > 10) {
            Arrays.sort(arr_ighj, 0, v);
        }
        else {
            for(int v1 = 0; v1 < v; ++v1) {
                for(int v2 = v1; v2 > 0 && arr_ighj[v2 - 1].a(arr_ighj[v2]) > 0; --v2) {
                    ighj ighj0 = arr_ighj[v2];
                    arr_ighj[v2] = arr_ighj[v2 - 1];
                    arr_ighj[v2 - 1] = ighj0;
                }
            }
        }
        long v3 = 0L;
        if(v > 0) {
            igcy igcy0 = igda.e.a(this.a);
            igcy igcy1 = igda.g.a(this.a);
            igcy igcy2 = arr_ighj[0].a.w();
            if(ighl.a(igcy2, igcy0) >= 0 && ighl.a(igcy2, igcy1) <= 0) {
                this.d(igcr.f, 2000);
                return this.g(charSequence0);
            }
        }
        try {
            for(int v4 = 0; v4 < v; ++v4) {
                v3 = arr_ighj[v4].b(v3, true);
            }
            int v5 = 0;
            while(true) {
                if(v5 >= v) {
                    goto label_48;
                }
                arr_ighj[v5].a.B();
                v3 = arr_ighj[v5].b(v3, v5 == v - 1);
                ++v5;
                continue;
            label_40:
                if(charSequence0 != null) {
                    break;
                }
                throw igdb0;
            }
        }
        catch(igdb igdb0) {
            goto label_40;
        }
        String s = a.a(((String)charSequence0), "Cannot parse \"", "\"");
        String s1 = igdb0.a;
        igdb0.a = s1 == null ? s : a.r(s1, s, ": ");
        throw igdb0;
    label_48:
        Integer integer0 = this.d;
        if(integer0 != null) {
            return v3 - ((long)(((int)integer0)));
        }
        igcw igcw0 = this.c;
        if(igcw0 != null) {
            int v6 = igcw0.i(v3);
            v3 -= (long)v6;
            if(v6 != this.c.a(v3)) {
                throw new igdc((charSequence0 == null ? "Illegal instant due to time zone offset transition (" + this.c + ")" : a.l(("Illegal instant due to time zone offset transition (" + this.c + ")"), ((String)charSequence0), "Cannot parse \"", "\": ")));
            }
        }
        return v3;
    }

    public final void h(Object object0) {
        if((object0 instanceof ighk) && this == ((ighk)object0).e) {
            this.c = ((ighk)object0).a;
            this.d = ((ighk)object0).b;
            this.e = ((ighk)object0).c;
            int v = ((ighk)object0).d;
            if(v < this.f) {
                this.g = true;
            }
            this.f = v;
            this.i = object0;
        }
    }
}

