public final class dlzp implements dmba {
    public final edta a;

    public dlzp(edta edta0) {
        this.a = edta0;
    }

    @Override  // dmba
    public final boolean a(hjrn hjrn0, hjwe hjwe0) {
        ibuq.f(hjrn0, "bulletin");
        ibuq.f(hjwe0, "filter");
        ibuq.f(hjrn0, "<this>");
        hjwf hjwf0 = hjrn0.c == 12 ? ((hjwf)hjrn0.d) : null;
        if(hjwf0 != null) {
            hfuo hfuo0 = hjwf0.h;
            if(hfuo0 != null) {
                for(Object object0: hfuo0) {
                    hjrq hjrq0 = (hjrq)object0;
                    if(hjro.a((hjrq0.b == 1 ? ((hjrp)hjrq0.c) : hjrp.a).b) != hjro.k) {
                        continue;
                    }
                    goto label_14;
                }
                object0 = null;
            label_14:
                if(((hjrq)object0) != null) {
                    hjrp hjrp0 = ((hjrq)object0).b == 1 ? ((hjrp)((hjrq)object0).c) : hjrp.a;
                    if(hjrp0 != null) {
                        hjut hjut0 = hjrp0.b == 11 ? ((hjut)hjrp0.c) : hjut.a;
                        if(hjut0 != null) {
                            hjus hjus0 = hjus.b(hjut0.c) == null ? hjus.g : hjus.b(hjut0.c);
                            return hjus0 == null ? false : ((Boolean)icbb.c(new dlzo(this, hjus0, null))).booleanValue();
                        }
                    }
                }
            }
        }
        return false;
    }
}

