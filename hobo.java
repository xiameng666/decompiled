public final class hobo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hobo a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        hobo hobo0 = new hobo();
        hobo.a = hobo0;
        ProtoLiteMessage.L(hobo.class, ((ProtoLiteMessage)hobo0));
    }

    private hobo() {
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
                    return new hfvw(((MessageLite)hobo.a), "\u0000\u0006\u0001\u0000\u0001\t\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0006<\u0000\u0007<\u0000\t<\u0000", new Object[]{"c", "b", hoby.class, hobi.class, hobv.class, hocf.class, hobs.class, hocq.class});
                }
                case 3: {
                    return new hobo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hobo.a));
                }
                case 5: {
                    return hobo.a;
                }
                case 6: {
                    Object object1 = hobo.d;
                    if(object1 == null) {
                        Class class0 = hobo.class;
                        synchronized(class0) {
                            hfvs0 = hobo.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hobo.a));
                                hobo.d = hfvs0;
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

