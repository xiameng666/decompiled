import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import java.util.ArrayList;

public final class erjb {
    private static final erqc a;
    private final ArrayList b;
    private final xnz c;
    private boolean d;
    private du e;
    private boolean f;
    private final erki g;

    static {
        erjb.a = new erqc(new String[]{"Setup", "UI", "AccountTransferDelegate"});
    }

    public erjb(xnz xnz0, erki erki0, Bundle bundle0) {
        this.c = xnz0;
        this.g = erki0;
        this.f = false;
        if(bundle0 != null) {
            this.b = bundle0.getParcelableArrayList("AccountTransferDelegate.pendingIntents");
            return;
        }
        this.b = new ArrayList();
    }

    public final void a() {
        this.f = true;
    }

    public final void b() {
        this.f = false;
        if(!this.d) {
            ArrayList arrayList0 = this.b;
            if(!arrayList0.isEmpty()) {
                this.f(((PendingIntent)arrayList0.remove(0)));
            }
        }
    }

    public final void c(Bundle bundle0) {
        bundle0.putParcelableArrayList("AccountTransferDelegate.pendingIntents", this.b);
    }

    public final void d(du du0, PendingIntent pendingIntent0) {
        erjb.a.j("Delegating pendingIntent %s", new Object[]{pendingIntent0});
        if(!this.f && this.b.isEmpty() && !this.d) {
            this.e = du0;
            this.f(pendingIntent0);
            return;
        }
        this.b.add(pendingIntent0);
    }

    public final void e(int v, int v1) {
        if(v != 3) {
            throw new IllegalArgumentException("Invalid request code");
        }
        this.d = false;
        Bundle bundle0 = new Bundle();
        bundle0.putInt("pendingIntentResult", v1);
        erki erki0 = this.g;
        if(erki0 != null) {
            erki0.a.m.z(bundle0);
        }
        ArrayList arrayList0 = this.b;
        if(!arrayList0.isEmpty()) {
            this.f(((PendingIntent)arrayList0.remove(0)));
            return;
        }
        this.e = null;
    }

    private final void f(PendingIntent pendingIntent0) {
        try {
            this.d = true;
            erjb.a.j("startingIntentForResult %s", new Object[]{pendingIntent0});
            xnz xnz0 = this.e == null ? this.c : ((xnz)this.e.getContext());
            batl.s(xnz0);
            Intent intent0 = new Intent();
            gagb.a(xnz0.getIntent(), intent0);
            du du0 = this.e;
            if(du0 != null) {
                du0.startIntentSenderForResult(pendingIntent0.getIntentSender(), 3, intent0, 0, 0, 0, Bundle.EMPTY);
                return;
            }
            xnz0.startIntentSenderForResult(pendingIntent0.getIntentSender(), 3, intent0, 0, 0, 0);
        }
        catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
            erjb.a.g("PendingIntent failed to send", intentSender$SendIntentException0, new Object[0]);
            this.d = false;
        }
    }
}

