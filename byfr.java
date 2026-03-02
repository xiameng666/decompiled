public final class byfr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final byfr a;
    public hfvh b;
    private static volatile Parser c;

    static {
        byfr byfr0 = new byfr();
        byfr.a = byfr0;
        ProtoLiteMessage.L(byfr.class, ((ProtoLiteMessage)byfr0));
    }

    private byfr() {
        this.b = hfvh.a;
    }

    public final hfvh b() {
        hfvh hfvh0 = this.b;
        if(!hfvh0.b) {
            this.b = hfvh0.a();
        }
        return this.b;
    }

    @Override  // ProtoLiteMessage
    public final Object jf(int v, Object object0) {
        Parser hfvs0;
        if(v != 0) {
            switch(v - 1) {
                case 0: {
                    return (byte)1;
                }
                case 2: {
                    return new hfvw(((MessageLite)byfr.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", byfp.a});
                }
                case 3: {
                    return new byfr();
                }
                case 4: {
                    return new ProtoLiteBuilder(null);
                }
                case 5: {
                    return byfr.a;
                }
                case 6: {
                    Object object1 = byfr.c;
                    if(object1 == null) {
                        Class class0 = byfr.class;
                        synchronized(class0) {
                            hfvs0 = byfr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)byfr.a));
                                byfr.c = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    throw null;
                }
            }
        }
        throw null;
    }
}

