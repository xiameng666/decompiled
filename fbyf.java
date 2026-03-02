public final class fbyf extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final fbyf a;
    public int b;
    public ByteString c;
    private static volatile Parser d;

    static {
        fbyf fbyf0 = new fbyf();
        fbyf.a = fbyf0;
        ProtoLiteMessage.L(fbyf.class, ((ProtoLiteMessage)fbyf0));
    }

    private fbyf() {
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
                    return new hfvw(((MessageLite)fbyf.a), "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new fbyf();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)fbyf.a));
                }
                case 5: {
                    return fbyf.a;
                }
                case 6: {
                    Object object1 = fbyf.d;
                    if(object1 == null) {
                        Class class0 = fbyf.class;
                        synchronized(class0) {
                            hfvs0 = fbyf.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)fbyf.a));
                                fbyf.d = hfvs0;
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

