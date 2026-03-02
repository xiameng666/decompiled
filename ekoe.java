import java.util.ArrayList;

public final class ekoe implements gfsi {
    public final String a;

    public ekoe(String s) {
        this.a = s;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)eljz.a).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eljz eljz0 = (eljz)hftp0.b_message;
        this.a.getClass();
        eljz0.b |= 2;
        eljz0.d = this.a;
        long v = System.currentTimeMillis();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        eljz eljz1 = (eljz)hftp0.b_message;
        eljz1.b |= 1;
        eljz1.c = v;
        eljz eljz2 = (eljz)hftp0.N_build();
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((elkc)object0).d) {
            eljz eljz3 = (eljz)object1;
            if(!eljz3.d.equals(eljz2.d) && ekog.b(eljz3)) {
                arrayList0.add(eljz3);
            }
        }
        arrayList0.add(eljz2);
        ProtoLiteBuilder hftp1 = (ProtoLiteBuilder)((ProtoLiteMessage)(((elkc)object0))).jf(5, null);
        hftp1.X(((ProtoLiteMessage)(((elkc)object0))));
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        ((elkc)hftp1.b_message).d = hfvv.a;
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        elkc elkc0 = (elkc)hftp1.b_message;
        hfuo hfuo0 = elkc0.d;
        if(!hfuo0.c()) {
            elkc0.d = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(arrayList0, elkc0.d);
        return (elkc)hftp1.N_build();
    }
}

