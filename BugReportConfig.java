public final class BugReportConfig extends ProtoLiteMessage implements MessageLiteOrBuilder {
    public static final BugReportConfig a;
    public int b_InertialAnchor__bug_report_buffer_size_bytes_1000;  // return (long)(((Long)hutx.a.g(0, "InertialAnchor__bug_report_buffer_size_bytes", 1000L).mr()));
    public boolean c_unknown;  // always true
    public int d_InertialAnchor__enable_extended_bug_report;
    private static volatile Parser e;

    static {
        BugReportConfig gvsl0 = new BugReportConfig();
        BugReportConfig.a = gvsl0;
        ProtoLiteMessage.L(BugReportConfig.class, gvsl0);
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
                    return new hfvw(((MessageLite)BugReportConfig.a), "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0004\u0003\u0007\u0004\f", new Object[]{"b", "c", "d"});
                }
                case 3: {
                    return new BugReportConfig();
                }
                case 4: {
                    return new ProtoLiteBuilder(BugReportConfig.a);
                }
                case 5: {
                    return BugReportConfig.a;
                }
                case 6: {
                    Object object1 = BugReportConfig.e;
                    if(object1 == null) {
                        Class class0 = BugReportConfig.class;
                        synchronized(class0) {
                            hfvs0 = BugReportConfig.e;
                            if(hfvs0 == null) {
                                hfvs0 = new hftq(BugReportConfig.a);
                                BugReportConfig.e = hfvs0;
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

