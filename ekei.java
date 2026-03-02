import j..util.function.Function.-CC;
import java.util.function.Function;

public final class ekei implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        Long long0;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gdnd.a).v_newBuilder();
        long v = ((ekel)object0).a;
        String s = String.valueOf(v);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp0.b_message;
        s.getClass();
        ((gdnd)hftv0).b |= 1;
        ((gdnd)hftv0).c = s;
        if(!hftv0.isImmutable()) {
            hftp0.ensureMutable();
        }
        ProtoLiteMessage hftv1 = hftp0.b_message;
        ((gdnd)hftv1).b |= 2;
        ((gdnd)hftv1).d = v;
        String s1 = ((ekel)object0).b;
        if(s1 != null) {
            if(!hftv1.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdnd gdnd0 = (gdnd)hftp0.b_message;
            gdnd0.b |= 8;
            gdnd0.f = s1;
        }
        String s2 = ((ekel)object0).c;
        if(s2 != null) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdnd gdnd1 = (gdnd)hftp0.b_message;
            gdnd1.b |= 4;
            gdnd1.e = s2;
        }
        String s3 = ((ekel)object0).d;
        if(s3 != null && !s3.isEmpty()) {
            try {
                long0 = null;
                long0 = Long.parseLong(s3, 16);
            }
            catch(NumberFormatException unused_ex) {
            }
            if(long0 != null) {
                long v1 = (long)long0;
                if(!hftp0.b_message.isImmutable()) {
                    hftp0.ensureMutable();
                }
                gdnd gdnd2 = (gdnd)hftp0.b_message;
                gdnd2.b |= 16;
                gdnd2.g = v1;
            }
        }
        gged_interceptors gged0 = ((ekel)object0).h;
        if(!gged0.isEmpty()) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdnd gdnd3 = (gdnd)hftp0.b_message;
            hfuo hfuo0 = gdnd3.j;
            if(!hfuo0.c()) {
                gdnd3.j = ProtoLiteMessage.E(hfuo0);
            }
            hfrj.E(gged0, gdnd3.j);
        }
        if(((ekel)object0).f == 1) {
            ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)gdlo.a).v_newBuilder();
            if(!hftp1.b_message.isImmutable()) {
                hftp1.ensureMutable();
            }
            gdlo gdlo0 = (gdlo)hftp1.b_message;
            hfuf hfuf0 = gdlo0.b;
            if(!hfuf0.c()) {
                gdlo0.b = ProtoLiteMessage.C(hfuf0);
            }
            gdlo0.b.i(1);
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gdnd gdnd4 = (gdnd)hftp0.b_message;
            gdlo gdlo1 = (gdlo)hftp1.N_build();
            gdlo1.getClass();
            gdnd4.h = gdlo1;
            gdnd4.b |= 0x40;
        }
        int v2 = ((ekel)object0).i;
        if(v2 != 0) {
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            ((gdnd)hftp0.b_message).i = v2 - 1;
            ((gdnd)hftp0.b_message).b |= 0x80;
        }
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)gdnc.a).v_newBuilder();
        int v3 = ((ekel)object0).e;
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        ProtoLiteMessage hftv2 = hftp2.b_message;
        ((gdnc)hftv2).b |= 1;
        ((gdnc)hftv2).c = v3 != 0;
        himd himd0 = ((ekel)object0).g;
        if(himd0 != null) {
            if(!hftv2.isImmutable()) {
                hftp2.ensureMutable();
            }
            ((gdnc)hftp2.b_message).d = himd0;
            ((gdnc)hftp2.b_message).b |= 4;
        }
        gdnc gdnc0 = (gdnc)hftp2.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gdnd gdnd5 = (gdnd)hftp0.b_message;
        gdnc0.getClass();
        gdnd5.k = gdnc0;
        gdnd5.b |= 0x200;
        return (gdnd)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

