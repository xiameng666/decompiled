public final class aldo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aldo a;
    public ByteString b;
    public boolean c;
    private static volatile Parser d;

    static {
        aldo aldo0 = new aldo();
        aldo.a = aldo0;
        ProtoLiteMessage.L(aldo.class, ((ProtoLiteMessage)aldo0));
    }

    private aldo() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)aldo.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0007", new Object[]{"b", "c"});
                }
                case 3: {
                    return new aldo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)aldo.a));
                }
                case 5: {
                    return aldo.a;
                }
                case 6: {
                    Object object1 = aldo.d;
                    if(object1 == null) {
                        Class class0 = aldo.class;
                        synchronized(class0) {
                            hfvs0 = aldo.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aldo.a));
                                aldo.d = hfvs0;
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

