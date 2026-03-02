import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class hfld implements Callable {
    public final hfle a;
    public final gged_interceptors b;
    public final List c;
    public final hfnh d;
    public final hfnl e;

    public hfld(hfle hfle0, gged_interceptors gged0, List list0, hfnh hfnh0, hfnl hfnl0) {
        this.a = hfle0;
        this.b = gged0;
        this.c = list0;
        this.d = hfnh0;
        this.e = hfnl0;
    }

    @Override
    public final Object call() {
        hfle hfle0;
        hfnh hfnh0;
        hfnl hfnl0;
        ggqk ggqk0 = this.b.E();
        Iterator iterator0 = this.c.iterator();
        String s = "";
        while(true) {
            hfnl0 = this.e;
            hfnh0 = this.d;
            hfle0 = this.a;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            gmcd gmcd0 = (gmcd)object0;
            try {
                Object object1 = ggqk0.next();
                String s1 = (String)object1;
                try {
                    if(hfnz.a(((hfns)gmbu.r(gmcd0)).c) == 3) {
                        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hfnm.a).v_newBuilder();
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        hfnm hfnm0 = (hfnm)hftp0.b_message;
                        hfnm0.b |= 1;
                        hfnm0.c = false;
                        Object object2 = (hfnm)hftp0.N_build();
                        hfle0.b(((hfnm)object2), hfnh0, hfnl0, s1);
                        return object2;
                    }
                    s = s1;
                    continue;
                }
                catch(Exception unused_ex) {
                    s = s1;
                }
            }
            catch(Exception unused_ex) {
            }
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hfnm.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            hfnm hfnm1 = (hfnm)hftp1.b_message;
            hfnm1.b |= 1;
            hfnm1.c = false;
            Object object3 = (hfnm)hftp1.N_build();
            hfle0.b(((hfnm)object3), hfnh0, hfnl0, s);
            return object3;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)hfnm.a).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        hfnm hfnm2 = (hfnm)hftp2.b_message;
        hfnm2.b |= 1;
        hfnm2.c = true;
        Object object4 = (hfnm)hftp2.N_build();
        hfle0.b(((hfnm)object4), hfnh0, hfnl0, s);
        return object4;
    }
}

