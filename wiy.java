import j..util.function.BiConsumer.-CC;
import java.util.function.BiConsumer;

public final class wiy implements BiConsumer {
    @Override
    public final void accept(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object1).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        cnrh cnrh0 = (cnrh)((ProtoLiteBuilder)object1).b_message;
        ((gwel)object0).getClass();
        cnrh0.c = (gwel)object0;
        cnrh0.b = 1;
    }

    public final BiConsumer andThen(BiConsumer biConsumer0) {
        return BiConsumer.-CC.$default$andThen(this, biConsumer0);
    }
}

