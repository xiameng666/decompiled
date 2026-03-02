public final class grjr extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final grjr a;
    public hfuo b;
    private static volatile Parser c;

    static {
        grjr grjr0 = new grjr();
        grjr.a = grjr0;
        ProtoLiteMessage.L(grjr.class, ((ProtoLiteMessage)grjr0));
    }

    private grjr() {
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
                    return new hfvw(((MessageLite)grjr.a), "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", grjq.class});
                }
                case 3: {
                    return new grjr();
                }
                case 4: {
                    return new grjp();
                }
                case 5: {
                    return grjr.a;
                }
                case 6: {
                    Object object1 = grjr.c;
                    if(object1 == null) {
                        Class class0 = grjr.class;
                        synchronized(class0) {
                            hfvs0 = grjr.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)grjr.a));
                                grjr.c = hfvs0;
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

