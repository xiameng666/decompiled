public final class gsnq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsnq a;
    public int b;
    public hfui c;
    private static volatile Parser d;

    static {
        gsnq gsnq0 = new gsnq();
        gsnq.a = gsnq0;
        ProtoLiteMessage.L(gsnq.class, ((ProtoLiteMessage)gsnq0));
    }

    private gsnq() {
        this.c = hfvb.a;
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
                    return new hfvw(((MessageLite)gsnq.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002%", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gsnq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsnq.a));
                }
                case 5: {
                    return gsnq.a;
                }
                case 6: {
                    Object object1 = gsnq.d;
                    if(object1 == null) {
                        Class class0 = gsnq.class;
                        synchronized(class0) {
                            hfvs0 = gsnq.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsnq.a));
                                gsnq.d = hfvs0;
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

