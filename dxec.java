public final class dxec extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final dxec a;
    public hfvh b;
    private static volatile Parser c;

    static {
        dxec dxec0 = new dxec();
        dxec.a = dxec0;
        ProtoLiteMessage.L(dxec.class, ((ProtoLiteMessage)dxec0));
    }

    private dxec() {
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
                    return new hfvw(((MessageLite)dxec.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", dxeb.a});
                }
                case 3: {
                    return new dxec();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return dxec.a;
                }
                case 6: {
                    Object object1 = dxec.c;
                    if(object1 == null) {
                        Class class0 = dxec.class;
                        synchronized(class0) {
                            hfvs0 = dxec.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)dxec.a));
                                dxec.c = hfvs0;
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

