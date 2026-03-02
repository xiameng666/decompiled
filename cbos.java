import java.util.Objects;

public final class cbos implements icih {
    final icih a;
    final cbpb b;

    public cbos(icih icih0, cbpb cbpb0) {
        this.a = icih0;
        this.b = cbpb0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        cbpg cbpg0;
        cbor cbor0;
        if((ibrl0 instanceof cbor)) {
            cbor0 = (cbor)ibrl0;
            int v = cbor0.b;
            if((v & 0x80000000) == 0) {
                cbor0 = new cbor(this, ibrl0);
            }
            else {
                cbor0.b = v - 0x80000000;
            }
        }
        else {
            cbor0 = new cbor(this, ibrl0);
        }
        Object object1 = cbor0.a;
        Object object2 = ibrx.a;
        switch(cbor0.b) {
            case 0: {
                ibnx.b(object1);
                icih icih0 = this.a;
                switch(((Number)object0).intValue()) {
                    case 6: {
                        cbpg0 = cbpg.a;
                        break;
                    }
                    case -1: 
                    case 8: 
                    case 9: {
                        cbpg0 = cbpg.b;
                        break;
                    }
                    case 2: 
                    case 5: 
                    case 10: {
                        cbpg0 = cbpg.c;
                        break;
                    }
                    case 0: 
                    case 1: 
                    case 3: 
                    case 4: 
                    case 7: 
                    case 11: 
                    case 12: {
                        cbpg0 = null;
                        break;
                    }
                    default: {
                        Objects.toString(this.b);
                        throw new IllegalArgumentException(this.b.toString() + " is not recognized.");
                    }
                }
                cbor0.b = 1;
                return icih0.a(cbpg0, cbor0) == object2 ? object2 : ibom.a;
            }
            case 1: {
                ibnx.b(object1);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}

