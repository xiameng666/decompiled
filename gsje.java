public final class gsje extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsje a;
    private static volatile Parser b;
    private hfvh c;

    static {
        gsje gsje0 = new gsje();
        gsje.a = gsje0;
        ProtoLiteMessage.L(gsje.class, ((ProtoLiteMessage)gsje0));
    }

    private gsje() {
        this.c = hfvh.a;
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
                    return new hfvw(((MessageLite)gsje.a), "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0001\u0000\u0000\u00032", new Object[]{"c", gsjd.a});
                }
                case 3: {
                    return new gsje();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsje.a));
                }
                case 5: {
                    return gsje.a;
                }
                case 6: {
                    Object object1 = gsje.b;
                    if(object1 == null) {
                        Class class0 = gsje.class;
                        synchronized(class0) {
                            hfvs0 = gsje.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsje.a));
                                gsje.b = hfvs0;
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

