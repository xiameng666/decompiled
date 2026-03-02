public final class crsv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final crsv a;
    public hfuo b;
    private static volatile Parser c;

    static {
        crsv crsv0 = new crsv();
        crsv.a = crsv0;
        ProtoLiteMessage.L(crsv.class, ((ProtoLiteMessage)crsv0));
    }

    private crsv() {
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
                    return new hfvw(((MessageLite)crsv.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", crsp.class});
                }
                case 3: {
                    return new crsv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)crsv.a));
                }
                case 5: {
                    return crsv.a;
                }
                case 6: {
                    Object object1 = crsv.c;
                    if(object1 == null) {
                        Class class0 = crsv.class;
                        synchronized(class0) {
                            hfvs0 = crsv.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)crsv.a));
                                crsv.c = hfvs0;
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

