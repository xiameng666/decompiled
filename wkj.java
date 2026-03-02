import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class wkj implements BiConsumer {
    @Override
    public final void accept(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        gvtf gvtf0 = (gvtf)((ProtoLiteBuilder)object1).b_message;
        ((gwcl)object0).getClass();
        gvtf0.c = (gwcl)object0;
        gvtf0.b = 50;
    }

    public final BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

