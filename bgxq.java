public final class bgxq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final bgxq a;
    public hfvh b;
    private static volatile Parser c;

    static {
        bgxq bgxq0 = new bgxq();
        bgxq.a = bgxq0;
        ProtoLiteMessage.L(bgxq.class, ((ProtoLiteMessage)bgxq0));
    }

    private bgxq() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)bgxq.a), "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", bgxp.a});
                }
                case 3: {
                    return new bgxq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)bgxq.a));
                }
                case 5: {
                    return bgxq.a;
                }
                case 6: {
                    Object object1 = bgxq.c;
                    if(object1 == null) {
                        Class class0 = bgxq.class;
                        synchronized(class0) {
                            hfvs0 = bgxq.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)bgxq.a));
                                bgxq.c = hfvs0;
                            }
                        }
                        return hfvs0;
                    }
                    return object1;
                }
                default: {
                    return null;
                }
            }
        }
        throw null;
    }
}

