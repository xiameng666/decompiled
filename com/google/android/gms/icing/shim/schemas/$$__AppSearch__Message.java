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
import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class ..__AppSearch__Message implements aeu {
    @Override  // aeu
    public final aes a() {
        aef aef0 = new aef("Message");
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
        aei aei1 = new aei("sender", "Person");
        aei1.c(2);
        aei1.a = false;
        aei1.d(new String[]{"email"});
        aei1.d(new String[]{"name"});
        aei1.d(new String[]{"telephone"});
        aef0.c(aei1.a());
        aei aei2 = new aei("recipient", "Person");
        aei2.c(2);
        aei2.a = false;
        aei2.d(new String[]{"email"});
        aei2.d(new String[]{"name"});
        aei2.d(new String[]{"telephone"});
        aef0.c(aei2.a());
        aeq aeq3 = new aeq("conversationId");
        aeq3.b(2);
        aeq3.e(0);
        aeq3.c(0);
        aeq3.d(1);
        aef0.c(aeq3.a());
        aei aei3 = new aei("isPartOf", "Conversation");
        aei3.c(2);
        aei3.a = false;
        aei3.d(new String[]{"id"});
        aef0.c(aei3.a());
        aeq aeq4 = new aeq("text");
        aeq4.b(2);
        aeq4.e(1);
        aeq4.c(2);
        aeq4.d(0);
        aef0.c(aeq4.a());
        aei aei4 = new aei("messageAttachment", "DigitalDocument");
        aei4.c(1);
        aei4.a = false;
        aei4.d(new String[]{"name"});
        aef0.c(aei4.a());
        aeq aeq5 = new aeq("labels");
        aeq5.b(1);
        aeq5.e(2);
        aeq5.c(1);
        aeq5.d(0);
        aef0.c(aeq5.a());
        aen aen0 = new aen("dateReceived");
        aen0.b(2);
        aen0.c(1);
        aef0.c(aen0.a());
        aeq aeq6 = new aeq("image");
        aeq6.b(2);
        aeq6.e(2);
        aeq6.c(1);
        aeq6.d(0);
        aef0.c(aeq6.a());
        aeq aeq7 = new aeq("participantId");
        aeq7.b(2);
        aeq7.e(0);
        aeq7.c(0);
        aeq7.d(1);
        aef0.c(aeq7.a());
        return aef0.a();
    }

    @Override  // aeu
    public final afa b(Object object0) {
        aez aez0 = new aez(((Message)object0).q, ((Message)object0).p, "Message");
        aez0.b("name", new String[]{((Message)object0).r});
        List list0 = ((Message)object0).b();
        if(list0 != null) {
            aez0.b("keywords", ((String[])list0.toArray(new String[0])));
        }
        List list1 = ((Message)object0).a();
        if(list1 != null) {
            aez0.b("alternateName", ((String[])list1.toArray(new String[0])));
        }
        aez0.a("g3attrinfo", new afa[]{afa.f(((Message)object0).s)});
        Person person0 = ((Message)object0).a;
        if(person0 != null) {
            aez0.a("sender", new afa[]{afa.f(person0)});
        }
        Person person1 = ((Message)object0).b;
        if(person1 != null) {
            aez0.a("recipient", new afa[]{afa.f(person1)});
        }
        aez0.b("conversationId", new String[]{((Message)object0).c});
        Conversation conversation0 = ((Message)object0).d;
        if(conversation0 != null) {
            aez0.a("isPartOf", new afa[]{afa.f(conversation0)});
        }
        aez0.b("text", new String[]{((Message)object0).e});
        List list2 = ((Message)object0).f;
        if(list2 != null) {
            afa[] arr_afa = new afa[list2.size()];
            int v = 0;
            for(Object object1: list2) {
                arr_afa[v] = afa.f(((DigitalDocument)object1));
                ++v;
            }
            aez0.a("messageAttachment", arr_afa);
        }
        List list3 = ((Message)object0).g;
        if(list3 != null) {
            aez0.b("labels", ((String[])list3.toArray(new String[0])));
        }
        aez0.k("dateReceived", new long[]{((Message)object0).h});
        aez0.b("image", new String[]{((Message)object0).i});
        aez0.b("participantId", new String[]{((Message)object0).j});
        return aez0.e();
    }

    @Override  // aeu
    public final Object c(afa afa0, aew aew0) {
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
        afa afa2 = afa0.g("sender");
        Person person0 = afa2 == null ? null : ((Person)afa2.j(Person.class, aew0));
        afa afa3 = afa0.g("recipient");
        Person person1 = afa3 == null ? null : ((Person)afa3.j(Person.class, aew0));
        String[] arr_s3 = afa0.u("conversationId");
        String s3 = arr_s3 == null || arr_s3.length == 0 ? null : arr_s3[0];
        afa afa4 = afa0.g("isPartOf");
        Conversation conversation0 = afa4 == null ? null : ((Conversation)afa4.j(Conversation.class, aew0));
        String[] arr_s4 = afa0.u("text");
        String s4 = arr_s4 == null || arr_s4.length == 0 ? null : arr_s4[0];
        afa[] arr_afa = afa0.t("messageAttachment");
        if(arr_afa == null) {
            arrayList0 = null;
        }
        else {
            arrayList0 = new ArrayList(arr_afa.length);
            int v = 0;
            while(v < arr_afa.length) {
                arrayList0.add(((DigitalDocument)arr_afa[v].j(DigitalDocument.class, aew0)));
                ++v;
                s = s;
            }
        }
        String[] arr_s5 = afa0.u("labels");
        List list2 = arr_s5 == null ? null : Arrays.asList(arr_s5);
        long v1 = afa0.d("dateReceived");
        String[] arr_s6 = afa0.u("image");
        String s5 = arr_s6 == null || arr_s6.length == 0 ? null : arr_s6[0];
        String[] arr_s7 = afa0.u("participantId");
        return arr_s7 == null || arr_s7.length == 0 ? new Message(s1, s, s2, list0, list1, person0, person1, s3, conversation0, s4, arrayList0, list2, v1, s5, null, g3AttributionInfo0) : new Message(s1, s, s2, list0, list1, person0, person1, s3, conversation0, s4, arrayList0, list2, v1, s5, arr_s7[0], g3AttributionInfo0);
    }

    @Override  // aeu
    public final String d() {
        return "Message";
    }

    @Override  // aeu
    public final List e() {
        List list0 = new ArrayList();
        list0.add(G3AttributionInfo.class);
        list0.add(Person.class);
        list0.add(Conversation.class);
        list0.add(DigitalDocument.class);
        return list0;
    }
}

