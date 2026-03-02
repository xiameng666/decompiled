package com.google.android.gms.icing.shim.schemas;

import aef;
import aei;
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

public final class ..__AppSearch__DigitalDocument implements aeu {
    @Override  // aeu
    public final aes a() {
        aef aef0 = new aef("DigitalDocument");
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
        aei aei1 = new aei("isPartOf", "Conversation");
        aei1.c(2);
        aei1.a = false;
        aei1.d(new String[]{"id"});
        aef0.c(aei1.a());
        aeq aeq3 = new aeq("text");
        aeq3.b(2);
        aeq3.e(1);
        aeq3.c(2);
        aeq3.d(0);
        aef0.c(aeq3.a());
        aei aei2 = new aei("author", "Person");
        aei2.c(2);
        aei2.a = false;
        aei2.d(new String[]{"email"});
        aei2.d(new String[]{"name"});
        aef0.c(aei2.a());
        aeq aeq4 = new aeq("annotationId");
        aeq4.b(2);
        aeq4.e(0);
        aeq4.c(0);
        aeq4.d(0);
        aef0.c(aeq4.a());
        aeq aeq5 = new aeq("messageId");
        aeq5.b(2);
        aeq5.e(0);
        aeq5.c(0);
        aeq5.d(0);
        aef0.c(aeq5.a());
        aeq aeq6 = new aeq("conversationId");
        aeq6.b(2);
        aeq6.e(0);
        aeq6.c(0);
        aeq6.d(0);
        aef0.c(aeq6.a());
        return aef0.a();
    }

    @Override  // aeu
    public final afa b(Object object0) {
        aez aez0 = new aez(((DigitalDocument)object0).q, ((DigitalDocument)object0).p, "DigitalDocument");
        aez0.b("name", new String[]{((DigitalDocument)object0).r});
        List list0 = ((DigitalDocument)object0).b();
        if(list0 != null) {
            aez0.b("keywords", ((String[])list0.toArray(new String[0])));
        }
        List list1 = ((DigitalDocument)object0).a();
        if(list1 != null) {
            aez0.b("alternateName", ((String[])list1.toArray(new String[0])));
        }
        aez0.a("g3attrinfo", new afa[]{afa.f(((DigitalDocument)object0).s)});
        Conversation conversation0 = ((DigitalDocument)object0).a;
        if(conversation0 != null) {
            aez0.a("isPartOf", new afa[]{afa.f(conversation0)});
        }
        aez0.b("text", new String[]{((DigitalDocument)object0).b});
        Person person0 = ((DigitalDocument)object0).c;
        if(person0 != null) {
            aez0.a("author", new afa[]{afa.f(person0)});
        }
        aez0.b("annotationId", new String[]{((DigitalDocument)object0).d});
        aez0.b("messageId", new String[]{((DigitalDocument)object0).e});
        aez0.b("conversationId", new String[]{((DigitalDocument)object0).f});
        return aez0.e();
    }

    @Override  // aeu
    public final Object c(afa afa0, aew aew0) {
        String s = afa0.k();
        String s1 = afa0.l();
        String[] arr_s = afa0.u("name");
        String s2 = null;
        String s3 = arr_s == null || arr_s.length == 0 ? null : arr_s[0];
        String[] arr_s1 = afa0.u("keywords");
        List list0 = arr_s1 == null ? null : Arrays.asList(arr_s1);
        String[] arr_s2 = afa0.u("alternateName");
        List list1 = arr_s2 == null ? null : Arrays.asList(arr_s2);
        afa afa1 = afa0.g("g3attrinfo");
        G3AttributionInfo g3AttributionInfo0 = afa1 == null ? null : ((G3AttributionInfo)afa1.j(G3AttributionInfo.class, aew0));
        afa afa2 = afa0.g("isPartOf");
        Conversation conversation0 = afa2 == null ? null : ((Conversation)afa2.j(Conversation.class, aew0));
        String[] arr_s3 = afa0.u("text");
        String s4 = arr_s3 == null || arr_s3.length == 0 ? null : arr_s3[0];
        afa afa3 = afa0.g("author");
        Person person0 = afa3 == null ? null : ((Person)afa3.j(Person.class, aew0));
        String[] arr_s4 = afa0.u("annotationId");
        String s5 = arr_s4 == null || arr_s4.length == 0 ? null : arr_s4[0];
        String[] arr_s5 = afa0.u("messageId");
        String s6 = arr_s5 == null || arr_s5.length == 0 ? null : arr_s5[0];
        String[] arr_s6 = afa0.u("conversationId");
        if(arr_s6 != null && arr_s6.length != 0) {
            s2 = arr_s6[0];
        }
        return new DigitalDocument(s1, s, s3, list0, list1, conversation0, s4, person0, s5, s6, s2, g3AttributionInfo0);
    }

    @Override  // aeu
    public final String d() {
        return "DigitalDocument";
    }

    @Override  // aeu
    public final List e() {
        List list0 = new ArrayList();
        list0.add(G3AttributionInfo.class);
        list0.add(Conversation.class);
        list0.add(Person.class);
        return list0;
    }
}

