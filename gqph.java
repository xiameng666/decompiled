public final class gqph extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gqph a;
    public hfuo b;
    private static volatile Parser c;

    static {
        gqph gqph0 = new gqph();
        gqph.a = gqph0;
        ProtoLiteMessage.L(gqph.class, ((ProtoLiteMessage)gqph0));
    }

    private gqph() {
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
                    return new hfvw(((MessageLite)gqph.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"b"});
                }
                case 3: {
                    return new gqph();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gqph.a));
                }
                case 5: {
                    return gqph.a;
                }
                case 6: {
                    Object object1 = gqph.c;
                    if(object1 == null) {
                        Class class0 = gqph.class;
                        synchronized(class0) {
                            hfvs0 = gqph.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gqph.a));
                                gqph.c = hfvs0;
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

