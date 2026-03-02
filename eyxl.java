import android.os.Bundle;

public final class eyxl implements ibts {
    public final du a;
    public final Bundle b;
    public final eyxp c;

    public eyxl(du du0, Bundle bundle0, eyxp eyxp0) {
        this.a = du0;
        this.b = bundle0;
        this.c = eyxp0;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((eyxs)object0), "it");
        eyxk eyxk0 = new eyxk(this.c);
        ((eyxs)object0).d.b.a.b = this.b == null ? null : this.b.getString(foab.a);
        fnxv fnxv0 = fnxw.a();
        fnxv0.b(((eyxs)object0).a);
        fnxv0.c(((eyxs)object0).b);
        foad foad0 = foaf.a();
        foal foal0 = foan.a();
        foah foah0 = new foah(null);
        foah0.c(this.a.getString(0x7F1500EC));  // string:accounts_selector_education_header "Choose the same account as your phone 
                                                // and watch"
        foah0.b(this.a.getString(0x7F1500ED));  // string:accounts_selector_education_text "If you don\'t see your account, you can 
                                                // use a different account or switch to another profile where your account is signed 
                                                // in"
        foal0.b(foah0.a());
        foad0.a = foal0.a();
        foad0.b(new eyxr(eyxk0));
        fnxv0.a = foad0.a();
        fnxw fnxw0 = fnxv0.a();
        ((eyxs)object0).e = fnyf.a(this.a, fnxw0);
        return ibom.a;
    }
}

