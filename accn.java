import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View.OnFocusChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView.OnEditorActionListener;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.model.SourcedContactPerson;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import com.google.android.gms.appinvite.ui.context.section.SectionInfo;
import com.google.android.gms.chimera.modules.appinvite.AppContextProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class accn extends du implements acdh, acdo, View.OnFocusChangeListener, TextView.OnEditorActionListener, fg {
    public Context a;
    public boolean aA;
    public int aB;
    public int aC;
    public sn aD;
    public acbz aE;
    public accc aF;
    public AdapterView.OnItemClickListener aG;
    public int aH;
    public int aI;
    private static final bboh aJ;
    private static final int aK;
    private int aL;
    private String aM;
    private boolean aN;
    private String[] aO;
    private boolean aP;
    private final acfc aQ;
    private boolean aR;
    private boolean aS;
    private boolean aT;
    public accv ag;
    public accu ah;
    public boolean ai;
    public SparseIntArray aj;
    public SparseIntArray ak;
    public View al;
    public boolean am;
    public ArrayList an;
    public ArrayList ao;
    public ArrayList ap;
    public String aq;
    public View ar;
    public ArrayList as;
    public acel at;
    public acdc au;
    public accz av;
    public List aw;
    public final SparseBooleanArray ax;
    public accl ay;
    public CharSequence az;
    public String b;
    public int c;
    public acct d;

    static {
        accn.aJ = bboh.b("CPSelectionFragment", bbcu.aK);
        accn.aK = 0x7F150808;  // string:common_choose_account "Choose account"
    }

    public accn() {
        this.aQ = new acfc();
        this.as = new ArrayList();
        this.ax = new SparseBooleanArray();
        this.aT = false;
    }

    public static accn A(String s, int v, ArrayList arrayList0, boolean z, Bundle bundle0, boolean z1, String[] arr_s, boolean z2, int v1, int v2, ArrayList arrayList1, String s1, boolean z3, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String s2, boolean z4) {
        accn accn0 = new accn();
        Bundle bundle1 = new Bundle();
        bundle1.putString("accountName", s);
        bundle1.putInt("maxSelected", v);
        bundle1.putParcelableArrayList("initialSelection", arrayList0);
        bundle1.putBoolean("allowContactMethodSelection", z);
        bundle1.putBundle("methodData", bundle0);
        bundle1.putBoolean("hideMethodIcon", z1);
        bundle1.putStringArray("searchMethodOrder", arr_s);
        bundle1.putBoolean("excludeNonGaiaContacts", z2);
        bundle1.putInt("numPortraitColumns", v1);
        bundle1.putInt("numLandscapeColumns", v2);
        bundle1.putParcelableArrayList("sections", arrayList1);
        bundle1.putString("callingPackageName", s1);
        bundle1.putBoolean("includePublicSearch", z3);
        bundle1.putStringArrayList("disabledGaiaIds", arrayList2);
        bundle1.putStringArrayList("disabledEmailAddresses", arrayList3);
        bundle1.putStringArrayList("disabledPhoneNumbers", arrayList4);
        bundle1.putString("disabledMessage", s2);
        bundle1.putBoolean("enableSmsWarning", z4);
        accn0.setArguments(bundle1);
        return accn0;
    }

    @Override  // acdo
    public final List B() {
        List list0 = new ArrayList();
        ArrayList arrayList0 = this.as;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((ArrayList)list0).add(((SourcedContactPerson)arrayList0.get(v1)).a);
        }
        return list0;
    }

    public final List C(int v, List list0) {
        acdg acdg0 = (acdg)(((accz)this.au.f.get(v)));
        LoaderSectionInfo loaderSectionInfo0 = (LoaderSectionInfo)this.aw.get(v);
        if(loaderSectionInfo0.m != null || loaderSectionInfo0.n != null || loaderSectionInfo0.o != null) {
            ArrayList arrayList0 = new ArrayList(list0);
            acfd.c(arrayList0, loaderSectionInfo0.m, loaderSectionInfo0.n, loaderSectionInfo0.o);
            list0 = arrayList0;
        }
        List list1 = list0.subList(0, Math.min((this.getResources().getConfiguration().orientation == 2 ? loaderSectionInfo0.k : loaderSectionInfo0.j), list0.size()));
        this.Q(list1);
        List list2 = acdg0.l;
        list2.clear();
        list2.addAll(list1);
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if(!TextUtils.isEmpty(acdg0.i)) {
            arrayList1.add(acdg0.i);
            arrayList2.add(Integer.valueOf(0));
        }
        else if(!TextUtils.isEmpty(acdg0.j)) {
            arrayList1.add(acdg0.j);
            arrayList2.add(Integer.valueOf(0));
        }
        if(acdg0.h) {
            String s = "";
            for(int v2 = 0; v2 < list2.size(); ++v2) {
                String s1 = ((ContactPerson)list2.get(v2)).a == null || ((ContactPerson)list2.get(v2)).a.length() <= 0 ? "" : ((ContactPerson)list2.get(v2)).a.substring(0, 1).toUpperCase(Locale.ROOT);
                if(!s1.equals(s)) {
                    arrayList1.add(s1);
                    arrayList2.add(Integer.valueOf(acdg0.k + v2));
                    s = s1;
                }
            }
        }
        arrayList2.add(Integer.valueOf(acdg0.b()));
        acdg0.m = arrayList1.toArray();
        acdg0.n = new int[arrayList2.size()];
        for(int v1 = 0; v1 < arrayList2.size(); ++v1) {
            int[] arr_v = acdg0.n;
            arr_v[v1] = (int)(((Integer)arrayList2.get(v1)));
        }
        acdg0.q();
        return list1;
    }

    public final void D(ContactPerson contactPerson0, int v, int v1) {
        int v2 = 2;
        if(v != 1) {
            switch(v) {
                case 2: {
                    v2 = 3;
                    break;
                }
                case 3: {
                    v2 = 4;
                    break;
                }
                case 5: {
                    break;
                }
                default: {
                    v2 = 1;
                }
            }
        }
        SourcedContactPerson sourcedContactPerson0 = new SourcedContactPerson(contactPerson0, v2 - 1);
        int v3 = this.z(contactPerson0);
        if(this.as.size() < this.c) {
            if(v3 >= 0) {
                this.as.set(v3, sourcedContactPerson0);
                this.au.I(contactPerson0);
                accz accz0 = this.av;
                if(accz0 != null) {
                    accz0.I(contactPerson0);
                }
            }
            else {
                this.as.add(sourcedContactPerson0);
                this.au.J(contactPerson0);
                accz accz1 = this.av;
                if(accz1 != null) {
                    accz1.J(contactPerson0);
                }
                this.P(contactPerson0, true);
            }
            if(accn.O(contactPerson0)) {
                this.K();
            }
            accv accv0 = this.ag;
            if(accv0 != null) {
                accv0.q(contactPerson0, true);
            }
        }
        else if(v3 < 0) {
            Toast.makeText(this.getContext(), "Cannot add any more people.", 0).show();
        }
        accu accu0 = this.ah;
        if(accu0 != null) {
            accu0.o(contactPerson0, v, v1, true);
        }
    }

    public final void E() {
        sn sn0 = new sn(this.a);
        this.aD = sn0;
        sn0.f = -2;
        sn0.y();
        sn sn1 = this.aD;
        sn1.m = new acci(this);
        acbz acbz0 = new acbz(this.a, this.aj, new accj(this));
        this.aE = acbz0;
        acbz0.notifyDataSetChanged();
        this.aE.b = this.ai;
        this.aE.c = this.aB;
        this.aD.e(this.aE);
    }

    public final void F(ContactPerson contactPerson0, int v, int v1) {
        ArrayList arrayList0 = new ArrayList();
        Iterator iterator0 = this.as.iterator();
        for(int v2 = 0; iterator0.hasNext(); ++v2) {
            Object object0 = iterator0.next();
            if(acfd.g(contactPerson0, ((SourcedContactPerson)object0).a)) {
                iterator0.remove();
                arrayList0.add(Integer.valueOf(v2));
            }
        }
        for(Object object1: arrayList0) {
            Integer integer0 = (Integer)object1;
            this.au.K(contactPerson0, integer0.intValue());
            accz accz0 = this.av;
            if(accz0 != null) {
                accz0.K(contactPerson0, integer0.intValue());
            }
        }
        this.P(contactPerson0, false);
        accv accv0 = this.ag;
        if(accv0 != null) {
            accv0.q(contactPerson0, false);
        }
        accu accu0 = this.ah;
        if(accu0 != null) {
            accu0.o(contactPerson0, v, v1, false);
        }
    }

    public final void G(int v) {
        int v1 = this.aF.getItemViewType(v);
        accc accc0 = this.aF;
        if(v1 == accc0.a) {
            this.aT = true;
            accb accb0 = (accb)accc0.getItem(v);
            ContactPerson.ContactMethod contactPerson$ContactMethod0 = accb0.b;
            if(contactPerson$ContactMethod0 != null) {
                accb0.a.b(contactPerson$ContactMethod0);
            }
            this.D(this.aQ.a(accb0.a), accb0.c, v);
            this.J(false);
            accu accu0 = this.ah;
            if(accu0 != null) {
                accu0.p(true);
            }
        }
    }

    public final void H(boolean z) {
        if(this.M()) {
            this.au.V(this.aA);
            this.au.Q(this.aB);
            accz accz0 = this.av;
            if(accz0 != null) {
                accz0.V(this.aA);
                this.av.Q(this.aB);
            }
            this.at.b = this.au;
            this.at.a.an(this.au);
            acel acel0 = this.at;
            accz accz1 = this.av;
            acel0.c = accz1;
            if(accz1 == null) {
                acel0.e = false;
            }
            else {
                if(acel0.d == null) {
                    acel0.d = new acek(acel0.getContext());
                    int v1;
                    for(v1 = 0; v1 < acel0.getChildCount(); ++v1) {
                        if(acel0.getChildAt(v1).equals(acel0.a)) {
                            ++v1;
                            break;
                        }
                    }
                    acel0.addView(acel0.d, v1, new FrameLayout.LayoutParams(-1, -2));
                }
                acek acek0 = acel0.d;
                tk tk0 = acek0.a;
                if(tk0 != accz1) {
                    if(tk0 != null) {
                        tk0.D(acek0.d);
                    }
                    acek0.a = accz1;
                    accz1.A(acek0.d);
                    acek0.a();
                }
                acel0.e = true;
            }
            for(int v = 0; v < this.as.size(); ++v) {
                if(accn.O(((SourcedContactPerson)this.as.get(v)).a)) {
                    this.K();
                    break;
                }
            }
            acct acct0 = this.d;
            if(acct0 != null) {
                if(z) {
                    acct0.n(this.aH, this.aI);
                    return;
                }
                acct0.m(this.aH, this.aI);
            }
        }
    }

    public final void I(boolean z) {
        this.S(z, false);
    }

    @Override  // acdo
    public final void J(boolean z) {
        this.aS = (int)z;
        acel acel0 = this.at;
        if(acel0 != null) {
            if(acel0.f != (((int)z) ^ 1)) {
                acel0.f = ((int)z) ^ 1;
                acel0.b();
            }
            this.au.T(((boolean)(((int)z))));
            if(((int)z) == 0) {
                this.au.S(null);
                accz accz0 = this.av;
                if(accz0 != null) {
                    accz0.S(null);
                }
                acel acel1 = this.at;
                bbpe.b(this.getContext(), acel1);
                if(this.isResumed()) {
                    this.getFragmentManager().W("searchMode", 1);
                }
            }
            else {
                this.aT = false;
                this.at.post(new accg(this));
                if(this.isResumed() && !this.U()) {
                    ca ca0 = new ca(this.getFragmentManager());
                    ca0.w("searchMode");
                    ca0.a();
                }
            }
        }
    }

    public final void K() {
        if(this.aP && !this.am && this.al == null) {
            View view0 = acfh.d(this.getContext(), "Standard SMS charges apply", true, false, 0L, new acck(this));
            this.al = view0;
            if(view0 == null) {
                this.am = true;
            }
        }
    }

    @Override  // acdh
    public final boolean L(ContactPerson contactPerson0) {
        return acfd.f(contactPerson0, this.an, this.ao, this.ap);
    }

    public final boolean M() {
        for(int v = 0; v < this.aw.size(); ++v) {
            if(!this.ax.get(v, false)) {
                return false;
            }
        }
        return true;
    }

    @Override  // acdh
    public final boolean N(ContactPerson contactPerson0) {
        ArrayList arrayList0 = this.as;
        int v = arrayList0.size();
        int v1 = 0;
        while(v1 < v) {
            boolean z = acfd.g(((SourcedContactPerson)arrayList0.get(v1)).a, contactPerson0);
            ++v1;
            if(z) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(ContactPerson contactPerson0) {
        ContactPerson.ContactMethod contactPerson$ContactMethod0 = contactPerson0.a();
        return contactPerson$ContactMethod0 != null && contactPerson$ContactMethod0.a == 2;
    }

    private final void P(ContactPerson contactPerson0, boolean z) {
        String s = acfd.a(this.a, contactPerson0);
        String s1 = this.a.getString((z ? 0x7F1501B3 : 0x7F1501B2));  // string:appinvite_recipient_selected "selected"
        this.at.announceForAccessibility(s + " " + s1);
    }

    private final void Q(List list0) {
        for(int v = 0; v < list0.size(); ++v) {
            ContactPerson contactPerson0 = (ContactPerson)list0.get(v);
            ContactPerson contactPerson1 = this.aQ.a(contactPerson0);
            if(contactPerson1 != contactPerson0) {
                list0.set(v, contactPerson1);
            }
        }
    }

    private final void R() {
        acel acel0 = this.at;
        if(acel0 != null) {
            acel0.post(new acch(this));
        }
    }

    private final void S(boolean z, boolean z1) {
        if(z1 || this.aR != z) {
            this.aR = z;
            accz accz0 = this.av;
            if(accz0 != null) {
                accz0.O(z);
            }
            this.au.O(this.aR);
            if(!this.aR) {
                this.J(false);
                return;
            }
            if(!z1 && this.as.isEmpty()) {
                this.J(true);
            }
        }
    }

    private static boolean T(Context context0) {
        if(context0 == null) {
            return false;
        }
        try {
            Resources resources0 = context0.getResources();
            if("common_choose_account".equals(resources0.getResourceEntryName(accn.aK)) && "string".equals(resources0.getResourceTypeName(accn.aK))) {
                return true;
            }
        }
        catch(Resources.NotFoundException unused_ex) {
        }
        return false;
    }

    private final boolean U() {
        fm fm0 = this.getFragmentManager();
        for(int v = 0; v < fm0.b(); ++v) {
            ca ca0 = fm0.az(v);
            if(ca0 != null && "searchMode".equals(ca0.m)) {
                return true;
            }
        }
        return false;
    }

    @Override  // fg
    public final void a() {
    }

    @Override  // fg
    public final void b(du du0, boolean z) {
    }

    @Override  // fg
    public final void c(du du0, boolean z) {
    }

    @Override  // fg
    public final void d() {
        if(this.aS && !this.U()) {
            this.J(false);
        }
    }

    @Override  // fg
    public final void e() {
    }

    @Override  // du
    public final void onActivityCreated(Bundle bundle0) {
        super.onActivityCreated(bundle0);
        Context context0 = this.a;
        boolean z = this.ai;
        String[] arr_s = this.aO;
        this.getLoaderManager();
        accc accc0 = new accc(context0, z, arr_s);
        this.aF = accc0;
        accc0.f = this.aA;
    }

    @Override  // du
    public final void onAttach(Context context0) {
        super.onAttach(context0);
        if(!accn.T(context0)) {
            AppContextProvider appContextProvider0 = AppContextProvider.c;
            Context context1 = appContextProvider0 == null ? babh.a() : appContextProvider0.a;
            if(accn.T(context1)) {
                context1.setTheme(0x7F160C0E);  // style:Theme.AppInvite
                this.a = context1;
                return;
            }
            ((ggtj)accn.aJ.i()).x("Couldn\'t find Context with AppInvite resources mapped correctly. Using Activity that doesn\'t have resources mapped, which may fail.");
            this.a = context0;
            return;
        }
        this.a = context0;
    }

    @Override  // du
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        if(this.aB == 0) {
            this.aB = this.a.getResources().getColor(0x7F060BC0);  // color:material_google_blue_500
        }
        if(this.aC == 0) {
            this.aC = this.a.getResources().getColor(0x7F060CAF);  // color:material_teal_500
        }
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            this.b = bundle1.getString("accountName");
            this.c = bundle1.getInt("maxSelected");
            this.ai = bundle1.getBoolean("allowContactMethodSelection");
            this.aN = bundle1.getBoolean("hideMethodIcon");
            this.aO = bundle1.getStringArray("searchMethodOrder");
            bundle1.getBoolean("excludeNonGaiaContacts");
            this.aL = bundle1.getInt((this.getResources().getConfiguration().orientation == 2 ? "numLandscapeColumns" : "numPortraitColumns"));
            this.aw = bundle1.getParcelableArrayList("sections");
            this.aM = bundle1.getString("callingPackageName");
            bundle1.getBoolean("includePublicSearch");
            this.an = bundle1.getStringArrayList("disabledGaiaIds");
            this.ao = bundle1.getStringArrayList("disabledEmailAddresses");
            this.ap = bundle1.getStringArrayList("disabledPhoneNumbers");
            this.aq = bundle1.getString("disabledMessage");
            this.aP = bundle1.getBoolean("enableSmsWarning");
            Bundle bundle2 = bundle1.getBundle("methodData");
            if(bundle2 != null && bundle2.containsKey("methodIcons")) {
                this.aj = new SparseIntArray();
                Bundle bundle3 = bundle2.getBundle("methodIcons");
                for(Object object0: bundle3.keySet()) {
                    this.aj.put(Integer.parseInt(((String)object0)), bundle3.getInt(((String)object0)));
                }
            }
            if(bundle2 != null && bundle2.containsKey("croppedMethodIcons")) {
                this.ak = new SparseIntArray();
                Bundle bundle4 = bundle2.getBundle("croppedMethodIcons");
                for(Object object1: bundle4.keySet()) {
                    this.ak.put(Integer.parseInt(((String)object1)), bundle4.getInt(((String)object1)));
                }
            }
        }
        this.au = new acdc();
        for(int v = 0; v < this.aw.size(); ++v) {
            SectionInfo sectionInfo0 = (SectionInfo)this.aw.get(v);
            acdc acdc0 = this.au;
            accz accz0 = sectionInfo0.a(this, this.aL);
            accz0.A(new acdb(acdc0, accz0));
            acdc0.f.add(accz0);
            if(sectionInfo0.p) {
                this.au.g = v;
                accz accz1 = sectionInfo0.d(this, this.aL);
                this.av = accz1;
                accz1.V(this.aA);
                this.av.N(this.ai);
                this.av.P(this.aN);
            }
        }
        this.au.V(this.aA);
        this.au.N(this.ai);
        this.au.P(this.aN);
        if(bundle0 != null) {
            this.as = bundle0.getParcelableArrayList("selectedPeople");
            this.am = bundle0.getBoolean("smsWarningAcknowledged");
            this.aS = bundle0.getBoolean("searchMode");
            this.az = bundle0.getCharSequence("searchText");
            this.S(bundle0.getBoolean("editMode"), true);
        }
        else if(bundle1 != null && bundle1.containsKey("initialSelection")) {
            ArrayList arrayList0 = bundle1.getParcelableArrayList("initialSelection");
            if(arrayList0 != null) {
                this.as = new ArrayList();
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ContactPerson contactPerson0 = (ContactPerson)arrayList0.get(v2);
                    this.as.add(new SourcedContactPerson(contactPerson0, 0));
                }
            }
        }
        this.Q(this.B());
    }

    @Override  // du
    public final View onCreateView(LayoutInflater layoutInflater0, ViewGroup viewGroup0, Bundle bundle0) {
        acel acel0 = new acel(this.a);
        this.at = acel0;
        acel0.g = this;
        acel0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        aceu aceu0 = this.at.a;
        if(!aceu0.af) {
            aceu0.af = true;
            if(aceu0.ae == Thread.currentThread()) {
                aceu0.aK();
            }
            else {
                aceu0.post(new acev(aceu0));
            }
        }
        this.at.a.r = true;
        this.at.setFocusableInTouchMode(true);
        this.at.a(this.aC);
        GridLayoutManager gridLayoutManager0 = new GridLayoutManager(this.aL, null);
        accd accd0 = new accd(this);
        accd0.c = true;
        gridLayoutManager0.g = accd0;
        this.at.a.ap(gridLayoutManager0);
        acel acel1 = this.at;
        acel1.a.ad = new acce(this);
        this.J(this.aS);
        if(!TextUtils.isEmpty(this.az)) {
            this.R();
        }
        return this.at;
    }

    @Override  // du
    public final void onDetach() {
        super.onDetach();
        this.a = null;
    }

    @Override  // android.widget.TextView$OnEditorActionListener
    public final boolean onEditorAction(TextView textView0, int v, KeyEvent keyEvent0) {
        if(v == 6) {
            if(this.aF.getCount() == 1) {
                this.G(0);
                return true;
            }
            bbpe.b(this.getContext(), textView0);
            return true;
        }
        return false;
    }

    @Override  // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view0, boolean z) {
        if(!z && !this.aT) {
            accu accu0 = this.ah;
            if(accu0 != null) {
                accu0.p(false);
            }
        }
    }

    @Override  // du
    public final void onPause() {
        super.onPause();
        View view0 = this.al;
        if(view0 != null) {
            acfh.b(this.getContext(), view0);
        }
        View view1 = this.ar;
        if(view1 != null) {
            acfh.b(this.getContext(), view1);
            this.ar = null;
        }
        if(this.aS) {
            this.az = this.au.G();
        }
        this.getFragmentManager().ab(this);
    }

    @Override  // du
    public final void onResume() {
        super.onResume();
        View view0 = this.al;
        if(view0 != null) {
            acfh.c(this.getContext(), view0);
        }
        if(this.aS) {
            this.R();
        }
        this.getFragmentManager().r(this);
    }

    @Override  // du
    public final void onSaveInstanceState(Bundle bundle0) {
        bundle0.putParcelableArrayList("selectedPeople", new ArrayList(this.as));
        bundle0.putBoolean("smsWarningAcknowledged", this.am);
        bundle0.putBoolean("editMode", this.aR);
        bundle0.putBoolean("searchMode", this.aS);
        acdc acdc0 = this.au;
        if(acdc0 != null) {
            bundle0.putCharSequence("searchText", acdc0.G());
        }
    }

    @Override  // du
    public final void onStart() {
        lvb lvb0;
        super.onStart();
        for(int v = 0; v < this.aw.size(); ++v) {
            SparseBooleanArray sparseBooleanArray0 = this.ax;
            if(!sparseBooleanArray0.get(v, false)) {
                if((this.aw.get(v) instanceof LoaderSectionInfo)) {
                    LoaderSectionInfo loaderSectionInfo0 = (LoaderSectionInfo)this.aw.get(v);
                    String s = loaderSectionInfo0.a;
                    if(s == null) {
                        lvb0 = null;
                    }
                    else {
                        switch(s) {
                            case "circles": {
                                lvb0 = new acdp(this.getContext());
                                break;
                            }
                            case "identityPeople": {
                                lvb0 = new acdt(this.getContext(), loaderSectionInfo0);
                                break;
                            }
                            case "people": {
                                lvb0 = new acdu(this.getContext(), loaderSectionInfo0);
                                break;
                            }
                            case "suggested": {
                                Context context0 = this.getContext();
                                accu accu0 = this.ah;
                                lvb0 = new acds(context0, this.b, this.aM, loaderSectionInfo0, acbk.a(context0), accu0);
                                break;
                            }
                            default: {
                                lvb0 = null;
                            }
                        }
                    }
                    if(lvb0 != null) {
                        this.getLoaderManager().c(v, null, new accm(this, lvb0));
                    }
                    else if("supplied".equals(s)) {
                        this.C(v, loaderSectionInfo0.l);
                        sparseBooleanArray0.put(v, true);
                    }
                    else {
                        acct acct0 = this.d;
                        if(acct0 != null) {
                            acct0.l();
                            return;
                        }
                    }
                }
                else {
                    sparseBooleanArray0.put(v, true);
                }
            }
        }
        this.H(false);
    }

    @Override  // du
    public final void onStop() {
        super.onStop();
        sn sn0 = this.aD;
        if(sn0 != null) {
            sn0.m();
            this.aD = null;
        }
    }

    @Override  // acdo
    public final int y() {
        return this.as.size();
    }

    public final int z(ContactPerson contactPerson0) {
        for(int v = 0; v < this.as.size(); ++v) {
            if(((SourcedContactPerson)this.as.get(v)).a.equals(contactPerson0)) {
                return v;
            }
        }
        return -1;
    }
}

