public final class gtbh extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final gtbh a;
    public ByteString b;
    public ByteString c;
    private static volatile Parser d;

    static {
        gtbh gtbh0 = new gtbh();
        gtbh.a = gtbh0;
        ProtoLiteMessage.L(gtbh.class, ((ProtoLiteMessage)gtbh0));
    }

    private gtbh() {
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
                    return new hfvw(((MessageLite)gtbh.a), "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\n", new Object[]{"b", "c"});
                }
                case 3: {
                    return new gtbh();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)gtbh.a));
                }
                case 5: {
                    return gtbh.a;
                }
                case 6: {
                    Object object1 = gtbh.d;
                    if(object1 == null) {
                        Class class0 = gtbh.class;
                        synchronized(class0) {
                            hfvs0 = gtbh.d;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)gtbh.a));
                                gtbh.d = hfvs0;
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

