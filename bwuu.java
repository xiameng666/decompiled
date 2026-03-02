import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import com.google.android.gms.appdatasearch.Feature;
import com.google.android.gms.appdatasearch.GlobalSearchCorpusConfig;
import java.util.ArrayList;
import java.util.Arrays;

public final class bwuu {
    public static final ggeo a;

    static {
        ggek ggek0 = new ggek();
        abwh abwh0 = new abwh("omnibox");
        abwh0.a = "2";
        abwh0.d("content://com.android.chrome.icing");
        abwj abwj0 = new abwj("url");
        abwj0.a = "url";
        abwj0.d = true;
        abwj0.b(new Feature(4));
        abwh0.c(abwj0.a());
        abwj abwj1 = new abwj("title");
        abwj1.a = "plain";
        abwj1.d = true;
        abwj1.b(new Feature(5));
        abwh0.c(abwj1.a());
        abwj abwj2 = new abwj("indexed_url");
        abwj2.a = "plain";
        abwj2.b = true;
        abwh0.c(abwj2.a());
        int[] arr_v = new int[10];
        ArrayList arrayList0 = new ArrayList();
        abvu.c("text1", 0x7F151449, arr_v);  // string:global_search_title_text "%title"
        abvu.c("text2", 0x7F15144A, arr_v);  // string:global_search_url_text "%url"
        abvu.c("intent_action", 0x7F151532, arr_v);  // string:icing_section_template_intent_action_view "android.intent.action.VIEW"
        abvu.c("intent_data", 0x7F15144A, arr_v);  // string:global_search_url_text "%url"
        abvu.c("icon", 0, arr_v);
        abwh0.d = abvu.a(arr_v, arrayList0);
        ggek0.i("com.android.chrome-omnibox", abwh0.a());
        abwh abwh1 = new abwh("omnibox");
        abwh1.a = "2";
        abwh1.d("content://com.android.chrome.beta.icing");
        abwj abwj3 = new abwj("url");
        abwj3.a = "url";
        abwj3.d = true;
        abwj3.b(new Feature(4));
        abwh1.c(abwj3.a());
        abwj abwj4 = new abwj("title");
        abwj4.a = "plain";
        abwj4.d = true;
        abwj4.b(new Feature(5));
        abwh1.c(abwj4.a());
        abwj abwj5 = new abwj("indexed_url");
        abwj5.a = "plain";
        abwj5.b = true;
        abwh1.c(abwj5.a());
        int[] arr_v1 = new int[10];
        ArrayList arrayList1 = new ArrayList();
        abvu.c("text1", 0x7F151449, arr_v1);  // string:global_search_title_text "%title"
        abvu.c("text2", 0x7F15144A, arr_v1);  // string:global_search_url_text "%url"
        abvu.c("intent_action", 0x7F151532, arr_v1);  // string:icing_section_template_intent_action_view "android.intent.action.VIEW"
        abvu.c("intent_data", 0x7F15144A, arr_v1);  // string:global_search_url_text "%url"
        abvu.c("icon", 0, arr_v1);
        abwh1.d = abvu.a(arr_v1, arrayList1);
        ggek0.i("com.android.chrome.beta-omnibox", abwh1.a());
        abwh abwh2 = new abwh("omnibox");
        abwh2.a = "2";
        abwh2.d("content://com.android.chrome.dev.icing");
        abwj abwj6 = new abwj("url");
        abwj6.a = "url";
        abwj6.d = true;
        abwj6.b(new Feature(4));
        abwh2.c(abwj6.a());
        abwj abwj7 = new abwj("title");
        abwj7.a = "plain";
        abwj7.d = true;
        abwj7.b(new Feature(5));
        abwh2.c(abwj7.a());
        abwj abwj8 = new abwj("indexed_url");
        abwj8.a = "plain";
        abwj8.b = true;
        abwh2.c(abwj8.a());
        int[] arr_v2 = new int[10];
        ArrayList arrayList2 = new ArrayList();
        abvu.c("text1", 0x7F151449, arr_v2);  // string:global_search_title_text "%title"
        abvu.c("text2", 0x7F15144A, arr_v2);  // string:global_search_url_text "%url"
        abvu.c("intent_action", 0x7F151532, arr_v2);  // string:icing_section_template_intent_action_view "android.intent.action.VIEW"
        abvu.c("intent_data", 0x7F15144A, arr_v2);  // string:global_search_url_text "%url"
        abvu.c("icon", 0, arr_v2);
        abwh2.d = abvu.a(arr_v2, arrayList2);
        ggek0.i("com.android.chrome.dev-omnibox", abwh2.a());
        abwh abwh3 = new abwh("books");
        abwh3.a = "3";
        abwh3.d("content://com.google.android.apps.books/appdatasearch/books");
        abwj abwj9 = new abwj("account_name");
        abwj9.a = "plain";
        abwj9.b = true;
        abwh3.c(abwj9.a());
        abwj abwj10 = new abwj("volume_id");
        abwj10.a = "plain";
        abwj10.b = true;
        abwh3.c(abwj10.a());
        abwj abwj11 = new abwj("content_version_id");
        abwj11.a = "plain";
        abwj11.b = true;
        abwh3.c(abwj11.a());
        abwj abwj12 = new abwj("title");
        abwj12.a = "plain";
        abwj12.d = true;
        abwj12.c = 30;
        abwh3.c(abwj12.a());
        abwj abwj13 = new abwj("creator");
        abwj13.a = "plain";
        abwj13.d = true;
        abwj13.c = 20;
        abwh3.c(abwj13.a());
        int[] arr_v3 = new int[10];
        ArrayList arrayList3 = new ArrayList();
        abvu.c("text1", 0x7F151449, arr_v3);  // string:global_search_title_text "%title"
        abvu.c("text2", 0x7F15143F, arr_v3);  // string:global_search_books_text2 "Book by %creator"
        abvu.c("icon", 0x7F15143D, arr_v3);  // string:global_search_books_icon_uri "content://com.google.android.apps.books.public/accounts/%account_name/volumes/%volume_id/cover_thumbnail"
        abvu.c("intent_data", 0x7F15143E, arr_v3);  // string:global_search_books_intent_data "gsa://com.google.android.apps.books/volumes/%volume_id/accounts/%account_name/cv/%content_version_id"
        abvu.c("intent_extra_data", 0x7F15143C, arr_v3);  // string:global_search_account_name_text "%account_name"
        abwh3.d = abvu.a(arr_v3, arrayList3);
        ggek0.i("com.google.android.apps.books-books", abwh3.a());
        abwh abwh4 = new abwh("messagesCorpus");
        abwh4.a = "71";
        abwh4.d("content://com.google.android.apps.messaging.shared.datamodel.BugleContentProvider/appdatasearch/messagesCorpus");
        abwj abwj14 = new abwj("textSection");
        abwj14.a = "plain";
        abwj14.d = true;
        abwh4.c(abwj14.a());
        abwj abwj15 = new abwj("conversationIdSection");
        abwj15.a = "plain";
        abwh4.c(abwj15.a());
        abwj abwj16 = new abwj("messageIdSection");
        abwj16.a = "plain";
        abwj16.b = true;
        abwh4.c(abwj16.a());
        abwj abwj17 = new abwj("messageTimestampSection");
        abwj17.a = "plain";
        abwj17.b = true;
        abwh4.c(abwj17.a());
        ggek0.i("com.google.android.apps.messaging-messagesCorpus", abwh4.a());
        abwh abwh5 = new abwh("participantsCorpus");
        abwh5.a = "71";
        abwh5.d("content://com.google.android.apps.messaging.shared.datamodel.BugleContentProvider/appdatasearch/participantsCorpus");
        abwj abwj18 = new abwj("participantNameSection");
        abwj18.a = "plain";
        abwj18.d = true;
        abwh5.c(abwj18.a());
        abwj abwj19 = new abwj("conversationIdSection");
        abwj19.a = "plain";
        abwj19.b = true;
        abwh5.c(abwj19.a());
        ggek0.i("com.google.android.apps.messaging-participantsCorpus", abwh5.a());
        abwh abwh6 = new abwh("partsCorpus");
        abwh6.a = "71";
        abwh6.d("content://com.google.android.apps.messaging.shared.datamodel.BugleContentProvider/appdatasearch/partsCorpus");
        abwj abwj20 = new abwj("textSection");
        abwj20.a = "plain";
        abwj20.d = true;
        abwh6.c(abwj20.a());
        abwj abwj21 = new abwj("conversationIdSection");
        abwj21.a = "plain";
        abwh6.c(abwj21.a());
        abwj abwj22 = new abwj("messageIdSection");
        abwj22.a = "plain";
        abwj22.b = true;
        abwh6.c(abwj22.a());
        abwj abwj23 = new abwj("messageTimestampSection");
        abwj23.a = "plain";
        abwj23.b = true;
        abwh6.c(abwj23.a());
        ggek0.i("com.google.android.apps.messaging-partsCorpus", abwh6.a());
        abwh abwh7 = new abwh("messages");
        abwh7.a = "1";
        abwh7.d("content://gmail-appindexing/appdatasearch");
        abwh7.h = "EmailMessage";
        abwh7.i = true;
        abwj abwj24 = new abwj("from_address");
        abwj24.a = "rfc822";
        abwj24.d = true;
        abwj24.f = "author";
        abwh7.c(abwj24.a());
        abwj abwj25 = new abwj("to_addresses");
        abwj25.a = "rfc822";
        abwj25.d = true;
        abwj25.f = "recipient";
        abwh7.c(abwj25.a());
        abwj abwj26 = new abwj("subject");
        abwj26.a = "plain";
        abwj26.d = true;
        abwj26.f = "about";
        abwh7.c(abwj26.a());
        abwj abwj27 = new abwj("body");
        abwj27.a = "html";
        abwj27.f = "text";
        abwh7.c(abwj27.a());
        abwj abwj28 = new abwj("conversation");
        abwj28.a = "plain";
        abwj28.b = true;
        abwh7.c(abwj28.a());
        abwj abwj29 = new abwj("message_id");
        abwj29.a = "plain";
        abwj29.b = true;
        abwh7.c(abwj29.a());
        abwj abwj30 = new abwj("permalink");
        abwj30.a = "plain";
        abwj30.f = "url";
        abwh7.c(abwj30.a());
        abwj abwj31 = new abwj("date");
        abwj31.a = "plain";
        abwj31.b = true;
        abwj31.f = "receivedTime";
        abwh7.c(abwj31.a());
        ggek0.i("com.google.android.gm-messages", abwh7.a());
        abwh abwh8 = new abwh("apps");
        abwh8.a = "2";
        abwh8.d("content://com.google.android.gms.icing.proxy.apps");
        abwh8.h = "CreativeWork/SoftwareApplication";
        abwj abwj32 = new abwj("name");
        abwj32.a = "plain";
        abwj32.d = true;
        abwj32.c = 0x3F;
        abwj32.f = "name";
        abwh8.c(abwj32.a());
        abwj abwj33 = new abwj("icon_uri");
        abwj33.a = "plain";
        abwj33.b = true;
        abwh8.c(abwj33.a());
        abwj abwj34 = new abwj("package_name");
        abwj34.a = "plain";
        abwj34.b = true;
        abwh8.c(abwj34.a());
        abwj abwj35 = new abwj("class_name");
        abwj35.a = "plain";
        abwj35.b = true;
        abwh8.c(abwj35.a());
        abwj abwj36 = new abwj("last_update_millis");
        abwj36.a = "plain";
        abwj36.b = true;
        abwh8.c(abwj36.a());
        abwj abwj37 = new abwj("additional_names");
        abwj37.a = "plain";
        abwj37.d = true;
        abwj37.e = "\n";
        abwh8.c(abwj37.a());
        int[] arr_v4 = new int[10];
        ArrayList arrayList4 = new ArrayList();
        abvu.c("text1", 0x7F151529, arr_v4);  // string:icing_section_template_apps_text_1 "%name"
        abvu.c("icon", 0x7F151526, arr_v4);  // string:icing_section_template_apps_icon_uri "%icon_uri(default:\"android.resource://android/drawable/sym_def_app_icon\")"
        abvu.c("intent_action", 0x7F151527, arr_v4);  // string:icing_section_template_apps_intent_action "android.intent.action.MAIN"
        abvu.c("intent_data", 0x7F151528, arr_v4);  // string:icing_section_template_apps_intent_data "content://applications/applications/%package_name/%class_name"
        abvu.b(new Feature[]{new Feature(1)}, arrayList4);
        abwh8.d = abvu.a(arr_v4, arrayList4);
        ggek0.i("com.google.android.gms-apps", abwh8.a());
        abwh abwh9 = new abwh("contacts_contact_id");
        abwh9.a = "1";
        abwh9.d("content://com.google.android.gms.icing.proxy/appdatasearch/contacts_contact_id");
        abwh9.h = "Person";
        abwj abwj38 = new abwj("lookup_key");
        abwj38.a = "plain";
        abwh9.c(abwj38.a());
        abwj abwj39 = new abwj("icon_uri");
        abwj39.a = "plain";
        abwj39.b = true;
        abwh9.c(abwj39.a());
        abwj abwj40 = new abwj("name");
        abwj40.a = "plain";
        abwj40.d = true;
        abwj40.c = 5;
        abwh9.c(abwj40.a());
        abwj abwj41 = new abwj("givennames");
        abwj41.a = "plain";
        abwj41.d = true;
        abwj41.c = 20;
        abwj41.b(new Feature(1));
        abwh9.c(abwj41.a());
        abwj abwj42 = new abwj("email");
        abwj42.a = "rfc822";
        abwj42.b = true;
        abwj42.c = 2;
        abwj42.e = "\u0085";
        abwh9.c(abwj42.a());
        abwj abwj43 = new abwj("nickname");
        abwj43.a = "plain";
        abwj43.d = true;
        abwj43.c = 15;
        abwj43.e = "\u0085";
        abwj43.b(new Feature(1));
        abwh9.c(abwj43.a());
        abwj abwj44 = new abwj("number");
        abwj44.a = "plain";
        abwj44.b = true;
        abwj44.e = "\u0085";
        abwh9.c(abwj44.a());
        abwj abwj45 = new abwj("address");
        abwj45.a = "plain";
        abwj45.b = true;
        abwj45.e = "\u0085";
        abwh9.c(abwj45.a());
        abwj abwj46 = new abwj("phoneticname");
        abwj46.a = "plain";
        abwj46.d = true;
        abwj46.c = 10;
        abwh9.c(abwj46.a());
        int[] arr_v5 = new int[10];
        ArrayList arrayList5 = new ArrayList();
        abvu.c("text1", 0x7F15152D, arr_v5);  // string:icing_section_template_contacts_text_1 "%name"
        abvu.c("text2", 0x7F15152E, arr_v5);  // string:icing_section_template_contacts_text_2 "%$bestmatch(except:(name,givennames), 
                                              // snippeted:true, length:100)"
        abvu.c("icon", 0x7F15152A, arr_v5);  // string:icing_section_template_contacts_icon_uri "%icon_uri(default:\"android.resource://android/drawable/ic_contact_picture\")"
        abvu.c("intent_action", 0x7F151532, arr_v5);  // string:icing_section_template_intent_action_view "android.intent.action.VIEW"
        abvu.c("intent_data", 0x7F15152C, arr_v5);  // string:icing_section_template_contacts_intent_data "content://com.android.contacts/contacts/lookup/%lookup_key/%$uri"
        abvu.b(new Feature[]{new Feature(1)}, arrayList5);
        abwh9.d = abvu.a(arr_v5, arrayList5);
        ggek0.i("com.google.android.gms-contacts_contact_id", abwh9.a());
        abwh abwh10 = new abwh("emails_data_id");
        abwh10.a = "1";
        abwh10.d("content://com.google.android.gms.icing.proxy/appdatasearch/emails_data_id");
        abwh10.h = "ContactPoint";
        abwj abwj47 = new abwj("contact_id");
        abwj47.a = "plain";
        abwh10.c(abwj47.a());
        abwj abwj48 = new abwj("type");
        abwj48.a = "plain";
        abwh10.c(abwj48.a());
        abwj abwj49 = new abwj("label");
        abwj49.a = "plain";
        abwh10.c(abwj49.a());
        abwj abwj50 = new abwj("data");
        abwj50.a = "plain";
        abwh10.c(abwj50.a());
        int[] arr_v6 = new int[10];
        ArrayList arrayList6 = new ArrayList();
        abvu.c("text1", 0x7F15152B, arr_v6);  // string:icing_section_template_contacts_id "%contact_id"
        abwh10.d = abvu.a(arr_v6, arrayList6);
        ggek0.i("com.google.android.gms-emails_data_id", abwh10.a());
        abwh abwh11 = new abwh("phones_data_id");
        abwh11.a = "1";
        abwh11.d("content://com.google.android.gms.icing.proxy/appdatasearch/phones_data_id");
        abwh11.h = "ContactPoint";
        abwj abwj51 = new abwj("contact_id");
        abwj51.a = "plain";
        abwh11.c(abwj51.a());
        abwj abwj52 = new abwj("type");
        abwj52.a = "plain";
        abwh11.c(abwj52.a());
        abwj abwj53 = new abwj("label");
        abwj53.a = "plain";
        abwh11.c(abwj53.a());
        abwj abwj54 = new abwj("data");
        abwj54.a = "plain";
        abwh11.c(abwj54.a());
        int[] arr_v7 = new int[10];
        ArrayList arrayList7 = new ArrayList();
        abvu.c("text1", 0x7F15152B, arr_v7);  // string:icing_section_template_contacts_id "%contact_id"
        abwh11.d = abvu.a(arr_v7, arrayList7);
        ggek0.i("com.google.android.gms-phones_data_id", abwh11.a());
        abwh abwh12 = new abwh("postals_data_id");
        abwh12.a = "1";
        abwh12.d("content://com.google.android.gms.icing.proxy/appdatasearch/postals_data_id");
        abwh12.h = "ContactPoint";
        abwj abwj55 = new abwj("contact_id");
        abwj55.a = "plain";
        abwh12.c(abwj55.a());
        abwj abwj56 = new abwj("type");
        abwj56.a = "plain";
        abwh12.c(abwj56.a());
        abwj abwj57 = new abwj("label");
        abwj57.a = "plain";
        abwh12.c(abwj57.a());
        abwj abwj58 = new abwj("data");
        abwj58.a = "plain";
        abwh12.c(abwj58.a());
        int[] arr_v8 = new int[10];
        ArrayList arrayList8 = new ArrayList();
        abvu.c("text1", 0x7F15152B, arr_v8);  // string:icing_section_template_contacts_id "%contact_id"
        abwh12.d = abvu.a(arr_v8, arrayList8);
        ggek0.i("com.google.android.gms-postals_data_id", abwh12.a());
        abwh abwh13 = new abwh("suggest_query");
        abwh13.a = "0";
        abwh13.d("content://com.google.android.googlequicksearchbox.OnDeviceWebSuggestHostProvider/suggest_query");
        abwj abwj59 = new abwj("query");
        abwj59.a = "plain";
        abwj59.d = true;
        abwh13.c(abwj59.a());
        int[] arr_v9 = new int[10];
        ArrayList arrayList9 = new ArrayList();
        abvu.c("text1", 0x7F151445, arr_v9);  // string:global_search_query_text "%query"
        abwh13.d = abvu.a(arr_v9, arrayList9);
        ggek0.i("com.google.android.googlequicksearchbox-suggest_query", abwh13.a());
        abwh abwh14 = new abwh("albums");
        abwh14.a = "2";
        abwh14.d("content://com.google.android.music.icing/appdatasearch/albums");
        abwh14.h = "MusicAlbum";
        abwj abwj60 = new abwj("album");
        abwj60.a = "plain";
        abwj60.d = true;
        abwj60.f = "name";
        abwh14.c(abwj60.a());
        abwj abwj61 = new abwj("artist");
        abwj61.a = "plain";
        abwj61.b = true;
        abwj61.f = "byArtist";
        abwh14.c(abwj61.a());
        abwj abwj62 = new abwj("local_copy_type");
        abwj62.a = "plain";
        abwj62.b = true;
        abwh14.c(abwj62.a());
        int[] arr_v10 = new int[10];
        ArrayList arrayList10 = new ArrayList();
        abvu.c("text1", 0x7F150146, arr_v10);  // string:albums_corpus_section_text_1 "%album"
        abvu.c("text2", 0x7F150147, arr_v10);  // string:albums_corpus_section_text_2 "Album by %artist"
        abvu.c("icon", 0x7F150145, arr_v10);  // string:albums_corpus_section_icon_uri "content://com.google.android.music.MusicContent/albumorfauxart/%$uri"
        abvu.c("intent_data", 0x7F150144, arr_v10);  // string:albums_corpus_section_data "content://com.google.android.music.MusicContent/album/%$uri"
        abwh14.d = abvu.a(arr_v10, arrayList10);
        ggek0.i("com.google.android.music-albums", abwh14.a());
        abwh abwh15 = new abwh("artists");
        abwh15.a = "2";
        abwh15.d("content://com.google.android.music.icing/appdatasearch/artists");
        abwh15.h = "MusicGroup";
        abwj abwj63 = new abwj("artist");
        abwj63.a = "plain";
        abwj63.d = true;
        abwj63.f = "name";
        abwh15.c(abwj63.a());
        abwj abwj64 = new abwj("local_copy_type");
        abwj64.a = "plain";
        abwj64.b = true;
        abwh15.c(abwj64.a());
        int[] arr_v11 = new int[10];
        ArrayList arrayList11 = new ArrayList();
        abvu.c("text1", 0x7F1501C6, arr_v11);  // string:artists_corpus_section_text_1 "%artist"
        abvu.c("text2", 0x7F1501C7, arr_v11);  // string:artists_corpus_section_text_2 "Artist"
        abvu.c("icon", 0x7F1501C5, arr_v11);  // string:artists_corpus_section_icon_uri "content://com.google.android.music.MusicContent/artistfauxart/%$uri"
        abvu.c("intent_data", 0x7F1501C4, arr_v11);  // string:artists_corpus_section_data "content://com.google.android.music.MusicContent/albumartist/%$uri"
        abwh15.d = abvu.a(arr_v11, arrayList11);
        ggek0.i("com.google.android.music-artists", abwh15.a());
        abwh abwh16 = new abwh("playlists");
        abwh16.a = "2";
        abwh16.d("content://com.google.android.music.icing/appdatasearch/playlists");
        abwh16.h = "MusicPlaylist";
        abwj abwj65 = new abwj("playlist");
        abwj65.a = "plain";
        abwj65.d = true;
        abwj65.f = "name";
        abwh16.c(abwj65.a());
        int[] arr_v12 = new int[10];
        ArrayList arrayList12 = new ArrayList();
        abvu.c("text1", 0x7F1525FC, arr_v12);  // string:playlists_corpus_section_text_1 "%playlist"
        abvu.c("icon", 0x7F1525FB, arr_v12);  // string:playlists_corpus_section_icon_uri "content://com.google.android.music.MusicContent/playlistfauxart/%$uri"
        abvu.c("intent_data", 0x7F1525FA, arr_v12);  // string:playlists_corpus_section_data "content://com.google.android.music.MusicContent/playlist/%$uri"
        abwh16.d = abvu.a(arr_v12, arrayList12);
        ggek0.i("com.google.android.music-playlists", abwh16.a());
        abwh abwh17 = new abwh("songs");
        abwh17.a = "2";
        abwh17.d("content://com.google.android.music.icing/appdatasearch/songs");
        abwh17.h = "MusicRecording";
        abwj abwj66 = new abwj("song");
        abwj66.a = "plain";
        abwj66.d = true;
        abwj66.f = "name";
        abwh17.c(abwj66.a());
        abwj abwj67 = new abwj("artist");
        abwj67.a = "plain";
        abwj67.b = true;
        abwj67.f = "byArtist";
        abwh17.c(abwj67.a());
        abwj abwj68 = new abwj("album_id");
        abwj68.a = "plain";
        abwj68.b = true;
        abwh17.c(abwj68.a());
        abwj abwj69 = new abwj("music_id");
        abwj69.a = "plain";
        abwj69.b = true;
        abwh17.c(abwj69.a());
        abwj abwj70 = new abwj("song_id");
        abwj70.a = "plain";
        abwj70.b = true;
        abwh17.c(abwj70.a());
        abwj abwj71 = new abwj("album");
        abwj71.a = "plain";
        abwj71.b = true;
        abwh17.c(abwj71.a());
        abwj abwj72 = new abwj("local_copy_type");
        abwj72.a = "plain";
        abwj72.b = true;
        abwh17.c(abwj72.a());
        int[] arr_v13 = new int[10];
        ArrayList arrayList13 = new ArrayList();
        abvu.c("text1", 0x7F152F14, arr_v13);  // string:songs_corpus_section_text_1 "%song"
        abvu.c("text2", 0x7F152F15, arr_v13);  // string:songs_corpus_section_text_2 "Song by %artist"
        abvu.c("icon", 0x7F152F13, arr_v13);  // string:songs_corpus_section_icon_uri "content://com.google.android.music.MusicContent/albumorfauxart/%album_id"
        abvu.c("intent_data", 0x7F152F12, arr_v13);  // string:songs_corpus_section_data "content://com.google.android.music.MusicContent/track/%music_id/%song_id"
        abwh17.d = abvu.a(arr_v13, arrayList13);
        ggek0.i("com.google.android.music-songs", abwh17.a());
        abwh abwh18 = new abwh("top_albums");
        abwh18.a = "1";
        abwh18.d("content://com.google.android.music.icing/appdatasearch/top_albums");
        abwj abwj73 = new abwj("album");
        abwj73.a = "plain";
        abwj73.d = true;
        abwj73.f = "name";
        abwh18.c(abwj73.a());
        abwj abwj74 = new abwj("album_id");
        abwj74.a = "plain";
        abwj74.b = true;
        abwh18.c(abwj74.a());
        abwj abwj75 = new abwj("album_url");
        abwj75.a = "plain";
        abwj75.b = true;
        abwh18.c(abwj75.a());
        abwj abwj76 = new abwj("artist");
        abwj76.a = "plain";
        abwj76.b = true;
        abwj76.f = "byArtist";
        abwh18.c(abwj76.a());
        int[] arr_v14 = new int[10];
        ArrayList arrayList14 = new ArrayList();
        abvu.c("text1", 0x7F153128, arr_v14);  // string:top_albums_corpus_section_text_1 "%album"
        abvu.c("text2", 0x7F153129, arr_v14);  // string:top_albums_corpus_section_text_2 "Album by %artist"
        abvu.c("intent_activity", 0x7F153127, arr_v14);  // string:top_albums_corpus_section_intent_activity ".ui.TopChartsIcingActivity"
        abvu.c("intent_data", 0x7F153125, arr_v14);  // string:top_albums_corpus_section_data "%album_url"
        abwh18.d = abvu.a(arr_v14, arrayList14);
        ggek0.i("com.google.android.music-top_albums", abwh18.a());
        abwh abwh19 = new abwh("top_artists");
        abwh19.a = "1";
        abwh19.d("content://com.google.android.music.icing/appdatasearch/top_artists");
        abwj abwj77 = new abwj("artist");
        abwj77.a = "plain";
        abwj77.d = true;
        abwj77.f = "name";
        abwh19.c(abwj77.a());
        abwj abwj78 = new abwj("artist_id");
        abwj78.a = "plain";
        abwj78.b = true;
        abwh19.c(abwj78.a());
        abwj abwj79 = new abwj("artist_url");
        abwj79.a = "plain";
        abwj79.b = true;
        abwh19.c(abwj79.a());
        int[] arr_v15 = new int[10];
        ArrayList arrayList15 = new ArrayList();
        abvu.c("text1", 0x7F15312D, arr_v15);  // string:top_artists_corpus_section_text_1 "%artist"
        abvu.c("text2", 0x7F15312E, arr_v15);  // string:top_artists_corpus_section_text_2 "Artist"
        abvu.c("icon", 0x7F15312B, arr_v15);  // string:top_artists_corpus_section_icon_uri "android.resource://com.google.android.music/drawable/splash_play_music_color_144"
        abvu.c("intent_activity", 0x7F15312C, arr_v15);  // string:top_artists_corpus_section_intent_activity ".ui.TopChartsIcingActivity"
        abvu.c("intent_data", 0x7F15312A, arr_v15);  // string:top_artists_corpus_section_data "%artist_url"
        abwh19.d = abvu.a(arr_v15, arrayList15);
        ggek0.i("com.google.android.music-top_artists", abwh19.a());
        abwh abwh20 = new abwh("top_tracks");
        abwh20.a = "1";
        abwh20.d("content://com.google.android.music.icing/appdatasearch/top_tracks");
        abwj abwj80 = new abwj("track");
        abwj80.a = "plain";
        abwj80.d = true;
        abwj80.f = "name";
        abwh20.c(abwj80.a());
        abwj abwj81 = new abwj("track_id");
        abwj81.a = "plain";
        abwj81.b = true;
        abwh20.c(abwj81.a());
        abwj abwj82 = new abwj("track_url");
        abwj82.a = "plain";
        abwj82.b = true;
        abwh20.c(abwj82.a());
        abwj abwj83 = new abwj("artist");
        abwj83.a = "plain";
        abwj83.b = true;
        abwh20.c(abwj83.a());
        int[] arr_v16 = new int[10];
        ArrayList arrayList16 = new ArrayList();
        abvu.c("text1", 0x7F153134, arr_v16);  // string:top_tracks_corpus_section_text_1 "%track"
        abvu.c("text2", 0x7F153135, arr_v16);  // string:top_tracks_corpus_section_text_2 "Song by %artist"
        abvu.c("icon", 0x7F153132, arr_v16);  // string:top_tracks_corpus_section_icon_uri "android.resource://com.google.android.music/drawable/splash_play_music_color_144"
        abvu.c("intent_activity", 0x7F153133, arr_v16);  // string:top_tracks_corpus_section_intent_activity ".ui.TopChartsIcingActivity"
        abvu.c("intent_data", 0x7F153131, arr_v16);  // string:top_tracks_corpus_section_data "%track_url"
        abwh20.d = abvu.a(arr_v16, arrayList16);
        ggek0.i("com.google.android.music-top_tracks", abwh20.a());
        abwh abwh21 = new abwh("movies");
        abwh21.a = "0";
        abwh21.d("content://com.google.android.videos.icing/appdatasearch/movies");
        abwj abwj84 = new abwj("title");
        abwj84.a = "plain";
        abwj84.d = true;
        abwh21.c(abwj84.a());
        abwj abwj85 = new abwj("account");
        abwj85.a = "plain";
        abwj85.b = true;
        abwh21.c(abwj85.a());
        int[] arr_v17 = new int[10];
        ArrayList arrayList17 = new ArrayList();
        abvu.c("text1", 0x7F151449, arr_v17);  // string:global_search_title_text "%title"
        abvu.c("icon", 0x7F151442, arr_v17);  // string:global_search_movie_icon "content://com.google.android.videos.bitmap/poster?id=%$uri"
        abvu.c("intent_data", 0x7F151443, arr_v17);  // string:global_search_movie_intent_data "https://play.google.com/movies/movies?ref=icing&v=%$uri"
        abvu.c("intent_extra_data", 0x7F151441, arr_v17);  // string:global_search_intent_extra_data_account "%account"
        abwh21.d = abvu.a(arr_v17, arrayList17);
        ggek0.i("com.google.android.videos-movies", abwh21.a());
        abwh abwh22 = new abwh("shows");
        abwh22.a = "0";
        abwh22.d("content://com.google.android.videos.icing/appdatasearch/shows");
        abwj abwj86 = new abwj("title");
        abwj86.a = "plain";
        abwj86.d = true;
        abwh22.c(abwj86.a());
        abwj abwj87 = new abwj("account");
        abwj87.a = "plain";
        abwj87.b = true;
        abwh22.c(abwj87.a());
        int[] arr_v18 = new int[10];
        ArrayList arrayList18 = new ArrayList();
        abvu.c("text1", 0x7F151449, arr_v18);  // string:global_search_title_text "%title"
        abvu.c("icon", 0x7F151446, arr_v18);  // string:global_search_show_icon "content://com.google.android.videos.bitmap/showposter?id=%$uri"
        abvu.c("intent_data", 0x7F151447, arr_v18);  // string:global_search_show_intent_data "https://play.google.com/movies/shows?ref=icing&sh=%$uri"
        abvu.c("intent_extra_data", 0x7F151441, arr_v18);  // string:global_search_intent_extra_data_account "%account"
        abwh22.d = abvu.a(arr_v18, arrayList18);
        ggek0.i("com.google.android.videos-shows", abwh22.a());
        bwuu.a = ggek0.b();
    }

    public static boolean a(GlobalSearchCorpusConfig globalSearchCorpusConfig0, Resources resources0, GlobalSearchCorpusConfig globalSearchCorpusConfig1, Resources resources1, int v) {
        if(globalSearchCorpusConfig0 == null) {
            return globalSearchCorpusConfig1 == null;
        }
        if(globalSearchCorpusConfig1 == null) {
            return false;
        }
        if(!Arrays.equals(globalSearchCorpusConfig0.b, globalSearchCorpusConfig1.b)) {
            return false;
        }
        int[] arr_v = globalSearchCorpusConfig0.a;
        if(arr_v == null) {
            return globalSearchCorpusConfig1.a == null;
        }
        int[] arr_v1 = globalSearchCorpusConfig1.a;
        if(arr_v1 == null) {
            return false;
        }
        if(arr_v.length == arr_v1.length) {
            for(int v1 = 0; v1 < arr_v.length; ++v1) {
                if(v1 != v) {
                    int v2 = arr_v[v1];
                    if(v2 != 0) {
                        if(arr_v1[v1] != 0) {
                            try {
                                if(!bata.b(resources0.getString(v2), resources1.getString(arr_v1[v1]))) {
                                    return false;
                                }
                                continue;
                            }
                            catch(Resources.NotFoundException unused_ex) {
                            }
                        }
                        return false;
                    }
                    else if(arr_v1[v1] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}

