import java.util.List;

public final class atvz implements Runnable {
    public final atxp a;
    public final List b;

    public atvz(atxp atxp0, List list0) {
        this.a = atxp0;
        this.b = list0;
    }

    @Override
    public final void run() {
        glah glah0 = (glah)((ProtoLiteMessage)glai.a).v_newBuilder();
        if(!glah0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)glah0).ensureMutable();
        }
        glai glai0 = (glai)glah0.b_message;
        hfuo hfuo0 = glai0.Y;
        if(!hfuo0.c()) {
            glai0.Y = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.b, glai0.Y);
        glai glai1 = (glai)((ProtoLiteBuilder)glah0).N_build();
        this.a.r.a.n(glai1, gkey.bq);
    }
}

