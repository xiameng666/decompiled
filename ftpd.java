public final class ftpd extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftpd a;
    public int b;
    public int c;
    public int d;
    private static volatile Parser e;

    static {
        ftpd ftpd0 = new ftpd();
        ftpd.a = ftpd0;
        ProtoLiteMessage.L(ftpd.class, ((ProtoLiteMessage)ftpd0));
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
                    return new hfvw(((MessageLite)ftpd.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new ftpd();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftpd.a));
                }
                case 5: {
                    return ftpd.a;
                }
                case 6: {
                    Object object1 = ftpd.e;
                    if(object1 == null) {
                        Class class0 = ftpd.class;
                        synchronized(class0) {
                            hfvs0 = ftpd.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftpd.a));
                                ftpd.e = hfvs0;
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

