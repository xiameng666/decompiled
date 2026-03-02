import com.google.android.gms.personalsafety.spotbackend.FinderIdentificationIntentOperation;

public final class eihr implements gfsi {
    public final FinderIdentificationIntentOperation a;

    public eihr(FinderIdentificationIntentOperation finderIdentificationIntentOperation0) {
        this.a = finderIdentificationIntentOperation0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        FinderIdentificationIntentOperation finderIdentificationIntentOperation0 = this.a;
        if(!(((Throwable)object0) instanceof fqmm) && !(((Throwable)object0) instanceof fqmn) && !(((Throwable)object0) instanceof fqmq)) {
            if((((Throwable)object0) instanceof fqmt)) {
                finderIdentificationIntentOperation0.b();
                return ByteString.b;
            }
            a.ae(eicd.a.i(), "Unexpected error reading device identifier.", ((Throwable)object0));
            finderIdentificationIntentOperation0.b();
            return ByteString.b;
        }
        finderIdentificationIntentOperation0.a(-1);
        return ByteString.b;
    }
}

