import android.view.Menu;

final class kg implements Runnable {
    final kl a;

    public kg(kl kl0) {
        this.a = kl0;
        super();
    }

    @Override
    public final void run() {
        kl kl0 = this.a;
        Menu menu0 = kl0.P();
        Menu menu1 = (menu0 instanceof na) ? menu0 : null;
        if(menu1 != null) {
            ((na)menu1).u();
        }
        try {
            menu0.clear();
            if(!kl0.a.onCreatePanelMenu(0, menu0) || !kl0.a.onPreparePanel(0, null, menu0)) {
                menu0.clear();
            }
        }
        finally {
            if(menu1 != null) {
                ((na)menu1).t();
            }
        }
    }
}

