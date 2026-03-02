import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class wkd implements BiConsumer {
    @Override
    public final void accept(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        gvtg gvtg0 = (gvtg)((ProtoLiteBuilder)object1).b_message;
        ((gwee)object0).getClass();
        gvtg0.c = (gwee)object0;
        gvtg0.b = 23;
    }

    public final BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

