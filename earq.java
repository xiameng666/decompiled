import android.database.Cursor;

public final class earq implements bboe {
    @Override  // bboe
    public final Object a(Object object0) {
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)ftgu.a).v_newBuilder();
        String s = ((Cursor)object0).getString(0);
        gftb.check(s);
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftgu)hftp0.b_message).b = s;
        ByteString hfsf0 = ByteString.copyFrom(((Cursor)object0).getBlob(1));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftgu)hftp0.b_message).c = hfsf0;
        ByteString hfsf1 = ByteString.copyFrom(((Cursor)object0).getBlob(2));
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        ((ftgu)hftp0.b_message).d = hfsf1;
        return (ftgu)hftp0.N_build();
    }
}

