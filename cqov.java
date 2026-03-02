import j..util.function.Consumer.-CC;
import java.util.function.Consumer;

public final class cqov implements Consumer {
    public final cqoy a;
    public final cqpb b;

    public cqov(cqoy cqoy0, cqpb cqpb0) {
        this.a = cqoy0;
        this.b = cqpb0;
    }

    @Override
    public final void accept(Object object0) {
        int v = ((hgzc)object0).b;
        cqoy cqoy0 = this.a;
        cqpb cqpb0 = this.b;
        if(v == 1) {
            switch(((int)(((Integer)((hgzc)object0).c)))) {
                case 5002: 
                case 5003: 
                case 5006: 
                case 5007: 
                case 5008: {
                    goto label_10;
                }
            }
        }
        else if(v == 2) {
            switch(((int)(((Integer)((hgzc)object0).c)))) {
                case 3: 
                case 4: 
                case 5: {
                    break;
                }
                default: {
                    goto label_17;
                }
            }
        label_10:
            cqpi cqpi0 = cqoy0.a;
            if(!cqpi0.ai.booleanValue()) {
                cqpi0.U(cqpb0, false);
                return;
            }
            cqpb0.d().ifPresent(new cqox(cqoy0, cqpb0));
            return;
        }
        else {
            ((ggtj)cqpi.d.i()).x("ConstellationErrorDetails does not have an error code");
        }
    label_17:
        cqoy0.a.ai = Boolean.valueOf(false);
        cqoy0.a.U(cqpb0, false);
        cqpi.P(cqjh.a(cqoy0.a.requireContext()).a.b(new cqjf(), gmap.a), "Failed to evict cached verified phone numbers");
    }

    public final Consumer andThen(Consumer consumer0) {
        return Consumer.-CC.$default$andThen(this, consumer0);
    }
}

