import com.google.android.gms.contextmanager.ContextData;
import java.util.List;

public final class bcsk {
    public static final ContextData a(List list0, ProtoLiteBuilder hftp0) {
        if((((hesu)hftp0.b_message).b & 0x20) == 0) {
            hevj hevj0 = bctr.g(System.currentTimeMillis());
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hesu hesu0 = (hesu)hftp0.b_message;
            hevj0.getClass();
            hesu0.h = hevj0;
            hesu0.b |= 0x20;
        }
        if(!list0.isEmpty()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((hesu)hftp0.b_message).j = hfvv.a;
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            hesu hesu1 = (hesu)hftp0.b_message;
            hfuo hfuo0 = hesu1.j;
            if(!hfuo0.c()) {
                hesu1.j = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(list0, hesu1.j);
        }
        return new ContextData(((hesu)hftp0.N_build()));
    }

    public static final void b(long v, ProtoLiteBuilder hftp0) {
        hevj hevj0 = ((hesu)hftp0.b_message).h;
        if(hevj0 == null) {
            hevj0 = hevj.a;
        }
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)hevj0).jf(5, null);
        hftp1.X(((ProtoLiteMessage)hevj0));
        batl.b(hevi.a(((hevj)hftp1.b_message).c) == 2);
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((hevj)hftv0).c = 3;
        ((hevj)hftv0).b |= 1;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        hevj hevj1 = (hevj)hftp1.b_message;
        hevj1.b |= 4;
        hevj1.e = v;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hesu hesu0 = (hesu)hftp0.b_message;
        hevj hevj2 = (hevj)hftp1.N_build();
        hevj2.getClass();
        hesu0.h = hevj2;
        hesu0.b |= 0x20;
    }

    public static final void c(bctr bctr0, ProtoLiteBuilder hftp0) {
        batl.s(bctr0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hesu)hftp0.b_message).h = bctr0.a;
        ((hesu)hftp0.b_message).b |= 0x20;
    }

    public static final void d(hfta hfta0, Object object0, ProtoLiteBuilder hftp0) {
        hftr hftr0 = (hftr)((ProtoLiteMessage)hesv.a).v_newBuilder();
        hftr0.n(hfta0, object0);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        hesu hesu0 = (hesu)hftp0.b_message;
        hesv hesv0 = (hesv)((ProtoLiteBuilder)hftr0).N_build();
        hesv0.getClass();
        hesu0.i = hesv0;
        hesu0.b |= 0x40;
    }

    public static final void e(bctl bctl0, ProtoLiteBuilder hftp0) {
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hesu)hftp0.b_message).k = bctl0.a;
        ((hesu)hftp0.b_message).b |= 0x80;
    }
}

