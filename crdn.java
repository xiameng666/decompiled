final class crdn {
    final String a;
    final String b;
    final long c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    public crdn(String s, String s1, long v) {
        this(s, s1, 0L, 0L, 0L, v, 0L, null, null, null, null);
    }

    public crdn(String s, String s1, long v, long v1, long v2, long v3, long v4, Long long0, Long long1, Long long2, Boolean boolean0) {
        batl.q(s);
        batl.q(s1);
        boolean z = true;
        batl.b(Long.compare(v, 0L) >= 0);
        batl.b(v1 >= 0L);
        batl.b(v2 >= 0L);
        if(v4 < 0L) {
            z = false;
        }
        batl.b(z);
        this.a = s;
        this.b = s1;
        this.c = v;
        this.d = v1;
        this.e = v2;
        this.f = v3;
        this.g = v4;
        this.h = long0;
        this.i = long1;
        this.j = long2;
        this.k = boolean0;
    }

    final crdn a(Long long0, Long long1, Boolean boolean0) {
        return new crdn(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, long0, long1, boolean0);
    }

    final crdn b(long v, long v1) {
        return new crdn(this.a, this.b, this.c, this.d, this.e, this.f, v, v1, this.i, this.j, this.k);
    }

    final crdn c(long v) {
        return new crdn(this.a, this.b, this.c, this.d, this.e, v, this.g, this.h, this.i, this.j, this.k);
    }
}

