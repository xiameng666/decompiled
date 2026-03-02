import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public final class cqse {
    private final List a;
    private final List b;
    private cqso c;
    private cqto d;
    private cqrt e;
    private cqrt f;
    private long g;
    private int h;

    public cqse(long v) {
        this.h = -1;
        this.g = v;
        this.a = new LinkedList();
        this.b = new LinkedList();
    }

    public final int a() {
        synchronized(this) {
        }
        return this.h;
    }

    public final cqrt b() {
        synchronized(this) {
        }
        return this.e;
    }

    public final cqrt c() {
        synchronized(this) {
        }
        return this.f;
    }

    public final cqso d() {
        synchronized(this) {
        }
        return this.c;
    }

    public final cqto e() {
        synchronized(this) {
        }
        return this.d;
    }

    public final String f() {
        synchronized(this) {
            List list0 = this.b;
            if(!list0.isEmpty()) {
                String[] arr_s = ((cqry)list0.get(0)).a;
                if(arr_s != null && arr_s.length > 0) {
                    return arr_s[0];
                }
            }
        }
        return null;
    }

    public final List g() {
        List list0;
        synchronized(this) {
            list0 = new LinkedList(this.b);
        }
        return list0;
    }

    public final List h() {
        List list0;
        synchronized(this) {
            list0 = null;
            for(Object object0: this.b) {
                cqry cqry0 = (cqry)object0;
                String s = cqry0.b() ? cqry0.c[0] : null;
                if(s != null) {
                    if(list0 == null) {
                        list0 = new LinkedList();
                    }
                    list0.add(s);
                }
            }
        }
        return list0;
    }

    public final void i(cqrt cqrt0) {
        synchronized(this) {
            cqrt cqrt1 = this.e;
            if(cqrt1 != null) {
                this.a.remove(cqrt1);
            }
            if(cqrt0 != null && cqrt0.b != null) {
                this.e = cqrt0;
                this.a.add(cqrt0);
            }
        }
    }

    public final void j(cqrt cqrt0) {
        synchronized(this) {
            cqrt cqrt1 = this.f;
            if(cqrt1 != null) {
                this.a.remove(cqrt1);
            }
            if(cqrt0 != null && cqrt0.a != null) {
                this.f = cqrt0;
                this.a.add(cqrt0);
            }
        }
    }

    public final void k(int v) {
        synchronized(this) {
            this.h = v;
        }
    }

    public final void l(cqso cqso0) {
        synchronized(this) {
            cqso cqso1 = this.c;
            if(cqso1 != null) {
                this.a.remove(cqso1);
            }
            this.c = cqso0;
            if(cqso0 != null) {
                this.a.add(cqso0);
            }
        }
    }

    public final void m(cqto cqto0) {
        synchronized(this) {
            cqto cqto1 = this.d;
            if(cqto1 != null) {
                this.a.remove(cqto1);
            }
            this.d = cqto0;
            if(cqto0 != null) {
                this.a.add(cqto0);
            }
        }
    }

    public final boolean n(cqry cqry0) {
        synchronized(this) {
            List list0 = this.b;
            if(!list0.contains(cqry0)) {
                list0.add(cqry0);
                this.a.add(cqry0);
                return true;
            }
        }
        return false;
    }

    public final boolean o() {
        synchronized(this) {
        }
        return this.e != null;
    }

    public final boolean p() {
        synchronized(this) {
        }
        return this.f != null;
    }

    public final boolean q() {
        synchronized(this) {
        }
        return this.c != null;
    }

    public final boolean r() {
        boolean z = false;
        synchronized(this) {
            if(!this.b.isEmpty() && this.c != null && this.d != null) {
                if(this.e != null) {
                    z = true;
                }
                else if(this.f != null) {
                    return true;
                }
            }
        }
        return z;
    }

    public final boolean s() {
        synchronized(this) {
            if(this.f() != null) {
                for(Object object0: this.a) {
                    cqsd cqsd0 = (cqsd)object0;
                    if((!(cqsd0 instanceof cqry) || !((cqry)cqsd0).b()) && cqsd0.e == 0L) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(cqse cqse0) {
        int v1;
        synchronized(this) {
            this.g = cqse0.g;
            boolean z = false;
            v1 = 0;
            for(Object object0: cqse0.g()) {
                v1 |= this.n(((cqry)object0));
            }
            cqso cqso0 = cqse0.d();
            if(cqso0 != null) {
                this.l(cqso0);
                v1 = 1;
            }
            cqto cqto0 = cqse0.e();
            if(cqto0 != null) {
                this.m(cqto0);
                v1 = 1;
            }
            cqrt cqrt0 = cqse0.b();
            if(cqrt0 != null && cqrt0.b != null) {
                this.i(cqrt0);
                v1 = 1;
            }
            cqrt cqrt1 = cqse0.c();
            if(cqrt1 != null && cqrt1.a != null) {
                this.j(cqrt1);
                v1 = 1;
            }
            cqso cqso1 = this.c;
            if(cqso1 != null) {
                if(this.e != null && !Arrays.equals(cqso1.b, this.e.c)) {
                    z = true;
                }
                if(this.f != null && !Arrays.equals(this.c.b, this.f.c) || z) {
                    this.i(null);
                    this.j(null);
                    return true;
                }
            }
        }
        return v1 != 0;
    }
}

