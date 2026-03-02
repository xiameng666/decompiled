public final class hkmd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkmd a;
    public int b;
    public Object c;
    public ByteString d;
    private static volatile Parser e;

    static {
        hkmd hkmd0 = new hkmd();
        hkmd.a = hkmd0;
        ProtoLiteMessage.L(hkmd.class, ((ProtoLiteMessage)hkmd0));
    }

    private hkmd() {
        this.b = 0;
        this.d = ByteString.b;
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
                    return new hfvw(((MessageLite)hkmd.a), "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003\n", new Object[]{"c", "b", "d"});
                }
                case 3: {
                    return new hkmd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkmd.a));
                }
                case 5: {
                    return hkmd.a;
                }
                case 6: {
                    Object object1 = hkmd.e;
                    if(object1 == null) {
                        Class class0 = hkmd.class;
                        synchronized(class0) {
                            hfvs0 = hkmd.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkmd.a));
                                hkmd.e = hfvs0;
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

