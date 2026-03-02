public final class gptj extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gptj a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gptj gptj0 = new gptj();
        gptj.a = gptj0;
        ProtoLiteMessage.L(gptj.class, ((ProtoLiteMessage)gptj0));
    }

    private gptj() {
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
                    return new hfvw(((MessageLite)gptj.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001B", new Object[]{"b", gpti.class});
                }
                case 3: {
                    return new gptj();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gptj.a));
                }
                case 5: {
                    return gptj.a;
                }
                case 6: {
                    Object object1 = gptj.c;
                    if(object1 == null) {
                        Class class0 = gptj.class;
                        synchronized(class0) {
                            hfvs0 = gptj.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gptj.a));
                                gptj.c = hfvs0;
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

