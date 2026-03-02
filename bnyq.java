import android.content.Context;
import android.content.Intent;

public final class bnyq implements gfsi {
    public final bnys a;
    public final fqra b;

    public bnyq(bnys bnys0, fqra fqra0) {
        this.a = bnys0;
        this.b = fqra0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqus fqus0;
        Void void0 = (Void)object0;
        ((ggtj)bnys.a.h()).x("FP SPOT reporting sighting for newly provisioned device.");
        fqra fqra0 = this.b;
        bnys bnys0 = this.a;
        if(hsxl.h()) {
            switch(fqra0.d.ordinal()) {
                case 0: 
                case 1: {
                    goto label_7;
                }
                case 2: 
                case 3: 
                case 4: 
                case 5: 
                case 6: 
                case 7: {
                    break;
                }
                default: {
                    throw new RuntimeException(null, null);
                }
            }
        }
        else {
        label_7:
            Context context0 = bnys0.e;
            Intent intent0 = boxr.b(context0);
            if(intent0 != null) {
                context0.startService(intent0);
            }
        }
        bnyr bnyr0 = new bnyr();
        gszr gszr0 = (gszr)fqra0.f.b(bnyr0).f(gszr.a);
        bpam bpam0 = bnys0.d;
        gsyz gsyz0 = fqra0.a;
        switch(gszr0.ordinal()) {
            case 2: {
                fqus0 = fqus.e;
                break;
            }
            case 3: {
                fqus0 = fqus.f;
                break;
            }
            default: {
                fqus0 = fqus.a;
            }
        }
        bpam0.f(gsyz0, fqus0, fqra0.b, true, haea.h);
        return null;
    }
}

