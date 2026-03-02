public final class gpnv extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gpnv a;
    public int b;
    public Object c;
    private static volatile Parser d;

    static {
        gpnv gpnv0 = new gpnv();
        gpnv.a = gpnv0;
        ProtoLiteMessage.L(gpnv.class, ((ProtoLiteMessage)gpnv0));
    }

    private gpnv() {
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
                    return new hfvw(((MessageLite)gpnv.a), "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003<\u0000", new Object[]{"c", "b", gpnt.class});
                }
                case 3: {
                    return new gpnv();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gpnv.a));
                }
                case 5: {
                    return gpnv.a;
                }
                case 6: {
                    Object object1 = gpnv.d;
                    if(object1 == null) {
                        Class class0 = gpnv.class;
                        synchronized(class0) {
                            hfvs0 = gpnv.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gpnv.a));
                                gpnv.d = hfvs0;
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

