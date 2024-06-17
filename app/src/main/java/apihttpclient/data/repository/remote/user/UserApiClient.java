package apihttpclient.data.repository.remote.user;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

// custom variables
//10.0.2.2 routes to the hosting device ip. emulator 10.0.2.2:3000 -> hosting device localhost:3000
public class UserApiClient {
    private final static String BASE_URL = "http://10.0.2.2:3000/api";

    public static Retrofit getClient(){
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
    }

    //in the main/wherever you do the call
//    private static final String TAG = "MainActivity";
//
//    void toggleEnableOfUiElement(boolean toggle){
//        Button btnMakeReq;
//        btnMakeReq.setEnabled(toggle);
//    }
//
//    Callback<Users> callAsyncCallback = new Callback<Users>() {
//        @Override                                               //Throwable throwable
//        public void onFailure(@NonNull Call<Users> call, @NonNull IOException e) {
//            Log.e(TAG, "onFailure: ", e.printStackTrace());
//            toggleEnableOfUiElement(true);
//        }
//
//        @Override
//        public void onResponse(@NonNull Call<Users> call, @NonNull Response<Users> response) throws IOException {
//            Users users = response.body();
//            if(users == null){
//                Log.d(TAG, "onResponse: users was null");
//                return;
//            }
//            List<User> userList = users.users;
//            User user = userList.get(0);
//
//            //do stuff with the result
//
//            toggleEnableOfUiElement(true);
//        }
//    };
//
//    View.OnClickListener btnReqOnClickListener View -> {
//        toggleEnableOfUiElement(false);
//        Retrofit retrofit = UserApiClient.getClient();
//        UserService service = retrofit.create(UserService.class);
//        Call<Users> callAsync = service.getUsers(null,null,null);
//        callAsync.enqueue(callAsyncCallback);
//    }
}
