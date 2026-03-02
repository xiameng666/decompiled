public final class hnru extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnru a;
    public hfui b;
    private static volatile Parser c;

    static {
        hnru hnru0 = new hnru();
        hnru.a = hnru0;
        ProtoLiteMessage.L(hnru.class, ((ProtoLiteMessage)hnru0));
    }

    private hnru() {
        this.b = hfvb.a;
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
                    return new hfvw(((MessageLite)hnru.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
                }
                case 3: {
                    return new hnru();
                }
                case 4: {
                    return new hnrt();
                }
                case 5: {
                    return hnru.a;
                }
                case 6: {
                    Object object1 = hnru.c;
                    if(object1 == null) {
                        Class class0 = hnru.class;
                        synchronized(class0) {
                            hfvs0 = hnru.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnru.a));
                                hnru.c = hfvs0;
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

