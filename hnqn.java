public final class hnqn extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final hnqn a;
    public int b;
    public Object c;
    public int d;
    private static volatile Parser e;

    static {
        hnqn hnqn0 = new hnqn();
        hnqn.a = hnqn0;
        ProtoLiteMessage.L(hnqn.class, ((ProtoLiteMessage)hnqn0));
    }

    private hnqn() {
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
                    return new hfvw(((MessageLite)hnqn.a), "\u0000\u0002\u0001\u0000\u0001\u000B\u0002\u0000\u0000\u0000\u0001\f\u000B<\u0000", new Object[]{"c", "b", "d", hnqv.class});
                }
                case 3: {
                    return new hnqn();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)hnqn.a));
                }
                case 5: {
                    return hnqn.a;
                }
                case 6: {
                    Object object1 = hnqn.e;
                    if(object1 == null) {
                        Class class0 = hnqn.class;
                        synchronized(class0) {
                            hfvs0 = hnqn.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)hnqn.a));
                                hnqn.e = hfvs0;
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

