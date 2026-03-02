public final class hkif extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkif a;
    public ByteString b;
    private static volatile Parser c;

    static {
        hkif hkif0 = new hkif();
        hkif.a = hkif0;
        ProtoLiteMessage.L(hkif.class, ((ProtoLiteMessage)hkif0));
    }

    private hkif() {
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
                    return new hfvw(((MessageLite)hkif.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new hkif();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkif.a));
                }
                case 5: {
                    return hkif.a;
                }
                case 6: {
                    Object object1 = hkif.c;
                    if(object1 == null) {
                        Class class0 = hkif.class;
                        synchronized(class0) {
                            hfvs0 = hkif.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkif.a));
                                hkif.c = hfvs0;
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

