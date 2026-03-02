import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;

final class gj implements loz, lsq, orl {
    public lpw a;
    public ork b;
    private final du c;
    private final lsp d;
    private final Runnable e;
    private lsk f;

    public gj(du du0, lsp lsp0, Runnable runnable0) {
        this.a = null;
        this.b = null;
        this.c = du0;
        this.d = lsp0;
        this.e = runnable0;
    }

    final void a(lpe lpe0) {
        this.a.f(lpe0);
    }

    final void b() {
        if(this.a == null) {
            this.a = new lpw(this);
            ork ork0 = orj.a(this);
            this.b = ork0;
            ork0.a();
            this.e.run();
        }
    }

    @Override  // loz
    public final ltx getDefaultViewModelCreationExtras() {
        Application application0;
        du du0 = this.c;
        for(Context context0 = du0.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
            application0 = null;
            if(!(context0 instanceof ContextWrapper)) {
                break;
            }
            if((context0 instanceof Application)) {
                application0 = (Application)context0;
                break;
            }
        }
        ltx ltx0 = new lua();
        if(application0 != null) {
            ((lua)ltx0).b(lsg.b, application0);
        }
        ((lua)ltx0).b(lrm.a, du0);
        ((lua)ltx0).b(lrm.b, this);
        if(du0.getArguments() != null) {
            Bundle bundle0 = du0.getArguments();
            ((lua)ltx0).b(lrm.c, bundle0);
        }
        return ltx0;
    }

    @Override  // loz
    public final lsk getDefaultViewModelProviderFactory() {
        Application application0;
        du du0 = this.c;
        lsk lsk0 = du0.getDefaultViewModelProviderFactory();
        if(!lsk0.equals(du0.ac)) {
            this.f = lsk0;
            return lsk0;
        }
        if(this.f == null) {
            for(Context context0 = du0.requireContext().getApplicationContext(); true; context0 = ((ContextWrapper)context0).getBaseContext()) {
                application0 = null;
                if(!(context0 instanceof ContextWrapper)) {
                    break;
                }
                if((context0 instanceof Application)) {
                    application0 = (Application)context0;
                    break;
                }
            }
            this.f = new lrq(application0, du0, du0.getArguments());
        }
        return this.f;
    }

    @Override  // lps
    public final lpg getLifecycle() {
        this.b();
        return this.a;
    }

    @Override  // orl
    public final orh getSavedStateRegistry() {
        this.b();
        return this.b.a;
    }

    @Override  // lsq
    public final lsp getViewModelStore() {
        this.b();
        return this.d;
    }
}

