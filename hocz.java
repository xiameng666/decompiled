public final class hocz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hocz a;
    public hfuo b;
    private static volatile Parser c;

    static {
        hocz hocz0 = new hocz();
        hocz.a = hocz0;
        ProtoLiteMessage.L(hocz.class, ((ProtoLiteMessage)hocz0));
    }

    private hocz() {
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
                    return new hfvw(((MessageLite)hocz.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", hoda.class});
                }
                case 3: {
                    return new hocz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hocz.a));
                }
                case 5: {
                    return hocz.a;
                }
                case 6: {
                    Object object1 = hocz.c;
                    if(object1 == null) {
                        Class class0 = hocz.class;
                        synchronized(class0) {
                            hfvs0 = hocz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hocz.a));
                                hocz.c = hfvs0;
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

