package com.zendev.daftarorangterkaya;

import java.util.ArrayList;

public class PeopleData {
    public static String[][] data = new String[][]{
            {"Jeff Bezos", "CEO Amazon", "Pendiri Amazon ini Memiliki Total Kekayaan 112 Miliar Dollar AS", "https://upload.wikimedia.org/wikipedia/commons/6/6b/Jeff_Bezos%27_iconic_laugh.jpg"},
            {"Bill Gates", "Pendiri Microsoft", "Pendiri Microsoft ini Memiliki Total Kekayaan 90 Miliar Dollar AS", "https://upload.wikimedia.org/wikipedia/commons/8/83/Billgates.jpg"},
            {"Warren Buffet", "Pemilik Saham Berkshire Hathaway", "Pemilik Saham Berkshire Hathaway ini Memiliki Total Kekayaan 84 Miliar Dollar AS", "https://media.gettyimages.com/photos/warren-buffett-speaks-onstage-at-the-fortune-most-powerful-women-on-picture-id184769358"},
            {"Bernard Arnault", "Pemilik Brand Louis Vuitton", "Pemilik Brand Louis Vuitton ini Memiliki Total Kekayaan 72,2 Miliar Dollar AS", "https://media.gettyimages.com/photos/of-lvmh-bernard-arnault-is-photographed-for-le-figaro-on-april-25-in-picture-id674455408"},
            {"Mark Zuckerberg", "Pendiri Facebook", "Pendiri Facebook ini Memiliki Total Kekayaan 71 Miliar Dollar AS", "https://upload.wikimedia.org/wikipedia/commons/e/ef/MarkZuckerberg.jpg"},
            {"Amancio Ortega", "Pendiri Zara", "Pendiri Zara ini Memiliki Total Kekayaan 70 Miliar Dollar AS", "https://media.gettyimages.com/photos/portrait-of-amancio-ortega-inditex-group-president-picture-id89417114"},
            {"Carlos Slim Helu", "Raja Telekomunikasi Meksiko", "Raja Telekomunikasi Asal Meksiko Memiliki Total Kekayaan 67,1 Miliar Dollar AS", "https://upload.wikimedia.org/wikipedia/commons/d/df/Carlos_Slim_Hel%C3%BA.jpg"},
            {"Charles Koch", "CEO Koch Industries", "Pengusaha dan CEO Koch Industries ini Memiliki Total Kekayaan 60 Miliar Dollar AS", "https://media.gettyimages.com/photos/in-this-february-26-2007-file-photograph-charles-koch-head-of-koch-picture-id110872572"},
            {"David Koch", "Executive Vice President Koch Industries", "Executive Vice President Koch Industries ini Memiliki Total Kekayaan 60 Miliar Dollar AS", "https://media.gettyimages.com/photos/david-h-koch-attends-the-lincoln-center-spring-gala-at-alice-tully-picture-id676778984"},
            {"Larry Ellison", "Pendiri Database Oracle", "Pendiri Database Oracle ini Memiliki Total Kekayaan 58,5 Miliar Dollar AS", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Larry_Ellison_on_stage.jpg"}

    };

    public static ArrayList<People> getListData(){
        People people = null;
        ArrayList<People> list = new ArrayList<>();
        for (String[] aData : data){
            people = new People();
            people.setName((aData[0]));
            people.setFounder(aData[1]);
            people.setDeskripsi(aData[2]);
            people.setPhoto(aData[3]);

            list.add(people);
        }

        return list;
    }
}
