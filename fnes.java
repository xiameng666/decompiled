import android.content.Context;

@ibnh
public final class fnes {
    private final fndh a;
    private final fnem b;

    public fnes(Context context0) {
        fnem fnem0 = new fnem(context0);
        ibuq.f(context0, "context");
        ibuq.f(context0, "context");
        fndh fndh0 = new fndh(context0, new azts(context0, bhcb.a, azsx.s, aztr_settings.a));
        ibuq.f(context0, "context");
        super();
        this.b = fnem0;
        this.a = fndh0;
    }

    public final Object a(String s, ibrl ibrl0) {
        String s1;
        bhbp bhbp0;
        fner fner0;
        if((ibrl0 instanceof fner)) {
            fner0 = (fner)ibrl0;
            int v = fner0.c;
            if((v & 0x80000000) == 0) {
                fner0 = new fner(this, ibrl0);
            }
            else {
                fner0.c = v - 0x80000000;
            }
        }
        else {
            fner0 = new fner(this, ibrl0);
        }
        Object object0 = fner0.a;
        Object object1 = ibrx.a;
        switch(fner0.c) {
            case 0: {
                ibnx.b(object0);
                sct.c("DefaultStableEnvironmentManager", "Unsetting stable environment for reason " + s);
                fner0.d = s;
                fner0.c = 1;
                ibuq.f(s, "<this>");
                switch(s) {
                    case "ENTERPRISE_AUTH_MANAGED": {
                        bhbp0 = bhbp.d;
                        break;
                    }
                    case "ENTERPRISE_CLOUDDPC": {
                        bhbp0 = bhbp.b;
                        break;
                    }
                    case "ENTERPRISE_VOLTRON": {
                        bhbp0 = bhbp.c;
                        break;
                    }
                    default: {
                        bhbp0 = null;
                    }
                }
                if(bhbp0 == null) {
                    sct.e("DefaultStableEnvironmentManager", a.i(null, "Critical user interaction ", " is not supported"));
                    object0 = fndi.e;
                }
                else {
                    object0 = fndh.a(this.a, bhbp0, fner0);
                }
                if(object0 == object1) {
                    return object1;
                }
                goto label_35;
            }
            case 1: {
                s = fner0.d;
                ibnx.b(object0);
            label_35:
                if(((fndi)object0) == fndi.e) {
                    sct.e("DefaultStableEnvironmentManager", "Critical user interaction is not supported");
                }
                else if(((fndi)object0) != fndi.a) {
                    sct.e("DefaultStableEnvironmentManager", a.L(((fndi)object0), s, "Failed to advise end of CUI for reason ", " with result code "));
                    ibuq.f(((fndi)object0), "<this>");
                    switch(((fndi)object0).ordinal()) {
                        case 0: {
                            return rsc.a;
                        }
                        case 1: {
                            return rsc.c;
                        }
                        case 2: {
                            return rsc.d;
                        }
                        case 3: {
                            return rsc.f;
                        }
                        case 4: {
                            return rsc.b;
                        }
                        default: {
                            throw new ibnq();
                        }
                    }
                }
                fner0.d = s;
                fner0.c = 2;
                ibuq.f(s, "<this>");
                object0 = fnem.c(this.b, "AOB_" + s, fner0);
                if(object0 == object1) {
                    return object1;
                }
                s1 = s;
                break;
            }
            case 2: {
                s1 = fner0.d;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((fnep)object0) != fnep.a) {
            sct.e("DefaultStableEnvironmentManager", a.L(((fnep)object0), s1, "Failed to resume updates for reason ", " with result code "));
            ibuq.f(((fnep)object0), "<this>");
            switch(((fnep)object0).ordinal()) {
                case 0: {
                    return rsc.a;
                }
                case 1: {
                    return rsc.c;
                }
                case 3: {
                    return rsc.e;
                }
                case 4: {
                    return rsc.d;
                }
                default: {
                    return rsc.f;
                }
            }
        }
        return rsc.a;
    }
}

