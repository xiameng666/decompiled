import android.widget.Toast;

public final class bdak {
    public static final bboh a;
    public final bfnb b;
    public final beln c;
    public final du d;
    public final betj e;
    public final bglz f;

    static {
        bdak.a = bboh.b("AffiliatedGroupCntrllr", bbcu.cX);
    }

    public bdak(beug beug0, bfom bfom0, beln beln0, du du0, bglz bglz0) {
        this.c = beln0;
        this.d = du0;
        this.e = (betj)new lso(((xob)du0.getContext())).a(betj.class);
        this.b = bfom0.a("edit", new bdai(beug0));
        this.f = bglz0;
        lps lps0 = du0.getViewLifecycleOwner();
        bdaj bdaj0 = new bdaj(beug0);
        beln0.c.g(lps0, bdaj0);
    }

    public final void a() {
        if(!bglz.c()) {
            Toast.makeText(this.d.getContext(), this.d.getResources().getText(0x7F152684), 0).show();  // string:pwm_copied_to_clipboard_message "Copied to Clipboard"
        }
    }
}

