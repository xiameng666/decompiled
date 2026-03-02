public final class hnus extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnus a;
    public hfuo b;
    public int c;
    private static volatile Parser d;

    static {
        hnus hnus0 = new hnus();
        hnus.a = hnus0;
        ProtoLiteMessage.L(hnus.class, ((ProtoLiteMessage)hnus0));
    }

    private hnus() {
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
                    return new hfvw(((MessageLite)hnus.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001B\u0002\u0004", new Object[]{"b", hnuw.class, "c"});
                }
                case 3: {
                    return new hnus();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnus.a));
                }
                case 5: {
                    return hnus.a;
                }
                case 6: {
                    Object object1 = hnus.d;
                    if(object1 == null) {
                        Class class0 = hnus.class;
                        synchronized(class0) {
                            hfvs0 = hnus.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnus.a));
                                hnus.d = hfvs0;
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

