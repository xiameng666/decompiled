import android.os.health.HealthStats;
import java.util.Collections;
import java.util.Map;

final class fosg extends fosi {
    public static final fosg a;

    static {
        fosg.a = new fosg();
    }

    @Override  // fosi
    public final MessageLite a(String s, Object object0) {
        iczh iczh0 = (iczh)((ProtoLiteMessage)iczi.a).v_newBuilder();
        Map map0 = fosl.c(((HealthStats)object0), 40001);
        iczh0.a(fosj.a.d(map0));
        Map map1 = ((HealthStats)object0) == null || !((HealthStats)object0).hasMeasurements(40002) ? Collections.EMPTY_MAP : ((HealthStats)object0).getMeasurements(40002);
        iczh0.k(fosf.a.d(map1));
        if(s != null) {
            iczg iczg0 = fosl.d(s);
            if(!iczh0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczh0).ensureMutable();
            }
            iczi iczi0 = (iczi)iczh0.b_message;
            iczg0.getClass();
            iczi0.e = iczg0;
            iczi0.b |= 1;
        }
        MessageLite hfvm0 = (iczi)((ProtoLiteBuilder)iczh0).N_build();
        return fosl.i(((iczi)hfvm0)) ? null : hfvm0;
    }

    @Override  // fosi
    public final MessageLite b(MessageLite hfvm0, MessageLite hfvm1) {
        if(((iczi)hfvm0) != null && ((iczi)hfvm1) != null) {
            iczh iczh0 = (iczh)((ProtoLiteMessage)iczi.a).v_newBuilder();
            iczh0.a(fosj.a.e(((iczi)hfvm0).c, ((iczi)hfvm1).c));
            iczh0.k(fosf.a.e(((iczi)hfvm0).d, ((iczi)hfvm1).d));
            iczg iczg0 = ((iczi)hfvm0).e;
            if(iczg0 == null) {
                iczg0 = iczg.a;
            }
            if(!iczh0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)iczh0).ensureMutable();
            }
            iczi iczi0 = (iczi)iczh0.b_message;
            iczg0.getClass();
            iczi0.e = iczg0;
            iczi0.b |= 1;
            MessageLite hfvm2 = (iczi)((ProtoLiteBuilder)iczh0).N_build();
            return fosl.i(((iczi)hfvm2)) ? null : hfvm2;
        }
        return (iczi)hfvm0;
    }

    @Override  // fosi
    public final String c(MessageLite hfvm0) {
        iczg iczg0 = ((iczi)hfvm0).e;
        if(iczg0 == null) {
            iczg0 = iczg.a;
        }
        return iczg0.d;
    }
}

