package nti.newhorizons.newhorizons.data.remote.retrofit;

import nti.newhorizons.newhorizons.data.entities.Course;
import nti.newhorizons.newhorizons.data.remote.retrofit.API.CourseAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static String BASE_URL = "https://api.themoviedb.org/3/";
    private static Retrofit retrofit;


    // use singleton design pattern to create single instance of RetrofitClient for the app
    public static Retrofit getRetrofitInstance() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
