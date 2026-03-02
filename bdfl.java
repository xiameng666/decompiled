import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public final class bdfl extends BaseExpandableListAdapter {
    public gged_interceptors a;
    private final LayoutInflater b;
    private final Context c;
    private final bdfk d;
    private final boolean e;

    public bdfl(Context context0, bdfk bdfk0, boolean z) {
        this.c = context0;
        this.b = LayoutInflater.from(context0);
        this.d = bdfk0;
        this.e = z;
    }

    @Override  // android.widget.ExpandableListAdapter
    public final Object getChild(int v, int v1) {
        return ((beds)this.a.get(v)).c.get(v1);
    }

    @Override  // android.widget.ExpandableListAdapter
    public final long getChildId(int v, int v1) {
        return (long)v1;
    }

    @Override  // android.widget.ExpandableListAdapter
    public final View getChildView(int v, int v1, boolean z, View view0, ViewGroup viewGroup0) {
        gfsx gfsx0 = gfqx.a;
        beds beds0 = (beds)this.a.get(v);
        if(beds0.a == graz.b) {
            gfsx0 = beds0.d == 1 ? gfsx.m(beqn.d) : gfsx.m(beqn.c);
        }
        bede bede0 = (bede)this.getChild(v, v1);
        graz graz0 = ((beds)this.a.get(v)).a;
        View view1 = this.d.a(view0, viewGroup0, bede0, gfsx0, graz0);
        if(view1.getTag() != bedd.c) {
            if(hsam.f()) {
                if(z && this.e) {
                    view1.setBackgroundResource(0x7F080AB7);  // drawable:pwm_checkup_result_item_border_top_open
                    return view1;
                }
                view1.setBackgroundResource(0x7F080AB5);  // drawable:pwm_checkup_result_item_border_left_right
                return view1;
            }
            if(z && this.e) {
                view1.setBackgroundResource(0x7F080AB8);  // drawable:pwm_checkup_result_item_border_top_open_old
                return view1;
            }
            view1.setBackgroundResource(0x7F080AB6);  // drawable:pwm_checkup_result_item_border_left_right_old
        }
        return view1;
    }

    @Override  // android.widget.ExpandableListAdapter
    public final int getChildrenCount(int v) {
        return this.a == null ? 0 : ((beds)this.a.get(v)).c.size();
    }

    @Override  // android.widget.ExpandableListAdapter
    public final Object getGroup(int v) {
        return ((beds)this.a.get(v)).c;
    }

    @Override  // android.widget.ExpandableListAdapter
    public final int getGroupCount() {
        return this.a == null ? 0 : this.a.size();
    }

    @Override  // android.widget.ExpandableListAdapter
    public final long getGroupId(int v) {
        return (long)v;
    }

    @Override  // android.widget.ExpandableListAdapter
    public final View getGroupView(int v, boolean z, View view0, ViewGroup viewGroup0) {
        if(view0 == null) {
            view0 = this.b.inflate(0x7F0E084F, viewGroup0, false);  // layout:pwm_checkup_result_sublist_group_title
        }
        beds beds0 = (beds)this.a.get(v);
        ((TextView)view0.findViewById(0x7F0B0EE2)).setText((beds0.d == 1 ? this.c.getResources().getQuantityString(0x7F130067, beds0.b, new Object[]{((int)beds0.b)}) : "Other warnings"));  // id:checkup_result_subgroup_title
        if(hsam.f()) {
            if(!z && this.e) {
                view0.setBackgroundResource(0x7F080AB7);  // drawable:pwm_checkup_result_item_border_top_open
                return view0;
            }
            view0.setBackgroundResource(0x7F080AB5);  // drawable:pwm_checkup_result_item_border_left_right
            return view0;
        }
        if(!z && this.e) {
            view0.setBackgroundResource(0x7F080AB8);  // drawable:pwm_checkup_result_item_border_top_open_old
            return view0;
        }
        view0.setBackgroundResource(0x7F080AB6);  // drawable:pwm_checkup_result_item_border_left_right_old
        return view0;
    }

    @Override  // android.widget.ExpandableListAdapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override  // android.widget.ExpandableListAdapter
    public final boolean isChildSelectable(int v, int v1) {
        return true;
    }
}

