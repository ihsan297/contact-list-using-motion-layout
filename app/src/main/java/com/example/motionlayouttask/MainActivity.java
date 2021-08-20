package com.example.motionlayouttask;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Contact> contacts;
    ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);


        setContentView (R.layout.activity_main);
        recyclerView=findViewById (R.id.recW);
        contacts=new ArrayList<> ();
        contacts.add (new Contact ("Ali Raza","0345565556"));
        contacts.add (new Contact ("Ali Murad","0345565556"));
        contacts.add (new Contact ("Ihsn Ali","0345565556"));
        contacts.add (new Contact ("Razaq Khan","0345565556"));
        contacts.add (new Contact ("Wasim Sheikh","0345565556"));
        contacts.add (new Contact ("Ali Raza","0345565556"));
        contacts.add (new Contact ("Ali Murad","0345565556"));
        contacts.add (new Contact ("Ihsn Ali","0345565556"));
        contacts.add (new Contact ("Razaq Khan","0345565556"));
        contacts.add (new Contact ("Wasim Sheikh","0345565556"));
        adapter=new ContactAdapter (contacts);
        RecyclerView.LayoutManager manager=new LinearLayoutManager (getApplicationContext ());
        recyclerView.setLayoutManager (manager);
        recyclerView.setAdapter (adapter);
    }
}