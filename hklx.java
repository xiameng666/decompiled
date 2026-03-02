public final class hklx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hklx a;
    public hfuo b;
    public ByteString c;
    private static volatile Parser d;

    static {
        hklx hklx0 = new hklx();
        hklx.a = hklx0;
        ProtoLiteMessage.L(hklx.class, ((ProtoLiteMessage)hklx0));
    }

    private hklx() {
        this.b = hfvv.a;
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)hklx.a), "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001B\u0003\n", new Object[]{"b", hklk.class, "c"});
                }
                case 3: {
                    return new hklx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hklx.a));
                }
                case 5: {
                    return hklx.a;
                }
                case 6: {
                    Object object1 = hklx.d;
                    if(object1 == null) {
                        Class class0 = hklx.class;
                        synchronized(class0) {
                            hfvs0 = hklx.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hklx.a));
                                hklx.d = hfvs0;
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

