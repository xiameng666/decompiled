public final class sot extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final sot a;
    public hfuo b;
    private static volatile Parser c;

    static {
        sot sot0 = new sot();
        sot.a = sot0;
        ProtoLiteMessage.L(sot.class, ((ProtoLiteMessage)sot0));
    }

    private sot() {
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
                    return new hfvw(((MessageLite)sot.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", sos.class});
                }
                case 3: {
                    return new sot();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)sot.a));
                }
                case 5: {
                    return sot.a;
                }
                case 6: {
                    Object object1 = sot.c;
                    if(object1 == null) {
                        Class class0 = sot.class;
                        synchronized(class0) {
                            hfvs0 = sot.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)sot.a));
                                sot.c = hfvs0;
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

