public final class rqt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final rqt a;
    private static volatile Parser b;
    private hfvh c;

    static {
        rqt rqt0 = new rqt();
        rqt.a = rqt0;
        ProtoLiteMessage.L(rqt.class, ((ProtoLiteMessage)rqt0));
    }

    private rqt() {
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)rqt.a), "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"c", rqs.a});
                }
                case 3: {
                    return new rqt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)rqt.a));
                }
                case 5: {
                    return rqt.a;
                }
                case 6: {
                    Object object1 = rqt.b;
                    if(object1 == null) {
                        Class class0 = rqt.class;
                        synchronized(class0) {
                            hfvs0 = rqt.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)rqt.a));
                                rqt.b = hfvs0;
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

