public final class gssn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gssn a;
    public hfuf b;
    private static volatile Parser c;

    static {
        gssn gssn0 = new gssn();
        gssn.a = gssn0;
        ProtoLiteMessage.L(gssn.class, ((ProtoLiteMessage)gssn0));
    }

    private gssn() {
        this.b = hfty.a;
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
                    return new hfvw(((MessageLite)gssn.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"b"});
                }
                case 3: {
                    return new gssn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gssn.a));
                }
                case 5: {
                    return gssn.a;
                }
                case 6: {
                    Object object1 = gssn.c;
                    if(object1 == null) {
                        Class class0 = gssn.class;
                        synchronized(class0) {
                            hfvs0 = gssn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gssn.a));
                                gssn.c = hfvs0;
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

