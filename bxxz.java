import android.util.Log;
import java.util.Iterator;

public final class bxxz {
    public final Object a(String s, ibrl ibrl0) {
        String s1;
        bxxf bxxf0;
        Object object2;
        bxxy bxxy0;
        if((ibrl0 instanceof bxxy)) {
            bxxy0 = (bxxy)ibrl0;
            int v = bxxy0.d;
            if((v & 0x80000000) == 0) {
                bxxy0 = new bxxy(this, ibrl0);
            }
            else {
                bxxy0.d = v - 0x80000000;
            }
        }
        else {
            bxxy0 = new bxxy(this, ibrl0);
        }
        Object object0 = bxxy0.b;
        Object object1 = ibrx.a;
    alab1:
        switch(bxxy0.d) {
            case 0: {
                ibnx.b(object0);
                object2 = ibpo.g(new bxxf[]{bxxf.a, bxxf.b, bxxf.c}).iterator();
                goto label_24;
            }
            case 1: {
                try {
                    bxxf0 = bxxy0.f;
                    object2 = bxxy0.a;
                    s1 = bxxy0.e;
                    ibnx.b(object0);
                    goto label_23;
                }
                catch(IllegalArgumentException unused_ex) {
                    goto label_23;
                }
                catch(cjuh cjuh0) {
                }
                goto label_38;
                while(true) {
                label_23:
                    s = s1;
                    while(true) {
                    label_24:
                        if(!((Iterator)object2).hasNext()) {
                            break alab1;
                        }
                        Object object3 = ((Iterator)object2).next();
                        bxxf bxxf1 = (bxxf)object3;
                        bxxv bxxv0 = new bxxv(bxxf1);
                        try {
                            bxxy0.e = s;
                            bxxy0.a = object2;
                            bxxy0.f = bxxf1;
                            bxxy0.d = 1;
                            if(bxxv0.b(s, bxxy0) == object1) {
                                return object1;
                            }
                            continue;
                        }
                        catch(IllegalArgumentException unused_ex) {
                            continue;
                        }
                        catch(cjuh cjuh1) {
                            goto label_35;
                        }
                        return object1;
                    label_35:
                        bxxf0 = bxxf1;
                        cjuh0 = cjuh1;
                        s1 = s;
                    label_38:
                        Log.e("IDCredServiceImpl", "Failed to clear registries of type " + bxxf0 + " for " + s1, cjuh0);
                        break;
                    }
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibom.a;
    }
}

