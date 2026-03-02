public final class aqhv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final aqhv a;
    public hfuo b;
    private static volatile Parser c;

    static {
        aqhv aqhv0 = new aqhv();
        aqhv.a = aqhv0;
        ProtoLiteMessage.L(aqhv.class, ((ProtoLiteMessage)aqhv0));
    }

    private aqhv() {
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
                    return new hfvw(((MessageLite)aqhv.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", aqep.class});
                }
                case 3: {
                    return new aqhv();
                }
                case 4: {
                    return new ProtoLiteBuilder(null, null);
                }
                case 5: {
                    return aqhv.a;
                }
                case 6: {
                    Object object1 = aqhv.c;
                    if(object1 == null) {
                        Class class0 = aqhv.class;
                        synchronized(class0) {
                            hfvs0 = aqhv.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)aqhv.a));
                                aqhv.c = hfvs0;
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

