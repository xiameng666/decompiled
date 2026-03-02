public final class htwc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final htwc a;
    public hfuo b;
    private static volatile Parser c;

    static {
        htwc htwc0 = new htwc();
        htwc.a = htwc0;
        ProtoLiteMessage.L(htwc.class, ((ProtoLiteMessage)htwc0));
    }

    private htwc() {
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
                    return new hfvw(((MessageLite)htwc.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", htwb.class});
                }
                case 3: {
                    return new htwc();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)htwc.a));
                }
                case 5: {
                    return htwc.a;
                }
                case 6: {
                    Object object1 = htwc.c;
                    if(object1 == null) {
                        Class class0 = htwc.class;
                        synchronized(class0) {
                            hfvs0 = htwc.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)htwc.a));
                                htwc.c = hfvs0;
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

