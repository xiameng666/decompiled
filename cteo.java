public final class cteo extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final cteo a;
    public hfuf b;
    public boolean c;
    private static volatile Parser d;

    static {
        cteo cteo0 = new cteo();
        cteo.a = cteo0;
        ProtoLiteMessage.L(cteo.class, ((ProtoLiteMessage)cteo0));
    }

    private cteo() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)cteo.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\'\u0002\u0007", new Object[]{"b", "c"});
                }
                case 3: {
                    return new cteo();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)cteo.a));
                }
                case 5: {
                    return cteo.a;
                }
                case 6: {
                    Object object1 = cteo.d;
                    if(object1 == null) {
                        Class class0 = cteo.class;
                        synchronized(class0) {
                            hfvs0 = cteo.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)cteo.a));
                                cteo.d = hfvs0;
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

