import android.companion.AssociationInfo;
import android.companion.AssociationRequest;
import android.companion.CompanionDeviceManager.Callback;
import android.content.IntentSender.SendIntentException;
import android.content.IntentSender;
import com.google.android.gms.auth.proximity.phonehub.CdmAssociationChimeraActivity;
import j..util.Objects;

public final class almw extends CompanionDeviceManager.Callback {
    final AssociationRequest a;
    final CdmAssociationChimeraActivity b;

    public almw(CdmAssociationChimeraActivity cdmAssociationChimeraActivity0, AssociationRequest associationRequest0) {
        this.a = associationRequest0;
        Objects.requireNonNull(cdmAssociationChimeraActivity0);
        this.b = cdmAssociationChimeraActivity0;
        super();
    }

    @Override  // android.companion.CompanionDeviceManager$Callback
    public final void onAssociationCreated(AssociationInfo associationInfo0) {
        CdmAssociationChimeraActivity.j.h("Successfully associated %s", new Object[]{associationInfo0});
        this.b.k.remove(this.a);
        String s = Integer.toString(associationInfo0.getId());
        this.b.b(altq.b, s);
        this.b.setResult(1);
        this.b.finish();
    }

    @Override  // android.companion.CompanionDeviceManager$Callback
    public final void onAssociationPending(IntentSender intentSender0) {
        CdmAssociationChimeraActivity.j.h("Association pending", new Object[0]);
        try {
            this.b.getContainerActivity().startIntentSenderForResult(intentSender0, 1, null, 0, 0, 0, null);
        }
        catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
            CdmAssociationChimeraActivity.j.g("Failed to send association pending intent.", intentSender$SendIntentException0, new Object[0]);
        }
    }

    @Override  // android.companion.CompanionDeviceManager$Callback
    public final void onFailure(CharSequence charSequence0) {
        CdmAssociationChimeraActivity.j.h("Failed to associate with CDM: %s", new Object[]{charSequence0});
        this.b.k.remove(this.a);
        this.b.b((charSequence0 == null || !"canceled".contentEquals(charSequence0) ? altq.c : altq.e), null);
        this.b.setResult(-9);
        this.b.finish();
    }
}

