import android.content.Context;
import android.content.res.Resources;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import java.util.ArrayList;
import java.util.List;

public final class acbz extends BaseAdapter {
    public ContactPerson a;
    public boolean b;
    public int c;
    private final Context d;
    private final View.OnClickListener e;
    private final List f;
    private final SparseIntArray g;
    private int h;

    public acbz(Context context0, SparseIntArray sparseIntArray0, View.OnClickListener view$OnClickListener0) {
        this.f = new ArrayList();
        this.d = context0;
        this.g = sparseIntArray0;
        this.e = view$OnClickListener0;
    }

    public final ContactPerson.ContactMethod a(int v) {
        return this.a == null || v <= 0 ? null : ((ContactPerson.ContactMethod)this.f.get(v - 1));
    }

    public final void b(ContactPerson contactPerson0, int v) {
        this.a = contactPerson0;
        this.h = v;
        List list0 = this.f;
        list0.clear();
        if(this.b) {
            list0.addAll(this.a.e);
            list0.remove(this.a.a());
        }
        this.notifyDataSetChanged();
    }

    @Override  // android.widget.Adapter
    public final int getCount() {
        return this.a == null ? 0 : this.f.size() + 1;
    }

    @Override  // android.widget.Adapter
    public final Object getItem(int v) {
        return this.a(v);
    }

    @Override  // android.widget.Adapter
    public final long getItemId(int v) {
        return (long)v;
    }

    @Override  // android.widget.Adapter
    public final View getView(int v, View view0, ViewGroup viewGroup0) {
        int v6;
        ContactPerson.ContactMethod contactPerson$ContactMethod0;
        int v1 = 0;
        if(view0 == null) {
            view0 = LayoutInflater.from(this.d).inflate(0x7F0E009A, viewGroup0, false);  // layout:appinvite_contextual_selection_dropdown_item
        }
        Context context0 = this.d;
        Resources resources0 = context0.getResources();
        int v2 = resources0.getDimensionPixelSize(0x7F07014A);  // dimen:appinvite_method_padding_medium
        int v3 = resources0.getDimensionPixelSize(0x7F070149);  // dimen:appinvite_method_padding_large
        TextView textView0 = (TextView)view0.findViewById(0x7F0B19AA);  // id:name
        ImageView imageView0 = (ImageView)view0.findViewById(0x7F0B0C3B);  // id:avatar_method
        TextView textView1 = (TextView)view0.findViewById(0x7F0B0FB4);  // id:contact_detail
        View view1 = view0.findViewById(0x7F0B10D2);  // id:delete_icon
        int v4 = 8;
        if(v == 0) {
            contactPerson$ContactMethod0 = this.a.a();
            textView0.setText(acfd.a(context0, this.a));
            textView0.setVisibility(0);
            textView1.setTextColor(-1);
            textView1.setPadding(0, 0, 0, v2);
            if(this.h == 0) {
                view1.setVisibility(0);
                view1.setOnClickListener(this.e);
            }
            else {
                view1.setVisibility(8);
            }
            view0.setBackgroundColor(this.c);
        }
        else {
            ContactPerson.ContactMethod contactPerson$ContactMethod1 = (ContactPerson.ContactMethod)this.f.get(v - 1);
            textView0.setVisibility(8);
            textView1.setTextColor(resources0.getColor(0x7F06004C));  // color:appinvite_medium_black
            textView1.setPadding(0, v3, 0, v3);
            view1.setVisibility(8);
            view0.setBackgroundColor(0);
            contactPerson$ContactMethod0 = contactPerson$ContactMethod1;
        }
        String s = acfa.a(context0, contactPerson$ContactMethod0);
        textView1.setText(s);
        boolean z = true;
        if(!TextUtils.isEmpty(s)) {
            v4 = 0;
        }
        textView1.setVisibility(v4);
        if(contactPerson$ContactMethod0 == null) {
            z = false;
        }
        else {
            int v5 = contactPerson$ContactMethod0.a;
            switch(v5) {
                case 0: {
                    v6 = 0x7F080D96;
                    break;
                }
                case 1: {
                    s = "Email " + s;
                    v6 = 0x7F080D11;
                    break;
                }
                case 2: {
                    s = "Text message " + PhoneNumberUtils.formatNumber(s);
                    v6 = 0x7F080D7B;
                    break;
                }
                default: {
                    v6 = 0;
                }
            }
            if(s != null) {
                s = a.r((v == 0 ? "selected" : "not selected"), s, ", ");
            }
            SparseIntArray sparseIntArray0 = this.g;
            if(sparseIntArray0 != null && sparseIntArray0.indexOfKey(v5) >= 0 && sparseIntArray0.get(v5) != 0) {
                v1 = sparseIntArray0.get(v5);
            }
            else {
                z = false;
                v1 = v6;
            }
        }
        imageView0.setImageDrawable(acfj.a(context0, v1, resources0.getColor(0x7F060BF9), z));  // color:material_grey_600
        textView1.setContentDescription(s);
        return view0;
    }
}

