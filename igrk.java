import java.util.Map;

public final class igrk extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public igrk() {
        super(((ProtoLiteMessage)igrm.a));
    }

    public final void a(Map map0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ((igrm)this.b_message).b().putAll(map0);
    }

    public final void k(String s, igrj igrj0) {
        s.getClass();
        igrj0.getClass();
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ((igrm)this.b_message).b().put(s, igrj0);
    }
}

