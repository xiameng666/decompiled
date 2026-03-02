public final class hnve extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnve a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hnve hnve0 = new hnve();
        hnve.a = hnve0;
        ProtoLiteMessage.L(hnve.class, ((ProtoLiteMessage)hnve0));
    }

    private hnve() {
        this.b = hfvv.a;
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
                    return new hfvw(((MessageLite)hnve.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hnva.class});
                }
                case 3: {
                    return new hnve();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnve.a));
                }
                case 5: {
                    return hnve.a;
                }
                case 6: {
                    Object object1 = hnve.c;
                    if(object1 == null) {
                        Class class0 = hnve.class;
                        synchronized(class0) {
                            hfvs0 = hnve.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnve.a));
                                hnve.c = hfvs0;
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

