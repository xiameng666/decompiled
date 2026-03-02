import android.net.Uri;
import j..util.Objects;

final class dfua extends clid {
    final dfud a;

    public dfua(dfud dfud0) {
        Objects.requireNonNull(dfud0);
        this.a = dfud0;
        super("nearby", "ContactsContentObserver", dfud0.g);
    }

    @Override  // clid
    public final void a(boolean z, Uri uri0) {
        cunf cunf0 = dcvz.a;
        cunf0.b().h("The contact book (uri: %s) has been modified.", uri0);
        dfud dfud0 = this.a;
        if(!dfud0.h.getAndSet(true)) {
            dftz dftz0 = new dftz(this);
            long v = hvqs.a.aT().I();
            dfud0.g.postDelayed(dftz0, v);
            cunf0.b().p("Batching the contact book change. We will sync shortly.", new Object[0]);
            return;
        }
        cunf0.b().p("Ignoring the contact book change, as we\'re already batching the request.", new Object[0]);
    }
}

