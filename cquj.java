import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;

public final class cquj {
    public final ScheduledExecutorService a;
    private final gful_cronetEngineProvider b;
    private final gful_cronetEngineProvider c;
    private ceax d;
    private chgh e;
    private final String f;

    public cquj() {
        gful_cronetEngineProvider gful0 = gfus.a(((gful_cronetEngineProvider)new cque()));
        this.b = gful0;
        this.c = gfus.a(((gful_cronetEngineProvider)new cquf()));
        this.a = new bbll(1, 10);
        this.f = UUID.randomUUID().toString();
        if(((Boolean)gful0.mr()).booleanValue()) {
            this.e = chgh.v();
            return;
        }
        this.d = ceax.v();
    }

    public final glai a() {
        glah glah0 = (glah)((ProtoLiteMessage)glai.a).v_newBuilder();
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        String s = this.f;
        glai glai0 = (glai)glah0.b_message;
        s.getClass();
        glai0.b |= 0x4000;
        glai0.n = s;
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        glai glai1 = (glai)glah0.b_message;
        s.getClass();
        glai1.b |= 0x8000;
        glai1.o = s;
        long v = Math.round(1.0 / ((double)(((Double)this.c.mr()))));
        if(v > 0L) {
            if(!glah0.b_message.isImmutable()) {
                ((ProtoLiteBuilder)glah0).ensureMutable();
            }
            glai glai2 = (glai)glah0.b_message;
            glai2.b |= 0x10000;
            glai2.p = (int)v;
        }
        return (glai)((ProtoLiteBuilder)glah0).N_build();
    }

    final void b(glai glai0, gkey gkey0) {
        chgh chgh0 = this.e;
        if(chgh0 != null) {
            cczb cczb0 = chgh0.c(((ProtoLiteMessage)glai0));
            cczb0.c = (int)gkey0.bO;
            cczb0.a();
            return;
        }
        ceax ceax0 = this.d;
        if(ceax0 != null) {
            cczb cczb1 = ceax0.c(((ProtoLiteMessage)glai0));
            cczb1.c = (int)gkey0.bO;
            cczb1.a();
        }
    }
}

