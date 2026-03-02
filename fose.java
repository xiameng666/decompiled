import j..util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class fose {
    final ConcurrentHashMap a;
    private static final gfud b;
    private static final Pattern c;

    static {
        fose.b = gfud.e('/');
        fose.c = Pattern.compile("^(\\*[a-z]+\\*).*");
    }

    public fose() {
        this.a = new ConcurrentHashMap();
    }

    static String a(String s) {
        List list0 = fose.b.n(s);
        return list0.size() == 3 ? ((String)list0.get(0)) : "MALFORMED";
    }

    final iczm b(iczm iczm0) {
        if(((iczm0.e == null ? iczg.a : iczm0.e).b & 1) != 0) {
            iczg iczg0 = iczm0.e == null ? iczg.a : iczm0.e;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)iczg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)iczg0));
            Long long0 = (Long)this.a.get(Long.valueOf(((iczg)hftp0.b_message).c));
            gftb.check(long0);
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)iczm0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)iczm0));
            long v = (long)long0;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczg iczg1 = (iczg)hftp0.b_message;
            iczg1.b |= 1;
            iczg1.c = v;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            iczm iczm1 = (iczm)hftp1.b_message;
            iczg iczg2 = (iczg)hftp0.N_build();
            iczg2.getClass();
            iczm1.e = iczg2;
            iczm1.b |= 4;
            return (iczm)hftp1.N_build();
        }
        return iczm0;
    }

    final iczm c(int v, iczm iczm0) {
        if(((iczm0.e == null ? iczg.a : iczm0.e).b & 2) != 0) {
            iczg iczg0 = iczm0.e == null ? iczg.a : iczm0.e;
            ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)iczg0).jf(5, null);
            hftp0.X(((ProtoLiteMessage)iczg0));
            ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)iczm0).jf(5, null);
            hftp1.X(((ProtoLiteMessage)iczm0));
            String s = ((iczg)hftp0.b_message).d;
            Long long0 = gnul.a(s);
            gftb.check(long0);
            ConcurrentHashMap concurrentHashMap0 = this.a;
            long v1 = (long)long0;
            if(!concurrentHashMap0.containsKey(long0)) {
                switch(v - 1) {
                    case 0: {
                        Matcher matcher0 = fose.c.matcher(s);
                        if(matcher0.matches()) {
                            s = s.startsWith("*sync*/") ? "*sync*/" + fose.a(s.substring(7)) : matcher0.group(1);
                        }
                        break;
                    }
                    case 1: {
                        s = fose.a(s);
                        break;
                    }
                    case 2: {
                        s = "--";
                    }
                }
                Long long1 = gnul.a(s);
                if(long1 != null) {
                    concurrentHashMap0.putIfAbsent(long0, long1);
                }
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((iczg)hftv0).b |= 1;
            ((iczg)hftv0).c = v1;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            iczg iczg1 = (iczg)hftp0.b_message;
            iczg1.b &= -3;
            iczg1.d = iczg.a.d;
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            iczm iczm1 = (iczm)hftp1.b_message;
            iczg iczg2 = (iczg)hftp0.N_build();
            iczg2.getClass();
            iczm1.e = iczg2;
            iczm1.b |= 4;
            return (iczm)hftp1.N_build();
        }
        return iczm0;
    }
}

