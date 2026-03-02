import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

public abstract class ehrf extends xni {
    private String j;

    protected abstract ehrh a();

    static String g(Intent intent0) {
        return intent0 == null ? null : intent0.getStringExtra("android.intent.extra.PERMISSION_GROUP_NAME");
    }

    protected abstract void l(Intent arg1);

    private final void m(ehrh ehrh0, bboh bboh0, Intent intent0) {
        if(intent0 == null) {
            ((ggtj)this.a().a.j()).x("activity called with no intent");
        }
        else {
            if(!intent0.hasExtra("android.intent.extra.PERMISSION_GROUP_NAME")) {
                ((ggtj)this.a().a.j()).x("activity does not contain permission group");
            }
            this.l(intent0);
        }
        String s = (String)ehrh0.c.a(intent0);
        this.j = s;
        if(bbqr.d(s)) {
            ((ggtj)bboh0.i()).x("no url found; finishing activity");
            this.finish();
            return;
        }
        String s1 = this.j;
        InProductHelp inProductHelp0 = new InProductHelp(new GoogleHelp(ehrh0.b), null, null, 0, null, 0, null);
        inProductHelp0.c = s1;
        new bthl(this).b(inProductHelp0);
    }

    @Override  // xoi
    protected final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        this.finish();
    }

    @Override  // xoi
    public void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        ehrh ehrh0 = this.a();
        Intent intent0 = this.getIntent();
        this.m(ehrh0, ehrh0.a, intent0);
    }

    @Override  // xnb
    protected final void onNewIntent(Intent intent0) {
        super.onNewIntent(intent0);
        this.setIntent(intent0);
        ehrh ehrh0 = this.a();
        this.m(ehrh0, ehrh0.a, intent0);
    }
}

