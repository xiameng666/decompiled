import j..util.DesugarCollections;
import java.util.List;

public final class atmj implements gfsi {
    public final atmk a;

    public atmj(atmk atmk0) {
        this.a = atmk0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        atmk atmk0 = this.a;
        if(((aqdu)object0).d) {
            atmk0.b.j("The data store has been migrated from room successfully.", new Object[0]);
            return (aqdu)object0;
        }
        atmb atmb0 = atmk0.c;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gifi.a).v_newBuilder();
        gifh gifh0 = gifh.b;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((gifi)hftp0.b_message).d = gifh0.s;
        ((gifi)hftp0.b_message).b |= 2;
        gifi gifi0 = (gifi)hftp0.N_build();
        aqqk aqqk0 = atmb0.a;
        ProtoLiteBuilder hftp1 = aqra.b();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ghys ghys0 = (ghys)hftp1.b_message;
        gifi0.getClass();
        ghys0.ax = gifi0;
        ghys0.d |= 0x8000000;
        aqqk0.a(((ghys)hftp1.N_build()), ghyr.aM);
        baun baun0 = atmk0.d.a;
        baun0.j("Convert PostD2dAppTransferInfo to AllPackagesPostD2dRecords...", new Object[0]);
        atlq atlq0 = new atlq();
        List list0 = (List)oqj.b(((atly)atmk0.d.b).a, true, false, atlq0);
        baun0.j("Pre-convert all PostD2dAppTransferInfos: %s", new Object[]{list0});
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)aqdu.a).v_newBuilder();
        for(Object object1: list0) {
            String s = ((atlo)object1).a;
            ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)aqhy.a).v_newBuilder();
            long v = (long)((atlo)object1).b;
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            ProtoLiteMessage hftv0 = hftp3.b_message;
            ((aqhy)hftv0).b |= 2;
            ((aqhy)hftv0).d = v;
            switch(((atlo)object1).c) {
                case 1: 
                case 2: {
                    if(!hftv0.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    aqhy aqhy1 = (aqhy)hftp3.b_message;
                    aqhy1.b |= 1;
                    aqhy1.c = true;
                    break;
                }
                default: {
                    if(!hftv0.isImmutable()) {
                        hftp3.ensureMutable();
                    }
                    aqhy aqhy0 = (aqhy)hftp3.b_message;
                    aqhy0.b |= 1;
                    aqhy0.c = false;
                }
            }
            if(!hftp3.b_message.isImmutable()) {
                hftp3.ensureMutable();
            }
            aqhy aqhy2 = (aqhy)hftp3.b_message;
            aqhy2.b |= 4;
            aqhy2.e = true;
            hftp2.cJ(s, ((aqhy)hftp3.N_build()));
        }
        aqdu aqdu0 = (aqdu)hftp2.N_build();
        baun0.j("Post-convert AllPackagesPostD2dRecords: %s", new Object[]{DesugarCollections.unmodifiableMap(aqdu0.c)});
        ProtoLiteBuilder hftp4 = (ProtoLiteBuilder)((ProtoLiteMessage)aqdu0).jf(5, null);
        hftp4.X(((ProtoLiteMessage)aqdu0));
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        aqdu aqdu1 = (aqdu)hftp4.b_message;
        aqdu1.b |= 1;
        aqdu1.d = true;
        return (aqdu)hftp4.N_build();
    }
}

