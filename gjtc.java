import java.util.Map;

public final class gjtc extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public gjtc() {
        super(((ProtoLiteMessage)gjte.a));
    }

    public final void a(Map map0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        ((gjte)this.b_message).b().putAll(map0);
    }
}

