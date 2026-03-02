import java.util.HashMap;
import java.util.Map;

public final class hmpd {
    final Map a;
    final Map b;
    final Map c;

    public hmpd() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
    }

    public final hmpc a(int v) {
        int v1 = hmpb.e(v);
        int v2 = v % v1;
        if(v1 == 16) {
            v2 = hmpb.d(v2);
        }
        Integer integer0 = v2;
        return new hmpc(((Boolean)this.a.get(integer0)).booleanValue(), ((Boolean)this.b.get(integer0)).booleanValue(), ((Boolean)this.c.get(integer0)).booleanValue());
    }

    public final void b(byte[] arr_b) {
        int v = arr_b[7];
        int v1 = arr_b[8];
        boolean z = false;
        Integer integer0 = (int)0;
        this.a.put(integer0, Boolean.valueOf((v & 16) == 16));
        Integer integer1 = (int)1;
        this.a.put(integer1, Boolean.valueOf((v & 0x20) == 0x20));
        Integer integer2 = (int)2;
        this.a.put(integer2, Boolean.valueOf((v & 0x40) == 0x40));
        Integer integer3 = (int)3;
        this.a.put(integer3, Boolean.valueOf((v & 0xFFFFFF80) == 0xFFFFFF80));
        this.b.put(integer0, Boolean.valueOf(1 == (v1 & 1)));
        this.b.put(integer1, Boolean.valueOf((v1 & 2) == 2));
        this.b.put(integer2, Boolean.valueOf((v1 & 4) == 4));
        this.b.put(integer3, Boolean.valueOf((v1 & 8) == 8));
        Map map0 = this.c;
        map0.put(integer0, Boolean.valueOf((v1 & 16) == 16));
        map0.put(integer1, Boolean.valueOf((v1 & 0x20) == 0x20));
        map0.put(integer2, Boolean.valueOf((v1 & 0x40) == 0x40));
        if((v1 & 0xFFFFFF80) == 0xFFFFFF80) {
            z = true;
        }
        map0.put(integer3, Boolean.valueOf(z));
    }
}

