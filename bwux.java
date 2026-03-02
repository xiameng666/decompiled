import java.util.Arrays;
import java.util.List;

public final class bwux {
    public static bwoj a() {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwoj.a).v_newBuilder();
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwoh.a).v_newBuilder();
        huar huar0 = huar.a;
        int v = (int)huar0.d().u();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwoh bwoh0 = (bwoh)hftp1.b_message;
        bwoh0.b |= 2;
        bwoh0.e = v;
        List list0 = Arrays.asList(htyz.a.b().a().split(","));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwoh bwoh1 = (bwoh)hftp1.b_message;
        hfuo hfuo0 = bwoh1.c;
        if(!hfuo0.c()) {
            bwoh1.c = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(list0, bwoh1.c);
        boolean z = huar0.d().L();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwoh bwoh2 = (bwoh)hftp1.b_message;
        bwoh2.b |= 1;
        bwoh2.d = z;
        boolean z1 = huar0.d().O();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwoh bwoh3 = (bwoh)hftp1.b_message;
        bwoh3.b |= 4;
        bwoh3.f = z1;
        boolean z2 = huar0.d().J();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ProtoLiteMessage hftv0 = hftp1.b_message;
        ((bwoh)hftv0).b |= 8;
        ((bwoh)hftv0).g = z2;
        if(!hftv0.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwoh bwoh4 = (bwoh)hftp1.b_message;
        bwoh4.b |= 16;
        bwoh4.h = true;
        boolean z3 = ((Boolean)bwvu.n.b()).booleanValue();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwoh bwoh5 = (bwoh)hftp1.b_message;
        bwoh5.b |= 0x20;
        bwoh5.i = z3;
        bwoh bwoh6 = (bwoh)hftp1.N_build();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoj bwoj0 = (bwoj)hftp0.b_message;
        bwoh6.getClass();
        bwoj0.c = bwoh6;
        bwoj0.b |= 1;
        gged_interceptors gged0 = ggna.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwoj bwoj1 = (bwoj)hftp0.b_message;
        hfuo hfuo1 = bwoj1.d;
        if(!hfuo1.c()) {
            bwoj1.d = ProtoLiteMessage.E(hfuo1);
        }
        hfrj.E(gged0, bwoj1.d);
        return (bwoj)hftp0.N_build();
    }
}

