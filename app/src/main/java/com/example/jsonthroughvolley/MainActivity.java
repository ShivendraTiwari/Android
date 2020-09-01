package com.example.jsonthroughvolley;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    RecyclerView recyclerView;
    Button btn;
    ImageView imageView;
    private RequestQueue mQueue;
    List<Model> arrayList;
//    ArrayList arrayList = new ArrayList<>(Arrays.asList("Person1", "Person2", "Person3", "Person4"));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        arrayList = new ArrayList<>();
//        textView = findViewById(R.id.textView);
//        btn = findViewById(R.id.button);
        mQueue = Volley.newRequestQueue(this);

        jsonParse();
//        btn.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//
//
//            }
//        });
    }

    private Map<String, String> jsonParse() {

        String url = "https://fourcutts.aaratechnologies.in/admin/ecommerce_api/product/read.php";
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("records");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject jsonObject1 = jsonArray.getJSONObject(i);
                        String p_id = jsonObject1.getString("p_id");
                        String p_name = jsonObject1.getString("p_name");
                        String p_description = jsonObject1.getString("p_description");
                        String p_image = jsonObject1.getString("p_featured_photo");
                        String p_qty = jsonObject1.getString("p_qty");
                        String p_old_price = jsonObject1.getString("p_old_price");
                        String p_current_price = jsonObject1.getString("p_current_price");

                        // Toast.makeText(MainActivity.this, "" + p_id, Toast.LENGTH_SHORT).show();
                        arrayList.add(new Model(p_image, p_name, p_description, "Net wt: " + p_qty + " gm", p_old_price, p_current_price));
                    }
                    MyAdapter myAdapter = new MyAdapter(MainActivity.this, arrayList);
                    recyclerView.setAdapter(myAdapter);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
            }
        });

//        @Override
//        {
//            protected Map<String, String> getParams() {
//            Map<String, String> hm = new HashMap<>();
//            hm.put("", "abcd");
//            return hm;
//        }
//        }
        mQueue.add(stringRequest);

//        JsonObjectRequest request = new JsonObject    Request(Request.Method.GET, url, null,
//                new Response.Listener<JSONObject>() {
//                    @Override
//                    public void onResponse(JSONObject response) {
//                        Toast.makeText(MainActivity.this, "" + response, Toast.LENGTH_SHORT).show();

//                        JSONArray jsonArray = null;
//                        try {
//                            for (int i = 0; i < jsonArray.length(); i++) {
//                                try {
//                                    JSONObject employee = jsonArray.getJSONObject(i);
//
//                                    int id = employee.getInt("P_id");
//                                    String Name = employee.getString("p_name");
//                                    int OldPriceId = employee.getInt("p_old_price");
//                                    int currentPriceId = employee.getInt("p_current_price");
//                                    int qty = employee.getInt("p_qty");
//                                    String featuredPhoto = employee.getString("p_featured_photo");
//                                    String description = employee.getString("p_description");
//                                    String shortdescription = employee.getString("p_short_description");
//                                    String feature = employee.getString("p_feature");
//                                    String condition = employee.getString("p_condition");
//                                    String return_policy = employee.getString("p_return_policy");
//                                    int totalView = employee.getInt("p_total_view");
//                                    int IsFeatured = employee.getInt("p_is_featured");
//                                    int isActive = employee.getInt("p_is_active");
//                                    int tcat = employee.getInt("tcat_id");
//                                    String categoryName = employee.getString("category_name");
//                                    int vendorId = employee.getInt("vendor_id");
//                                    String VendorName = employee.getString("vendor_name");
//                                    int favorite = employee.getInt("favorite");
//                                    int discount = employee.getInt("discount");
//                                    Object rating = employee.getJSONObject("rating");
//
//                                    jsonArray = response.getJSONArray("records");
//
//                                } catch (JSONException e) {
//                                    e.printStackTrace();
//                                }
//                            }
//                        } catch (Exception e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }, new Response.ErrorListener() {
//
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                error.printStackTrace();
//            }
//        });
//
//        mQueue.add(request);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(linearLayoutManager);

    }
}
