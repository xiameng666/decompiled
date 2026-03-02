public final class cesb implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        giob giob0 = (giob)((ProtoLiteBuilder)object0).b_message;
        ((gioa)object1).getClass();
        hfuo hfuo0 = giob0.b;
        if(!hfuo0.c()) {
            giob0.b = ProtoLiteMessage.E(hfuo0);
        }
        giob0.b.add(((gioa)object1));
    }
}

