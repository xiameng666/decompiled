public final class ajxk extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final ajxk a;
    public int b;
    public ByteString c;
    public ByteString d;
    private static volatile Parser e;

    static {
        ajxk ajxk0 = new ajxk();
        ajxk.a = ajxk0;
        ProtoLiteMessage.L(ajxk.class, ((ProtoLiteMessage)ajxk0));
    }

    private ajxk() {
        this.c = ByteString.b;
        this.d = ByteString.b;
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
                    return new hfvw(((MessageLite)ajxk.a), "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\n\u0003\n", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new ajxk();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)ajxk.a));
                }
                case 5: {
                    return ajxk.a;
                }
                case 6: {
                    Object object1 = ajxk.e;
                    if(object1 == null) {
                        Class class0 = ajxk.class;
                        synchronized(class0) {
                            hfvs0 = ajxk.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)ajxk.a));
                                ajxk.e = hfvs0;
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

