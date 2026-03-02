import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.credentials.BeginGetCredentialResponse;
import j..time.Instant;
import java.util.ArrayList;
import java.util.List;

public final class kvk {
    public static final Bundle a(kvl kvl0) {
        Bundle bundle0 = new Bundle();
        if(Build.VERSION.SDK_INT >= 34) {
            bundle0.putParcelable("androidx.credentials.provider.BeginGetCredentialResponse", kyg.a(kvl0));
            return bundle0;
        }
        List list0 = kvl0.a;
        ibuq.f(list0, "<this>");
        bundle0.putInt("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_SIZE", list0.size());
        int v = list0.size();
        int v1 = 0;
        while(v1 < v) {
            kwc kwc0 = (kwc)list0.get(v1);
            if((kwc0 instanceof kwn)) {
                ibuq.f(((kwn)kwc0), "<this>");
                kwb.a(((kwn)kwc0), bundle0, v1);
                bundle0.putParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + v1, ((kwn)kwc0).j);
                bundle0.putBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + v1, ((kwn)kwc0).m);
                bundle0.putBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_" + v1, ((kwn)kwc0).p);
                bundle0.putBoolean("androidx.credentials.provider.extra.HAS_DEFAULT_ICON_" + v1, kwl.b(((kwn)kwc0)));
                bundle0.putCharSequence("androidx.credentials.provider.extra.TITLE_" + v1, ((kwn)kwc0).g);
                bundle0.putCharSequence("androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_" + v1, ((kwn)kwc0).i);
                bundle0.putParcelable("androidx.credentials.provider.extra.ICON_" + v1, ((kwn)kwc0).l);
                CharSequence charSequence0 = ((kwn)kwc0).h;
                if(charSequence0 != null) {
                    bundle0.putCharSequence("androidx.credentials.provider.extra.SUBTITLE_" + v1, charSequence0);
                }
                Instant instant0 = ((kwn)kwc0).k;
                if(instant0 != null) {
                    bundle0.putSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + v1, instant0);
                }
            }
            else if((kwc0 instanceof kxa)) {
                ibuq.f(((kxa)kwc0), "<this>");
                kwb.a(((kxa)kwc0), bundle0, v1);
                bundle0.putParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + v1, ((kxa)kwc0).j);
                bundle0.putBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + v1, ((kxa)kwc0).m);
                bundle0.putBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_" + v1, ((kxa)kwc0).p);
                bundle0.putBoolean("androidx.credentials.provider.extra.HAS_DEFAULT_ICON_" + v1, kwy.b(((kxa)kwc0)));
                bundle0.putCharSequence("androidx.credentials.provider.extra.TITLE_" + v1, ((kxa)kwc0).g);
                bundle0.putCharSequence("androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_" + v1, ((kxa)kwc0).i);
                bundle0.putParcelable("androidx.credentials.provider.extra.ICON_" + v1, ((kxa)kwc0).k);
                CharSequence charSequence1 = ((kxa)kwc0).h;
                if(charSequence1 != null) {
                    bundle0.putCharSequence("androidx.credentials.provider.extra.SUBTITLE_" + v1, charSequence1);
                }
                Instant instant1 = ((kxa)kwc0).l;
                if(instant1 != null) {
                    bundle0.putSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + v1, instant1);
                }
            }
            else if((kwc0 instanceof kwk)) {
                ibuq.f(((kwk)kwc0), "<this>");
                kwb.a(((kwk)kwc0), bundle0, v1);
                bundle0.putParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + v1, ((kwk)kwc0).i);
                bundle0.putBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + v1, ((kwk)kwc0).j);
                bundle0.putBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_" + v1, ((kwk)kwc0).q);
                bundle0.putBoolean("androidx.credentials.provider.extra.HAS_DEFAULT_ICON_" + v1, kwh.b(((kwk)kwc0)));
                bundle0.putCharSequence("androidx.credentials.provider.extra.TITLE_" + v1, ((kwk)kwc0).h);
                bundle0.putCharSequence("androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_" + v1, ((kwk)kwc0).l);
                bundle0.putParcelable("androidx.credentials.provider.extra.ICON_" + v1, ((kwk)kwc0).m);
                CharSequence charSequence2 = ((kwk)kwc0).k;
                if(charSequence2 != null) {
                    bundle0.putCharSequence("androidx.credentials.provider.extra.SUBTITLE_" + v1, charSequence2);
                }
                Instant instant2 = ((kwk)kwc0).n;
                if(instant2 != null) {
                    bundle0.putSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + v1, instant2);
                }
            }
            ++v1;
            list0 = list0;
        }
        List list1 = kvl0.b;
        ibuq.f(list1, "<this>");
        bundle0.putInt("androidx.credentials.provider.extra.ACTION_SIZE", list1.size());
        int v2 = list1.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            bundle0.putParcelable("androidx.credentials.provider.extra.ACTION_PENDING_INTENT_" + v3, ((kuu)list1.get(v3)).b);
            bundle0.putCharSequence("androidx.credentials.provider.extra.ACTION_TITLE_" + v3, ((kuu)list1.get(v3)).a);
            bundle0.putCharSequence("androidx.credentials.provider.extra.ACTION_SUBTITLE_" + v3, ((kuu)list1.get(v3)).c);
        }
        List list2 = kvl0.c;
        ibuq.f(list2, "<this>");
        bundle0.putInt("androidx.credentials.provider.extra.AUTH_ACTION_SIZE", list2.size());
        int v4 = list2.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            bundle0.putParcelable("androidx.credentials.provider.extra.AUTH_ACTION_PENDING_INTENT_" + v5, ((kuw)list2.get(v5)).b);
            bundle0.putCharSequence("androidx.credentials.provider.extra.AUTH_ACTION_TITLE_" + v5, ((kuw)list2.get(v5)).a);
        }
        kxc kxc0 = kvl0.d;
        if(kxc0 != null) {
            kxb.b(kxc0, bundle0);
        }
        return bundle0;
    }

    public static final kvl b(Bundle bundle0) {
        kwn kwn1;
        kwn kwn0;
        kvl kvl1;
        kvl kvl0 = null;
        if(Build.VERSION.SDK_INT >= 34) {
            BeginGetCredentialResponse beginGetCredentialResponse0 = bjk..ExternalSyntheticApiModelOutline0.m(bundle0.getParcelable("androidx.credentials.provider.BeginGetCredentialResponse", BeginGetCredentialResponse.class));
            return beginGetCredentialResponse0 == null ? null : kyg.c(beginGetCredentialResponse0);
        }
        ArrayList arrayList0 = new ArrayList();
        int v = bundle0.getInt("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_SIZE", 0);
        int v1 = 0;
        while(true) {
            if(v1 < v) {
                String s = bundle0.getString("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_TYPE_" + v1);
                if(s == null) {
                    arrayList0 = ibps.a;
                }
                else {
                    kvl1 = kvl0;
                    if(ibuq.m(s, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String s1 = bundle0.getString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_ID_" + v1);
                            ibuq.c(s1);
                            Bundle bundle1 = bundle0.getBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_DATA_" + v1);
                            ibuq.c(bundle1);
                            Parcelable parcelable0 = bundle0.getParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + v1);
                            ibuq.c(parcelable0);
                            CharSequence charSequence0 = bundle0.getCharSequence("androidx.credentials.provider.extra.TITLE_" + v1);
                            ibuq.c(charSequence0);
                            CharSequence charSequence1 = bundle0.getCharSequence("androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_" + v1);
                            ibuq.c(charSequence1);
                            Parcelable parcelable1 = bundle0.getParcelable("androidx.credentials.provider.extra.ICON_" + v1);
                            ibuq.c(parcelable1);
                            kvo kvo0 = kvn.a(bundle1, s1);
                            kwn0 = new kwn(charSequence0, bundle0.getCharSequence("androidx.credentials.provider.extra.SUBTITLE_" + v1), charSequence1, ((PendingIntent)parcelable0), ((Instant)bundle0.getSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + v1)), ((Icon)parcelable1), bundle0.getBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + v1, false), kvo0, bundle0.getBoolean("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_" + v1, false), bundle0.getCharSequence("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_ENTRY_GROUP_ID_" + v1), bundle0.getCharSequence("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_" + v1), bundle0.getBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_" + v1, false), true, bundle0.getBoolean("androidx.credentials.provider.extra.HAS_DEFAULT_ICON_" + v1, false), 0x800);
                        }
                        catch(Exception unused_ex) {
                            kwn1 = kvl1;
                            goto label_61;
                        }
                    }
                    else if(ibuq.m(s, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        goto label_43;
                    }
                    else {
                        try {
                            String s2 = bundle0.getString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_ID_" + v1);
                            ibuq.c(s2);
                            Bundle bundle2 = bundle0.getBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_DATA_" + v1);
                            ibuq.c(bundle2);
                            Parcelable parcelable2 = bundle0.getParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + v1);
                            ibuq.c(parcelable2);
                            CharSequence charSequence2 = bundle0.getCharSequence("androidx.credentials.provider.extra.TITLE_" + v1);
                            ibuq.c(charSequence2);
                            Parcelable parcelable3 = bundle0.getParcelable("androidx.credentials.provider.extra.ICON_" + v1);
                            ibuq.c(parcelable3);
                            kvm kvm0 = new kvm(s2, s, bundle2);
                            kwn1 = new kwk(s, charSequence2, ((PendingIntent)parcelable2), bundle0.getBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + v1, false), bundle0.getCharSequence("androidx.credentials.provider.extra.SUBTITLE_" + v1), bundle0.getCharSequence("androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_" + v1), ((Icon)parcelable3), ((Instant)bundle0.getSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + v1)), kvm0, bundle0.getBoolean("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_" + v1, false), bundle0.getCharSequence("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_ENTRY_GROUP_ID_" + v1), bundle0.getCharSequence("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_" + v1), null, bundle0.getBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_" + v1, false), true, bundle0.getBoolean("androidx.credentials.provider.extra.HAS_DEFAULT_ICON_" + v1, false));
                            goto label_61;
                        label_43:
                            String s3 = bundle0.getString("androidx.credentials.provider.extra.CREDENTIAL_OPTION_ID_" + v1);
                            ibuq.c(s3);
                            Bundle bundle3 = bundle0.getBundle("androidx.credentials.provider.extra.CREDENTIAL_OPTION_DATA_" + v1);
                            ibuq.c(bundle3);
                            Parcelable parcelable4 = bundle0.getParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + v1);
                            ibuq.c(parcelable4);
                            CharSequence charSequence3 = bundle0.getCharSequence("androidx.credentials.provider.extra.TITLE_" + v1);
                            ibuq.c(charSequence3);
                            CharSequence charSequence4 = bundle0.getCharSequence("androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_" + v1);
                            ibuq.c(charSequence4);
                            Parcelable parcelable5 = bundle0.getParcelable("androidx.credentials.provider.extra.ICON_" + v1);
                            ibuq.c(parcelable5);
                            kvq kvq0 = kvp.a(bundle3, s3);
                            kwn0 = new kxa(charSequence3, bundle0.getCharSequence("androidx.credentials.provider.extra.SUBTITLE_" + v1), charSequence4, ((PendingIntent)parcelable4), ((Icon)parcelable5), ((Instant)bundle0.getSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + v1)), bundle0.getBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + v1, false), kvq0, bundle0.getBoolean("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_" + v1, false), bundle0.getCharSequence("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_ENTRY_GROUP_ID_" + v1), bundle0.getCharSequence("androidx.credentials.provider.extra.CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_" + v1), null, bundle0.getBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_" + v1, false), true, bundle0.getBoolean("androidx.credentials.provider.extra.HAS_DEFAULT_ICON_" + v1, false), 0x800);
                            goto label_60;
                        }
                        catch(Exception unused_ex) {
                        }
                        kwn1 = kvl1;
                        goto label_61;
                    }
                label_60:
                    kwn1 = kwn0;
                label_61:
                    if(kwn1 == null) {
                        arrayList0 = ibps.a;
                        break;
                    }
                    arrayList0 = arrayList0;
                    arrayList0.add(kwn1);
                    ++v1;
                    kvl0 = kvl1;
                    v = v;
                    continue;
                }
            }
            kvl1 = kvl0;
            break;
        }
        ArrayList arrayList1 = new ArrayList();
        int v2 = bundle0.getInt("androidx.credentials.provider.extra.ACTION_SIZE", 0);
        int v3 = 0;
        while(v3 < v2) {
            PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("androidx.credentials.provider.extra.ACTION_PENDING_INTENT_" + v3);
            CharSequence charSequence5 = bundle0.getCharSequence("androidx.credentials.provider.extra.ACTION_TITLE_" + v3);
            CharSequence charSequence6 = bundle0.getCharSequence("androidx.credentials.provider.extra.ACTION_SUBTITLE_" + v3);
            if(pendingIntent0 != null && charSequence5 != null) {
                arrayList1.add(new kuu(charSequence5, pendingIntent0, charSequence6));
                ++v3;
                continue;
            }
            else {
                arrayList1 = ibps.a;
            }
            break;
        }
        ArrayList arrayList2 = new ArrayList();
        int v4 = 0;
        int v5 = bundle0.getInt("androidx.credentials.provider.extra.AUTH_ACTION_SIZE", 0);
        while(v4 < v5) {
            PendingIntent pendingIntent1 = (PendingIntent)bundle0.getParcelable("androidx.credentials.provider.extra.AUTH_ACTION_PENDING_INTENT_" + v4);
            CharSequence charSequence7 = bundle0.getCharSequence("androidx.credentials.provider.extra.AUTH_ACTION_TITLE_" + v4);
            if(pendingIntent1 != null && charSequence7 != null) {
                arrayList2.add(new kuw(charSequence7, pendingIntent1));
                ++v4;
                continue;
            }
            else {
                arrayList2 = ibps.a;
            }
            break;
        }
        kxc kxc0 = kxb.d(bundle0);
        return !arrayList0.isEmpty() || !arrayList1.isEmpty() || !arrayList2.isEmpty() || kxc0 != null ? new kvl(arrayList0, arrayList1, arrayList2, kxc0) : kvl1;
    }
}

