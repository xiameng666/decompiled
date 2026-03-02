public final class hkrb extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hkrb a;
    public ByteString b;
    private static volatile Parser c;

    static {
        hkrb hkrb0 = new hkrb();
        hkrb.a = hkrb0;
        ProtoLiteMessage.L(hkrb.class, ((ProtoLiteMessage)hkrb0));
    }

    private hkrb() {
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
                    return new hfvw(((MessageLite)hkrb.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new hkrb();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hkrb.a));
                }
                case 5: {
                    return hkrb.a;
                }
                case 6: {
                    Object object1 = hkrb.c;
                    if(object1 == null) {
                        Class class0 = hkrb.class;
                        synchronized(class0) {
                            hfvs0 = hkrb.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hkrb.a));
                                hkrb.c = hfvs0;
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

