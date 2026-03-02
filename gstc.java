public final class gstc extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gstc a;
    public hfuf b;
    private static volatile Parser c;

    static {
        gstc gstc0 = new gstc();
        gstc.a = gstc0;
        ProtoLiteMessage.L(gstc.class, ((ProtoLiteMessage)gstc0));
    }

    private gstc() {
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
                    return new hfvw(((MessageLite)gstc.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"b"});
                }
                case 3: {
                    return new gstc();
                }
                case 4: {
                    return new gstb();
                }
                case 5: {
                    return gstc.a;
                }
                case 6: {
                    Object object1 = gstc.c;
                    if(object1 == null) {
                        Class class0 = gstc.class;
                        synchronized(class0) {
                            hfvs0 = gstc.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gstc.a));
                                gstc.c = hfvs0;
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

