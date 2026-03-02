import java.util.List;

public final class cfbl implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbz btbz0 = (btbz)((ProtoLiteBuilder)object0).b_message;
        hfui hfui0 = btbz0.g;
        if(!hfui0.c()) {
            btbz0.g = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(((List)object1), btbz0.g);
    }
}

