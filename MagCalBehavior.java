public final class MagCalBehavior extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final MagCalBehavior a;
    public boolean b_treat_platform_mag_like_internal;
    private static volatile Parser c;

    static {
        MagCalBehavior gvsm0 = new MagCalBehavior();
        MagCalBehavior.a = gvsm0;
        ProtoLiteMessage.L(MagCalBehavior.class, ((ProtoLiteMessage)gvsm0));
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
                    return new hfvw(((MessageLite)MagCalBehavior.a), "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"b"});
                }
                case 3: {
                    return new MagCalBehavior();
                }
                case 4: {
                    return new ProtoLiteBuilder(((ProtoLiteMessage)MagCalBehavior.a));
                }
                case 5: {
                    return MagCalBehavior.a;
                }
                case 6: {
                    Object object1 = MagCalBehavior.c;
                    if(object1 == null) {
                        Class class0 = MagCalBehavior.class;
                        synchronized(class0) {
                            hfvs0 = MagCalBehavior.c;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(((ProtoLiteMessage)MagCalBehavior.a));
                                MagCalBehavior.c = hfvs0;
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

