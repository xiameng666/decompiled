public final class ajwq extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ajwq a;
    public ByteString b;
    public ByteString c;
    public long d;
    private static volatile Parser e;

    static {
        ajwq ajwq0 = new ajwq();
        ajwq.a = ajwq0;
        ProtoLiteMessage.L(ajwq.class, ((ProtoLiteMessage)ajwq0));
    }

    private ajwq() {
        this.b = ByteString.b;
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
                    return new hfvw(((MessageLite)ajwq.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\u0002", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new ajwq();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ajwq.a));
                }
                case 5: {
                    return ajwq.a;
                }
                case 6: {
                    Object object1 = ajwq.e;
                    if(object1 == null) {
                        Class class0 = ajwq.class;
                        synchronized(class0) {
                            hfvs0 = ajwq.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ajwq.a));
                                ajwq.e = hfvs0;
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

