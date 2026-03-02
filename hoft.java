public final class hoft extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hoft a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hoft hoft0 = new hoft();
        hoft.a = hoft0;
        ProtoLiteMessage.L(hoft.class, ((ProtoLiteMessage)hoft0));
    }

    private hoft() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)hoft.a), "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", hofa.class, hoee.class});
                }
                case 3: {
                    return new hoft();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hoft.a));
                }
                case 5: {
                    return hoft.a;
                }
                case 6: {
                    Object object1 = hoft.d;
                    if(object1 == null) {
                        Class class0 = hoft.class;
                        synchronized(class0) {
                            hfvs0 = hoft.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hoft.a));
                                hoft.d = hfvs0;
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

