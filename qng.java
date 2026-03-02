import java.util.List;

public final class qng extends qmx {
    public qng(List list0) {
        super(list0);
    }

    @Override  // qmq
    public final Object f(qtz qtz0, float f) {
        qub qub0 = this.d;
        if(qub0 != null) {
            float f1 = qtz0.h == null ? 3.402823E+38f : ((float)qtz0.h);
            qpn qpn0 = (qpn)qtz0.b;
            return qtz0.c == null ? ((qpn)qub0.b(qtz0.g, f1, qpn0, qpn0, f, this.b(), this.c)) : ((qpn)qub0.b(qtz0.g, f1, qpn0, ((qpn)qtz0.c), f, this.b(), this.c));
        }
        if(f == 1.0f) {
            return qtz0.c == null ? ((qpn)qtz0.b) : ((qpn)qtz0.c);
        }
        return (qpn)qtz0.b;
    }
}

