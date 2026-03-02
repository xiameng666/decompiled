import j..util.Collection.-EL;
import j..util.Map.-EL;
import j..util.stream.Collectors;
import java.util.List;
import java.util.Map;

public final class botu implements gfsi {
    public final boul a;
    public final gsyz b;

    public botu(boul boul0, gsyz gsyz0) {
        this.a = boul0;
        this.b = gsyz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        fqxj fqxj0 = ((fqzl)object0).m;
        if(fqxj0 == null) {
            fqxj0 = fqxj.a;
        }
        Map map0 = (Map)Collection.-EL.stream(fqxj0.c).collect(Collectors.partitioningBy(new botf(this.b)));
        List list0 = (List)Map.-EL.getOrDefault(map0, Boolean.valueOf(true), ggna.a);
        List list1 = (List)Map.-EL.getOrDefault(map0, Boolean.valueOf(false), ggna.a);
        if(list0.isEmpty()) {
            return (fqzl)object0;
        }
        fqyg fqyg0 = this.a.a(((fqzl)object0), gfqx.a);
        fqxj fqxj1 = ((fqzl)object0).m;
        if(fqxj1 == null) {
            fqxj1 = fqxj.a;
        }
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)fqxj1).jf(5, null);
        hftp0.X(((ProtoLiteMessage)fqxj1));
        if(!((fqxi)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((fqxi)hftp0))).ensureMutable();
        }
        ((fqxj)((fqxi)hftp0).b_message).c = hfvv.a;
        ((fqxi)hftp0).a(list1);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl0 = (fqzl)fqyg0.b_message;
        fqxj fqxj2 = (fqxj)((ProtoLiteBuilder)(((fqxi)hftp0))).N_build();
        fqxj2.getClass();
        fqzl0.m = fqxj2;
        fqzl0.b |= 0x80;
        fqxj fqxj3 = fqxj.a;
        fqxi fqxi0 = (fqxi)((ProtoLiteMessage)fqxj3).v_newBuilder();
        fqxj fqxj4 = ((fqzl)object0).m;
        if(fqxj4 != null) {
            fqxj3 = fqxj4;
        }
        String s = fqxj3.d;
        if(!fqxi0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqxi0).ensureMutable();
        }
        fqxj fqxj5 = (fqxj)fqxi0.b_message;
        s.getClass();
        fqxj5.b |= 1;
        fqxj5.d = s;
        fqxi0.a(list0);
        if(!fqyg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)fqyg0).ensureMutable();
        }
        fqzl fqzl1 = (fqzl)fqyg0.b_message;
        fqxj fqxj6 = (fqxj)((ProtoLiteBuilder)fqxi0).N_build();
        fqxj6.getClass();
        fqzl1.b();
        fqzl1.n.add(fqxj6);
        return (fqzl)((ProtoLiteBuilder)fqyg0).N_build();
    }
}

