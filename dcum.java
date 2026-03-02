import com.google.android.gms.nearby.sharing.TransferMetadata;

final class dcum extends ibsl implements ibtx {
    int a;
    Object b;
    private Object c;

    public dcum(ibrl ibrl0) {
        super(3, ibrl0);
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        dcum dcum0 = new dcum(((ibrl)object2));
        dcum0.c = (icih)object0;
        dcum0.b = (dcrw)object1;
        return dcum0.jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icih icih0 = (icih)this.c;
                Object object3 = this.b;
                if(!(object3 instanceof dcrv)) {
                    if((object3 instanceof dcru)) {
                        dcnn dcnn0 = new dcnn(0x400);
                        dcnn0.e(((dcru)object3).a);
                        TransferMetadata transferMetadata0 = dcnn0.a();
                        this.c = object3;
                        this.a = 1;
                        return icih0.a(transferMetadata0, this) == object1 ? object1 : Boolean.valueOf(((boolean)(((dcrw)object3).a() ^ 1)));
                    }
                    if((object3 instanceof dcrs)) {
                        TransferMetadata transferMetadata1 = new dcnn(0x401).a();
                        this.c = object3;
                        this.a = 2;
                        return icih0.a(transferMetadata1, this) == object1 ? object1 : Boolean.valueOf(((boolean)(((dcrw)object3).a() ^ 1)));
                    }
                    if((object3 instanceof dcrt)) {
                        TransferMetadata transferMetadata2 = new dcnn(1007).a();
                        this.c = object3;
                        this.a = 3;
                        return icih0.a(transferMetadata2, this) == object1 ? object1 : Boolean.valueOf(((boolean)(((dcrw)object3).a() ^ 1)));
                    }
                    if(!(object3 instanceof dcrr)) {
                        throw new ibnq();
                    }
                    TransferMetadata transferMetadata3 = new dcnn(1009).a();
                    this.c = object3;
                    this.a = 4;
                    if(icih0.a(transferMetadata3, this) == object1) {
                        return object1;
                    }
                }
                return Boolean.valueOf(((boolean)(((dcrw)object3).a() ^ 1)));
            }
            case 1: {
                object2 = this.c;
                break;
            }
            case 3: {
                object2 = this.c;
                break;
            }
            default: {
                object2 = this.c;
            }
        }
        ibnx.b(object0);
        return Boolean.valueOf(((boolean)(((dcrw)object2).a() ^ 1)));
    }
}

