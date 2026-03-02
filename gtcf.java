public final class gtcf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtcf a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gtcf gtcf0 = new gtcf();
        gtcf.a = gtcf0;
        ProtoLiteMessage.L(gtcf.class, ((ProtoLiteMessage)gtcf0));
    }

    private gtcf() {
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
                    return new hfvw(((MessageLite)gtcf.a), "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", gtce.class, gtce.class, gtce.class});
                }
                case 3: {
                    return new gtcf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtcf.a));
                }
                case 5: {
                    return gtcf.a;
                }
                case 6: {
                    Object object1 = gtcf.d;
                    if(object1 == null) {
                        Class class0 = gtcf.class;
                        synchronized(class0) {
                            hfvs0 = gtcf.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtcf.a));
                                gtcf.d = hfvs0;
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

