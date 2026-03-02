public final class gtag extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtag a;
    public ByteString b;
    private static volatile Parser c;

    static {
        gtag gtag0 = new gtag();
        gtag.a = gtag0;
        ProtoLiteMessage.L(gtag.class, ((ProtoLiteMessage)gtag0));
    }

    private gtag() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)gtag.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"b"});
                }
                case 3: {
                    return new gtag();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtag.a));
                }
                case 5: {
                    return gtag.a;
                }
                case 6: {
                    Object object1 = gtag.c;
                    if(object1 == null) {
                        Class class0 = gtag.class;
                        synchronized(class0) {
                            hfvs0 = gtag.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtag.a));
                                gtag.c = hfvs0;
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

