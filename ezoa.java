import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.FacsInternalSyncCallOptions;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsInternalResult;
import java.io.IOException;
import java.util.concurrent.Executor;

public final class ezoa extends eznb {
    public final hfgu g;
    private static final ggtl h;

    static {
        ezoa.h = ezqu.c();
    }

    public ezoa(bkcs bkcs0, ezsq ezsq0, baqr baqr0, fktv fktv0, Executor executor0, FacsInternalSyncCallOptions facsInternalSyncCallOptions0, hfgu hfgu0) {
        super("UpdateActivityControlsSettingsInternalOperation", bkcs0, ezsq0, baqr0, fktv0, executor0, facsInternalSyncCallOptions0);
        this.g = hfgu0;
    }

    @Override  // cjtm
    protected final void f(Context context0) {
        hfgv hfgv0;
        ggtl ggtl0 = ezoa.h;
        ggtl0.h().ar(0x4443).B("Executing operation \'%s\'...", this.q());
        this.b();
        ggtl0.h().ar(0x4446).B("Operation \'%s\' performing upload...", this.q());
        if(hzdj.u()) {
            hfgv0 = (hfgv)eztg.b(((cmbm)this.d).m(ezmv.b, this.c.b).b(new ezny(this), 1, this.e), "UpdateActivityControlsSettingsInternalOperation");
        }
        else {
            try {
                hfgv0 = (hfgv)eztg.c(((cmbm)this.d).m(ezmv.b, this.c.b).b(new eznz(this), 1, this.e));
            }
            catch(acse acse0) {
                throw new cjuh(35001, "Auth error when uploading settings!", null, acse0);
            }
            catch(iapl | iapn exception0) {
                throw new cjuh(7, "Uploading settings failed!", null, exception0);
            }
            catch(InterruptedException interruptedException0) {
                throw new cjuh(14, "Upload thread interrupted!", null, interruptedException0);
            }
            catch(IOException iOException0) {
                throw new cjuh(8, "IO error! (Maybe the internal writeDeviceLevelSettings() API call failed?)", null, iOException0);
            }
        }
        bkcs bkcs0 = this.a;
        UpdateActivityControlsSettingsInternalResult updateActivityControlsSettingsInternalResult0 = new UpdateActivityControlsSettingsInternalResult(hfgv0.toBytesArray());
        bkcs0.a(Status.b, updateActivityControlsSettingsInternalResult0);
        ggtl0.h().ar(0x4444).B("Operation \'%s\' successful!", this.q());
    }

    @Override  // cjtm
    public final void j(Status status0) {
        this.a.a(status0, null);
        ezoa.h.j().ar(0x4445).P("Operation \'%s\' failed with status \'%d\'!", this.q(), status0.i);
    }
}

