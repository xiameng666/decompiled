import com.google.android.wallet.bender3.framework.storage.SessionEntity;
import j..util.Objects;

final class gblr extends oko {
    public gblr(gbls gbls0) {
        Objects.requireNonNull(gbls0);
        super();
    }

    @Override  // oko
    public final String a() {
        return "INSERT OR REPLACE INTO `sessionTable` (`sessionId`,`clientSessionId`,`accountName`,`environment`,`lastAccessTime`,`expirationTime`) VALUES (?,?,?,?,?,?)";
    }

    @Override  // oko
    public final void b(owg owg0, Object object0) {
        owg0.h(1, ((SessionEntity)object0).a);
        String s = ((SessionEntity)object0).b;
        if(s == null) {
            owg0.g(2);
        }
        else {
            owg0.h(2, s);
        }
        String s1 = ((SessionEntity)object0).c;
        if(s1 == null) {
            owg0.g(3);
        }
        else {
            owg0.h(3, s1);
        }
        Integer integer0 = ((SessionEntity)object0).d;
        if(integer0 == null) {
            owg0.g(4);
        }
        else {
            owg0.f(4, ((long)(((int)integer0))));
        }
        owg0.f(5, ((SessionEntity)object0).e);
        owg0.f(6, ((SessionEntity)object0).f);
    }
}

