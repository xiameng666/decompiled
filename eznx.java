import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.SyncActivityControlsSettingsInternalResult;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class eznx extends eznb {
    private static final ggtl g;

    static {
        eznx.g = ezqu.c();
    }

    public eznx(bkcs bkcs0, ezsq ezsq0, baqr baqr0, fktv fktv0, Executor executor0, FacsInternalSyncCallOptions facsInternalSyncCallOptions0) {
        super("SyncActivityControlsSettingsInternalOperation", bkcs0, ezsq0, baqr0, fktv0, executor0, facsInternalSyncCallOptions0);
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        hffw hffw0;
        ggtl ggtl0 = eznx.g;
        ggtl0.h().ar(0x443F).B("Executing operation \'%s\'...", this.q());
        this.b();
        ezsp ezsp0 = this.f.a ? ezsp.c : ezsp.d;
        ggtl0.h().ar(0x4442).R("Operation \'%s\' performing sync (type: \'%s\')...", this.q(), ezsp0);
        if(hzdj.u()) {
            hffw0 = (hffw)eztg.b(((cmbm)this.d).m(ezmv.b, this.c.b).b(new eznv(this, ezsp0), 1, this.e), "SyncActivityControlsSettingsInternalOperation");
        }
        else {
            try {
                hffw0 = (hffw)eztg.c(((cmbm)this.d).m(ezmv.b, this.c.b).b(new eznw(this, ezsp0), 1, this.e));
            }
            catch(acse acse0) {
                throw new cjuh(35001, "Auth error when downloading settings!", null, acse0);
            }
            catch(iapl | iapn exception0) {
                throw new cjuh(7, "Downloading settings failed!", null, exception0);
            }
            catch(InterruptedException interruptedException0) {
                throw new cjuh(14, "Download thread interrupted!", null, interruptedException0);
            }
            catch(IOException iOException0) {
                throw new cjuh(8, "IO error! (Maybe the internal writeDeviceLevelSettings() API call failed?)", null, iOException0);
            }
        }
        bkcs bkcs0 = this.a;
        SyncActivityControlsSettingsInternalResult syncActivityControlsSettingsInternalResult0 = new SyncActivityControlsSettingsInternalResult(hffw0.toBytesArray());
        bkcs0.c(Status.b, syncActivityControlsSettingsInternalResult0);
        ggtl0.h().ar(0x4440).B("Operation \'%s\' successful!", this.q());
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.c(status0, null);
        eznx.g.j().ar(0x4441).P("Operation \'%s\' failed with status \'%d\'!", this.q(), status0.i);
    }
}

