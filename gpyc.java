import java.util.List;
import java.util.function.IntFunction;

public final class gpyc implements IntFunction {
    public final List a;
    public final List b;
    public final List c;
    public final List d;

    public gpyc(List list0, List list1, List list2, List list3) {
        this.a = list0;
        this.b = list1;
        this.c = list2;
        this.d = list3;
    }

    @Override
    public final Object apply(int v) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gvuh.a).v_newBuilder();
        double f = (double)(((Double)this.a.get(v)));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        List list0 = this.b;
        gvuh gvuh0 = (gvuh)hftp0.b_message;
        gvuh0.b |= 1;
        gvuh0.c = f;
        if(list0 != null) {
            long v1 = (long)(((Long)list0.get(v)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvuh gvuh1 = (gvuh)hftp0.b_message;
            gvuh1.b |= 4;
            gvuh1.e = v1;
        }
        List list1 = this.c;
        if(list1 != null) {
            int v2 = (int)(((Integer)list1.get(v)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvuh gvuh2 = (gvuh)hftp0.b_message;
            gvuh2.b |= 8;
            gvuh2.f = v2;
        }
        List list2 = this.d;
        if(list2 != null) {
            double f1 = (double)(((Double)list2.get(v)));
            if(!hftp0.b_message.isImmutable()) {
                hftp0.ensureMutable();
            }
            gvuh gvuh3 = (gvuh)hftp0.b_message;
            gvuh3.b |= 16;
            gvuh3.g = f1;
        }
        return (gvuh)hftp0.N_build();
    }
}

