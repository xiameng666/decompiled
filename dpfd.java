public final class dpfd extends ProtoLiteBuilder implements MessageLiteOrBuilder {
    public dpfd() {
        super(((ProtoLiteMessage)dpfe.b));
    }

    public final void a(Iterable iterable0) {
        if(!this.b_message.isImmutable()) {
            ((ProtoLiteBuilder)this).ensureMutable();
        }
        dpfe dpfe0 = (dpfe)this.b_message;
        hfuf hfuf0 = dpfe0.m;
        if(!hfuf0.c()) {
            dpfe0.m = ProtoLiteMessage.C(hfuf0);
        }
        for(Object object0: iterable0) {
            dpfe0.m.i(((hksv)object0).a());
        }
    }
}

