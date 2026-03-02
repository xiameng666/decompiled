import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class mj implements Window.Callback {
    public final Window.Callback e;

    public mj(Window.Callback window$Callback0) {
        if(window$Callback0 == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.e = window$Callback0;
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent0) {
        return this.e.dispatchGenericMotionEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.e.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.Window$Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent0) {
        return this.e.dispatchKeyShortcutEvent(keyEvent0);
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        return this.e.dispatchPopulateAccessibilityEvent(accessibilityEvent0);
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        return this.e.dispatchTouchEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent0) {
        return this.e.dispatchTrackballEvent(motionEvent0);
    }

    @Override  // android.view.Window$Callback
    public final void onActionModeFinished(ActionMode actionMode0) {
        this.e.onActionModeFinished(actionMode0);
    }

    @Override  // android.view.Window$Callback
    public final void onActionModeStarted(ActionMode actionMode0) {
        this.e.onActionModeStarted(actionMode0);
    }

    @Override  // android.view.Window$Callback
    public final void onAttachedToWindow() {
        this.e.onAttachedToWindow();
    }

    @Override  // android.view.Window$Callback
    public void onContentChanged() {
        this.e.onContentChanged();
    }

    @Override  // android.view.Window$Callback
    public boolean onCreatePanelMenu(int v, Menu menu0) {
        return this.e.onCreatePanelMenu(v, menu0);
    }

    @Override  // android.view.Window$Callback
    public View onCreatePanelView(int v) {
        return this.e.onCreatePanelView(v);
    }

    @Override  // android.view.Window$Callback
    public final void onDetachedFromWindow() {
        this.e.onDetachedFromWindow();
    }

    @Override  // android.view.Window$Callback
    public final boolean onMenuItemSelected(int v, MenuItem menuItem0) {
        return this.e.onMenuItemSelected(v, menuItem0);
    }

    @Override  // android.view.Window$Callback
    public boolean onMenuOpened(int v, Menu menu0) {
        return this.e.onMenuOpened(v, menu0);
    }

    @Override  // android.view.Window$Callback
    public void onPanelClosed(int v, Menu menu0) {
        this.e.onPanelClosed(v, menu0);
    }

    @Override  // android.view.Window$Callback
    public final void onPointerCaptureChanged(boolean z) {
        this.e.onPointerCaptureChanged(z);
    }

    @Override  // android.view.Window$Callback
    public boolean onPreparePanel(int v, View view0, Menu menu0) {
        return this.e.onPreparePanel(v, view0, menu0);
    }

    @Override  // android.view.Window$Callback
    public void onProvideKeyboardShortcuts(List list0, Menu menu0, int v) {
        this.e.onProvideKeyboardShortcuts(list0, menu0, v);
    }

    @Override  // android.view.Window$Callback
    public final boolean onSearchRequested() {
        return this.e.onSearchRequested();
    }

    @Override  // android.view.Window$Callback
    public final boolean onSearchRequested(SearchEvent searchEvent0) {
        return this.e.onSearchRequested(searchEvent0);
    }

    @Override  // android.view.Window$Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams windowManager$LayoutParams0) {
        this.e.onWindowAttributesChanged(windowManager$LayoutParams0);
    }

    @Override  // android.view.Window$Callback
    public final void onWindowFocusChanged(boolean z) {
        this.e.onWindowFocusChanged(z);
    }

    @Override  // android.view.Window$Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0) {
        return this.e.onWindowStartingActionMode(actionMode$Callback0);
    }

    @Override  // android.view.Window$Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback actionMode$Callback0, int v) {
        return this.e.onWindowStartingActionMode(actionMode$Callback0, v);
    }
}

