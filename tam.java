import java.util.Map;

public abstract class tam {
    public final Map a;
    public String b;

    static {
    }

    public tam(Map map0) {
        this.b = null;
        this.a = map0;
    }

    public final int a(byte b) {
        return (int)Integer.valueOf(tek.a(b));
    }

    public final tbg b() {
        byte[] arr_b = this.h(tbg.c);
        return arr_b == null ? null : new tbg(arr_b);
    }

    public abstract tbt c();

    public final tca d(tcj tcj0) {
        Map map0 = this.a;
        tct tct0 = (tct)map0.get(tct.a);
        tca tca0 = null;
        if(tct0 != null) {
            String s = this.b;
            if(s != null) {
                Map map1 = (Map)tct0.e.get(s);
                if(map1 != null) {
                    tca0 = (tca)map1.get(tcj0);
                }
            }
        }
        if(tca0 == null) {
            tca0 = (tca)map0.get(tcj0);
        }
        if(tca0 != null) {
            return tca0;
        }
        throw new IllegalArgumentException("No such dgi " + tcj0.toString());
    }

    public final tca e(tcj tcj0) {
        byte[] arr_b;
        try {
            arr_b = syn.c;
            return this.d(tcj0);
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            throw new syl("Conditions Not Satisfied", arr_b, illegalArgumentException0);
        }
    }

    public final boolean f(tcj tcj0) {
        Map map0 = this.a;
        tct tct0 = (tct)map0.get(tct.a);
        if(tct0 != null) {
            String s = this.b;
            if(s != null) {
                Map map1 = (Map)tct0.e.get(s);
                return map1 == null || !map1.containsKey(tcj0) ? map0.containsKey(tcj0) : true;
            }
        }
        return map0.containsKey(tcj0);
    }

    public final boolean g(byte b, byte b1) {
        return this.f(new tcj(b, b1));
    }

    public final byte[] h(byte[] arr_b) {
        for(Object object0: this.a.values()) {
            tca tca0 = (tca)object0;
            if((tca0 instanceof tcd) && ((tcd)tca0).a(arr_b)) {
                return ((tcd)tca0).b(arr_b);
            }
        }
        return null;
    }
}

