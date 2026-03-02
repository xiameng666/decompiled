public final class gijz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gijz a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gijz gijz0 = new gijz();
        gijz.a = gijz0;
        ProtoLiteMessage.L(gijz.class, ((ProtoLiteMessage)gijz0));
    }

    private gijz() {
        this.b = 0;
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
                    return new hfvw(((MessageLite)gijz.a), "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"c", "b", gijy.class, gikb.class});
                }
                case 3: {
                    return new gijz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gijz.a));
                }
                case 5: {
                    return gijz.a;
                }
                case 6: {
                    Object object1 = gijz.d;
                    if(object1 == null) {
                        Class class0 = gijz.class;
                        synchronized(class0) {
                            hfvs0 = gijz.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gijz.a));
                                gijz.d = hfvs0;
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

