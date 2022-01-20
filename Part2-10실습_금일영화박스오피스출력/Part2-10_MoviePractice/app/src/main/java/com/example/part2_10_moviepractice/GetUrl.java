package com.example.part2_10_moviepractice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class GetUrl {
    String toDay;
    String frontUrl;

    public GetUrl(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);
        toDay = sdf.format(calendar.getTime());

        frontUrl = "http://www.kobis.or.kr/kobisopenapi/webservice/rest/boxoffice/searchDailyBoxOfficeList.json?key=63aac6b9e03d9658dcaa3d5a08d03af4&targetDt=";
    }

    public String getUrl(){
        String url = frontUrl+toDay;

        return url;
    }
}
