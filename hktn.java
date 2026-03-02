public final class hktn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hktn a;
    public ByteString b;
    private static volatile Parser c;

    static {
        hktn hktn0 = new hktn();
        hktn.a = hktn0;
        ProtoLiteMessage.L(hktn.class, ((ProtoLiteMessage)hktn0));
    }

    private hktn() {
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
                    return new hfvw(((MessageLite)hktn.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new hktn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hktn.a));
                }
                case 5: {
                    return hktn.a;
                }
                case 6: {
                    Object object1 = hktn.c;
                    if(object1 == null) {
                        Class class0 = hktn.class;
                        synchronized(class0) {
                            hfvs0 = hktn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hktn.a));
                                hktn.c = hfvs0;
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

