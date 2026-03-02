import android.content.Intent;

public final class dcys implements icih {
    final icih a;

    public dcys(icih icih0) {
        this.a = icih0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        dcyr dcyr0;
        if((ibrl0 instanceof dcyr)) {
            dcyr0 = (dcyr)ibrl0;
            int v = dcyr0.b;
            if((v & 0x80000000) == 0) {
                dcyr0 = new dcyr(this, ibrl0);
            }
            else {
                dcyr0.b = v - 0x80000000;
            }
        }
        else {
            dcyr0 = new dcyr(this, ibrl0);
        }
        Object object1 = dcyr0.a;
        Object object2 = ibrx.a;
        switch(dcyr0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                String s = ((Intent)object0).getAction();
                if(s != null) {
                    switch(s.hashCode()) {
                        case 0x90329445: {
                            if(s.equals("android.net.wifi.WIFI_STATE_CHANGED")) {
                                switch(((Intent)object0).getIntExtra("wifi_state", 4)) {
                                    case 1: 
                                    case 3: {
                                        goto label_22;
                                    }
                                }
                                return ibom.a;
                            label_22:
                                dcyr0.b = 3;
                                if(icih0.a(ibom.a, dcyr0) == object2) {
                                    return object2;
                                }
                            }
                            break;
                        }
                        case -1530327060: {
                            if(s.equals("android.bluetooth.adapter.action.STATE_CHANGED")) {
                                switch(((Intent)object0).getIntExtra("android.bluetooth.adapter.extra.STATE", 0x80000000)) {
                                    case 10: 
                                    case 12: {
                                        goto label_28;
                                    }
                                }
                                return ibom.a;
                            label_28:
                                dcyr0.b = 2;
                                if(icih0.a(ibom.a, dcyr0) == object2) {
                                    return object2;
                                }
                            }
                            break;
                        }
                        case 0xBFD4BDCB: {
                            if(s.equals("android.intent.action.AIRPLANE_MODE")) {
                                goto label_34;
                            }
                            break;
                        }
                        case 0xE1869F52: {
                            if(s.equals("android.location.MODE_CHANGED")) {
                            label_34:
                                dcyr0.b = 1;
                                if(icih0.a(ibom.a, dcyr0) == object2) {
                                    return object2;
                                }
                            }
                            break;
                        }
                        case 0x186F64D7: {
                            if(s.equals("android.net.wifi.WIFI_AP_STATE_CHANGED")) {
                                switch(((Intent)object0).getIntExtra("wifi_state", 4)) {
                                    case 11: 
                                    case 13: {
                                        dcyr0.b = 4;
                                        if(icih0.a(ibom.a, dcyr0) == object2) {
                                            return object2;
                                        }
                                        break;
                                    }
                                    default: {
                                        return ibom.a;
                                    }
                                }
                            }
                            break;
                        }
                        default: {
                            return ibom.a;
                        }
                    }
                }
                return ibom.a;
            }
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

