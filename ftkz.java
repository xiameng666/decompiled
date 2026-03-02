public final class ftkz extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ftkz a;
    public boolean b;
    private static volatile Parser c;

    static {
        ftkz ftkz0 = new ftkz();
        ftkz.a = ftkz0;
        ProtoLiteMessage.L(ftkz.class, ((ProtoLiteMessage)ftkz0));
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
                    return new hfvw(((MessageLite)ftkz.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new ftkz();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ftkz.a));
                }
                case 5: {
                    return ftkz.a;
                }
                case 6: {
                    Object object1 = ftkz.c;
                    if(object1 == null) {
                        Class class0 = ftkz.class;
                        synchronized(class0) {
                            hfvs0 = ftkz.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ftkz.a));
                                ftkz.c = hfvs0;
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

