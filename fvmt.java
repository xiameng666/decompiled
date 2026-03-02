import android.location.GnssAutomaticGainControl;
import j..util.function.Function.-CC;
import java.util.function.Function;

public final class fvmt implements Function {
    @Override
    public final Function andThen(Function function0) {
        return Function.-CC.$default$andThen(this, function0);
    }

    @Override
    public final Object apply(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)gwrs.a).v_newBuilder();
        int v = ((GnssAutomaticGainControl)object0).getConstellationType();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwrs gwrs0 = (gwrs)hftp0.b_message;
        gwrs0.b |= 1;
        gwrs0.c = v;
        float f = (float)((GnssAutomaticGainControl)object0).getCarrierFrequencyHz();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwrs gwrs1 = (gwrs)hftp0.b_message;
        gwrs1.b |= 2;
        gwrs1.d = f;
        double f1 = ((GnssAutomaticGainControl)object0).getLevelDb();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gwrs gwrs2 = (gwrs)hftp0.b_message;
        gwrs2.b |= 4;
        gwrs2.e = f1;
        return (gwrs)hftp0.N_build();
    }

    public final Function compose(Function function0) {
        return Function.-CC.$default$compose(this, function0);
    }
}

