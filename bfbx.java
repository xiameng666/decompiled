import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.EditText;

public final class bfbx {
    public final EditText a;
    public final xob b;
    public final lqi c;
    public final Toolbar d;
    public MenuItem e;

    public bfbx(Toolbar toolbar0, xob xob0) {
        lqi lqi0 = new lqi();
        this.c = lqi0;
        this.d = toolbar0;
        this.b = xob0;
        EditText editText0 = (EditText)toolbar0.findViewById(0x7F0B1F57);  // id:search_edit_text
        this.a = editText0;
        lqi0.l(editText0.getText().toString());
    }

    public final void a() {
        if(this.e != null) {
            if(this.a.getText().toString().isEmpty()) {
                this.e.setVisible(false);
                return;
            }
            this.e.setVisible(true);
        }
    }
}

