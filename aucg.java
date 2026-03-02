import java.util.HashMap;
import java.util.Map;

public final class aucg {
    final Map a;
    public aucb b;
    private static final avjh c;
    private final atyx d;

    static {
        aucg.c = new avjh("CastMessageDesegmenter");
    }

    public aucg(atyx atyx0) {
        this.a = new HashMap();
        this.d = atyx0;
    }

    public final void a() {
        synchronized(this) {
            this.a.clear();
        }
    }

    public final void b(gehl gehl0) {
        boolean z1;
        synchronized(this) {
            String s = gehl0.f;
            int v1 = gehl0.g;
            boolean z = true;
            if(gehi.a(v1) == 2) {
                z1 = true;
                goto label_10;
            }
            if(gehi.a(v1) == 0 || gehi.a(v1) == 1) {
                z1 = false;
            label_10:
                boolean z2 = gehl0.j;
                if(!gehl0.h.isEmpty()) {
                    if(!z2 && !z1 && !this.a.containsKey(s)) {
                        this.e(gehl0.h, s);
                        gehk gehk0 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                        this.c(gker.b, gehk0, gehl0.h.length());
                        return;
                    }
                    gehk gehk1 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                    this.c(gker.c, gehk1, gehl0.h.length());
                    return;
                }
                if((gehl0.b & 0x40) != 0 && gehl0.i.size() != 0) {
                    Map map0 = this.a;
                    aucf aucf0 = (aucf)map0.get(s);
                    if(aucf0 == null) {
                        if(!z2) {
                            if(z1) {
                                this.d(gehl0.i.toByteArray(), s);
                            }
                            else {
                                this.e(gehl0.i.toStringUtf8(), s);
                            }
                            gehk gehk2 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                            this.c(gker.b, gehk2, gehl0.i.size());
                            return;
                        }
                        aucf0 = new aucf(z1);
                        map0.put(s, aucf0);
                    }
                    else {
                        if(aucf0.b != z1) {
                            aucg.c.g("Received continuation chunk of unexpected type", new Object[0]);
                            gehk gehk3 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                            this.c(gker.e, gehk3, gehl0.i.size());
                            return;
                        }
                        z = z2;
                    }
                    aucf0.a = aucf0.a.t(gehl0.i);
                    if(!z) {
                        ByteString hfsf0 = aucf0.a;
                        if(aucf0.b) {
                            this.d(hfsf0.toByteArray(), s);
                        }
                        else {
                            this.e(hfsf0.toStringUtf8(), s);
                        }
                        map0.remove(s);
                    }
                    gehk gehk4 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                    this.c(gker.b, gehk4, gehl0.i.size());
                    return;
                }
                gehk gehk5 = gehk.b(gehl0.c) == null ? gehk.a : gehk.b(gehl0.c);
                this.c(gker.d, gehk5, 0);
            }
        }
    }

    private final void c(gker gker0, gehk gehk0, int v) {
        atyx atyx0 = this.d;
        if(atyx0 != null) {
            atyw atyw0 = new atyw(gker0, gehk0);
            Map map0 = atyx0.b;
            if(!map0.containsKey(atyw0)) {
                map0.put(atyw0, new atzh());
            }
            ((atzh)map0.get(atyw0)).b(((double)v));
        }
    }

    private final void d(byte[] arr_b, String s) {
        aucb aucb0 = this.b;
        if(aucb0 != null) {
            aucb0.a.ad(arr_b, s);
        }
    }

    private final void e(String s, String s1) {
        aucb aucb0 = this.b;
        if(aucb0 != null) {
            aucb0.a.ad(s, s1);
        }
    }
}

