package com.ariavgroup.aplikasi_pertama_capstone_project.model;

import java.util.ArrayList;
import java.util.List;

public class HomeDataModel {
    public static List<HomeModel> groceryList() {
        HomeModel telur = new HomeModel("telur", 10, "https://fitshop-production.s3.ap-southeast-1.amazonaws.com/wp-content/uploads/2020/04/20202149/Telur-Ayam.jpg");
        HomeModel sabun = new HomeModel("sabun", 2, "https://akcdn.detik.net.id/visual/2020/07/24/ilustrasi-sabun-batangan-1_169.jpeg?w=650");
        HomeModel kopi = new HomeModel("kopi", 5, "https://ichef.bbci.co.uk/news/640/cpsprodpb/4D0C/production/_103642791_41843a55-c79b-4955-9c4b-16685f1f3f61.jpg");
        HomeModel teh = new HomeModel("teh", 2, "https://static.republika.co.id/uploads/images/inpicture_slide/secangkir-teh-_190524103045-721.jpg");

        List<HomeModel> groceryList = new ArrayList<>();

        groceryList.add(telur);
        groceryList.add(sabun);
        groceryList.add(kopi);
        groceryList.add(teh);

        return groceryList;
    }
}
