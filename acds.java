import android.accounts.Account;
import android.content.Context;
import android.os.Process;
import com.google.android.gms.appinvite.model.ContactPerson.ContactMethod;
import com.google.android.gms.appinvite.model.ContactPerson;
import com.google.android.gms.appinvite.ui.context.section.LoaderSectionInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class acds extends luw {
    private final Context c;
    private final List d;
    private final String e;
    private final String f;
    private final accu g;
    private ArrayList h;
    private final acbk i;
    private final acdr j;

    public acds(Context context0, String s, String s1, LoaderSectionInfo loaderSectionInfo0, acbk acbk0, accu accu0) {
        super(context0);
        this.e = s;
        this.d = loaderSectionInfo0.l;
        this.c = context0;
        this.f = s1;
        this.g = accu0;
        this.i = acbk0;
        this.j = new acdr(loaderSectionInfo0.b, loaderSectionInfo0.c);
    }

    public final void c(ArrayList arrayList0) {
        accu accu0 = this.g;
        if(accu0 != null) {
            accu0.r();
        }
        this.h = arrayList0;
        if(this.isStarted()) {
            super.deliverResult(arrayList0);
        }
    }

    @Override  // lvb
    public final void deliverResult(Object object0) {
        this.c(((ArrayList)object0));
    }

    @Override  // luw
    public final Object loadInBackground() {
        Account account0 = new Account(this.e, "com.google");
        baqr baqr0 = new baqr();
        baqr0.a = Process.myUid();
        baqr0.c = account0;
        baqr0.b = account0;
        baqr0.d = this.f;
        baqr0.e = "com.google.android.gms";
        baqr0.n(new String[]{"https://www.googleapis.com/auth/plus.native"});
        ArrayList arrayList0 = this.i.c(baqr0);
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            acfc acfc0 = new acfc();
            List list0 = this.d;
            if(list0 != null) {
                acfc0.b(list0);
            }
            for(int v = 0; v < arrayList0.size(); ++v) {
                acdr acdr0 = this.j;
                ArrayList arrayList1 = ((ContactPerson)arrayList0.get(v)).e;
                hour.a.c().j();
                Iterator iterator0 = arrayList1.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    int v1 = ((ContactPerson.ContactMethod)object0).a;
                    if(v1 >= 3 || acdr0.a[v1] >= 3) {
                        iterator0.remove();
                    }
                }
                if(acdr0.b) {
                    Collections.sort(arrayList1, acdr0.c);
                }
                if(!((ContactPerson)arrayList0.get(v)).e.isEmpty()) {
                    acfc0.a(((ContactPerson)arrayList0.get(v)));
                }
            }
            return acfc0.a;
        }
        return this.d == null ? new ArrayList() : new ArrayList(this.d);
    }

    @Override  // lvb
    protected final void onReset() {
        this.cancelLoad();
        this.h = null;
    }

    @Override  // lvb
    protected final void onStartLoading() {
        ArrayList arrayList0 = this.h;
        if(arrayList0 != null) {
            this.c(arrayList0);
        }
        if(!this.takeContentChanged() && this.h != null) {
            return;
        }
        this.forceLoad();
    }

    @Override  // lvb
    protected final void onStopLoading() {
        this.cancelLoad();
    }
}

