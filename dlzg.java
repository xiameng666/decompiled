public final class dlzg implements dmba {
    private static final bboh a;
    private final edoq b;

    static {
        dlzg.a = bboh.b("Pay", bbcu.cZ);
    }

    public dlzg(edoq edoq0) {
        this.b = edoq0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        gftb.b(hjwe0.b == 5, "Cannot evaluate this filter, because it is not an NFC Status filter.");
        hjuj hjuj0 = hjwe0.b == 5 ? ((hjuj)hjwe0.c) : hjuj.b;
        int v = this.b.a();
        if(v != 1) {
            for(Object object0: new hfuh(hjuj0.c, hjuj.a)) {
                hjui hjui0 = (hjui)object0;
                switch(v) {
                    case 2: {
                        if(!hjui0.equals(hjui.c)) {
                            continue;
                        }
                        return true;
                    }
                    case 3: {
                        if(hjui0.equals(hjui.b)) {
                            return true;
                        }
                        continue;
                    }
                    default: {
                        if(!hjui0.equals(hjui.d)) {
                            continue;
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        ((ggtj)dlzg.a.i()).B("NFC state unknown, do not show bulletin %s", hjrn0.e);
        return false;
    }
}

