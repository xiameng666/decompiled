import java.util.Map;

public final class cqgr {
    public final ggeo a;

    public cqgr(Map map0) {
        cqgr.a(((boolean)(map0.containsKey(cpzv.a) ^ 1)), "Sync handlers can\'t be registered for the UNKNOWN operation!");
        this.a = ggkm.c(map0);
    }

    public static void a(boolean z, String s) {
        if(z) {
            return;
        }
        throw new cqgn(s);
    }
}

