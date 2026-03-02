import java.util.Iterator;
import java.util.List;

final class ahfu implements frik {
    static final hheg a;
    static final hheg b;

    static {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)hheg.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((hheg)hftp0.b_message).c = 0x4F;
        ((hheg)hftp0.b_message).b |= 1;
        ahfu.a = (hheg)hftp0.N_build();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)hheg.a).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((hheg)hftp1.b_message).c = 80;
        ((hheg)hftp1.b_message).b |= 1;
        ahfu.b = (hheg)hftp1.N_build();
    }

    @Override  // frik
    public final gged_interceptors a() {
        return gged_interceptors.m(ahfu.a, ahfu.b);
    }

    @Override  // frik
    public final ggeo b(List list0, MessageLite hfvm0) {
        ggek ggek0 = new ggek();
        Integer integer0 = (int)1;
        if(((ahge)hfvm0).b) {
            hheg hheg0 = ahfu.a;
            hftr hftr0 = (hftr)((ProtoLiteMessage)hheh.a).v_newBuilder();
            if(!hftr0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr0).ensureMutable();
            }
            ((hheh)hftr0.b_message).c = 2;
            ((hheh)hftr0.b_message).d = integer0;
            ggek0.i(hheg0, gfsx.m(((hheh)((ProtoLiteBuilder)hftr0).N_build())));
        }
        else {
            hheg hheg1 = ahfu.a;
            hftr hftr1 = (hftr)((ProtoLiteMessage)hheh.a).v_newBuilder();
            int v = ahfu.f(80, list0);
            if(!hftr1.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr1).ensureMutable();
            }
            ((hheh)hftr1.b_message).c = 2;
            ((hheh)hftr1.b_message).d = v;
            ggek0.i(hheg1, gfsx.m(((hheh)((ProtoLiteBuilder)hftr1).N_build())));
        }
        if(((ahge)hfvm0).c) {
            hheg hheg2 = ahfu.b;
            hftr hftr2 = (hftr)((ProtoLiteMessage)hheh.a).v_newBuilder();
            if(!hftr2.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hftr2).ensureMutable();
            }
            ((hheh)hftr2.b_message).c = 2;
            ((hheh)hftr2.b_message).d = integer0;
            ggek0.i(hheg2, gfsx.m(((hheh)((ProtoLiteBuilder)hftr2).N_build())));
            return ggek0.b();
        }
        hheg hheg3 = ahfu.b;
        hftr hftr3 = (hftr)((ProtoLiteMessage)hheh.a).v_newBuilder();
        int v1 = ahfu.f(81, list0);
        if(!hftr3.b_message.isImmutable()) {
            ((ProtoLiteBuilder)hftr3).ensureMutable();
        }
        ((hheh)hftr3.b_message).c = 2;
        ((hheh)hftr3.b_message).d = v1;
        ggek0.i(hheg3, gfsx.m(((hheh)((ProtoLiteBuilder)hftr3).N_build())));
        return ggek0.b();
    }

    @Override  // frik
    public final ByteString c(MessageLite hfvm0) {
        return ((ahge)hfvm0).d;
    }

    @Override  // frik
    public final MessageLite d(MessageLite hfvm0, ByteString hfsf0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ahge)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ahge)hfvm0))));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ahge)hftp0.b_message).d = hfsf0;
        return (ahge)hftp0.N_build();
    }

    @Override  // frik
    public final MessageLite e(MessageLite hfvm0, List list0) {
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)(((ahge)hfvm0))).jf(5, null);
        hftp0.X(((ProtoLiteMessage)(((ahge)hfvm0))));
        Iterator iterator0 = list0.iterator();
        while(iterator0.hasNext()) {
            boolean z = false;
            Object object0 = iterator0.next();
            hhem hhem0 = (hhem)object0;
            if(!hhem0.c.isEmpty() && (((hhee)hhem0.c.get(0)).b & 1) != 0) {
                hheg hheg0 = hhem0.b == null ? hheg.a : hhem0.b;
                switch((hfhu.a(hheg0.c) == 0 ? 1 : hfhu.a(hheg0.c)) - 1) {
                    case 0x4F: {
                        hheh hheh0 = ((hhee)hhem0.c.get(0)).c;
                        if(hheh0 == null) {
                            hheh0 = hheh.a;
                        }
                        if(hheh0.c == 2 && ((int)(((Integer)hheh0.d))) == 1) {
                            z = true;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((ahge)hftp0.b_message).b = z;
                        break;
                    }
                    case 80: {
                        hheh hheh1 = ((hhee)hhem0.c.get(0)).c;
                        if(hheh1 == null) {
                            hheh1 = hheh.a;
                        }
                        if(hheh1.c == 2 && ((int)(((Integer)hheh1.d))) == 1) {
                            z = true;
                        }
                        if(!hftp0.b_message.isImmutable()) {
                            hftp0.ensureMutable();
                        }
                        ((ahge)hftp0.b_message).c = z;
                    }
                }
            }
        }
        return (ahge)hftp0.N_build();
    }

    private static int f(int v, List list0) {
        for(Object object0: list0) {
            hhem hhem0 = (hhem)object0;
            hheg hheg0 = hhem0.b == null ? hheg.a : hhem0.b;
            if(v == (hfhu.a(hheg0.c) == 0 ? 1 : hfhu.a(hheg0.c))) {
                hheh hheh0 = ((hhee)hhem0.c.get(0)).c;
                if(hheh0 == null) {
                    hheh0 = hheh.a;
                }
                return hheh0.c == 2 ? ((int)(((Integer)hheh0.d))) : 0;
            }
        }
        return 0;
    }
}

