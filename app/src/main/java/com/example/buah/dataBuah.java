package com.example.buah;

import java.util.ArrayList;

public class dataBuah {

    private static String[] namabuah = {
            "APEL","SEMANGKA","DURIAN","JERUK","NANAS","RAMBUTAN","MELON","MANGGA","PEPAYA","ANGGUR","ALPUKAT","STROBERI","KIWI"
    };
    private static String[] descbuah = {
            "Apel adalah jenis buah-buahan, atau buah yang dihasilkan dari pohon buah apel. Buah apel biasanya berwarna merah kulitnya jika masak dan, namun bisa juga kulitnya berwarna hijau atau kuning. Kulit buahnya agak lembek, daging buahnya keras. Buah ini memiliki beberapa biji di dalamnya.",
            "Semangka atau tembikai (Citrullus lanatus, suku ketimun-ketimunan atau Cucurbitaceae) adalah tanaman merambat yang berasal dari daerah setengah gurun di Afrika bagian selatan. Tanaman ini masih sekerabat dengan labu-labuan (Cucurbitaceae), melon (Cucumis melo) dan ketimun (Cucumis sativus). Semangka biasa dipanen buahnya untuk dimakan segar atau dibuat jus. Biji semangka yang dikeringkan dan disangrai juga dapat dimakan isinya (kotiledon) sebagai kuaci.",
            "Durian adalah nama tumbuhan tropis yang berasal dari wilayah Asia Tenggara, sekaligus nama buahnya yang bisa dimakan. Nama ini diambil dari ciri khas kulit buahnya yang keras dan berlekuk-lekuk tajam sehingga menyerupai duri. Sebutan populernya adalah \"raja dari segala buah\" (King of Fruit). Durian adalah buah yang kontroversial, meskipun banyak orang yang menyukainya, tetapi sebagian yang lain malah muak dengan aromanya.",
            "Jeruk atau limau adalah semua tumbuhan berbunga anggota marga Citrus dari suku Rutaceae (suku jeruk-jerukan). Anggotanya berbentuk pohon dengan buah yang berdaging dengan rasa masam yang segar, meskipun banyak di antara anggotanya yang memiliki rasa manis. Rasa masam berasal dari kandungan asam sitrat yang memang menjadi terkandung pada semua anggotanya.",
            "Nanas, nenas, atau ananas (Ananas comosus (L.) Merr.) adalah sejenis tumbuhan tropis yang berasal dari Brasil, Bolivia, dan Paraguay Tumbuhan ini termasuk dalam familia nanas-nanasan (Famili Bromeliaceae). Perawakan (habitus) tumbuhannya rendah, herba (menahun) dengan 30 atau lebih daun yang panjang, berujung tajam, tersusun dalam bentuk roset mengelilingi batang yang tebal. Buahnya dalam bahasa Inggris disebut sebagai pineapple karena bentuknya yang seperti pohon pinus. Nama 'nanas' berasal dari sebutan orang Tupi untuk buah ini: anana.",
            "Pohon berdaun hijau sepanjang tahun, menyukai suhu tropika hangat (suhu rata-rata 25 derajat Celsius), tinggi dapat mencapai 8m namun biasanya tajuknya melebar hingga jari-jari 4m. Daun majemuk menyirip dengan anak daun 5 hingga 9, berbentuk bulat telur, dengan variasi tergantung umur, posisi pada pohon, dan ras lokal. Pertumbuhan rambutan dipengaruhi oleh ketersediaan air. Setelah masa berbuah selesai, pohon rambutan akan merona (flushing) menghasilkan cabang dan daun baru. Tahap ini sangat jelas teramati dengan warna pohon yang hijau muda karena didominasi oleh daun muda. Pertumbuhan ini akan berhenti ketika ketersediaan air terbatas dan tumbuhan beristirahat tumbuh.",
            "Melon (Cucumis melo L.) merupakan nama buah sekaligus tanaman yang menghasilkannya, yang termasuk dalam suku labu-labuan atau Cucurbitaceae. Buahnya biasanya dimakan segar sebagai buah meja atau diiris-iris sebagai campuran es buah. Bagian yang dimakan adalah daging buah (mesokarp). Teksturnya lunak, berwarna putih sampai merah, tergantung kultivarnya.",
            "Mangga atau mempelam adalah nama sejenis buah, demikian pula nama pohonnya. Mangga termasuk ke dalam marga Mangifera, yang terdiri dari 35-40 anggota dan suku Anacardiaceae. Pohon mangga termasuk tumbuhan tingkat tinggi yang struktur batangnya (habitus) termasuk kelompok arboreus, yaitu tumbuhan berkayu yang mempunyai tinggi batang lebih dari 5 m. Mangga bisa mencapai tinggi antara 10 hingga 40 m.",
            "Buah pepaya dimakan dagingnya, baik ketika muda maupun masak. Daging buah muda dimasak sebagai sayuran. Daging buah masak dimakan segar atau sebagai campuran koktail buah. Pepaya dimanfaatkan pula daunnya sebagai sayuran dan pelunak daging. Daun pepaya muda dimakan sebagai lalapan (setelah dilayukan dengan air panas) atau dijadikan pembungkus buntil. Oleh orang Manado, bunga pepaya yang diurap menjadi sayuran yang biasa dimakan. Getah pepaya (dapat ditemukan di batang, daun, dan buah) mengandung enzim papain, semacam protease, yang dapat melunakkan daging dan mengubah konformasi protein lainnya. Papain telah diproduksi secara massal dan menjadi komoditas dagang.",
            "Anggur merupakan tanaman buah berupa perdu merambat yang termasuk ke dalam keluarga Vitaceae.[1] Buah ini biasanya digunakan untuk membuat jus anggur, jelly, minuman anggur, minyak biji anggur dan kismis, atau dimakan langsung.[1] Buah ini juga dikenal karena mengandung banyak senyawa polifenol dan resveratol yang berperan aktif dalam berbagai metabolisme tubuh, serta mampu mencegah terbentuknya sel kanker dan berbagai penyakit lainnya.[2] Aktivitas ini juga terkait dengan adanya senyawa metabolit sekunder di dalam buah anggur yang berperan sebagai senyawa antioksidan yang mampu menangkal radikal bebas.",
            "Pohon, dengan batang mencapai tinggi 20 m dengan daun sepanjang 12 hingga 25 cm. Bunganya tersembunyi dengan warna hijau kekuningan dan ukuran 5 hingga 10 milimeter. Ukurannya bervariasi dari 7 hingga 20 sentimeter, dengan massa 100 hingga 1000 gram; biji yang besar, 5 hingga 6,4 sentimeter.",
            "Fragaria (pengucapan bahasa Inggris: [frəˈɡeɪriə])[2] adalah genus tumbuhan berbunga dalam keluarga mawar, Rosaceae, yang dikenal secara umum dengan nama stroberi karena buahnya yang bisa dikonsumsi. Ada lebih dari 20 spesies dan banyak hibrida dan kultivarnya. Stroberi yang paling sering dibiakkan adalah stroberi kebun (Fragaria ×ananassa). Stroberi adalah buah komersial yang sangat penting, yang dibiakkan di berbagai belahan dunia.",
            "Buah kiwi yang normal berbentuk oval, kira-kira sebesar telur ayam (5–8 cm / 2–3 in dan diameter 4.5–5.5 cm / 1¾–2 ). Buah ini kaya serat, kulit berwarna hijau-kecokelatan dan daging buah berwarna hijau terang atau keemasan dengan biji kecil, hitam, dan bisa dimakan. Tekstur buah ini sangat halus dan rasanya yang unik, saat ini buah kiwi sudah ditanam di berbagai negara."
    };
    private static String[] asalbuah = {
            "Asia Tengah",
            "Afrika",
            "Asia enggara",
            "Asia Timur",
            "Brazil",
            "Daerah Tropis",
            "Mediterania",
            "India",
            "Meksiko",
            "Timur Tengah",
            "Meksiko",
            "Belanda",
            "Tiogkok"
    };
    private static String[] vitamin = {
            "A",
            "A",
            "C",
            "C",
            "C",
            "C",
            "C",
            "C",
            "A",
            "C",
            "A",
            "C",
            "C"
    };
    private static int[] gambar = {
            R.drawable.apel,
            R.drawable.semangka,
            R.drawable.durian,
            R.drawable.jeruk,
            R.drawable.nanas,
            R.drawable.rambutan,
            R.drawable.melon,
            R.drawable.mangga,
            R.drawable.pepaya,
            R.drawable.anggur,
            R.drawable.alpukat,
            R.drawable.stroberi,
            R.drawable.kiwi
    };
    static ArrayList<buah> getListData() {
        ArrayList<buah> list = new ArrayList<>();
        for (int position = 0; position < namabuah.length; position++) {
            buah buahs = new buah();
            buahs.setNama(namabuah[position]);
            buahs.setDesc(descbuah[position]);
            buahs.setGambar(gambar[position]);
            buahs.setAsal(asalbuah[position]);
            buahs.setVitamin(vitamin[position]);
            list.add(buahs);
        }
        return list;
    }
}
