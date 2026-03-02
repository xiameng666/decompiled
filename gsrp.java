public final class gsrp extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsrp a;
    public hfvh b;
    private static volatile Parser c;

    static {
        gsrp gsrp0 = new gsrp();
        gsrp.a = gsrp0;
        ProtoLiteMessage.L(gsrp.class, ((ProtoLiteMessage)gsrp0));
    }

    private gsrp() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)gsrp.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", gsro.a});
                }
                case 3: {
                    return new gsrp();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsrp.a));
                }
                case 5: {
                    return gsrp.a;
                }
                case 6: {
                    Object object1 = gsrp.c;
                    if(object1 == null) {
                        Class class0 = gsrp.class;
                        synchronized(class0) {
                            hfvs0 = gsrp.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsrp.a));
                                gsrp.c = hfvs0;
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

