import android.content.Context;
import java.util.List;

public final class ehcq extends ehcl {
    public static final gged_interceptors h;
    public final egzr i;

    static {
        ehcq.h = gged_interceptors.o("name", "group_type", "updated", "contact_order");
    }

    public ehcq(Context context0, baqr baqr0, egke egke0, String s, bbng bbng0, gfug gfug0, ehim ehim0, gsts gsts0, ehje ehje0, egzr egzr0) {
        super(context0, baqr0, egke0, s, bbng0, gfug0, ehim0, gsts0, ehje0);
        this.i = egzr0;
    }

    public static gstc a() {
        gstb gstb0 = (gstb)((ProtoLiteMessage)gstc.a).v_newBuilder();
        gstb0.a();
        return (gstc)((ProtoLiteBuilder)gstb0).N_build();
    }

    public static void b(List list0, int v) {
        if(list0.size() == v) {
            return;
        }
        throw new ehfb(3);
    }

    public static final boolean c(List list0) {
        for(Object object0: list0) {
            if(((egzx)object0).t) {
                return true;
            }
        }
        return false;
    }
}

