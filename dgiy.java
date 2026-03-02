import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.gms.nearby.sharing.AppInfo;
import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.ShareTargetAction;
import java.util.List;

public final class dgiy {
    public final Context a;
    public final dgfh b;
    public final dggc c;
    public final icck d;
    public final dcqq e;
    private final byte[] f;
    private final ibnn g;

    public dgiy(Context context0, dgfh dgfh0, dggc dggc0, icck icck0, byte[] arr_b, dcqq dcqq0) {
        ibuq.f(context0, "context");
        ibuq.f(dgfh0, "deviceMetadata");
        super();
        this.a = context0;
        this.b = dgfh0;
        this.c = dggc0;
        this.d = icck0;
        this.f = arr_b;
        this.e = dcqq0;
        if(dggc0.b() && arr_b == null) {
            throw new IllegalArgumentException("To support App installation, we need to pack the shareTarget Bytes in the intent.");
        }
        this.g = new ibnz(new dgis(this));
    }

    public final Object a(ibrl ibrl0) {
        dgiv dgiv0;
        if((ibrl0 instanceof dgiv)) {
            dgiv0 = (dgiv)ibrl0;
            int v = dgiv0.c;
            if((v & 0x80000000) == 0) {
                dgiv0 = new dgiv(this, ibrl0);
            }
            else {
                dgiv0.c = v - 0x80000000;
            }
        }
        else {
            dgiv0 = new dgiv(this, ibrl0);
        }
        Object object0 = dgiv0.a;
        Object object1 = ibrx.a;
        switch(dgiv0.c) {
            case 0: {
                ibnx.b(object0);
                dggc dggc0 = this.c;
                if(dggc0.b()) {
                    Attachment attachment0 = (FileAttachment)ibpo.T(dggc0.c);
                    if(attachment0 == null) {
                        attachment0 = (Attachment)dggc0.f.get(0);
                    }
                    Context context0 = this.a;
                    byte[] arr_b = this.f;
                    if(arr_b == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    dgim dgim0 = new dgim(context0, attachment0, arr_b);
                    dgiv0.c = 1;
                    Object object2 = dgim0.a();
                    return object2 == object1 ? object1 : object2;
                }
                dgja dgja0 = (dgja)this.g.a();
                if(dgja0 != null) {
                    dgiv0.c = 2;
                    object0 = dgja0.a();
                    if(object0 == object1) {
                        return object1;
                    }
                    goto label_36;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                return object0;
            }
            case 2: {
                ibnx.b(object0);
            label_36:
                if(((List)object0) != null) {
                    return (List)object0;
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibps.a;
    }

    public final Object b(ibrl ibrl0) {
        dgix dgix0;
        if((ibrl0 instanceof dgix)) {
            dgix0 = (dgix)ibrl0;
            int v = dgix0.c;
            if((v & 0x80000000) == 0) {
                dgix0 = new dgix(this, ibrl0);
            }
            else {
                dgix0.c = v - 0x80000000;
            }
        }
        else {
            dgix0 = new dgix(this, ibrl0);
        }
        Object object0 = dgix0.a;
        Object object1 = ibrx.a;
        switch(dgix0.c) {
            case 0: {
                ibnx.b(object0);
                dggc dggc0 = this.c;
                if(dggc0.b()) {
                    AppInfo appInfo0 = dggb.a(((Attachment)dggc0.j.get(0)));
                    if(appInfo0 != null && appInfo0.d == 3) {
                        dcvz.a.b().p("App is installing, don\'t open again.", new Object[0]);
                        return new Integer(0);
                    }
                }
                dgix0.c = 1;
                object0 = this.a(dgix0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(((List)object0).isEmpty()) {
            dcvz.a.e().p("Unable to open as there is no action.", new Object[0]);
            return new Integer(13);
        }
        for(Object object2: ((List)object0)) {
            if(!((ShareTargetAction)object2).e) {
                continue;
            }
            goto label_34;
        }
        object2 = null;
    label_34:
        ShareTargetAction shareTargetAction0 = (ShareTargetAction)object2;
        if(shareTargetAction0 == null) {
            shareTargetAction0 = (ShareTargetAction)((List)object0).get(0);
        }
        PendingIntent pendingIntent0 = shareTargetAction0.c;
        if(pendingIntent0 == null) {
            return new Integer(0);
        }
        try {
            if(Build.VERSION.SDK_INT >= 34) {
                pendingIntent0.send(cjoy.a().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            }
            else {
                pendingIntent0.send();
            }
            dcvz.a.b().h("Launched an Activity by opening ShareTarget %s\'s attachment(s)", this.c);
            return new Integer(0);
        }
        catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
            dcvz.a.e().f(pendingIntent$CanceledException0).h("Failed to send pendingIntent of action %s", shareTargetAction0.a);
            return new Integer(13);
        }
    }
}

