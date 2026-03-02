package com.google.android.gms.icing.shim.schemas;

import aef;
import aei;
import aen;
import aeq;
import aes;
import aeu;
import aew;
import aez;
import afa;
import androidx.appsearch.builtintypes.Account;
import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ..__AppSearch__EmailMessage implements aeu {
    @Override  // aeu
    public final aes a() {
        aef aef0 = new aef("EmailMessage");
        aeq aeq0 = new aeq("name");
        aeq0.b(2);
        aeq0.e(1);
        aeq0.c(2);
        aeq0.d(0);
        aef0.c(aeq0.a());
        aeq aeq1 = new aeq("keywords");
        aeq1.b(1);
        aeq1.e(2);
        aeq1.c(1);
        aeq1.d(0);
        aef0.c(aeq1.a());
        aeq aeq2 = new aeq("alternateName");
        aeq2.b(1);
        aeq2.e(1);
        aeq2.c(2);
        aeq2.d(0);
        aef0.c(aeq2.a());
        aei aei0 = new aei("g3attrinfo", "G3AttributionInfo");
        aei0.c(2);
        aei0.a = true;
        aef0.c(aei0.a());
        aeq aeq3 = new aeq("text");
        aeq3.b(2);
        aeq3.e(1);
        aeq3.c(2);
        aeq3.d(0);
        aef0.c(aeq3.a());
        aei aei1 = new aei("sender", "Person");
        aei1.c(2);
        aei1.a = false;
        aei1.d(new String[]{"email"});
        aei1.d(new String[]{"name"});
        aef0.c(aei1.a());
        aei aei2 = new aei("recipient", "Person");
        aei2.c(1);
        aei2.a = false;
        aei2.d(new String[]{"email"});
        aei2.d(new String[]{"name"});
        aef0.c(aei2.a());
        aei aei3 = new aei("cc", "Person");
        aei3.c(1);
        aei3.a = false;
        aei3.d(new String[]{"email"});
        aei3.d(new String[]{"name"});
        aef0.c(aei3.a());
        aei aei4 = new aei("bcc", "Person");
        aei4.c(1);
        aei4.a = false;
        aei4.d(new String[]{"email"});
        aei4.d(new String[]{"name"});
        aef0.c(aei4.a());
        aei aei5 = new aei("isPartOf", "Conversation");
        aei5.c(2);
        aei5.a = false;
        aei5.d(new String[]{"id"});
        aef0.c(aei5.a());
        aen aen0 = new aen("dateReceived");
        aen0.b(2);
        aen0.c(1);
        aef0.c(aen0.a());
        aei aei6 = new aei("messageAttachment", "DigitalDocument");
        aei6.c(1);
        aei6.a = false;
        aei6.d(new String[]{"name"});
        aef0.c(aei6.a());
        aeq aeq4 = new aeq("labels");
        aeq4.b(1);
        aeq4.e(2);
        aeq4.c(1);
        aeq4.d(0);
        aef0.c(aeq4.a());
        aei aei7 = new aei("about", "ExtractedEntity");
        aei7.c(1);
        aei7.a = true;
        aef0.c(aei7.a());
        aeq aeq5 = new aeq("messageLabels");
        aeq5.b(1);
        aeq5.e(0);
        aeq5.c(0);
        aeq5.d(0);
        aef0.c(aeq5.a());
        aeq aeq6 = new aeq("bodyHtml");
        aeq6.b(2);
        aeq6.e(0);
        aeq6.c(0);
        aeq6.d(0);
        aef0.c(aeq6.a());
        aei aei8 = new aei("account", "builtin:Account");
        aei8.c(2);
        aei8.a = true;
        aef0.c(aei8.a());
        return aef0.a();
    }

    @Override  // aeu
    public final afa b(Object object0) {
        aez aez0 = new aez(((EmailMessage)object0).q, ((EmailMessage)object0).p, "EmailMessage");
        aez0.b("name", new String[]{((EmailMessage)object0).r});
        List list0 = ((EmailMessage)object0).b();
        if(list0 != null) {
            aez0.b("keywords", ((String[])list0.toArray(new String[0])));
        }
        List list1 = ((EmailMessage)object0).a();
        if(list1 != null) {
            aez0.b("alternateName", ((String[])list1.toArray(new String[0])));
        }
        aez0.a("g3attrinfo", new afa[]{afa.f(((EmailMessage)object0).s)});
        aez0.b("text", new String[]{((EmailMessage)object0).a});
        Person person0 = ((EmailMessage)object0).b;
        if(person0 != null) {
            aez0.a("sender", new afa[]{afa.f(person0)});
        }
        List list2 = ((EmailMessage)object0).c;
        if(list2 != null) {
            afa[] arr_afa = new afa[list2.size()];
            int v = 0;
            for(Object object1: list2) {
                arr_afa[v] = afa.f(((Person)object1));
                ++v;
            }
            aez0.a("recipient", arr_afa);
        }
        List list3 = ((EmailMessage)object0).d;
        if(list3 != null) {
            afa[] arr_afa1 = new afa[list3.size()];
            int v1 = 0;
            for(Object object2: list3) {
                arr_afa1[v1] = afa.f(((Person)object2));
                ++v1;
            }
            aez0.a("cc", arr_afa1);
        }
        List list4 = ((EmailMessage)object0).e;
        if(list4 != null) {
            afa[] arr_afa2 = new afa[list4.size()];
            int v2 = 0;
            for(Object object3: list4) {
                arr_afa2[v2] = afa.f(((Person)object3));
                ++v2;
            }
            aez0.a("bcc", arr_afa2);
        }
        Conversation conversation0 = ((EmailMessage)object0).f;
        if(conversation0 != null) {
            aez0.a("isPartOf", new afa[]{afa.f(conversation0)});
        }
        aez0.k("dateReceived", new long[]{((EmailMessage)object0).g});
        List list5 = ((EmailMessage)object0).h;
        if(list5 != null) {
            afa[] arr_afa3 = new afa[list5.size()];
            int v3 = 0;
            for(Object object4: list5) {
                arr_afa3[v3] = afa.f(((DigitalDocument)object4));
                ++v3;
            }
            aez0.a("messageAttachment", arr_afa3);
        }
        List list6 = ((EmailMessage)object0).i;
        if(list6 != null) {
            aez0.b("labels", ((String[])list6.toArray(new String[0])));
        }
        List list7 = ((EmailMessage)object0).j;
        if(list7 != null) {
            afa[] arr_afa4 = new afa[list7.size()];
            int v4 = 0;
            for(Object object5: list7) {
                arr_afa4[v4] = afa.f(((ExtractedEntity)object5));
                ++v4;
            }
            aez0.a("about", arr_afa4);
        }
        List list8 = ((EmailMessage)object0).k;
        if(list8 != null) {
            aez0.b("messageLabels", ((String[])list8.toArray(new String[0])));
        }
        aez0.b("bodyHtml", new String[]{((EmailMessage)object0).l});
        Account account0 = ((EmailMessage)object0).m;
        if(account0 != null) {
            aez0.a("account", new afa[]{afa.f(account0)});
        }
        return aez0.e();
    }

    @Override  // aeu
    public final Object c(afa afa0, aew aew0) {
        List list3;
        ArrayList arrayList5;
        ArrayList arrayList4;
        String s6;
        ArrayList arrayList3;
        String s5;
        String s4;
        ArrayList arrayList2;
        ArrayList arrayList1;
        ArrayList arrayList0;
        String s = afa0.k();
        String s1 = afa0.l();
        String[] arr_s = afa0.u("name");
        String s2 = arr_s == null || arr_s.length == 0 ? null : arr_s[0];
        String[] arr_s1 = afa0.u("keywords");
        List list0 = arr_s1 == null ? null : Arrays.asList(arr_s1);
        String[] arr_s2 = afa0.u("alternateName");
        List list1 = arr_s2 == null ? null : Arrays.asList(arr_s2);
        afa afa1 = afa0.g("g3attrinfo");
        G3AttributionInfo g3AttributionInfo0 = afa1 == null ? null : ((G3AttributionInfo)afa1.j(G3AttributionInfo.class, aew0));
        String[] arr_s3 = afa0.u("text");
        String s3 = arr_s3 == null || arr_s3.length == 0 ? null : arr_s3[0];
        afa afa2 = afa0.g("sender");
        Person person0 = afa2 == null ? null : ((Person)afa2.j(Person.class, aew0));
        afa[] arr_afa = afa0.t("recipient");
        if(arr_afa == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList(arr_afa.length);
            for(int v = 0; v < arr_afa.length; ++v) {
                arrayList0.add(((Person)arr_afa[v].j(Person.class, aew0)));
            }
        }
        afa[] arr_afa1 = afa0.t("cc");
        if(arr_afa1 == null) {
            arrayList1 = null;
        }
        else {
            arrayList1 = new ArrayList(arr_afa1.length);
            for(int v1 = 0; v1 < arr_afa1.length; ++v1) {
                arrayList1.add(((Person)arr_afa1[v1].j(Person.class, aew0)));
            }
        }
        afa[] arr_afa2 = afa0.t("bcc");
        if(arr_afa2 == null) {
            arrayList2 = null;
        }
        else {
            arrayList2 = new ArrayList(arr_afa2.length);
            for(int v2 = 0; v2 < arr_afa2.length; ++v2) {
                arrayList2.add(((Person)arr_afa2[v2].j(Person.class, aew0)));
            }
        }
        afa afa3 = afa0.g("isPartOf");
        Conversation conversation0 = afa3 == null ? null : ((Conversation)afa3.j(Conversation.class, aew0));
        long v3 = afa0.d("dateReceived");
        afa[] arr_afa3 = afa0.t("messageAttachment");
        if(arr_afa3 == null) {
            s4 = s;
            s5 = s1;
            s6 = s2;
            arrayList3 = null;
        }
        else {
            s4 = s;
            s5 = s1;
            arrayList3 = new ArrayList(arr_afa3.length);
            s6 = s2;
            for(int v4 = 0; v4 < arr_afa3.length; ++v4) {
                arrayList3.add(((DigitalDocument)arr_afa3[v4].j(DigitalDocument.class, aew0)));
            }
        }
        String[] arr_s4 = afa0.u("labels");
        List list2 = arr_s4 == null ? null : Arrays.asList(arr_s4);
        afa[] arr_afa4 = afa0.t("about");
        if(arr_afa4 == null) {
            arrayList4 = arrayList3;
            list3 = list2;
            arrayList5 = null;
        }
        else {
            arrayList4 = arrayList3;
            arrayList5 = new ArrayList(arr_afa4.length);
            list3 = list2;
            for(int v5 = 0; v5 < arr_afa4.length; ++v5) {
                arrayList5.add(((ExtractedEntity)arr_afa4[v5].j(ExtractedEntity.class, aew0)));
            }
        }
        String[] arr_s5 = afa0.u("messageLabels");
        List list4 = arr_s5 == null ? null : Arrays.asList(arr_s5);
        String[] arr_s6 = afa0.u("bodyHtml");
        String s7 = arr_s6 == null || arr_s6.length == 0 ? null : arr_s6[0];
        afa afa4 = afa0.g("account");
        return afa4 == null ? new EmailMessage(s5, s4, s6, list0, list1, s3, person0, arrayList0, arrayList1, arrayList2, conversation0, v3, arrayList4, list3, arrayList5, list4, s7, null, g3AttributionInfo0) : new EmailMessage(s5, s4, s6, list0, list1, s3, person0, arrayList0, arrayList1, arrayList2, conversation0, v3, arrayList4, list3, arrayList5, list4, s7, ((Account)afa4.j(Account.class, aew0)), g3AttributionInfo0);
    }

    @Override  // aeu
    public final String d() {
        return "EmailMessage";
    }

    @Override  // aeu
    public final List e() {
        List list0 = new ArrayList();
        list0.add(G3AttributionInfo.class);
        list0.add(Person.class);
        list0.add(Conversation.class);
        list0.add(DigitalDocument.class);
        list0.add(ExtractedEntity.class);
        list0.add(Account.class);
        return list0;
    }
}

