public final class dxfb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dxfb a;
    public hfvh b;
    private static volatile Parser c;

    static {
        dxfb dxfb0 = new dxfb();
        dxfb.a = dxfb0;
        ProtoLiteMessage.L(dxfb.class, ((ProtoLiteMessage)dxfb0));
    }

    private dxfb() {
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
                    return new hfvw(((MessageLite)dxfb.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dxfa.a});
                }
                case 3: {
                    return new dxfb();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return dxfb.a;
                }
                case 6: {
                    Object object1 = dxfb.c;
                    if(object1 == null) {
                        Class class0 = dxfb.class;
                        synchronized(class0) {
                            hfvs0 = dxfb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dxfb.a));
                                dxfb.c = hfvs0;
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

