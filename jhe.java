import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@ibni
public final class jhe implements InputConnection {
    public jhk a;
    public int b;
    public boolean c;
    public boolean d;
    private final boolean e;
    private int f;
    private final List g;
    private final jhq h;

    public jhe(jhk jhk0, jhq jhq0, boolean z) {
        this.h = jhq0;
        this.e = z;
        this.a = jhk0;
        this.g = new ArrayList();
        this.d = true;
    }

    private final void a(jga jga0) {
        this.d();
        try {
            this.g.add(jga0);
        }
        finally {
            this.c();
        }
    }

    private final void b(int v) {
        this.sendKeyEvent(new KeyEvent(0, v));
        this.sendKeyEvent(new KeyEvent(1, v));
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if(this.d) {
            this.d();
            return true;
        }
        return false;
    }

    private final boolean c() {
        int v = this.f - 1;
        this.f = v;
        if(v == 0) {
            List list0 = this.g;
            if(!list0.isEmpty()) {
                List list1 = ibpo.at(list0);
                this.h.a.c.a(list1);
                list0.clear();
            }
        }
        return this.f > 0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int v) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.g.clear();
        this.f = 0;
        this.d = false;
        List list0 = this.h.a.g;
        int v1 = list0.size();
        for(int v = 0; v < v1; ++v) {
            if(ibuq.m(((WeakReference)list0.get(v)).get(), this)) {
                list0.remove(v);
                return;
            }
        }
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo0) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo0) {
        return this.d ? this.e : false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence0, int v) {
        boolean z = this.d;
        if(z) {
            this.a(new jfs(String.valueOf(charSequence0), v));
        }
        return z;
    }

    private final void d() {
        ++this.f;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int v, int v1) {
        if(this.d) {
            this.a(new jfy(v, v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        if(this.d) {
            this.a(new jfz(v, v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return this.c();
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if(this.d) {
            this.a(new jgg());
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int v) {
        return TextUtils.getCapsMode(this.a.a(), jbk.d(this.a.c), v);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest0, int v) {
        boolean z = true;
        int v1 = 0;
        if(1 != (v & 1)) {
            z = false;
        }
        this.c = z;
        if((v & 1) != 0) {
            if(extractedTextRequest0 != null) {
                v1 = extractedTextRequest0.token;
            }
            this.b = v1;
        }
        return jgp.a(this.a);
    }

    @Override  // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int v) {
        return jbk.j(this.a.c) ? null : jhl.a(this.a).b;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int v, int v1) {
        return jhl.b(this.a, v).b;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int v, int v1) {
        return jhl.c(this.a, v).b;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int v) {
        if(this.d) {
            switch(v) {
                case 0x102001F: {
                    this.a(new jhh(0, this.a.a().length()));
                    return false;
                }
                case 0x1020020: {
                    this.b(277);
                    return false;
                }
                case 0x1020021: {
                    this.b(278);
                    return false;
                }
                case 0x1020022: {
                    this.b(279);
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int v) {
        int v1;
        if(this.d) {
            if(v == 0) {
                v1 = 1;
            }
            else {
                switch(v) {
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    case 3: {
                        v1 = 3;
                        break;
                    }
                    case 4: {
                        v1 = 4;
                        break;
                    }
                    case 5: {
                        v1 = 6;
                        break;
                    }
                    case 6: {
                        v1 = 7;
                        break;
                    }
                    case 7: {
                        v1 = 5;
                        break;
                    }
                    default: {
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + v);
                        v1 = 1;
                    }
                }
            }
            this.h.a.d.a(new jgk(v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String s, Bundle bundle0) {
        return this.d;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int v) {
        boolean z4;
        boolean z2;
        boolean z1;
        boolean z = false;
        if(this.d) {
            if(Build.VERSION.SDK_INT >= 33) {
                z1 = (v & 16) != 0;
                z2 = (v & 8) != 0;
                boolean z3 = (v & 4) != 0;
                if(Build.VERSION.SDK_INT >= 34 && (v & 0x20) != 0) {
                    z = true;
                }
                if(!z1 && !z2 && !z3 && !z) {
                    z4 = Build.VERSION.SDK_INT >= 34 ? true : z;
                    z = true;
                    z1 = true;
                    z2 = true;
                }
                else {
                    z4 = z;
                    z = z3;
                }
            }
            else {
                z4 = false;
                z1 = true;
                z2 = true;
            }
            jfw jfw0 = this.h.a.i;
            synchronized(jfw0.a) {
                jfw0.d = z1;
                jfw0.e = z2;
                jfw0.f = z;
                jfw0.g = z4;
                if((v & 1) != 0) {
                    jfw0.c = true;
                    if(jfw0.h != null) {
                        jfw0.a();
                    }
                }
                jfw0.b = (v & 2) != 0;
            }
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent0) {
        if(this.d) {
            ((BaseInputConnection)this.h.a.h.a()).sendKeyEvent(keyEvent0);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int v, int v1) {
        boolean z = this.d;
        if(z) {
            this.a(new jhf(v, v1));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence0, int v) {
        boolean z = this.d;
        if(z) {
            this.a(new jhg(String.valueOf(charSequence0), v));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public final boolean setSelection(int v, int v1) {
        if(this.d) {
            this.a(new jhh(v, v1));
            return true;
        }
        return false;
    }
}

