import android.accounts.Account;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import com.google.android.gms.googleone.StorageQuotaInfo;
import com.google.android.gms.googleone.StorageQuotaInfoRequest;
import com.google.android.gms.googleone.escalation.EscalationCard;
import com.google.android.gms.googleone.escalation.EscalationCardActionButton;
import com.google.android.gms.googleone.escalation.EscalationCardDataResponse;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

public final class bugk {
    public final Set a;
    public static final int b;
    private static final bboh c;
    private final bufn d;
    private final buqz e;
    private final buav f;
    private final String g;
    private final ibnn h;
    private final budd i;

    static {
        bugk.c = bboh.b("EscalationCardServiceImpl", bbcu.gY);
    }

    @AssistedInject
    public bugk(budd budd0, bufn bufn0, buqz buqz0, buav buav0, @Assisted String s) {
        ibuq.f(budd0, "accountEligibilityManager");
        ibuq.f(bufn0, "eligibilityManager");
        ibuq.f(buqz0, "smuiActivityProvider");
        ibuq.f(buav0, "googleoneClient");
        ibuq.f(s, "callingPackage");
        super();
        this.i = budd0;
        this.d = bufn0;
        this.e = buqz0;
        this.f = buav0;
        this.g = s;
        this.a = new LinkedHashSet();
        this.h = new ibnz(new buge());
    }

    public final Object a(Context context0, ibrl ibrl0) {
        String s3;
        Object object6;
        budi budi2;
        Object object5;
        budi budi1;
        Object object4;
        String s1;
        Object object3;
        Object object2;
        bugg bugg0;
        if((ibrl0 instanceof bugg)) {
            bugg0 = (bugg)ibrl0;
            int v = bugg0.e;
            if((v & 0x80000000) == 0) {
                bugg0 = new bugg(this, ibrl0);
            }
            else {
                bugg0.e = v - 0x80000000;
            }
        }
        else {
            bugg0 = new bugg(this, ibrl0);
        }
        Object object0 = bugg0.c;
        Object object1 = ibrx.a;
        Bitmap bitmap0 = null;
        switch(bugg0.e) {
            case 0: {
                ibnx.b(object0);
                object2 = context0;
                bugg0.a = object2;
                bugg0.e = 1;
                object0 = this.i.b(bugg0);
                if(object0 != object1) {
                    goto label_23;
                }
                return object1;
            }
            case 1: {
                object2 = bugg0.a;
                ibnx.b(object0);
            label_23:
                if(((Account)object0) == null) {
                    return new EscalationCardDataResponse(null);
                }
                String s = ((Account)object0).name;
                ibuq.e(s, "name");
                StorageQuotaInfoRequest storageQuotaInfoRequest0 = new StorageQuotaInfoRequest(((Account)object0).name);
                evql evql0 = this.f.c(storageQuotaInfoRequest0);
                bugg0.a = object2;
                bugg0.b = s;
                bugg0.e = 2;
                object0 = ictn.b(evql0, bugg0);
                if(object0 != object1) {
                    object3 = object2;
                    s1 = s;
                    goto label_39;
                }
                return object1;
            }
            case 2: {
                s1 = (String)bugg0.b;
                object3 = bugg0.a;
                ibnx.b(object0);
            label_39:
                ibuq.e(object0, "await(...)");
                budi budi0 = new budi(s1, ((StorageQuotaInfo)object0));
                bugg0.a = object3;
                bugg0.b = budi0;
                bugg0.e = 3;
                object0 = this.d.c(budi0, bugg0);
                if(object0 != object1) {
                    object4 = object3;
                    budi1 = budi0;
                    goto label_52;
                }
                return object1;
            }
            case 3: {
                budi1 = (budi)bugg0.b;
                object4 = bugg0.a;
                ibnx.b(object0);
            label_52:
                if(!(((budm)object0) instanceof budj)) {
                    return new EscalationCardDataResponse(null);
                }
                bugg0.a = object4;
                bugg0.b = budi1;
                bugg0.e = 4;
                if(this.d.f(budi1, bugg0) != object1) {
                    object5 = object4;
                    goto label_63;
                }
                return object1;
            }
            case 4: {
                budi1 = (budi)bugg0.b;
                object5 = bugg0.a;
                ibnx.b(object0);
            label_63:
                bugg0.a = object5;
                bugg0.b = budi1;
                bugg0.e = 5;
                object0 = this.d.d(budi1, bugg0);
                if(object0 != object1) {
                    budi2 = budi1;
                    object6 = object5;
                    break;
                }
                return object1;
            }
            case 5: {
                budi2 = (budi)bugg0.b;
                object6 = bugg0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s2 = ((UUID)object0).toString();
        ibuq.e(s2, "toString(...)");
        buds buds0 = budr.a(budi2);
        if(buds0 == buds.a) {
            s3 = "LEVEL_NONE";
        }
        else {
            ibuq.f(buds.b, "<this>");
            ibuq.f(buds.d, "that");
            ibwj ibwj0 = new ibwj(buds.b, buds.d);
            s3 = buds0.compareTo(ibwj0.a) < 0 || buds0.compareTo(ibwj0.b) >= 0 ? "LEVEL_HIGH" : "LEVEL_MODERATE";
        }
        EscalationCardActionButton[] arr_escalationCardActionButton = new EscalationCardActionButton[2];
        ibuq.e("Get storage", "getString(...)");
        arr_escalationCardActionButton[0] = new EscalationCardActionButton("CLICK_GET_STORAGE", "Get storage");
        ibuq.e("Clean up space", "getString(...)");
        arr_escalationCardActionButton[1] = new EscalationCardActionButton("CLICK_CLEAN_UP_SPACE", "Clean up space");
        List list0 = ibpo.g(arr_escalationCardActionButton);
        if(Long.compare(budi2.b.a, budi2.b.b) >= 0) {
            ibuq.e("Your Google Account is out of storage", "getString(...)");
            Drawable drawable0 = ((Context)object6).getDrawable(0x7F08067B);  // drawable:gs_warning_vd_theme_24
            if(drawable0 != null) {
                bitmap0 = jxv.b(drawable0, 0, 0, 7);
            }
            return new EscalationCardDataResponse(new EscalationCard(s2, "Your Google Account is out of storage", "Manage your storage", bitmap0, list0, s3));
        }
        ibuq.e("Your Google Account is almost out of storage", "getString(...)");
        Drawable drawable1 = ((Context)object6).getDrawable(0x7F080515);  // drawable:gs_cloud_alert_vd_theme_24
        if(drawable1 != null) {
            bitmap0 = jxv.b(drawable1, 0, 0, 7);
        }
        return new EscalationCardDataResponse(new EscalationCard(s2, "Your Google Account is almost out of storage", "Manage your storage", bitmap0, list0, s3));
    }

    public final Object b(Context context0, ibrl ibrl0) {
        bugh bugh0;
        if((ibrl0 instanceof bugh)) {
            bugh0 = (bugh)ibrl0;
            int v = bugh0.c;
            if((v & 0x80000000) == 0) {
                bugh0 = new bugh(this, ibrl0);
            }
            else {
                bugh0.c = v - 0x80000000;
            }
        }
        else {
            bugh0 = new bugh(this, ibrl0);
        }
        Object object0 = bugh0.a;
        Object object1 = ibrx.a;
        switch(bugh0.c) {
            case 0: {
                ibnx.b(object0);
                bugh0.c = 1;
                object0 = this.a(context0, bugh0);
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
        for(Object object2: this.a) {
            Parcel parcel0 = ((bugb)object2).jo();
            wbz.f(parcel0, ((EscalationCardDataResponse)object0));
            ((bugb)object2).jq(1, parcel0);
        }
        return ibom.a;
    }

    public final Object c(Context context0, UUID uUID0, String s, String s1, ibrl ibrl0) {
        Object object4;
        busq busq1;
        UUID uUID1;
        Object object3;
        bugi bugi0;
        if((ibrl0 instanceof bugi)) {
            bugi0 = (bugi)ibrl0;
            int v = bugi0.f;
            if((v & 0x80000000) == 0) {
                bugi0 = new bugi(this, ibrl0);
            }
            else {
                bugi0.f = v - 0x80000000;
            }
        }
        else {
            bugi0 = new bugi(this, ibrl0);
        }
        Object object0 = bugi0.d;
        Object object1 = ibrx.a;
        switch(bugi0.f) {
            case 0: {
                ibnx.b(object0);
                if(s != null) {
                    switch(s.hashCode()) {
                        case 0x9C6841FB: {
                            if(s.equals("CLICK_GET_STORAGE")) {
                                busq busq0 = busq.a;
                                bugi0.a = context0;
                                bugi0.g = uUID0;
                                bugi0.h = s1;
                                bugi0.b = context0;
                                bugi0.i = busq0;
                                bugi0.c = context0;
                                bugi0.f = 3;
                                Object object2 = this.d.b(uUID0, bugi0);
                                if(object2 == object1) {
                                    return object1;
                                }
                                object3 = context0;
                                uUID1 = uUID0;
                                busq1 = busq0;
                                object0 = object2;
                                object4 = object3;
                                goto label_76;
                            }
                            break;
                        }
                        case -1656231091: {
                            if(s.equals("RESET_SETUP")) {
                                if(((List)this.h.a()).contains(this.g)) {
                                    bugi0.a = context0;
                                    bugi0.f = 9;
                                    if(this.d.g(bugi0) == object1) {
                                        return object1;
                                    }
                                    goto label_110;
                                }
                                ((ggtj)bugk.c.j()).x("Illegal usage of debug action");
                                return ibom.a;
                            }
                            break;
                        }
                        case 0xA5A35FC5: {
                            if(s.equals("DISMISS_CARD")) {
                                bugi0.a = context0;
                                bugi0.f = 1;
                                if(this.d.e(uUID0, bugi0) == object1) {
                                    return object1;
                                }
                                goto label_63;
                            }
                            break;
                        }
                        case 0xF0567F87: {
                            if(s.equals("CLICK_CARD")) {
                                bugi0.a = context0;
                                bugi0.g = uUID0;
                                bugi0.h = s1;
                                bugi0.f = 7;
                                if(this.d(context0, uUID0, bugi0) == object1) {
                                    return object1;
                                }
                                goto label_102;
                            }
                            break;
                        }
                        case 0x335B3B4F: {
                            if(s.equals("CLICK_CLEAN_UP_SPACE")) {
                                bugi0.a = context0;
                                bugi0.g = uUID0;
                                bugi0.h = s1;
                                bugi0.f = 5;
                                if(this.d(context0, uUID0, bugi0) != object1) {
                                    goto label_92;
                                }
                                return object1;
                            }
                            break;
                        }
                        default: {
                            return ibom.a;
                        }
                    }
                }
                break;
            }
            case 1: {
                context0 = bugi0.a;
                ibnx.b(object0);
            label_63:
                bugi0.a = null;
                bugi0.f = 2;
                if(this.b(context0, bugi0) == object1) {
                    return object1;
                }
                break;
            }
            case 3: {
                context0 = bugi0.c;
                busq1 = bugi0.i;
                object4 = bugi0.b;
                s1 = bugi0.h;
                uUID1 = bugi0.g;
                object3 = bugi0.a;
                ibnx.b(object0);
            label_76:
                if(object0 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ((Context)object4).startActivity(busq1.a(context0, ((String)object0), new bujp("ESCALATION_BANNER", "ANDROID", bugk.e().name(), ""), 0).addFlags(0x10000000));
                bugi0.a = null;
                bugi0.g = null;
                bugi0.h = null;
                bugi0.b = null;
                bugi0.i = null;
                bugi0.c = null;
                bugi0.f = 4;
                if(this.c(((Context)object3), uUID1, "DISMISS_CARD", s1, bugi0) == object1) {
                    return object1;
                }
                break;
            }
            case 5: {
                s1 = bugi0.h;
                uUID0 = bugi0.g;
                context0 = bugi0.a;
                ibnx.b(object0);
            label_92:
                bugi0.a = null;
                bugi0.g = null;
                bugi0.h = null;
                bugi0.f = 6;
                if(this.c(context0, uUID0, "DISMISS_CARD", s1, bugi0) == object1) {
                    return object1;
                }
                break;
            }
            case 7: {
                s1 = bugi0.h;
                uUID0 = bugi0.g;
                context0 = bugi0.a;
                ibnx.b(object0);
            label_102:
                bugi0.a = null;
                bugi0.g = null;
                bugi0.h = null;
                bugi0.f = 8;
                if(this.c(context0, uUID0, "DISMISS_CARD", s1, bugi0) == object1) {
                    return object1;
                }
                break;
            }
            case 9: {
                context0 = bugi0.a;
                ibnx.b(object0);
            label_110:
                bugi0.a = null;
                bugi0.f = 10;
                if(this.b(context0, bugi0) == object1) {
                    return object1;
                }
                break;
            }
            case 2: 
            case 4: 
            case 6: 
            case 8: 
            case 10: {
                ibnx.b(object0);
                return ibom.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return ibom.a;
    }

    public final Object d(Context context0, UUID uUID0, ibrl ibrl0) {
        buqz buqz1;
        bugj bugj0;
        if((ibrl0 instanceof bugj)) {
            bugj0 = (bugj)ibrl0;
            int v = bugj0.d;
            if((v & 0x80000000) == 0) {
                bugj0 = new bugj(this, ibrl0);
            }
            else {
                bugj0.d = v - 0x80000000;
            }
        }
        else {
            bugj0 = new bugj(this, ibrl0);
        }
        Object object0 = bugj0.b;
        Object object1 = ibrx.a;
        switch(bugj0.d) {
            case 0: {
                ibnx.b(object0);
                buqz buqz0 = this.e;
                bugj0.a = context0;
                bugj0.e = buqz0;
                bugj0.d = 1;
                Object object2 = this.d.b(uUID0, bugj0);
                if(object2 != object1) {
                    object0 = object2;
                    buqz1 = buqz0;
                    break;
                }
                return object1;
            }
            case 1: {
                buqz1 = bugj0.e;
                context0 = bugj0.a;
                ibnx.b(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        context0.startActivity(buqz1.a(((String)object0), "ESCALATION_BANNER", bugk.e().name(), "").addFlags(0x10000000));
        return ibom.a;
    }

    private static final hitf e() {
        Object object0;
        ibot ibot0 = new ibot(((ibow)bugf.a));
        while(true) {
            object0 = null;
            if(!ibot0.hasNext()) {
                break;
            }
            Object object1 = ibot0.next();
            String s = ((hitf)object1).name().toUpperCase(Locale.ROOT);
            ibuq.e(s, "toUpperCase(...)");
            String s1 = Build.MANUFACTURER;
            if(s1 != null) {
                object0 = s1.toUpperCase(Locale.ROOT);
                ibuq.e(object0, "toUpperCase(...)");
            }
            if(ibuq.m(s, object0)) {
                return ((hitf)object1) == null ? hitf.F : ((hitf)object1);
            }
        }
        return ((hitf)object0) == null ? hitf.F : ((hitf)object0);
    }
}

