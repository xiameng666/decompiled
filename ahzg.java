public final class ahzg extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ahzg a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ahzg ahzg0 = new ahzg();
        ahzg.a = ahzg0;
        ProtoLiteMessage.L(ahzg.class, ((ProtoLiteMessage)ahzg0));
    }

    private ahzg() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)ahzg.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ahzf.a});
                }
                case 3: {
                    return new ahzg();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ahzg.a));
                }
                case 5: {
                    return ahzg.a;
                }
                case 6: {
                    Object object1 = ahzg.c;
                    if(object1 == null) {
                        Class class0 = ahzg.class;
                        synchronized(class0) {
                            hfvs0 = ahzg.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ahzg.a));
                                ahzg.c = hfvs0;
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

