import com.google.android.gms.chromesync.zeroparty.ChromeSyncState;

public final class bggd implements evqk {
    public final bggq a;

    public bggd(bggq bggq0) {
        this.a = bggq0;
    }

    @Override  // evqk
    public final evql a(Object object0) {
        bggq bggq0 = this.a;
        if(!bggq0.b.contains(Integer.valueOf(((ChromeSyncState)object0).b))) {
            evql evql0 = bggq0.a();
            return evql0.g(new bggm(bggq0, evql0)).g(new bggn(evql0)).g(new bggo());
        }
        return evrg.d(bdij.g);
    }
}

