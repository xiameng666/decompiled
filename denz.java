import android.content.Intent;
import com.google.android.gms.nearby.sharing.QrCodeMetadata;

public final class denz {
    public static final Object a(icih icih0, dcmf dcmf0, Intent intent0, ibrl ibrl0) {
        deny deny0;
        if((ibrl0 instanceof deny)) {
            deny0 = (deny)ibrl0;
            int v = deny0.e;
            if((v & 0x80000000) == 0) {
                deny0 = new deny(ibrl0);
            }
            else {
                deny0.e = v - 0x80000000;
            }
        }
        else {
            deny0 = new deny(ibrl0);
        }
        Object object0 = deny0.d;
        Object object1 = ibrx.a;
        switch(deny0.e) {
            case 0: {
                ibnx.b(object0);
                deny0.a = icih0;
                deny0.b = dcmf0;
                deny0.c = intent0;
                deny0.e = 1;
                if(icih0.a(denp.a, deny0) == object1) {
                    return object1;
                }
                goto label_24;
            }
            case 1: {
                intent0 = deny0.c;
                dcmf0 = deny0.b;
                icih0 = deny0.a;
                ibnx.b(object0);
            label_24:
                evql evql0 = dcmf0.E(new dckg(intent0));
                deny0.a = icih0;
                deny0.b = null;
                deny0.c = null;
                deny0.e = 2;
                object0 = dcwp.a(evql0, deny0);
                if(object0 == object1) {
                    return object1;
                }
                goto label_34;
            }
            case 2: {
                icih0 = deny0.a;
                ibnx.b(object0);
            label_34:
                if(((QrCodeMetadata)object0) != null) {
                    dene dene0 = new dene(ddhu.b(((QrCodeMetadata)object0)));
                    deny0.a = null;
                    deny0.e = 3;
                    if(icih0.a(dene0, deny0) == object1) {
                        return object1;
                    }
                }
                return ibom.a;
            }
            case 3: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

