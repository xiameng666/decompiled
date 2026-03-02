import java.util.Collection;
import java.util.Map;
import jeb.synthetic.FIN;

public final class bal implements jqv {
    public final bam a;

    public bal(bam bam0) {
        this.a = bam0;
    }

    @Override  // jqv
    public final Object a(jqt jqt0) {
        gmcd gmcd0;
        bam bam0 = this.a;
        bam0.l.d();
        bjb bjb0 = bam0.c;
        Object object0 = bjb0.a;
        __monitor_enter(object0);
        int v = FIN.finallyOpen$NT();
        Map map0 = bjb0.b;
        if(map0.isEmpty()) {
            gmcd0 = bjb0.d == null ? bpt.b(null) : bjb0.d;
            FIN.finallyExec$NT(v);
        }
        else {
            gmcd gmcd1 = bjb0.d;
            if(gmcd1 == null) {
                gmcd1 = jqy.a(new biz(bjb0));
                bjb0.d = gmcd1;
            }
            Collection collection0 = map0.values();
            bjb0.c.addAll(collection0);
            for(Object object1: map0.values()) {
                ((bin)object1).g().hB(new bja(bjb0, ((bin)object1)), bol.a());
            }
            map0.clear();
            FIN.finallyCodeBegin$NT(v);
            gmcd0 = gmcd1;
        }
        gmcd0.hB(new bah(bam0, jqt0), bam0.f);
        return "CameraX shutdownInternal";
    }
}

