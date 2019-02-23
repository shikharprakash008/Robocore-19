package surfer.example.surfer.robobore;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    ExpandableListAdapter expandableListAdapter;
    ExpandableListView expandableListView;
    List<MenuModel> headerList = new ArrayList<>();
    HashMap<MenuModel, List<MenuModel>> childList = new HashMap<>();
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        videoView = findViewById(R.id.mVideoView);
        setSupportActionBar(toolbar);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bg_video);
        videoView.setDrawingCacheEnabled(true);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        expandableListView = findViewById(R.id.expandableListView);
       // prepareMenuData();
      //  populateExpandableList();

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.corsit) {
            Intent i= new Intent(MainActivity.this,Corsit.class);
            startActivity(i);
        } else if (id == R.id.robocore) {
            Intent i= new Intent(MainActivity.this,RoboCore.class);
            startActivity(i);
        } else if (id == R.id.events) {
            Intent i= new Intent(MainActivity.this,Events.class);
            startActivity(i);
        } else if (id == R.id.team) {
            Intent i= new Intent(MainActivity.this,Team.class);
            startActivity(i);
        }
        else if(id==R.id.contact){
            Intent i= new Intent(MainActivity.this,ContactUs.class);
            startActivity(i);
        }
        else if(id == R.id.location)
        { Intent i= new Intent(MainActivity.this,Location.class);
            startActivity(i);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

   // private void prepareMenuData() {

      //  MenuModel menuModel = new MenuModel("Corsit", true, false);
     //   headerList.add(menuModel);
        //if (!menuModel.hasChildren) {
          //  childList.put(menuModel, null);
        //}
        //menuModel = new MenuModel("Robocore 2k19", true, false );
      //  headerList.add(menuModel);

        //if (!menuModel.hasChildren) {
         //   childList.put(menuModel, null);
       // }

       // menuModel = new MenuModel("Events", true, true); //Menu of Java Tutorials
        //headerList.add(menuModel);
        //List<MenuModel> childModelsList = new ArrayList<>();
        //MenuModel childModel = new MenuModel("Day 1", false, false);
        //childModelsList.add(childModel);

        //childModel = new MenuModel("Day 2", true, true);
        //childModelsList.add(childModel);




        //if (menuModel.hasChildren) {
          //  Log.d("API123","here");
            //childList.put(menuModel, childModelsList);
      //  }


       // menuModel = new MenuModel("The Team", true, false); //Menu of Android Tutorial. No sub menus
       // headerList.add(menuModel);

       // if (!menuModel.hasChildren) {
       //     childList.put(menuModel, null);
       // }
       // menuModel = new MenuModel("Sponsor", true, false); //Menu of Android Tutorial. No sub menus
      //  headerList.add(menuModel);

      //  if (!menuModel.hasChildren) {
           // childList.put(menuModel, null);
       // }
       // menuModel = new MenuModel("Contact Us", true, false); //Menu of Android Tutorial. No sub menus
       // headerList.add(menuModel);

       // if (!menuModel.hasChildren) {
       //     childList.put(menuModel, null);
       // }
       // menuModel = new MenuModel("Location", true, false); //Menu of Android Tutorial. No sub menus
       // headerList.add(menuModel);

        //if (!menuModel.hasChildren) {
            //childList.put(menuModel, null);
       // }
   // }

    //private void populateExpandableList() {

      //  expandableListAdapter = new ExpandableListAdapter(this, headerList, childList);
       // expandableListView.setAdapter(expandableListAdapter);

        //expandableListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
          //  @Override
          //  public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {



              //  if (headerList.get(groupPosition).isGroup) {
                 //   if (!headerList.get(groupPosition).hasChildren) {

                       //Intent back= new Intent(MainActivity.this,Team_Registration.class);
                     //   startActivity(back);
                      //  onBackPressed();
                  //  }
              //  }

               // return false;
          //  }

      //  });

       // expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
           // @Override
           // public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {

               // if (childList.get(headerList.get(groupPosition)) != null) {
                  //  MenuModel model = childList.get(headerList.get(groupPosition)).get(childPosition);
                  //  if (model.url.length() > 0) {

                  //      onBackPressed();
                  //  }
              //  }

               // return false;
          //  }
       // });
    }



