import java.util.Locale;

final class iggx implements ighp, ighr {
    protected final int a;
    protected final int b;
    private final igcr c;

    protected iggx(igcr igcr0, int v, int v1) {
        this.c = igcr0;
        this.a = v;
        if(v1 > 18) {
            v1 = 18;
        }
        this.b = v1;
    }

    @Override  // ighp
    public final int a() {
        return this.b;
    }

    @Override  // ighr
    public final int b() {
        return this.b;
    }

    @Override  // ighp
    public final int c(ighl ighl0, CharSequence charSequence0, int v) {
        igcp igcp0 = this.c.a(ighl0.a);
        int v1 = charSequence0.length() - v;
        int v2 = Math.min(this.b, v1);
        long v3 = igcp0.w().c() * 10L;
        int v4 = 0;
        long v5 = 0L;
        while(v4 < v2) {
            int v6 = charSequence0.charAt(v + v4);
            if(v6 < 0x30 || v6 > 57) {
                break;
            }
            v3 /= 10L;
            v5 += ((long)(v6 - 0x30)) * v3;
            ++v4;
        }
        if(v4 != 0 && v5 / 10L <= 0x7FFFFFFFL) {
            igcy igcy0 = igcp0.w();
            iggi iggi0 = new iggi(igcr.x, iggg.a, igcy0);
            ighl0.c().c(iggi0, ((int)(v5 / 10L)));
            return v + v4;
        }
        return ~v;
    }

    @Override  // ighr
    public final void d(Appendable appendable0, igdm igdm0, Locale locale0) {
        this.f(appendable0, igdm0.h().O(igdm0), igdm0.h());
    }

    @Override  // ighr
    public final void e(Appendable appendable0, long v, igcm igcm0, int v1, igcw igcw0, Locale locale0) {
        this.f(appendable0, v, igcm0);
    }

    protected final void f(Appendable appendable0, long v, igcm igcm0) {
        long v5;
        long v2;
        igcp igcp0 = this.c.a(igcm0);
        int v1 = this.a;
        try {
            v2 = igcp0.i(v);
        }
        catch(RuntimeException unused_ex) {
            ighi.b(appendable0, v1);
            return;
        }
        if(Long.compare(v2, 0L) == 0) {
            while(true) {
                --v1;
                if(v1 < 0) {
                    return;
                }
                appendable0.append('0');
            }
        }
        long v3 = igcp0.w().c();
        int v4;
        for(v4 = this.b; true; --v4) {
            switch(v4) {
                case 1: {
                    v5 = 10L;
                    break;
                }
                case 2: {
                    v5 = 100L;
                    break;
                }
                case 3: {
                    v5 = 1000L;
                    break;
                }
                case 4: {
                    v5 = 10000L;
                    break;
                }
                case 5: {
                    v5 = 100000L;
                    break;
                }
                case 6: {
                    v5 = 1000000L;
                    break;
                }
                case 7: {
                    v5 = 10000000L;
                    break;
                }
                case 8: {
                    v5 = 100000000L;
                    break;
                }
                case 9: {
                    v5 = 1000000000L;
                    break;
                }
                case 10: {
                    v5 = 10000000000L;
                    break;
                }
                case 11: {
                    v5 = 100000000000L;
                    break;
                }
                case 12: {
                    v5 = 1000000000000L;
                    break;
                }
                case 13: {
                    v5 = 10000000000000L;
                    break;
                }
                case 14: {
                    v5 = 100000000000000L;
                    break;
                }
                case 15: {
                    v5 = 1000000000000000L;
                    break;
                }
                case 16: {
                    v5 = 10000000000000000L;
                    break;
                }
                case 17: {
                    v5 = 100000000000000000L;
                    break;
                }
                case 18: {
                    v5 = 1000000000000000000L;
                    break;
                }
                default: {
                    v5 = 1L;
                }
            }
            if(v3 * v5 / v5 == v3) {
                break;
            }
        }
        long v7 = v2 * v5 / v3;
        String s = (0x7FFFFFFFL & v7) == v7 ? Integer.toString(((int)v7)) : Long.toString(v7);
        int v8 = (int)(((long)v4));
        int v9 = s.length();
        while(v9 < v8) {
            appendable0.append('0');
            --v1;
            --v8;
        }
        if(v1 < v8) {
            while(v1 < v8 && v9 > 1 && s.charAt(v9 - 1) == 0x30) {
                --v8;
                --v9;
            }
            if(v9 < s.length()) {
                for(int v6 = 0; v6 < v9; ++v6) {
                    appendable0.append(s.charAt(v6));
                }
                return;
            }
        }
        appendable0.append(s);
    }
}

