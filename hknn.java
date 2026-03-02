public final class hknn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hknn a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hknn hknn0 = new hknn();
        hknn.a = hknn0;
        ProtoLiteMessage.L(hknn.class, ((ProtoLiteMessage)hknn0));
    }

    private hknn() {
        this.b = hfvv.a;
    }

    public final void b() {
        hfuo hfuo0 = this.b;
        if(!hfuo0.c()) {
            this.b = ProtoLiteMessage.E(hfuo0);
        }
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
                    return new hfvw(((MessageLite)hknn.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hkoj.class});
                }
                case 3: {
                    return new hknn();
                }
                case 4: {
                    return new hknm();
                }
                case 5: {
                    return hknn.a;
                }
                case 6: {
                    Object object1 = hknn.c;
                    if(object1 == null) {
                        Class class0 = hknn.class;
                        synchronized(class0) {
                            hfvs0 = hknn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hknn.a));
                                hknn.c = hfvs0;
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

