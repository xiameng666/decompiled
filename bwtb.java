import java.util.concurrent.TimeUnit;

public final class bwtb {
    private final bwql a;

    public bwtb() {
        this.a = (bwql)((ProtoLiteMessage)bwqm.a).v_newBuilder();
    }

    public final bwqm a() {
        return (bwqm)((ProtoLiteBuilder)this.a).N_build();
    }

    public final void b(int v, int v1, int v2) {
        bwqk bwqk0 = bwqk.a;
        bwqg bwqg0 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg0).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg0.b_message), "Thing");
        if(!bwqg0.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg0).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg0.b_message), 7);
        bwqj bwqj0 = bwqj.a;
        ProtoLiteBuilder hftp0 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwqj.c(((bwqj)hftp0.b_message), "name");
        if(!hftp0.b_message.isImmutable()) {
            hftp0.ensureMutable();
        }
        bwqj.f(((bwqj)hftp0.b_message), 3);
        bwqg0.a(hftp0);
        ProtoLiteBuilder hftp1 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp1.b_message.isImmutable()) {
            hftp1.ensureMutable();
        }
        bwqj.c(((bwqj)hftp1.b_message), "keywords");
        bwqg0.a(hftp1);
        ProtoLiteBuilder hftp2 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp2.b_message.isImmutable()) {
            hftp2.ensureMutable();
        }
        bwqj.c(((bwqj)hftp2.b_message), "alternateName");
        bwqg0.a(hftp2);
        ProtoLiteBuilder hftp3 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        bwqj.c(((bwqj)hftp3.b_message), "isPartOf_id");
        if(!hftp3.b_message.isImmutable()) {
            hftp3.ensureMutable();
        }
        bwql bwql0 = this.a;
        bwqj.b(((bwqj)hftp3.b_message), "verbatim");
        bwqg0.a(hftp3);
        bwql0.k(bwqg0);
        bwqg bwqg1 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg1).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg1.b_message), "Action");
        if(!bwqg1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg1).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg1.b_message), 1);
        ProtoLiteBuilder hftp4 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        bwqj.c(((bwqj)hftp4.b_message), "name");
        if(!hftp4.b_message.isImmutable()) {
            hftp4.ensureMutable();
        }
        bwqj.f(((bwqj)hftp4.b_message), 3);
        bwqg1.a(hftp4);
        ProtoLiteBuilder hftp5 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp5.b_message.isImmutable()) {
            hftp5.ensureMutable();
        }
        bwqj.c(((bwqj)hftp5.b_message), "keywords");
        bwqg1.a(hftp5);
        ProtoLiteBuilder hftp6 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        bwqj.c(((bwqj)hftp6.b_message), "additionalType");
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        bwqj.f(((bwqj)hftp6.b_message), 2);
        if(!hftp6.b_message.isImmutable()) {
            hftp6.ensureMutable();
        }
        bwqj.b(((bwqj)hftp6.b_message), "verbatim");
        bwqg1.a(hftp6);
        ProtoLiteBuilder hftp7 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        bwqj.c(((bwqj)hftp7.b_message), "actionStatus");
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        bwqj.f(((bwqj)hftp7.b_message), 2);
        if(!hftp7.b_message.isImmutable()) {
            hftp7.ensureMutable();
        }
        bwqj.b(((bwqj)hftp7.b_message), "verbatim");
        bwqg1.a(hftp7);
        bwql0.k(bwqg1);
        bwqg bwqg2 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg2.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg2).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg2.b_message), "DigitalDocumentPermission");
        if(!bwqg2.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg2).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg2.b_message), 7);
        ProtoLiteBuilder hftp8 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp8.b_message.isImmutable()) {
            hftp8.ensureMutable();
        }
        bwqj.c(((bwqj)hftp8.b_message), "name");
        if(!hftp8.b_message.isImmutable()) {
            hftp8.ensureMutable();
        }
        bwqj.f(((bwqj)hftp8.b_message), 3);
        bwqg2.a(hftp8);
        ProtoLiteBuilder hftp9 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp9.b_message.isImmutable()) {
            hftp9.ensureMutable();
        }
        bwqj.c(((bwqj)hftp9.b_message), "keywords");
        bwqg2.a(hftp9);
        bwql0.k(bwqg2);
        bwqg bwqg3 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg3.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg3).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg3.b_message), "DigitalDocument");
        if(!bwqg3.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg3).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg3.b_message), 7);
        ProtoLiteBuilder hftp10 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp10.b_message.isImmutable()) {
            hftp10.ensureMutable();
        }
        bwqj.c(((bwqj)hftp10.b_message), "name");
        if(!hftp10.b_message.isImmutable()) {
            hftp10.ensureMutable();
        }
        bwqj.f(((bwqj)hftp10.b_message), 3);
        bwqg3.a(hftp10);
        ProtoLiteBuilder hftp11 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp11.b_message.isImmutable()) {
            hftp11.ensureMutable();
        }
        bwqj.c(((bwqj)hftp11.b_message), "keywords");
        bwqg3.a(hftp11);
        ProtoLiteBuilder hftp12 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp12.b_message.isImmutable()) {
            hftp12.ensureMutable();
        }
        bwqj.c(((bwqj)hftp12.b_message), "alternateName");
        bwqg3.a(hftp12);
        ProtoLiteBuilder hftp13 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp13.b_message.isImmutable()) {
            hftp13.ensureMutable();
        }
        bwqj.c(((bwqj)hftp13.b_message), "isPartOf_id");
        if(!hftp13.b_message.isImmutable()) {
            hftp13.ensureMutable();
        }
        bwqj.b(((bwqj)hftp13.b_message), "verbatim");
        bwqg3.a(hftp13);
        ProtoLiteBuilder hftp14 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        bwqj.c(((bwqj)hftp14.b_message), "text");
        if(!hftp14.b_message.isImmutable()) {
            hftp14.ensureMutable();
        }
        bwqj.f(((bwqj)hftp14.b_message), 2);
        bwqg3.a(hftp14);
        ProtoLiteBuilder hftp15 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp15.b_message.isImmutable()) {
            hftp15.ensureMutable();
        }
        bwqj.c(((bwqj)hftp15.b_message), "author_email");
        if(!hftp15.b_message.isImmutable()) {
            hftp15.ensureMutable();
        }
        bwqj.b(((bwqj)hftp15.b_message), "rfc822");
        bwqg3.a(hftp15);
        ProtoLiteBuilder hftp16 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp16.b_message.isImmutable()) {
            hftp16.ensureMutable();
        }
        bwqj.c(((bwqj)hftp16.b_message), "author_name");
        bwqg3.a(hftp16);
        bwql0.k(bwqg3);
        bwqg bwqg4 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg4.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg4).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg4.b_message), "PresentationDigitalDocument");
        if(!bwqg4.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg4).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg4.b_message), 7);
        ProtoLiteBuilder hftp17 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp17.b_message.isImmutable()) {
            hftp17.ensureMutable();
        }
        bwqj.c(((bwqj)hftp17.b_message), "name");
        if(!hftp17.b_message.isImmutable()) {
            hftp17.ensureMutable();
        }
        bwqj.f(((bwqj)hftp17.b_message), 3);
        bwqg4.a(hftp17);
        ProtoLiteBuilder hftp18 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp18.b_message.isImmutable()) {
            hftp18.ensureMutable();
        }
        bwqj.c(((bwqj)hftp18.b_message), "keywords");
        bwqg4.a(hftp18);
        ProtoLiteBuilder hftp19 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp19.b_message.isImmutable()) {
            hftp19.ensureMutable();
        }
        bwqj.c(((bwqj)hftp19.b_message), "alternateName");
        bwqg4.a(hftp19);
        ProtoLiteBuilder hftp20 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp20.b_message.isImmutable()) {
            hftp20.ensureMutable();
        }
        bwqj.c(((bwqj)hftp20.b_message), "isPartOf_id");
        if(!hftp20.b_message.isImmutable()) {
            hftp20.ensureMutable();
        }
        bwqj.b(((bwqj)hftp20.b_message), "verbatim");
        bwqg4.a(hftp20);
        ProtoLiteBuilder hftp21 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp21.b_message.isImmutable()) {
            hftp21.ensureMutable();
        }
        bwqj.c(((bwqj)hftp21.b_message), "text");
        if(!hftp21.b_message.isImmutable()) {
            hftp21.ensureMutable();
        }
        bwqj.f(((bwqj)hftp21.b_message), 2);
        bwqg4.a(hftp21);
        ProtoLiteBuilder hftp22 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp22.b_message.isImmutable()) {
            hftp22.ensureMutable();
        }
        bwqj.c(((bwqj)hftp22.b_message), "author_email");
        if(!hftp22.b_message.isImmutable()) {
            hftp22.ensureMutable();
        }
        bwqj.b(((bwqj)hftp22.b_message), "rfc822");
        bwqg4.a(hftp22);
        ProtoLiteBuilder hftp23 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp23.b_message.isImmutable()) {
            hftp23.ensureMutable();
        }
        bwqj.c(((bwqj)hftp23.b_message), "author_name");
        bwqg4.a(hftp23);
        bwql0.k(bwqg4);
        bwqg bwqg5 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg5.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg5).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg5.b_message), "NoteDigitalDocument");
        if(!bwqg5.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg5).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg5.b_message), 7);
        ProtoLiteBuilder hftp24 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp24.b_message.isImmutable()) {
            hftp24.ensureMutable();
        }
        bwqj.c(((bwqj)hftp24.b_message), "name");
        if(!hftp24.b_message.isImmutable()) {
            hftp24.ensureMutable();
        }
        bwqj.f(((bwqj)hftp24.b_message), 3);
        bwqg5.a(hftp24);
        ProtoLiteBuilder hftp25 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp25.b_message.isImmutable()) {
            hftp25.ensureMutable();
        }
        bwqj.c(((bwqj)hftp25.b_message), "keywords");
        bwqg5.a(hftp25);
        ProtoLiteBuilder hftp26 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp26.b_message.isImmutable()) {
            hftp26.ensureMutable();
        }
        bwqj.c(((bwqj)hftp26.b_message), "alternateName");
        bwqg5.a(hftp26);
        ProtoLiteBuilder hftp27 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp27.b_message.isImmutable()) {
            hftp27.ensureMutable();
        }
        bwqj.c(((bwqj)hftp27.b_message), "isPartOf_id");
        if(!hftp27.b_message.isImmutable()) {
            hftp27.ensureMutable();
        }
        bwqj.b(((bwqj)hftp27.b_message), "verbatim");
        bwqg5.a(hftp27);
        ProtoLiteBuilder hftp28 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp28.b_message.isImmutable()) {
            hftp28.ensureMutable();
        }
        bwqj.c(((bwqj)hftp28.b_message), "text");
        if(!hftp28.b_message.isImmutable()) {
            hftp28.ensureMutable();
        }
        bwqj.f(((bwqj)hftp28.b_message), 2);
        bwqg5.a(hftp28);
        ProtoLiteBuilder hftp29 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp29.b_message.isImmutable()) {
            hftp29.ensureMutable();
        }
        bwqj.c(((bwqj)hftp29.b_message), "author_email");
        if(!hftp29.b_message.isImmutable()) {
            hftp29.ensureMutable();
        }
        bwqj.b(((bwqj)hftp29.b_message), "rfc822");
        bwqg5.a(hftp29);
        ProtoLiteBuilder hftp30 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp30.b_message.isImmutable()) {
            hftp30.ensureMutable();
        }
        bwqj.c(((bwqj)hftp30.b_message), "author_name");
        bwqg5.a(hftp30);
        bwql0.k(bwqg5);
        bwqg bwqg6 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg6.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg6).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg6.b_message), "TextDigitalDocument");
        if(!bwqg6.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg6).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg6.b_message), 7);
        ProtoLiteBuilder hftp31 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp31.b_message.isImmutable()) {
            hftp31.ensureMutable();
        }
        bwqj.c(((bwqj)hftp31.b_message), "name");
        if(!hftp31.b_message.isImmutable()) {
            hftp31.ensureMutable();
        }
        bwqj.f(((bwqj)hftp31.b_message), 3);
        bwqg6.a(hftp31);
        ProtoLiteBuilder hftp32 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp32.b_message.isImmutable()) {
            hftp32.ensureMutable();
        }
        bwqj.c(((bwqj)hftp32.b_message), "keywords");
        bwqg6.a(hftp32);
        ProtoLiteBuilder hftp33 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp33.b_message.isImmutable()) {
            hftp33.ensureMutable();
        }
        bwqj.c(((bwqj)hftp33.b_message), "alternateName");
        bwqg6.a(hftp33);
        ProtoLiteBuilder hftp34 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp34.b_message.isImmutable()) {
            hftp34.ensureMutable();
        }
        bwqj.c(((bwqj)hftp34.b_message), "isPartOf_id");
        if(!hftp34.b_message.isImmutable()) {
            hftp34.ensureMutable();
        }
        bwqj.b(((bwqj)hftp34.b_message), "verbatim");
        bwqg6.a(hftp34);
        ProtoLiteBuilder hftp35 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp35.b_message.isImmutable()) {
            hftp35.ensureMutable();
        }
        bwqj.c(((bwqj)hftp35.b_message), "text");
        if(!hftp35.b_message.isImmutable()) {
            hftp35.ensureMutable();
        }
        bwqj.f(((bwqj)hftp35.b_message), 2);
        bwqg6.a(hftp35);
        ProtoLiteBuilder hftp36 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp36.b_message.isImmutable()) {
            hftp36.ensureMutable();
        }
        bwqj.c(((bwqj)hftp36.b_message), "author_email");
        if(!hftp36.b_message.isImmutable()) {
            hftp36.ensureMutable();
        }
        bwqj.b(((bwqj)hftp36.b_message), "rfc822");
        bwqg6.a(hftp36);
        ProtoLiteBuilder hftp37 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp37.b_message.isImmutable()) {
            hftp37.ensureMutable();
        }
        bwqj.c(((bwqj)hftp37.b_message), "author_name");
        bwqg6.a(hftp37);
        bwql0.k(bwqg6);
        bwqg bwqg7 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg7.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg7).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg7.b_message), "SpreadsheetDigitalDocument");
        if(!bwqg7.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg7).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg7.b_message), 7);
        ProtoLiteBuilder hftp38 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp38.b_message.isImmutable()) {
            hftp38.ensureMutable();
        }
        bwqj.c(((bwqj)hftp38.b_message), "name");
        if(!hftp38.b_message.isImmutable()) {
            hftp38.ensureMutable();
        }
        bwqj.f(((bwqj)hftp38.b_message), 3);
        bwqg7.a(hftp38);
        ProtoLiteBuilder hftp39 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp39.b_message.isImmutable()) {
            hftp39.ensureMutable();
        }
        bwqj.c(((bwqj)hftp39.b_message), "keywords");
        bwqg7.a(hftp39);
        ProtoLiteBuilder hftp40 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp40.b_message.isImmutable()) {
            hftp40.ensureMutable();
        }
        bwqj.c(((bwqj)hftp40.b_message), "alternateName");
        bwqg7.a(hftp40);
        ProtoLiteBuilder hftp41 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp41.b_message.isImmutable()) {
            hftp41.ensureMutable();
        }
        bwqj.c(((bwqj)hftp41.b_message), "isPartOf_id");
        if(!hftp41.b_message.isImmutable()) {
            hftp41.ensureMutable();
        }
        bwqj.b(((bwqj)hftp41.b_message), "verbatim");
        bwqg7.a(hftp41);
        ProtoLiteBuilder hftp42 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp42.b_message.isImmutable()) {
            hftp42.ensureMutable();
        }
        bwqj.c(((bwqj)hftp42.b_message), "text");
        if(!hftp42.b_message.isImmutable()) {
            hftp42.ensureMutable();
        }
        bwqj.f(((bwqj)hftp42.b_message), 2);
        bwqg7.a(hftp42);
        ProtoLiteBuilder hftp43 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp43.b_message.isImmutable()) {
            hftp43.ensureMutable();
        }
        bwqj.c(((bwqj)hftp43.b_message), "author_email");
        if(!hftp43.b_message.isImmutable()) {
            hftp43.ensureMutable();
        }
        bwqj.b(((bwqj)hftp43.b_message), "rfc822");
        bwqg7.a(hftp43);
        ProtoLiteBuilder hftp44 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp44.b_message.isImmutable()) {
            hftp44.ensureMutable();
        }
        bwqj.c(((bwqj)hftp44.b_message), "author_name");
        bwqg7.a(hftp44);
        bwql0.k(bwqg7);
        bwqg bwqg8 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg8.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg8).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg8.b_message), "Conversation");
        if(!bwqg8.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg8).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg8.b_message), 7);
        ProtoLiteBuilder hftp45 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp45.b_message.isImmutable()) {
            hftp45.ensureMutable();
        }
        bwqj.c(((bwqj)hftp45.b_message), "name");
        if(!hftp45.b_message.isImmutable()) {
            hftp45.ensureMutable();
        }
        bwqj.f(((bwqj)hftp45.b_message), 3);
        bwqg8.a(hftp45);
        ProtoLiteBuilder hftp46 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp46.b_message.isImmutable()) {
            hftp46.ensureMutable();
        }
        bwqj.c(((bwqj)hftp46.b_message), "keywords");
        bwqg8.a(hftp46);
        bwql0.k(bwqg8);
        bwqg bwqg9 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg9.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg9).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg9.b_message), "EmailMessage");
        if(!bwqg9.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg9).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg9.b_message), 7);
        ProtoLiteBuilder hftp47 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp47.b_message.isImmutable()) {
            hftp47.ensureMutable();
        }
        bwqj.c(((bwqj)hftp47.b_message), "name");
        if(!hftp47.b_message.isImmutable()) {
            hftp47.ensureMutable();
        }
        bwqj.f(((bwqj)hftp47.b_message), 3);
        bwqg9.a(hftp47);
        ProtoLiteBuilder hftp48 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp48.b_message.isImmutable()) {
            hftp48.ensureMutable();
        }
        bwqj.c(((bwqj)hftp48.b_message), "keywords");
        bwqg9.a(hftp48);
        ProtoLiteBuilder hftp49 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp49.b_message.isImmutable()) {
            hftp49.ensureMutable();
        }
        bwqj.c(((bwqj)hftp49.b_message), "text");
        if(!hftp49.b_message.isImmutable()) {
            hftp49.ensureMutable();
        }
        bwqj.f(((bwqj)hftp49.b_message), 2);
        bwqg9.a(hftp49);
        ProtoLiteBuilder hftp50 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp50.b_message.isImmutable()) {
            hftp50.ensureMutable();
        }
        bwqj.c(((bwqj)hftp50.b_message), "sender_name");
        if(!hftp50.b_message.isImmutable()) {
            hftp50.ensureMutable();
        }
        bwqj.f(((bwqj)hftp50.b_message), 2);
        bwqg9.a(hftp50);
        ProtoLiteBuilder hftp51 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp51.b_message.isImmutable()) {
            hftp51.ensureMutable();
        }
        bwqj.c(((bwqj)hftp51.b_message), "sender_email");
        if(!hftp51.b_message.isImmutable()) {
            hftp51.ensureMutable();
        }
        bwqj.f(((bwqj)hftp51.b_message), 2);
        if(!hftp51.b_message.isImmutable()) {
            hftp51.ensureMutable();
        }
        bwqj.b(((bwqj)hftp51.b_message), "rfc822");
        bwqg9.a(hftp51);
        ProtoLiteBuilder hftp52 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp52.b_message.isImmutable()) {
            hftp52.ensureMutable();
        }
        bwqj.c(((bwqj)hftp52.b_message), "recipient_name");
        bwqg9.a(hftp52);
        ProtoLiteBuilder hftp53 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp53.b_message.isImmutable()) {
            hftp53.ensureMutable();
        }
        bwqj.c(((bwqj)hftp53.b_message), "recipient_email");
        if(!hftp53.b_message.isImmutable()) {
            hftp53.ensureMutable();
        }
        bwqj.b(((bwqj)hftp53.b_message), "rfc822");
        bwqg9.a(hftp53);
        ProtoLiteBuilder hftp54 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp54.b_message.isImmutable()) {
            hftp54.ensureMutable();
        }
        bwqj.c(((bwqj)hftp54.b_message), "messageAttachment_name");
        bwqg9.a(hftp54);
        ProtoLiteBuilder hftp55 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp55.b_message.isImmutable()) {
            hftp55.ensureMutable();
        }
        bwqj.c(((bwqj)hftp55.b_message), "bcc_name");
        bwqg9.a(hftp55);
        ProtoLiteBuilder hftp56 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp56.b_message.isImmutable()) {
            hftp56.ensureMutable();
        }
        bwqj.c(((bwqj)hftp56.b_message), "bcc_email");
        if(!hftp56.b_message.isImmutable()) {
            hftp56.ensureMutable();
        }
        bwqj.b(((bwqj)hftp56.b_message), "rfc822");
        bwqg9.a(hftp56);
        ProtoLiteBuilder hftp57 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp57.b_message.isImmutable()) {
            hftp57.ensureMutable();
        }
        bwqj.c(((bwqj)hftp57.b_message), "cc_name");
        bwqg9.a(hftp57);
        ProtoLiteBuilder hftp58 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp58.b_message.isImmutable()) {
            hftp58.ensureMutable();
        }
        bwqj.c(((bwqj)hftp58.b_message), "cc_email");
        if(!hftp58.b_message.isImmutable()) {
            hftp58.ensureMutable();
        }
        bwqj.b(((bwqj)hftp58.b_message), "rfc822");
        bwqg9.a(hftp58);
        ProtoLiteBuilder hftp59 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp59.b_message.isImmutable()) {
            hftp59.ensureMutable();
        }
        bwqj.c(((bwqj)hftp59.b_message), "labels");
        if(!hftp59.b_message.isImmutable()) {
            hftp59.ensureMutable();
        }
        bwqj.b(((bwqj)hftp59.b_message), "verbatim");
        bwqg9.a(hftp59);
        ProtoLiteBuilder hftp60 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp60.b_message.isImmutable()) {
            hftp60.ensureMutable();
        }
        bwqj.c(((bwqj)hftp60.b_message), "about_additionalType");
        if(!hftp60.b_message.isImmutable()) {
            hftp60.ensureMutable();
        }
        bwqj.b(((bwqj)hftp60.b_message), "verbatim");
        bwqg9.a(hftp60);
        bwql0.k(bwqg9);
        bwqg bwqg10 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg10.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg10).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg10.b_message), "Message");
        if(!bwqg10.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg10).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg10.b_message), 7);
        ProtoLiteBuilder hftp61 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp61.b_message.isImmutable()) {
            hftp61.ensureMutable();
        }
        bwqj.c(((bwqj)hftp61.b_message), "name");
        if(!hftp61.b_message.isImmutable()) {
            hftp61.ensureMutable();
        }
        bwqj.f(((bwqj)hftp61.b_message), 3);
        bwqg10.a(hftp61);
        ProtoLiteBuilder hftp62 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp62.b_message.isImmutable()) {
            hftp62.ensureMutable();
        }
        bwqj.c(((bwqj)hftp62.b_message), "keywords");
        bwqg10.a(hftp62);
        ProtoLiteBuilder hftp63 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp63.b_message.isImmutable()) {
            hftp63.ensureMutable();
        }
        bwqj.c(((bwqj)hftp63.b_message), "text");
        if(!hftp63.b_message.isImmutable()) {
            hftp63.ensureMutable();
        }
        bwqj.f(((bwqj)hftp63.b_message), 2);
        bwqg10.a(hftp63);
        ProtoLiteBuilder hftp64 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp64.b_message.isImmutable()) {
            hftp64.ensureMutable();
        }
        bwqj.c(((bwqj)hftp64.b_message), "sender_name");
        if(!hftp64.b_message.isImmutable()) {
            hftp64.ensureMutable();
        }
        bwqj.f(((bwqj)hftp64.b_message), 2);
        bwqg10.a(hftp64);
        ProtoLiteBuilder hftp65 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp65.b_message.isImmutable()) {
            hftp65.ensureMutable();
        }
        bwqj.c(((bwqj)hftp65.b_message), "sender_email");
        if(!hftp65.b_message.isImmutable()) {
            hftp65.ensureMutable();
        }
        bwqj.f(((bwqj)hftp65.b_message), 2);
        if(!hftp65.b_message.isImmutable()) {
            hftp65.ensureMutable();
        }
        bwqj.b(((bwqj)hftp65.b_message), "rfc822");
        bwqg10.a(hftp65);
        ProtoLiteBuilder hftp66 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp66.b_message.isImmutable()) {
            hftp66.ensureMutable();
        }
        bwqj.c(((bwqj)hftp66.b_message), "recipient_name");
        bwqg10.a(hftp66);
        ProtoLiteBuilder hftp67 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp67.b_message.isImmutable()) {
            hftp67.ensureMutable();
        }
        bwqj.c(((bwqj)hftp67.b_message), "recipient_email");
        if(!hftp67.b_message.isImmutable()) {
            hftp67.ensureMutable();
        }
        bwqj.b(((bwqj)hftp67.b_message), "rfc822");
        bwqg10.a(hftp67);
        ProtoLiteBuilder hftp68 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp68.b_message.isImmutable()) {
            hftp68.ensureMutable();
        }
        bwqj.c(((bwqj)hftp68.b_message), "messageAttachment_name");
        bwqg10.a(hftp68);
        ProtoLiteBuilder hftp69 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp69.b_message.isImmutable()) {
            hftp69.ensureMutable();
        }
        bwqj.c(((bwqj)hftp69.b_message), "recipient_telephone");
        bwqg10.a(hftp69);
        ProtoLiteBuilder hftp70 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp70.b_message.isImmutable()) {
            hftp70.ensureMutable();
        }
        bwqj.c(((bwqj)hftp70.b_message), "sender_telephone");
        if(!hftp70.b_message.isImmutable()) {
            hftp70.ensureMutable();
        }
        bwqj.f(((bwqj)hftp70.b_message), 2);
        bwqg10.a(hftp70);
        ProtoLiteBuilder hftp71 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp71.b_message.isImmutable()) {
            hftp71.ensureMutable();
        }
        bwqj.c(((bwqj)hftp71.b_message), "isPartOf_id");
        if(!hftp71.b_message.isImmutable()) {
            hftp71.ensureMutable();
        }
        bwqj.b(((bwqj)hftp71.b_message), "verbatim");
        bwqg10.a(hftp71);
        ProtoLiteBuilder hftp72 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp72.b_message.isImmutable()) {
            hftp72.ensureMutable();
        }
        bwqj.c(((bwqj)hftp72.b_message), "dateReceived");
        if(!hftp72.b_message.isImmutable()) {
            hftp72.ensureMutable();
        }
        bwqj.f(((bwqj)hftp72.b_message), 2);
        if(!hftp72.b_message.isImmutable()) {
            hftp72.ensureMutable();
        }
        bwqj.b(((bwqj)hftp72.b_message), "date");
        bwqg10.a(hftp72);
        ProtoLiteBuilder hftp73 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp73.b_message.isImmutable()) {
            hftp73.ensureMutable();
        }
        bwqj.c(((bwqj)hftp73.b_message), "image");
        if(!hftp73.b_message.isImmutable()) {
            hftp73.ensureMutable();
        }
        bwqj.f(((bwqj)hftp73.b_message), 2);
        if(!hftp73.b_message.isImmutable()) {
            hftp73.ensureMutable();
        }
        bwqj.b(((bwqj)hftp73.b_message), "url");
        bwqg10.a(hftp73);
        ProtoLiteBuilder hftp74 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp74.b_message.isImmutable()) {
            hftp74.ensureMutable();
        }
        bwqj.c(((bwqj)hftp74.b_message), "labels");
        if(!hftp74.b_message.isImmutable()) {
            hftp74.ensureMutable();
        }
        bwqj.b(((bwqj)hftp74.b_message), "verbatim");
        bwqg10.a(hftp74);
        bwql0.k(bwqg10);
        bwqg bwqg11 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg11.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg11).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg11.b_message), "MusicAlbum");
        if(!bwqg11.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg11).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg11.b_message), 7);
        ProtoLiteBuilder hftp75 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp75.b_message.isImmutable()) {
            hftp75.ensureMutable();
        }
        bwqj.c(((bwqj)hftp75.b_message), "name");
        if(!hftp75.b_message.isImmutable()) {
            hftp75.ensureMutable();
        }
        bwqj.f(((bwqj)hftp75.b_message), 3);
        bwqg11.a(hftp75);
        ProtoLiteBuilder hftp76 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp76.b_message.isImmutable()) {
            hftp76.ensureMutable();
        }
        bwqj.c(((bwqj)hftp76.b_message), "keywords");
        bwqg11.a(hftp76);
        ProtoLiteBuilder hftp77 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp77.b_message.isImmutable()) {
            hftp77.ensureMutable();
        }
        bwqj.c(((bwqj)hftp77.b_message), "track_name");
        bwqg11.a(hftp77);
        ProtoLiteBuilder hftp78 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp78.b_message.isImmutable()) {
            hftp78.ensureMutable();
        }
        bwqj.c(((bwqj)hftp78.b_message), "byArtist_name");
        if(!hftp78.b_message.isImmutable()) {
            hftp78.ensureMutable();
        }
        bwqj.f(((bwqj)hftp78.b_message), 2);
        bwqg11.a(hftp78);
        bwql0.k(bwqg11);
        bwqg bwqg12 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg12.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg12).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg12.b_message), "MusicGroup");
        if(!bwqg12.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg12).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg12.b_message), 7);
        ProtoLiteBuilder hftp79 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp79.b_message.isImmutable()) {
            hftp79.ensureMutable();
        }
        bwqj.c(((bwqj)hftp79.b_message), "name");
        if(!hftp79.b_message.isImmutable()) {
            hftp79.ensureMutable();
        }
        bwqj.f(((bwqj)hftp79.b_message), 3);
        bwqg12.a(hftp79);
        ProtoLiteBuilder hftp80 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp80.b_message.isImmutable()) {
            hftp80.ensureMutable();
        }
        bwqj.c(((bwqj)hftp80.b_message), "keywords");
        bwqg12.a(hftp80);
        ProtoLiteBuilder hftp81 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp81.b_message.isImmutable()) {
            hftp81.ensureMutable();
        }
        bwqj.c(((bwqj)hftp81.b_message), "track_name");
        bwqg12.a(hftp81);
        ProtoLiteBuilder hftp82 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp82.b_message.isImmutable()) {
            hftp82.ensureMutable();
        }
        bwqj.c(((bwqj)hftp82.b_message), "album_name");
        bwqg12.a(hftp82);
        bwql0.k(bwqg12);
        bwqg bwqg13 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg13.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg13).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg13.b_message), "MusicPlaylist");
        if(!bwqg13.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg13).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg13.b_message), 7);
        ProtoLiteBuilder hftp83 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp83.b_message.isImmutable()) {
            hftp83.ensureMutable();
        }
        bwqj.c(((bwqj)hftp83.b_message), "name");
        if(!hftp83.b_message.isImmutable()) {
            hftp83.ensureMutable();
        }
        bwqj.f(((bwqj)hftp83.b_message), 3);
        bwqg13.a(hftp83);
        ProtoLiteBuilder hftp84 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp84.b_message.isImmutable()) {
            hftp84.ensureMutable();
        }
        bwqj.c(((bwqj)hftp84.b_message), "keywords");
        bwqg13.a(hftp84);
        ProtoLiteBuilder hftp85 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp85.b_message.isImmutable()) {
            hftp85.ensureMutable();
        }
        bwqj.c(((bwqj)hftp85.b_message), "track_name");
        bwqg13.a(hftp85);
        bwql0.k(bwqg13);
        bwqg bwqg14 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg14.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg14).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg14.b_message), "MusicRecording");
        if(!bwqg14.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg14).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg14.b_message), 7);
        ProtoLiteBuilder hftp86 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp86.b_message.isImmutable()) {
            hftp86.ensureMutable();
        }
        bwqj.c(((bwqj)hftp86.b_message), "name");
        if(!hftp86.b_message.isImmutable()) {
            hftp86.ensureMutable();
        }
        bwqj.f(((bwqj)hftp86.b_message), 3);
        bwqg14.a(hftp86);
        ProtoLiteBuilder hftp87 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp87.b_message.isImmutable()) {
            hftp87.ensureMutable();
        }
        bwqj.c(((bwqj)hftp87.b_message), "keywords");
        bwqg14.a(hftp87);
        ProtoLiteBuilder hftp88 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp88.b_message.isImmutable()) {
            hftp88.ensureMutable();
        }
        bwqj.c(((bwqj)hftp88.b_message), "inAlbum_name");
        if(!hftp88.b_message.isImmutable()) {
            hftp88.ensureMutable();
        }
        bwqj.f(((bwqj)hftp88.b_message), 2);
        bwqg14.a(hftp88);
        ProtoLiteBuilder hftp89 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp89.b_message.isImmutable()) {
            hftp89.ensureMutable();
        }
        bwqj.c(((bwqj)hftp89.b_message), "byArtist_name");
        if(!hftp89.b_message.isImmutable()) {
            hftp89.ensureMutable();
        }
        bwqj.f(((bwqj)hftp89.b_message), 2);
        bwqg14.a(hftp89);
        ProtoLiteBuilder hftp90 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp90.b_message.isImmutable()) {
            hftp90.ensureMutable();
        }
        bwqj.c(((bwqj)hftp90.b_message), "inPlaylist_name");
        bwqg14.a(hftp90);
        bwql0.k(bwqg14);
        bwqg bwqg15 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg15.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg15).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg15.b_message), "Person");
        if(!bwqg15.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg15).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg15.b_message), 7);
        ProtoLiteBuilder hftp91 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp91.b_message.isImmutable()) {
            hftp91.ensureMutable();
        }
        bwqj.c(((bwqj)hftp91.b_message), "name");
        if(!hftp91.b_message.isImmutable()) {
            hftp91.ensureMutable();
        }
        bwqj.f(((bwqj)hftp91.b_message), 3);
        bwqg15.a(hftp91);
        ProtoLiteBuilder hftp92 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp92.b_message.isImmutable()) {
            hftp92.ensureMutable();
        }
        bwqj.c(((bwqj)hftp92.b_message), "keywords");
        bwqg15.a(hftp92);
        ProtoLiteBuilder hftp93 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp93.b_message.isImmutable()) {
            hftp93.ensureMutable();
        }
        bwqj.c(((bwqj)hftp93.b_message), "email");
        if(!hftp93.b_message.isImmutable()) {
            hftp93.ensureMutable();
        }
        bwqj.f(((bwqj)hftp93.b_message), 2);
        if(!hftp93.b_message.isImmutable()) {
            hftp93.ensureMutable();
        }
        bwqj.b(((bwqj)hftp93.b_message), "rfc822");
        bwqg15.a(hftp93);
        ProtoLiteBuilder hftp94 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp94.b_message.isImmutable()) {
            hftp94.ensureMutable();
        }
        bwqj.c(((bwqj)hftp94.b_message), "additionalName");
        if(!hftp94.b_message.isImmutable()) {
            hftp94.ensureMutable();
        }
        bwqj.f(((bwqj)hftp94.b_message), 1);
        bwqg15.a(hftp94);
        ProtoLiteBuilder hftp95 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        String s = new gfss("_").g("contactPoint", "address", new Object[0]);
        if(!hftp95.b_message.isImmutable()) {
            hftp95.ensureMutable();
        }
        bwqj.c(((bwqj)hftp95.b_message), s);
        if(!hftp95.b_message.isImmutable()) {
            hftp95.ensureMutable();
        }
        bwqj.f(((bwqj)hftp95.b_message), 1);
        bwqg15.a(hftp95);
        ProtoLiteBuilder hftp96 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        String s1 = new gfss("_").g("contactPoint", "email", new Object[0]);
        if(!hftp96.b_message.isImmutable()) {
            hftp96.ensureMutable();
        }
        bwqj.c(((bwqj)hftp96.b_message), s1);
        if(!hftp96.b_message.isImmutable()) {
            hftp96.ensureMutable();
        }
        bwqj.f(((bwqj)hftp96.b_message), 1);
        if(!hftp96.b_message.isImmutable()) {
            hftp96.ensureMutable();
        }
        bwqj.b(((bwqj)hftp96.b_message), "rfc822");
        bwqg15.a(hftp96);
        ProtoLiteBuilder hftp97 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        String s2 = new gfss("_").g("contactPoint", "telephone", new Object[0]);
        if(!hftp97.b_message.isImmutable()) {
            hftp97.ensureMutable();
        }
        bwqj.c(((bwqj)hftp97.b_message), s2);
        if(!hftp97.b_message.isImmutable()) {
            hftp97.ensureMutable();
        }
        bwqj.f(((bwqj)hftp97.b_message), 1);
        bwqg15.a(hftp97);
        ProtoLiteBuilder hftp98 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp98.b_message.isImmutable()) {
            hftp98.ensureMutable();
        }
        bwqj.c(((bwqj)hftp98.b_message), "identifier");
        if(!hftp98.b_message.isImmutable()) {
            hftp98.ensureMutable();
        }
        bwqj.f(((bwqj)hftp98.b_message), 2);
        if(!hftp98.b_message.isImmutable()) {
            hftp98.ensureMutable();
        }
        bwqj.b(((bwqj)hftp98.b_message), "verbatim");
        bwqg15.a(hftp98);
        bwql0.k(bwqg15);
        bwqg bwqg16 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg16.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg16).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg16.b_message), "Photograph");
        if(!bwqg16.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg16).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg16.b_message), 7);
        ProtoLiteBuilder hftp99 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp99.b_message.isImmutable()) {
            hftp99.ensureMutable();
        }
        bwqj.c(((bwqj)hftp99.b_message), "name");
        if(!hftp99.b_message.isImmutable()) {
            hftp99.ensureMutable();
        }
        bwqj.f(((bwqj)hftp99.b_message), 3);
        bwqg16.a(hftp99);
        ProtoLiteBuilder hftp100 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp100.b_message.isImmutable()) {
            hftp100.ensureMutable();
        }
        bwqj.c(((bwqj)hftp100.b_message), "keywords");
        bwqg16.a(hftp100);
        ProtoLiteBuilder hftp101 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp101.b_message.isImmutable()) {
            hftp101.ensureMutable();
        }
        bwqj.c(((bwqj)hftp101.b_message), "locationCreated_geo_box");
        if(!hftp101.b_message.isImmutable()) {
            hftp101.ensureMutable();
        }
        bwqj.b(((bwqj)hftp101.b_message), "location");
        bwqg16.a(hftp101);
        bwql0.k(bwqg16);
        bwqg bwqg17 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg17.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg17).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg17.b_message), "GeoShape");
        if(!bwqg17.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg17).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg17.b_message), 7);
        ProtoLiteBuilder hftp102 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp102.b_message.isImmutable()) {
            hftp102.ensureMutable();
        }
        bwqj.c(((bwqj)hftp102.b_message), "name");
        if(!hftp102.b_message.isImmutable()) {
            hftp102.ensureMutable();
        }
        bwqj.f(((bwqj)hftp102.b_message), 3);
        bwqg17.a(hftp102);
        ProtoLiteBuilder hftp103 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp103.b_message.isImmutable()) {
            hftp103.ensureMutable();
        }
        bwqj.c(((bwqj)hftp103.b_message), "keywords");
        bwqg17.a(hftp103);
        ProtoLiteBuilder hftp104 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp104.b_message.isImmutable()) {
            hftp104.ensureMutable();
        }
        bwqj.c(((bwqj)hftp104.b_message), "box");
        if(!hftp104.b_message.isImmutable()) {
            hftp104.ensureMutable();
        }
        bwqj.b(((bwqj)hftp104.b_message), "location");
        bwqg17.a(hftp104);
        bwql0.k(bwqg17);
        bwqg bwqg18 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg18.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg18).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg18.b_message), "Event");
        if(!bwqg18.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg18).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg18.b_message), 7);
        ProtoLiteBuilder hftp105 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp105.b_message.isImmutable()) {
            hftp105.ensureMutable();
        }
        bwqj.c(((bwqj)hftp105.b_message), "name");
        if(!hftp105.b_message.isImmutable()) {
            hftp105.ensureMutable();
        }
        bwqj.f(((bwqj)hftp105.b_message), 3);
        bwqg18.a(hftp105);
        ProtoLiteBuilder hftp106 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp106.b_message.isImmutable()) {
            hftp106.ensureMutable();
        }
        bwqj.c(((bwqj)hftp106.b_message), "keywords");
        bwqg18.a(hftp106);
        ProtoLiteBuilder hftp107 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp107.b_message.isImmutable()) {
            hftp107.ensureMutable();
        }
        bwqj.c(((bwqj)hftp107.b_message), "startDate");
        if(!hftp107.b_message.isImmutable()) {
            hftp107.ensureMutable();
        }
        bwqj.b(((bwqj)hftp107.b_message), "date");
        bwqg18.a(hftp107);
        ProtoLiteBuilder hftp108 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp108.b_message.isImmutable()) {
            hftp108.ensureMutable();
        }
        bwqj.c(((bwqj)hftp108.b_message), "endDate");
        if(!hftp108.b_message.isImmutable()) {
            hftp108.ensureMutable();
        }
        bwqj.b(((bwqj)hftp108.b_message), "date");
        bwqg18.a(hftp108);
        ProtoLiteBuilder hftp109 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp109.b_message.isImmutable()) {
            hftp109.ensureMutable();
        }
        bwqj.c(((bwqj)hftp109.b_message), "location");
        if(!hftp109.b_message.isImmutable()) {
            hftp109.ensureMutable();
        }
        bwqj.f(((bwqj)hftp109.b_message), 2);
        bwqg18.a(hftp109);
        ProtoLiteBuilder hftp110 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp110.b_message.isImmutable()) {
            hftp110.ensureMutable();
        }
        bwqj.c(((bwqj)hftp110.b_message), "description");
        if(!hftp110.b_message.isImmutable()) {
            hftp110.ensureMutable();
        }
        bwqj.f(((bwqj)hftp110.b_message), 2);
        bwqg18.a(hftp110);
        ProtoLiteBuilder hftp111 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp111.b_message.isImmutable()) {
            hftp111.ensureMutable();
        }
        bwqj.c(((bwqj)hftp111.b_message), "attendee_email");
        if(!hftp111.b_message.isImmutable()) {
            hftp111.ensureMutable();
        }
        bwqj.b(((bwqj)hftp111.b_message), "rfc822");
        bwqg18.a(hftp111);
        ProtoLiteBuilder hftp112 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp112.b_message.isImmutable()) {
            hftp112.ensureMutable();
        }
        bwqj.c(((bwqj)hftp112.b_message), "attendee_name");
        bwqg18.a(hftp112);
        bwql0.k(bwqg18);
        bwqg bwqg19 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg19.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg19).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg19.b_message), "ContextualEvent");
        if(!bwqg19.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg19).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg19.b_message), 7);
        int v3 = (int)TimeUnit.DAYS.toSeconds(7L);
        if(!bwqg19.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg19).ensureMutable();
        }
        bwqk.b(((bwqk)bwqg19.b_message), v3);
        ProtoLiteBuilder hftp113 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp113.b_message.isImmutable()) {
            hftp113.ensureMutable();
        }
        bwqj.c(((bwqj)hftp113.b_message), "name");
        if(!hftp113.b_message.isImmutable()) {
            hftp113.ensureMutable();
        }
        bwqj.f(((bwqj)hftp113.b_message), 3);
        bwqg19.a(hftp113);
        ProtoLiteBuilder hftp114 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp114.b_message.isImmutable()) {
            hftp114.ensureMutable();
        }
        bwqj.c(((bwqj)hftp114.b_message), "keywords");
        bwqg19.a(hftp114);
        ProtoLiteBuilder hftp115 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp115.b_message.isImmutable()) {
            hftp115.ensureMutable();
        }
        bwqj.c(((bwqj)hftp115.b_message), "startDate");
        if(!hftp115.b_message.isImmutable()) {
            hftp115.ensureMutable();
        }
        bwqj.b(((bwqj)hftp115.b_message), "date");
        bwqg19.a(hftp115);
        ProtoLiteBuilder hftp116 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp116.b_message.isImmutable()) {
            hftp116.ensureMutable();
        }
        bwqj.c(((bwqj)hftp116.b_message), "endDate");
        if(!hftp116.b_message.isImmutable()) {
            hftp116.ensureMutable();
        }
        bwqj.b(((bwqj)hftp116.b_message), "date");
        bwqg19.a(hftp116);
        ProtoLiteBuilder hftp117 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp117.b_message.isImmutable()) {
            hftp117.ensureMutable();
        }
        bwqj.c(((bwqj)hftp117.b_message), "location_geo_box");
        if(!hftp117.b_message.isImmutable()) {
            hftp117.ensureMutable();
        }
        bwqj.b(((bwqj)hftp117.b_message), "location");
        bwqg19.a(hftp117);
        ProtoLiteBuilder hftp118 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp118.b_message.isImmutable()) {
            hftp118.ensureMutable();
        }
        bwqj.c(((bwqj)hftp118.b_message), "description");
        if(!hftp118.b_message.isImmutable()) {
            hftp118.ensureMutable();
        }
        bwqj.f(((bwqj)hftp118.b_message), 2);
        bwqg19.a(hftp118);
        ProtoLiteBuilder hftp119 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp119.b_message.isImmutable()) {
            hftp119.ensureMutable();
        }
        bwqj.c(((bwqj)hftp119.b_message), "attendee_email");
        if(!hftp119.b_message.isImmutable()) {
            hftp119.ensureMutable();
        }
        bwqj.b(((bwqj)hftp119.b_message), "rfc822");
        bwqg19.a(hftp119);
        ProtoLiteBuilder hftp120 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp120.b_message.isImmutable()) {
            hftp120.ensureMutable();
        }
        bwqj.c(((bwqj)hftp120.b_message), "attendee_name");
        bwqg19.a(hftp120);
        bwql0.k(bwqg19);
        bwqg bwqg20 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg20.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg20).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg20.b_message), "LocalBusiness");
        if(!bwqg20.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg20).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg20.b_message), 7);
        ProtoLiteBuilder hftp121 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp121.b_message.isImmutable()) {
            hftp121.ensureMutable();
        }
        bwqj.c(((bwqj)hftp121.b_message), "name");
        if(!hftp121.b_message.isImmutable()) {
            hftp121.ensureMutable();
        }
        bwqj.f(((bwqj)hftp121.b_message), 3);
        bwqg20.a(hftp121);
        ProtoLiteBuilder hftp122 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp122.b_message.isImmutable()) {
            hftp122.ensureMutable();
        }
        bwqj.c(((bwqj)hftp122.b_message), "keywords");
        bwqg20.a(hftp122);
        ProtoLiteBuilder hftp123 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp123.b_message.isImmutable()) {
            hftp123.ensureMutable();
        }
        bwqj.c(((bwqj)hftp123.b_message), "address_streetAddress");
        if(!hftp123.b_message.isImmutable()) {
            hftp123.ensureMutable();
        }
        bwqj.f(((bwqj)hftp123.b_message), 2);
        bwqg20.a(hftp123);
        ProtoLiteBuilder hftp124 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp124.b_message.isImmutable()) {
            hftp124.ensureMutable();
        }
        bwqj.c(((bwqj)hftp124.b_message), "geo_box");
        if(!hftp124.b_message.isImmutable()) {
            hftp124.ensureMutable();
        }
        bwqj.b(((bwqj)hftp124.b_message), "location");
        bwqg20.a(hftp124);
        bwql0.k(bwqg20);
        bwqg bwqg21 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg21.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg21).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg21.b_message), "Restaurant");
        if(!bwqg21.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg21).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg21.b_message), 7);
        ProtoLiteBuilder hftp125 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp125.b_message.isImmutable()) {
            hftp125.ensureMutable();
        }
        bwqj.c(((bwqj)hftp125.b_message), "name");
        if(!hftp125.b_message.isImmutable()) {
            hftp125.ensureMutable();
        }
        bwqj.f(((bwqj)hftp125.b_message), 3);
        bwqg21.a(hftp125);
        ProtoLiteBuilder hftp126 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp126.b_message.isImmutable()) {
            hftp126.ensureMutable();
        }
        bwqj.c(((bwqj)hftp126.b_message), "keywords");
        bwqg21.a(hftp126);
        ProtoLiteBuilder hftp127 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp127.b_message.isImmutable()) {
            hftp127.ensureMutable();
        }
        bwqj.c(((bwqj)hftp127.b_message), "address_streetAddress");
        if(!hftp127.b_message.isImmutable()) {
            hftp127.ensureMutable();
        }
        bwqj.f(((bwqj)hftp127.b_message), 2);
        bwqg21.a(hftp127);
        ProtoLiteBuilder hftp128 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp128.b_message.isImmutable()) {
            hftp128.ensureMutable();
        }
        bwqj.c(((bwqj)hftp128.b_message), "geo_box");
        if(!hftp128.b_message.isImmutable()) {
            hftp128.ensureMutable();
        }
        bwqj.b(((bwqj)hftp128.b_message), "location");
        bwqg21.a(hftp128);
        bwql0.k(bwqg21);
        bwqg bwqg22 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg22.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg22).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg22.b_message), "Reservation");
        if(!bwqg22.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg22).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg22.b_message), 7);
        ProtoLiteBuilder hftp129 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp129.b_message.isImmutable()) {
            hftp129.ensureMutable();
        }
        bwqj.c(((bwqj)hftp129.b_message), "name");
        if(!hftp129.b_message.isImmutable()) {
            hftp129.ensureMutable();
        }
        bwqj.f(((bwqj)hftp129.b_message), 3);
        bwqg22.a(hftp129);
        ProtoLiteBuilder hftp130 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp130.b_message.isImmutable()) {
            hftp130.ensureMutable();
        }
        bwqj.c(((bwqj)hftp130.b_message), "keywords");
        bwqg22.a(hftp130);
        ProtoLiteBuilder hftp131 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp131.b_message.isImmutable()) {
            hftp131.ensureMutable();
        }
        bwqj.c(((bwqj)hftp131.b_message), "startDate");
        if(!hftp131.b_message.isImmutable()) {
            hftp131.ensureMutable();
        }
        bwqj.f(((bwqj)hftp131.b_message), 2);
        if(!hftp131.b_message.isImmutable()) {
            hftp131.ensureMutable();
        }
        bwqj.b(((bwqj)hftp131.b_message), "date");
        bwqg22.a(hftp131);
        ProtoLiteBuilder hftp132 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp132.b_message.isImmutable()) {
            hftp132.ensureMutable();
        }
        bwqj.c(((bwqj)hftp132.b_message), "reservationFor_name");
        if(!hftp132.b_message.isImmutable()) {
            hftp132.ensureMutable();
        }
        bwqj.f(((bwqj)hftp132.b_message), 2);
        bwqg22.a(hftp132);
        bwql0.k(bwqg22);
        bwqg bwqg23 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg23.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg23).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg23.b_message), "Contact");
        if(!bwqg23.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg23).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg23.b_message), v2);
        ProtoLiteBuilder hftp133 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp133.b_message.isImmutable()) {
            hftp133.ensureMutable();
        }
        bwqj.c(((bwqj)hftp133.b_message), "name");
        if(!hftp133.b_message.isImmutable()) {
            hftp133.ensureMutable();
        }
        bwqj.f(((bwqj)hftp133.b_message), 3);
        if(!hftp133.b_message.isImmutable()) {
            hftp133.ensureMutable();
        }
        bwqj.e(((bwqj)hftp133.b_message), v);
        bwqg23.a(hftp133);
        ProtoLiteBuilder hftp134 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp134.b_message.isImmutable()) {
            hftp134.ensureMutable();
        }
        bwqj.c(((bwqj)hftp134.b_message), "keywords");
        bwqg23.a(hftp134);
        ProtoLiteBuilder hftp135 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp135.b_message.isImmutable()) {
            hftp135.ensureMutable();
        }
        bwqj.c(((bwqj)hftp135.b_message), "additionalName_name");
        if(!hftp135.b_message.isImmutable()) {
            hftp135.ensureMutable();
        }
        bwqj.e(((bwqj)hftp135.b_message), v);
        bwqg23.a(hftp135);
        ProtoLiteBuilder hftp136 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp136.b_message.isImmutable()) {
            hftp136.ensureMutable();
        }
        bwqj.c(((bwqj)hftp136.b_message), "email_name");
        if(!hftp136.b_message.isImmutable()) {
            hftp136.ensureMutable();
        }
        bwqj.b(((bwqj)hftp136.b_message), "rfc822");
        if(!hftp136.b_message.isImmutable()) {
            hftp136.ensureMutable();
        }
        bwqj.e(((bwqj)hftp136.b_message), v1);
        bwqg23.a(hftp136);
        ProtoLiteBuilder hftp137 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp137.b_message.isImmutable()) {
            hftp137.ensureMutable();
        }
        bwqj.c(((bwqj)hftp137.b_message), "telephone_name");
        if(!hftp137.b_message.isImmutable()) {
            hftp137.ensureMutable();
        }
        bwqj.e(((bwqj)hftp137.b_message), v1);
        bwqg23.a(hftp137);
        ProtoLiteBuilder hftp138 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp138.b_message.isImmutable()) {
            hftp138.ensureMutable();
        }
        bwqj.c(((bwqj)hftp138.b_message), "token");
        if(!hftp138.b_message.isImmutable()) {
            hftp138.ensureMutable();
        }
        bwqj.b(((bwqj)hftp138.b_message), "verbatim");
        bwqg23.a(hftp138);
        ProtoLiteBuilder hftp139 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp139.b_message.isImmutable()) {
            hftp139.ensureMutable();
        }
        bwqj.c(((bwqj)hftp139.b_message), "note");
        bwqg23.a(hftp139);
        ProtoLiteBuilder hftp140 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp140.b_message.isImmutable()) {
            hftp140.ensureMutable();
        }
        bwqj.c(((bwqj)hftp140.b_message), "address_streetAddress");
        bwqg23.a(hftp140);
        ProtoLiteBuilder hftp141 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp141.b_message.isImmutable()) {
            hftp141.ensureMutable();
        }
        bwqj.c(((bwqj)hftp141.b_message), "instantMessageHandle_name");
        bwqg23.a(hftp141);
        ProtoLiteBuilder hftp142 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp142.b_message.isImmutable()) {
            hftp142.ensureMutable();
        }
        bwqj.f(((bwqj)hftp142.b_message), 2);
        if(!hftp142.b_message.isImmutable()) {
            hftp142.ensureMutable();
        }
        bwqj.c(((bwqj)hftp142.b_message), "deviceScore");
        if(!hftp142.b_message.isImmutable()) {
            hftp142.ensureMutable();
        }
        bwqj.e(((bwqj)hftp142.b_message), 0);
        ProtoLiteBuilder hftp143 = ((ProtoLiteMessage)bwwm.a).v_newBuilder();
        if(!hftp143.b_message.isImmutable()) {
            hftp143.ensureMutable();
        }
        bwwm.b(((bwwm)hftp143.b_message));
        bwwm bwwm0 = (bwwm)hftp143.N_build();
        if(!hftp142.b_message.isImmutable()) {
            hftp142.ensureMutable();
        }
        bwqj.d(((bwqj)hftp142.b_message), bwwm0);
        bwqg23.a(hftp142);
        bwql0.k(bwqg23);
        bwqg bwqg24 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg24.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg24).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg24.b_message), "Sticker");
        if(!bwqg24.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg24).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg24.b_message), 7);
        ProtoLiteBuilder hftp144 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp144.b_message.isImmutable()) {
            hftp144.ensureMutable();
        }
        bwqj.c(((bwqj)hftp144.b_message), "name");
        if(!hftp144.b_message.isImmutable()) {
            hftp144.ensureMutable();
        }
        bwqj.f(((bwqj)hftp144.b_message), 3);
        bwqg24.a(hftp144);
        ProtoLiteBuilder hftp145 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp145.b_message.isImmutable()) {
            hftp145.ensureMutable();
        }
        bwqj.c(((bwqj)hftp145.b_message), "keywords");
        bwqg24.a(hftp145);
        bwql0.k(bwqg24);
        bwqg bwqg25 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg25.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg25).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg25.b_message), "StickerPack");
        if(!bwqg25.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg25).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg25.b_message), 7);
        ProtoLiteBuilder hftp146 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp146.b_message.isImmutable()) {
            hftp146.ensureMutable();
        }
        bwqj.c(((bwqj)hftp146.b_message), "name");
        if(!hftp146.b_message.isImmutable()) {
            hftp146.ensureMutable();
        }
        bwqj.f(((bwqj)hftp146.b_message), 3);
        bwqg25.a(hftp146);
        ProtoLiteBuilder hftp147 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp147.b_message.isImmutable()) {
            hftp147.ensureMutable();
        }
        bwqj.c(((bwqj)hftp147.b_message), "keywords");
        bwqg25.a(hftp147);
        bwql0.k(bwqg25);
        bwqg bwqg26 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg26.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg26).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg26.b_message), "VideoObject");
        if(!bwqg26.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg26).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg26.b_message), 7);
        ProtoLiteBuilder hftp148 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp148.b_message.isImmutable()) {
            hftp148.ensureMutable();
        }
        bwqj.c(((bwqj)hftp148.b_message), "name");
        if(!hftp148.b_message.isImmutable()) {
            hftp148.ensureMutable();
        }
        bwqj.f(((bwqj)hftp148.b_message), 3);
        bwqg26.a(hftp148);
        ProtoLiteBuilder hftp149 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp149.b_message.isImmutable()) {
            hftp149.ensureMutable();
        }
        bwqj.c(((bwqj)hftp149.b_message), "keywords");
        bwqg26.a(hftp149);
        ProtoLiteBuilder hftp150 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp150.b_message.isImmutable()) {
            hftp150.ensureMutable();
        }
        bwqj.c(((bwqj)hftp150.b_message), "seriesName");
        if(!hftp150.b_message.isImmutable()) {
            hftp150.ensureMutable();
        }
        bwqj.f(((bwqj)hftp150.b_message), 2);
        bwqg26.a(hftp150);
        ProtoLiteBuilder hftp151 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp151.b_message.isImmutable()) {
            hftp151.ensureMutable();
        }
        bwqj.c(((bwqj)hftp151.b_message), "author_name");
        if(!hftp151.b_message.isImmutable()) {
            hftp151.ensureMutable();
        }
        bwqj.f(((bwqj)hftp151.b_message), 2);
        bwqg26.a(hftp151);
        ProtoLiteBuilder hftp152 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp152.b_message.isImmutable()) {
            hftp152.ensureMutable();
        }
        bwqj.c(((bwqj)hftp152.b_message), "locationCreated_geo_box");
        if(!hftp152.b_message.isImmutable()) {
            hftp152.ensureMutable();
        }
        bwqj.b(((bwqj)hftp152.b_message), "location");
        bwqg26.a(hftp152);
        bwql0.k(bwqg26);
        bwqg bwqg27 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        int v4 = (int)TimeUnit.DAYS.toSeconds(30L);
        if(!bwqg27.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg27).ensureMutable();
        }
        bwqk.b(((bwqk)bwqg27.b_message), v4);
        if(!bwqg27.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg27).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg27.b_message), "Place");
        if(!bwqg27.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg27).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg27.b_message), 7);
        ProtoLiteBuilder hftp153 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp153.b_message.isImmutable()) {
            hftp153.ensureMutable();
        }
        bwqj.c(((bwqj)hftp153.b_message), "name");
        if(!hftp153.b_message.isImmutable()) {
            hftp153.ensureMutable();
        }
        bwqj.f(((bwqj)hftp153.b_message), 3);
        bwqg27.a(hftp153);
        ProtoLiteBuilder hftp154 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp154.b_message.isImmutable()) {
            hftp154.ensureMutable();
        }
        bwqj.c(((bwqj)hftp154.b_message), "keywords");
        bwqg27.a(hftp154);
        ProtoLiteBuilder hftp155 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp155.b_message.isImmutable()) {
            hftp155.ensureMutable();
        }
        bwqj.c(((bwqj)hftp155.b_message), "geo_box");
        if(!hftp155.b_message.isImmutable()) {
            hftp155.ensureMutable();
        }
        bwqj.b(((bwqj)hftp155.b_message), "location");
        bwqg27.a(hftp155);
        bwql0.k(bwqg27);
        bwqg bwqg28 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg28.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg28).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg28.b_message), "Alarm");
        if(!bwqg28.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg28).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg28.b_message), 7);
        ProtoLiteBuilder hftp156 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp156.b_message.isImmutable()) {
            hftp156.ensureMutable();
        }
        bwqj.c(((bwqj)hftp156.b_message), "name");
        if(!hftp156.b_message.isImmutable()) {
            hftp156.ensureMutable();
        }
        bwqj.f(((bwqj)hftp156.b_message), 3);
        bwqg28.a(hftp156);
        ProtoLiteBuilder hftp157 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp157.b_message.isImmutable()) {
            hftp157.ensureMutable();
        }
        bwqj.c(((bwqj)hftp157.b_message), "keywords");
        bwqg28.a(hftp157);
        ProtoLiteBuilder hftp158 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp158.b_message.isImmutable()) {
            hftp158.ensureMutable();
        }
        bwqj.c(((bwqj)hftp158.b_message), "message");
        if(!hftp158.b_message.isImmutable()) {
            hftp158.ensureMutable();
        }
        bwqj.f(((bwqj)hftp158.b_message), 2);
        bwqg28.a(hftp158);
        bwql0.k(bwqg28);
        bwqg bwqg29 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg29.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg29).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg29.b_message), "Stopwatch");
        if(!bwqg29.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg29).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg29.b_message), 7);
        ProtoLiteBuilder hftp159 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp159.b_message.isImmutable()) {
            hftp159.ensureMutable();
        }
        bwqj.c(((bwqj)hftp159.b_message), "name");
        if(!hftp159.b_message.isImmutable()) {
            hftp159.ensureMutable();
        }
        bwqj.f(((bwqj)hftp159.b_message), 3);
        bwqg29.a(hftp159);
        ProtoLiteBuilder hftp160 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp160.b_message.isImmutable()) {
            hftp160.ensureMutable();
        }
        bwqj.c(((bwqj)hftp160.b_message), "keywords");
        bwqg29.a(hftp160);
        bwql0.k(bwqg29);
        bwqg bwqg30 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg30.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg30).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg30.b_message), "Timer");
        if(!bwqg30.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg30).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg30.b_message), 7);
        ProtoLiteBuilder hftp161 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp161.b_message.isImmutable()) {
            hftp161.ensureMutable();
        }
        bwqj.c(((bwqj)hftp161.b_message), "name");
        if(!hftp161.b_message.isImmutable()) {
            hftp161.ensureMutable();
        }
        bwqj.f(((bwqj)hftp161.b_message), 3);
        bwqg30.a(hftp161);
        ProtoLiteBuilder hftp162 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp162.b_message.isImmutable()) {
            hftp162.ensureMutable();
        }
        bwqj.c(((bwqj)hftp162.b_message), "keywords");
        bwqg30.a(hftp162);
        ProtoLiteBuilder hftp163 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp163.b_message.isImmutable()) {
            hftp163.ensureMutable();
        }
        bwqj.c(((bwqj)hftp163.b_message), "message");
        if(!hftp163.b_message.isImmutable()) {
            hftp163.ensureMutable();
        }
        bwqj.f(((bwqj)hftp163.b_message), 2);
        bwqg30.a(hftp163);
        bwql0.k(bwqg30);
        bwqg bwqg31 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg31.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg31).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg31.b_message), "MobileApplication");
        if(!bwqg31.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg31).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg31.b_message), 7);
        ProtoLiteBuilder hftp164 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp164.b_message.isImmutable()) {
            hftp164.ensureMutable();
        }
        bwqj.c(((bwqj)hftp164.b_message), "name");
        if(!hftp164.b_message.isImmutable()) {
            hftp164.ensureMutable();
        }
        bwqj.e(((bwqj)hftp164.b_message), 0x3F);
        if(!hftp164.b_message.isImmutable()) {
            hftp164.ensureMutable();
        }
        bwqj.f(((bwqj)hftp164.b_message), 3);
        bwqg31.a(hftp164);
        ProtoLiteBuilder hftp165 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp165.b_message.isImmutable()) {
            hftp165.ensureMutable();
        }
        bwqj.c(((bwqj)hftp165.b_message), "keywords");
        if(!hftp165.b_message.isImmutable()) {
            hftp165.ensureMutable();
        }
        bwqj.e(((bwqj)hftp165.b_message), 0x3F);
        bwqg31.a(hftp165);
        ProtoLiteBuilder hftp166 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp166.b_message.isImmutable()) {
            hftp166.ensureMutable();
        }
        bwqj.c(((bwqj)hftp166.b_message), "alternateName");
        bwqg31.a(hftp166);
        bwql0.k(bwqg31);
        bwqg bwqg32 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg32.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg32).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg32.b_message), "Book");
        if(!bwqg32.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg32).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg32.b_message), 7);
        ProtoLiteBuilder hftp167 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp167.b_message.isImmutable()) {
            hftp167.ensureMutable();
        }
        bwqj.c(((bwqj)hftp167.b_message), "name");
        if(!hftp167.b_message.isImmutable()) {
            hftp167.ensureMutable();
        }
        bwqj.f(((bwqj)hftp167.b_message), 3);
        bwqg32.a(hftp167);
        ProtoLiteBuilder hftp168 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp168.b_message.isImmutable()) {
            hftp168.ensureMutable();
        }
        bwqj.c(((bwqj)hftp168.b_message), "keywords");
        bwqg32.a(hftp168);
        ProtoLiteBuilder hftp169 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp169.b_message.isImmutable()) {
            hftp169.ensureMutable();
        }
        bwqj.c(((bwqj)hftp169.b_message), "author_name");
        bwqg32.a(hftp169);
        bwql0.k(bwqg32);
        bwqg bwqg33 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg33.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg33).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg33.b_message), "Audiobook");
        if(!bwqg33.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg33).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg33.b_message), 7);
        ProtoLiteBuilder hftp170 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp170.b_message.isImmutable()) {
            hftp170.ensureMutable();
        }
        bwqj.c(((bwqj)hftp170.b_message), "name");
        if(!hftp170.b_message.isImmutable()) {
            hftp170.ensureMutable();
        }
        bwqj.f(((bwqj)hftp170.b_message), 3);
        bwqg33.a(hftp170);
        ProtoLiteBuilder hftp171 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp171.b_message.isImmutable()) {
            hftp171.ensureMutable();
        }
        bwqj.c(((bwqj)hftp171.b_message), "keywords");
        bwqg33.a(hftp171);
        ProtoLiteBuilder hftp172 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp172.b_message.isImmutable()) {
            hftp172.ensureMutable();
        }
        bwqj.c(((bwqj)hftp172.b_message), "author_name");
        bwqg33.a(hftp172);
        ProtoLiteBuilder hftp173 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp173.b_message.isImmutable()) {
            hftp173.ensureMutable();
        }
        bwqj.c(((bwqj)hftp173.b_message), "readBy_name");
        bwqg33.a(hftp173);
        bwql0.k(bwqg33);
        bwqg bwqg34 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg34.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg34).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg34.b_message), "Movie");
        if(!bwqg34.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg34).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg34.b_message), 7);
        ProtoLiteBuilder hftp174 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp174.b_message.isImmutable()) {
            hftp174.ensureMutable();
        }
        bwqj.c(((bwqj)hftp174.b_message), "name");
        if(!hftp174.b_message.isImmutable()) {
            hftp174.ensureMutable();
        }
        bwqj.f(((bwqj)hftp174.b_message), 3);
        bwqg34.a(hftp174);
        ProtoLiteBuilder hftp175 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp175.b_message.isImmutable()) {
            hftp175.ensureMutable();
        }
        bwqj.c(((bwqj)hftp175.b_message), "keywords");
        bwqg34.a(hftp175);
        bwql0.k(bwqg34);
        bwqg bwqg35 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg35.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg35).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg35.b_message), "TVSeries");
        if(!bwqg35.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg35).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg35.b_message), 7);
        ProtoLiteBuilder hftp176 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp176.b_message.isImmutable()) {
            hftp176.ensureMutable();
        }
        bwqj.c(((bwqj)hftp176.b_message), "name");
        if(!hftp176.b_message.isImmutable()) {
            hftp176.ensureMutable();
        }
        bwqj.f(((bwqj)hftp176.b_message), 3);
        bwqg35.a(hftp176);
        ProtoLiteBuilder hftp177 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp177.b_message.isImmutable()) {
            hftp177.ensureMutable();
        }
        bwqj.c(((bwqj)hftp177.b_message), "keywords");
        bwqg35.a(hftp177);
        bwql0.k(bwqg35);
        bwqg bwqg36 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg36.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg36).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg36.b_message), "WebPage");
        if(!bwqg36.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg36).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg36.b_message), 7);
        ProtoLiteBuilder hftp178 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp178.b_message.isImmutable()) {
            hftp178.ensureMutable();
        }
        bwqj.c(((bwqj)hftp178.b_message), "name");
        if(!hftp178.b_message.isImmutable()) {
            hftp178.ensureMutable();
        }
        bwqj.f(((bwqj)hftp178.b_message), 3);
        bwqg36.a(hftp178);
        ProtoLiteBuilder hftp179 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp179.b_message.isImmutable()) {
            hftp179.ensureMutable();
        }
        bwqj.c(((bwqj)hftp179.b_message), "keywords");
        bwqg36.a(hftp179);
        ProtoLiteBuilder hftp180 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp180.b_message.isImmutable()) {
            hftp180.ensureMutable();
        }
        bwqj.c(((bwqj)hftp180.b_message), "sameAs");
        if(!hftp180.b_message.isImmutable()) {
            hftp180.ensureMutable();
        }
        bwqj.f(((bwqj)hftp180.b_message), 2);
        if(!hftp180.b_message.isImmutable()) {
            hftp180.ensureMutable();
        }
        bwqj.b(((bwqj)hftp180.b_message), "url");
        bwqg36.a(hftp180);
        bwql0.k(bwqg36);
        bwqg bwqg37 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg37.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg37).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg37.b_message), "GmmVoiceModel");
        if(!bwqg37.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg37).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg37.b_message), 7);
        ProtoLiteBuilder hftp181 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp181.b_message.isImmutable()) {
            hftp181.ensureMutable();
        }
        bwqj.c(((bwqj)hftp181.b_message), "name");
        if(!hftp181.b_message.isImmutable()) {
            hftp181.ensureMutable();
        }
        bwqj.f(((bwqj)hftp181.b_message), 3);
        bwqg37.a(hftp181);
        ProtoLiteBuilder hftp182 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp182.b_message.isImmutable()) {
            hftp182.ensureMutable();
        }
        bwqj.c(((bwqj)hftp182.b_message), "keywords");
        bwqg37.a(hftp182);
        ProtoLiteBuilder hftp183 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp183.b_message.isImmutable()) {
            hftp183.ensureMutable();
        }
        bwqj.c(((bwqj)hftp183.b_message), "geo_box");
        if(!hftp183.b_message.isImmutable()) {
            hftp183.ensureMutable();
        }
        bwqj.b(((bwqj)hftp183.b_message), "location");
        bwqg37.a(hftp183);
        bwql0.k(bwqg37);
        bwqg bwqg38 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        int v5 = (int)TimeUnit.DAYS.toSeconds(90L);
        if(!bwqg38.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg38).ensureMutable();
        }
        bwqk.b(((bwqk)bwqg38.b_message), v5);
        if(!bwqg38.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg38).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg38.b_message), "StashRecord");
        if(!bwqg38.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg38).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg38.b_message), 2);
        ProtoLiteBuilder hftp184 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp184.b_message.isImmutable()) {
            hftp184.ensureMutable();
        }
        bwqj.c(((bwqj)hftp184.b_message), "name");
        if(!hftp184.b_message.isImmutable()) {
            hftp184.ensureMutable();
        }
        bwqj.f(((bwqj)hftp184.b_message), 3);
        bwqg38.a(hftp184);
        ProtoLiteBuilder hftp185 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp185.b_message.isImmutable()) {
            hftp185.ensureMutable();
        }
        bwqj.c(((bwqj)hftp185.b_message), "keywords");
        if(!hftp185.b_message.isImmutable()) {
            hftp185.ensureMutable();
        }
        bwqj.f(((bwqj)hftp185.b_message), 1);
        bwqg38.a(hftp185);
        ProtoLiteBuilder hftp186 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp186.b_message.isImmutable()) {
            hftp186.ensureMutable();
        }
        bwqj.c(((bwqj)hftp186.b_message), "userPayload");
        if(!hftp186.b_message.isImmutable()) {
            hftp186.ensureMutable();
        }
        bwqj.f(((bwqj)hftp186.b_message), 1);
        if(!hftp186.b_message.isImmutable()) {
            hftp186.ensureMutable();
        }
        bwqj.e(((bwqj)hftp186.b_message), 5);
        bwqg38.a(hftp186);
        ProtoLiteBuilder hftp187 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp187.b_message.isImmutable()) {
            hftp187.ensureMutable();
        }
        bwqj.c(((bwqj)hftp187.b_message), "title");
        if(!hftp187.b_message.isImmutable()) {
            hftp187.ensureMutable();
        }
        bwqj.f(((bwqj)hftp187.b_message), 1);
        if(!hftp187.b_message.isImmutable()) {
            hftp187.ensureMutable();
        }
        bwqj.e(((bwqj)hftp187.b_message), 4);
        bwqg38.a(hftp187);
        ProtoLiteBuilder hftp188 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp188.b_message.isImmutable()) {
            hftp188.ensureMutable();
        }
        bwqj.c(((bwqj)hftp188.b_message), "content");
        if(!hftp188.b_message.isImmutable()) {
            hftp188.ensureMutable();
        }
        bwqj.f(((bwqj)hftp188.b_message), 1);
        if(!hftp188.b_message.isImmutable()) {
            hftp188.ensureMutable();
        }
        bwqj.e(((bwqj)hftp188.b_message), 2);
        bwqg38.a(hftp188);
        ProtoLiteBuilder hftp189 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp189.b_message.isImmutable()) {
            hftp189.ensureMutable();
        }
        bwqj.c(((bwqj)hftp189.b_message), "lowPriorityContent");
        if(!hftp189.b_message.isImmutable()) {
            hftp189.ensureMutable();
        }
        bwqj.f(((bwqj)hftp189.b_message), 1);
        if(!hftp189.b_message.isImmutable()) {
            hftp189.ensureMutable();
        }
        bwqj.e(((bwqj)hftp189.b_message), 1);
        bwqg38.a(hftp189);
        ProtoLiteBuilder hftp190 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp190.b_message.isImmutable()) {
            hftp190.ensureMutable();
        }
        bwqj.c(((bwqj)hftp190.b_message), "salientTerms");
        if(!hftp190.b_message.isImmutable()) {
            hftp190.ensureMutable();
        }
        bwqj.f(((bwqj)hftp190.b_message), 1);
        if(!hftp190.b_message.isImmutable()) {
            hftp190.ensureMutable();
        }
        bwqj.e(((bwqj)hftp190.b_message), 3);
        bwqg38.a(hftp190);
        ProtoLiteBuilder hftp191 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp191.b_message.isImmutable()) {
            hftp191.ensureMutable();
        }
        bwqj.c(((bwqj)hftp191.b_message), "stashMetadata");
        if(!hftp191.b_message.isImmutable()) {
            hftp191.ensureMutable();
        }
        bwqj.f(((bwqj)hftp191.b_message), 2);
        if(!hftp191.b_message.isImmutable()) {
            hftp191.ensureMutable();
        }
        bwqj.e(((bwqj)hftp191.b_message), 0);
        bwqg38.a(hftp191);
        bwql0.k(bwqg38);
        bwqg bwqg39 = (bwqg)((ProtoLiteMessage)bwqk0).v_newBuilder();
        if(!bwqg39.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg39).ensureMutable();
        }
        bwqk.c(((bwqk)bwqg39.b_message), "GPayTransaction");
        if(!bwqg39.b_message.isImmutable()) {
            ((ProtoLiteBuilder)bwqg39).ensureMutable();
        }
        bwqk.d(((bwqk)bwqg39.b_message), 1);
        ProtoLiteBuilder hftp192 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp192.b_message.isImmutable()) {
            hftp192.ensureMutable();
        }
        bwqj.c(((bwqj)hftp192.b_message), "name");
        if(!hftp192.b_message.isImmutable()) {
            hftp192.ensureMutable();
        }
        bwqj.f(((bwqj)hftp192.b_message), 3);
        bwqg39.a(hftp192);
        ProtoLiteBuilder hftp193 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp193.b_message.isImmutable()) {
            hftp193.ensureMutable();
        }
        bwqj.c(((bwqj)hftp193.b_message), "keywords");
        if(!hftp193.b_message.isImmutable()) {
            hftp193.ensureMutable();
        }
        bwqj.f(((bwqj)hftp193.b_message), 1);
        bwqg39.a(hftp193);
        ProtoLiteBuilder hftp194 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp194.b_message.isImmutable()) {
            hftp194.ensureMutable();
        }
        bwqj.c(((bwqj)hftp194.b_message), "description");
        if(!hftp194.b_message.isImmutable()) {
            hftp194.ensureMutable();
        }
        bwqj.f(((bwqj)hftp194.b_message), 2);
        bwqg39.a(hftp194);
        ProtoLiteBuilder hftp195 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp195.b_message.isImmutable()) {
            hftp195.ensureMutable();
        }
        bwqj.c(((bwqj)hftp195.b_message), "ownerName");
        if(!hftp195.b_message.isImmutable()) {
            hftp195.ensureMutable();
        }
        bwqj.f(((bwqj)hftp195.b_message), 2);
        bwqg39.a(hftp195);
        ProtoLiteBuilder hftp196 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp196.b_message.isImmutable()) {
            hftp196.ensureMutable();
        }
        bwqj.c(((bwqj)hftp196.b_message), "counterpartyName");
        if(!hftp196.b_message.isImmutable()) {
            hftp196.ensureMutable();
        }
        bwqj.f(((bwqj)hftp196.b_message), 2);
        bwqg39.a(hftp196);
        ProtoLiteBuilder hftp197 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        String s3 = new gfss("_").g("productsOrServices", "name", new Object[0]);
        if(!hftp197.b_message.isImmutable()) {
            hftp197.ensureMutable();
        }
        bwqj.c(((bwqj)hftp197.b_message), s3);
        if(!hftp197.b_message.isImmutable()) {
            hftp197.ensureMutable();
        }
        bwqj.f(((bwqj)hftp197.b_message), 1);
        bwqg39.a(hftp197);
        ProtoLiteBuilder hftp198 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        String s4 = new gfss("_").g("productsOrServices", "description", new Object[0]);
        if(!hftp198.b_message.isImmutable()) {
            hftp198.ensureMutable();
        }
        bwqj.c(((bwqj)hftp198.b_message), s4);
        if(!hftp198.b_message.isImmutable()) {
            hftp198.ensureMutable();
        }
        bwqj.f(((bwqj)hftp198.b_message), 1);
        bwqg39.a(hftp198);
        ProtoLiteBuilder hftp199 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp199.b_message.isImmutable()) {
            hftp199.ensureMutable();
        }
        bwqj.c(((bwqj)hftp199.b_message), "paymentMethods");
        if(!hftp199.b_message.isImmutable()) {
            hftp199.ensureMutable();
        }
        bwqj.f(((bwqj)hftp199.b_message), 1);
        bwqg39.a(hftp199);
        ProtoLiteBuilder hftp200 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        String s5 = new gfss("_").g("amount", "units", new Object[0]);
        if(!hftp200.b_message.isImmutable()) {
            hftp200.ensureMutable();
        }
        bwqj.c(((bwqj)hftp200.b_message), s5);
        if(!hftp200.b_message.isImmutable()) {
            hftp200.ensureMutable();
        }
        bwqj.f(((bwqj)hftp200.b_message), 2);
        bwqg39.a(hftp200);
        ProtoLiteBuilder hftp201 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        String s6 = new gfss("_").g("amount", "currencyCode", new Object[0]);
        if(!hftp201.b_message.isImmutable()) {
            hftp201.ensureMutable();
        }
        bwqj.c(((bwqj)hftp201.b_message), s6);
        if(!hftp201.b_message.isImmutable()) {
            hftp201.ensureMutable();
        }
        bwqj.f(((bwqj)hftp201.b_message), 2);
        bwqg39.a(hftp201);
        ProtoLiteBuilder hftp202 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp202.b_message.isImmutable()) {
            hftp202.ensureMutable();
        }
        bwqj.c(((bwqj)hftp202.b_message), "timestamp");
        if(!hftp202.b_message.isImmutable()) {
            hftp202.ensureMutable();
        }
        bwqj.f(((bwqj)hftp202.b_message), 2);
        if(!hftp202.b_message.isImmutable()) {
            hftp202.ensureMutable();
        }
        bwqj.b(((bwqj)hftp202.b_message), "date");
        bwqg39.a(hftp202);
        ProtoLiteBuilder hftp203 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp203.b_message.isImmutable()) {
            hftp203.ensureMutable();
        }
        bwqj.c(((bwqj)hftp203.b_message), "category");
        if(!hftp203.b_message.isImmutable()) {
            hftp203.ensureMutable();
        }
        bwqj.f(((bwqj)hftp203.b_message), 1);
        bwqg39.a(hftp203);
        ProtoLiteBuilder hftp204 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp204.b_message.isImmutable()) {
            hftp204.ensureMutable();
        }
        bwqj.c(((bwqj)hftp204.b_message), "source");
        if(!hftp204.b_message.isImmutable()) {
            hftp204.ensureMutable();
        }
        bwqj.f(((bwqj)hftp204.b_message), 1);
        bwqg39.a(hftp204);
        ProtoLiteBuilder hftp205 = ((ProtoLiteMessage)bwqj0).v_newBuilder();
        if(!hftp205.b_message.isImmutable()) {
            hftp205.ensureMutable();
        }
        bwqj.c(((bwqj)hftp205.b_message), "location");
        if(!hftp205.b_message.isImmutable()) {
            hftp205.ensureMutable();
        }
        bwqj.f(((bwqj)hftp205.b_message), 2);
        bwqg39.a(hftp205);
        bwql0.k(bwqg39);
        bwql0.a("AggregateRating");
        bwql0.a("AlarmInstance");
        bwql0.a("Attendee");
        bwql0.a("ContactPoint");
        bwql0.a("PostalAddress");
        bwql0.a("StopwatchLap");
        bwql0.a("ExtractedEntity");
        bwql0.a("Date");
        bwql0.a("DateTime");
        bwql0.a("Flight");
        bwql0.a("GPayProductsOrServices");
        bwql0.a("GPayMoney");
    }

    public final void c(bwqm bwqm0) {
        ((ProtoLiteBuilder)this.a).X(((ProtoLiteMessage)bwqm0));
    }
}

