import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v7.view.menu.ListMenuItemView;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.util.List;

public final class sp extends rl {
    final int c;
    final int d;
    public so e;
    private MenuItem f;

    public sp(Context context0, boolean z) {
        super(context0, z);
        int v = context0.getResources().getConfiguration().getLayoutDirection();
        int v1 = 21;
        this.c = v == 1 ? 21 : 22;
        if(v == 1) {
            v1 = 22;
        }
        this.d = v1;
    }

    @Override  // rl
    public final boolean onHoverEvent(MotionEvent motionEvent0) {
        MenuItem menuItem0;
        mx mx0;
        int v1;
        if(this.e != null) {
            ListAdapter listAdapter0 = this.getAdapter();
            int v = 0;
            if((listAdapter0 instanceof HeaderViewListAdapter)) {
                v1 = ((HeaderViewListAdapter)listAdapter0).getHeadersCount();
                mx0 = (mx)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter();
            }
            else {
                mx0 = (mx)listAdapter0;
                v1 = 0;
            }
            mt mt0 = null;
            if(motionEvent0.getAction() == 10) {
                menuItem0 = null;
            }
            else {
                int v2 = this.pointToPosition(((int)motionEvent0.getX()), ((int)motionEvent0.getY()));
                if(v2 == -1) {
                    menuItem0 = null;
                }
                else {
                    int v3 = v2 - v1;
                    menuItem0 = v3 >= 0 && v3 < mx0.getCount() ? mx0.a(v3) : null;
                }
            }
            MenuItem menuItem1 = this.f;
            if(menuItem1 != menuItem0) {
                na na0 = mx0.a;
                if(menuItem1 != null) {
                    so so0 = ((sq)this.e).a;
                    if(so0 != null) {
                        ((ms)so0).a.a.removeCallbacksAndMessages(na0);
                    }
                }
                this.f = menuItem0;
                if(menuItem0 != null) {
                    so so1 = ((sq)this.e).a;
                    if(so1 != null) {
                        Handler handler0 = ((ms)so1).a.a;
                        handler0.removeCallbacksAndMessages(null);
                        List list0 = ((ms)so1).a.b;
                        int v4 = list0.size();
                        while(true) {
                            if(v >= v4) {
                                v = -1;
                                break;
                            }
                            if(na0 == ((mt)list0.get(v)).b) {
                                break;
                            }
                            ++v;
                        }
                        if(v != -1) {
                            if(v + 1 < list0.size()) {
                                mt0 = (mt)list0.get(v + 1);
                            }
                            handler0.postAtTime(new mr(((ms)so1), mt0, menuItem0, na0), na0, SystemClock.uptimeMillis() + 200L);
                        }
                    }
                }
            }
        }
        return super.onHoverEvent(motionEvent0);
    }

    @Override  // android.widget.ListView
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        ListMenuItemView listMenuItemView0 = (ListMenuItemView)this.getSelectedView();
        if(listMenuItemView0 != null && v == this.c) {
            if(listMenuItemView0.isEnabled() && listMenuItemView0.a.hasSubMenu()) {
                this.performItemClick(listMenuItemView0, this.getSelectedItemPosition(), this.getSelectedItemId());
            }
            return true;
        }
        if(listMenuItemView0 != null && v == this.d) {
            this.setSelection(-1);
            ListAdapter listAdapter0 = this.getAdapter();
            ((listAdapter0 instanceof HeaderViewListAdapter) ? ((mx)((HeaderViewListAdapter)listAdapter0).getWrappedAdapter()) : ((mx)listAdapter0)).a.i(false);
            return true;
        }
        return super.onKeyDown(v, keyEvent0);
    }
}

