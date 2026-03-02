public final class htvz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final htvz a;
    public hfvh b;
    private static volatile Parser c;

    static {
        htvz htvz0 = new htvz();
        htvz.a = htvz0;
        ProtoLiteMessage.L(htvz.class, ((ProtoLiteMessage)htvz0));
    }

    private htvz() {
        this.b = hfvh.a;
    }

    public final boolean b(int v) {
        return this.b.containsKey(Integer.valueOf(v));
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
                    return new hfvw(((MessageLite)htvz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", htvy.a});
                }
                case 3: {
                    return new htvz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)htvz.a));
                }
                case 5: {
                    return htvz.a;
                }
                case 6: {
                    Object object1 = htvz.c;
                    if(object1 == null) {
                        Class class0 = htvz.class;
                        synchronized(class0) {
                            hfvs0 = htvz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)htvz.a));
                                htvz.c = hfvs0;
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

