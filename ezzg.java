import android.content.Context;
import java.util.List;

public final class ezzg {
    public static gihd a(Context context0, fabz fabz0) {
        int v = 0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gihd.a).v_newBuilder();
        gfsx gfsx0 = fabz0.a();
        if(fabz0.d() && gfsx0.i()) {
            if((fabz0 instanceof facd) && !((facd)fabz0).e.get()) {
                v = ((facd)fabz0).f.get() ? 1 : 2;
            }
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gihd gihd0 = (gihd)hftp0.b_message;
            gihd0.b |= 1;
            gihd0.c = v;
            boolean z = ((fabv)gfsx0.d()).b(context0);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gihd gihd1 = (gihd)hftp0.b_message;
            gihd1.b |= 2;
            gihd1.e = z;
            if(hvzg.d()) {
                ggfp ggfp0 = ((fabv)gfsx0.d()).a(context0);
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gihd gihd2 = (gihd)hftp0.b_message;
                hfuf hfuf0 = gihd2.f;
                if(!hfuf0.c()) {
                    gihd2.f = ProtoLiteMessage.C(hfuf0);
                }
                hfrj.E(ggfp0, gihd2.f);
            }
        }
        else {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp0.b_message;
            ((gihd)hftv0).b |= 1;
            ((gihd)hftv0).c = 3;
            if(!hftv0.isImmutable()) {
                hftp0.ensureMutable();
            }
            gihd gihd3 = (gihd)hftp0.b_message;
            gihd3.b |= 2;
            gihd3.e = true;
        }
        List list0 = ezwd.b();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gihd gihd4 = (gihd)hftp0.b_message;
        hfuo hfuo0 = gihd4.d;
        if(!hfuo0.c()) {
            gihd4.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, gihd4.d);
        return (gihd)hftp0.N_build();
    }
}

