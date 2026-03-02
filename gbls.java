import com.google.android.wallet.bender3.framework.storage.SessionEntity;

public final class gbls implements gbln {
    public final omn a;
    public final oko b;

    public gbls(omn omn0) {
        this.a = omn0;
        this.b = new gblr(this);
    }

    @Override  // gbln
    public final SessionEntity a(String s) {
        gblo gblo0 = new gblo(s);
        return (SessionEntity)oqj.b(this.a, true, false, gblo0);
    }

    @Override  // gbln
    public final Object b(SessionEntity sessionEntity0, ibrl ibrl0) {
        gblp gblp0 = new gblp(this, sessionEntity0);
        return oqj.d(this.a, false, true, gblp0, ibrl0);
    }
}

