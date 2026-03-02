@Deprecated
public final class gssx extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gssx a;
    public int b;
    public ByteString c;
    private static volatile Parser d;

    static {
        gssx gssx0 = new gssx();
        gssx.a = gssx0;
        ProtoLiteMessage.L(gssx.class, ((ProtoLiteMessage)gssx0));
    }

    private gssx() {
        this.c = ByteString.b;
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
                    return new hfvw(((MessageLite)gssx.a), "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0003\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gssx();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gssx.a));
                }
                case 5: {
                    return gssx.a;
                }
                case 6: {
                    Object object1 = gssx.d;
                    if(object1 == null) {
                        Class class0 = gssx.class;
                        synchronized(class0) {
                            hfvs0 = gssx.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gssx.a));
                                gssx.d = hfvs0;
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

