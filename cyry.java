import android.text.TextUtils;
import j..util.Objects;
import java.util.List;
import java.util.concurrent.TimeUnit;

final class cyry extends gxum {
    final String a;
    final cysc b;

    public cyry(cysc cysc0, String s) {
        this.a = s;
        Objects.requireNonNull(cysc0);
        this.b = cysc0;
        super("WearOsTriggerScan");
    }

    @Override
    public final void run() {
        cysc cysc0 = this.b;
        cxnb cxnb0 = cysc0.b;
        if(cxnb0.o() && !cxnb0.n()) {
            cyrz cyrz0 = cysc0.e;
            long v = cyrz0.a();
            hvpg hvpg0 = hvpg.a;
            if(v < TimeUnit.SECONDS.toMillis(hvpg0.aY().dt())) {
                cysc0.o = true;
                cxnb0.h(cxna.t);
                ggtj ggtj0 = (ggtj)cysc0.n.d().ar(8060);
                String s = this.a;
                ggtj0.B("WearScannerHelper: triggerScan, startScanForPackage=%s", s);
                cxzo cxzo0 = cysc0.k;
                if(!TextUtils.isEmpty(s)) {
                    List list0 = cyrz0.a;
                    if(list0.isEmpty() || ((cysa)gggq.p(list0)).d != 0) {
                    label_18:
                        if(((long)list0.size()) > hvpg0.aY().dr()) {
                            list0.remove(0);
                        }
                        list0.add(new cysa(s, cyrz0.b));
                    }
                    else if(!((cysa)gggq.p(list0)).a.equals(s)) {
                        ((cysa)gggq.p(list0)).a(1, cxzo0);
                        goto label_18;
                    }
                }
                cysc0.i(new cyrx(this), hvpg0.aY().du());
                return;
            }
            ((ggtj)cysc0.n.d().ar(8061)).x("WearScannerHelper: can\'t scan because over limit");
        }
    }
}

