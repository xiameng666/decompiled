public final class ffcn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ffcn a;
    public hfuo b;
    private static volatile Parser c;

    static {
        ffcn ffcn0 = new ffcn();
        ffcn.a = ffcn0;
        ProtoLiteMessage.L(ffcn.class, ((ProtoLiteMessage)ffcn0));
    }

    private ffcn() {
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
                    return new hfvw(((MessageLite)ffcn.a), "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001A", new Object[]{"b"});
                }
                case 3: {
                    return new ffcn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ffcn.a));
                }
                case 5: {
                    return ffcn.a;
                }
                case 6: {
                    Object object1 = ffcn.c;
                    if(object1 == null) {
                        Class class0 = ffcn.class;
                        synchronized(class0) {
                            hfvs0 = ffcn.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ffcn.a));
                                ffcn.c = hfvs0;
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

