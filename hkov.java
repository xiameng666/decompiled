public final class hkov extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkov a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hkov hkov0 = new hkov();
        hkov.a = hkov0;
        ProtoLiteMessage.L(hkov.class, ((ProtoLiteMessage)hkov0));
    }

    private hkov() {
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
                    return new hfvw(((MessageLite)hkov.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hkos.class});
                }
                case 3: {
                    return new hkov();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkov.a));
                }
                case 5: {
                    return hkov.a;
                }
                case 6: {
                    Object object1 = hkov.c;
                    if(object1 == null) {
                        Class class0 = hkov.class;
                        synchronized(class0) {
                            hfvs0 = hkov.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkov.a));
                                hkov.c = hfvs0;
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

