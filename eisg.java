import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.util.Map;

public final class eisg extends eiqt {
    private final String a;
    private final String b;
    private final eiqa c;

    public eisg(String s, String s1, eiqa eiqa0) {
        super("RegisterFlagUpdateListenerGmsOperation", hlse.C);
        this.a = s;
        this.b = s1;
        this.c = eiqa0;
    }

    @Override  // eiqt
    public final hlrh b() {
        hlrg hlrg0 = (hlrg)((ProtoLiteMessage)hlrh.a).v_newBuilder();
        String s = this.a;
        if(s != null) {
            if(!hlrg0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)hlrg0).ensureMutable();
            }
            hlrh hlrh0 = (hlrh)hlrg0.b_message;
            hlrh0.b |= 4;
            hlrh0.e = s;
        }
        return (hlrh)((ProtoLiteBuilder)hlrg0).N_build();
    }

    @Override  // eiqt
    public final void i(Context context0, eiox eiox0) {
        eiqa eiqa0 = this.c;
        if(eiqa0 == null) {
            throw new eioz(29500, null);
        }
        String s = this.a;
        String s1 = this.b;
        eiot eiot0 = eiot.a();
        synchronized(eiot.a) {
            if(s1 == null) {
                s1 = "__PH_INTERNAL__NO_PROCESS__";
            }
            Map map0 = eiot0.b;
            if(map0.get(s) == null) {
                bxd bxd0 = new bxd();
                bxd0.put(s1, eiqa0);
                map0.put(s, bxd0);
            }
            else {
                ((Map)map0.get(s)).put(s1, eiqa0);
            }
        }
    }

    @Override  // cjtm
    public final void j(Status status0) {
    }
}

