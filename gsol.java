public final class gsol extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsol a;
    private static volatile Parser b;
    private hfvh c;

    static {
        gsol gsol0 = new gsol();
        gsol.a = gsol0;
        ProtoLiteMessage.L(gsol.class, ((ProtoLiteMessage)gsol0));
    }

    private gsol() {
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
                    return new hfvw(((MessageLite)gsol.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", gsok.a});
                }
                case 3: {
                    return new gsol();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsol.a));
                }
                case 5: {
                    return gsol.a;
                }
                case 6: {
                    Object object1 = gsol.b;
                    if(object1 == null) {
                        Class class0 = gsol.class;
                        synchronized(class0) {
                            hfvs0 = gsol.b;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsol.a));
                                gsol.b = hfvs0;
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

