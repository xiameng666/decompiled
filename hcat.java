public final class hcat extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hcat a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hcat hcat0 = new hcat();
        hcat.a = hcat0;
        ProtoLiteMessage.L(hcat.class, ((ProtoLiteMessage)hcat0));
    }

    private hcat() {
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
                    return new hfvw(((MessageLite)hcat.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hcas.class});
                }
                case 3: {
                    return new hcat();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hcat.a));
                }
                case 5: {
                    return hcat.a;
                }
                case 6: {
                    Object object1 = hcat.c;
                    if(object1 == null) {
                        Class class0 = hcat.class;
                        synchronized(class0) {
                            hfvs0 = hcat.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hcat.a));
                                hcat.c = hfvs0;
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

