public final class gsfk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gsfk a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gsfk gsfk0 = new gsfk();
        gsfk.a = gsfk0;
        ProtoLiteMessage.L(gsfk.class, ((ProtoLiteMessage)gsfk0));
    }

    private gsfk() {
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
                    return new hfvw(((MessageLite)gsfk.a), "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001B", new Object[]{"b", gsex.class});
                }
                case 3: {
                    return new gsfk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gsfk.a));
                }
                case 5: {
                    return gsfk.a;
                }
                case 6: {
                    Object object1 = gsfk.c;
                    if(object1 == null) {
                        Class class0 = gsfk.class;
                        synchronized(class0) {
                            hfvs0 = gsfk.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gsfk.a));
                                gsfk.c = hfvs0;
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

