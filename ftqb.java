public final class ftqb {
    public static final dyiw a(dyiw dyiw0, gpzt gpzt0) {
        dyiw dyiw4;
        ibuq.f(dyiw0, "<this>");
        try {
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)dyiw0).jf(5, null);
            ibuq.e(hftp0, "newBuilderForType(...)");
            gpzq gpzq0 = gpzt0.c("en");
            if(gpzq0 != null && !(gpzq0 instanceof gpzs)) {
                String s = ftqd.c(gpzq0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyiw dyiw1 = (dyiw)hftp0.b_message;
                s.getClass();
                dyiw1.b |= 1;
                dyiw1.c = s;
            }
            gpzq gpzq1 = gpzt0.c("sc");
            if(gpzq1 != null && !(gpzq1 instanceof gpzs)) {
                String s1 = ftqd.c(gpzq1);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyiw dyiw2 = (dyiw)hftp0.b_message;
                s1.getClass();
                dyiw2.b |= 2;
                dyiw2.d = s1;
            }
            gpzq gpzq2 = gpzt0.c("tc");
            if(gpzq2 != null && !(gpzq2 instanceof gpzs)) {
                String s2 = ftqd.c(gpzq2);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                dyiw dyiw3 = (dyiw)hftp0.b_message;
                s2.getClass();
                dyiw3.b |= 4;
                dyiw3.e = s2;
            }
            dyiw4 = (dyiw)hftp0.N_build();
        }
        catch(Exception exception0) {
            if((exception0 instanceof hfur)) {
                throw exception0;
            }
            throw new hfur(exception0);
        }
        ibuq.e(dyiw4, "convertExceptionCall(...)");
        return dyiw4;
    }
}

