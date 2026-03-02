import java.util.Collection;

public final class auig implements auhm {
    public final auim a;

    public auig(auim auim0) {
        this.a = auim0;
    }

    @Override  // auhm
    public final void a(Collection collection0, Collection collection1) {
        auim auim0 = this.a;
        if(auim0.e()) {
            auim.a.c("Skipping Usonia download. The Usonia module is already installed.", new Object[0]);
            return;
        }
        if(!auim0.i.f()) {
            if(System.currentTimeMillis() - auim0.g >= ((long)(((Long)avij.e().a.mr())))) {
                for(Object object0: collection0) {
                    if(((aujj)object0).d().i(0x200)) {
                        auim0.d();
                        return;
                    }
                }
                for(Object object1: collection1) {
                    if(((aujk)object1).d().i(0x200)) {
                        auim0.d();
                        return;
                    }
                }
                return;
            }
            auim.a.c("Skipping Usonia download. Not enough time has passed since the last download attempt.", new Object[0]);
            return;
        }
        auim.a.c("Skipping Usonia download. The current active network is metered.", new Object[0]);
    }
}

