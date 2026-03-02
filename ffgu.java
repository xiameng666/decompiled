import com.google.android.gms.wearable.internal.BooleanResponse;
import com.google.android.gms.wearable.internal.FetchBackupRequest;
import j..util.Map.-EL;

public final class ffgu implements fflt {
    public final fflv a;
    public final fdiy b;
    public final FetchBackupRequest c;

    public ffgu(fflv fflv0, fdiy fdiy0, FetchBackupRequest fetchBackupRequest0) {
        this.a = fflv0;
        this.b = fdiy0;
        this.c = fetchBackupRequest0;
    }

    @Override  // fflt
    public final void a() {
        evql evql0;
        fdiy fdiy0 = this.b;
        if(!hzyp.c()) {
            fdiy0.f(new BooleanResponse(0xFAE, false));
            return;
        }
        FetchBackupRequest fetchBackupRequest0 = this.c;
        fcmj fcmj0 = this.a.E;
        batl.s(fcmj0);
        if(hzyp.c()) {
            fcmj.a.d("Requesting hasAvailableBackups", new Object[0]);
            fcme fcme0 = new fcme(fcmj0, fetchBackupRequest0.a, fetchBackupRequest0.b);
            fcmf fcmf0 = new fcmf();
            evql0 = ((evql)Map.-EL.computeIfAbsent(fcmj0.h, fcmj.a(fetchBackupRequest0.a, fetchBackupRequest0.b), fcme0)).h(gmap.a, fcmf0);
        }
        else {
            fcmj.a.d("allowCompanionFetchBackupEarly is disable", new Object[0]);
            evql0 = evrg.c(new UnsupportedOperationException());
        }
        evql0.b(new ffhf(fdiy0));
        evql0.A(new ffhg(fdiy0));
    }
}

