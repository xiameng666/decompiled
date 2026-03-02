import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;

public final class dcgl implements Runnable {
    public final dchp a;
    public final UpdateSelectedContactsParams b;

    public dcgl(dchp dchp0, UpdateSelectedContactsParams updateSelectedContactsParams0) {
        this.a = dchp0;
        this.b = updateSelectedContactsParams0;
    }

    @Override
    public final void run() {
        azxs azxs0 = this.b.c;
        dcea dcea0 = new dcea(this.a, this.b);
        NearbySharingChimeraService.ac(this.a.a, "updateSelectedContacts", azxs0, dcea0);
    }
}

