public final class aimu implements glzn {
    public final aink a;
    public final byte[] b;
    public final boolean c;
    public final boolean d;
    public final long e;

    public aimu(aink aink0, byte[] arr_b, boolean z, boolean z1, long v) {
        this.a = aink0;
        this.b = arr_b;
        this.c = z;
        this.d = z1;
        this.e = v;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v1;
        int v = ((aiyf)object0).a - 1;
        switch(v) {
            case 1: {
                v1 = 2;
                break;
            }
            case 2: {
                v1 = 4;
                break;
            }
            case 3: {
                v1 = 5;
                break;
            }
            case 4: {
                v1 = 6;
                break;
            }
            case 5: {
                v1 = 7;
                break;
            }
            default: {
                v1 = 1;
            }
        }
        String s = this.a.d;
        this.a.g.n(s, this.b.length, v1, this.c, ((boolean)(this.d ^ 1)), this.e);
        switch(v) {
            case 1: {
                return gmbu.i(Integer.valueOf(this.b.length));
            }
            case 5: {
                return gmbu.h(new aiml(40001));
            }
            default: {
                ((ggtj)aink.a.i()).B("Storage failed! Not allowing access for package \'%s\'", s);
                return gmbu.h(new aiml(8));
            }
        }
    }
}

