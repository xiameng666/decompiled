import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class bdla extends lsb {
    public static final bboh a;
    public final bdiy b;
    public final icnj c;
    public final bxox d;
    public final lqd e;
    public final lqd f;
    public final lqd g;
    public final icnl h;
    private final bgkw i;
    private final lrf j;
    private final bxox k;
    private final bxox l;

    static {
        bdla.a = bboh.b("CredentialExporterVM", bbcu.cX);
    }

    public bdla(bdiy bdiy0, bgkw bgkw0, lrf lrf0) {
        ibuq.f(lrf0, "savedStateHandle");
        bdsb bdsb0;
        bdiq bdiq0;
        super();
        this.b = bdiy0;
        this.i = bgkw0;
        this.j = lrf0;
        String s = bdkb.b(this.a()).a;
        boolean z = false;
        ApplicationInfo applicationInfo0 = bdiy0.b.getApplicationInfo(s, 0);
        ibuq.e(applicationInfo0, "getApplicationInfo(...)");
        String s1 = (String)ibpo.T(bdiy0.d.a());
        if(s1 != null && bdiy0.d.a().contains(s1)) {
            hfuo hfuo0 = hsab.a.d().c().b;
            ibuq.e(hfuo0, "getElementList(...)");
            ibuq.f(hfuo0, "prefixList");
            if(!(hfuo0 instanceof Collection) || !hfuo0.isEmpty()) {
                for(Object object0: hfuo0) {
                    if(ibzk.W(s, ((String)object0))) {
                        z = true;
                        break;
                    }
                }
            }
            bdiq0 = new bdiq(s1, z, bdiy0.b.getApplicationIcon(applicationInfo0), bdiy0.b.getApplicationLabel(applicationInfo0).toString());
        }
        else {
            ((ggtj)bdiy.a.j()).x("Account name does not exist on this device");
            bdiq0 = null;
        }
        if(bdiq0 == null) {
            ((ggtj)bdla.a.j()).x("Cannot determine importing info");
            bdsb0 = bdsb.a;
        }
        else if(bdiq0.c) {
            ((ggtj)bdla.a.j()).B("Importer %s was blocked", bdiq0.b);
            bdsb0 = bdsc.a;
        }
        else {
            bdsb0 = new bdsd(bdiq0.a, bdiq0.d, bdiq0.e);
        }
        icnl icnl0 = icnm.a(bdsb0);
        this.h = icnl0;
        this.c = new icmp(icnl0);
        bxox bxox0 = new bxox();
        this.d = bxox0;
        this.e = bxox0;
        bxox bxox1 = new bxox();
        this.k = bxox1;
        this.f = bxox1;
        bxox bxox2 = new bxox();
        this.l = bxox2;
        this.g = bxox2;
        icbb.b(lsc.a(this), null, null, new bdkw(this, null), 3);
    }

    public final Intent a() {
        Object object0 = this.j.d("request_intent_key");
        if(object0 != null) {
            return (Intent)object0;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final Object b(bdsd bdsd0, ibrl ibrl0) {
        Object object3;
        String s1;
        bdky bdky0;
        if((ibrl0 instanceof bdky)) {
            bdky0 = (bdky)ibrl0;
            int v = bdky0.c;
            if((v & 0x80000000) == 0) {
                bdky0 = new bdky(this, ibrl0);
            }
            else {
                bdky0.c = v - 0x80000000;
            }
        }
        else {
            bdky0 = new bdky(this, ibrl0);
        }
        Object object0 = bdky0.a;
        Object object1 = ibrx.a;
        switch(bdky0.c) {
            case 0: {
                ibnx.b(object0);
                bdky0.d = bdsd0;
                bdky0.c = 1;
                object0 = bgkw.a(this.i, bdsd0.a, bdky0);
                if(object0 != object1) {
                    goto label_21;
                }
                return object1;
            }
            case 1: {
                bdsd0 = bdky0.d;
                ibnx.b(object0);
            label_21:
                String s = ((bgku)object0) == null ? null : ((bgku)object0).b;
                Intent intent0 = this.a();
                bdky0.d = bdsd0;
                bdky0.e = s;
                bdky0.c = 2;
                Object object2 = bdiy.a(this.b, bdsd0.a, intent0, bdky0);
                if(object2 != object1) {
                    s1 = s;
                    object0 = object2;
                    object3 = bdsd0;
                    break;
                }
                return object1;
            }
            case 2: {
                String s2 = bdky0.e;
                object3 = bdky0.d;
                ibnx.b(object0);
                s1 = s2;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if((((bdiw)object0) instanceof bdiu)) {
            List list0 = ((bdiu)(((bdiw)object0))).a;
            List list1 = ((bdiu)(((bdiw)object0))).b;
            if(list0.isEmpty() && list1.isEmpty()) {
                return new bdse(object3.a, object3.b);
            }
            ArrayList arrayList0 = new ArrayList(ibpo.q(list0, 10));
            for(Object object4: list0) {
                ibuq.f(((bxwt)object4), "<this>");
                String s3 = ((bxwt)object4).c;
                String s4 = Uri.parse(s3).getHost();
                if(s4 != null) {
                    s3 = s4;
                }
                arrayList0.add(new bdtx(s3, ((bxwt)object4).d));
            }
            ArrayList arrayList1 = new ArrayList(ibpo.q(list1, 10));
            for(Object object5: list1) {
                ibuq.f(((bxws)object5), "<this>");
                arrayList1.add(new bdtx(((bxws)object5).c, ((bxws)object5).f));
            }
            ibuq.f(list0, "passwords");
            ibuq.f(list1, "passkeys");
            return new bdsf(object3.b, object3.c, s1, object3.a, arrayList0, arrayList1, list0, list1, false);
        }
        if((((bdiw)object0) instanceof bdiv)) {
            this.k.l(((bdiv)(((bdiw)object0))).a);
            return object3;
        }
        if((((bdiw)object0) instanceof bdit)) {
            return bdsb.a;
        }
        throw new ibnq();
    }
}

