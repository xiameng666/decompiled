public final class hnqt extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnqt a;
    private static volatile Parser b;
    private hfvh c;

    static {
        hnqt hnqt0 = new hnqt();
        hnqt.a = hnqt0;
        ProtoLiteMessage.L(hnqt.class, ((ProtoLiteMessage)hnqt0));
    }

    private hnqt() {
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
                    return new hfvw(((MessageLite)hnqt.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", hnqs.a});
                }
                case 3: {
                    return new hnqt();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnqt.a));
                }
                case 5: {
                    return hnqt.a;
                }
                case 6: {
                    Object object1 = hnqt.b;
                    if(object1 == null) {
                        Class class0 = hnqt.class;
                        synchronized(class0) {
                            hfvs0 = hnqt.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnqt.a));
                                hnqt.b = hfvs0;
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

