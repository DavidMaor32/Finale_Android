package apihttpclient.data.repository.remote.user;


import apihttpclient.data.model.user.User;
import apihttpclient.data.model.user.Users;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserService {
    @POST("/create")
    Call createUser(
            @Header("Authorization") String jwt,
            @Body User user
    );

    @GET("/login")
    Call login(@Body String username, @Body String password);

    @GET("/{id}")
    Call getUser(
            @Header("Authorization") String jwt,
            @Path("id") String id
    );

    @GET("/all")
    Call getAllUsers(
            @Header("Authorization") String jwt
    );

    @GET("/search")
    Call search(String s);

    @PUT("/update/{id}")
    Call updateUser(
            @Header("Authorization") String jwt,
            @Path("id") String id
    );

    @DELETE("/delete/{id}")
    Call deleteUser(
            @Header("Authorization") String jwt,
            @Path("id") String id
    );
}
