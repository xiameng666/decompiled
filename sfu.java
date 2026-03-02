public final class sfu extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final sfu a;
    public hfuo b;
    private static volatile Parser c;

    static {
        sfu sfu0 = new sfu();
        sfu.a = sfu0;
        ProtoLiteMessage.L(sfu.class, ((ProtoLiteMessage)sfu0));
    }

    private sfu() {
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
                    return new hfvw(((MessageLite)sfu.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", sft.class});
                }
                case 3: {
                    return new sfu();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)sfu.a));
                }
                case 5: {
                    return sfu.a;
                }
                case 6: {
                    Object object1 = sfu.c;
                    if(object1 == null) {
                        Class class0 = sfu.class;
                        synchronized(class0) {
                            hfvs0 = sfu.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)sfu.a));
                                sfu.c = hfvs0;
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

