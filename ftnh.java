public final class ftnh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftnh a;
    public hfvh b;
    private static volatile Parser c;

    static {
        ftnh ftnh0 = new ftnh();
        ftnh.a = ftnh0;
        ProtoLiteMessage.L(ftnh.class, ((ProtoLiteMessage)ftnh0));
    }

    private ftnh() {
        this.b = hfvh.a;
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
                    return new hfvw(((MessageLite)ftnh.a), "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", ftng.a});
                }
                case 3: {
                    return new ftnh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftnh.a));
                }
                case 5: {
                    return ftnh.a;
                }
                case 6: {
                    Object object1 = ftnh.c;
                    if(object1 == null) {
                        Class class0 = ftnh.class;
                        synchronized(class0) {
                            hfvs0 = ftnh.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftnh.a));
                                ftnh.c = hfvs0;
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

