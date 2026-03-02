import com.google.android.libraries.messaging.lighter.model.ContactId;

public final class flsh implements kar {
    public final ProtoLiteBuilder a;

    public flsh(ProtoLiteBuilder hftp0) {
        this.a = hftp0;
    }

    @Override  // kar
    public final void accept(Object object0) {
        gmdo gmdo0 = flsl.c(((ContactId)object0));
        ProtoLiteBuilder hftp0 = this.a;
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        gmdi gmdi0 = (gmdi)hftp0.b_message;
        gmdo0.getClass();
        gmdi0.d = gmdo0;
        gmdi0.b |= 1;
    }
}

