import j..util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.List;

public final class akqh extends lsb {
    public static final List a;
    public final ConcurrentHashMap b;
    public lqi c;
    public final akqc d;

    static {
        akqh.a = Arrays.asList(new akqg[]{akqg.b, akqg.c});
    }

    public akqh() {
        this(new akqc());
    }

    public akqh(akqc akqc0) {
        this.b = new ConcurrentHashMap();
        this.c = new lqi(akqg.a);
        this.d = akqc0;
    }

    public final void a(akqg akqg0, int v) {
        int v1 = akqg0.ordinal();
        switch(v1) {
            case 0: {
                this.c.ii((v == 1 ? akqg.b : akqg.e));
                return;
            }
            case 1: {
                this.c.ii((v == 1 ? akqg.c : akqg.e));
                return;
            }
            default: {
                if(v1 != 2) {
                    throw new IllegalStateException("User cannot navigate from state: " + akqg0);
                }
                this.c.ii((v == 1 ? akqg.d : akqg.b));
            }
        }
    }
}

