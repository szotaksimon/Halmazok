package hu.petrik.Exercise;

import hu.petrik.set.Set;

public class BuszMenetrend {

    private static Set<String> hetesBuszMegallio;
    private static Set<String> otosBuszMegalloi;

    public static void Run(){
        hetesBuszMegallio = new Set<>();
        hetesBuszMegallio.add("Albertfalva vasútállomás");
        hetesBuszMegallio.add("Fonyód utca / Sáfrány utca");
        hetesBuszMegallio.add("Herend utca");
        hetesBuszMegallio.add("Nyírbátor utca");
        hetesBuszMegallio.add("Csurgói út");
        hetesBuszMegallio.add("Andor utca / Tétényi út");
        hetesBuszMegallio.add("Bornemissza tér");
        hetesBuszMegallio.add("Puskás Tivadar utca");
        hetesBuszMegallio.add("Bikás park M");
        hetesBuszMegallio.add("Tétényi út 30.");
        hetesBuszMegallio.add("Szent Imre Kórház");
        hetesBuszMegallio.add("Karolina út");
        hetesBuszMegallio.add("Kosztolányi Dezső tér");
        hetesBuszMegallio.add("Móricz Zsigmond körtér M");
        hetesBuszMegallio.add("Gárdonyi tér");
        hetesBuszMegallio.add("Szent Gellért tér - Műegyetem M");
        hetesBuszMegallio.add("Rudas Gyógyfürdő");
        hetesBuszMegallio.add("Március 15. tér");
        hetesBuszMegallio.add("Ferenciek tere M");
        hetesBuszMegallio.add("Astoria M");
        hetesBuszMegallio.add("Uránia");
        hetesBuszMegallio.add("Blaha Lujza tér M");
        hetesBuszMegallio.add("Huszár utca");
        hetesBuszMegallio.add("Keleti pályaudvar M");
        hetesBuszMegallio.add("Reiner Frigyes park");
        hetesBuszMegallio.add("Cházár András utca");
        hetesBuszMegallio.add("Stefánia út / Thököly út");
        hetesBuszMegallio.add("Zugló vasútállomás");
        hetesBuszMegallio.add("Amerikai út");
        hetesBuszMegallio.add("Tisza István tér");
        hetesBuszMegallio.add("Bosnyák tér");
        hetesBuszMegallio.add("Rákospatak utca / Csömöri út");
        hetesBuszMegallio.add("Miskolci utca / Csömöri út");
        hetesBuszMegallio.add("Cinkotai út");
        hetesBuszMegallio.add("Molnár Viktor utca");
        hetesBuszMegallio.add("Apolló utca");
        hetesBuszMegallio.add("Madách utca");
        hetesBuszMegallio.add("Fő tér");
        hetesBuszMegallio.add("Vásárcsarnok");
        hetesBuszMegallio.add("Újpalota, Nyírpalota út");


        otosBuszMegalloi = new Set<>();
        otosBuszMegalloi.add("Pasaréti tér");
        otosBuszMegalloi.add("Harangvirág utca");
        otosBuszMegalloi.add("Virág árok");
        otosBuszMegalloi.add("Gábor Áron utca / Pasaréti út");
        otosBuszMegalloi.add("Júlia utca");
        otosBuszMegalloi.add("Vasas sportpálya");
        otosBuszMegalloi.add("Városmajor");
        otosBuszMegalloi.add("Nyúl utca");
        otosBuszMegalloi.add("Széll Kálmán tér M (Csaba utca)");
        otosBuszMegalloi.add("Körmöci utca");
        otosBuszMegalloi.add("Korlát utca");
        otosBuszMegalloi.add("Mikó utca");
        otosBuszMegalloi.add("Alagút utca");
        otosBuszMegalloi.add("Dózsa György tér");
        otosBuszMegalloi.add("Döbrentei tér");
        otosBuszMegalloi.add("Március 15. tér");
        otosBuszMegalloi.add("Ferenciek tere M");
        otosBuszMegalloi.add("Astoria M");
        otosBuszMegalloi.add("Uránia");
        otosBuszMegalloi.add("Blaha Lujza tér M");
        otosBuszMegalloi.add("Huszár utca");
        otosBuszMegalloi.add("Keleti pályaudvar M");
        otosBuszMegalloi.add("Reiner Frigyes park");
        otosBuszMegalloi.add("Cházár András utca");
        otosBuszMegalloi.add("Stefánia út / Thököly út");
        otosBuszMegalloi.add("Zugló vasútállomás");
        otosBuszMegalloi.add("Korong utca");
        otosBuszMegalloi.add("Erzsébet királyné útja, aluljáró");
        otosBuszMegalloi.add("Laky Adolf utca");
        otosBuszMegalloi.add("Nagy Lajos király útja / Czobor utca");
        otosBuszMegalloi.add("Fűrész utca");
        otosBuszMegalloi.add("Rákospatak utca");
        otosBuszMegalloi.add("Miskolci utca");
        otosBuszMegalloi.add("Öv utca");
        otosBuszMegalloi.add("Tóth István utca");
        otosBuszMegalloi.add("Vág utca");
        otosBuszMegalloi.add("Opál utca");
        otosBuszMegalloi.add("Széchenyi út");
        otosBuszMegalloi.add("Szent Korona útja");
        otosBuszMegalloi.add("Wesselényi utca");
        otosBuszMegalloi.add("Szerencs utca");
        otosBuszMegalloi.add("Rákos úti szakrendelő");
        otosBuszMegalloi.add("Illyés Gyula utca");
        otosBuszMegalloi.add("Epres sor");
        otosBuszMegalloi.add("Juhos utca");
        otosBuszMegalloi.add("Kossuth utca, lakótelep");
        otosBuszMegalloi.add("Rákospalota, Kossuth utca");

        Set<String> kozosMegallok = hetesBuszMegallio.intersect(otosBuszMegalloi);
        System.out.println(String.format("%d közös megállók:\n", kozosMegallok));
        System.out.println("Közös megállók:\n");
        System.out.println(kozosMegallok);
    }
}
